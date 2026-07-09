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
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.aa;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.c;
import org.bouncycastle.openpgp.m;

public final class o
extends c {
    private y a = new y(new b());

    private o(char[] cArray, org.bouncycastle.openpgp.b.o o2) {
        super(cArray, o2);
    }

    public o(char[] cArray) {
        this(cArray, new aa());
    }

    public final o a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    protected final byte[] a(int n2, byte[] byArray, byte[] byArray2) {
        try {
            Object object = ap.a(n2);
            object = this.a.d((String)object + "/CFB/NoPadding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, ap.a(n2));
            ((Cipher)object).init(1, (Key)secretKeySpec, new IvParameterSpec(new byte[((Cipher)object).getBlockSize()]));
            return ((Cipher)object).doFinal(byArray2, 0, byArray2.length);
        } catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new m("illegal block size: " + illegalBlockSizeException.getMessage(), illegalBlockSizeException);
        } catch (BadPaddingException badPaddingException) {
            throw new m("bad padding: " + badPaddingException.getMessage(), badPaddingException);
        } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new m("IV invalid: " + invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("key invalid: " + invalidKeyException.getMessage(), invalidKeyException);
        }
    }
}

