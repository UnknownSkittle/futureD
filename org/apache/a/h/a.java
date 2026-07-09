/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.a.h.e.b;
import org.apache.a.h.g.c;
import org.apache.a.h.g.d;
import org.apache.a.h.g.e;
import org.apache.a.h.g.f;
import org.apache.a.h.g.k;
import org.apache.a.h.g.l;
import org.apache.a.h.g.m;
import org.apache.a.h.g.n;
import org.apache.a.h.g.o;
import org.apache.a.h.g.p;
import org.apache.a.i.g;
import org.apache.a.j;

public class a
implements j,
org.apache.a.o {
    private final o a;
    private final p b;
    private final org.apache.a.d.d c;
    private final org.apache.a.h.f d;
    private final org.apache.a.g.d e;
    private final org.apache.a.g.d f;
    private final AtomicReference<Socket> g;

    protected a(int n2, org.apache.a.g.d d2, org.apache.a.g.d d3) {
        ai.a(8192, "Buffer size");
        l l2 = new l();
        l l3 = new l();
        this.a = new o(l2, org.apache.a.d.d.a);
        this.b = new p(l3, n2);
        this.c = null;
        this.d = new org.apache.a.h.f(l2, l3);
        this.e = d2 != null ? d2 : org.apache.a.h.e.a.a;
        this.f = d3 != null ? d3 : org.apache.a.h.e.b.a;
        this.g = new AtomicReference();
    }

    protected final void j() {
        Socket socket = this.g.get();
        if (socket == null) {
            throw new org.apache.a.a("Connection is closed");
        }
        if (!this.a.a()) {
            this.a.a(this.b(socket));
        }
        if (!this.b.a()) {
            this.b.a(this.c(socket));
        }
    }

    protected InputStream b(Socket socket) {
        return socket.getInputStream();
    }

    protected OutputStream c(Socket socket) {
        return socket.getOutputStream();
    }

    protected void a(Socket socket) {
        ai.a(socket, "Socket");
        this.g.set(socket);
        this.a.a((InputStream)null);
        this.b.a((OutputStream)null);
    }

    protected final org.apache.a.i.f k() {
        return this.a;
    }

    protected final g l() {
        return this.b;
    }

    protected final void m() {
        this.b.c();
    }

    @Override
    public final boolean c() {
        return this.g.get() != null;
    }

    protected Socket h() {
        return this.g.get();
    }

    protected final OutputStream a(org.apache.a.p object) {
        long l2 = this.f.a((org.apache.a.p)object);
        object = this.b;
        long l3 = l2;
        if (l2 == -2L) {
            return new d((g)object);
        }
        if (l3 == -1L) {
            return new n((g)object);
        }
        return new f((g)object, l3);
    }

    protected final org.apache.a.k b(org.apache.a.p object) {
        org.apache.a.g.b b2 = new org.apache.a.g.b();
        long l2 = this.e.a((org.apache.a.p)object);
        Object object2 = this.a;
        long l3 = l2;
        Object object3 = l2 == -2L ? new c((org.apache.a.i.f)object2, null) : (l3 == -1L ? new m((org.apache.a.i.f)object2) : (object2 = l3 == 0L ? k.a : new e((org.apache.a.i.f)object2, l3)));
        if (l2 == -2L) {
            b2.setChunked(true);
            b2.a(-1L);
            b2.a((InputStream)object2);
        } else if (l2 == -1L) {
            b2.setChunked(false);
            b2.a(-1L);
            b2.a((InputStream)object2);
        } else {
            b2.setChunked(false);
            b2.a(l2);
            b2.a((InputStream)object2);
        }
        org.apache.a.e e2 = object.c("Content-Type");
        if (e2 != null) {
            b2.setContentType(e2);
        }
        if ((object = object.c("Content-Encoding")) != null) {
            b2.setContentEncoding((org.apache.a.e)object);
        }
        return b2;
    }

    @Override
    public final InetAddress f() {
        Socket socket = this.g.get();
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    @Override
    public final int g() {
        Socket socket = this.g.get();
        if (socket != null) {
            return socket.getPort();
        }
        return -1;
    }

    @Override
    public void b(int n2) {
        Socket socket = this.g.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(n2);
                return;
            } catch (SocketException socketException) {}
        }
    }

    @Override
    public void e() {
        Socket socket = this.g.getAndSet(null);
        if (socket != null) {
            try {
                socket.setSoLinger(true, 0);
                return;
            } catch (IOException iOException) {
                return;
            } finally {
                socket.close();
            }
        }
    }

    @Override
    public void close() {
        Socket socket = this.g.getAndSet(null);
        if (socket != null) {
            try {
                this.a.e();
                this.b.c();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException iOException) {}
                    try {
                        socket.shutdownInput();
                    } catch (IOException iOException) {
                    }
                } catch (UnsupportedOperationException unsupportedOperationException) {}
                return;
            } finally {
                socket.close();
            }
        }
    }

    private int a(int n2) {
        Socket socket = this.g.get();
        int n3 = socket.getSoTimeout();
        try {
            socket.setSoTimeout(n2);
            n2 = this.a.c();
            return n2;
        } finally {
            socket.setSoTimeout(n3);
        }
    }

    protected final boolean c(int n2) {
        if (this.a.d()) {
            return true;
        }
        this.a(n2);
        return this.a.d();
    }

    @Override
    public final boolean d() {
        if (!this.c()) {
            return true;
        }
        try {
            return this.a(1) < 0;
        } catch (SocketTimeoutException socketTimeoutException) {
            return false;
        } catch (IOException iOException) {
            return true;
        }
    }

    protected final void n() {
        this.d.a();
    }

    protected final void o() {
        this.d.b();
    }

    public String toString() {
        Object object = this.g.get();
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder();
            SocketAddress socketAddress = ((Socket)object).getRemoteSocketAddress();
            object = ((Socket)object).getLocalSocketAddress();
            if (socketAddress != null && object != null) {
                ai.a(stringBuilder, (SocketAddress)object);
                stringBuilder.append("<->");
                ai.a(stringBuilder, socketAddress);
            }
            return stringBuilder.toString();
        }
        return "[Not bound]";
    }
}

