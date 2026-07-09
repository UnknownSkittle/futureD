/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.bt;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;

public final class bb
implements q {
    private bt a;

    bb(bt bt2) {
        this.a = bt2;
    }

    public final InputStream b() {
        return this.a;
    }

    public final u d() {
        return new ba(this.a.b());
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t("IOException converting stream to byte array: " + iOException.getMessage(), iOException);
        }
    }
}

