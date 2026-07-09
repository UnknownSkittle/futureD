/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.aa;
import org.bouncycastle.openpgp.b.a.t;
import org.bouncycastle.openpgp.b.m;
import org.bouncycastle.openpgp.b.o;

final class u
implements m {
    private final Cipher a;
    private /* synthetic */ t b;

    u(t t2, byte[] byArray) {
        this.b = t2;
        this.a = t.c(t2).a(t.a(t2), t.b(t2));
        try {
            if (t.b(t2)) {
                byte[] byArray2 = new byte[this.a.getBlockSize()];
                this.a.init(1, (Key)org.bouncycastle.openpgp.b.a.a.a(t.a(t2), byArray), new IvParameterSpec(byArray2));
                return;
            }
            this.a.init(1, org.bouncycastle.openpgp.b.a.a.a(t.a(t2), byArray));
            return;
        } catch (InvalidKeyException invalidKeyException) {
            throw new org.bouncycastle.openpgp.m("invalid key: " + invalidKeyException.getMessage(), invalidKeyException);
        } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new org.bouncycastle.openpgp.m("imvalid algorithm parameter: " + invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        }
    }

    public final OutputStream a(OutputStream outputStream) {
        return new CipherOutputStream(outputStream, this.a);
    }

    public final o a() {
        if (t.b(this.b)) {
            return new aa();
        }
        return null;
    }

    public final int b() {
        return this.a.getBlockSize();
    }
}

