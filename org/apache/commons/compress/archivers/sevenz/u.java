/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.LZMA2InputStream
 *  org.tukaani.xz.LZMA2Options
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.tukaani.xz.LZMA2InputStream;
import org.tukaani.xz.LZMA2Options;

final class u
extends j {
    u() {
        super(LZMA2Options.class, Number.class);
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        try {
            int n2 = u.b(i2);
            return new LZMA2InputStream(inputStream, n2);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(illegalArgumentException.getMessage());
        }
    }

    @Override
    final Object a(i i2) {
        return u.b(i2);
    }

    private static int b(i i2) {
        int n2 = 0xFF & i2.d[0];
        if ((n2 & 0xFFFFFFC0) != 0) {
            throw new IllegalArgumentException("Unsupported LZMA2 property bits");
        }
        if (n2 > 40) {
            throw new IllegalArgumentException("Dictionary larger than 4GiB maximum size");
        }
        if (n2 == 40) {
            return -1;
        }
        return (2 | n2 & 1) << n2 / 2 + 11;
    }
}

