/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.FilterOptions
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.tukaani.xz.FilterOptions;

final class m
extends j {
    private final FilterOptions a;

    m(FilterOptions filterOptions) {
        super(new Class[0]);
        this.a = filterOptions;
    }

    @Override
    final InputStream a(String string, InputStream inputStream, long l2, i i2) {
        try {
            return this.a.getInputStream(inputStream);
        } catch (AssertionError assertionError) {
            throw new IOException("BCJ filter used in " + string + " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z", (Throwable)((Object)assertionError));
        }
    }
}

