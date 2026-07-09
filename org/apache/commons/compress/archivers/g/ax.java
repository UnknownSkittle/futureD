/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;
import org.apache.commons.compress.archivers.d.b;

public final class ax
implements Serializable,
Cloneable {
    private final int a;

    public ax(int n2) {
        this.a = n2;
    }

    public ax(byte[] byArray, int n2) {
        this.a = (int)b.a(byArray, n2, 2);
    }

    public final byte[] a() {
        byte[] byArray = new byte[2];
        b.a(byArray, this.a, 0, 2);
        return byArray;
    }

    public final int b() {
        return this.a;
    }

    public static byte[] a(int n2) {
        byte[] byArray = new byte[2];
        ax.a(n2, byArray, 0);
        return byArray;
    }

    public static void a(int n2, byte[] byArray, int n3) {
        b.a(byArray, n2, n3, 2);
    }

    public static int a(byte[] byArray, int n2) {
        return (int)b.a(byArray, n2, 2);
    }

    public static int a(byte[] byArray) {
        return (int)b.a(byArray, 0, 2);
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof ax)) {
            return false;
        }
        return this.a == ((ax)object).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final String toString() {
        return "ZipShort value: " + this.a;
    }

    static {
        new ax(0);
    }
}

