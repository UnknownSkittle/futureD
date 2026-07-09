/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.b.al;
import org.bouncycastle.b.c;
import org.bouncycastle.b.t;
import org.bouncycastle.b.z;
import org.bouncycastle.e.b.b;
import org.bouncycastle.openpgp.b.r;
import org.bouncycastle.openpgp.h;
import org.bouncycastle.openpgp.i;
import org.bouncycastle.openpgp.m;

public final class ac
extends h {
    private z e;

    ac(z z2, t t2) {
        super(t2);
        this.e = z2;
    }

    public final long c() {
        return this.e.a();
    }

    public final InputStream a(r object) {
        byte[] byArray;
        byte[] byArray2 = byArray = object.a(this.e.b(), this.e.c());
        int n2 = 0;
        for (int i2 = 1; i2 != byArray2.length - 2; ++i2) {
            n2 += byArray2[i2] & 0xFF;
        }
        if (!(byArray2[byArray2.length - 2] == (byte)(n2 >> 8) && byArray2[byArray2.length - 1] == (byte)n2)) {
            throw new org.bouncycastle.openpgp.r("key checksum failed");
        }
        if (byArray[0] != 0) {
            try {
                int n3;
                int n4 = this.a instanceof al;
                byte[] byArray3 = new byte[byArray.length - 3];
                System.arraycopy(byArray, 1, byArray3, 0, byArray3.length);
                object = object.a(n4 != 0, byArray[0] & 0xFF, byArray3);
                this.b = new c(object.a(this.a.b()));
                if (n4 != 0) {
                    ac ac2 = this;
                    this.c = new i(ac2, ac2.b);
                    this.d = object.b();
                    this.b = new b(this.c, this.d.b());
                }
                object = new byte[object.a()];
                for (n3 = 0; n3 != ((Object)object).length; ++n3) {
                    n4 = this.b.read();
                    if (n4 < 0) {
                        throw new EOFException("unexpected end of stream.");
                    }
                    object[n3] = (byte)n4;
                }
                n3 = this.b.read();
                n4 = this.b.read();
                if (n3 < 0 || n4 < 0) {
                    throw new EOFException("unexpected end of stream.");
                }
                return this.b;
            } catch (m m2) {
                throw m2;
            } catch (Exception exception) {
                throw new m("Exception starting decryption", exception);
            }
        }
        return this.a.b();
    }
}

