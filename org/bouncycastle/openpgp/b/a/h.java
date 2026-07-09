/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.MessageDigest;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.i;
import org.bouncycastle.openpgp.b.o;

final class h
implements o {
    private /* synthetic */ int a;
    private /* synthetic */ i b;
    private /* synthetic */ MessageDigest c;
    private /* synthetic */ g d;

    h(g g2, int n2, i i2, MessageDigest messageDigest) {
        this.d = g2;
        this.a = n2;
        this.b = i2;
        this.c = messageDigest;
    }

    public final int a() {
        return this.a;
    }

    public final OutputStream b() {
        return this.b;
    }

    public final byte[] c() {
        return this.b.a();
    }
}

