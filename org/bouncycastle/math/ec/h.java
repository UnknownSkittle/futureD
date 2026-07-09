/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ai;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.m;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.t;

public final class h
extends e {
    private int h;
    private int i;
    private int j;
    private int k;
    private t l;

    public h(int n2, int n3, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(n2, n3, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public h(int n2, int n3, int n4, int n5, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(n2, n3, n4, n5);
        this.h = n2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
        this.c = bigInteger3;
        this.d = bigInteger4;
        this.l = new t((d)this, null, null, false);
        this.a = this.a(bigInteger);
        this.b = this.a(bigInteger2);
        this.e = 6;
    }

    private h(int n2, int n3, int n4, int n5, j j2, j j3, BigInteger bigInteger, BigInteger bigInteger2) {
        super(n2, n3, n4, n5);
        this.h = n2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
        this.c = bigInteger;
        this.d = bigInteger2;
        this.l = new t((d)this, null, null, false);
        this.a = j2;
        this.b = j3;
        this.e = 6;
    }

    protected final d c() {
        return new h(this.h, this.i, this.j, this.k, this.a, this.b, this.c, this.d);
    }

    public final boolean a(int n2) {
        switch (n2) {
            case 0: 
            case 1: 
            case 6: {
                return true;
            }
        }
        return false;
    }

    protected final o d() {
        if (this.n()) {
            return new ai();
        }
        return super.d();
    }

    public final int a() {
        return this.h;
    }

    public final j a(BigInteger bigInteger) {
        return new m(this.h, this.i, this.j, this.k, bigInteger);
    }

    protected final p a(j j2, j j3, boolean bl2) {
        return new t((d)this, j2, j3, bl2);
    }

    protected final p a(j j2, j j3, j[] jArray, boolean bl2) {
        return new t(this, j2, j3, jArray, bl2);
    }

    public final p e() {
        return this.l;
    }
}

