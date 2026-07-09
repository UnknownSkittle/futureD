/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import java.security.SecureRandom;
import org.bouncycastle.b.ae;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.b.q;

public abstract class e {
    protected int a;
    private char[] c;
    private o d;
    private int e;
    private ae f;
    protected SecureRandom b;

    protected e(int n2, o o2, int n3, SecureRandom secureRandom, char[] cArray) {
        this.a = n2;
        this.c = cArray;
        this.b = secureRandom;
        this.d = o2;
        if (n3 < 0 || n3 > 255) {
            throw new IllegalArgumentException("s2kCount value outside of range 0 to 255.");
        }
        this.e = n3;
    }

    public final int a() {
        return this.a;
    }

    public final ae b() {
        return this.f;
    }

    public final byte[] a(byte[] byArray, int n2) {
        Object object;
        if (this.f == null) {
            object = new byte[8];
            this.b.nextBytes((byte[])object);
            this.f = new ae(this.d.a(), (byte[])object, this.e);
        }
        e e2 = this;
        object = e2;
        return e2.a(q.a(e2.d, object.a, object.f, object.c), byArray, n2);
    }

    public abstract byte[] a(byte[] var1, byte[] var2, int var3);

    public abstract byte[] c();
}

