/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.math.b.a;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.ar;
import org.bouncycastle.openpgp.as;
import org.bouncycastle.openpgp.b.c;
import org.bouncycastle.openpgp.b.n;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.k;
import org.bouncycastle.openpgp.m;

public final class j
implements ar {
    private g a;
    private OutputStream b;
    private boolean c = false;
    private o d;
    private OutputStream e;
    private n f;
    private List g = new ArrayList();
    private int h;
    private SecureRandom i;

    public j(n n2) {
        this(n2, 0);
    }

    private j(n n2, byte by2) {
        this.f = n2;
        this.c = false;
        this.h = this.f.a();
        this.i = this.f.b();
    }

    public final void a(a a2) {
        this.g.add(a2);
    }

    private static byte[] a(int n2, byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length + 3];
        byte[] byArray3 = byArray2;
        byArray2[0] = (byte)n2;
        System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
        byte[] byArray4 = byArray3;
        int n3 = 0;
        for (int i2 = 1; i2 != byArray4.length - 2; ++i2) {
            n3 += byArray4[i2] & 0xFF;
        }
        byArray4[byArray4.length - 2] = (byte)(n3 >> 8);
        byArray4[byArray4.length - 1] = (byte)n3;
        return byArray3;
    }

    private OutputStream a(OutputStream outputStream, long l2, byte[] byArray) {
        Object object;
        Object object2;
        byte[] byArray2;
        if (this.b != null) {
            throw new IllegalStateException("generator already in open state");
        }
        if (this.g.size() == 0) {
            throw new IllegalStateException("no encryption methods specified");
        }
        this.a = new g(outputStream);
        this.h = this.f.a();
        this.i = this.f.b();
        if (this.g.size() == 1) {
            if (this.g.get(0) instanceof c) {
                byArray2 = ((c)this.g.get(0)).a(this.f.a());
                i i2 = ((a)this.g.get(0)).a(this.h, null);
                g g2 = this.a;
                i2.a(g2);
            } else {
                byArray2 = ap.a(this.h, this.i);
                object2 = j.a(this.h, byArray2);
                object = (a)this.g.get(0);
                i i3 = ((a)object).a(this.h, (byte[])object2);
                g g3 = this.a;
                i3.a(g3);
            }
        } else {
            byArray2 = ap.a(this.h, this.i);
            object2 = j.a(this.h, byArray2);
            for (int i4 = 0; i4 != this.g.size(); ++i4) {
                Object object3 = (a)this.g.get(i4);
                i i5 = ((a)object3).a(this.h, (byte[])object2);
                object3 = this.a;
                i5.a((g)object3);
            }
        }
        try {
            object2 = this.f.a(byArray2);
            this.d = object2.a();
            if (byArray == null) {
                if (this.d != null) {
                    this.a = new k(this, outputStream, l2 + (long)object2.b() + 2L + 1L + 22L, 0);
                    this.a.write(1);
                } else {
                    this.a = new k(this, outputStream, l2 + (long)object2.b() + 2L);
                }
            } else if (this.d != null) {
                this.a = new k(this, outputStream, 18, byArray);
                this.a.write(1);
            } else {
                this.a = new k(this, outputStream, 9, byArray);
            }
            j j2 = this;
            j2.e = j2.b = object2.a(this.a);
            if (this.d != null) {
                this.e = new org.bouncycastle.e.b.c(this.d.b(), this.b);
            }
            object = new byte[object2.b() + 2];
            this.i.nextBytes((byte[])object);
            Object object4 = object;
            Object object5 = object;
            object4[((Object)object4).length - 1] = object5[((Object)object5).length - 3];
            Object object6 = object;
            Object object7 = object;
            object6[((Object)object6).length - 2] = object7[((Object)object7).length - 4];
            this.e.write((byte[])object);
            return new as(this.e, this);
        } catch (Exception exception) {
            throw new m("Exception creating cipher", exception);
        }
    }

    public final OutputStream a(OutputStream outputStream, long l2) {
        return this.a(outputStream, l2, null);
    }

    public final OutputStream a(OutputStream outputStream, byte[] byArray) {
        return this.a(outputStream, 0L, byArray);
    }

    public final void a() {
        if (this.b != null) {
            if (this.d != null) {
                new g(this.e, 19, 20L, 0).flush();
                byte[] byArray = this.d.c();
                this.b.write(byArray);
            }
            this.b.close();
            this.b = null;
            this.a = null;
        }
    }
}

