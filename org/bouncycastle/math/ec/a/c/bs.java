/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bp;
import org.bouncycastle.math.ec.a.c.bt;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public final class bs
extends e {
    private bt h = new bt(this);

    public bs() {
        super(193, 15, 0, 0);
        this.a = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.b = this.a(new BigInteger(1, org.bouncycastle.e.a.f.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.c = new BigInteger(1, org.bouncycastle.e.a.f.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.d = BigInteger.valueOf(2L);
        this.e = 6;
    }

    protected final d c() {
        return new bs();
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
        return 193;
    }

    public final j a(BigInteger bigInteger) {
        return new bp(bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new bt((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new bt(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.h;
    }

    public final boolean n() {
        return false;
    }
}

