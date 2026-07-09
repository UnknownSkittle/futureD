/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bb;
import org.bouncycastle.math.ec.a.c.bd;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class bc
extends e {
    private bd h = new bd(this);

    public bc() {
        super(131, 2, 3, 8);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0217C05610884B63B9C6C7291678F9D341")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("0400000000000000023123953A9464B54D"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new bc();
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return 131;
    }

    public final j a(BigInteger bigInteger) {
        return new bb(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new bd((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bd(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

