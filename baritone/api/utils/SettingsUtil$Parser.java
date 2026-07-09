/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  aow
 *  fa
 *  fq
 *  nf
 */
package baritone.api.utils;

import baritone.api.utils.BlockUtils;
import baritone.api.utils.SettingsUtil$1;
import baritone.api.utils.SettingsUtil$ISettingParser;
import baritone.api.utils.SettingsUtil$Parser$1;
import baritone.api.utils.SettingsUtil$ParserContext;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

class SettingsUtil$Parser
extends Enum<SettingsUtil$Parser>
implements SettingsUtil$ISettingParser {
    public static final /* enum */ SettingsUtil$Parser DOUBLE = new SettingsUtil$Parser(Double.class, Double::parseDouble);
    public static final /* enum */ SettingsUtil$Parser BOOLEAN = new SettingsUtil$Parser(Boolean.class, Boolean::parseBoolean);
    public static final /* enum */ SettingsUtil$Parser INTEGER = new SettingsUtil$Parser(Integer.class, Integer::parseInt);
    public static final /* enum */ SettingsUtil$Parser FLOAT = new SettingsUtil$Parser(Float.class, Float::parseFloat);
    public static final /* enum */ SettingsUtil$Parser LONG = new SettingsUtil$Parser(Long.class, Long::parseLong);
    public static final /* enum */ SettingsUtil$Parser STRING = new SettingsUtil$Parser(String.class, String::new);
    public static final /* enum */ SettingsUtil$Parser ENUMFACING = new SettingsUtil$Parser(fa.class, fa::a);
    public static final /* enum */ SettingsUtil$Parser COLOR = new SettingsUtil$Parser(Color.class, string -> new Color(Integer.parseInt(string.split(",")[0]), Integer.parseInt(string.split(",")[1]), Integer.parseInt(string.split(",")[2])), color -> color.getRed() + "," + color.getGreen() + "," + color.getBlue());
    public static final /* enum */ SettingsUtil$Parser VEC3I = new SettingsUtil$Parser(fq.class, string -> new fq(Integer.parseInt(string.split(",")[0]), Integer.parseInt(string.split(",")[1]), Integer.parseInt(string.split(",")[2])), fq2 -> fq2.p() + "," + fq2.q() + "," + fq2.r());
    public static final /* enum */ SettingsUtil$Parser BLOCK = new SettingsUtil$Parser(aow.class, string -> BlockUtils.stringToBlockRequired(string.trim()), BlockUtils::blockToString);
    public static final /* enum */ SettingsUtil$Parser ITEM = new SettingsUtil$Parser(ain.class, string -> ain.b((String)string.trim()), ain2 -> ((nf)ain.g.b(ain2)).toString());
    public static final /* enum */ SettingsUtil$Parser LIST = new SettingsUtil$Parser$1();
    private final Class<?> cla$$;
    private final Function<String, Object> parser;
    private final Function<Object, String> toString;
    private static final /* synthetic */ SettingsUtil$Parser[] $VALUES;

    public static SettingsUtil$Parser[] values() {
        return (SettingsUtil$Parser[])$VALUES.clone();
    }

    public static SettingsUtil$Parser valueOf(String string) {
        return Enum.valueOf(SettingsUtil$Parser.class, string);
    }

    private SettingsUtil$Parser() {
        this.cla$$ = null;
        this.parser = null;
        this.toString = null;
    }

    private <T> SettingsUtil$Parser(Class<T> clazz, Function<String, T> function) {
        this(clazz, function, Object::toString);
    }

    private <T> SettingsUtil$Parser(Class<T> clazz, Function<String, T> function, Function<T, String> function2) {
        this.cla$$ = clazz;
        this.parser = function::apply;
        this.toString = object -> (String)function2.apply(object);
    }

    public Object parse(SettingsUtil$ParserContext object, String string) {
        object = this.parser.apply(string);
        Objects.requireNonNull(object);
        return object;
    }

    public String toString(SettingsUtil$ParserContext settingsUtil$ParserContext, Object object) {
        return this.toString.apply(object);
    }

    @Override
    public boolean accepts(Type type) {
        return type instanceof Class && this.cla$$.isAssignableFrom((Class)type);
    }

    public static SettingsUtil$Parser getParser(Type type) {
        return Stream.of(SettingsUtil$Parser.values()).filter(settingsUtil$Parser -> settingsUtil$Parser.accepts(type)).findFirst().orElse(null);
    }

    /* synthetic */ SettingsUtil$Parser(String string, int n2, SettingsUtil$1 settingsUtil$1) {
        this();
    }

    static {
        $VALUES = new SettingsUtil$Parser[]{DOUBLE, BOOLEAN, INTEGER, FLOAT, LONG, STRING, ENUMFACING, COLOR, VEC3I, BLOCK, ITEM, LIST};
    }
}

