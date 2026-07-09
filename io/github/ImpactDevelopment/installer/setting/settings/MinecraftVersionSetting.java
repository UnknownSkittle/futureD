/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting.settings;

import io.github.ImpactDevelopment.installer.impact.ImpactVersions;
import io.github.ImpactDevelopment.installer.setting.ChoiceSetting;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum MinecraftVersionSetting implements ChoiceSetting<String>
{
    INSTANCE;


    @Override
    public final List<String> getPossibleValues(InstallationConfig installationConfig) {
        return ImpactVersions.getAllVersions().stream().filter(installationConfig.getSettingValue(InstallationModeSetting.INSTANCE)::supports).map(impactVersionReleased -> impactVersionReleased.mcVersion).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    @Override
    public final boolean validSetting(InstallationConfig installationConfig, String string) {
        return true;
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

