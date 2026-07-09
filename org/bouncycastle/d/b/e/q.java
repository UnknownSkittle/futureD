/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.p;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public abstract class q<T extends q> {
    private final int a;
    private int b = 0;
    private long c = 0L;
    private int d = 0;

    protected q(int n2) {
        this.a = n2;
    }

    protected final T d(int n2) {
        this.b = n2;
        return this.b();
    }

    protected final T a(long l2) {
        this.c = l2;
        return this.b();
    }

    protected final T e(int n2) {
        this.d = n2;
        return this.b();
    }

    protected abstract p a();

    protected abstract T b();

    static /* synthetic */ int a(q q2) {
        return q2.b;
    }

    static /* synthetic */ long b(q q2) {
        return q2.c;
    }

    static /* synthetic */ int c(q q2) {
        return q2.a;
    }

    static /* synthetic */ int d(q q2) {
        return q2.d;
    }
}

