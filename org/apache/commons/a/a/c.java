/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.a.a;

import java.util.Arrays;

final class c {
    int a;
    byte[] b;
    int c;
    int d;
    boolean e;
    int f;
    int g;

    c() {
    }

    public final String toString() {
        return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", this.getClass().getSimpleName(), Arrays.toString(this.b), this.f, this.e, this.a, 0L, this.g, this.c, this.d);
    }
}

