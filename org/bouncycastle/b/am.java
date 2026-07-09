/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.e.b.a;

public final class am
extends i {
    private int a;
    private int b;
    private ae c;
    private byte[] d;

    public am(c c2) {
        this.a = c2.read();
        this.b = c2.read();
        this.c = new ae(c2);
        this.d = org.bouncycastle.e.b.a.a(c2);
    }

    public am(int n2, ae ae2, byte[] byArray) {
        this.a = 4;
        this.b = n2;
        this.c = ae2;
        this.d = byArray;
    }

    public final int a() {
        return this.b;
    }

    public final ae b() {
        return this.c;
    }

    public final byte[] c() {
        return this.d;
    }

    public final void a(g g2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g3 = new g(byteArrayOutputStream);
        g3.write(this.a);
        g3.write(this.b);
        ae ae2 = this.c;
        g g4 = g3;
        ((f)ae2).a(g4);
        if (this.d != null && this.d.length > 0) {
            g3.write(this.d);
        }
        g3.close();
        g2.a(3, byteArrayOutputStream.toByteArray(), true);
    }
}

