/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ar;
import org.bouncycastle.asn1.bu;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.y;

public final class as
implements bu,
f {
    private y a;

    public as(y y2) {
        this.a = y2;
    }

    public final u d() {
        try {
            return new ar(this.a.b());
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new h(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    public final u h() {
        try {
            return this.d();
        } catch (IOException iOException) {
            throw new t("unable to get DER object", iOException);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new t("unable to get DER object", illegalArgumentException);
        }
    }
}

