/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api;

import baritone.api.Settings;
import baritone.api.Settings$1;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.TypeUtils;
import java.lang.reflect.Type;

public final class Settings$Setting<T> {
    public T value;
    public final T defaultValue;
    private String name;
    final /* synthetic */ Settings this$0;

    private Settings$Setting(Settings settings, T t2) {
        this.this$0 = settings;
        if (t2 == null) {
            throw new IllegalArgumentException("Cannot determine value type class from null");
        }
        this.value = t2;
        this.defaultValue = t2;
    }

    @Deprecated
    public final T get() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public final Class<T> getValueClass() {
        return TypeUtils.resolveBaseClass(this.getType());
    }

    public final String toString() {
        return SettingsUtil.settingToString(this);
    }

    public final void reset() {
        this.value = this.defaultValue;
    }

    public final Type getType() {
        return this.this$0.settingTypes.get(this);
    }

    /* synthetic */ Settings$Setting(Settings settings, Object object, Settings$1 settings$1) {
        this(settings, object);
    }

    static /* synthetic */ String access$102(Settings$Setting settings$Setting, String string) {
        settings$Setting.name = string;
        return settings$Setting.name;
    }
}

