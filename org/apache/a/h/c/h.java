/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.e.l;
import org.apache.a.g.d;
import org.apache.a.h.b;
import org.apache.a.i.c;
import org.apache.a.i.e;
import org.apache.a.q;
import org.apache.a.s;

public class h
extends b
implements l,
org.apache.a.m.d {
    private final String a;
    private final Map<String, Object> b;
    private volatile boolean c;

    public h(String string, int n2, d d2, d d3, e<q> e2, c<s> c2) {
        super(n2, d2, d3, e2, c2);
        this.a = string;
        this.b = new ConcurrentHashMap<String, Object>();
    }

    public final String p() {
        return this.a;
    }

    @Override
    public void e() {
        this.c = true;
        super.e();
    }

    @Override
    public final Object a(String string) {
        return this.b.get(string);
    }

    @Override
    public final void a(String string, Object object) {
        this.b.put(string, object);
    }

    @Override
    public final void a(Socket socket) {
        if (this.c) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
        super.a(socket);
    }

    @Override
    public final Socket h() {
        return super.h();
    }

    @Override
    public final SSLSession i() {
        Socket socket = super.h();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket)socket).getSession();
        }
        return null;
    }
}

