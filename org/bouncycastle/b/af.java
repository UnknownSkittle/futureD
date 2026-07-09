/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.aa;
import org.bouncycastle.b.ab;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.ag;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.e.b.a;

public class af
extends i {
    private aa a;
    private byte[] b;
    private int c;
    private int d;
    private ae e;
    private byte[] f;

    af(c c2) {
        this.a = this instanceof ag ? new ab(c2) : new aa(c2);
        this.c = c2.read();
        if (this.c == 255 || this.c == 254) {
            this.d = c2.read();
            this.e = new ae(c2);
        } else {
            this.d = this.c;
        }
        if ((this.e == null || this.e.a != 101 || this.e.b != 1) && this.c != 0) {
            this.f = this.d < 7 ? new byte[8] : new byte[16];
            c2.a(this.f, 0, this.f.length);
        }
        this.b = org.bouncycastle.e.b.a.a(c2);
    }

    public af(aa aa2, int n2, byte[] byArray) {
        this.a = aa2;
        this.d = n2;
        this.c = n2 != 0 ? 255 : 0;
        this.e = null;
        this.f = null;
        this.b = byArray;
    }

    public af(aa aa2, int n2, int n3, ae ae2, byte[] byArray, byte[] byArray2) {
        this.a = aa2;
        this.d = n2;
        this.c = n3;
        this.e = ae2;
        this.f = byArray;
        this.b = byArray2;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final byte[] c() {
        return this.f;
    }

    public final ae d() {
        return this.e;
    }

    public final aa e() {
        return this.a;
    }

    public final byte[] f() {
        return this.b;
    }

    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g2 = new g(byteArrayOutputStream);
        g2.write(this.a.e());
        g2.write(this.c);
        if (this.c == 255 || this.c == 254) {
            g2.write(this.d);
            ae ae2 = this.e;
            g g3 = g2;
            ((f)ae2).a(g3);
        }
        if (this.f != null) {
            g2.write(this.f);
        }
        if (this.b != null && this.b.length > 0) {
            g2.write(this.b);
        }
        g2.close();
        return byteArrayOutputStream.toByteArray();
    }

    public void a(g g2) {
        g2.a(5, this.g(), true);
    }
}

