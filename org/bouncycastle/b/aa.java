/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.c;
import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.j;
import org.bouncycastle.b.l;
import org.bouncycastle.b.m;
import org.bouncycastle.b.p;
import org.bouncycastle.b.q;

public class aa
extends i {
    private int a;
    private long b;
    private int c;
    private int d;
    private e e;

    aa(c c2) {
        this.a = c2.read();
        this.b = (long)c2.read() << 24 | (long)(c2.read() << 16) | (long)(c2.read() << 8) | (long)c2.read();
        if (this.a <= 3) {
            this.c = c2.read() << 8 | c2.read();
        }
        this.d = (byte)c2.read();
        switch (this.d) {
            case 1: 
            case 2: 
            case 3: {
                this.e = new ac(c2);
                return;
            }
            case 17: {
                this.e = new j(c2);
                return;
            }
            case 16: 
            case 20: {
                this.e = new q(c2);
                return;
            }
            case 18: {
                this.e = new l(c2);
                return;
            }
            case 19: {
                this.e = new m(c2);
                return;
            }
            case 22: {
                this.e = new p(c2);
                return;
            }
        }
        throw new IOException("unknown PGP public key algorithm encountered: " + this.d);
    }

    public aa(int n2, Date date, e e2) {
        this.a = 4;
        this.b = date.getTime() / 1000L;
        this.d = n2;
        this.e = e2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    public final Date c() {
        return new Date(this.b * 1000L);
    }

    public final e d() {
        return this.e;
    }

    public final byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g2 = new g(byteArrayOutputStream);
        g2.write(this.a);
        g2.write((byte)(this.b >> 24));
        g2.write((byte)(this.b >> 16));
        g2.write((byte)(this.b >> 8));
        g2.write((byte)this.b);
        if (this.a <= 3) {
            g2.write((byte)(this.c >> 8));
            g2.write((byte)this.c);
        }
        g2.write(this.d);
        f f2 = (f)((Object)this.e);
        g g3 = g2;
        f2.a(g3);
        g2.close();
        return byteArrayOutputStream.toByteArray();
    }

    public void a(g g2) {
        g2.a(6, this.e(), true);
    }
}

