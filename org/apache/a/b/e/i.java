/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.a.b.b.d;

final class i
implements d {
    i() {
    }

    @Override
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}

