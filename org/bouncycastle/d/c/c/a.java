/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.c;

import java.security.spec.KeySpec;

public class a
implements KeySpec {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private int[] e;
    private org.bouncycastle.d.b.c.a[] f;

    public a(short[][] sArray, short[] sArray2, short[][] sArray3, short[] sArray4, int[] nArray, org.bouncycastle.d.b.c.a[] aArray) {
        this.a = sArray;
        this.b = sArray2;
        this.c = sArray3;
        this.d = sArray4;
        this.e = nArray;
        this.f = aArray;
    }

    public final short[] a() {
        return this.b;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[] c() {
        return this.d;
    }

    public final short[][] d() {
        return this.c;
    }

    public final org.bouncycastle.d.b.c.a[] e() {
        return this.f;
    }

    public final int[] f() {
        return this.e;
    }
}

