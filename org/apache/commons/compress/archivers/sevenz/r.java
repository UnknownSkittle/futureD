/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

final class r
extends InputStream {
    private InflaterInputStream a;
    private Inflater b;

    public r(InflaterInputStream inflaterInputStream, Inflater inflater) {
        this.a = inflaterInputStream;
        this.b = inflater;
    }

    @Override
    public final int read() {
        return this.a.read();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        return this.a.read(byArray, n2, n3);
    }

    @Override
    public final int read(byte[] byArray) {
        return this.a.read(byArray);
    }

    @Override
    public final void close() {
        try {
            this.a.close();
            return;
        } finally {
            this.b.end();
        }
    }
}

