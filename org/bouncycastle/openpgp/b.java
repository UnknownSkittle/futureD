/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.bouncycastle.openpgp.a;

final class b
extends InflaterInputStream {
    private boolean a;
    private /* synthetic */ a b;

    b(a a2, InputStream inputStream, Inflater inflater) {
        this.b = a2;
        super(inputStream, inflater);
        this.a = false;
    }

    protected final void fill() {
        if (this.a) {
            throw new EOFException("Unexpected end of ZIP input stream");
        }
        this.len = this.in.read(this.buf, 0, this.buf.length);
        if (this.len == -1) {
            this.buf[0] = 0;
            this.len = 1;
            this.a = true;
        }
        this.inf.setInput(this.buf, 0, this.len);
    }
}

