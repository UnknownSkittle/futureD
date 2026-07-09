/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.b;

import java.io.OutputStream;

public final class c
extends OutputStream {
    private OutputStream a;
    private OutputStream b;

    public c(OutputStream outputStream, OutputStream outputStream2) {
        this.a = outputStream;
        this.b = outputStream2;
    }

    public final void write(byte[] byArray) {
        this.a.write(byArray);
        this.b.write(byArray);
    }

    public final void write(byte[] byArray, int n2, int n3) {
        this.a.write(byArray, n2, n3);
        this.b.write(byArray, n2, n3);
    }

    public final void write(int n2) {
        this.a.write(n2);
        this.b.write(n2);
    }

    public final void flush() {
        this.a.flush();
        this.b.flush();
    }

    public final void close() {
        this.a.close();
        this.b.close();
    }
}

