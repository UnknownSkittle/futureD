/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b.b;

import java.util.Date;
import org.bouncycastle.b.ai;

public final class k
extends ai {
    public k(boolean bl2, boolean bl3, byte[] byArray) {
        super(2, bl2, bl3, byArray);
    }

    public k(Date object) {
        Date date = object;
        object = new byte[4];
        long l2 = date.getTime() / 1000L;
        object[0] = (byte)(l2 >> 24);
        object[1] = (byte)(l2 >> 16);
        object[2] = (byte)(l2 >> 8);
        object[3] = (byte)l2;
        super(2, false, false, (byte[])object);
    }

    public final Date b() {
        long l2 = (long)(this.a[0] & 0xFF) << 24 | (long)((this.a[1] & 0xFF) << 16) | (long)((this.a[2] & 0xFF) << 8) | (long)(this.a[3] & 0xFF);
        return new Date(l2 * 1000L);
    }
}

