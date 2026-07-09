/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import java.util.List;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.s;
import org.apache.a.u;

public final class h
implements r {
    private final r[] a;
    private final u[] b;

    private h(r[] rArray) {
        if (rArray != null) {
            int n2 = rArray.length;
            this.a = new r[n2];
            System.arraycopy(rArray, 0, this.a, 0, n2);
        } else {
            this.a = new r[0];
        }
        this.b = new u[0];
    }

    public h(List<r> list, List<u> list2) {
        int n2;
        if (list != null) {
            n2 = list.size();
            this.a = list.toArray(new r[n2]);
        } else {
            this.a = new r[0];
        }
        if (list2 != null) {
            n2 = list2.size();
            this.b = list2.toArray(new u[n2]);
            return;
        }
        this.b = new u[0];
    }

    public h(r[] rArray,  /* corrupt varargs signature?! */ bytebyte by2) {
        this(rArray);
    }

    @Override
    public final void a(q q2, d d2) {
        r[] rArray = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            rArray[i2].a(q2, d2);
        }
    }

    @Override
    public final void a(s s2, d d2) {
        u[] uArray = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            uArray[i2].a(s2, d2);
        }
    }
}

