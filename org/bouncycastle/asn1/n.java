/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.jcajce.provider.b.a.a;

public final class n
extends u {
    private final String a;
    private byte[] b;
    private static final ConcurrentMap<o, n> c = new ConcurrentHashMap<o, n>();

    public static n a(Object object) {
        if (object == null || object instanceof n) {
            return (n)object;
        }
        if (object instanceof f && ((f)object).h() instanceof n) {
            return (n)((f)object).h();
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + object.getClass().getName());
    }

    private n(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer();
        long l2 = 0L;
        BigInteger bigInteger = null;
        boolean bl2 = true;
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            int n2 = byArray[i2] & 0xFF;
            if (l2 <= 0xFFFFFFFFFFFF80L) {
                l2 += (long)(n2 & 0x7F);
                if ((n2 & 0x80) == 0) {
                    if (bl2) {
                        if (l2 < 40L) {
                            stringBuffer.append('0');
                        } else if (l2 < 80L) {
                            stringBuffer.append('1');
                            l2 -= 40L;
                        } else {
                            stringBuffer.append('2');
                            l2 -= 80L;
                        }
                        bl2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(l2);
                    l2 = 0L;
                    continue;
                }
                l2 <<= 7;
                continue;
            }
            if (bigInteger == null) {
                bigInteger = BigInteger.valueOf(l2);
            }
            bigInteger = bigInteger.or(BigInteger.valueOf(n2 & 0x7F));
            if ((n2 & 0x80) == 0) {
                if (bl2) {
                    stringBuffer.append('2');
                    bigInteger = bigInteger.subtract(BigInteger.valueOf(80L));
                    bl2 = false;
                }
                stringBuffer.append('.');
                stringBuffer.append(bigInteger);
                bigInteger = null;
                l2 = 0L;
                continue;
            }
            bigInteger = bigInteger.shiftLeft(7);
        }
        this.a = stringBuffer.toString();
        this.b = org.bouncycastle.e.a.d(byArray);
    }

    public n(String string) {
        char c2;
        String string2 = string;
        if (!(string2.length() < 3 || string2.charAt(1) != '.' ? false : ((c2 = string2.charAt(0)) < '0' || c2 > '2' ? false : n.a(string2, 2)))) {
            throw new IllegalArgumentException("string " + string + " not an OID");
        }
        this.a = string;
    }

    private n(n n2, String string) {
        if (!n.a(string, 0)) {
            throw new IllegalArgumentException("string " + string + " not a valid OID branch");
        }
        this.a = n2.a + "." + string;
    }

    public final String b() {
        return this.a;
    }

    public final n b(String string) {
        return new n(this, string);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, long l2) {
        byte[] byArray = new byte[9];
        int n2 = 8;
        byArray[8] = (byte)((int)l2 & 0x7F);
        while (l2 >= 128L) {
            byArray[--n2] = (byte)((int)(l2 >>= 7) & 0x7F | 0x80);
        }
        byteArrayOutputStream.write(byArray, n2, 9 - n2);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int n2 = (bigInteger.bitLength() + 6) / 7;
        if (n2 == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] byArray = new byte[n2];
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            byArray[i2] = (byte)(bigInteger.intValue() & 0x7F | 0x80);
            bigInteger = bigInteger.shiftRight(7);
        }
        int n3 = n2 - 1;
        byArray[n3] = (byte)(byArray[n3] & 0x7F);
        byteArrayOutputStream.write(byArray, 0, n2);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream) {
        a a2 = new a(this.a);
        int n2 = Integer.parseInt(a2.b()) * 40;
        String string = a2.b();
        if (string.length() <= 18) {
            n.a(byteArrayOutputStream, (long)n2 + Long.parseLong(string));
        } else {
            n.a(byteArrayOutputStream, new BigInteger(string).add(BigInteger.valueOf(n2)));
        }
        while (a2.a()) {
            String string2 = a2.b();
            if (string2.length() <= 18) {
                n.a(byteArrayOutputStream, Long.parseLong(string2));
                continue;
            }
            n.a(byteArrayOutputStream, new BigInteger(string2));
        }
    }

    private synchronized byte[] d() {
        if (this.b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a(byteArrayOutputStream);
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }

    final boolean a() {
        return false;
    }

    final int e() {
        int n2 = this.d().length;
        return 1 + bz.a(n2) + n2;
    }

    final void a(r r2) {
        byte[] byArray = this.d();
        r2.b(6);
        r2.a(byArray.length);
        r2.a(byArray);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    final boolean a(u u2) {
        if (u2 == this) {
            return true;
        }
        if (!(u2 instanceof n)) {
            return false;
        }
        return this.a.equals(((n)u2).a);
    }

    public final String toString() {
        return this.a;
    }

    private static boolean a(String string, int n2) {
        boolean bl2 = false;
        int n3 = string.length();
        while (--n3 >= n2) {
            char c2 = string.charAt(n3);
            if ('0' <= c2 && c2 <= '9') {
                bl2 = true;
                continue;
            }
            if (c2 == '.') {
                if (!bl2) {
                    return false;
                }
                bl2 = false;
                continue;
            }
            return false;
        }
        return bl2;
    }

    public final n c() {
        o o2 = new o(this.d());
        n n2 = (n)c.get(o2);
        if (n2 == null && (n2 = c.putIfAbsent(o2, this)) == null) {
            n2 = this;
        }
        return n2;
    }

    static n a(byte[] byArray) {
        Object object = new o(byArray);
        if ((object = (n)c.get(object)) == null) {
            return new n(byArray);
        }
        return object;
    }
}

