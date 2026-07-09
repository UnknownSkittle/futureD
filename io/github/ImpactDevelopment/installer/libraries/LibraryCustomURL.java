/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.libraries;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.libraries.LibraryMaven;

public class LibraryCustomURL
extends LibraryMaven {
    private final String url;

    public LibraryCustomURL(ImpactJsonLibrary impactJsonLibrary, String string) {
        super(impactJsonLibrary);
        this.url = string;
    }

    @Override
    public String getURL() {
        return this.url;
    }
}

