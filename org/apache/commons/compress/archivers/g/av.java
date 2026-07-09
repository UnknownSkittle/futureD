/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;
import org.apache.commons.compress.archivers.d.b;

public final class av
implements Serializable,
Cloneable {
    private final long g;
    public static final av a = new av(33639248L);
    public static final av b = new av(67324752L);
    public static final av c = new av(134695760L);
    static final av d = new av(0xFFFFFFFFL);
    public static final av e = new av(808471376L);
    public static final av f = new av(134630224L);

    private av(long l2) {
        this.g = l2;
    }

    public av(byte[] byArray) {
        this(byArray, 0);
    }

    public av(byte[] byArray, int n2) {
        this.g = org.apache.commons.compress.archivers.d.b.a(byArray, n2, 4);
    }

    public final byte[] a() {
        return av.a(this.g);
    }

    public final long b() {
        return this.g;
    }

    public final int c() {
        return (int)this.g;
    }

    public static byte[] a(long l2) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        long l3 = l2;
        org.apache.commons.compress.archivers.d.b.a(byArray2, l3, 0, 4);
        return byArray;
    }

    public static void a(long l2, byte[] byArray, int n2) {
        org.apache.commons.compress.archivers.d.b.a(byArray, l2, n2, 4);
    }

    public final void a(byte[] byArray, int n2) {
        long l2 = this.g;
        org.apache.commons.compress.archivers.d.b.a(byArray, l2, n2, 4);
    }

    public static long b(byte[] byArray, int n2) {
        return org.apache.commons.compress.archivers.d.b.a(byArray, n2, 4);
    }

    public static long a(byte[] byArray) {
        return org.apache.commons.compress.archivers.d.b.a(byArray, 0, 4);
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof av)) {
            return false;
        }
        return this.g == ((av)object).g;
    }

    public final int hashCode() {
        return (int)this.g;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final String toString() {
        return "ZipLong value: " + this.g;
    }
}

