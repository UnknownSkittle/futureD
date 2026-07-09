/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;
import org.bouncycastle.math.ec.ac;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.y;

final class q
implements y {
    private /* synthetic */ boolean a;
    private /* synthetic */ p b;

    q(p p2, boolean bl2) {
        this.b = p2;
        this.a = bl2;
    }

    public final e a(e e2) {
        if ((e2 = e2 instanceof ac ? (ac)e2 : null) == null) {
            e2 = new ac();
        }
        if (((ac)e2).a()) {
            return e2;
        }
        if (!((ac)e2).c()) {
            if (!this.b.a()) {
                ((ac)e2).b();
                return e2;
            }
            ((ac)e2).d();
        }
        if (this.a && !((ac)e2).e()) {
            if (!this.b.b()) {
                ((ac)e2).b();
                return e2;
            }
            ((ac)e2).f();
        }
        return e2;
    }
}

