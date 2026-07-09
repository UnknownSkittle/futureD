/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;
import org.bouncycastle.math.ec.ab;
import org.bouncycastle.math.ec.ak;
import org.bouncycastle.math.ec.r;
import org.bouncycastle.math.ec.y;

final class aj
implements y {
    private /* synthetic */ r a;
    private /* synthetic */ byte b;

    aj(r r2, byte by2) {
        this.a = r2;
        this.b = by2;
    }

    public final e a(e e2) {
        if (e2 instanceof ak) {
            return e2;
        }
        e2 = new ak();
        ((ak)e2).a(ab.a(this.a, this.b));
        return e2;
    }
}

