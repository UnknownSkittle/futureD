/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.SecureRandom;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.b.a.s;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.e;
import org.bouncycastle.openpgp.b.o;

public final class r {
    private y a = new y(new b());
    private int b;
    private o c;
    private SecureRandom d;
    private int e = 96;

    public r(int n2, o o2) {
        this(n2, o2, 0);
    }

    private r(int n2, o o2, byte by2) {
        this.b = n2;
        this.c = o2;
        this.e = 96;
    }

    public final r a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    public final e a(char[] cArray) {
        if (this.d == null) {
            this.d = new SecureRandom();
        }
        r r2 = this;
        return new s(r2, r2.b, this.c, this.e, this.d, cArray);
    }

    static /* synthetic */ y a(r r2) {
        return r2.a;
    }
}

