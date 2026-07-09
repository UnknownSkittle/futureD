/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.b.ah;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.an;
import org.bouncycastle.openpgp.b.h;
import org.bouncycastle.openpgp.b.j;
import org.bouncycastle.openpgp.m;

public final class aj {
    private ah a;
    private int b;
    private org.bouncycastle.b.an c;
    private h d;
    private byte e;
    private OutputStream f;

    aj(c c2) {
        this((ah)c2.b());
    }

    aj(ah ah2) {
        this.a = ah2;
        this.b = this.a.a();
        this.c = null;
    }

    aj(ah ah2, org.bouncycastle.b.an an2) {
        this(ah2);
        this.c = an2;
    }

    public final void a(j object, ab ab2) {
        object = object.a(this.a.d(), this.a.e());
        this.d = object.a(ab2);
        this.e = 0;
        this.f = this.d.a();
    }

    public final void a(byte by2) {
        if (this.b == 1) {
            if (by2 == 13) {
                this.b((byte)13);
                this.b((byte)10);
            } else if (by2 == 10) {
                if (this.e != 13) {
                    this.b((byte)13);
                    this.b((byte)10);
                }
            } else {
                this.b(by2);
            }
            this.e = by2;
            return;
        }
        this.b(by2);
    }

    public final void a(byte[] object, int n2) {
        if (this.b == 1) {
            int n3 = n2;
            for (n2 = 0; n2 != n3; ++n2) {
                this.a(object[n2]);
            }
            return;
        }
        int n4 = n2;
        byte[] byArray = object;
        object = this;
        try {
            object.f.write(byArray, 0, n4);
            return;
        } catch (IOException iOException) {
            throw new af(iOException.getMessage(), iOException);
        }
    }

    private void b(byte by2) {
        try {
            this.f.write(by2);
            return;
        } catch (IOException iOException) {
            throw new af(iOException.getMessage(), iOException);
        }
    }

    public final boolean a() {
        try {
            this.f.write(this.a.c());
            this.f.close();
        } catch (IOException iOException) {
            throw new m(iOException.getMessage(), iOException);
        }
        return this.d.a(this.f());
    }

    public final int b() {
        return this.a.a();
    }

    public final long c() {
        return this.a.b();
    }

    public final byte[] d() {
        return this.a.c();
    }

    public final an e() {
        ai[] aiArray = this.a.h();
        if (aiArray != null) {
            return new an(aiArray);
        }
        return null;
    }

    public final byte[] f() {
        Object[] objectArray = this.a.f();
        if (objectArray != null) {
            if (objectArray.length == 1) {
                objectArray = org.bouncycastle.e.c.a(objectArray[0].b());
            } else {
                try {
                    a a2 = new a();
                    a2.a(new k(objectArray[0].b()));
                    a2.a(new k(objectArray[1].b()));
                    objectArray = new be(a2).j();
                } catch (IOException iOException) {
                    throw new m("exception encoding DSA sig.", iOException);
                }
            }
        } else {
            objectArray = this.a.g();
        }
        return objectArray;
    }

    public final void a(OutputStream outputStream) {
        this.b(outputStream);
    }

    public final void b(OutputStream outputStream) {
        outputStream = outputStream instanceof g ? (g)outputStream : new g(outputStream);
        i i2 = this.a;
        OutputStream outputStream2 = outputStream;
        i2.a((g)outputStream2);
        if (this.c != null) {
            i2 = this.c;
            outputStream2 = outputStream;
            i2.a((g)outputStream2);
        }
    }
}

