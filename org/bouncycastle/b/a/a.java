/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b.a;

import org.bouncycastle.b.ap;

public final class a
extends ap {
    private int a;
    private int b;
    private int c;
    private byte[] d;

    public a(boolean bl2, byte[] byArray) {
        super(1, bl2, byArray);
        this.a = (byArray[1] & 0xFF) << 8 | byArray[0] & 0xFF;
        this.b = byArray[2] & 0xFF;
        this.c = byArray[3] & 0xFF;
        this.d = new byte[byArray.length - this.a];
        System.arraycopy(byArray, this.a, this.d, 0, this.d.length);
    }
}

