/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.y;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.b.h;
import org.bouncycastle.openpgp.b.j;
import org.bouncycastle.openpgp.m;

public final class x {
    private y a;
    private int b;
    private h c;
    private byte d;
    private OutputStream e;

    x(c c2) {
        this((y)c2.b());
    }

    x(y y2) {
        this.a = y2;
        this.b = y2.a();
    }

    public final void a(j object, ab ab2) {
        object = object.a(this.a.b(), this.a.c());
        this.c = object.a(ab2);
        this.d = 0;
        this.e = this.c.a();
    }

    public final void a(byte by2) {
        if (this.b == 1) {
            if (by2 == 13) {
                this.b((byte)13);
                this.b((byte)10);
            } else if (by2 == 10) {
                if (this.d != 13) {
                    this.b((byte)13);
                    this.b((byte)10);
                }
            } else {
                this.b(by2);
            }
            this.d = by2;
            return;
        }
        this.b(by2);
    }

    private void b(byte by2) {
        try {
            this.e.write(by2);
            return;
        } catch (IOException iOException) {
            throw new af(iOException.getMessage(), iOException);
        }
    }

    public final boolean a(aj aj2) {
        try {
            this.e.write(aj2.d());
            this.e.close();
        } catch (IOException iOException) {
            throw new m("unable to add trailer: " + iOException.getMessage(), iOException);
        }
        return this.c.a(aj2.f());
    }

    public final long a() {
        return this.a.d();
    }

    public final void a(OutputStream outputStream) {
        y y2 = this.a;
        outputStream = (g)outputStream;
        ((i)y2).a((g)outputStream);
    }
}

