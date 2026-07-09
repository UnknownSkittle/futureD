/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target.targets;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.target.InstallationMode;
import io.github.ImpactDevelopment.installer.target.targets.Forge;
import io.github.ImpactDevelopment.installer.utils.Fetcher;

public class Validate
implements InstallationMode {
    private final ImpactJsonVersion version;
    private final InstallationConfig config;

    public Validate(InstallationConfig installationConfig) {
        this.version = installationConfig.getSettingValue(ImpactVersionSetting.INSTANCE).fetchContents();
        this.config = installationConfig;
    }

    @Override
    public String apply() {
        for (ILibrary iLibrary : this.version.resolveLibraries(this.config)) {
            byte[] byArray = Fetcher.fetchBytes(iLibrary.getURL());
            if (byArray.length == iLibrary.getSize() && Forge.sha1hex(byArray).equals(iLibrary.getSHA1())) continue;
            throw new RuntimeException(byArray.length + " " + iLibrary.getSize() + " " + Forge.sha1hex(byArray) + " " + iLibrary.getSHA1());
        }
        return "All libraries verified";
    }
}

