/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.aa;
import org.bouncycastle.asn1.ab;
import org.bouncycastle.asn1.ae;
import org.bouncycastle.asn1.ah;
import org.bouncycastle.asn1.aj;
import org.bouncycastle.asn1.al;
import org.bouncycastle.asn1.ao;
import org.bouncycastle.asn1.ap;
import org.bouncycastle.asn1.aq;
import org.bouncycastle.asn1.ar;
import org.bouncycastle.asn1.aw;
import org.bouncycastle.asn1.ax;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.bd;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bi;
import org.bouncycastle.asn1.bk;
import org.bouncycastle.asn1.bm;
import org.bouncycastle.asn1.bn;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.f.b;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.z;
import org.bouncycastle.b.e;
import org.bouncycastle.openpgp.m;

public final class a
implements e {
    private final Vector a = new Vector();

    static void a(String object, boolean bl2, u u2, StringBuffer stringBuffer) {
        String string;
        while (true) {
            Object object2;
            Object object3;
            string = org.bouncycastle.e.k.b();
            if (u2 instanceof v) {
                object3 = ((v)u2).c();
                object2 = (String)object + "    ";
                stringBuffer.append((String)object);
                if (u2 instanceof ah) {
                    stringBuffer.append("BER Sequence");
                } else if (u2 instanceof be) {
                    stringBuffer.append("DER Sequence");
                } else {
                    stringBuffer.append("Sequence");
                }
                stringBuffer.append(string);
                while (object3.hasMoreElements()) {
                    object = object3.nextElement();
                    if (object == null || object.equals(ay.a)) {
                        stringBuffer.append((String)object2);
                        stringBuffer.append("NULL");
                        stringBuffer.append(string);
                        continue;
                    }
                    if (object instanceof u) {
                        org.bouncycastle.asn1.util.a.a((String)object2, bl2, (u)object, stringBuffer);
                        continue;
                    }
                    org.bouncycastle.asn1.util.a.a((String)object2, bl2, ((f)object).h(), stringBuffer);
                }
                return;
            }
            if (u2 instanceof z) {
                object3 = (String)object + "    ";
                stringBuffer.append((String)object);
                if (u2 instanceof al) {
                    stringBuffer.append("BER Tagged [");
                } else {
                    stringBuffer.append("Tagged [");
                }
                object2 = (z)u2;
                stringBuffer.append(Integer.toString(((z)object2).b()));
                stringBuffer.append(']');
                if (!((z)object2).c()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(string);
                u2 = ((z)object2).i();
                object = object3;
                continue;
            }
            if (u2 instanceof x) {
                object3 = ((x)u2).b();
                object2 = (String)object + "    ";
                stringBuffer.append((String)object);
                if (u2 instanceof aj) {
                    stringBuffer.append("BER Set");
                } else {
                    stringBuffer.append("DER Set");
                }
                stringBuffer.append(string);
                while (object3.hasMoreElements()) {
                    object = object3.nextElement();
                    if (object == null) {
                        stringBuffer.append((String)object2);
                        stringBuffer.append("NULL");
                        stringBuffer.append(string);
                        continue;
                    }
                    if (object instanceof u) {
                        org.bouncycastle.asn1.util.a.a((String)object2, bl2, (u)object, stringBuffer);
                        continue;
                    }
                    org.bouncycastle.asn1.util.a.a((String)object2, bl2, ((f)object).h(), stringBuffer);
                }
                return;
            }
            if (u2 instanceof p) {
                object3 = (p)u2;
                if (u2 instanceof ae) {
                    stringBuffer.append((String)object + "BER Constructed Octet String[" + ((p)object3).c().length + "] ");
                } else {
                    stringBuffer.append((String)object + "DER Octet String[" + ((p)object3).c().length + "] ");
                }
                if (bl2) {
                    stringBuffer.append(org.bouncycastle.asn1.util.a.a((String)object, ((p)object3).c()));
                    return;
                }
                stringBuffer.append(string);
                return;
            }
            if (u2 instanceof n) {
                stringBuffer.append((String)object + "ObjectIdentifier(" + ((n)u2).b() + ")" + string);
                return;
            }
            if (u2 instanceof d) {
                stringBuffer.append((String)object + "Boolean(" + ((d)u2).b() + ")" + string);
                return;
            }
            if (u2 instanceof k) {
                stringBuffer.append((String)object + "Integer(" + ((k)u2).b() + ")" + string);
                return;
            }
            if (u2 instanceof aq) {
                object3 = (aq)u2;
                stringBuffer.append((String)object + "DER Bit String[" + ((c)object3).c().length + ", " + ((c)object3).d() + "] ");
                if (bl2) {
                    stringBuffer.append(org.bouncycastle.asn1.util.a.a((String)object, ((c)object3).c()));
                    return;
                }
                stringBuffer.append(string);
                return;
            }
            if (u2 instanceof ax) {
                stringBuffer.append((String)object + "IA5String(" + ((ax)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof bk) {
                stringBuffer.append((String)object + "UTF8String(" + ((bk)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof bd) {
                stringBuffer.append((String)object + "PrintableString(" + ((bd)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof bn) {
                stringBuffer.append((String)object + "VisibleString(" + ((bn)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof ap) {
                stringBuffer.append((String)object + "BMPString(" + ((ap)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof bi) {
                stringBuffer.append((String)object + "T61String(" + ((bi)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof aw) {
                stringBuffer.append((String)object + "GraphicString(" + ((aw)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof bm) {
                stringBuffer.append((String)object + "VideotexString(" + ((bm)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof aa) {
                stringBuffer.append((String)object + "UTCTime(" + ((aa)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof i) {
                stringBuffer.append((String)object + "GeneralizedTime(" + ((i)u2).b() + ") " + string);
                return;
            }
            if (u2 instanceof ab) {
                stringBuffer.append(org.bouncycastle.asn1.util.a.a("BER", (String)object, bl2, u2, string));
                return;
            }
            if (u2 instanceof ao) {
                stringBuffer.append(org.bouncycastle.asn1.util.a.a("DER", (String)object, bl2, u2, string));
                return;
            }
            if (u2 instanceof g) {
                object3 = (g)u2;
                stringBuffer.append((String)object + "DER Enumerated(" + ((g)object3).b() + ")" + string);
                return;
            }
            if (!(u2 instanceof ar)) break;
            object3 = (ar)u2;
            stringBuffer.append((String)object + "External " + string);
            object2 = (String)object + "    ";
            if (((ar)object3).c() != null) {
                stringBuffer.append((String)object2 + "Direct Reference: " + ((ar)object3).c().b() + string);
            }
            if (((ar)object3).k() != null) {
                stringBuffer.append((String)object2 + "Indirect Reference: " + ((ar)object3).k().toString() + string);
            }
            if (((ar)object3).b() != null) {
                org.bouncycastle.asn1.util.a.a((String)object2, bl2, ((ar)object3).b(), stringBuffer);
            }
            stringBuffer.append((String)object2 + "Encoding: " + ((ar)object3).d() + string);
            u2 = ((ar)object3).i();
            object = object2;
        }
        stringBuffer.append((String)object + u2.toString() + string);
    }

    private static String a(String object, String string, boolean bl2, u u2, String string2) {
        if (u2 != null && !(u2 instanceof org.bouncycastle.asn1.a)) {
            throw new IllegalArgumentException("unknown object in getInstance: " + u2.getClass().getName());
        }
        u2 = (org.bouncycastle.asn1.a)u2;
        StringBuffer stringBuffer = new StringBuffer();
        if (((org.bouncycastle.asn1.a)u2).a()) {
            try {
                v v2 = v.a(((org.bouncycastle.asn1.a)u2).d());
                stringBuffer.append(string + (String)object + " ApplicationSpecific[" + ((org.bouncycastle.asn1.a)u2).c() + "]" + string2);
                object = v2.c();
                while (object.hasMoreElements()) {
                    org.bouncycastle.asn1.util.a.a(string + "    ", bl2, (u)object.nextElement(), stringBuffer);
                }
            } catch (IOException iOException) {
                stringBuffer.append(iOException);
            }
            return stringBuffer.toString();
        }
        return string + (String)object + " ApplicationSpecific[" + ((org.bouncycastle.asn1.a)u2).c() + "] (" + org.bouncycastle.e.k.b(org.bouncycastle.e.a.f.b(((org.bouncycastle.asn1.a)u2).b())) + ")" + string2;
    }

    private static String a(String string, byte[] byArray) {
        String string2 = org.bouncycastle.e.k.b();
        StringBuffer stringBuffer = new StringBuffer();
        string = string + "    ";
        stringBuffer.append(string2);
        for (int i2 = 0; i2 < byArray.length; i2 += 32) {
            if (byArray.length - i2 > 32) {
                stringBuffer.append(string);
                stringBuffer.append(org.bouncycastle.e.k.b(org.bouncycastle.e.a.f.a(byArray, i2, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(org.bouncycastle.asn1.util.a.b(byArray, i2, 32));
                stringBuffer.append(string2);
                continue;
            }
            stringBuffer.append(string);
            stringBuffer.append(org.bouncycastle.e.k.b(org.bouncycastle.e.a.f.a(byArray, i2, byArray.length - i2)));
            for (int i3 = byArray.length - i2; i3 != 32; ++i3) {
                stringBuffer.append("  ");
            }
            stringBuffer.append("    ");
            stringBuffer.append(org.bouncycastle.asn1.util.a.b(byArray, i2, byArray.length - i2));
            stringBuffer.append(string2);
        }
        return stringBuffer.toString();
    }

    private static String b(byte[] byArray, int n2, int n3) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = n2; i2 != n2 + n3; ++i2) {
            if (byArray[i2] < 32 || byArray[i2] > 126) continue;
            stringBuffer.append((char)byArray[i2]);
        }
        return stringBuffer.toString();
    }

    public final void a(f f2) {
        this.a.addElement(f2);
    }

    public final f a(int n2) {
        return (f)this.a.elementAt(n2);
    }

    public final int a() {
        return this.a.size();
    }

    public static org.bouncycastle.asn1.k.aa a(String string) {
        org.bouncycastle.asn1.k.aa aa2 = org.bouncycastle.asn1.k.a.a(string);
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.h.a.a(string);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.d.a.a(string);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.i.a.a(string);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.a.a.a(string);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.util.a.a(ECGOST3410NamedCurves.a(string));
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.c.a.a(string);
        }
        return aa2;
    }

    public static String a(n n2) {
        String string = org.bouncycastle.asn1.k.a.b(n2);
        if (string == null) {
            string = org.bouncycastle.asn1.h.a.b(n2);
        }
        if (string == null) {
            string = org.bouncycastle.asn1.d.a.a(n2);
        }
        if (string == null) {
            string = org.bouncycastle.asn1.i.a.b(n2);
        }
        if (string == null) {
            string = org.bouncycastle.asn1.a.a.b(n2);
        }
        if (string == null) {
            string = ECGOST3410NamedCurves.b(n2);
        }
        if (string == null) {
            string = org.bouncycastle.asn1.c.a.b(n2);
        }
        return string;
    }

    public static org.bouncycastle.asn1.k.aa b(n n2) {
        org.bouncycastle.asn1.k.aa aa2 = org.bouncycastle.asn1.k.a.a(n2);
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.h.a.a(n2);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.i.a.a(n2);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.a.a.a(n2);
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.util.a.a(ECGOST3410NamedCurves.a(n2));
        }
        if (aa2 == null) {
            aa2 = org.bouncycastle.asn1.c.a.a(n2);
        }
        return aa2;
    }

    public static Enumeration b() {
        Vector vector = new Vector();
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.k.a.a());
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.h.a.a());
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.d.a.a());
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.i.a.a());
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.a.a.a());
        org.bouncycastle.asn1.util.a.a(vector, ECGOST3410NamedCurves.a());
        org.bouncycastle.asn1.util.a.a(vector, org.bouncycastle.asn1.c.a.a());
        return vector.elements();
    }

    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    private static org.bouncycastle.asn1.k.aa a(org.bouncycastle.crypto.i.g g2) {
        if (g2 == null) {
            return null;
        }
        return new org.bouncycastle.asn1.k.aa(g2.a(), g2.b(), g2.c(), g2.d(), org.bouncycastle.e.a.d(null));
    }

    public static byte[] a(org.bouncycastle.asn1.j.a a2, f f2) {
        try {
            return org.bouncycastle.asn1.util.a.a(new org.bouncycastle.asn1.j.c(a2, f2));
        } catch (Exception exception) {
            return null;
        }
    }

    private static byte[] a(org.bouncycastle.asn1.j.c c2) {
        try {
            return c2.a("DER");
        } catch (Exception exception) {
            return null;
        }
    }

    public static byte[] b(org.bouncycastle.asn1.j.a a2, f f2) {
        try {
            return org.bouncycastle.asn1.util.a.a(new b(a2, f2.h()));
        } catch (Exception exception) {
            return null;
        }
    }

    private static byte[] a(b b2) {
        try {
            return b2.a("DER");
        } catch (Exception exception) {
            return null;
        }
    }

    public static int b(int n2) {
        int n3 = n2 & 0xFF;
        int n4 = (n3 | n3 << 4) & 0xF0F;
        int n5 = (n4 | n4 << 2) & 0x3333;
        return (n5 | n5 << 1) & 0x5555;
    }

    public static int c(int n2) {
        int n3 = n2 & 0xFFFF;
        int n4 = (n3 | n3 << 8) & 0xFF00FF;
        int n5 = (n4 | n4 << 4) & 0xF0F0F0F;
        int n6 = (n5 | n5 << 2) & 0x33333333;
        return (n6 | n6 << 1) & 0x55555555;
    }

    public static long d(int n2) {
        int n3;
        int n4 = n2;
        int n5 = n3 = (n4 ^ n4 >>> 8) & 0xFF00;
        int n6 = n3 = ((n2 ^= n5 ^ n5 << 8) ^ n2 >>> 4) & 0xF000F0;
        int n7 = n3 = ((n2 ^= n6 ^ n6 << 4) ^ n2 >>> 2) & 0xC0C0C0C;
        int n8 = n3 = ((n2 ^= n7 ^ n7 << 2) ^ n2 >>> 1) & 0x22222222;
        return ((long)((n2 ^= n8 ^ n8 << 1) >>> 1) & 0x55555555L) << 32 | (long)n2 & 0x55555555L;
    }

    public static void a(long l2, long[] lArray, int n2) {
        long l3;
        long l4 = l2;
        long l5 = l3 = (l4 ^ l4 >>> 16) & 0xFFFF0000L;
        long l6 = l3 = ((l2 ^= l5 ^ l5 << 16) ^ l2 >>> 8) & 0xFF000000FF00L;
        long l7 = l3 = ((l2 ^= l6 ^ l6 << 8) ^ l2 >>> 4) & 0xF000F000F000F0L;
        long l8 = l3 = ((l2 ^= l7 ^ l7 << 4) ^ l2 >>> 2) & 0xC0C0C0C0C0C0C0CL;
        long l9 = l3 = ((l2 ^= l8 ^ l8 << 2) ^ l2 >>> 1) & 0x2222222222222222L;
        lArray[n2] = (l2 ^= l9 ^ l9 << 1) & 0x5555555555555555L;
        lArray[n2 + 1] = l2 >>> 1 & 0x5555555555555555L;
    }

    public static long a(long l2) {
        long l3;
        long l4 = l2;
        long l5 = l3 = (l4 ^ l4 >>> 1) & 0x2222222222222222L;
        long l6 = l3 = ((l2 ^= l5 ^ l5 << 1) ^ l2 >>> 2) & 0xC0C0C0C0C0C0C0CL;
        long l7 = l3 = ((l2 ^= l6 ^ l6 << 2) ^ l2 >>> 4) & 0xF000F000F000F0L;
        long l8 = l3 = ((l2 ^= l7 ^ l7 << 4) ^ l2 >>> 8) & 0xFF000000FF00L;
        long l9 = l3 = ((l2 ^= l8 ^ l8 << 8) ^ l2 >>> 16) & 0xFFFF0000L;
        return l2 ^ (l9 ^ l9 << 16);
    }

    public static byte[] a(byte[] byArray) {
        byte by2 = byArray[byArray.length - 1];
        for (int i2 = byArray.length - by2; i2 != byArray.length; ++i2) {
            if (byArray[i2] == by2) continue;
            throw new m("bad padding found in session data");
        }
        byte[] byArray2 = new byte[byArray.length - by2];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        return byArray2;
    }

    public static short[] b(byte[] byArray) {
        short[] sArray = new short[byArray.length];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            sArray[i2] = (short)(byArray[i2] & 0xFF);
        }
        return sArray;
    }

    public static short[][] a(byte[][] byArray) {
        short[][] sArray = new short[byArray.length][byArray[0].length];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            for (int i3 = 0; i3 < byArray[0].length; ++i3) {
                sArray[i2][i3] = (short)(byArray[i2][i3] & 0xFF);
            }
        }
        return sArray;
    }

    public static short[][][] a(byte[][][] byArray) {
        short[][][] sArray = new short[byArray.length][byArray[0].length][byArray[0][0].length];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            for (int i3 = 0; i3 < byArray[0].length; ++i3) {
                for (int i4 = 0; i4 < byArray[0][0].length; ++i4) {
                    sArray[i2][i3][i4] = (short)(byArray[i2][i3][i4] & 0xFF);
                }
            }
        }
        return sArray;
    }

    public static byte[] a(short[] sArray) {
        byte[] byArray = new byte[sArray.length];
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            byArray[i2] = (byte)sArray[i2];
        }
        return byArray;
    }

    public static byte[][] a(short[][] sArray) {
        byte[][] byArray = new byte[sArray.length][sArray[0].length];
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 0; i3 < sArray[0].length; ++i3) {
                byArray[i2][i3] = (byte)sArray[i2][i3];
            }
        }
        return byArray;
    }

    public static byte[][][] a(short[][][] sArray) {
        byte[][][] byArray = new byte[sArray.length][sArray[0].length][sArray[0][0].length];
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 0; i3 < sArray[0].length; ++i3) {
                for (int i4 = 0; i4 < sArray[0][0].length; ++i4) {
                    byArray[i2][i3][i4] = (byte)sArray[i2][i3][i4];
                }
            }
        }
        return byArray;
    }

    public static boolean a(short[] sArray, short[] sArray2) {
        if (sArray.length != sArray2.length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = sArray.length - 1; i2 >= 0; --i2) {
            bl2 &= sArray[i2] == sArray2[i2];
        }
        return bl2;
    }

    public static boolean a(short[][] sArray, short[][] sArray2) {
        if (sArray.length != sArray2.length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = sArray.length - 1; i2 >= 0; --i2) {
            bl2 &= org.bouncycastle.asn1.util.a.a(sArray[i2], sArray2[i2]);
        }
        return bl2;
    }

    public static boolean a(short[][][] sArray, short[][][] sArray2) {
        if (sArray.length != sArray2.length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = sArray.length - 1; i2 >= 0; --i2) {
            bl2 &= org.bouncycastle.asn1.util.a.a(sArray[i2], sArray2[i2]);
        }
        return bl2;
    }

    public static org.bouncycastle.d.d.a.a a(org.bouncycastle.d.d.a.b b2, org.bouncycastle.d.d.a.f f2) {
        int n2;
        int n3;
        int n4;
        int n5 = b2.a();
        int n6 = 1 << n5;
        int n7 = f2.a();
        int[][] nArray = new int[n7][n6];
        int[][] nArray2 = new int[n7][n6];
        for (n4 = 0; n4 < n6; ++n4) {
            nArray2[0][n4] = b2.a(f2.b(n4));
        }
        for (n4 = 1; n4 < n7; ++n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                nArray2[n4][n3] = b2.a(nArray2[n4 - 1][n3], n3);
            }
        }
        for (n4 = 0; n4 < n7; ++n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                for (n2 = 0; n2 <= n4; ++n2) {
                    nArray[n4][n3] = nArray[n4][n3] ^ b2.a(nArray2[n2][n3], f2.a(n7 + n2 - n4));
                }
            }
        }
        int[][] nArray3 = new int[n7 * n5][n6 + 31 >>> 5];
        for (n3 = 0; n3 < n6; ++n3) {
            n2 = n3 >>> 5;
            int n8 = 1 << (n3 & 0x1F);
            for (int i2 = 0; i2 < n7; ++i2) {
                int n9 = nArray[i2][n3];
                for (int i3 = 0; i3 < n5; ++i3) {
                    if ((n9 >>> i3 & 1) == 0) continue;
                    int n10 = (i2 + 1) * n5 - i3 - 1;
                    int[] nArray4 = nArray3[n10];
                    int n11 = n2;
                    nArray4[n11] = nArray4[n11] ^ n8;
                }
            }
        }
        return new org.bouncycastle.d.d.a.a(n6, nArray3);
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        if (nArray.length != nArray2.length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = nArray.length - 1; i2 >= 0; --i2) {
            bl2 &= nArray[i2] == nArray2[i2];
        }
        return bl2;
    }

    public static int[] a(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        return nArray2;
    }

    public static int a(byte[] byArray, int n2) {
        return byArray[n2++] & 0xFF | (byArray[n2++] & 0xFF) << 8 | (byArray[n2++] & 0xFF) << 16 | (byArray[n2] & 0xFF) << 24;
    }

    public static int a(byte[] byArray, int n2, int n3) {
        int n4 = 0;
        --n3;
        while (n3 >= 0) {
            n4 |= (byArray[n2 + n3] & 0xFF) << (n3 << 3);
            --n3;
        }
        return n4;
    }

    public static void a(int n2, byte[] byArray, int n3) {
        byArray[n3++] = (byte)n2;
        byArray[n3++] = (byte)(n2 >>> 8);
        byArray[n3++] = (byte)(n2 >>> 16);
        byArray[n3] = (byte)(n2 >>> 24);
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = 0;
        n2 = org.bouncycastle.asn1.util.a.a(n2, n4);
        if ((n3 = org.bouncycastle.asn1.util.a.a(n3, n4)) != 0) {
            int n6 = 1 << org.bouncycastle.asn1.util.a.e(n4);
            while (n2 != 0) {
                if ((byte)(n2 & 1) == 1) {
                    n5 ^= n3;
                }
                n2 >>>= 1;
                if ((n3 <<= 1) < n6) continue;
                n3 ^= n4;
            }
        }
        return n5;
    }

    public static int e(int n2) {
        int n3 = -1;
        while (n2 != 0) {
            ++n3;
            n2 >>>= 1;
        }
        return n3;
    }

    private static int a(int n2, int n3) {
        if (n3 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (org.bouncycastle.asn1.util.a.e(n2) >= org.bouncycastle.asn1.util.a.e(n3)) {
            n2 ^= n3 << org.bouncycastle.asn1.util.a.e(n2) - org.bouncycastle.asn1.util.a.e(n3);
        }
        return n2;
    }

    public static boolean f(int n2) {
        if (n2 == 0) {
            return false;
        }
        int n3 = org.bouncycastle.asn1.util.a.e(n2) >>> 1;
        int n4 = 2;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = n4;
            n4 = org.bouncycastle.asn1.util.a.a(n5, n5, n2);
            int n6 = n2;
            int n7 = n4 ^ 2;
            while (n6 != 0) {
                int n8 = org.bouncycastle.asn1.util.a.a(n7, n6);
                n7 = n6;
                n6 = n8;
            }
            if (n7 == 1) continue;
            return false;
        }
        return true;
    }
}

