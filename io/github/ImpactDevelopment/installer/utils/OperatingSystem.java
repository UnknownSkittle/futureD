/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import java.util.Locale;

public enum OperatingSystem {
    WINDOWS,
    OSX,
    LINUX,
    UNKNOWN;


    public static OperatingSystem getOS() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (string.contains("windows")) {
            return WINDOWS;
        }
        if (string.contains("mac")) {
            return OSX;
        }
        if (string.contains("linux") || string.contains("solaris") || string.contains("sunos") || string.contains("unix")) {
            return LINUX;
        }
        return UNKNOWN;
    }
}

