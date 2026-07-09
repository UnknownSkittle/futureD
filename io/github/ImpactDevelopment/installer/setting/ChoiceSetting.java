/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting;

import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.Setting;
import java.util.List;

public interface ChoiceSetting<T>
extends Setting<T> {
    public List<T> getPossibleValues(InstallationConfig var1);

    default public String displayName(InstallationConfig installationConfig, T t2) {
        return t2.toString();
    }

    @Override
    default public T getDefaultValue(InstallationConfig object) {
        if ((object = this.getPossibleValues((InstallationConfig)object)).isEmpty()) {
            return null;
        }
        return (T)object.get(0);
    }

    @Override
    default public boolean validSetting(InstallationConfig object, T t2) {
        object = this.getPossibleValues((InstallationConfig)object);
        if (t2 == null) {
            return object.isEmpty();
        }
        return object.contains(t2);
    }
}

