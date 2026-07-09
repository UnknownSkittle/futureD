/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import org.apache.a.a.f;
import org.apache.a.a.j;
import org.apache.a.a.k;
import org.apache.a.a.m;
import org.apache.a.e;
import org.apache.a.h.a.a;
import org.apache.a.h.a.n;
import org.apache.a.h.a.p;
import org.apache.a.h.a.y;
import org.apache.a.n.b;
import org.apache.a.q;

public final class x
extends a {
    private final n a;
    private y b;
    private String c;

    private x(n n2) {
        ai.a(n2, "NTLM engine");
        this.a = n2;
        this.b = y.a;
        this.c = null;
    }

    public x() {
        this(new p());
    }

    @Override
    public final String a() {
        return "ntlm";
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    protected final void a(b b2, int n2, int n3) {
        this.c = b2.b(n2, n3);
        if (this.c.isEmpty()) {
            if (this.b == y.a) {
                this.b = y.b;
                return;
            }
            this.b = y.f;
            return;
        }
        if (this.b.compareTo(y.c) < 0) {
            this.b = y.f;
            throw new m("Out of sequence NTLM response message");
        }
        if (this.b == y.c) {
            this.b = y.d;
        }
    }

    @Override
    public final e a(j object, q object2) {
        try {
            object2 = (org.apache.a.a.n)object;
        } catch (ClassCastException classCastException) {
            throw new k("Credentials cannot be used for NTLM authentication: " + object.getClass().getName());
        }
        if (this.b == y.f) {
            throw new f("NTLM authentication failed");
        }
        if (this.b == y.b) {
            object = this.a.a();
            this.b = y.c;
        } else if (this.b == y.d) {
            object = this.a.a(((org.apache.a.a.n)object2).c(), ((org.apache.a.a.n)object2).b(), ((org.apache.a.a.n)object2).d(), ((org.apache.a.a.n)object2).e(), this.c);
            this.b = y.e;
        } else {
            throw new f("Unexpected state: " + (Object)((Object)this.b));
        }
        object2 = new b(32);
        if (this.e()) {
            ((b)object2).a("Proxy-Authorization");
        } else {
            ((b)object2).a("Authorization");
        }
        ((b)object2).a(": NTLM ");
        ((b)object2).a((String)object);
        return new org.apache.a.j.q((b)object2);
    }

    @Override
    public final boolean d() {
        return this.b == y.e || this.b == y.f;
    }
}

