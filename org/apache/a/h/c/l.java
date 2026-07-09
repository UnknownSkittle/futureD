/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.h.c.u;

final class l
extends InputStream {
    private final InputStream a;
    private final u b;

    public l(InputStream inputStream, u u2) {
        this.a = inputStream;
        this.b = u2;
    }

    @Override
    public final int read() {
        try {
            int n2 = this.a.read();
            if (n2 == -1) {
                this.b.b("end of stream");
            } else {
                this.b.b(new byte[]{(byte)n2});
            }
            return n2;
        } catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final int read(byte[] byArray) {
        try {
            int n2 = this.a.read(byArray);
            if (n2 == -1) {
                this.b.b("end of stream");
            } else if (n2 > 0) {
                this.b.b(byArray, 0, n2);
            }
            return n2;
        } catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        try {
            n3 = this.a.read(byArray, n2, n3);
            if (n3 == -1) {
                this.b.b("end of stream");
            } else if (n3 > 0) {
                this.b.b(byArray, n2, n3);
            }
            return n3;
        } catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final long skip(long l2) {
        try {
            return super.skip(l2);
        } catch (IOException iOException) {
            this.b.b("[skip] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final int available() {
        try {
            return this.a.available();
        } catch (IOException iOException) {
            this.b.b("[available] I/O error : " + iOException.getMessage());
            throw iOException;
        }
    }

    @Override
    public final void mark(int n2) {
        super.mark(n2);
    }

    @Override
    public final void reset() {
        super.reset();
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final void close() {
        try {
            this.a.close();
            return;
        } catch (IOException iOException) {
            this.b.b("[close] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }
}

