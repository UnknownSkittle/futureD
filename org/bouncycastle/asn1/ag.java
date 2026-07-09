/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ae;
import org.bouncycastle.asn1.an;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.y;
import org.bouncycastle.e.b.a;

public final class ag
implements q {
    private y a;

    ag(y y2) {
        this.a = y2;
    }

    public final InputStream b() {
        return new an(this.a);
    }

    public final u d() {
        return new ae(org.bouncycastle.e.b.a.a(this.b()));
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t("IOException converting stream to byte array: " + iOException.getMessage(), iOException);
        }
    }
}

