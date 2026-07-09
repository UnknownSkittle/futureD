/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.apache.a.e;
import org.apache.a.g.d;
import org.apache.a.h.c.h;
import org.apache.a.h.c.l;
import org.apache.a.h.c.n;
import org.apache.a.h.c.u;
import org.apache.a.i.c;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.commons.c.a;

final class m
extends h {
    private final a a;
    private final a b;
    private final u c;

    public m(String string, a a2, a a3, a a4, int n2, d d2, d d3, org.apache.a.i.e<q> e2, c<s> c2) {
        super(string, n2, d2, d3, e2, c2);
        this.a = a2;
        this.b = a3;
        this.c = new u(a4, string);
    }

    @Override
    public final void close() {
        if (super.c()) {
            if (this.a.a()) {
                this.a.a(this.p() + ": Close connection");
            }
            super.close();
        }
    }

    @Override
    public final void b(int n2) {
        if (this.a.a()) {
            this.a.a(this.p() + ": set socket timeout to " + n2);
        }
        super.b(n2);
    }

    @Override
    public final void e() {
        if (this.a.a()) {
            this.a.a(this.p() + ": Shutdown connection");
        }
        super.e();
    }

    @Override
    protected final InputStream b(Socket closeable) {
        closeable = super.b((Socket)closeable);
        if (this.c.a()) {
            closeable = new l((InputStream)closeable, this.c);
        }
        return closeable;
    }

    @Override
    protected final OutputStream c(Socket closeable) {
        closeable = super.c((Socket)closeable);
        if (this.c.a()) {
            closeable = new n((OutputStream)closeable, this.c);
        }
        return closeable;
    }

    @Override
    protected final void b(s eArray) {
        if (eArray != null && this.b.a()) {
            this.b.a(this.p() + " << " + eArray.a().toString());
            for (e e2 : eArray.d()) {
                this.b.a(this.p() + " << " + e2.toString());
            }
        }
    }

    @Override
    protected final void b(q eArray) {
        if (eArray != null && this.b.a()) {
            this.b.a(this.p() + " >> " + eArray.g().toString());
            for (e e2 : eArray.d()) {
                this.b.a(this.p() + " >> " + e2.toString());
            }
        }
    }
}

