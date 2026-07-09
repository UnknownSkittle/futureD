/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.e.d.e;
import org.apache.a.f.k;
import org.apache.a.h.d.am;
import org.apache.a.h.d.an;
import org.apache.a.h.d.ao;
import org.apache.a.h.d.ap;
import org.apache.a.h.d.aq;
import org.apache.a.h.d.f;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.i;
import org.apache.a.h.d.j;
import org.apache.a.h.d.r;
import org.apache.a.h.d.s;
import org.apache.a.h.d.x;

public final class al
implements k {
    private final int a;
    private final e b;
    private volatile org.apache.a.f.j c;

    public al(int n2, e e2) {
        this.a = n2 != 0 ? n2 : ao.b;
        this.b = e2;
    }

    public al() {
        this(ao.b, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final org.apache.a.f.j a() {
        if (this.c == null) {
            al al2 = this;
            synchronized (al2) {
                if (this.c == null) {
                    switch (an.a[this.a - 1]) {
                        case 1: {
                            this.c = new aq(new i(), x.a(new f(), this.b), new h(), new j(), new g(aq.a));
                            break;
                        }
                        case 2: {
                            this.c = new ap(new am(this), x.a(new f(), this.b), new h(), new j(), new g(aq.a));
                            break;
                        }
                        default: {
                            this.c = new ap(new i(), x.a(new f(), this.b), new s(), new j(), new r());
                        }
                    }
                }
            }
        }
        return this.c;
    }
}

