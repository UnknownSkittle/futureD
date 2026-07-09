/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;
import org.bouncycastle.math.ec.p;

public final class ae
implements e {
    private p[] a = null;
    private p[] b = null;
    private p c = null;

    public final p[] a() {
        return this.a;
    }

    public final void a(p[] pArray) {
        this.a = pArray;
    }

    public final p[] b() {
        return this.b;
    }

    public final void b(p[] pArray) {
        this.b = pArray;
    }

    public final p c() {
        return this.c;
    }

    public final void a(p p2) {
        this.c = p2;
    }
}

