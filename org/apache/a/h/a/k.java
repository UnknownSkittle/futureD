/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

final class k
extends OutputStream {
    private final MessageDigest a;
    private boolean b;
    private byte[] c;

    k(MessageDigest messageDigest) {
        this.a = messageDigest;
        this.a.reset();
    }

    @Override
    public final void write(int n2) {
        if (this.b) {
            throw new IOException("Stream has been already closed");
        }
        this.a.update((byte)n2);
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        if (this.b) {
            throw new IOException("Stream has been already closed");
        }
        this.a.update(byArray, n2, n3);
    }

    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = this.a.digest();
        super.close();
    }

    public final byte[] a() {
        return this.c;
    }
}

