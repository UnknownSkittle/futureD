/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.s;

public final class u
extends s {
    public u(d d2, j j2, j j3, boolean bl2) {
        super(d2, j2, j3);
        if (j2 == null != (j3 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = bl2;
    }

    u(d d2, j j2, j j3, j[] jArray, boolean bl2) {
        super(d2, j2, j3, jArray);
        this.e = bl2;
    }

    public final j a(int n2) {
        if (n2 == 1 && 4 == this.d()) {
            return this.u();
        }
        return super.a(n2);
    }

    public final p b(p object) {
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this;
        }
        if (this == object) {
            return this.s();
        }
        d d2 = this.c();
        int n2 = d2.k();
        j j2 = this.b;
        j j3 = this.c;
        j j4 = ((p)object).b;
        j j5 = ((p)object).c;
        switch (n2) {
            case 0: {
                j j6 = j4.b(j2);
                object = j5.b(j3);
                if (j6.j()) {
                    if (((j)object).j()) {
                        return this.s();
                    }
                    return d2.e();
                }
                j j7 = ((j)object).d(j6);
                j j8 = j7.e().b(j2).b(j4);
                j5 = j7.c(j2.b(j8)).b(j3);
                return new u(d2, j8, j5, this.e);
            }
            case 1: {
                j j9 = this.d[0];
                object = ((p)object).d[0];
                boolean bl2 = j9.i();
                boolean bl3 = ((j)object).i();
                j5 = bl2 ? j5 : j5.c(j9);
                j3 = bl3 ? j3 : j3.c((j)object);
                j j10 = j5.b(j3);
                j j11 = bl2 ? j4 : j4.c(j9);
                j j12 = bl3 ? j2 : j2.c((j)object);
                j5 = j11.b(j12);
                if (j5.j()) {
                    if (j10.j()) {
                        return this.s();
                    }
                    return d2.e();
                }
                Object object2 = bl2 ? object : (bl3 ? j9 : j9.c((j)object));
                j4 = j5.e();
                j2 = j4.c(j5);
                j j13 = j4 = j4.c(j12);
                j11 = j10.e().c((j)object2).b(j2).b(j13.a(j13));
                j5 = j5.c(j11);
                j12 = j4.b(j11).a(j10, j3, j2);
                j3 = j2.c((j)object2);
                return new u(d2, j5, j12, new j[]{j3}, this.e);
            }
            case 2: 
            case 4: {
                j j14;
                j j15;
                j[] jArray;
                j j16 = this.d[0];
                object = ((p)object).d[0];
                boolean bl4 = j16.i();
                j j17 = null;
                if (!bl4 && j16.equals(object)) {
                    jArray = j2.b(j4);
                    j15 = j3.b(j5);
                    if (jArray.j()) {
                        if (j15.j()) {
                            return this.s();
                        }
                        return d2.e();
                    }
                    j5 = jArray.e();
                    j j18 = j2.c(j5);
                    j4 = j4.c(j5);
                    j2 = j18.b(j4).c(j3);
                    j14 = j15.e().b(j18).b(j4);
                    j5 = j18.b(j14).c(j15).b(j2);
                    j3 = jArray.c(j16);
                } else {
                    if (bl4) {
                        j15 = j4;
                    } else {
                        jArray = j16.e();
                        j15 = jArray.c(j4);
                        j5 = jArray.c(j16).c(j5);
                    }
                    boolean bl5 = ((j)object).i();
                    if (bl5) {
                        j4 = j3;
                    } else {
                        j4 = ((j)object).e();
                        j2 = j4.c(j2);
                        j4 = j4.c((j)object).c(j3);
                    }
                    jArray = j2.b(j15);
                    j5 = j4.b(j5);
                    if (jArray.j()) {
                        if (j5.j()) {
                            return this.s();
                        }
                        return d2.e();
                    }
                    j15 = jArray.e();
                    j3 = j15.c((j)jArray);
                    j j19 = j2 = j15.c(j2);
                    j14 = j5.e().a(j3).b(j19.a(j19));
                    j5 = j2.b(j14).a(j5, j3, j4);
                    j3 = jArray;
                    if (!bl4) {
                        j3 = j3.c(j16);
                    }
                    if (!bl5) {
                        j3 = j3.c((j)object);
                    }
                    if (j3 == jArray) {
                        j17 = j15;
                    }
                }
                if (n2 == 4) {
                    j15 = this.a(j3, j17);
                    jArray = new j[]{j3, j15};
                } else {
                    jArray = new j[]{j3};
                }
                return new u(d2, j14, j5, jArray, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }

    public final p s() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        j j2 = this.c;
        if (j2.j()) {
            return d2.e();
        }
        int n2 = d2.k();
        j j3 = this.b;
        switch (n2) {
            case 0: {
                j j4 = j2;
                j j5 = u.d(j3.e()).a(this.c().g()).d(j4.a(j4));
                j j6 = j3;
                j j7 = j5.e().b(j6.a(j6));
                j j8 = j5.c(j3.b(j7)).b(j2);
                return new u(d2, j7, j8, this.e);
            }
            case 1: {
                j j9;
                j j10;
                j j11 = this.d[0];
                boolean bl2 = j11.i();
                j j12 = d2.g();
                if (!j12.j() && !bl2) {
                    j12 = j12.c(j11.e());
                }
                j12 = j12.a(u.d(j3.e()));
                j j13 = bl2 ? j2 : j2.c(j11);
                j j14 = bl2 ? j2.e() : j13.c(j2);
                j j15 = j3.c(j14);
                j j16 = j15.a(j15);
                j j17 = j10 = j16.a(j16);
                j3 = j12.e().b(j17.a(j17));
                j j18 = j13;
                j j19 = j18.a(j18);
                j j20 = j3.c(j19);
                j j21 = j14;
                j j22 = j21.a(j21);
                j j23 = j22.e();
                j2 = j10.b(j3).c(j12).b(j23.a(j23));
                if (bl2) {
                    j j24 = j22;
                    j9 = j24.a(j24);
                } else {
                    j9 = j19.e();
                }
                j11 = j9.a(j9).c(j13);
                return new u(d2, j20, j2, new j[]{j11}, this.e);
            }
            case 2: {
                j j25;
                j j26;
                j j27 = this.d[0];
                boolean bl3 = j27.i();
                j j28 = j2.e();
                j j29 = j28.e();
                j j30 = d2.g();
                j j31 = j30.d();
                if (j31.a().equals(BigInteger.valueOf(3L))) {
                    j31 = bl3 ? j27 : j27.e();
                    j26 = u.d(j3.a(j31).c(j3.b(j31)));
                    j j32 = j28.c(j3);
                    j j33 = j32.a(j32);
                    j3 = j33.a(j33);
                } else {
                    j26 = u.d(j3.e());
                    if (bl3) {
                        j26 = j26.a(j30);
                    } else if (!j30.j()) {
                        j25 = j27.e().e();
                        j26 = j31.h() < j30.h() ? j26.b(j25.c(j31)) : j26.a(j25.c(j30));
                    }
                    j j34 = j3.c(j28);
                    j j35 = j34.a(j34);
                    j3 = j35.a(j35);
                }
                j j36 = j3;
                j31 = j26.e().b(j36.a(j36));
                j j37 = j3.b(j31).c(j26).b(u.f(j29));
                j j38 = j2;
                j25 = j38.a(j38);
                if (!bl3) {
                    j25 = j25.c(j27);
                }
                return new u(d2, j31, j37, new j[]{j25}, this.e);
            }
            case 4: {
                return this.c(true);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }

    public final p c(p object) {
        if (this == object) {
            return this.t();
        }
        if (this.n()) {
            return object;
        }
        if (((p)object).n()) {
            return this.s();
        }
        j j2 = this.c;
        if (j2.j()) {
            return object;
        }
        d d2 = this.c();
        switch (d2.k()) {
            case 0: {
                j j3 = this.b;
                j j4 = ((p)object).b;
                object = ((p)object).c;
                j j5 = j4.b(j3);
                object = ((j)object).b(j2);
                if (j5.j()) {
                    if (((j)object).j()) {
                        return this.t();
                    }
                    return this;
                }
                j j6 = j5.e();
                j j7 = ((j)object).e();
                j j8 = j3;
                j7 = j6.c(j8.a(j8).a(j4)).b(j7);
                if (j7.j()) {
                    return d2.e();
                }
                j j9 = j7.c(j5).f();
                object = j7.c(j9).c((j)object);
                j j10 = j2;
                j5 = j10.a(j10).c(j6).c(j5).c(j9).b((j)object);
                object = j5.b((j)object).c(((j)object).a(j5)).a(j4);
                j2 = j3.b((j)object).c(j5).b(j2);
                return new u(d2, (j)object, j2, this.e);
            }
            case 4: {
                return this.c(false).b((p)object);
            }
        }
        return this.s().b((p)object);
    }

    public final p t() {
        if (this.n()) {
            return this;
        }
        j j2 = this.c;
        if (j2.j()) {
            return this;
        }
        d d2 = this.c();
        switch (d2.k()) {
            case 0: {
                j j3 = this.b;
                j j4 = j2;
                j j5 = j4.a(j4);
                j j6 = j5.e();
                j j7 = u.d(j3.e()).a(this.c().g());
                j j8 = j7.e();
                j8 = u.d(j3).c(j6).b(j8);
                if (j8.j()) {
                    return this.c().e();
                }
                j5 = j8.c(j5).f();
                j7 = j8.c(j5).c(j7);
                j5 = j6.e().c(j5).b(j7);
                j6 = j5.b(j7).c(j7.a(j5)).a(j3);
                j2 = j3.b(j6).c(j5).b(j2);
                return new u(d2, j6, j2, this.e);
            }
            case 4: {
                return this.c(false).b(this);
            }
        }
        return this.s().b(this);
    }

    public final p b(int n2) {
        j j2;
        j j3;
        if (n2 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        if (n2 == 0 || this.n()) {
            return this;
        }
        if (n2 == 1) {
            return this.s();
        }
        d d2 = this.c();
        j j4 = this.c;
        if (j4.j()) {
            return d2.e();
        }
        int n3 = d2.k();
        j j5 = d2.g();
        j j6 = this.b;
        j j7 = this.d.length <= 0 ? d2.a(org.bouncycastle.math.ec.c.b) : this.d[0];
        if (!j7.i()) {
            switch (n3) {
                case 0: {
                    break;
                }
                case 1: {
                    j j8 = j7.e();
                    j6 = j6.c(j7);
                    j4 = j4.c(j8);
                    j5 = this.a(j7, j8);
                    break;
                }
                case 2: {
                    j5 = this.a(j7, null);
                    break;
                }
                case 4: {
                    j5 = this.u();
                    break;
                }
                default: {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (j4.j()) {
                return d2.e();
            }
            j3 = u.d(j6.e());
            j j9 = j4;
            j2 = j9.a(j9);
            j4 = j2.c(j4);
            j j10 = j6.c(j4);
            j j11 = j10.a(j10);
            j j12 = j4.e();
            j4 = j12.a(j12);
            if (!j5.j()) {
                j3 = j3.a(j5);
                j j13 = j4.c(j5);
                j5 = j13.a(j13);
            }
            j j14 = j11;
            j6 = j3.e().b(j14.a(j14));
            j4 = j3.c(j11.b(j6)).b(j4);
            j7 = j7.i() ? j2 : j2.c(j7);
        }
        switch (n3) {
            case 0: {
                j j15 = j7.f();
                j2 = j15.e();
                j3 = j2.c(j15);
                return new u(d2, j6.c(j2), j4.c(j3), this.e);
            }
            case 1: {
                j6 = j6.c(j7);
                j j16 = j7;
                j7 = j16.c(j16.e());
                return new u(d2, j6, j4, new j[]{j7}, this.e);
            }
            case 2: {
                return new u(d2, j6, j4, new j[]{j7}, this.e);
            }
            case 4: {
                return new u(d2, j6, j4, new j[]{j7, j5}, this.e);
            }
        }
        throw new IllegalStateException("unsupported coordinate system");
    }

    private static j d(j j2) {
        j j3 = j2;
        return j3.a(j3).a(j2);
    }

    private static j e(j j2) {
        j j3 = j2;
        j j4 = j3.a(j3);
        return j4.a(j4);
    }

    private static j f(j j2) {
        j j3 = j2;
        return u.e(j3.a(j3));
    }

    public final p r() {
        if (this.n()) {
            return this;
        }
        d d2 = this.c();
        if (d2.k() != 0) {
            return new u(d2, this.b, this.c.d(), this.d, this.e);
        }
        return new u(d2, this.b, this.c.d(), this.e);
    }

    private j a(j j2, j j3) {
        j j4 = this.c().g();
        if (j4.j() || j2.i()) {
            return j4;
        }
        if (j3 == null) {
            j3 = j2.e();
        }
        j2 = j3.e();
        j3 = j4.d();
        j2 = j3.h() < j4.h() ? j2.c(j3).d() : j2.c(j4);
        return j2;
    }

    private j u() {
        j j2 = this.d[1];
        if (j2 == null) {
            u u2 = this;
            this.d[1] = j2 = u2.a(u2.d[0], null);
        }
        return j2;
    }

    private u c(boolean bl2) {
        j j2;
        j j3 = this.b;
        j j4 = this.c;
        j j5 = this.d[0];
        j j6 = this.u();
        j j7 = u.d(j3.e()).a(j6);
        j j8 = j4;
        j j9 = j8.a(j8);
        j4 = j9.c(j4);
        j j10 = j3.c(j4);
        j j11 = j3 = j10.a(j10);
        j j12 = j7.e().b(j11.a(j11));
        j j13 = j4.e();
        j4 = j13.a(j13);
        j3 = j7.c(j3.b(j12)).b(j4);
        if (bl2) {
            j j14 = j4.c(j6);
            j2 = j14.a(j14);
        } else {
            j2 = null;
        }
        j j15 = j2;
        j4 = j5.i() ? j9 : j9.c(j5);
        return new u(this.c(), j12, j3, new j[]{j4, j15}, this.e);
    }
}

