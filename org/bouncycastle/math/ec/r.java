/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;
import org.bouncycastle.math.ec.p;

public abstract class r
extends p {
    protected r(d d2, j j2, j j3) {
        super(d2, j2, j3);
    }

    protected r(d d2, j j2, j j3, j[] jArray) {
        super(d2, j2, j3, jArray);
    }

    protected final boolean a() {
        d d2 = this.c();
        j j2 = this.b;
        j j3 = d2.g();
        j j4 = d2.h();
        int n2 = d2.k();
        if (n2 == 6) {
            j j5;
            j j6 = this.d[0];
            boolean bl2 = j6.i();
            if (j2.j()) {
                j j7 = this.c.e();
                j j8 = j4;
                if (!bl2) {
                    j8 = j8.c(j6.e());
                }
                return j7.equals(j8);
            }
            j j9 = this.c;
            j j10 = j2.e();
            if (bl2) {
                j5 = j9.e().a(j9).a(j3);
                j9 = j10.e().a(j4);
            } else {
                j2 = j6.e();
                j j11 = j2.e();
                j5 = j9.a(j6).b(j9, j3, j2);
                j9 = j10.a(j4, j11);
            }
            return j5.c(j10).equals(j9);
        }
        j j12 = this.c;
        j j13 = j12.a(j2).c(j12);
        switch (n2) {
            case 0: {
                break;
            }
            case 1: {
                j j14 = this.d[0];
                if (j14.i()) break;
                j j15 = j14.e();
                j j16 = j14.c(j15);
                j13 = j13.c(j14);
                j3 = j3.c(j14);
                j4 = j4.c(j16);
                break;
            }
            default: {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
        j j17 = j2.a(j3).c(j2.e()).a(j4);
        return j13.equals(j17);
    }

    protected final boolean b() {
        Object object = this.a.j();
        if (org.bouncycastle.math.ec.c.c.equals(object)) {
            return ((k)this.m().e().a(this.a.g())).m() == 0;
        }
        if (org.bouncycastle.math.ec.c.e.equals(object)) {
            object = this.m();
            j j2 = ((p)object).e();
            j j3 = ((e)this.a).a(j2.a(this.a.g()));
            if (j3 == null) {
                return false;
            }
            object = j2.c(j3).a(((p)object).f()).a(this.a.g());
            return ((k)object).m() == 0 || ((k)((j)object).a(j2)).m() == 0;
        }
        return super.b();
    }

    public final p b(j j2) {
        if (this.n()) {
            return this;
        }
        switch (this.d()) {
            case 5: {
                j j3 = this.i();
                j j4 = this.j();
                j j5 = j3.c(j2);
                j j6 = j4.a(j3).d(j2).a(j5);
                return this.c().a(j3, j6, this.k(), this.e);
            }
            case 6: {
                j j7 = this.i();
                j j8 = this.j();
                j j9 = this.k()[0];
                j j10 = j7.c(j2.e());
                j7 = j8.a(j7).a(j10);
                j2 = j9.c(j2);
                return this.c().a(j10, j7, new j[]{j2}, this.e);
            }
        }
        return super.b(j2);
    }

    public final p c(j j2) {
        if (this.n()) {
            return this;
        }
        switch (this.d()) {
            case 5: 
            case 6: {
                j j3 = this.i();
                j2 = this.j().a(j3).c(j2).a(j3);
                return this.c().a(j3, j2, this.k(), this.e);
            }
        }
        return super.c(j2);
    }

    public final r c(int n2) {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        int n3 = d2.k();
        j j2 = this.b;
        switch (n3) {
            case 0: 
            case 5: {
                j j3 = this.c;
                return (r)d2.a(j2.a(n2), j3.a(n2), this.e);
            }
            case 1: 
            case 6: {
                j j4 = this.c;
                j j5 = this.d[0];
                return (r)d2.a(j2.a(n2), j4.a(n2), new j[]{j5.a(n2)}, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }
}

