/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import org.apache.commons.compress.a.b.a;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;

final class p
extends j {
    p() {
        super(Number.class);
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        return new a(inputStream);
    }
}

