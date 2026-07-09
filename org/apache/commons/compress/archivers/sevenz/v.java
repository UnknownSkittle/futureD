/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.LZMA2Options
 *  org.tukaani.xz.LZMAInputStream
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.LZMAInputStream;

final class v
extends j {
    v() {
        super(LZMA2Options.class, Number.class);
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        byte by2 = i2.d[0];
        int n2 = v.b(i2);
        if (n2 > 0x7FFFFFF0) {
            throw new IOException("Dictionary larger than 4GiB maximum size used in ".concat(String.valueOf(string)));
        }
        return new LZMAInputStream(inputStream, l2, by2, n2);
    }

    @Override
    final Object a(i i2) {
        int n2 = i2.d[0] & 0xFF;
        int n3 = n2 / 45;
        int n4 = (n2 -= n3 * 9 * 5) / 9;
        LZMA2Options lZMA2Options = new LZMA2Options();
        lZMA2Options.setPb(n3);
        lZMA2Options.setLcLp(n2 -= n4 * 9, n4);
        lZMA2Options.setDictSize(v.b(i2));
        return lZMA2Options;
    }

    private static int b(i i2) {
        return (int)b.a(i2.d, 1, 4);
    }
}

