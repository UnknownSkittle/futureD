/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;

public abstract class l
extends u {
    public int hashCode() {
        return -1;
    }

    final boolean a(u u2) {
        return u2 instanceof l;
    }

    abstract void a(r var1);

    public String toString() {
        return "NULL";
    }
}

