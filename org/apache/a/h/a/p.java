/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.a.c;
import org.apache.a.h.a.n;
import org.apache.a.h.a.o;
import org.apache.a.h.a.r;
import org.apache.a.h.a.s;
import org.apache.a.h.a.u;
import org.apache.a.h.a.v;
import org.apache.a.h.a.w;

final class p
implements n {
    private static final Charset a = ai.a("UnicodeLittleUnmarked");
    private static final Charset b = org.apache.a.c.b;
    private static final SecureRandom c;
    private static final byte[] d;
    private static final String e;

    p() {
    }

    private static String e(String string) {
        if (string == null) {
            return null;
        }
        int n2 = string.indexOf(".");
        if (n2 != -1) {
            return string.substring(0, n2);
        }
        return string;
    }

    private static int d(byte[] byArray, int n2) {
        if (byArray.length < n2 + 4) {
            throw new o("NTLM authentication - buffer too small for DWORD");
        }
        return byArray[n2] & 0xFF | (byArray[n2 + 1] & 0xFF) << 8 | (byArray[n2 + 2] & 0xFF) << 16 | (byArray[n2 + 3] & 0xFF) << 24;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] g() {
        if (c == null) {
            throw new o("Random generator not available");
        }
        byte[] byArray = new byte[8];
        SecureRandom secureRandom = c;
        synchronized (secureRandom) {
            c.nextBytes(byArray);
        }
        return byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] h() {
        if (c == null) {
            throw new o("Random generator not available");
        }
        byte[] byArray = new byte[16];
        SecureRandom secureRandom = c;
        synchronized (secureRandom) {
            c.nextBytes(byArray);
        }
        return byArray;
    }

    static byte[] a(byte[] byArray, byte[] object) {
        r r2 = new r((byte[])object);
        object = r2;
        r2.a(byArray);
        return ((r)object).a();
    }

    static byte[] b(byte[] byArray, byte[] byArray2) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(byArray2, "RC4"));
            return cipher.doFinal(byArray);
        } catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    static byte[] a(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray2);
            messageDigest.update(byArray3);
            byArray2 = messageDigest.digest();
            byArray3 = new byte[8];
            System.arraycopy(byArray2, 0, byArray3, 0, 8);
            return p.d(byArray, byArray3);
        } catch (Exception exception) {
            Exception exception2 = exception;
            if (exception instanceof o) {
                throw (o)exception2;
            }
            throw new o(exception2.getMessage(), exception2);
        }
    }

    private static byte[] f(String object) {
        try {
            byte[] byArray = ((String)object).toUpperCase(Locale.ROOT).getBytes(org.apache.a.c.b);
            object = byArray;
            int n2 = Math.min(byArray.length, 14);
            byte[] byArray2 = new byte[14];
            System.arraycopy(object, 0, byArray2, 0, n2);
            object = p.e(byArray2, 0);
            Object object2 = p.e(byArray2, 7);
            byArray2 = "KGS!@#$%".getBytes(org.apache.a.c.b);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, (Key)object);
            object = cipher.doFinal(byArray2);
            cipher.init(1, (Key)object2);
            object2 = cipher.doFinal(byArray2);
            byArray2 = new byte[16];
            System.arraycopy(object, 0, byArray2, 0, 8);
            System.arraycopy(object2, 0, byArray2, 8, 8);
            return byArray2;
        } catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    private static byte[] d(byte[] object, byte[] byArray) {
        try {
            Object object2 = new byte[21];
            System.arraycopy(object, 0, object2, 0, 16);
            object = p.e(object2, 0);
            Object object3 = p.e(object2, 7);
            object2 = p.e(object2, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, (Key)object);
            object = cipher.doFinal(byArray);
            cipher.init(1, (Key)object3);
            object3 = cipher.doFinal(byArray);
            cipher.init(1, (Key)object2);
            byArray = cipher.doFinal(byArray);
            object2 = new byte[24];
            System.arraycopy(object, 0, object2, 0, 8);
            System.arraycopy(object3, 0, object2, 8, 8);
            System.arraycopy(byArray, 0, object2, 16, 8);
            return object2;
        } catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    private static Key e(byte[] byArray, int n2) {
        byte[] byArray2 = new byte[7];
        System.arraycopy(byArray, n2, byArray2, 0, 7);
        byte[] byArray3 = new byte[8];
        byArray = byArray3;
        byArray3[0] = byArray2[0];
        byArray[1] = (byte)(byArray2[0] << 7 | (byArray2[1] & 0xFF) >>> 1);
        byArray[2] = (byte)(byArray2[1] << 6 | (byArray2[2] & 0xFF) >>> 2);
        byArray[3] = (byte)(byArray2[2] << 5 | (byArray2[3] & 0xFF) >>> 3);
        byArray[4] = (byte)(byArray2[3] << 4 | (byArray2[4] & 0xFF) >>> 4);
        byArray[5] = (byte)(byArray2[4] << 3 | (byArray2[5] & 0xFF) >>> 5);
        byArray[6] = (byte)(byArray2[5] << 2 | (byArray2[6] & 0xFF) >>> 6);
        byArray[7] = (byte)(byArray2[6] << 1);
        p.a(byArray);
        return new SecretKeySpec(byArray, "DES");
    }

    private static void a(byte[] byArray) {
        for (int i2 = 0; i2 < 8; ++i2) {
            byte by2 = byArray[i2];
            if (((by2 >>> 7 ^ by2 >>> 6 ^ by2 >>> 5 ^ by2 >>> 4 ^ by2 >>> 3 ^ by2 >>> 2 ^ by2 >>> 1) & 1) == 0) {
                int n2 = i2;
                byArray[n2] = (byte)(byArray[n2] | 1);
                continue;
            }
            int n3 = i2;
            byArray[n3] = (byte)(byArray[n3] & 0xFFFFFFFE);
        }
    }

    static void a(byte[] byArray, int n2, int n3) {
        byArray[n3] = (byte)n2;
        byArray[n3 + 1] = (byte)(n2 >> 8);
        byArray[n3 + 2] = (byte)(n2 >> 16);
        byArray[n3 + 3] = (byte)(n2 >>> 24);
    }

    static int a(int n2, int n3, int n4) {
        return n2 & n3 | ~n2 & n4;
    }

    static int b(int n2, int n3, int n4) {
        return n2 & n3 | n2 & n4 | n3 & n4;
    }

    static int c(int n2, int n3, int n4) {
        return n2 ^ n3 ^ n4;
    }

    static int a(int n2, int n3) {
        return n2 << n3 | n2 >>> 32 - n3;
    }

    @Override
    public final String a() {
        return e;
    }

    @Override
    public final String a(String string, String string2, String string3, String string4, String object) {
        object = new v((String)object);
        String string5 = string4;
        byte[] byArray = ((v)object).e();
        String string6 = ((v)object).d();
        int n2 = ((v)object).f();
        object = ((v)object).c();
        string4 = string3;
        string3 = string5;
        return new w(string4, string3, string, string2, (byte[])object, n2, string6, byArray).b();
    }

    static /* synthetic */ byte[] b() {
        return p.g();
    }

    static /* synthetic */ byte[] c() {
        return p.h();
    }

    static /* synthetic */ byte[] a(String string) {
        return p.f(string);
    }

    static /* synthetic */ byte[] c(byte[] byArray, byte[] byArray2) {
        return p.d(byArray, byArray2);
    }

    static /* synthetic */ byte[] b(String object) {
        if (a == null) {
            throw new o("Unicode not supported");
        }
        object = ((String)object).getBytes(a);
        s s2 = new s();
        s2.a((byte[])object);
        return s2.a();
    }

    static /* synthetic */ byte[] a(String string, String string2, byte[] object) {
        if (a == null) {
            throw new o("Unicode not supported");
        }
        r r2 = new r((byte[])object);
        object = r2;
        r2.a(string2.toUpperCase(Locale.ROOT).getBytes(a));
        if (string != null) {
            ((r)object).a(string.toUpperCase(Locale.ROOT).getBytes(a));
        }
        return ((r)object).a();
    }

    static /* synthetic */ byte[] b(String string, String string2, byte[] object) {
        if (a == null) {
            throw new o("Unicode not supported");
        }
        r r2 = new r((byte[])object);
        object = r2;
        r2.a(string2.toUpperCase(Locale.ROOT).getBytes(a));
        if (string != null) {
            ((r)object).a(string.getBytes(a));
        }
        return ((r)object).a();
    }

    static /* synthetic */ byte[] b(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = new byte[]{1, 1, 0, 0};
        byte[] byArray5 = new byte[]{0, 0, 0, 0};
        byte[] byArray6 = new byte[]{0, 0, 0, 0};
        byte[] byArray7 = new byte[]{0, 0, 0, 0};
        byte[] byArray8 = new byte[8 + byArray3.length + 8 + 4 + byArray2.length + 4];
        System.arraycopy(byArray4, 0, byArray8, 0, 4);
        System.arraycopy(byArray5, 0, byArray8, 4, 4);
        System.arraycopy(byArray3, 0, byArray8, 8, byArray3.length);
        int n2 = 8 + byArray3.length;
        System.arraycopy(byArray, 0, byArray8, n2, 8);
        System.arraycopy(byArray6, 0, byArray8, n2 += 8, 4);
        System.arraycopy(byArray2, 0, byArray8, n2 += 4, byArray2.length);
        System.arraycopy(byArray7, 0, byArray8, n2 += byArray2.length, 4);
        return byArray8;
    }

    static /* synthetic */ byte[] c(byte[] object, byte[] byArray, byte[] byArray2) {
        r r2 = new r((byte[])object);
        object = r2;
        r2.a(byArray);
        object.a(byArray2);
        byte[] byArray3 = object.a();
        object = byArray3;
        byArray = new byte[byArray3.length + byArray2.length];
        System.arraycopy(object, 0, byArray, 0, ((byte[])object).length);
        System.arraycopy(byArray2, 0, byArray, ((byte[])object).length, byArray2.length);
        return byArray;
    }

    static /* synthetic */ Key a(byte[] byArray, int n2) {
        return p.e(byArray, n2);
    }

    static /* synthetic */ Charset d() {
        return b;
    }

    static /* synthetic */ byte[] e() {
        return d;
    }

    static /* synthetic */ int b(byte[] byArray, int n2) {
        return p.d(byArray, n2);
    }

    static /* synthetic */ byte[] c(byte[] byArray, int n2) {
        int n3 = n2;
        byte[] byArray2 = byArray;
        if (byArray.length < n3 + 2) {
            throw new o("NTLM authentication - buffer too small for WORD");
        }
        int n4 = byArray2[n3] & 0xFF | (byArray2[n3 + 1] & 0xFF) << 8;
        if (byArray.length < (n2 = p.d(byArray, n2 + 4)) + n4) {
            throw new o("NTLM authentication - buffer too small for data item");
        }
        byte[] byArray3 = new byte[n4];
        System.arraycopy(byArray, n2, byArray3, 0, n4);
        return byArray3;
    }

    static /* synthetic */ Charset f() {
        return a;
    }

    static /* synthetic */ String c(String string) {
        return p.e(string);
    }

    static /* synthetic */ String d(String string) {
        return p.e(string);
    }

    static {
        Object object = null;
        try {
            object = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception exception) {}
        c = object;
        byte[] byArray = "NTLMSSP".getBytes(org.apache.a.c.b);
        object = byArray;
        d = new byte[byArray.length + 1];
        System.arraycopy(object, 0, d, 0, ((Object)object).length);
        p.d[((Object)object).length] = 0;
        e = new u().b();
    }
}

