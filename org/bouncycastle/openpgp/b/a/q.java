/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.d;
import org.bouncycastle.openpgp.b.p;
import org.bouncycastle.openpgp.m;

final class q
extends d {
    private /* synthetic */ org.bouncycastle.openpgp.b.a.p a;

    q(org.bouncycastle.openpgp.b.a.p p2, char[] cArray, p p3) {
        this.a = p2;
        super(cArray, p3);
    }

    public final byte[] a(int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, int n3, int n4) {
        try {
            Cipher cipher = org.bouncycastle.openpgp.b.a.p.a(this.a).d(ap.a(n2) + "/CFB/NoPadding");
            cipher.init(2, (Key)org.bouncycastle.openpgp.b.a.a.a(n2, byArray), new IvParameterSpec(byArray2));
            return cipher.doFinal(byArray3, n3, n4);
        } catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new m("illegal block size: " + illegalBlockSizeException.getMessage(), illegalBlockSizeException);
        } catch (BadPaddingException badPaddingException) {
            throw new m("bad padding: " + badPaddingException.getMessage(), badPaddingException);
        } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new m("invalid parameter: " + invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("invalid key: " + invalidKeyException.getMessage(), invalidKeyException);
        }
    }
}

