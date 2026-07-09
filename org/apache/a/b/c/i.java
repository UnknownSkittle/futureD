/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.c;

import com.a.a.b.ai;
import java.net.URI;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.b.c.a;
import org.apache.a.b.c.c;
import org.apache.a.b.c.l;
import org.apache.a.j.n;

public abstract class i
extends a
implements c,
l {
    private ac c;
    private URI d;
    private org.apache.a.b.a.a e;

    public abstract String b_();

    public final void a(ac ac2) {
        this.c = ac2;
    }

    @Override
    public final ac c() {
        if (this.c != null) {
            return this.c;
        }
        return ai.a(this.f());
    }

    @Override
    public final URI i() {
        return this.d;
    }

    @Override
    public final ae g() {
        String string = this.b_();
        ac ac2 = this.c();
        URI uRI = this.d;
        String string2 = null;
        if (uRI != null) {
            string2 = uRI.toASCIIString();
        }
        if (string2 == null || string2.isEmpty()) {
            string2 = "/";
        }
        return new n(string, string2, ac2);
    }

    @Override
    public final org.apache.a.b.a.a c_() {
        return this.e;
    }

    public final void a(org.apache.a.b.a.a a2) {
        this.e = a2;
    }

    public final void a(URI uRI) {
        this.d = uRI;
    }

    public String toString() {
        return this.b_() + " " + this.d + " " + this.c();
    }
}

