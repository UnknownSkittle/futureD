/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.b;

import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

final class c
extends InflaterInputStream {
    private boolean a = false;

    public c(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    @Override
    public final void close() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.inf.end();
        super.close();
    }
}

