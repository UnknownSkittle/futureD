/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.v;
import org.bouncycastle.e.a;

public final class z
extends i {
    private int a;
    private long b;
    private int c;
    private byte[][] d;

    z(c c2) {
        this.a = c2.read();
        this.b |= (long)c2.read() << 56;
        this.b |= (long)c2.read() << 48;
        this.b |= (long)c2.read() << 40;
        this.b |= (long)c2.read() << 32;
        this.b |= (long)c2.read() << 24;
        this.b |= (long)c2.read() << 16;
        this.b |= (long)c2.read() << 8;
        this.b |= (long)c2.read();
        this.c = c2.read();
        switch (this.c) {
            case 1: 
            case 2: {
                this.d = new byte[1][];
                this.d[0] = new v(c2).a();
                return;
            }
            case 16: 
            case 20: {
                this.d = new byte[2][];
                this.d[0] = new v(c2).a();
                this.d[1] = new v(c2).a();
                return;
            }
            case 18: {
                this.d = new byte[1][];
                this.d[0] = org.bouncycastle.e.b.a.a(c2);
                return;
            }
        }
        throw new IOException("unknown PGP public key algorithm encountered");
    }

    public z(long l2, int n2, byte[][] byArray) {
        this.a = 3;
        this.b = l2;
        this.c = n2;
        this.d = new byte[byArray.length][];
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            this.d[i2] = org.bouncycastle.e.a.d(byArray[i2]);
        }
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final byte[][] c() {
        return this.d;
    }

    public final void a(g g2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g3 = new g(byteArrayOutputStream);
        g3.write(this.a);
        g3.write((byte)(this.b >> 56));
        g3.write((byte)(this.b >> 48));
        g3.write((byte)(this.b >> 40));
        g3.write((byte)(this.b >> 32));
        g3.write((byte)(this.b >> 24));
        g3.write((byte)(this.b >> 16));
        g3.write((byte)(this.b >> 8));
        g3.write((byte)this.b);
        g3.write(this.c);
        for (int i2 = 0; i2 != this.d.length; ++i2) {
            g3.write(this.d[i2]);
        }
        g3.close();
        g2.a(1, byteArrayOutputStream.toByteArray(), true);
    }
}

