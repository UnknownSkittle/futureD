/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.j.b;
import org.bouncycastle.asn1.n;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.j;
import org.bouncycastle.e.a;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.d;

public class DigestSignatureSpi
extends SignatureSpi {
    private j a;
    private org.bouncycastle.crypto.a b;
    private org.bouncycastle.asn1.j.a c;

    protected DigestSignatureSpi(n n2, j j2, org.bouncycastle.crypto.a a2) {
        this.a = j2;
        this.b = a2;
        this.c = new org.bouncycastle.asn1.j.a(n2, ay.a);
    }

    protected void engineInitVerify(PublicKey object) {
        if (!(object instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key (" + DigestSignatureSpi.a(object) + ") is not a RSAPublicKey instance");
        }
        object = d.a((RSAPublicKey)object);
        this.a.c();
        this.b.a(false, (e)object);
    }

    protected void engineInitSign(PrivateKey object) {
        if (!(object instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key (" + DigestSignatureSpi.a(object) + ") is not a RSAPrivateKey instance");
        }
        object = d.a((RSAPrivateKey)object);
        this.a.c();
        this.b.a(true, (e)object);
    }

    private static String a(Object object) {
        if (object == null) {
            return null;
        }
        return object.getClass().getName();
    }

    protected void engineUpdate(byte by2) {
        this.a.a(by2);
    }

    protected void engineUpdate(byte[] byArray, int n2, int n3) {
        this.a.a(byArray, n2, n3);
    }

    protected byte[] engineSign() {
        byte[] byArray = new byte[this.a.b()];
        this.a.a(byArray, 0);
        try {
            byArray = this.a(byArray);
            return this.b.a(byArray, 0, byArray.length);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    protected boolean engineVerify(byte[] byArray) {
        byte[] byArray2 = new byte[this.a.b()];
        this.a.a(byArray2, 0);
        try {
            byArray = this.b.a(byArray, 0, byArray.length);
            byArray2 = this.a(byArray2);
        } catch (Exception exception) {
            return false;
        }
        if (byArray.length == byArray2.length) {
            return org.bouncycastle.e.a.b(byArray, byArray2);
        }
        if (byArray.length == byArray2.length - 2) {
            int n2;
            byArray2[1] = (byte)(byArray2[1] - 2);
            byArray2[3] = (byte)(byArray2[3] - 2);
            int n3 = 4 + byArray2[3];
            int n4 = n3 + 2;
            int n5 = 0;
            for (n2 = 0; n2 < byArray2.length - n4; ++n2) {
                n5 |= byArray[n3 + n2] ^ byArray2[n4 + n2];
            }
            for (n2 = 0; n2 < n3; ++n2) {
                n5 |= byArray[n2] ^ byArray2[n2];
            }
            return n5 == 0;
        }
        return false;
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(String string, Object object) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected Object engineGetParameter(String string) {
        return null;
    }

    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    private byte[] a(byte[] byArray) {
        if (this.c == null) {
            return byArray;
        }
        return new b(this.c, byArray).a("DER");
    }
}

