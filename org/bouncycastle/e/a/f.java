/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.a;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.e.a.c;
import org.bouncycastle.e.a.d;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.a.g;
import org.bouncycastle.e.k;

public final class f {
    private static final d a = new g();

    public static String a(byte[] byArray) {
        int n2 = byArray.length;
        return k.b(f.a(byArray, 0, n2));
    }

    public static byte[] b(byte[] byArray) {
        return f.a(byArray, 0, byArray.length);
    }

    public static byte[] a(byte[] byArray, int n2, int n3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(byArray, n2, n3, byteArrayOutputStream);
        } catch (Exception exception) {
            throw new e("exception encoding Hex string: " + exception.getMessage(), exception);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] c(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(byArray, byArray.length, byteArrayOutputStream);
        } catch (Exception exception) {
            throw new c("exception decoding Hex data: " + exception.getMessage(), exception);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] a(String string) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(string, byteArrayOutputStream);
        } catch (Exception exception) {
            throw new c("exception decoding Hex string: " + exception.getMessage(), exception);
        }
        return byteArrayOutputStream.toByteArray();
    }
}

