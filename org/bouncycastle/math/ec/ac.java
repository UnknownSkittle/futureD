/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;

final class ac
implements e {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;

    ac() {
    }

    final boolean a() {
        return this.a;
    }

    final void b() {
        this.a = true;
    }

    final boolean c() {
        return this.b;
    }

    final void d() {
        this.b = true;
    }

    final boolean e() {
        return this.c;
    }

    final void f() {
        this.c = true;
    }
}

