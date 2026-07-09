/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.crypto.b.b;
import org.bouncycastle.crypto.p;

public final class l
extends b
implements p {
    public l() {
        this(128);
    }

    public l(int n2) {
        switch (n2) {
            case 128: 
            case 256: {
                break;
            }
            default: {
                throw new IllegalArgumentException("'bitLength' " + n2 + " not supported for SHAKE");
            }
        }
        super(n2);
    }

    public final String a() {
        return "SHAKE" + this.a;
    }

    public final int a(byte[] byArray, int n2) {
        return this.b(byArray, n2, this.b());
    }

    public final int b(byte[] byArray, int n2, int n3) {
        int n4 = this.c(byArray, n2, n3);
        this.c();
        return n4;
    }

    private int c(byte[] byArray, int n2, int n3) {
        if (!this.b) {
            this.a(15, 4);
        }
        this.a(byArray, n2, (long)n3 << 3);
        return n3;
    }
}

