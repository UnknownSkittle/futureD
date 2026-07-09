/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import com.a.a.b.ai;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.a.d.h;
import org.apache.a.e.b.a;
import org.apache.a.e.b.b;
import org.apache.a.e.i;
import org.apache.a.e.l;
import org.apache.a.e.m;
import org.apache.a.h.c.k;
import org.apache.a.h.c.t;
import org.apache.a.m.d;
import org.apache.a.n;
import org.apache.commons.c.c;

public final class e
implements i {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final org.apache.a.d.c<a> b;
    private final m c;
    private final org.apache.a.e.e d;

    public e(org.apache.a.d.c<a> c2) {
        ai.a(c2, "Socket factory registry");
        this.b = c2;
        this.c = k.a;
        this.d = t.a;
    }

    private org.apache.a.d.c<a> a(d c2) {
        if ((c2 = (org.apache.a.d.c)c2.a("http.socket-factory-registry")) == null) {
            c2 = this.b;
        }
        return c2;
    }

    @Override
    public final void a(l object, n n2, InetSocketAddress inetSocketAddress, int n3, h h2, d object2) {
        InetAddress[] inetAddressArray;
        if ((object2 = this.a((d)object2).a(n2.c())) == null) {
            throw new org.apache.a.e.n(n2.c() + " protocol is not supported");
        }
        if (n2.d() != null) {
            InetAddress[] inetAddressArray2 = new InetAddress[1];
            inetAddressArray = inetAddressArray2;
            inetAddressArray2[0] = n2.d();
        } else {
            inetAddressArray = this.d.a(n2.a());
        }
        InetAddress[] inetAddressArray3 = inetAddressArray;
        int n4 = this.c.a(n2);
        for (int i2 = 0; i2 < inetAddressArray3.length; ++i2) {
            Serializable serializable;
            block14: {
                serializable = inetAddressArray3[i2];
                boolean bl2 = i2 == inetAddressArray3.length - 1;
                Socket socket = object2.a();
                socket.setSoTimeout(0);
                socket.setReuseAddress(false);
                socket.setTcpNoDelay(h2.b());
                socket.setKeepAlive(false);
                int n5 = h2.a();
                if (n5 >= 0) {
                    socket.setSoLinger(true, n5);
                }
                object.a(socket);
                serializable = new InetSocketAddress((InetAddress)serializable, n4);
                if (this.a.a()) {
                    this.a.a("Connecting to ".concat(String.valueOf(serializable)));
                }
                try {
                    socket = object2.a(n3, socket, n2, (InetSocketAddress)serializable, inetSocketAddress);
                    object.a(socket);
                    if (this.a.a()) {
                        this.a.a("Connection established ".concat(String.valueOf(object)));
                    }
                    return;
                } catch (SocketTimeoutException socketTimeoutException) {
                    if (bl2) {
                        throw new org.apache.a.e.a(socketTimeoutException, n2, inetAddressArray3);
                    }
                } catch (ConnectException connectException) {
                    if (bl2) {
                        object = connectException.getMessage();
                        if ("Connection timed out".equals(object)) {
                            throw new org.apache.a.e.a(connectException, n2, inetAddressArray3);
                        }
                        throw new org.apache.a.e.k(connectException, n2, inetAddressArray3);
                    }
                } catch (NoRouteToHostException noRouteToHostException) {
                    if (!bl2) break block14;
                    throw noRouteToHostException;
                }
            }
            if (!this.a.a()) continue;
            this.a.a("Connect to " + serializable + " timed out. Connection will be retried using another IP address");
        }
    }

    @Override
    public final void a(l l2, n n2, d object) {
        object = org.apache.a.b.e.a.a((d)object);
        if ((object = this.a((d)object).a(n2.c())) == null) {
            throw new org.apache.a.e.n(n2.c() + " protocol is not supported");
        }
        if (!(object instanceof b)) {
            throw new org.apache.a.e.n(n2.c() + " protocol does not support connection upgrade");
        }
        object = (b)object;
        Socket socket = l2.h();
        int n3 = this.c.a(n2);
        socket = object.a(socket, n2.a(), n3);
        l2.a(socket);
    }
}

