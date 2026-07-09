/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.b.g;
import org.bouncycastle.b.b.n;
import org.bouncycastle.openpgp.an;

public final class am {
    private List a = new ArrayList();

    public final void a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("attempt to set null SignerUserID");
        }
        this.a.add(new n(string));
    }

    public final void a(String string, String string2) {
        this.a.add(new g(string, string2));
    }

    public final an a() {
        return new an(this.a.toArray(new ai[this.a.size()]));
    }
}

