/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

public interface Console {
    public void print(String var1);

    public void println(String var1);

    public char[] readPassword(boolean var1);
}

