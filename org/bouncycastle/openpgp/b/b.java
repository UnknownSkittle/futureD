/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import org.bouncycastle.b.ae;
import org.bouncycastle.openpgp.b.l;
import org.bouncycastle.openpgp.b.p;
import org.bouncycastle.openpgp.b.q;

public abstract class b
implements l {
    private char[] a;
    private p b;

    protected b(char[] cArray, p p2) {
        this.a = cArray;
        this.b = p2;
    }

    public final byte[] a(int n2, ae ae2) {
        return q.a(this.b, n2, ae2, this.a);
    }

    public abstract byte[] a(int var1, byte[] var2, byte[] var3);
}

