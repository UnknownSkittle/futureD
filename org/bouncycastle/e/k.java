/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import org.bouncycastle.e.j;
import org.bouncycastle.e.l;
import org.bouncycastle.e.m;

public final class k {
    private static String a;

    public static String a(byte[] byArray) {
        int n2 = 0;
        int n3 = 0;
        while (n2 < byArray.length) {
            ++n3;
            if ((byArray[n2] & 0xF0) == 240) {
                ++n3;
                n2 += 4;
                continue;
            }
            if ((byArray[n2] & 0xE0) == 224) {
                n2 += 3;
                continue;
            }
            if ((byArray[n2] & 0xC0) == 192) {
                n2 += 2;
                continue;
            }
            ++n2;
        }
        char[] cArray = new char[n3];
        n2 = 0;
        n3 = 0;
        while (n2 < byArray.length) {
            int n4;
            if ((byArray[n2] & 0xF0) == 240) {
                n4 = ((byArray[n2] & 3) << 18 | (byArray[n2 + 1] & 0x3F) << 12 | (byArray[n2 + 2] & 0x3F) << 6 | byArray[n2 + 3] & 0x3F) - 65536;
                char c2 = (char)(0xD800 | n4 >> 10);
                n4 = (char)(0xDC00 | n4 & 0x3FF);
                cArray[n3++] = c2;
                n2 += 4;
            } else if ((byArray[n2] & 0xE0) == 224) {
                n4 = (char)((byArray[n2] & 0xF) << 12 | (byArray[n2 + 1] & 0x3F) << 6 | byArray[n2 + 2] & 0x3F);
                n2 += 3;
            } else if ((byArray[n2] & 0xD0) == 208) {
                n4 = (char)((byArray[n2] & 0x1F) << 6 | byArray[n2 + 1] & 0x3F);
                n2 += 2;
            } else if ((byArray[n2] & 0xC0) == 192) {
                n4 = (char)((byArray[n2] & 0x1F) << 6 | byArray[n2 + 1] & 0x3F);
                n2 += 2;
            } else {
                n4 = byArray[n2] & 0xFF;
                ++n2;
            }
            cArray[n3++] = n4;
        }
        return new String(cArray);
    }

    public static byte[] a(String string) {
        return k.a(string.toCharArray());
    }

    public static byte[] a(char[] cArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            k.a(cArray, byteArrayOutputStream);
        } catch (IOException iOException) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(char[] cArray, OutputStream outputStream) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            int n2 = cArray[i2];
            if (n2 < 128) {
                outputStream.write(n2);
                continue;
            }
            if (n2 < 2048) {
                outputStream.write(0xC0 | n2 >> 6);
                outputStream.write(0x80 | n2 & 0x3F);
                continue;
            }
            if (n2 >= 55296 && n2 <= 57343) {
                if (i2 + 1 >= cArray.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int n3 = n2;
                n2 = cArray[++i2];
                if (n3 > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                n2 = ((n3 & 0x3FF) << 10 | n2 & 0x3FF) + 65536;
                outputStream.write(0xF0 | n2 >> 18);
                outputStream.write(0x80 | n2 >> 12 & 0x3F);
                outputStream.write(0x80 | n2 >> 6 & 0x3F);
                outputStream.write(0x80 | n2 & 0x3F);
                continue;
            }
            outputStream.write(0xE0 | n2 >> 12);
            outputStream.write(0x80 | n2 >> 6 & 0x3F);
            outputStream.write(0x80 | n2 & 0x3F);
        }
    }

    public static String b(String string) {
        boolean bl2 = false;
        char[] cArray = string.toCharArray();
        for (int i2 = 0; i2 != cArray.length; ++i2) {
            char c2 = cArray[i2];
            if ('a' > c2 || 'z' < c2) continue;
            bl2 = true;
            cArray[i2] = (char)(c2 - 97 + 65);
        }
        if (bl2) {
            return new String(cArray);
        }
        return string;
    }

    public static String c(String string) {
        boolean bl2 = false;
        char[] cArray = string.toCharArray();
        for (int i2 = 0; i2 != cArray.length; ++i2) {
            char c2 = cArray[i2];
            if ('A' > c2 || 'Z' < c2) continue;
            bl2 = true;
            cArray[i2] = (char)(c2 - 65 + 97);
        }
        if (bl2) {
            return new String(cArray);
        }
        return string;
    }

    public static byte[] d(String string) {
        byte[] byArray = new byte[string.length()];
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            char c2 = string.charAt(i2);
            byArray[i2] = (byte)c2;
        }
        return byArray;
    }

    public static String b(byte[] byArray) {
        return new String(k.c(byArray));
    }

    private static char[] c(byte[] byArray) {
        char[] cArray = new char[byArray.length];
        for (int i2 = 0; i2 != cArray.length; ++i2) {
            cArray[i2] = (char)(byArray[i2] & 0xFF);
        }
        return cArray;
    }

    public static j a() {
        return new m(0);
    }

    public static String b() {
        return a;
    }

    static {
        try {
            a = AccessController.doPrivileged(new l());
        } catch (Exception exception) {
            try {
                a = String.format("%n", new Object[0]);
            } catch (Exception exception2) {
                a = "\n";
            }
        }
    }
}

