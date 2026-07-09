/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.h.c.u;

final class n
extends OutputStream {
    private final OutputStream a;
    private final u b;

    public n(OutputStream outputStream, u u2) {
        this.a = outputStream;
        this.b = u2;
    }

    @Override
    public final void write(int n2) {
        try {
            this.b.a(new byte[]{(byte)n2});
            return;
        } catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final void write(byte[] byArray) {
        try {
            this.b.a(byArray);
            this.a.write(byArray);
            return;
        } catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        try {
            this.b.a(byArray, n2, n3);
            this.a.write(byArray, n2, n3);
            return;
        } catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final void flush() {
        try {
            this.a.flush();
            return;
        } catch (IOException iOException) {
            this.b.a("[flush] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final void close() {
        try {
            this.a.close();
            return;
        } catch (IOException iOException) {
            this.b.a("[close] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }
}

