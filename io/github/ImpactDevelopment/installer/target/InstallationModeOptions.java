/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target;

import io.github.ImpactDevelopment.installer.impact.ImpactVersion;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.target.InstallationMode;
import io.github.ImpactDevelopment.installer.target.targets.Forge;
import io.github.ImpactDevelopment.installer.target.targets.MultiMC;
import io.github.ImpactDevelopment.installer.target.targets.ShowJSON;
import io.github.ImpactDevelopment.installer.target.targets.Validate;
import io.github.ImpactDevelopment.installer.target.targets.Vanilla;
import java.util.function.Function;

public enum InstallationModeOptions {
    VANILLA(Vanilla::new, true),
    FORGE(Forge::new, true),
    VALIDATE(Validate::new, false),
    MULTIMC(MultiMC::new, true),
    SHOWJSON(ShowJSON::new, true);

    public final Function<InstallationConfig, InstallationMode> mode;
    public final boolean showInGUI;

    private InstallationModeOptions(Function<InstallationConfig, InstallationMode> function, boolean bl2) {
        this.mode = function;
        this.showInGUI = bl2;
    }

    public final boolean supports(ImpactVersion impactVersion) {
        switch (this) {
            case FORGE: {
                return impactVersion.mcVersion.equals("1.12.2") && impactVersion.impactVersion.compareTo("4.6") >= 0;
            }
        }
        return true;
    }

    public final String toString() {
        switch (this) {
            case VANILLA: {
                return "Vanilla";
            }
            case SHOWJSON: {
                return "Show Vanilla JSON";
            }
            case MULTIMC: {
                return "Show MultiMC JSON";
            }
            case FORGE: {
                return "Forge";
            }
            case VALIDATE: {
                return "Validate Vanilla version";
            }
        }
        return "Unknown";
    }
}

