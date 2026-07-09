/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import org.bouncycastle.openpgp.ar;

final class as
extends OutputStream {
    private final OutputStream a;
    private final ar b;

    public as(OutputStream outputStream, ar ar2) {
        this.a = outputStream;
        this.b = ar2;
    }

    public final void write(byte[] byArray) {
        this.a.write(byArray);
    }

    public final void write(byte[] byArray, int n2, int n3) {
        this.a.write(byArray, n2, n3);
    }

    public final void write(int n2) {
        this.a.write(n2);
    }

    public final void flush() {
        this.a.flush();
    }

    public final void close() {
        this.b.a();
    }
}

