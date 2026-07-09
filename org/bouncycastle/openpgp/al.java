/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.Iterator;
import org.bouncycastle.e.b;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.aj;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class al
implements e<aj> {
    private aj[] a;

    public al(aj[] ajArray) {
        this.a = new aj[ajArray.length];
        System.arraycopy(ajArray, 0, this.a, 0, ajArray.length);
    }

    public final aj a() {
        return this.a[0];
    }

    public final Iterator<aj> iterator() {
        return new b<aj>(this.a);
    }
}

