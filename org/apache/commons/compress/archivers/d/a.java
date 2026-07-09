/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.util.Arrays;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.archivers.g.as;

final class a {
    private final int a;
    private final int b;
    private final int c;
    private final String d;

    a(int n2, int n3, int n4, String string) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = string;
    }

    final int a() {
        return this.a;
    }

    final int b() {
        return this.b;
    }

    final String c() {
        return this.d;
    }

    public final String toString() {
        return String.format("[%d]: %s", this.a, this.d);
    }

    public static boolean a(byte[] byArray) {
        if ((int)org.apache.commons.compress.archivers.d.b.a(byArray, 24, 4) != 60012) {
            return false;
        }
        int n2 = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 28, 4);
        int n3 = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            n3 += (int)org.apache.commons.compress.archivers.d.b.a(byArray, 4 * i2, 4);
        }
        return n2 == 84446 - (n3 - (int)org.apache.commons.compress.archivers.d.b.a(byArray, 28, 4));
    }

    static String a(as as2, byte[] byArray, int n2, int n3) {
        int n4 = n2;
        return as2.a(Arrays.copyOfRange(byArray, n4, n4 + n3));
    }
}

