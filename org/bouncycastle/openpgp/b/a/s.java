/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.r;
import org.bouncycastle.openpgp.b.e;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.m;

final class s
extends e {
    private Cipher c;
    private byte[] d;
    private /* synthetic */ r e;

    s(r r2, int n2, o o2, int n3, SecureRandom secureRandom, char[] cArray) {
        this.e = r2;
        super(n2, o2, n3, secureRandom, cArray);
    }

    public final byte[] a(byte[] byArray, byte[] byArray2, int n2) {
        try {
            this.c = r.a(this.e).d(ap.a(this.a) + "/CFB/NoPadding");
            this.c.init(1, (Key)org.bouncycastle.openpgp.b.a.a.a(this.a, byArray), this.b);
            this.d = this.c.getIV();
            return this.c.doFinal(byArray2, 0, n2);
        } catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new m("illegal block size: " + illegalBlockSizeException.getMessage(), illegalBlockSizeException);
        } catch (BadPaddingException badPaddingException) {
            throw new m("bad padding: " + badPaddingException.getMessage(), badPaddingException);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("invalid key: " + invalidKeyException.getMessage(), invalidKeyException);
        }
    }

    public final byte[] c() {
        return this.d;
    }
}

