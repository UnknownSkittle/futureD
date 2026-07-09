/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.c;

public final class a {
    private int a;
    private int b;
    private int c;
    private short[][][] d;
    private short[][][] e;
    private short[][] f;
    private short[] g;

    public a(byte by2, byte by3, short[][][] sArray, short[][][] sArray2, short[][] sArray3, short[] sArray4) {
        this.a = by2 & 0xFF;
        this.b = by3 & 0xFF;
        this.c = this.b - this.a;
        this.d = sArray;
        this.e = sArray2;
        this.f = sArray3;
        this.g = sArray4;
    }

    public final short[][][] a() {
        return this.d;
    }

    public final short[][][] b() {
        return this.e;
    }

    public final short[][] c() {
        return this.f;
    }

    public final short[] d() {
        return this.g;
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c && org.bouncycastle.asn1.util.a.a(this.d, ((a)object).d) && org.bouncycastle.asn1.util.a.a(this.e, ((a)object).e) && org.bouncycastle.asn1.util.a.a(this.f, ((a)object).f) && org.bouncycastle.asn1.util.a.a(this.g, ((a)object).g);
    }

    public final int hashCode() {
        return (((((this.a * 37 + this.b) * 37 + this.c) * 37 + org.bouncycastle.e.a.a(this.d)) * 37 + org.bouncycastle.e.a.a(this.e)) * 37 + org.bouncycastle.e.a.a(this.f)) * 37 + org.bouncycastle.e.a.a(this.g);
    }
}

