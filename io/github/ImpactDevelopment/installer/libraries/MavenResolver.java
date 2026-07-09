/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.libraries;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.libraries.MavenResolver$1;
import io.github.ImpactDevelopment.installer.utils.Fetcher;
import java.util.Map;

public class MavenResolver {
    private static Map<String, String> MAVEN_MAP = null;

    private static Map<String, String> getMavenMap() {
        return (Map)Installer.gson.a(Fetcher.fetch("https://impactdevelopment.github.io/Resources/data/maven.refmap.json"), new MavenResolver$1().getType());
    }

    public static String getURLBase(String string) {
        String string2;
        if (MAVEN_MAP == null) {
            MAVEN_MAP = MavenResolver.getMavenMap();
        }
        if ((string2 = MAVEN_MAP.get(string)) == null) {
            throw new IllegalArgumentException("Can't get URL for maven group ".concat(String.valueOf(string)));
        }
        return string2;
    }

    public static String getFullURL(String stringArray) {
        stringArray = stringArray.split(":");
        return MavenResolver.getURLBase(stringArray[0]) + MavenResolver.partsToPath(stringArray);
    }

    public static String partsToPath(String[] stringArray) {
        return stringArray[0].replace(".", "/") + "/" + stringArray[1] + "/" + stringArray[2] + "/" + stringArray[1] + "-" + stringArray[2] + ".jar";
    }
}

