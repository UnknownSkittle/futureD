/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.ArrayList;
import java.util.Date;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.b.g;
import org.bouncycastle.b.b.k;

public final class an {
    ai[] a;

    an(ai[] aiArray) {
        this.a = aiArray;
    }

    public final g[] a() {
        int n2;
        ai[] aiArray = this;
        g[] gArray = new ArrayList();
        for (n2 = 0; n2 != aiArray.a.length; ++n2) {
            if (aiArray.a[n2].a() != 20) continue;
            gArray.add(aiArray.a[n2]);
        }
        aiArray = gArray.toArray(new ai[0]);
        gArray = new g[aiArray.length];
        for (n2 = 0; n2 < aiArray.length; ++n2) {
            gArray[n2] = (g)aiArray[n2];
        }
        return gArray;
    }

    public final Date b() {
        Object object;
        an an2;
        block2: {
            an2 = this;
            for (int i2 = 0; i2 != an2.a.length; ++i2) {
                if (an2.a[i2].a() != 2) continue;
                object = an2.a[i2];
                break block2;
            }
            object = an2 = null;
        }
        if (object == null) {
            return null;
        }
        return ((k)((Object)an2)).b();
    }
}

