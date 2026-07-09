/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.util.Enumeration;
import org.bouncycastle.asn1.ae;

final class af
implements Enumeration {
    private int a = 0;
    private /* synthetic */ ae b;

    af(ae ae2) {
        this.b = ae2;
    }

    public final boolean hasMoreElements() {
        return this.a < ae.a(this.b).length;
    }

    public final Object nextElement() {
        return ae.a(this.b)[this.a++];
    }
}

