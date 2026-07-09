/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.v;

public final class z
implements v {
    private j a;

    public z(j j2) {
        this.a = j2;
    }

    public final p a(p p2) {
        return p2.b(this.a);
    }
}

