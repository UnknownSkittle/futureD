/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import org.apache.a.e.g;

public final class f
extends InputStream {
    private InputStream a;
    private boolean b;
    private final g c;

    public f(InputStream inputStream, g g2) {
        ai.a(inputStream, "Wrapped stream");
        this.a = inputStream;
        this.b = false;
        this.c = g2;
    }

    private boolean a() {
        if (this.b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.a != null;
    }

    @Override
    public final int read() {
        int n2 = -1;
        if (this.a()) {
            try {
                n2 = this.a.read();
                this.a(n2);
            } catch (IOException iOException) {
                this.b();
                throw iOException;
            }
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = -1;
        if (this.a()) {
            try {
                n4 = this.a.read(byArray, n2, n3);
                this.a(n4);
            } catch (IOException iOException) {
                this.b();
                throw iOException;
            }
        }
        return n4;
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public final int available() {
        int n2 = 0;
        if (this.a()) {
            try {
                n2 = this.a.available();
            } catch (IOException iOException) {
                this.b();
                throw iOException;
            }
        }
        return n2;
    }

    @Override
    public final void close() {
        this.b = true;
        f f2 = this;
        InputStream inputStream = f2.a;
        if (inputStream != null) {
            try {
                boolean bl2 = true;
                if (f2.c != null) {
                    bl2 = f2.c.b(inputStream);
                }
                if (bl2) {
                    inputStream.close();
                }
                return;
            } finally {
                f2.a = null;
            }
        }
    }

    private void a(int n2) {
        InputStream inputStream = this.a;
        if (inputStream != null && n2 < 0) {
            try {
                n2 = 1;
                if (this.c != null) {
                    n2 = this.c.a(inputStream) ? 1 : 0;
                }
                if (n2 != 0) {
                    inputStream.close();
                }
                return;
            } finally {
                this.a = null;
            }
        }
    }

    private void b() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                boolean bl2 = true;
                if (this.c != null) {
                    bl2 = this.c.a();
                }
                if (bl2) {
                    inputStream.close();
                }
                return;
            } finally {
                this.a = null;
            }
        }
    }
}

