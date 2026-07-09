/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.IOException;
import java.util.Calendar;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.g.a;
import org.apache.commons.compress.archivers.g.ai;
import org.apache.commons.compress.archivers.g.ak;
import org.apache.commons.compress.archivers.g.at;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.aw;
import org.apache.commons.compress.archivers.g.s;
import org.apache.commons.compress.archivers.g.w;
import org.apache.commons.compress.archivers.g.x;

public abstract class ay {
    private static final byte[] a = av.a(8448L);

    static void a(Calendar calendar, long l2, byte[] byArray) {
        calendar.setTimeInMillis(l2);
        int n2 = calendar.get(1);
        if (n2 < 1980) {
            System.arraycopy(a, 0, byArray, 12, a.length);
            return;
        }
        int n3 = calendar.get(2) + 1;
        av.a(n2 - 1980 << 25 | n3 << 21 | calendar.get(5) << 16 | calendar.get(11) << 11 | calendar.get(12) << 5 | calendar.get(13) >> 1, byArray, 12);
    }

    public static byte[] a(byte[] byArray) {
        int n2 = byArray.length - 1;
        for (int i2 = 0; i2 < byArray.length / 2; ++i2) {
            byte by2 = byArray[i2];
            byArray[i2] = byArray[n2 - i2];
            byArray[n2 - i2] = by2;
        }
        return byArray;
    }

    public static int a(byte by2) {
        if (by2 >= 0) {
            return by2;
        }
        return by2 + 256;
    }

    public static byte a(int n2) {
        if (n2 > 255 || n2 < 0) {
            throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + n2 + "]");
        }
        if (n2 < 128) {
            return (byte)n2;
        }
        return (byte)(n2 - 256);
    }

    public static long a(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, (int)(l2 >> 25 & 0x7FL) + 1980);
        calendar.set(2, (int)(l2 >> 21 & 0xFL) - 1);
        calendar.set(5, (int)(l2 >> 16) & 0x1F);
        calendar.set(11, (int)(l2 >> 11) & 0x1F);
        calendar.set(12, (int)(l2 >> 5) & 0x3F);
        calendar.set(13, (int)(l2 << 1) & 0x3E);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    static void a(ai ai2, byte[] object) {
        String string = ay.a((s)ai2.a(s.a), object);
        object = string;
        if (string != null) {
            ai2.a((String)object);
            ai2.b(ak.c);
        }
    }

    private static String a(a a2, byte[] byArray) {
        if (a2 != null) {
            CRC32 cRC32 = new CRC32();
            cRC32.update(byArray);
            if (cRC32.getValue() == a2.a_()) {
                try {
                    return at.a.a(a2.b());
                } catch (IOException iOException) {
                    return null;
                }
            }
        }
        return null;
    }

    static byte[] b(byte[] byArray) {
        if (byArray != null) {
            byte[] byArray2 = new byte[byArray.length];
            System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return null;
    }

    static boolean a(ai ai2) {
        return ay.c(ai2) && ay.d(ai2);
    }

    private static boolean c(ai ai2) {
        return !ai2.g().e();
    }

    private static boolean d(ai ai2) {
        return ai2.getMethod() == 0 || ai2.getMethod() == aw.b.a() || ai2.getMethod() == aw.c.a() || ai2.getMethod() == 8 || ai2.getMethod() == aw.e.a() || ai2.getMethod() == aw.f.a();
    }

    static void b(ai ai2) {
        if (!ay.c(ai2)) {
            throw new w(x.a, ai2);
        }
        if (!ay.d(ai2)) {
            aw aw2 = aw.a(ai2.getMethod());
            if (aw2 == null) {
                throw new w(x.b, ai2);
            }
            throw new w(aw2, ai2);
        }
    }
}

