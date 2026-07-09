/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.OutputStream;
import org.bouncycastle.asn1.r;

final class s
extends r {
    private boolean a;
    private /* synthetic */ r b;

    public s(r r2, OutputStream outputStream) {
        this.b = r2;
        super(outputStream);
        this.a = true;
    }

    public final void b(int n2) {
        if (this.a) {
            this.a = false;
            return;
        }
        super.b(n2);
    }
}

