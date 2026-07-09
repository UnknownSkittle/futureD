/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.m;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.r;

public final class t
extends r {
    public t(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        if (j2 != null) {
            m.b(this.b, this.c);
            if (d2 != null) {
                m.b(this.b, this.a.g());
            }
        }
        this.e = bl2;
    }

    t(d d2, j j2, j j3, j[] jArray, boolean bl2) {
        super(d2, j2, j3, jArray);
        this.e = bl2;
    }

    public final j h() {
        int n2 = this.d();
        switch (n2) {
            case 5: 
            case 6: {
                j j2;
                j j3 = this.b;
                j j4 = this.c;
                if (this.n() || j3.j()) {
                    return j4;
                }
                j3 = j4.a(j3).c(j3);
                if (6 == n2 && !(j2 = this.d[0]).i()) {
                    j3 = j3.d(j2);
                }
                return j3;
            }
        }
        return this.c;
    }

    protected final boolean q() {
        j j2 = this.i();
        if (j2.j()) {
            return false;
        }
        j j3 = this.j();
        switch (this.d()) {
            case 5: 
            case 6: {
                return j3.k() != j2.k();
            }
        }
        return j3.d(j2).k();
    }

    public final p b(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this;
        }
        d d2 = this.c();
        int n2 = d2.k();
        j j2 = this.b;
        j j3 = ((p)object).b;
        switch (n2) {
            case 0: {
                j j4 = this.c;
                j j5 = ((p)object).c;
                j j6 = j2.a(j3);
                object = j4.a(j5);
                if (j6.j()) {
                    if (((j)object).j()) {
                        return this.s();
                    }
                    return d2.e();
                }
                j j7 = ((j)object).d(j6);
                j j8 = j7.e().a(j7).a(j6).a(d2.g());
                j j9 = j7.c(j2.a(j8)).a(j8).a(j4);
                return new t(d2, j8, j9, this.e);
            }
            case 1: {
                j j10 = this.c;
                j j11 = this.d[0];
                j j12 = ((p)object).c;
                object = ((p)object).d[0];
                boolean bl2 = ((j)object).i();
                j j13 = j11.c(j12);
                j j14 = bl2 ? j10 : j10.c((j)object);
                j j15 = j13.a(j14);
                j j16 = j11.c(j3);
                j j17 = bl2 ? j2 : j2.c((j)object);
                j14 = j16.a(j17);
                if (j14.j()) {
                    if (j15.j()) {
                        return this.s();
                    }
                    return d2.e();
                }
                j17 = j14.e();
                j3 = j17.c(j14);
                j12 = bl2 ? j11 : j11.c((j)object);
                j13 = j15.a(j14);
                j16 = j13.b(j15, j17, d2.g()).c(j12).a(j3);
                j j18 = j14.c(j16);
                j j19 = bl2 ? j17 : j17.c((j)object);
                object = j15.b(j2, j14, j10).b(j19, j13, j16);
                j10 = j3.c(j12);
                return new t(d2, j18, (j)object, new j[]{j10}, this.e);
            }
            case 6: {
                if (j2.j()) {
                    if (j3.j()) {
                        return d2.e();
                    }
                    return ((p)object).b(this);
                }
                j j20 = this.c;
                j j21 = this.d[0];
                j j22 = ((p)object).c;
                object = ((p)object).d[0];
                boolean bl3 = j21.i();
                j j23 = j3;
                j j24 = j22;
                if (!bl3) {
                    j23 = j23.c(j21);
                    j24 = j24.c(j21);
                }
                boolean bl4 = ((j)object).i();
                Object object2 = j2;
                j j25 = j20;
                if (!bl4) {
                    object2 = ((j)object2).c((j)object);
                    j25 = j25.c((j)object);
                }
                j24 = j25.a(j24);
                j25 = ((j)object2).a(j23);
                if (j25.j()) {
                    if (j24.j()) {
                        return this.s();
                    }
                    return d2.e();
                }
                if (j3.j()) {
                    j j26;
                    object2 = this.m();
                    j2 = ((p)object2).g();
                    j j27 = ((p)object2).h();
                    object = j27.a(j26 = j22).d(j2);
                    j3 = ((j)object).e().a((j)object).a(j2).a(d2.g());
                    if (j3.j()) {
                        return new t(d2, j3, d2.h().g(), this.e);
                    }
                    j22 = ((j)object).c(j2.a(j3)).a(j3).a(j27).d(j3).a(j3);
                    j23 = d2.a(org.bouncycastle.math.ec.c.b);
                } else {
                    j j28;
                    j25 = j25.e();
                    j3 = ((j)(object2 = j24.c((j)object2))).c(j28 = j24.c(j23));
                    if (j3.j()) {
                        return new t(d2, j3, d2.h().g(), this.e);
                    }
                    j j29 = j24.c(j25);
                    if (!bl4) {
                        j29 = j29.c((j)object);
                    }
                    j22 = j28.a(j25).a(j29, j20.a(j21));
                    j23 = j29;
                    if (!bl3) {
                        j23 = j23.c(j21);
                    }
                }
                return new t(d2, j3, j22, new j[]{j23}, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        j j2 = this.b;
        if (j2.j()) {
            return d2.e();
        }
        switch (d2.k()) {
            case 0: {
                j j3 = this.c.d(j2).a(j2);
                j j4 = j3.e().a(j3).a(d2.g());
                j j5 = j2.a(j4, j3.c());
                return new t(d2, j4, j5, this.e);
            }
            case 1: {
                j j6 = this.c;
                j j7 = this.d[0];
                boolean bl2 = j7.i();
                j j8 = bl2 ? j2 : j2.c(j7);
                j j9 = bl2 ? j6 : j6.c(j7);
                j j10 = j2.e();
                j j11 = j10.a(j9);
                j j12 = j8;
                j j13 = j12.e();
                j j14 = j11.a(j12);
                j j15 = j14.b(j11, j13, d2.g());
                j2 = j12.c(j15);
                j6 = j10.e().b(j12, j15, j14);
                j7 = j12.c(j13);
                return new t(d2, j2, j6, new j[]{j7}, this.e);
            }
            case 6: {
                j j16 = this.c;
                j j17 = this.d[0];
                boolean bl3 = j17.i();
                j j18 = bl3 ? j16 : j16.c(j17);
                j j19 = bl3 ? j17 : j17.e();
                j j20 = d2.g();
                j j21 = bl3 ? j20 : j20.c(j19);
                j j22 = j16.e().a(j18).a(j21);
                if (j22.j()) {
                    return new t(d2, j22, d2.h().g(), this.e);
                }
                j j23 = j22.e();
                j j24 = bl3 ? j22 : j22.c(j19);
                j j25 = d2.h();
                if (j25.h() < d2.a() >> 1) {
                    j16 = j16.a(j2).e();
                    j17 = j25.i() ? j21.a(j19).e() : j21.a(j25, j19.e());
                    j2 = j16.a(j22).a(j19).c(j16).a(j17).a(j23);
                    if (j20.j()) {
                        j2 = j2.a(j24);
                    } else if (!j20.i()) {
                        j2 = j2.a(j20.c().c(j24));
                    }
                } else {
                    j2 = (bl3 ? j2 : j2.c(j17)).a(j22, j18).a(j23).a(j24);
                }
                return new t(d2, j23, j2, new j[]{j24}, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }

    public final p c(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this.s();
        }
        d d2 = this.c();
        j j2 = this.b;
        if (j2.j()) {
            return object;
        }
        switch (d2.k()) {
            case 6: {
                j j3 = ((p)object).b;
                j j4 = ((p)object).d[0];
                if (j3.j() || !j4.i()) {
                    return this.s().b((p)object);
                }
                j4 = this.c;
                j j5 = this.d[0];
                j j6 = ((p)object).c;
                j2 = j2.e();
                j j7 = j4.e();
                j j8 = j5.e();
                j4 = j4.c(j5);
                j4 = d2.g().c(j8).a(j7).a(j4);
                j5 = j6.c();
                j2 = d2.g().a(j5).c(j8).a(j7).b(j4, j2, j8);
                j6 = (j3 = j3.c(j8)).a(j4).e();
                if (j6.j()) {
                    if (j2.j()) {
                        return ((p)object).s();
                    }
                    return d2.e();
                }
                if (j2.j()) {
                    return new t(d2, j2, d2.h().g(), this.e);
                }
                object = j2.e().c(j3);
                j3 = j2.c(j6).c(j8);
                j2 = j2.a(j6).e().b(j4, j5, j3);
                return new t(d2, (j)object, j2, new j[]{j3}, this.e);
            }
        }
        return this.s().b((p)object);
    }

    public final p r() {
        if (this.n()) {
            return this;
        }
        j j2 = this.b;
        if (j2.j()) {
            return this;
        }
        switch (this.d()) {
            case 0: {
                j j3 = this.c;
                return new t(this.a, j2, j3.a(j2), this.e);
            }
            case 1: {
                j j4 = this.c;
                j j5 = this.d[0];
                return new t(this.a, j2, j4.a(j2), new j[]{j5}, this.e);
            }
            case 5: {
                j j6 = this.c;
                return new t(this.a, j2, j6.c(), this.e);
            }
            case 6: {
                j j7 = this.c;
                j j8 = this.d[0];
                return new t(this.a, j2, j7.a(j8), new j[]{j8}, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }
}

