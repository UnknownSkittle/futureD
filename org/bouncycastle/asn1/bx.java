/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.util.Enumeration;
import org.bouncycastle.asn1.bw;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;

final class bx
extends v {
    private byte[] b;

    bx(byte[] byArray) {
        this.b = byArray;
    }

    private void i() {
        bw bw2 = new bw(this.b);
        while (bw2.hasMoreElements()) {
            this.a.addElement(bw2.nextElement());
        }
        this.b = null;
    }

    public final synchronized f a(int n2) {
        if (this.b != null) {
            this.i();
        }
        return super.a(n2);
    }

    public final synchronized Enumeration c() {
        if (this.b == null) {
            return super.c();
        }
        return new bw(this.b);
    }

    public final synchronized int d() {
        if (this.b != null) {
            this.i();
        }
        return super.d();
    }

    final u f() {
        if (this.b != null) {
            this.i();
        }
        return super.f();
    }

    final u g() {
        if (this.b != null) {
            this.i();
        }
        return super.g();
    }

    final int e() {
        if (this.b != null) {
            return 1 + bz.a(this.b.length) + this.b.length;
        }
        return super.g().e();
    }

    final void a(r r2) {
        if (this.b != null) {
            r2.a(48, this.b);
            return;
        }
        super.g().a(r2);
    }
}

