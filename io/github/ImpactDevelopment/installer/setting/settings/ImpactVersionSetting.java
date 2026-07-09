/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting.settings;

import io.github.ImpactDevelopment.installer.impact.ImpactVersion;
import io.github.ImpactDevelopment.installer.impact.ImpactVersionDisk;
import io.github.ImpactDevelopment.installer.impact.ImpactVersions;
import io.github.ImpactDevelopment.installer.setting.ChoiceSetting;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftVersionSetting;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum ImpactVersionSetting implements ChoiceSetting<ImpactVersion>
{
    INSTANCE;


    @Override
    public final List<ImpactVersion> getPossibleValues(InstallationConfig installationConfig) {
        String string = installationConfig.getSettingValue(MinecraftVersionSetting.INSTANCE);
        return ImpactVersions.getAllVersions().stream().filter(installationConfig.getSettingValue(InstallationModeSetting.INSTANCE)::supports).filter(impactVersionReleased -> string.equals(impactVersionReleased.mcVersion)).sorted(Comparator.comparing(impactVersionReleased -> impactVersionReleased.impactVersion).reversed()).collect(Collectors.toList());
    }

    @Override
    public final boolean validSetting(InstallationConfig installationConfig, ImpactVersion impactVersion) {
        if (ChoiceSetting.super.validSetting(installationConfig, impactVersion)) {
            return true;
        }
        return impactVersion != null && impactVersion instanceof ImpactVersionDisk;
    }

    @Override
    public final String displayName(InstallationConfig installationConfig, ImpactVersion impactVersion) {
        String string = impactVersion.impactVersion;
        if (this.getPossibleValues(installationConfig).indexOf(impactVersion) == 0) {
            string = string + " (latest)";
        }
        return string;
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

