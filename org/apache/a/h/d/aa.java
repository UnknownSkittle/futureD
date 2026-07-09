/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.h.d.i;

final class aa
extends i {
    aa() {
    }

    @Override
    public final void a(c c2, f f2) {
        if (!this.b(c2, f2)) {
            throw new org.apache.a.f.i("Illegal 'path' attribute \"" + c2.e() + "\". Path of origin: \"" + f2.b() + "\"");
        }
    }
}

