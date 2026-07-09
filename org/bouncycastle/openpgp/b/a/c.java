/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.b.a.ac;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.f;
import org.bouncycastle.openpgp.b.o;

final class c
implements f {
    private /* synthetic */ int a;
    private /* synthetic */ long b;
    private /* synthetic */ Signature c;
    private /* synthetic */ o d;
    private /* synthetic */ b e;

    c(b b2, int n2, long l2, Signature signature, o o2) {
        this.e = b2;
        this.a = n2;
        this.b = l2;
        this.c = signature;
        this.d = o2;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return org.bouncycastle.openpgp.b.a.b.a(this.e);
    }

    public final int f() {
        return org.bouncycastle.openpgp.b.a.b.b(this.e);
    }

    public final long g() {
        return this.b;
    }

    public final OutputStream a() {
        return new org.bouncycastle.e.b.c(new ac(this.c), this.d.b());
    }

    public final byte[] b() {
        try {
            return this.c.sign();
        } catch (SignatureException signatureException) {
            throw new af("Unable to create signature: " + signatureException.getMessage(), signatureException);
        }
    }

    public final byte[] c() {
        return this.d.c();
    }
}

