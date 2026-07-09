/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.LinkedList;
import org.apache.commons.compress.archivers.sevenz.d;
import org.apache.commons.compress.archivers.sevenz.i;

final class t {
    i[] a;
    long b;
    long c;
    d[] d;
    long[] e;
    long[] f;
    boolean g;
    long h;
    int i;

    t() {
    }

    final Iterable<i> a() {
        LinkedList<i> linkedList = new LinkedList<i>();
        int n2 = (int)this.e[0];
        while (n2 != -1) {
            linkedList.addLast(this.a[n2]);
            n2 = this.b(n2);
            n2 = n2 != -1 ? (int)this.d[n2].a : -1;
        }
        return linkedList;
    }

    final int a(int n2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2].a != (long)n2) continue;
            return i2;
        }
        return -1;
    }

    private int b(int n2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2].b != (long)n2) continue;
            return i2;
        }
        return -1;
    }

    final long b() {
        if (this.c == 0L) {
            return 0L;
        }
        for (int i2 = (int)this.c - 1; i2 >= 0; --i2) {
            if (this.b(i2) >= 0) continue;
            return this.f[i2];
        }
        return 0L;
    }

    final long a(i i2) {
        if (this.a != null) {
            for (int i3 = 0; i3 < this.a.length; ++i3) {
                if (this.a[i3] != i2) continue;
                return this.f[i3];
            }
        }
        return 0L;
    }

    public final String toString() {
        return "Folder with " + this.a.length + " coders, " + this.b + " input streams, " + this.c + " output streams, " + this.d.length + " bind pairs, " + this.e.length + " packed streams, " + this.f.length + " unpack sizes, " + (this.g ? "with CRC " + this.h : "without CRC") + " and " + this.i + " unpack streams";
    }
}

