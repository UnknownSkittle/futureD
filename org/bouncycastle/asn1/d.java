/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;

public final class d
extends u {
    private static final byte[] a = new byte[]{-1};
    private static final byte[] b = new byte[]{0};
    private final byte[] c;
    private static d d = new d(false);
    private static d e = new d(true);

    private d(byte[] byArray) {
        if (byArray.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (byArray[0] == 0) {
            this.c = b;
            return;
        }
        if ((byArray[0] & 0xFF) == 255) {
            this.c = a;
            return;
        }
        this.c = org.bouncycastle.e.a.d(byArray);
    }

    private d(boolean bl2) {
        this.c = bl2 ? a : b;
    }

    public final boolean b() {
        return this.c[0] != 0;
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 3;
    }

    final void a(r r2) {
        r2.a(1, this.c);
    }

    protected final boolean a(u u2) {
        if (u2 instanceof d) {
            return this.c[0] == ((d)u2).c[0];
        }
        return false;
    }

    public final int hashCode() {
        return this.c[0];
    }

    public final String toString() {
        if (this.c[0] != 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    static d a(byte[] byArray) {
        if (byArray.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        if (byArray[0] == 0) {
            return d;
        }
        if ((byArray[0] & 0xFF) == 255) {
            return e;
        }
        return new d(byArray);
    }
}

