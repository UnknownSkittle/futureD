/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.utils;

import baritone.api.utils.SettingsUtil$ParserContext;
import java.lang.reflect.Type;

interface SettingsUtil$ISettingParser<T> {
    public T parse(SettingsUtil.ParserContext var1, String var2);

    public String toString(SettingsUtil.ParserContext var1, T var2);

    public boolean accepts(Type var1);
}

