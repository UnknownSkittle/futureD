/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.compress.archivers.sevenz.g;
import org.apache.commons.compress.archivers.sevenz.h;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.x;

abstract class f
extends Enum<f> {
    public static final /* enum */ f a = new g();
    private static /* enum */ f b = new h();
    private final String c;
    private static final /* synthetic */ f[] d;

    public static f[] values() {
        return (f[])d.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private f(String string2) {
        this.c = string2;
    }

    public final String a() {
        return this.c;
    }

    public abstract void a(x var1, w var2);

    /* synthetic */ f(String string, int n2, String string2, byte by2) {
        this(string2);
    }

    static {
        d = new f[]{a, b};
    }
}

