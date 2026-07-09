/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.e.b.a;

public final class s
extends i {
    private int a;
    private byte[] b;

    s(int n2, c c2) {
        this.a = n2;
        this.b = org.bouncycastle.e.b.a.a(c2);
    }

    public final void a(g g2) {
        g2.a(this.a, this.b, true);
    }
}

