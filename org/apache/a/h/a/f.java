/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.a.a.j;
import org.apache.a.a.k;
import org.apache.a.a.l;
import org.apache.a.e;
import org.apache.a.e.a.b;
import org.apache.a.h.a.a;
import org.apache.a.h.a.h;
import org.apache.a.m.d;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.commons.c.c;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public abstract class f
extends a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final org.apache.commons.a.a.a b = new org.apache.commons.a.a.a(0);
    private final boolean c;
    private final boolean d;
    private h e = h.a;
    private byte[] f;

    f() {
        this.c = true;
        this.d = true;
    }

    protected static byte[] a(byte[] byArray, Oid object, String object2, j object3) {
        Object object4 = GSSManager.getInstance();
        object2 = ((GSSManager)object4).createName("HTTP@".concat(String.valueOf(object2)), GSSName.NT_HOSTBASED_SERVICE);
        object3 = object3 instanceof l ? ((l)object3).c() : null;
        GSSManager gSSManager = object4;
        object4 = object3;
        object3 = object2;
        object2 = object;
        object = gSSManager.createContext(object3.canonicalize((Oid)object2), (Oid)object2, (GSSCredential)object4, 0);
        object.requestMutualAuth(true);
        if (byArray != null) {
            return object.initSecContext(byArray, 0, byArray.length);
        }
        return object.initSecContext(new byte[0], 0, 0);
    }

    @Deprecated
    protected byte[] a(byte[] byArray, String string) {
        return null;
    }

    protected byte[] a(byte[] byArray, String string, j j2) {
        return this.a(byArray, string);
    }

    @Override
    public final boolean d() {
        return this.e == h.c || this.e == h.d;
    }

    @Override
    @Deprecated
    public final e a(j j2, q q2) {
        return this.a(j2, q2, null);
    }

    @Override
    public e a(j j2, q object, d object2) {
        ai.a(object, "HTTP request");
        switch (this.e) {
            case a: {
                throw new org.apache.a.a.f(this.a() + " authentication has not been initiated");
            }
            case d: {
                throw new org.apache.a.a.f(this.a() + " authentication has failed");
            }
            case b: {
                try {
                    object = (b)object2.a("http.route");
                    if (object == null) {
                        throw new org.apache.a.a.f("Connection route is not available");
                    }
                    if (!this.e() || (object2 = ((b)object).e()) == null) {
                        object2 = ((b)object).a();
                    }
                    object = ((n)object2).a();
                    try {
                        object2 = object;
                        InetAddress inetAddress = InetAddress.getByName((String)object2);
                        String string = inetAddress.getCanonicalHostName();
                        object = inetAddress.getHostAddress().contentEquals(string) ? object2 : string;
                    } catch (UnknownHostException unknownHostException) {}
                    if (this.a.a()) {
                        this.a.a("init ".concat(String.valueOf(object)));
                    }
                    this.f = this.a(this.f, (String)object, j2);
                    this.e = h.c;
                } catch (GSSException gSSException) {
                    this.e = h.d;
                    if (gSSException.getMajor() == 9 || gSSException.getMajor() == 8) {
                        throw new k(gSSException.getMessage(), gSSException);
                    }
                    if (gSSException.getMajor() == 13) {
                        throw new k(gSSException.getMessage(), gSSException);
                    }
                    if (gSSException.getMajor() == 10 || gSSException.getMajor() == 19 || gSSException.getMajor() == 20) {
                        throw new org.apache.a.a.f(gSSException.getMessage(), gSSException);
                    }
                    throw new org.apache.a.a.f(gSSException.getMessage());
                }
            }
            case c: {
                object = new String(this.b.c(this.f));
                if (this.a.a()) {
                    this.a.a("Sending response '" + (String)object + "' back to the auth server");
                }
                object2 = new org.apache.a.n.b(32);
                if (this.e()) {
                    ((org.apache.a.n.b)object2).a("Proxy-Authorization");
                } else {
                    ((org.apache.a.n.b)object2).a("Authorization");
                }
                ((org.apache.a.n.b)object2).a(": Negotiate ");
                ((org.apache.a.n.b)object2).a((String)object);
                return new org.apache.a.j.q((org.apache.a.n.b)object2);
            }
        }
        throw new IllegalStateException("Illegal state: " + (Object)((Object)this.e));
    }

    @Override
    protected final void a(org.apache.a.n.b charSequence, int n2, int n3) {
        charSequence = ((org.apache.a.n.b)charSequence).b(n2, n3);
        if (this.a.a()) {
            this.a.a("Received challenge '" + (String)charSequence + "' from the auth server");
        }
        if (this.e == h.a) {
            this.f = org.apache.commons.a.a.a.b(((String)charSequence).getBytes());
            this.e = h.b;
            return;
        }
        this.a.a("Authentication already attempted");
        this.e = h.d;
    }
}

