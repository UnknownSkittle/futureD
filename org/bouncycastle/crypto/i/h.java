/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import org.bouncycastle.b.e;

public class h
implements e {
    private byte[] a;

    public h(byte[] byArray) {
        this(byArray, byArray.length);
    }

    private h(byte[] byArray, int n2) {
        this.a = new byte[n2];
        System.arraycopy(byArray, 0, this.a, 0, n2);
    }

    public final byte[] a() {
        return this.a;
    }
}

