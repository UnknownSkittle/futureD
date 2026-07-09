/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.libraries;

public interface ILibrary {
    public String getName();

    public String getSHA1();

    public int getSize();

    public String getURL();
}

