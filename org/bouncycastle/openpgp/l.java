/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.b.am;
import org.bouncycastle.b.c;
import org.bouncycastle.b.t;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.ac;
import org.bouncycastle.openpgp.z;

public final class l
implements e {
    private List a = new ArrayList();
    private t b;

    public l(c c2) {
        while (c2.a() == 1 || c2.a() == 3) {
            this.a.add(c2.b());
        }
        this.b = (t)c2.b();
        for (int i2 = 0; i2 != this.a.size(); ++i2) {
            if (this.a.get(i2) instanceof am) {
                this.a.set(i2, new z((am)this.a.get(i2), this.b));
                continue;
            }
            this.a.set(i2, new ac((org.bouncycastle.b.z)this.a.get(i2), this.b));
        }
    }

    public final Object a() {
        return this.a.get(0);
    }

    public final Iterator b() {
        return this.a.iterator();
    }

    public final Iterator iterator() {
        return this.b();
    }
}

