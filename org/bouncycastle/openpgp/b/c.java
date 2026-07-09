/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import java.security.SecureRandom;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.am;
import org.bouncycastle.b.i;
import org.bouncycastle.math.b.a;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.b.q;

public abstract class c
extends a {
    private char[] a;
    private o b;
    private ae c;
    private SecureRandom d;
    private int e;

    protected c(char[] cArray, o o2) {
        this(cArray, o2, 0);
    }

    private c(char[] cArray, o o2, byte by2) {
        this.a = cArray;
        this.b = o2;
        this.e = 96;
    }

    public final byte[] a(int n2) {
        if (this.c == null) {
            byte[] byArray = new byte[8];
            if (this.d == null) {
                this.d = new SecureRandom();
            }
            this.d.nextBytes(byArray);
            this.c = new ae(this.b.a(), byArray, this.e);
        }
        return q.a(this.b, n2, this.c, this.a);
    }

    public final i a(int n2, byte[] byArray) {
        byte[] byArray2 = this.a(n2);
        if (byArray == null) {
            return new am(n2, this.c, null);
        }
        byte[] byArray3 = new byte[byArray.length - 2];
        System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
        return new am(n2, this.c, this.a(n2, byArray2, byArray3));
    }

    protected abstract byte[] a(int var1, byte[] var2, byte[] var3);
}

