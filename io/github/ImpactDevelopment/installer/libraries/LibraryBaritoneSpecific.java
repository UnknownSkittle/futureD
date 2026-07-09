/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.libraries;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.libraries.LibraryCustomURL;

public class LibraryBaritoneSpecific
extends LibraryCustomURL {
    public static final String VARIANT = "baritone-api";

    public LibraryBaritoneSpecific(ImpactJsonLibrary impactJsonLibrary) {
        ImpactJsonLibrary impactJsonLibrary2 = impactJsonLibrary;
        super(impactJsonLibrary2, LibraryBaritoneSpecific.urlFromVersion(impactJsonLibrary2.name.split(":")[2]));
        if (impactJsonLibrary.name.contains("*") || !impactJsonLibrary.name.startsWith("cabaletta:baritone-api:")) {
            throw new IllegalStateException(impactJsonLibrary.name);
        }
    }

    private static String urlFromVersion(String string) {
        return "https://github.com/cabaletta/baritone/releases/download/v" + string + "/baritone-api-" + string + ".jar";
    }
}

