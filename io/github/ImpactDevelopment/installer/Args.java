/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer;

import com.beust.jcommander.Parameter;
import io.github.ImpactDevelopment.installer.impact.ImpactVersion;
import io.github.ImpactDevelopment.installer.impact.ImpactVersionDisk;
import io.github.ImpactDevelopment.installer.impact.ImpactVersionReleased;
import io.github.ImpactDevelopment.installer.impact.ImpactVersions;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.OptiFineSetting;
import io.github.ImpactDevelopment.installer.target.InstallationModeOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.function.BiConsumer;

public class Args {
    @Parameter(names={"--no-gpg", "--disable-gpg"}, description="Disable checking the release signature for testing purposes")
    public boolean noGPG = false;
    @Parameter(names={"-i", "--impact-version"}, description="The fully qualified Impact version (e.g. 4.6-1.12.2)")
    public String impactVersion;
    @Parameter(names={"-f", "--json-file", "--file"}, description="A json file to install from. Overrides impactVersion.")
    public String file;
    @Parameter(names={"-m", "--mode"}, description="The mode of installation to execute")
    public String mode;
    @Parameter(names={"--no-gui", "--disable-gui"}, description="Disable the GUI and execute the specifcied mode")
    public boolean noGUI = false;
    @Parameter(names={"--pre", "--include-pre", "--prerelease", "--prereleases", "--include-prereleases"}, description="Include releases marked as prerelease on GitHub")
    public boolean prereleases = false;
    @Parameter(names={"--all"}, description="Run on all Impact releases")
    public boolean all = false;
    @Parameter(names={"--mc-dir", "--minecraft-dir", "--minecraft-directory", "--mc-path"}, description="Path to the Minecraft directory")
    public String mcPath;
    @Parameter(names={"--optifine", "--of"}, description="OptiFine, in the format like 1.12.2_HD_U_E2")
    public String optifine;
    @Parameter(names={"--no-ga", "--no-analytics", "--dnt", "--no-tracky"}, description="Disable Google Analytics")
    public boolean noAnalytics = false;
    @Parameter(names={"-h", "-?", "--help"}, description="Display this help and exit", help=true, order=0)
    public boolean showUsage = false;
    @Parameter(names={"--version"}, description="Output version information and exit\n", help=true, order=1)
    public boolean showVersion = false;

    public Args() {
        try {
            Args.getProperties("default_args.properties").forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
                String string;
                String string2;
                try {
                    string2 = (String)object;
                    string = (String)object2;
                } catch (Throwable throwable) {
                    System.err.println("WTF! unable to cast key or value to string: " + object + ", " + object2);
                    return;
                }
                try {
                    object = Args.class.getField(string2);
                    if (!((AccessibleObject)object).isAnnotationPresent(Parameter.class)) {
                        System.err.println("default_args.properties tried to override non-parameter field " + ((Field)object).getName());
                        return;
                    }
                    ((Field)object).set(this, Args.toType(((Field)object).getType(), string));
                    return;
                } catch (Throwable throwable) {
                    System.err.println("Error setting default value: " + string2 + " = " + string);
                    throwable.printStackTrace();
                    return;
                }
            }));
            return;
        } catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            if (!(throwable instanceof FileNotFoundException)) {
                throwable2.printStackTrace();
            }
            return;
        }
    }

    public void apply(InstallationConfig installationConfig) {
        if (this.mcPath != null) {
            Path path = Paths.get(this.mcPath, new String[0]);
            if (!Files.isDirectory(path, new LinkOption[0])) {
                throw new IllegalStateException(path + " is not a directory");
            }
            installationConfig.setSettingValue(MinecraftDirectorySetting.INSTANCE, path);
        }
        if (this.mode != null) {
            installationConfig.setSettingValue(InstallationModeSetting.INSTANCE, InstallationModeOptions.valueOf(this.mode.toUpperCase()));
        }
        if (this.all) {
            for (ImpactVersionReleased impactVersionReleased2 : ImpactVersions.getAllVersions()) {
                this.setImpactVersion(installationConfig, true, impactVersionReleased2);
                try {
                    System.out.println(installationConfig.execute());
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
        }
        if (this.impactVersion != null) {
            this.setImpactVersion(installationConfig, true, ImpactVersions.getAllVersions().stream().filter(impactVersionReleased -> impactVersionReleased.getCombinedVersion().equals(this.impactVersion)).findAny().orElseThrow(() -> new IllegalArgumentException("No impact version matches " + this.impactVersion)));
        }
        if (this.file != null) {
            this.setImpactVersion(installationConfig, false, new ImpactVersionDisk(Paths.get(this.file, new String[0])));
        }
        if (this.optifine != null && !installationConfig.setSettingValue(OptiFineSetting.INSTANCE, this.optifine)) {
            throw new IllegalArgumentException(this.optifine + " is not found");
        }
    }

    private void setImpactVersion(InstallationConfig installationConfig, boolean bl2, ImpactVersion impactVersion) {
        installationConfig.setSettingValue(MinecraftVersionSetting.INSTANCE, impactVersion.mcVersion);
        if (bl2 && !ImpactVersionSetting.INSTANCE.validSetting(installationConfig, impactVersion)) {
            throw new IllegalStateException(this.impactVersion + " is not a valid selection in the current configuration. Perhaps try a different mode or version");
        }
        installationConfig.setSettingValue(ImpactVersionSetting.INSTANCE, impactVersion);
    }

    private static Properties getProperties(String string) {
        Properties properties = new Properties();
        InputStream inputStream = Args.class.getClassLoader().getResourceAsStream(string);
        if (inputStream == null) {
            throw new FileNotFoundException(string + "' not found in the classpath");
        }
        try {
            properties.load(inputStream);
        } finally {
            inputStream.close();
        }
        return properties;
    }

    private static Object toType(Class<?> clazz, String string) {
        if (Boolean.class == clazz || Boolean.TYPE == clazz) {
            return Boolean.parseBoolean(string);
        }
        if (Byte.class == clazz || Byte.TYPE == clazz) {
            return Byte.parseByte(string);
        }
        if (Short.class == clazz || Short.TYPE == clazz) {
            return Short.parseShort(string);
        }
        if (Integer.class == clazz || Integer.TYPE == clazz) {
            return Integer.parseInt(string);
        }
        if (Long.class == clazz || Long.TYPE == clazz) {
            return Long.parseLong(string);
        }
        if (Float.class == clazz || Float.TYPE == clazz) {
            return Float.valueOf(Float.parseFloat(string));
        }
        if (Double.class == clazz || Double.TYPE == clazz) {
            return Double.parseDouble(string);
        }
        return string;
    }
}

