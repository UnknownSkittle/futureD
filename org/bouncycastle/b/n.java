/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.u;
import org.bouncycastle.b.c;
import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.v;
import org.bouncycastle.math.ec.p;

public abstract class n
extends f
implements e {
    private org.bouncycastle.asn1.n a;
    private BigInteger b;

    protected n(c c2) {
        c c3 = c2;
        int n2 = c3.read();
        if (n2 == 0 || n2 == 255) {
            throw new IOException("future extensions not yet implemented.");
        }
        byte[] byArray = new byte[n2 + 2];
        c3.a(byArray, 2, byArray.length - 2);
        byArray[0] = 6;
        byArray[1] = (byte)n2;
        this.a = org.bouncycastle.asn1.n.a(u.b(byArray));
        this.b = new v((c)c2).a;
    }

    protected n(org.bouncycastle.asn1.n n2, p p2) {
        this.b = new BigInteger(1, p2.p());
        this.a = n2;
    }

    public final byte[] a() {
        try {
            return super.a();
        } catch (IOException iOException) {
            return null;
        }
    }

    public void a(g g2) {
        byte[] byArray = this.a.j();
        g2.write(byArray, 1, byArray.length - 1);
        ((f)new v(this.b)).a(g2);
    }

    public final BigInteger d() {
        return this.b;
    }

    public final org.bouncycastle.asn1.n e() {
        return this.a;
    }
}

