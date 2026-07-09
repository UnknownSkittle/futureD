/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.d.a;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.archivers.g.as;

public final class l {
    private long a;
    private long b;
    private int c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;

    l(byte[] byArray, as as2) {
        this.a = 1000L * (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 4, 4));
        this.b = 1000L * (long)((int)org.apache.commons.compress.archivers.d.b.a(byArray, 8, 4));
        this.c = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 12, 4);
        this.d = org.apache.commons.compress.archivers.d.a.a(as2, byArray, 676, 16).trim();
        this.e = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 692, 4);
        this.f = org.apache.commons.compress.archivers.d.a.a(as2, byArray, 696, 64).trim();
        this.g = org.apache.commons.compress.archivers.d.a.a(as2, byArray, 760, 64).trim();
        this.h = org.apache.commons.compress.archivers.d.a.a(as2, byArray, 824, 64).trim();
        this.i = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 888, 4);
        this.j = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 892, 4);
        this.k = (int)org.apache.commons.compress.archivers.d.b.a(byArray, 896, 4);
    }

    public final int a() {
        return this.k;
    }

    public final boolean b() {
        return (this.i & 0x80) == 128;
    }

    public final int hashCode() {
        int n2 = 17;
        if (this.d != null) {
            n2 = this.d.hashCode();
        }
        n2 = (int)((long)n2 + 31L * this.a);
        if (this.h != null) {
            n2 = 31 * this.h.hashCode() + 17;
        }
        if (this.g != null) {
            n2 = 31 * this.g.hashCode() + 17;
        }
        return n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        object = (l)object;
        if (this.a != ((l)object).a) {
            return false;
        }
        if (this.h == null || !this.h.equals(((l)object).h)) {
            return false;
        }
        return this.g != null && this.g.equals(((l)object).g);
    }
}

