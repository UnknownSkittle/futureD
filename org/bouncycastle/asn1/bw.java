/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.t;

final class bw
implements Enumeration {
    private j a;
    private Object b;

    public bw(byte[] byArray) {
        this.a = new j(byArray, 0);
        this.b = this.a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final Object nextElement() {
        Object object = this.b;
        this.b = this.a();
        return object;
    }

    private Object a() {
        try {
            return this.a.b();
        } catch (IOException iOException) {
            throw new t("malformed DER construction: ".concat(String.valueOf(iOException)), iOException);
        }
    }
}

