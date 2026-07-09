/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.c;

import java.security.spec.KeySpec;

public class b
implements KeySpec {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public b(int n2, short[][] sArray, short[][] sArray2, short[] sArray3) {
        this.d = n2;
        this.a = sArray;
        this.b = sArray2;
        this.c = sArray3;
    }

    public final int a() {
        return this.d;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[][] c() {
        return this.b;
    }

    public final short[] d() {
        return this.c;
    }
}

