/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;

public final class an
extends i {
    private byte[] a;

    public an(c c2) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n2 = c2.read()) >= 0) {
            byteArrayOutputStream.write(n2);
        }
        this.a = byteArrayOutputStream.toByteArray();
    }

    public final void a(g g2) {
        g2.a(12, this.a, true);
    }
}

