/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Closeable;
import java.util.zip.Deflater;

public abstract class q
implements Closeable {
    private final Deflater a;
    private long b;
    private long c;

    public final long a() {
        return this.c;
    }

    @Override
    public void close() {
        this.a.end();
    }

    public final void a(byte[] byArray) {
        this.a(byArray.length);
    }

    public final void a(int n2) {
        this.b += (long)n2;
        this.c += (long)n2;
    }
}

