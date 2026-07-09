/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting;

import io.github.ImpactDevelopment.installer.setting.InstallationConfig;

public interface Setting<T> {
    public T getDefaultValue(InstallationConfig var1);

    public boolean validSetting(InstallationConfig var1, T var2);
}

