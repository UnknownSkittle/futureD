/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import org.bouncycastle.b.g;
import org.bouncycastle.openpgp.j;

final class k
extends g {
    private /* synthetic */ j a;

    public k(j j2, OutputStream outputStream, int n2, byte[] byArray) {
        this.a = j2;
        super(outputStream, n2, byArray);
    }

    public k(j j2, OutputStream outputStream, long l2) {
        this.a = j2;
        super(outputStream, 9, l2);
    }

    public k(j j2, OutputStream outputStream, long l2, byte by2) {
        this.a = j2;
        super(outputStream, 18, l2, (byte)0);
    }

    public final void close() {
        this.a();
    }
}

