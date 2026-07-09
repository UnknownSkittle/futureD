/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.i.g;

public final class d
extends OutputStream {
    private final g a;
    private final byte[] b = new byte[2048];
    private int c = 0;
    private boolean d = false;
    private boolean e = false;

    public d(g g2) {
        this.a = g2;
    }

    private void a() {
        if (this.c > 0) {
            this.a.a(Integer.toHexString(this.c));
            this.a.a(this.b, 0, this.c);
            this.a.a("");
            this.c = 0;
        }
    }

    @Override
    public final void write(int n2) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.b[this.c] = (byte)n2;
        ++this.c;
        if (this.c == 2048) {
            this.a();
        }
    }

    @Override
    public final void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public final void write(byte[] object, int n2, int n3) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (n3 >= 2048 - this.c) {
            d d2 = this;
            int n4 = n3;
            n3 = n2;
            byte[] byArray = object;
            object = d2;
            d2.a.a(Integer.toHexString(object.c + n4));
            object.a.a(object.b, 0, object.c);
            object.a.a(byArray, n3, n4);
            object.a.a("");
            object.c = 0;
            return;
        }
        System.arraycopy(object, n2, this.b, this.c, n3);
        this.c += n3;
    }

    @Override
    public final void flush() {
        this.a();
        this.a.c();
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.e = true;
            d d2 = this;
            if (!d2.d) {
                d2.a();
                d d3 = d2;
                d3.a.a("0");
                d3.a.a("");
                d2.d = true;
            }
            this.a.c();
        }
    }
}

