/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

public final class Arrays {
    private Arrays() {
    }

    public static int length(byte[] bytes) {
        return bytes != null ? bytes.length : 0;
    }

    public static byte[] clean(byte[] bytes) {
        return (byte[])(Arrays.length(bytes) > 0 ? bytes : null);
    }
}

