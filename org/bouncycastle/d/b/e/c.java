/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.Serializable;
import java.util.Stack;
import org.bouncycastle.d.b.e.f;
import org.bouncycastle.d.b.e.h;
import org.bouncycastle.d.b.e.i;
import org.bouncycastle.d.b.e.j;
import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.m;
import org.bouncycastle.d.b.e.o;
import org.bouncycastle.d.b.e.w;
import org.bouncycastle.d.b.e.x;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
final class c
implements Serializable {
    private w a;
    private final int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    c(int n2) {
        this.b = n2;
        this.e = false;
        this.f = false;
    }

    final void a(int n2) {
        this.a = null;
        this.c = this.b;
        this.d = n2;
        this.e = true;
        this.f = false;
    }

    final void a(Stack<w> stack, m m2, byte[] object, byte[] byArray, k k2) {
        if (k2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f || !this.e) {
            throw new IllegalStateException("finished or not initialized");
        }
        k2 = (k)((l)((l)((l)new l().d(k2.e())).a(k2.f())).a(this.d).b(k2.c()).c(k2.d()).e(k2.g())).a();
        i i2 = (i)((j)((j)new j().d(k2.e())).a(k2.f())).a(this.d).a();
        f f2 = (f)((h)((h)new h().d(k2.e())).a(k2.f())).b(this.d).a();
        m m3 = m2;
        m3.a(m3.a(byArray, k2), (byte[])object);
        object = m2.a(k2);
        object = x.a(m2, (o)object, i2);
        while (!stack.isEmpty() && stack.peek().a() == ((w)object).a() && stack.peek().a() != this.b) {
            f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b()).b((f2.c() - 1) / 2).e(f2.g())).a();
            object = x.a(m2, stack.pop(), (w)object, f2);
            object = new w(((w)object).a() + 1, ((w)object).b());
            f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b() + 1).b(f2.c()).e(f2.g())).a();
        }
        if (this.a == null) {
            this.a = object;
        } else if (this.a.a() == ((w)object).a()) {
            f2 = (f)((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b()).b((f2.c() - 1) / 2).e(f2.g())).a();
            object = x.a(m2, this.a, (w)object, f2);
            this.a = object = new w(this.a.a() + 1, ((w)object).b());
            ((h)((h)((h)new h().d(f2.e())).a(f2.f())).a(f2.b() + 1).b(f2.c()).e(f2.g())).a();
        } else {
            stack.push((w)object);
        }
        if (this.a.a() == this.b) {
            this.f = true;
            return;
        }
        this.c = ((w)object).a();
        ++this.d;
    }

    final int a() {
        if (!this.e || this.f) {
            return Integer.MAX_VALUE;
        }
        return this.c;
    }

    final int b() {
        return this.d;
    }

    final void a(w w2) {
        this.a = w2;
        this.c = w2.a();
        if (this.c == this.b) {
            this.f = true;
        }
    }

    final boolean c() {
        return this.f;
    }

    final boolean d() {
        return this.e;
    }

    public final w e() {
        return this.a.c();
    }
}

