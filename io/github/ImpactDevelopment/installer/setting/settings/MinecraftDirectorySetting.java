/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting.settings;

import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.Setting;
import io.github.ImpactDevelopment.installer.utils.OperatingSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum MinecraftDirectorySetting implements Setting<Path>
{
    INSTANCE;


    @Override
    public final Path getDefaultValue(InstallationConfig installationConfig) {
        switch (OperatingSystem.getOS()) {
            case WINDOWS: {
                return Paths.get(System.getenv("APPDATA"), new String[0]).resolve(".minecraft");
            }
            case OSX: {
                return Paths.get(System.getProperty("user.home"), new String[0]).resolve("Library").resolve("Application Support").resolve("minecraft");
            }
        }
        return Paths.get(System.getProperty("user.home"), new String[0]).resolve(".minecraft");
    }

    @Override
    public final boolean validSetting(InstallationConfig installationConfig, Path path) {
        return true;
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

