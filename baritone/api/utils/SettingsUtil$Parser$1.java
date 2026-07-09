/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.utils;

import baritone.api.utils.SettingsUtil$Parser;
import baritone.api.utils.SettingsUtil$ParserContext;
import baritone.api.utils.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class SettingsUtil$Parser$1
extends SettingsUtil$Parser {
    @Override
    public final Object parse(SettingsUtil$ParserContext settingsUtil$ParserContext, String string2) {
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(((ParameterizedType)SettingsUtil$ParserContext.access$200(settingsUtil$ParserContext).getType()).getActualTypeArguments()[0]);
        return Stream.of(string2.split(",")).map(string -> settingsUtil$Parser.parse(settingsUtil$ParserContext, (String)string)).collect(Collectors.toList());
    }

    @Override
    public final String toString(SettingsUtil$ParserContext settingsUtil$ParserContext, Object object2) {
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(((ParameterizedType)SettingsUtil$ParserContext.access$200(settingsUtil$ParserContext).getType()).getActualTypeArguments()[0]);
        return ((List)object2).stream().map(object -> settingsUtil$Parser.toString(settingsUtil$ParserContext, object)).collect(Collectors.joining(","));
    }

    @Override
    public final boolean accepts(Type type) {
        return List.class.isAssignableFrom(TypeUtils.resolveBaseClass(type));
    }
}

