/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.aa;
import org.apache.a.ab;
import org.apache.a.d.d;
import org.apache.a.e;
import org.apache.a.i.b;
import org.apache.a.i.f;
import org.apache.a.j.k;
import org.apache.a.j.u;
import org.apache.a.p;
import org.apache.a.x;

public abstract class a<T extends p>
implements b<T> {
    private final f b;
    private final d c;
    private final List<org.apache.a.n.b> d;
    protected final u a;
    private int e;
    private T f;

    public a(f f2, u u2, d d2) {
        this.b = ai.a(f2, "Session input buffer");
        this.a = u2 != null ? u2 : k.a;
        this.c = org.apache.a.d.d.a;
        this.d = new ArrayList<org.apache.a.n.b>();
        this.e = 0;
    }

    public static e[] a(f f2, int n2, int n3) {
        ArrayList<org.apache.a.n.b> arrayList = new ArrayList<org.apache.a.n.b>();
        return org.apache.a.h.g.a.a(f2, n2, n3, k.a, arrayList);
    }

    private static e[] a(f eArray, int n2, int n3, u u2, List<org.apache.a.n.b> list) {
        int n4;
        block9: {
            ai.a(eArray, "Session input buffer");
            ai.a(u2, "Line parser");
            ai.a(list, "Header line list");
            org.apache.a.n.b b2 = null;
            org.apache.a.n.b b3 = null;
            do {
                if (b2 == null) {
                    b2 = new org.apache.a.n.b(64);
                } else {
                    b2.a();
                }
                if (eArray.a(b2) == -1 || b2.length() <= 0) break block9;
                if ((b2.charAt(0) == ' ' || b2.charAt(0) == '\t') && b3 != null) {
                    char c2;
                    for (n4 = 0; n4 < b2.length() && ((c2 = b2.charAt(n4)) == ' ' || c2 == '\t'); ++n4) {
                    }
                    if (n3 > 0 && b3.length() + 1 + b2.length() - n4 > n3) {
                        throw new x("Maximum line length limit exceeded");
                    }
                    b3.a(' ');
                    b3.a(b2, n4, b2.length() - n4);
                    continue;
                }
                list.add(b2);
                b3 = b2;
                b2 = null;
            } while (n2 <= 0 || list.size() < n2);
            throw new x("Maximum header count exceeded");
        }
        eArray = new e[list.size()];
        for (n4 = 0; n4 < list.size(); ++n4) {
            org.apache.a.n.b b4 = list.get(n4);
            try {
                eArray[n4] = u2.a(b4);
                continue;
            } catch (aa aa2) {
                throw new ab(aa2.getMessage());
            }
        }
        return eArray;
    }

    protected abstract T a(f var1);

    @Override
    public final T a() {
        switch (this.e) {
            case 0: {
                try {
                    this.f = this.a(this.b);
                } catch (aa aa2) {
                    throw new ab(aa2.getMessage(), aa2);
                }
                this.e = 1;
            }
            case 1: {
                Object object = org.apache.a.h.g.a.a(this.b, this.c.b(), this.c.a(), this.a, this.d);
                this.f.a((e[])object);
                object = this.f;
                this.f = null;
                this.d.clear();
                this.e = 0;
                return (T)object;
            }
        }
        throw new IllegalStateException("Inconsistent parser state");
    }
}

