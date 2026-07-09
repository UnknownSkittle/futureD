/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.i.g;

public final class n
extends OutputStream {
    private final g a;
    private boolean b = false;

    public n(g g2) {
        this.a = ai.a(g2, "Session output buffer");
    }

    @Override
    public final void close() {
        if (!this.b) {
            this.b = true;
            this.a.c();
        }
    }

    @Override
    public final void flush() {
        this.a.c();
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.a(byArray, n2, n3);
    }

    @Override
    public final void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public final void write(int n2) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.a(n2);
    }
}

