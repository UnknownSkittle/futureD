/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.libraries;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.libraries.MavenResolver;

public class LibraryMaven
implements ILibrary {
    private final String name;
    private final String sha1;
    private final int size;

    public LibraryMaven(String string, String string2, int n2) {
        this.name = string;
        this.sha1 = string2;
        this.size = n2;
    }

    public LibraryMaven(ImpactJsonLibrary impactJsonLibrary) {
        this(impactJsonLibrary.name, impactJsonLibrary.sha1, impactJsonLibrary.size);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSHA1() {
        return this.sha1;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getURL() {
        return MavenResolver.getFullURL(this.name);
    }
}

