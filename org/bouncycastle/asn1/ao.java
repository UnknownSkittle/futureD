/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.r;
import org.bouncycastle.e.a.f;

public final class ao
extends a {
    ao(boolean bl2, int n2, byte[] byArray) {
        super(bl2, n2, byArray);
    }

    final void a(r r2) {
        int n2 = 64;
        if (this.a) {
            n2 = 96;
        }
        r2.a(n2, this.b, this.c);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.a()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.c()));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            stringBuffer.append(f.a(this.c));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}

