/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting.settings;

import io.github.ImpactDevelopment.installer.setting.ChoiceSetting;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.target.InstallationModeOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum InstallationModeSetting implements ChoiceSetting<InstallationModeOptions>
{
    INSTANCE;


    @Override
    public final List<InstallationModeOptions> getPossibleValues(InstallationConfig installationConfig) {
        ArrayList<InstallationModeOptions> arrayList = new ArrayList<InstallationModeOptions>(Arrays.asList(InstallationModeOptions.values()));
        if (!installationConfig.hasSettingValue(this) || installationConfig.getSettingValue(this).showInGUI) {
            arrayList.removeIf(installationModeOptions -> !installationModeOptions.showInGUI);
        }
        return arrayList;
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

