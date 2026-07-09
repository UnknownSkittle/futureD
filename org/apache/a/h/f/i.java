/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.a.e.f;
import org.apache.a.e.g;
import org.apache.a.h.f.b;
import org.apache.a.k;

final class i
extends org.apache.a.g.f
implements g {
    private final b b;

    i(k k2, b b2) {
        super(k2);
        this.b = b2;
    }

    private void b() {
        if (this.b != null) {
            this.b.close();
        }
    }

    private void c() {
        if (this.b != null) {
            this.b.f();
        }
    }

    private void d() {
        if (this.b != null) {
            this.b.e();
        }
    }

    @Override
    public final boolean isRepeatable() {
        return false;
    }

    @Override
    public final InputStream getContent() {
        return new f(this.a.getContent(), this);
    }

    @Override
    public final void writeTo(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                this.a.writeTo(outputStream);
            }
            this.d();
            return;
        } catch (IOException iOException) {
            this.c();
            throw iOException;
        } catch (RuntimeException runtimeException) {
            this.c();
            throw runtimeException;
        } finally {
            this.b();
        }
    }

    @Override
    public final boolean a(InputStream inputStream) {
        try {
            if (inputStream != null) {
                inputStream.close();
            }
            this.d();
        } catch (IOException iOException) {
            this.c();
            throw iOException;
        } catch (RuntimeException runtimeException) {
            this.c();
            throw runtimeException;
        } finally {
            this.b();
        }
        return false;
    }

    @Override
    public final boolean b(InputStream inputStream) {
        try {
            boolean bl2 = this.b != null && !this.b.g();
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                this.d();
            } catch (SocketException socketException) {
                if (bl2) {
                    throw socketException;
                }
            }
        } catch (IOException iOException) {
            this.c();
            throw iOException;
        } catch (RuntimeException runtimeException) {
            this.c();
            throw runtimeException;
        } finally {
            this.b();
        }
        return false;
    }

    @Override
    public final boolean a() {
        this.b();
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResponseEntityProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

