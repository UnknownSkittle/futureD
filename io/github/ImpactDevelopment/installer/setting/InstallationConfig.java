/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting;

import io.github.ImpactDevelopment.installer.Args;
import io.github.ImpactDevelopment.installer.setting.Setting;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class InstallationConfig {
    private final Map<Setting, Object> settingValues = new LinkedHashMap<Setting, Object>();

    public InstallationConfig(Args args) {
        args.apply(this);
    }

    public InstallationConfig() {
    }

    public <T> T getSettingValue(Setting<T> setting2) {
        return (T)this.settingValues.computeIfAbsent(setting2, setting -> setting.getDefaultValue(this));
    }

    public <T> boolean hasSettingValue(Setting<T> setting) {
        return this.settingValues.containsKey(setting);
    }

    public <T> boolean setSettingValue(Setting<T> setting, T t2) {
        this.settingValues.put(setting, t2);
        boolean bl2 = false;
        block0: while (true) {
            for (Setting setting2 : new ArrayList<Setting>(this.settingValues.keySet())) {
                InstallationConfig installationConfig = this;
                if (setting2.validSetting(installationConfig, installationConfig.settingValues.get(setting2))) continue;
                System.out.println(setting2 + " was invalidated by changing " + setting + " to " + t2);
                if (setting2 == setting) {
                    bl2 = true;
                }
                this.settingValues.remove(setting2);
                Setting setting3 = setting2;
                this.settingValues.put(setting3, setting3.getDefaultValue(this));
                continue block0;
            }
            break;
        }
        System.out.println(this.settingValues);
        return !bl2;
    }

    public String execute() {
        String string;
        String string2 = this.getSettingValue(ImpactVersionSetting.INSTANCE).getCombinedVersion();
        Tracky.event("installer", "install", string2);
        try {
            string = this.getSettingValue(InstallationModeSetting.INSTANCE).mode.apply(this).apply();
        } catch (IOException | RuntimeException exception) {
            Tracky.event("installer", "error", string2);
            throw exception;
        }
        Tracky.event("installer", "success", string2);
        return string;
    }
}

