/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;

public abstract class s
extends p {
    protected s(d d2, j j2, j j3) {
        super(d2, j2, j3);
    }

    protected s(d d2, j j2, j j3, j[] jArray) {
        super(d2, j2, j3, jArray);
    }

    protected final boolean q() {
        return this.f().k();
    }

    protected final boolean a() {
        j j2;
        j j3 = this.b;
        j j4 = this.c;
        j j5 = this.a.g();
        j j6 = this.a.h();
        j4 = j4.e();
        switch (this.d()) {
            case 0: {
                break;
            }
            case 1: {
                j2 = this.d[0];
                if (j2.i()) break;
                j j7 = j2.e();
                j j8 = j2.c(j7);
                j4 = j4.c(j2);
                j5 = j5.c(j7);
                j6 = j6.c(j8);
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                j2 = this.d[0];
                if (j2.i()) break;
                j j9 = j2.e();
                j j10 = j9.e();
                j2 = j9.c(j10);
                j5 = j5.c(j10);
                j6 = j6.c(j2);
                break;
            }
            default: {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
        j2 = j3.e().a(j5).c(j3).a(j6);
        return j4.equals(j2);
    }
}

