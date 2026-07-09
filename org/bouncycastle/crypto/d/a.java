/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.d;

import java.security.AccessController;
import java.security.SecureRandom;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.d.b;
import org.bouncycastle.crypto.d.c;
import org.bouncycastle.crypto.g;
import org.bouncycastle.crypto.i.j;
import org.bouncycastle.crypto.l;

public final class a
implements org.bouncycastle.crypto.a {
    private SecureRandom a;
    private org.bouncycastle.crypto.a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f = -1;
    private byte[] g = null;
    private byte[] h;

    public a(org.bouncycastle.crypto.a object) {
        this.b = object;
        object = this;
        String string = (String)AccessController.doPrivileged(new b((a)object));
        object = (String)AccessController.doPrivileged(new c((a)object));
        this.e = object != null ? !((String)object).equals("true") : string == null || string.equals("true");
    }

    public final void a(boolean bl2, e e2) {
        e e3;
        if (e2 instanceof j) {
            e3 = (j)e2;
            this.a = ((j)e3).a();
            e3 = (org.bouncycastle.crypto.i.a)((j)e3).b();
        } else {
            e3 = (org.bouncycastle.crypto.i.a)e2;
            if (!((org.bouncycastle.crypto.i.a)e3).a() && bl2) {
                this.a = org.bouncycastle.crypto.g.a();
            }
        }
        this.b.a(bl2, e2);
        this.d = ((org.bouncycastle.crypto.i.a)e3).a();
        this.c = bl2;
        this.h = new byte[this.b.b()];
        if (this.f > 0 && this.a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    public final int a() {
        int n2 = this.b.a();
        if (this.c) {
            return n2 - 10;
        }
        return n2;
    }

    public final int b() {
        int n2 = this.b.b();
        if (this.c) {
            return n2;
        }
        return n2 - 10;
    }

    public final byte[] a(byte[] object, int n2, int n3) {
        if (this.c) {
            int n4 = n3;
            n3 = n2;
            byte[] byArray = object;
            object = this;
            if (n4 > ((a)object).a()) {
                throw new IllegalArgumentException("input data too large");
            }
            byte[] byArray2 = new byte[((a)object).b.a()];
            if (((a)object).d) {
                byArray2[0] = 1;
                for (int i2 = 1; i2 != byArray2.length - n4 - 1; ++i2) {
                    byArray2[i2] = -1;
                }
            } else {
                ((a)object).a.nextBytes(byArray2);
                byArray2[0] = 2;
                for (int i3 = 1; i3 != byArray2.length - n4 - 1; ++i3) {
                    while (byArray2[i3] == 0) {
                        byArray2[i3] = (byte)((a)object).a.nextInt();
                    }
                }
            }
            byArray2[byArray2.length - n4 - 1] = 0;
            System.arraycopy(byArray, n3, byArray2, byArray2.length - n4, n4);
            return ((a)object).b.a(byArray2, 0, byArray2.length);
        }
        a a2 = this;
        int n5 = n3;
        n3 = n2;
        byte[] byArray = object;
        object = a2;
        if (a2.f != -1) {
            return super.b(byArray, n3, n5);
        }
        byte[] byArray3 = ((a)object).b.a(byArray, n3, n5);
        boolean bl2 = ((a)object).e & byArray3.length != ((a)object).b.b();
        byArray = byArray3.length < ((a)object).b() ? ((a)object).h : byArray3;
        n3 = byArray[0];
        boolean bl3 = ((a)object).d ? n3 != 2 : n3 != 1;
        n3 = org.bouncycastle.crypto.d.a.a((byte)n3, byArray);
        if (bl3 | ++n3 < 10) {
            org.bouncycastle.e.a.b(byArray);
            throw new l("block incorrect");
        }
        if (bl2) {
            org.bouncycastle.e.a.b(byArray);
            throw new l("block incorrect size");
        }
        byte[] byArray4 = new byte[byArray.length - n3];
        System.arraycopy(byArray, n3, byArray4, 0, byArray4.length);
        return byArray4;
    }

    private byte[] b(byte[] byArray, int n2, int n3) {
        if (!this.d) {
            throw new l("sorry, this method is only for decryption, not for signing");
        }
        byArray = this.b.a(byArray, n2, n3);
        byte[] byArray2 = new byte[this.f];
        this.a.nextBytes(byArray2);
        byArray = this.e & byArray.length != this.b.b() ? this.h : byArray;
        int n4 = this.f;
        byte[] byArray3 = byArray;
        int n5 = 0 | byArray3[0] ^ 2;
        int n6 = byArray3.length - (n4 + 1);
        for (int i2 = 1; i2 < n6; ++i2) {
            byte by2 = byArray3[i2];
            int n7 = by2 | by2 >> 1;
            int n8 = n7 | n7 >> 2;
            int n9 = n8 | n8 >> 4;
            n5 |= (n9 & 1) - 1;
        }
        int n10 = n5 | byArray3[byArray3.length - (n4 + 1)];
        int n11 = n10 | n10 >> 1;
        int n12 = n11 | n11 >> 2;
        int n13 = ~(((n12 | n12 >> 4) & 1) - 1);
        byte[] byArray4 = new byte[this.f];
        for (n5 = 0; n5 < this.f; ++n5) {
            byArray4[n5] = (byte)(byArray[n5 + (byArray.length - this.f)] & ~n13 | byArray2[n5] & n13);
        }
        org.bouncycastle.e.a.b(byArray);
        return byArray4;
    }

    private static int a(byte by2, byte[] byArray) {
        int n2 = -1;
        boolean bl2 = false;
        for (int i2 = 1; i2 != byArray.length; ++i2) {
            byte by3 = byArray[i2];
            if (by3 == 0 & n2 < 0) {
                n2 = i2;
            }
            bl2 |= by2 == 1 & n2 < 0 & by3 != -1;
        }
        if (bl2) {
            return -1;
        }
        return n2;
    }
}

