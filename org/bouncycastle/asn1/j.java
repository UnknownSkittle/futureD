/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.aa;
import org.bouncycastle.asn1.ac;
import org.bouncycastle.asn1.ae;
import org.bouncycastle.asn1.ag;
import org.bouncycastle.asn1.ai;
import org.bouncycastle.asn1.ak;
import org.bouncycastle.asn1.am;
import org.bouncycastle.asn1.ao;
import org.bouncycastle.asn1.ap;
import org.bouncycastle.asn1.ar;
import org.bouncycastle.asn1.as;
import org.bouncycastle.asn1.at;
import org.bouncycastle.asn1.au;
import org.bouncycastle.asn1.aw;
import org.bouncycastle.asn1.ax;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.az;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.bd;
import org.bouncycastle.asn1.bi;
import org.bouncycastle.asn1.bk;
import org.bouncycastle.asn1.bl;
import org.bouncycastle.asn1.bm;
import org.bouncycastle.asn1.bn;
import org.bouncycastle.asn1.bt;
import org.bouncycastle.asn1.bv;
import org.bouncycastle.asn1.bx;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.y;

public final class j
extends FilterInputStream {
    private final int a;
    private final boolean b;
    private final byte[][] c;

    public j(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        this(inputStream2, bz.a(inputStream2));
    }

    public j(byte[] byArray) {
        this(new ByteArrayInputStream(byArray), byArray.length);
    }

    public j(byte[] byArray, byte by2) {
        this(new ByteArrayInputStream(byArray), byArray.length, true);
    }

    private j(InputStream inputStream, int n2) {
        this(inputStream, n2, false);
    }

    private j(InputStream inputStream, int n2, boolean bl2) {
        super(inputStream);
        this.a = n2;
        this.b = bl2;
        this.c = new byte[11][];
    }

    final int a() {
        return this.a;
    }

    private int c() {
        j j2 = this;
        return j.b(j2, j2.a);
    }

    private u a(int n2, int n3, int n4) {
        boolean bl2 = (n2 & 0x20) != 0;
        bt bt2 = new bt(this, n4);
        if ((n2 & 0x40) != 0) {
            return new ao(bl2, n3, bt2.b());
        }
        if ((n2 & 0x80) != 0) {
            return new y(bt2).a(bl2, n3);
        }
        if (bl2) {
            switch (n3) {
                case 4: {
                    a a2 = j.a(bt2);
                    p[] pArray = new p[a2.a()];
                    for (int i2 = 0; i2 != pArray.length; ++i2) {
                        pArray[i2] = (p)a2.a(i2);
                    }
                    return new ae(pArray);
                }
                case 16: {
                    if (this.b) {
                        return new bx(bt2.b());
                    }
                    return at.a(j.a(bt2));
                }
                case 17: {
                    return at.b(j.a(bt2));
                }
                case 8: {
                    return new ar(j.a(bt2));
                }
            }
            throw new IOException("unknown tag " + n3 + " encountered");
        }
        return j.a(n3, bt2, this.c);
    }

    private a d() {
        u u2;
        a a2 = new a();
        while ((u2 = this.b()) != null) {
            a2.a(u2);
        }
        return a2;
    }

    private static a a(bt bt2) {
        return new j(bt2).d();
    }

    public final u b() {
        int n2 = this.read();
        if (n2 <= 0) {
            if (n2 == 0) {
                throw new IOException("unexpected end-of-contents marker");
            }
            return null;
        }
        int n3 = j.a(this, n2);
        boolean bl2 = (n2 & 0x20) != 0;
        int n4 = this.c();
        if (n4 < 0) {
            if (!bl2) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            j j2 = this;
            Object object = new bv(j2, j2.a);
            object = new y((InputStream)object, this.a);
            if ((n2 & 0x40) != 0) {
                return new ac(n3, (y)object).d();
            }
            if ((n2 & 0x80) != 0) {
                return new am(true, n3, (y)object).d();
            }
            switch (n3) {
                case 4: {
                    return new ag((y)object).d();
                }
                case 16: {
                    return new ai((y)object).d();
                }
                case 17: {
                    return new ak((y)object).d();
                }
                case 8: {
                    return new as((y)object).d();
                }
            }
            throw new IOException("unknown BER object encountered");
        }
        try {
            return this.a(n2, n3, n4);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new h("corrupted stream detected", illegalArgumentException);
        }
    }

    static int a(InputStream inputStream, int n2) {
        if ((n2 &= 0x1F) == 31) {
            n2 = 0;
            int n3 = inputStream.read();
            if ((n3 & 0x7F) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while (n3 >= 0 && (n3 & 0x80) != 0) {
                n2 = (n2 | n3 & 0x7F) << 7;
                n3 = inputStream.read();
            }
            if (n3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            n2 |= n3 & 0x7F;
        }
        return n2;
    }

    static int b(InputStream inputStream, int n2) {
        int n3 = inputStream.read();
        if (n3 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (n3 == 128) {
            return -1;
        }
        if (n3 > 127) {
            int n4 = n3 & 0x7F;
            if (n4 > 4) {
                throw new IOException("DER length more than 4 bytes: ".concat(String.valueOf(n4)));
            }
            n3 = 0;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n5 = inputStream.read();
                if (n5 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                n3 = (n3 << 8) + n5;
            }
            if (n3 < 0) {
                throw new IOException("corrupted stream - negative length found");
            }
            if (n3 >= n2) {
                throw new IOException("corrupted stream - out of bounds length found");
            }
        }
        return n3;
    }

    private static byte[] a(bt bt2, byte[][] byArray) {
        int n2 = bt2.a();
        if (bt2.a() < byArray.length) {
            byte[] byArray2 = byArray[n2];
            if (byArray2 == null) {
                int n3 = n2;
                byte[] byArray3 = new byte[n3];
                byArray[n3] = byArray3;
                byArray2 = byArray3;
            }
            org.bouncycastle.e.b.a.a((InputStream)bt2, byArray2);
            return byArray2;
        }
        return bt2.b();
    }

    private static char[] b(bt bt2) {
        int n2;
        int n3;
        int n4 = bt2.a() / 2;
        char[] cArray = new char[n4];
        int n5 = 0;
        while (n5 < n4 && (n3 = bt2.read()) >= 0 && (n2 = bt2.read()) >= 0) {
            cArray[n5++] = (char)(n3 << 8 | n2 & 0xFF);
        }
        return cArray;
    }

    static u a(int n2, bt bt2, byte[][] byArray) {
        switch (n2) {
            case 3: {
                return org.bouncycastle.asn1.c.a(bt2.a(), bt2);
            }
            case 30: {
                return new ap(j.b(bt2));
            }
            case 1: {
                return d.a(j.a(bt2, byArray));
            }
            case 10: {
                return g.a(j.a(bt2, byArray));
            }
            case 24: {
                return new i(bt2.b());
            }
            case 27: {
                return new au(bt2.b());
            }
            case 22: {
                return new ax(bt2.b());
            }
            case 2: {
                return new k(bt2.b());
            }
            case 5: {
                return ay.a;
            }
            case 18: {
                return new az(bt2.b());
            }
            case 6: {
                return n.a(j.a(bt2, byArray));
            }
            case 4: {
                return new ba(bt2.b());
            }
            case 19: {
                return new bd(bt2.b());
            }
            case 20: {
                return new bi(bt2.b());
            }
            case 28: {
                return new bl(bt2.b());
            }
            case 23: {
                return new aa(bt2.b());
            }
            case 12: {
                return new bk(bt2.b());
            }
            case 26: {
                return new bn(bt2.b());
            }
            case 25: {
                return new aw(bt2.b());
            }
            case 21: {
                return new bm(bt2.b());
            }
        }
        throw new IOException("unknown tag " + n2 + " encountered");
    }
}

