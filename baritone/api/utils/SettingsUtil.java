/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.Settings$Setting;
import baritone.api.utils.SettingsUtil$Parser;
import baritone.api.utils.SettingsUtil$ParserContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SettingsUtil {
    private static final Path SETTINGS_PATH = bib.z().w.toPath().resolve("baritone").resolve("settings.txt");
    private static final Pattern SETTING_PATTERN = Pattern.compile("^(?<setting>[^ ]+) +(?<value>.+)");

    private static boolean isComment(String string) {
        return string.startsWith("#") || string.startsWith("//");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void forEachLine(Path object, Consumer<String> consumer) {
        object = Files.newBufferedReader((Path)object);
        Throwable throwable = null;
        try {
            String string;
            while ((string = ((BufferedReader)object).readLine()) != null) {
                if (string.isEmpty() || SettingsUtil.isComment(string)) continue;
                consumer.accept(string);
            }
            if (object == null) return;
        } catch (Throwable throwable2) {
            try {
                Throwable throwable3 = throwable2;
                throwable = throwable2;
                throw throwable3;
            } catch (Throwable throwable4) {
                if (object == null) throw throwable4;
                if (throwable != null) {
                    try {
                        ((BufferedReader)object).close();
                        throw throwable4;
                    } catch (Throwable throwable5) {
                        throwable.addSuppressed(throwable5);
                    }
                    throw throwable4;
                } else {
                    ((BufferedReader)object).close();
                }
                throw throwable4;
            }
        }
        ((BufferedReader)object).close();
        return;
    }

    public static void readAndApply(Settings settings) {
        try {
            SettingsUtil.forEachLine(SETTINGS_PATH, string -> {
                Object object = SETTING_PATTERN.matcher((CharSequence)string);
                if (!((Matcher)object).matches()) {
                    System.out.println("Invalid syntax in setting file: ".concat(String.valueOf(string)));
                    return;
                }
                String string2 = ((Matcher)object).group("setting").toLowerCase();
                object = ((Matcher)object).group("value");
                try {
                    SettingsUtil.parseAndApply(settings, string2, (String)object);
                    return;
                } catch (Exception exception) {
                    System.out.println("Unable to parse line ".concat(String.valueOf(string)));
                    exception.printStackTrace();
                    return;
                }
            });
            return;
        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("Baritone settings file not found, resetting.");
            return;
        } catch (Exception exception) {
            System.out.println("Exception while reading Baritone settings, some settings may be reset to default values!");
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static synchronized void save(Settings object) {
        try {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(SETTINGS_PATH, new OpenOption[0]);
            Throwable throwable = null;
            try {
                for (Settings$Setting settings$Setting : SettingsUtil.modifiedSettings((Settings)object)) {
                    bufferedWriter.write(SettingsUtil.settingToString(settings$Setting) + "\n");
                }
                if (bufferedWriter == null) return;
            } catch (Throwable throwable2) {
                try {
                    object = throwable2;
                    throwable = throwable2;
                    throw object;
                } catch (Throwable throwable3) {
                    if (bufferedWriter == null) throw throwable3;
                    if (throwable != null) {
                        try {
                            bufferedWriter.close();
                            throw throwable3;
                        } catch (Throwable throwable4) {
                            throwable.addSuppressed(throwable4);
                        }
                        throw throwable3;
                    } else {
                        bufferedWriter.close();
                    }
                    throw throwable3;
                }
            }
            bufferedWriter.close();
            return;
        } catch (Exception exception) {
            System.out.println("Exception thrown while saving Baritone settings!");
            exception.printStackTrace();
            return;
        }
    }

    public static List<Settings$Setting> modifiedSettings(Settings object) {
        ArrayList<Settings$Setting> arrayList = new ArrayList<Settings$Setting>();
        for (Settings$Setting<?> settings$Setting : ((Settings)((Object)object)).allSettings) {
            if (settings$Setting.value == null) {
                System.out.println("NULL SETTING?" + settings$Setting.getName());
                continue;
            }
            if (settings$Setting.getName().equals("logger") || settings$Setting.value == settings$Setting.defaultValue) continue;
            arrayList.add(settings$Setting);
        }
        return arrayList;
    }

    public static String settingTypeToString(Settings$Setting settings$Setting) {
        return settings$Setting.getType().getTypeName().replaceAll("(?:\\w+\\.)+(\\w+)", "$1");
    }

    public static <T> String settingValueToString(Settings$Setting<T> settings$Setting, T t2) {
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(settings$Setting.getType());
        if (settingsUtil$Parser == null) {
            throw new IllegalStateException("Missing " + settings$Setting.getValueClass() + " " + settings$Setting.getName());
        }
        return settingsUtil$Parser.toString(new SettingsUtil$ParserContext(settings$Setting, null), (Object)t2);
    }

    public static String settingValueToString(Settings$Setting settings$Setting) {
        Settings$Setting settings$Setting2 = settings$Setting;
        return SettingsUtil.settingValueToString(settings$Setting2, settings$Setting2.value);
    }

    public static String settingDefaultToString(Settings$Setting settings$Setting) {
        Settings$Setting settings$Setting2 = settings$Setting;
        return SettingsUtil.settingValueToString(settings$Setting2, settings$Setting2.defaultValue);
    }

    public static String maybeCensor(int n2) {
        if (((Boolean)BaritoneAPI.getSettings().censorCoordinates.value).booleanValue()) {
            return "<censored>";
        }
        return Integer.toString(n2);
    }

    public static String settingToString(Settings$Setting settings$Setting) {
        if (settings$Setting.getName().equals("logger")) {
            return "logger";
        }
        return settings$Setting.getName() + " " + SettingsUtil.settingValueToString(settings$Setting);
    }

    public static void parseAndApply(Settings settings$Setting, String clazz, String string) {
        SettingsUtil$Parser settingsUtil$Parser;
        settings$Setting = ((Settings)((Object)settings$Setting)).byLowerName.get(clazz);
        if (settings$Setting == null) {
            throw new IllegalStateException("No setting by that name");
        }
        clazz = settings$Setting.getValueClass();
        if (!clazz.isInstance(string = (settingsUtil$Parser = SettingsUtil$Parser.getParser(settings$Setting.getType())).parse(new SettingsUtil$ParserContext(settings$Setting, null), string))) {
            throw new IllegalStateException(settingsUtil$Parser + " parser returned incorrect type, expected " + clazz + " got " + string + " which is " + string.getClass());
        }
        settings$Setting.value = string;
    }
}

