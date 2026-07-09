/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;

public final class ae
extends f {
    int a;
    private int c;
    private byte[] d;
    private int e = -1;
    int b = -1;

    ae(InputStream inputStream) {
        inputStream = new DataInputStream(inputStream);
        this.a = ((FilterInputStream)inputStream).read();
        this.c = ((FilterInputStream)inputStream).read();
        if (this.a != 101) {
            if (this.a != 0) {
                this.d = new byte[8];
                ((DataInputStream)inputStream).readFully(this.d, 0, this.d.length);
                if (this.a == 3) {
                    this.e = ((FilterInputStream)inputStream).read();
                    return;
                }
            }
        } else {
            ((FilterInputStream)inputStream).read();
            ((FilterInputStream)inputStream).read();
            ((FilterInputStream)inputStream).read();
            this.b = ((FilterInputStream)inputStream).read();
        }
    }

    public ae(int n2, byte[] byArray, int n3) {
        this.a = 3;
        this.c = n2;
        this.d = byArray;
        this.e = n3;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final byte[] d() {
        return this.d;
    }

    public final long e() {
        return 16 + (this.e & 0xF) << (this.e >> 4) + 6;
    }

    public final void a(g g2) {
        g2.write(this.a);
        g2.write(this.c);
        if (this.a != 101) {
            if (this.a != 0) {
                g2.write(this.d);
            }
            if (this.a == 3) {
                g2.write(this.e);
                return;
            }
        } else {
            g2.write(71);
            g2.write(78);
            g2.write(85);
            g2.write(this.b);
        }
    }
}

