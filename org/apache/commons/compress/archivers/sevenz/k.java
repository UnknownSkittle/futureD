/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.apache.commons.compress.archivers.sevenz.l;
import org.apache.commons.compress.archivers.sevenz.z;

final class k {
    private static final Map<z, j> a = new l();

    static j a(z z2) {
        return a.get((Object)z2);
    }

    static InputStream a(String string, InputStream inputStream, long l2, i i2) {
        j j2 = k.a(z.a(i2.a));
        if (j2 == null) {
            throw new IOException("Unsupported compression method " + Arrays.toString(i2.a) + " used in " + string);
        }
        return j2.a(string, inputStream, l2, i2);
    }
}

