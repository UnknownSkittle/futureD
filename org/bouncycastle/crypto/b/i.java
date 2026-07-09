/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.crypto.b.b;

public final class i
extends b {
    public i() {
        this(256);
    }

    public i(int n2) {
        switch (n2) {
            case 224: 
            case 256: 
            case 384: 
            case 512: {
                break;
            }
            default: {
                throw new IllegalArgumentException("'bitLength' " + n2 + " not supported for SHA-3");
            }
        }
        super(n2);
    }

    public final String a() {
        return "SHA3-" + this.a;
    }

    public final int a(byte[] byArray, int n2) {
        this.a(2, 2);
        return super.a(byArray, n2);
    }
}

