/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import org.apache.a.h.a.o;
import org.apache.a.h.a.p;
import org.apache.a.h.a.s;

public final class q {
    private String a;
    private String b;
    private String c;
    private byte[] d;
    private String e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k = null;
    private byte[] l = null;
    private byte[] m = null;
    private byte[] n = null;
    private byte[] o = null;
    private byte[] p = null;
    private byte[] q = null;
    private byte[] r = null;
    private byte[] s = null;
    private byte[] t = null;
    private byte[] u = null;
    private byte[] v = null;
    private byte[] w = null;
    private byte[] x = null;
    private byte[] y = null;
    private byte[] z = null;

    private q(String string, String string2, String string3, byte[] byArray, String string4, byte[] byArray2) {
        this.a = string;
        this.e = string4;
        this.b = string2;
        this.c = string3;
        this.d = byArray;
        this.f = byArray2;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public q(String string, String string2, String string3, byte[] byArray, String string4, byte[] byArray2, byte by2) {
        this(string, string2, string3, byArray, string4, byArray2);
    }

    private byte[] m() {
        if (this.g == null) {
            this.g = org.apache.a.h.a.p.b();
        }
        return this.g;
    }

    public final byte[] a() {
        if (this.i == null) {
            this.i = org.apache.a.h.a.p.c();
        }
        return this.i;
    }

    private byte[] n() {
        if (this.k == null) {
            this.k = org.apache.a.h.a.p.a(this.c);
        }
        return this.k;
    }

    public final byte[] b() {
        if (this.l == null) {
            this.l = org.apache.a.h.a.p.c(this.n(), this.d);
        }
        return this.l;
    }

    private byte[] o() {
        if (this.m == null) {
            this.m = org.apache.a.h.a.p.b(this.c);
        }
        return this.m;
    }

    public final byte[] c() {
        if (this.n == null) {
            this.n = org.apache.a.h.a.p.c(this.o(), this.d);
        }
        return this.n;
    }

    private byte[] p() {
        if (this.o == null) {
            this.o = org.apache.a.h.a.p.b(this.a, this.b, this.o());
        }
        return this.o;
    }

    public final byte[] d() {
        if (this.s == null) {
            byte[] byArray = this.p();
            q q2 = this;
            if (q2.r == null) {
                q q3;
                if ((q3 = q2).h == null) {
                    q3.h = org.apache.a.h.a.p.b();
                }
                byte[] byArray2 = q3.h;
                byte[] byArray3 = q2.f;
                q3 = q2;
                if (q3.j == null) {
                    long l2 = (System.currentTimeMillis() + 11644473600000L) * 10000L;
                    q3.j = new byte[8];
                    for (int i2 = 0; i2 < 8; ++i2) {
                        q3.j[i2] = (byte)l2;
                        l2 >>>= 8;
                    }
                }
                v3.r = org.apache.a.h.a.p.b(byArray2, byArray3, q3.j);
            }
            this.s = org.apache.a.h.a.p.c(byArray, this.d, q2.r);
        }
        return this.s;
    }

    public final byte[] e() {
        if (this.q == null) {
            q q2 = this;
            if (q2.p == null) {
                q2.p = org.apache.a.h.a.p.a(q2.a, q2.b, q2.o());
            }
            q2.q = org.apache.a.h.a.p.c(q2.p, this.d, this.m());
        }
        return this.q;
    }

    public final byte[] f() {
        if (this.t == null) {
            this.t = org.apache.a.h.a.p.a(this.o(), this.d, this.m());
        }
        return this.t;
    }

    public final byte[] g() {
        if (this.u == null) {
            byte[] byArray = this.m();
            this.u = new byte[24];
            System.arraycopy(byArray, 0, this.u, 0, byArray.length);
            Arrays.fill(this.u, byArray.length, this.u.length, (byte)0);
        }
        return this.u;
    }

    public final byte[] h() {
        if (this.v == null) {
            this.v = new byte[16];
            System.arraycopy(this.n(), 0, this.v, 0, 8);
            Arrays.fill(this.v, 8, 16, (byte)0);
        }
        return this.v;
    }

    public final byte[] i() {
        if (this.w == null) {
            s s2 = new s();
            s2.a(this.o());
            this.w = s2.a();
        }
        return this.w;
    }

    public final byte[] j() {
        if (this.x == null) {
            byte[] byArray = this.p();
            byte[] byArray2 = new byte[16];
            System.arraycopy(this.d(), 0, byArray2, 0, 16);
            this.x = org.apache.a.h.a.p.a(byArray2, byArray);
        }
        return this.x;
    }

    public final byte[] k() {
        if (this.y == null) {
            byte[] byArray = this.g();
            byte[] byArray2 = new byte[this.d.length + byArray.length];
            System.arraycopy(this.d, 0, byArray2, 0, this.d.length);
            System.arraycopy(byArray, 0, byArray2, this.d.length, byArray.length);
            this.y = org.apache.a.h.a.p.a(byArray2, this.i());
        }
        return this.y;
    }

    public final byte[] l() {
        if (this.z == null) {
            try {
                Object object = new byte[14];
                System.arraycopy(this.n(), 0, object, 0, 8);
                Arrays.fill(object, 8, 14, (byte)-67);
                Object object2 = org.apache.a.h.a.p.a(object, 0);
                object = org.apache.a.h.a.p.a(object, 7);
                byte[] byArray = new byte[8];
                System.arraycopy(this.b(), 0, byArray, 0, 8);
                Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                cipher.init(1, (Key)object2);
                object2 = cipher.doFinal(byArray);
                cipher = Cipher.getInstance("DES/ECB/NoPadding");
                cipher.init(1, (Key)object);
                object = cipher.doFinal(byArray);
                this.z = new byte[16];
                System.arraycopy(object2, 0, this.z, 0, ((Object)object2).length);
                System.arraycopy(object, 0, this.z, ((Object)object2).length, ((byte[])object).length);
            } catch (Exception exception) {
                throw new o(exception.getMessage(), exception);
            }
        }
        return this.z;
    }
}

