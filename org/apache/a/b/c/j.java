/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import com.a.a.b.ai;
import java.net.URI;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.b.c.k;
import org.apache.a.b.c.l;
import org.apache.a.j.a;
import org.apache.a.k.c;
import org.apache.a.n;
import org.apache.a.q;

public class j
extends a
implements l {
    private final q c;
    private final n d;
    private final String e;
    private ae f;
    private ac g;
    private URI h;

    private j(q q2, n n2) {
        super((byte)0);
        this.c = ai.a(q2, "HTTP request");
        this.d = n2;
        this.g = this.c.g().b();
        this.e = this.c.g().a();
        this.h = q2 instanceof l ? ((l)q2).i() : null;
        this.a(q2.d());
    }

    @Override
    public final ac c() {
        if (this.g != null) {
            return this.g;
        }
        return this.c.c();
    }

    @Override
    public final URI i() {
        return this.h;
    }

    public final void a(URI uRI) {
        this.h = uRI;
        this.f = null;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final ae g() {
        if (this.f == null) {
            String string = this.h != null ? this.h.toASCIIString() : this.c.g().c();
            if (string == null || string.isEmpty()) {
                string = "/";
            }
            this.f = new org.apache.a.j.n(this.e, string, this.c());
        }
        return this.f;
    }

    public final q j() {
        return this.c;
    }

    public final n k() {
        return this.d;
    }

    public String toString() {
        return this.g() + " " + this.a;
    }

    public static j a(q q2) {
        return j.a(q2, null);
    }

    public static j a(q q2, n n2) {
        ai.a(q2, "HTTP request");
        if (q2 instanceof org.apache.a.l) {
            return new k((org.apache.a.l)q2, n2);
        }
        return new j(q2, n2);
    }

    @Override
    @Deprecated
    public final c f() {
        if (this.b == null) {
            this.b = this.c.f().b();
        }
        return this.b;
    }

    /* synthetic */ j(q q2, n n2, byte by2) {
        this(q2, n2);
    }
}

