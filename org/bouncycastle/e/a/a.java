/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.a;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.e.a.b;
import org.bouncycastle.e.a.c;
import org.bouncycastle.e.a.d;

public final class a {
    private static final d a = new b();

    public static byte[] a(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(6);
        try {
            a.a(byArray, 8, byteArrayOutputStream);
        } catch (Exception exception) {
            throw new c("unable to decode base64 data: " + exception.getMessage(), exception);
        }
        return byteArrayOutputStream.toByteArray();
    }
}

