/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public final class ar
extends i {
    private byte[] a;

    public ar(c c2) {
        this.a = org.bouncycastle.e.b.a.a(c2);
    }

    public ar(String string) {
        this.a = k.a(string);
    }

    public final String a() {
        return k.a(this.a);
    }

    public final boolean equals(Object object) {
        if (object instanceof ar) {
            return org.bouncycastle.e.a.a(this.a, ((ar)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }

    public final void a(g g2) {
        g2.a(13, this.a, true);
    }
}

