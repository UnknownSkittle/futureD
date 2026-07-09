/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.apache.commons.compress.archivers.f.c;

public final class a {
    private final boolean a;

    public static boolean a(String object, byte[] byArray, int n2, int n3) {
        try {
            object = ((String)object).getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
        Object object2 = object;
        return org.apache.commons.compress.b.a.a((byte[])object2, ((Object)object2).length, byArray, n2, n3);
    }

    public static byte[] a(String string) {
        try {
            return string.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static String a(byte[] byArray) {
        try {
            return new String(byArray, "US-ASCII");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static String a(byte[] byArray, int n2, int n3) {
        try {
            return new String(byArray, n2, n3, "US-ASCII");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    private static boolean a(byte[] byArray, int n2, byte[] byArray2, int n3, int n4) {
        int n5 = n2 < n4 ? n2 : n4;
        for (int i2 = 0; i2 < n5; ++i2) {
            if (byArray[i2] == byArray2[n3 + i2]) continue;
            return false;
        }
        return n2 == n4;
    }

    public static boolean b(byte[] byArray) {
        for (int i2 = 0; i2 < 512; ++i2) {
            if (byArray[i2] == 0) continue;
            return false;
        }
        return true;
    }

    public static String b(String object) {
        Object object2;
        char[] cArray = ((String)object).toCharArray();
        object = cArray;
        Object object3 = object2 = cArray.length <= 255 ? object : (Object)Arrays.copyOf((char[])object, 255);
        if (((Object)object).length > 255) {
            for (int i2 = 252; i2 < 255; ++i2) {
                object2[i2] = 46;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object4 : object2) {
            Character.UnicodeBlock unicodeBlock;
            if (!Character.isISOControl((char)object4) && (unicodeBlock = Character.UnicodeBlock.of((char)object4)) != null && unicodeBlock != Character.UnicodeBlock.SPECIALS) {
                stringBuilder.append((char)object4);
                continue;
            }
            stringBuilder.append('?');
        }
        return stringBuilder.toString();
    }

    public a(byte[] byArray) {
        this.a = c.a(byArray, 504);
    }

    public final boolean a() {
        return this.a;
    }
}

