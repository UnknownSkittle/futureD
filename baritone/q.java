/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.gl;

final class q {
    static final /* synthetic */ int[] a;

    static {
        a = new int[gl.values().length];
        try {
            q.a[gl.a.ordinal()] = 1;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            q.a[gl.b.ordinal()] = 2;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            q.a[gl.c.ordinal()] = 3;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            q.a[gl.d.ordinal()] = 4;
        } catch (NoSuchFieldError noSuchFieldError) {}
    }
}

