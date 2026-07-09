/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;
import org.bouncycastle.math.ec.ae;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.v;
import org.bouncycastle.math.ec.y;

final class ag
implements y {
    private /* synthetic */ ae a;
    private /* synthetic */ v b;
    private /* synthetic */ boolean c;

    ag(ae ae2, v v2) {
        this.a = ae2;
        this.b = v2;
        this.c = true;
    }

    public final e a(e e2) {
        e2 = new ae();
        p[] pArray = this.a.c();
        if (pArray != null) {
            pArray = this.b.a((p)pArray);
            ((ae)e2).a((p)pArray);
        }
        pArray = this.a.a();
        p[] pArray2 = new p[pArray.length];
        for (int i2 = 0; i2 < pArray.length; ++i2) {
            pArray2[i2] = this.b.a(pArray[i2]);
        }
        ((ae)e2).a(pArray2);
        if (this.c) {
            p[] pArray3 = new p[pArray2.length];
            for (int i3 = 0; i3 < pArray3.length; ++i3) {
                pArray3[i3] = pArray2[i3].r();
            }
            ((ae)e2).b(pArray3);
        }
        return e2;
    }
}

