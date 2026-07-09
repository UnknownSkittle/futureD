/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.e;

import org.bouncycastle.b.e;
import org.bouncycastle.crypto.e.a;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.i.h;
import org.bouncycastle.crypto.n;

public final class b
extends a {
    private int[] a = null;
    private int[] b = null;
    private int[] c = null;
    private boolean d;

    public final void a(boolean bl2, e object) {
        if (!(object instanceof h)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + object.getClass().getName());
        }
        byte[] byArray = ((h)object).a();
        object = byArray;
        if (byArray.length != 24 && ((Object)object).length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.d = bl2;
        byte[] byArray2 = new byte[8];
        System.arraycopy(object, 0, byArray2, 0, 8);
        this.a = org.bouncycastle.crypto.e.b.a(bl2, byArray2);
        byArray2 = new byte[8];
        System.arraycopy(object, 8, byArray2, 0, 8);
        this.b = org.bouncycastle.crypto.e.b.a(!bl2, byArray2);
        if (((Object)object).length == 24) {
            byArray2 = new byte[8];
            System.arraycopy(object, 16, byArray2, 0, 8);
            this.c = org.bouncycastle.crypto.e.b.a(bl2, byArray2);
            return;
        }
        this.c = this.a;
    }

    public final int a() {
        return 8;
    }

    public final int a(byte[] byArray, int n2, byte[] byArray2, int n3) {
        if (this.a == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (n2 + 8 > byArray.length) {
            throw new i("input buffer too short");
        }
        if (n3 + 8 > byArray2.length) {
            throw new n("output buffer too short");
        }
        byte[] byArray3 = new byte[8];
        if (this.d) {
            org.bouncycastle.crypto.e.b.a(this.a, byArray, n2, byArray3, 0);
            org.bouncycastle.crypto.e.b.a(this.b, byArray3, 0, byArray3, 0);
            org.bouncycastle.crypto.e.b.a(this.c, byArray3, 0, byArray2, n3);
        } else {
            org.bouncycastle.crypto.e.b.a(this.c, byArray, n2, byArray3, 0);
            org.bouncycastle.crypto.e.b.a(this.b, byArray3, 0, byArray3, 0);
            org.bouncycastle.crypto.e.b.a(this.a, byArray3, 0, byArray2, n3);
        }
        return 8;
    }

    public final void b() {
    }
}

