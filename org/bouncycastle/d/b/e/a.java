/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.c;
import org.bouncycastle.d.b.e.f;
import org.bouncycastle.d.b.e.h;
import org.bouncycastle.d.b.e.i;
import org.bouncycastle.d.b.e.j;
import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.m;
import org.bouncycastle.d.b.e.o;
import org.bouncycastle.d.b.e.p;
import org.bouncycastle.d.b.e.w;
import org.bouncycastle.d.b.e.x;
import org.bouncycastle.d.b.e.y;

public final class a
implements Serializable {
    private transient m a;
    private final int b;
    private final List<c> c;
    private int d;
    private w e;
    private List<w> f;
    private Map<Integer, LinkedList<w>> g;
    private Stack<w> h;
    private Map<Integer, w> i;
    private int j;
    private boolean k;

    a(y y2, int n2) {
        this(y2.d(), y2.c(), y2.e());
        this.j = n2;
        this.k = true;
    }

    a(y y2, byte[] byArray, byte[] byArray2, k k2) {
        this(y2.d(), y2.c(), y2.e());
        this.b(byArray, byArray2, k2);
    }

    a(y y2, byte[] byArray, byte[] byArray2, k k2, int n2) {
        this(y2.d(), y2.c(), y2.e());
        this.b(byArray, byArray2, k2);
        while (this.j < n2) {
            this.c(byArray, byArray2, k2);
            this.k = false;
        }
    }

    private a(m m2, int n2, int n3) {
        this.a = m2;
        this.b = n2;
        this.d = n3;
        if (n3 > n2 || n3 < 2 || (n2 - n3) % 2 != 0) {
            throw new IllegalArgumentException("illegal value for BDS parameter k");
        }
        this.f = new ArrayList<w>();
        this.g = new TreeMap<Integer, LinkedList<w>>();
        this.h = new Stack();
        this.c = new ArrayList<c>();
        for (int i2 = 0; i2 < n2 - n3; ++i2) {
            this.c.add(new c(i2));
        }
        this.i = new TreeMap<Integer, w>();
        this.j = 0;
        this.k = false;
    }

    private a(a a2, byte[] byArray, byte[] byArray2, k k2) {
        this.a = a2.a;
        this.b = a2.b;
        this.d = a2.d;
        this.e = a2.e;
        this.f = new ArrayList<w>(a2.f);
        this.g = a2.g;
        this.h = (Stack)a2.h.clone();
        this.c = a2.c;
        this.i = new TreeMap<Integer, w>(a2.i);
        this.j = a2.j;
        this.c(byArray, byArray2, k2);
        a2.k = true;
    }

    public final a a(byte[] byArray, byte[] byArray2, k k2) {
        return new a(this, byArray, byArray2, k2);
    }

    private void b(byte[] byArray, byte[] byArray2, k k2) {
        if (k2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        i i2 = (i)((j)((j)new j().d(k2.e())).a(k2.f())).a();
        f f2 = (f)((h)((h)new h().d(k2.e())).a(k2.f())).a();
        for (int i3 = 0; i3 < 1 << this.b; ++i3) {
            k2 = (k)((l)((l)((l)new l().d(k2.e())).a(k2.f())).a(i3).b(k2.c()).c(k2.d()).e(k2.g())).a();
            this.a.a(this.a.a(byArray2, k2), byArray);
            Object object = this.a.a(k2);
            i2 = (i)((j)((j)((j)new j().d(i2.e())).a(i2.f())).a(i3).b(i2.c()).c(i2.d()).e(i2.g())).a();
            object = x.a(this.a, (o)object, i2);
            f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).b(i3).e(f2.g())).a();
            while (!this.h.isEmpty() && this.h.peek().a() == ((w)object).a()) {
                int n2 = i3 / (1 << ((w)object).a());
                if (n2 == 1) {
                    this.f.add(((w)object).c());
                }
                if (n2 == 3 && ((w)object).a() < this.b - this.d) {
                    this.c.get(((w)object).a()).a(((w)object).c());
                }
                if (n2 >= 3 && (n2 & 1) == 1 && ((w)object).a() >= this.b - this.d && ((w)object).a() <= this.b - 2) {
                    if (this.g.get(((w)object).a()) == null) {
                        LinkedList<w> linkedList = new LinkedList<w>();
                        linkedList.add(((w)object).c());
                        this.g.put(((w)object).a(), linkedList);
                    } else {
                        this.g.get(((w)object).a()).add(((w)object).c());
                    }
                }
                f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b()).b((f2.c() - 1) / 2).e(f2.g())).a();
                object = x.a(this.a, this.h.pop(), (w)object, f2);
                object = new w(((w)object).a() + 1, ((w)object).b());
                f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b() + 1).b(f2.c()).e(f2.g())).a();
            }
            this.h.push((w)object);
        }
        this.e = this.h.pop();
    }

    private void c(byte[] byArray, byte[] byArray2, k k2) {
        if (k2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.k) {
            throw new IllegalStateException("index already used");
        }
        if (this.j > (1 << this.b) - 2) {
            throw new IllegalStateException("index out of bounds");
        }
        Object object = (i)((j)((j)new j().d(k2.e())).a(k2.f())).a();
        Object object2 = (f)((h)((h)new h().d(k2.e())).a(k2.f())).a();
        int n2 = ad.a(this.j, this.b);
        if ((this.j >> n2 + 1 & 1) == 0 && n2 < this.b - 1) {
            this.i.put(n2, this.f.get(n2).c());
        }
        if (n2 == 0) {
            k2 = (k)((l)((l)((l)new l().d(k2.e())).a(k2.f())).a(this.j).b(k2.c()).c(k2.d()).e(k2.g())).a();
            this.a.a(this.a.a(byArray2, k2), byArray);
            object2 = this.a.a(k2);
            object = (i)((j)((j)((j)new j().d(((p)object).e())).a(((p)object).f())).a(this.j).b(((i)object).c()).c(((i)object).d()).e(((p)object).g())).a();
            object = x.a(this.a, (o)object2, (i)object);
            this.f.set(0, (w)object);
        } else {
            int n3;
            object2 = (f)((h)((h)((h)new h().d(((p)object2).e())).a(((p)object2).f())).a(n2 - 1).b(this.j >> n2).e(((p)object2).g())).a();
            object2 = x.a(this.a, this.f.get(n2 - 1), this.i.get(n2 - 1), (p)object2);
            object2 = new w(((w)object2).a() + 1, ((w)object2).b());
            this.f.set(n2, (w)object2);
            this.i.remove(n2 - 1);
            for (n3 = 0; n3 < n2; ++n3) {
                if (n3 < this.b - this.d) {
                    this.f.set(n3, this.c.get(n3).e());
                    continue;
                }
                this.f.set(n3, this.g.get(n3).removeFirst());
            }
            n3 = Math.min(n2, this.b - this.d);
            for (int i2 = 0; i2 < n3; ++i2) {
                n2 = this.j + 1 + 3 * (1 << i2);
                if (n2 >= 1 << this.b) continue;
                this.c.get(i2).a(n2);
            }
        }
        for (int i3 = 0; i3 < this.b - this.d >> 1; ++i3) {
            c c2 = this.b();
            if (c2 == null) continue;
            c2.a(this.h, this.a, byArray, byArray2, k2);
        }
        ++this.j;
    }

    private c b() {
        c c2 = null;
        for (c c3 : this.c) {
            if (c3.c() || !c3.d()) continue;
            if (c2 == null) {
                c2 = c3;
                continue;
            }
            if (c3.a() < c2.a()) {
                c2 = c3;
                continue;
            }
            if (c3.a() != c2.a() || c3.b() >= c2.b()) continue;
            c2 = c3;
        }
        return c2;
    }

    protected final int a() {
        return this.j;
    }
}

