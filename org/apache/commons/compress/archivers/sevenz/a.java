/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.b;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;

final class a
extends j {
    a() {
        super(new Class[0]);
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        return new b(this, i2, string, inputStream);
    }
}

