/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.k;
import org.apache.a.h.d.ab;
import org.apache.a.h.d.ac;
import org.apache.a.h.d.ad;
import org.apache.a.h.d.ae;
import org.apache.a.h.d.af;
import org.apache.a.h.d.ag;
import org.apache.a.h.d.ai;
import org.apache.a.h.d.e;
import org.apache.a.h.d.f;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.i;
import org.apache.a.h.d.j;
import org.apache.a.h.d.l;
import org.apache.a.h.d.n;
import org.apache.a.h.d.o;
import org.apache.a.h.d.v;
import org.apache.a.h.d.x;
import org.apache.a.h.d.y;
import org.apache.a.h.d.z;

public final class m
implements k {
    private final int a;
    private final org.apache.a.e.d.e b;
    private final String[] c;
    private final boolean d;
    private volatile org.apache.a.f.j e;

    private m(int n2, org.apache.a.e.d.e e2) {
        this.a = n2 != 0 ? n2 : o.a;
        this.b = e2;
        this.c = null;
        this.d = false;
    }

    public m(org.apache.a.e.d.e e2) {
        this(o.a, e2);
    }

    public m() {
        this(o.a, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final org.apache.a.f.j a() {
        if (this.e == null) {
            m m2 = this;
            synchronized (m2) {
                if (this.e == null) {
                    ag ag2 = new ag(new ai(), new i(), x.a(new ae(), this.b), new af(), new h(), new j(), new e(), new ac(), new ad());
                    z z2 = new z(new ab(), new i(), x.a(new y(), this.b), new h(), new j(), new e());
                    v v2 = new v(x.a(new f(), this.b), this.a == o.b ? new n(this) : new i(), new j(), new e(), new g(new String[]{"EEE, dd-MMM-yy HH:mm:ss z"}));
                    this.e = new l(ag2, z2, v2);
                }
            }
        }
        return this.e;
    }
}

