/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.util.NoSuchElementException;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.h;
import org.apache.a.j.s;
import org.apache.a.j.v;
import org.apache.a.n.b;

public final class d
implements g {
    private final h a;
    private final s b;
    private f c = null;
    private b d = null;
    private v e = null;

    private d(h h2, s s2) {
        this.a = ai.a(h2, "Header iterator");
        this.b = ai.a(s2, "Parser");
    }

    public d(h h2) {
        this(h2, org.apache.a.j.g.a);
    }

    private void b() {
        while (this.a.hasNext() || this.e != null) {
            Object object;
            if (this.e == null || this.e.c()) {
                object = this;
                this.e = null;
                ((d)object).d = null;
                while (((d)object).a.hasNext()) {
                    Object object2 = ((d)object).a.a();
                    if (object2 instanceof org.apache.a.d) {
                        ((d)object).d = ((org.apache.a.d)object2).a();
                        ((d)object).e = new v(0, ((d)object).d.length());
                        ((d)object).e.a(((org.apache.a.d)object2).b());
                        break;
                    }
                    if ((object2 = object2.d()) == null) continue;
                    ((d)object).d = new b(((String)object2).length());
                    ((d)object).d.a((String)object2);
                    ((d)object).e = new v(0, ((d)object).d.length());
                    break;
                }
            }
            if (this.e == null) continue;
            while (!this.e.c()) {
                object = this.b.b(this.d, this.e);
                if (object.a().length() == 0 && object.b() == null) continue;
                this.c = object;
                return;
            }
            if (!this.e.c()) continue;
            this.e = null;
            this.d = null;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.c == null) {
            this.b();
        }
        return this.c != null;
    }

    @Override
    public final f a() {
        if (this.c == null) {
            this.b();
        }
        if (this.c == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        f f2 = this.c;
        this.c = null;
        return f2;
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

