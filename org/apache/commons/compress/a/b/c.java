/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

final class c {
    private final int d;
    int a = -1;
    c b;
    c c;

    private c(int n2) {
        this.d = n2;
    }

    final void a(int n2) {
        this.a = n2;
        this.b = null;
        this.c = null;
    }

    final c a() {
        if (this.b == null && this.a == -1) {
            this.b = new c(this.d + 1);
        }
        return this.b;
    }

    final c b() {
        if (this.c == null && this.a == -1) {
            this.c = new c(this.d + 1);
        }
        return this.c;
    }

    /* synthetic */ c() {
        this(0);
    }
}

