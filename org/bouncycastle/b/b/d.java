/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b.b;

import org.bouncycastle.b.ai;

public final class d
extends ai {
    public d(boolean bl2, boolean bl3, byte[] byArray) {
        super(16, bl2, bl3, byArray);
    }

    public d(long l2) {
        long l3 = l2;
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l3 >> 56);
        byArray2[1] = (byte)(l3 >> 48);
        byArray2[2] = (byte)(l3 >> 40);
        byArray2[3] = (byte)(l3 >> 32);
        byArray2[4] = (byte)(l3 >> 24);
        byArray2[5] = (byte)(l3 >> 16);
        byArray2[6] = (byte)(l3 >> 8);
        byArray2[7] = (byte)l3;
        super(16, false, false, byArray2);
    }

    public final long b() {
        return (long)(this.a[0] & 0xFF) << 56 | (long)(this.a[1] & 0xFF) << 48 | (long)(this.a[2] & 0xFF) << 40 | (long)(this.a[3] & 0xFF) << 32 | (long)(this.a[4] & 0xFF) << 24 | (long)((this.a[5] & 0xFF) << 16) | (long)((this.a[6] & 0xFF) << 8) | (long)(this.a[7] & 0xFF);
    }
}

