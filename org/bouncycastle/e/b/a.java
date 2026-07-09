/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {
    private static int a = 4096;

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        org.bouncycastle.e.b.a.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int a(InputStream inputStream, byte[] byArray) {
        return org.bouncycastle.e.b.a.a(inputStream, byArray, 0, byArray.length);
    }

    public static int a(InputStream inputStream, byte[] byArray, int n2, int n3) {
        int n4;
        int n5;
        for (n4 = 0; n4 < n3 && (n5 = inputStream.read(byArray, n2 + n4, n3 - n4)) >= 0; n4 += n5) {
        }
        return n4;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] byArray = new byte[a];
        while ((n2 = inputStream.read(byArray, 0, byArray.length)) >= 0) {
            outputStream.write(byArray, 0, n2);
        }
    }
}

