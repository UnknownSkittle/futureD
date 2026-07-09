/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.DeltaOptions
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.tukaani.xz.DeltaOptions;

final class s
extends j {
    s() {
        super(Number.class);
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        return new DeltaOptions(s.b(i2)).getInputStream(inputStream);
    }

    @Override
    final Object a(i i2) {
        return s.b(i2);
    }

    private static int b(i i2) {
        if (i2.d == null || i2.d.length == 0) {
            return 1;
        }
        return (0xFF & i2.d[0]) + 1;
    }
}

