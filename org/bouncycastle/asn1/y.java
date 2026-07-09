/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ac;
import org.bouncycastle.asn1.ad;
import org.bouncycastle.asn1.ag;
import org.bouncycastle.asn1.ai;
import org.bouncycastle.asn1.ak;
import org.bouncycastle.asn1.al;
import org.bouncycastle.asn1.am;
import org.bouncycastle.asn1.ao;
import org.bouncycastle.asn1.as;
import org.bouncycastle.asn1.at;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.bb;
import org.bouncycastle.asn1.bf;
import org.bouncycastle.asn1.bh;
import org.bouncycastle.asn1.bj;
import org.bouncycastle.asn1.bt;
import org.bouncycastle.asn1.bu;
import org.bouncycastle.asn1.bv;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;

public final class y {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    public y(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        this(inputStream2, bz.a(inputStream2));
    }

    public y(InputStream inputStream, int n2) {
        this.a = inputStream;
        this.b = n2;
        this.c = new byte[11][];
    }

    final u a(boolean bl2, int n2) {
        if (!bl2) {
            bt bt2 = (bt)this.a;
            return new bj(false, n2, new ba(bt2.b()));
        }
        a a2 = this.b();
        if (this.a instanceof bv) {
            if (a2.a() == 1) {
                return new al(true, n2, a2.a(0));
            }
            return new al(false, n2, ad.a(a2));
        }
        if (a2.a() == 1) {
            return new bj(true, n2, a2.a(0));
        }
        return new bj(false, n2, at.a(a2));
    }

    public final f a() {
        int n2 = this.a.read();
        if (n2 == -1) {
            return null;
        }
        y y2 = this;
        if (y2.a instanceof bv) {
            ((bv)y2.a).a(false);
        }
        int n3 = j.a(this.a, n2);
        boolean bl2 = (n2 & 0x20) != 0;
        int n4 = j.b(this.a, this.b);
        if (n4 < 0) {
            if (!bl2) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            bv bv2 = new bv(this.a, this.b);
            y y3 = new y(bv2, this.b);
            if ((n2 & 0x40) != 0) {
                return new ac(n3, y3);
            }
            if ((n2 & 0x80) != 0) {
                return new am(true, n3, y3);
            }
            int n5 = n3;
            y y4 = y3;
            switch (n5) {
                case 8: {
                    return new as(y4);
                }
                case 4: {
                    return new ag(y4);
                }
                case 16: {
                    return new ai(y4);
                }
                case 17: {
                    return new ak(y4);
                }
            }
            throw new h("unknown BER object encountered: 0x" + Integer.toHexString(n5));
        }
        bt bt2 = new bt(this.a, n4);
        if ((n2 & 0x40) != 0) {
            return new ao(bl2, n3, bt2.b());
        }
        if ((n2 & 0x80) != 0) {
            return new am(bl2, n3, new y(bt2));
        }
        if (bl2) {
            switch (n3) {
                case 4: {
                    return new ag(new y(bt2));
                }
                case 16: {
                    return new bf(new y(bt2));
                }
                case 17: {
                    return new bh(new y(bt2));
                }
                case 8: {
                    return new as(new y(bt2));
                }
            }
            throw new IOException("unknown tag " + n3 + " encountered");
        }
        switch (n3) {
            case 4: {
                return new bb(bt2);
            }
        }
        try {
            return j.a(n3, bt2, this.c);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new h("corrupted stream detected", illegalArgumentException);
        }
    }

    final a b() {
        f f2;
        a a2 = new a();
        while ((f2 = this.a()) != null) {
            if (f2 instanceof bu) {
                a2.a(((bu)((Object)f2)).d());
                continue;
            }
            a2.a(f2.h());
        }
        return a2;
    }
}

