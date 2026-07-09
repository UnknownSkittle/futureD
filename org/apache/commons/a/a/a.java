/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.a.a;

import java.nio.charset.Charset;
import org.apache.commons.a.a.b;
import org.apache.commons.a.a.c;

public final class a
extends b {
    private static byte[] a = new byte[]{13, 10};
    private static final byte[] b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] c = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] d;
    private final byte[] e = c;
    private final byte[] f;
    private final int g;
    private final int h;

    public a() {
        this(0);
    }

    public a(byte by2) {
        this(a);
    }

    private a(byte[] byArray) {
        this(byArray, 0);
    }

    private a(byte[] object, byte by2) {
        super(object == null ? 0 : ((byte[])object).length);
        if (object != null) {
            if (this.d((byte[])object)) {
                byte[] byArray = object;
                object = org.apache.commons.a.a.a;
                Object object2 = byArray;
                object2 = byArray == null ? null : new String((byte[])object2, (Charset)object);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + (String)object2 + "]");
            }
            this.h = 4;
            this.f = null;
        } else {
            this.h = 4;
            this.f = null;
        }
        this.g = 3;
        this.d = b;
    }

    @Override
    final void a(byte[] byArray, int n2, int n3, c c2) {
        if (c2.e) {
            return;
        }
        if (n3 < 0) {
            c2.e = true;
            if (c2.g == 0) {
                return;
            }
            byte[] byArray2 = org.apache.commons.a.a.a.a(4, c2);
            int n4 = c2.c;
            switch (c2.g) {
                case 0: {
                    break;
                }
                case 1: {
                    byArray2[c2.c++] = this.d[c2.a >> 2 & 0x3F];
                    byArray2[c2.c++] = this.d[c2.a << 4 & 0x3F];
                    if (this.d != b) break;
                    byArray2[c2.c++] = 61;
                    byArray2[c2.c++] = 61;
                    break;
                }
                case 2: {
                    byArray2[c2.c++] = this.d[c2.a >> 10 & 0x3F];
                    byArray2[c2.c++] = this.d[c2.a >> 4 & 0x3F];
                    byArray2[c2.c++] = this.d[c2.a << 2 & 0x3F];
                    if (this.d != b) break;
                    byArray2[c2.c++] = 61;
                    break;
                }
                default: {
                    throw new IllegalStateException("Impossible modulus " + c2.g);
                }
            }
            c2.f += c2.c - n4;
            return;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5;
            byte[] byArray3 = org.apache.commons.a.a.a.a(4, c2);
            c2.g = (c2.g + 1) % 3;
            if ((n5 = byArray[n2++]) < 0) {
                n5 += 256;
            }
            c2.a = (c2.a << 8) + n5;
            if (c2.g != 0) continue;
            byArray3[c2.c++] = this.d[c2.a >> 18 & 0x3F];
            byArray3[c2.c++] = this.d[c2.a >> 12 & 0x3F];
            byArray3[c2.c++] = this.d[c2.a >> 6 & 0x3F];
            byArray3[c2.c++] = this.d[c2.a & 0x3F];
            c2.f += 4;
        }
    }

    @Override
    final void b(byte[] byArray, int n2, int n3, c c2) {
        if (c2.e) {
            return;
        }
        if (n3 < 0) {
            c2.e = true;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by2;
            byte[] byArray2 = org.apache.commons.a.a.a.a(3, c2);
            if ((by2 = byArray[n2++]) == 61) {
                c2.e = true;
                break;
            }
            if (by2 < 0 || by2 >= 123 || (by2 = c[by2]) < 0) continue;
            c2.g = (c2.g + 1) % 4;
            c2.a = (c2.a << 6) + by2;
            if (c2.g != 0) continue;
            byArray2[c2.c++] = (byte)(c2.a >> 16);
            byArray2[c2.c++] = (byte)(c2.a >> 8);
            byArray2[c2.c++] = (byte)c2.a;
        }
        if (c2.e && c2.g != 0) {
            byte[] byArray3 = org.apache.commons.a.a.a.a(3, c2);
            switch (c2.g) {
                case 1: {
                    return;
                }
                case 2: {
                    c2.a >>= 4;
                    byArray3[c2.c++] = (byte)c2.a;
                    return;
                }
                case 3: {
                    c2.a >>= 2;
                    byArray3[c2.c++] = (byte)(c2.a >> 8);
                    byArray3[c2.c++] = (byte)c2.a;
                    return;
                }
            }
            throw new IllegalStateException("Impossible modulus " + c2.g);
        }
    }

    public static byte[] a(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return byArray;
        }
        a a2 = new a(a, 0);
        long l2 = (long)((byArray.length + 3 - 1) / 3) << 2;
        if (l2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l2 + ") than the specified maximum size of 2147483647");
        }
        return a2.c(byArray);
    }

    public static byte[] b(byte[] object) {
        byte[] byArray = object;
        object = new a();
        if (byArray == null || byArray.length == 0) {
            return byArray;
        }
        c c2 = new c();
        ((b)object).b(byArray, 0, byArray.length, c2);
        ((b)object).b(byArray, 0, -1, c2);
        byArray = new byte[c2.c];
        org.apache.commons.a.a.b.a(byArray, byArray.length, c2);
        return byArray;
    }

    @Override
    protected final boolean a(byte by2) {
        return by2 >= 0 && by2 < this.e.length && this.e[by2] != -1;
    }
}

