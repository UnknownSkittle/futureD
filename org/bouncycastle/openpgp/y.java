/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.Iterator;
import org.bouncycastle.e.b;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.x;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class y
implements e<x> {
    private x[] a;

    public y(x[] xArray) {
        this.a = new x[xArray.length];
        System.arraycopy(xArray, 0, this.a, 0, xArray.length);
    }

    public final x a() {
        return this.a[0];
    }

    public final Iterator<x> iterator() {
        return new b<x>(this.a);
    }
}

