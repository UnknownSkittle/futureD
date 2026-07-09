/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.f;

import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.g.as;

final class d
implements as {
    d() {
    }

    @Override
    public final boolean a(String string) {
        return true;
    }

    @Override
    public final ByteBuffer b(String string) {
        int n2 = string.length();
        byte[] byArray = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            byArray[i2] = (byte)string.charAt(i2);
        }
        return ByteBuffer.wrap(byArray);
    }

    @Override
    public final String a(byte[] byArray) {
        int n2 = byArray.length;
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (byte by2 : byArray) {
            if (by2 == 0) break;
            stringBuilder.append((char)(by2 & 0xFF));
        }
        return stringBuilder.toString();
    }
}

