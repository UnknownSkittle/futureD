/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.af;
import org.bouncycastle.openpgp.b.a.ac;
import org.bouncycastle.openpgp.b.a.e;
import org.bouncycastle.openpgp.b.h;

final class f
implements h {
    private /* synthetic */ ab a;
    private /* synthetic */ Signature b;
    private /* synthetic */ e c;

    f(e e2, ab ab2, Signature signature) {
        this.c = e2;
        this.a = ab2;
        this.b = signature;
    }

    public final boolean a(byte[] byArray) {
        try {
            return this.b.verify(byArray);
        } catch (SignatureException signatureException) {
            throw new af("unable to verify signature: " + signatureException.getMessage(), signatureException);
        }
    }

    public final OutputStream a() {
        return new ac(this.b);
    }
}

