/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.setting.settings;

import io.github.ImpactDevelopment.installer.setting.ChoiceSetting;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftVersionSetting;
import io.github.ImpactDevelopment.installer.target.InstallationModeOptions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public enum OptiFineSetting implements ChoiceSetting<String>
{
    INSTANCE;

    public static final String NONE = "None";
    public static final String MISSING = "Missing";

    @Override
    public final List<String> getPossibleValues(InstallationConfig object) {
        if (((InstallationConfig)object).getSettingValue(InstallationModeSetting.INSTANCE) == InstallationModeOptions.FORGE || ((InstallationConfig)object).getSettingValue(MinecraftVersionSetting.INSTANCE).compareTo("1.15.2") > 0) {
            return Collections.emptyList();
        }
        String string = ((InstallationConfig)object).getSettingValue(MinecraftVersionSetting.INSTANCE);
        object = ((InstallationConfig)object).getSettingValue(MinecraftDirectorySetting.INSTANCE);
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            arrayList.addAll(StreamSupport.stream(Files.newDirectoryStream(object.resolve("libraries").resolve("optifine").resolve("OptiFine")).spliterator(), false).map(Path::getFileName).map(Object::toString).filter(string2 -> string2.startsWith(string + "_")).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(MISSING);
        } else {
            arrayList.add(0, NONE);
        }
        return arrayList;
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

