/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayOutputStream;
import java.util.Vector;
import org.bouncycastle.b.ap;
import org.bouncycastle.b.aq;
import org.bouncycastle.b.c;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;

public final class ao
extends i {
    private ap[] a;

    public ao(c inputStream) {
        ap ap2;
        inputStream = new aq(inputStream);
        Vector<ap> vector = new Vector<ap>();
        while ((ap2 = ((aq)inputStream).a()) != null) {
            vector.addElement(ap2);
        }
        this.a = new ap[vector.size()];
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            this.a[i2] = (ap)vector.elementAt(i2);
        }
    }

    public ao(ap[] apArray) {
        this.a = apArray;
    }

    public final ap[] a() {
        return this.a;
    }

    public final void a(g g2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            this.a[i2].a(byteArrayOutputStream);
        }
        g2.a(17, byteArrayOutputStream.toByteArray(), false);
    }
}

