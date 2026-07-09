/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.b.ah;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.b.d;
import org.bouncycastle.b.b.k;
import org.bouncycastle.b.v;
import org.bouncycastle.b.y;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.an;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.f;
import org.bouncycastle.openpgp.b.g;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.x;

public final class ak {
    private ai[] a = new ai[0];
    private ai[] b = new ai[0];
    private OutputStream c;
    private g d;
    private f e;
    private int f;
    private byte g;
    private int h = -1;

    public ak(g g2) {
        this.d = g2;
    }

    public final void a(int n2, aa aa2) {
        this.e = this.d.a(n2, aa2);
        this.c = this.e.a();
        this.f = this.e.d();
        this.g = 0;
        if (this.h >= 0 && this.h != this.e.f()) {
            throw new m("key algorithm mismatch");
        }
    }

    public final void a(byte by2) {
        if (this.f == 1) {
            if (by2 == 13) {
                this.b((byte)13);
                this.b((byte)10);
            } else if (by2 == 10) {
                if (this.g != 13) {
                    this.b((byte)13);
                    this.b((byte)10);
                }
            } else {
                this.b(by2);
            }
            this.g = by2;
            return;
        }
        this.b(by2);
    }

    public final void a(byte[] byArray, int n2) {
        if (this.f == 1) {
            int n3 = n2;
            for (n2 = 0; n2 != n3; ++n2) {
                this.a(byArray[n2]);
            }
            return;
        }
        this.b(byArray, n2);
    }

    private void b(byte by2) {
        try {
            this.c.write(by2);
            return;
        } catch (IOException iOException) {
            throw new af(iOException.getMessage(), iOException);
        }
    }

    private void b(byte[] byArray, int n2) {
        try {
            this.c.write(byArray, 0, n2);
            return;
        } catch (IOException iOException) {
            throw new af(iOException.getMessage(), iOException);
        }
    }

    public final void a(an an2) {
        if (an2 == null) {
            this.b = new ai[0];
            return;
        }
        this.b = an2.a;
    }

    public final void a() {
        this.a = new ai[0];
    }

    public final x b() {
        return new x(new y(this.f, this.e.e(), this.e.f(), this.e.g()));
    }

    public final aj c() {
        byte[] byArray;
        Object object;
        v[] vArray = new ByteArrayOutputStream();
        ai[] aiArray = !ak.a(this.b, 2) ? ak.a(this.b, new k(new Date())) : this.b;
        ai[] aiArray2 = !ak.a(this.b, 16) && !ak.a(this.a, 16) ? ak.a(this.a, new d(this.e.g())) : this.a;
        try {
            vArray.write(4);
            vArray.write((byte)this.f);
            vArray.write((byte)this.e.f());
            vArray.write((byte)this.e.e());
            object = new ByteArrayOutputStream();
            for (int i2 = 0; i2 != aiArray.length; ++i2) {
                aiArray[i2].a((OutputStream)object);
            }
            byArray = ((ByteArrayOutputStream)object).toByteArray();
            vArray.write((byte)(byArray.length >> 8));
            vArray.write((byte)byArray.length);
            vArray.write(byArray);
        } catch (IOException iOException) {
            throw new m("exception encoding hashed data.", iOException);
        }
        object = vArray.toByteArray();
        vArray.write(4);
        vArray.write(-1);
        vArray.write((byte)(((Object)object).length >> 24));
        vArray.write((byte)(((Object)object).length >> 16));
        vArray.write((byte)(((Object)object).length >> 8));
        vArray.write((byte)((Object)object).length);
        byArray = vArray.toByteArray();
        this.b(byArray, byArray.length);
        if (this.e.f() == 3 || this.e.f() == 1) {
            v[] vArray2 = new v[1];
            vArray = vArray2;
            vArray2[0] = new v(new BigInteger(1, this.e.b()));
        } else {
            vArray = ap.a(this.e.b());
        }
        object = this.e.c();
        byte[] byArray2 = new byte[2];
        byArray = byArray2;
        byArray2[0] = (byte)object[0];
        byArray[1] = (byte)object[1];
        return new aj(new ah(this.f, this.e.g(), this.e.f(), this.e.e(), aiArray, aiArray2, byArray, vArray));
    }

    public final aj a(String object, ab object2) {
        this.b((ab)object2);
        object2 = org.bouncycastle.e.k.a((String)object);
        object = this;
        ((ak)object).a((byte)-76);
        ((ak)object).a((byte)(((Object)object2).length >> 24));
        ((ak)object).a((byte)(((Object)object2).length >> 16));
        ((ak)object).a((byte)(((Object)object2).length >> 8));
        ((ak)object).a((byte)((Object)object2).length);
        Object object3 = object2;
        ((ak)object).a((byte[])object3, ((Object)object3).length);
        return this.c();
    }

    public final aj a(ab ab2, ab ab3) {
        this.b(ab2);
        this.b(ab3);
        return this.c();
    }

    private static byte[] a(ab object) {
        try {
            object = ((ab)object).a.e();
        } catch (IOException iOException) {
            throw new m("exception preparing key.", iOException);
        }
        return object;
    }

    private static boolean a(ai[] aiArray, int n2) {
        for (int i2 = 0; i2 != aiArray.length; ++i2) {
            if (aiArray[i2].a() != n2) continue;
            return true;
        }
        return false;
    }

    private static ai[] a(ai[] aiArray, ai ai2) {
        ai[] aiArray2 = new ai[aiArray.length + 1];
        ai[] aiArray3 = aiArray2;
        aiArray2[0] = ai2;
        System.arraycopy(aiArray, 0, aiArray3, 1, aiArray.length);
        return aiArray3;
    }

    private void b(ab object) {
        object = ak.a((ab)object);
        this.a((byte)-103);
        this.a((byte)(((Object)object).length >> 8));
        this.a((byte)((Object)object).length);
        Object object2 = object;
        this.a((byte[])object2, ((Object)object2).length);
    }
}

