/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.n;
import org.bouncycastle.math.ec.p;

public final class l
extends n {
    private byte a;
    private byte b;
    private byte c;

    public l(c c2) {
        super(c2);
        int n2 = c2.read();
        byte[] byArray = new byte[n2];
        if (n2 != 3) {
            throw new IllegalStateException("kdf parameters size of 3 expected.");
        }
        c2.a(byArray);
        this.a = byArray[0];
        this.b = byArray[1];
        this.c = byArray[2];
        this.f();
        this.g();
    }

    public l(org.bouncycastle.asn1.n n2, p p2, int n3, int n4) {
        super(n2, p2);
        this.a = 1;
        this.b = (byte)n3;
        this.c = (byte)n4;
        this.f();
        this.g();
    }

    public final byte b() {
        return this.b;
    }

    public final byte c() {
        return this.c;
    }

    public final void a(g g2) {
        super.a(g2);
        g2.write(3);
        g2.write(this.a);
        g2.write(this.b);
        g2.write(this.c);
    }

    private void f() {
        switch (this.b) {
            case 8: 
            case 9: 
            case 10: {
                return;
            }
        }
        throw new IllegalStateException("Hash algorithm must be SHA-256 or stronger.");
    }

    private void g() {
        switch (this.c) {
            case 7: 
            case 8: 
            case 9: {
                return;
            }
        }
        throw new IllegalStateException("Symmetric key algorithm must be AES-128 or stronger.");
    }
}

