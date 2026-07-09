/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;

public final class y
extends i {
    private int a;
    private int b;
    private int c;
    private int d;
    private long e;
    private int f;

    y(c c2) {
        this.a = c2.read();
        this.b = c2.read();
        this.c = c2.read();
        this.d = c2.read();
        this.e |= (long)c2.read() << 56;
        this.e |= (long)c2.read() << 48;
        this.e |= (long)c2.read() << 40;
        this.e |= (long)c2.read() << 32;
        this.e |= (long)c2.read() << 24;
        this.e |= (long)c2.read() << 16;
        this.e |= (long)c2.read() << 8;
        this.e |= (long)c2.read();
        this.f = c2.read();
    }

    public y(int n2, int n3, int n4, long l2) {
        this.a = 3;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = l2;
        this.f = 1;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final void a(g g2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g3 = new g(byteArrayOutputStream);
        g3.write(this.a);
        g3.write(this.b);
        g3.write(this.c);
        g3.write(this.d);
        g3.write((byte)(this.e >> 56));
        g3.write((byte)(this.e >> 48));
        g3.write((byte)(this.e >> 40));
        g3.write((byte)(this.e >> 32));
        g3.write((byte)(this.e >> 24));
        g3.write((byte)(this.e >> 16));
        g3.write((byte)(this.e >> 8));
        g3.write((byte)this.e);
        g3.write(this.f);
        g3.close();
        g2.a(4, byteArrayOutputStream.toByteArray(), true);
    }
}

