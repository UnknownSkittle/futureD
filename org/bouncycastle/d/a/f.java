/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.a;

import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;
import org.bouncycastle.d.b.c.a;

public final class f
extends m {
    private k a;
    private n b;
    private byte[][] c;
    private byte[] d;
    private byte[][] e;
    private byte[] f;
    private byte[] g;
    private a[] h;

    private f(v v2) {
        Object object;
        int n2;
        if (v2.a(0) instanceof k) {
            this.a = k.a(v2.a(0));
        } else {
            this.b = n.a(v2.a(0));
        }
        Object object2 = (v)v2.a(1);
        this.c = new byte[((v)object2).d()][];
        for (int i2 = 0; i2 < ((v)object2).d(); ++i2) {
            this.c[i2] = ((p)((v)object2).a(i2)).c();
        }
        v v3 = (v)v2.a(2);
        this.d = ((p)v3.a(0)).c();
        object2 = (v)v2.a(3);
        this.e = new byte[((v)object2).d()][];
        for (int i3 = 0; i3 < ((v)object2).d(); ++i3) {
            this.e[i3] = ((p)((v)object2).a(i3)).c();
        }
        Object object3 = (v)v2.a(4);
        this.f = ((p)((v)object3).a(0)).c();
        object2 = (v)v2.a(5);
        this.g = ((p)((v)object2).a(0)).c();
        v2 = (v)v2.a(6);
        object2 = new byte[v2.d()][][][];
        object3 = new byte[v2.d()][][][];
        byte[][][] byArrayArray = new byte[v2.d()][][];
        byte[][] byArrayArray2 = new byte[v2.d()][];
        for (n2 = 0; n2 < v2.d(); ++n2) {
            int n3;
            v v4;
            v v5 = (v)v2.a(n2);
            object = (v)v5.a(0);
            object2[n2] = new byte[((v)object).d()][][];
            for (int i4 = 0; i4 < ((v)object).d(); ++i4) {
                v4 = (v)((v)object).a(i4);
                object2[n2][i4] = new byte[v4.d()][];
                for (n3 = 0; n3 < v4.d(); ++n3) {
                    object2[n2][i4][n3] = ((p)v4.a(n3)).c();
                }
            }
            v v6 = (v)v5.a(1);
            object3[n2] = new byte[v6.d()][][];
            for (int i5 = 0; i5 < v6.d(); ++i5) {
                v v7 = (v)v6.a(i5);
                object3[n2][i5] = new byte[v7.d()][];
                for (int i6 = 0; i6 < v7.d(); ++i6) {
                    object3[n2][i5][i6] = ((p)v7.a(i6)).c();
                }
            }
            v4 = (v)v5.a(2);
            byArrayArray[n2] = new byte[v4.d()][];
            for (n3 = 0; n3 < v4.d(); ++n3) {
                byArrayArray[n2][n3] = ((p)v4.a(n3)).c();
            }
            byArrayArray2[n2] = ((p)v5.a(3)).c();
        }
        n2 = this.g.length - 1;
        this.h = new a[n2];
        for (int i7 = 0; i7 < n2; ++i7) {
            this.h[i7] = object = new a(this.g[i7], this.g[i7 + 1], org.bouncycastle.asn1.util.a.a((byte[][][])object2[i7]), org.bouncycastle.asn1.util.a.a((byte[][][])object3[i7]), org.bouncycastle.asn1.util.a.a(byArrayArray[i7]), org.bouncycastle.asn1.util.a.b(byArrayArray2[i7]));
        }
    }

    public f(short[][] object, short[] objectArray, short[][] sArray, short[] sArray2, int[] nArray, a[] aArray) {
        this.a = new k(1L);
        this.c = org.bouncycastle.asn1.util.a.a(object);
        this.d = org.bouncycastle.asn1.util.a.a(objectArray);
        this.e = org.bouncycastle.asn1.util.a.a(sArray);
        this.f = org.bouncycastle.asn1.util.a.a(sArray2);
        object = nArray;
        objectArray = new byte[nArray.length];
        for (int i2 = 0; i2 < ((short[][])object).length; ++i2) {
            objectArray[i2] = (byte)object[i2];
        }
        this.g = (byte[])objectArray;
        this.h = aArray;
    }

    public static f a(Object object) {
        if (object instanceof f) {
            return (f)object;
        }
        if (object != null) {
            return new f(v.a(object));
        }
        return null;
    }

    public final short[][] a() {
        return org.bouncycastle.asn1.util.a.a(this.c);
    }

    public final short[] b() {
        return org.bouncycastle.asn1.util.a.b(this.d);
    }

    public final short[] c() {
        return org.bouncycastle.asn1.util.a.b(this.f);
    }

    public final short[][] d() {
        return org.bouncycastle.asn1.util.a.a(this.e);
    }

    public final a[] e() {
        return this.h;
    }

    public final int[] f() {
        byte[] byArray = this.g;
        int[] nArray = new int[this.g.length];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            nArray[i2] = byArray[i2] & 0xFF;
        }
        return nArray;
    }

    public final u h() {
        org.bouncycastle.asn1.util.a a2 = new org.bouncycastle.asn1.util.a();
        if (this.a != null) {
            a2.a(this.a);
        } else {
            a2.a(this.b);
        }
        org.bouncycastle.asn1.util.a a3 = new org.bouncycastle.asn1.util.a();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            a3.a(new ba(this.c[i2]));
        }
        a2.a(new be(a3));
        org.bouncycastle.asn1.util.a a4 = new org.bouncycastle.asn1.util.a();
        a4.a(new ba(this.d));
        a2.a(new be(a4));
        a3 = new org.bouncycastle.asn1.util.a();
        for (int i3 = 0; i3 < this.e.length; ++i3) {
            a3.a(new ba(this.e[i3]));
        }
        a2.a(new be(a3));
        org.bouncycastle.asn1.util.a a5 = new org.bouncycastle.asn1.util.a();
        a5.a(new ba(this.f));
        a2.a(new be(a5));
        a3 = new org.bouncycastle.asn1.util.a();
        a3.a(new ba(this.g));
        a2.a(new be(a3));
        a3 = new org.bouncycastle.asn1.util.a();
        for (int i4 = 0; i4 < this.h.length; ++i4) {
            int n2;
            org.bouncycastle.asn1.util.a a6;
            org.bouncycastle.asn1.util.a a7 = new org.bouncycastle.asn1.util.a();
            Object object = org.bouncycastle.asn1.util.a.a(this.h[i4].a());
            org.bouncycastle.asn1.util.a a8 = new org.bouncycastle.asn1.util.a();
            for (int i5 = 0; i5 < ((byte[][][])object).length; ++i5) {
                a6 = new org.bouncycastle.asn1.util.a();
                for (n2 = 0; n2 < object[i5].length; ++n2) {
                    a6.a(new ba(object[i5][n2]));
                }
                a8.a(new be(a6));
            }
            a7.a(new be(a8));
            byte[][][] byArray = org.bouncycastle.asn1.util.a.a(this.h[i4].b());
            a6 = new org.bouncycastle.asn1.util.a();
            for (n2 = 0; n2 < byArray.length; ++n2) {
                object = new org.bouncycastle.asn1.util.a();
                for (int i6 = 0; i6 < byArray[n2].length; ++i6) {
                    ((org.bouncycastle.asn1.util.a)object).a(new ba(byArray[n2][i6]));
                }
                a6.a(new be((org.bouncycastle.asn1.util.a)object));
            }
            a7.a(new be(a6));
            byte[][] byArray2 = org.bouncycastle.asn1.util.a.a(this.h[i4].c());
            object = new org.bouncycastle.asn1.util.a();
            for (int i7 = 0; i7 < byArray2.length; ++i7) {
                ((org.bouncycastle.asn1.util.a)object).a(new ba(byArray2[i7]));
            }
            a7.a(new be((org.bouncycastle.asn1.util.a)object));
            a7.a(new ba(org.bouncycastle.asn1.util.a.a(this.h[i4].d())));
            a3.a(new be(a7));
        }
        a2.a(new be(a3));
        return new be(a2);
    }
}

