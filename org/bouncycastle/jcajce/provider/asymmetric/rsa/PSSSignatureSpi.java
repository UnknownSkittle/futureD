/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.f.a;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.j;
import org.bouncycastle.jcajce.b.c;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.d;

public class PSSSignatureSpi
extends SignatureSpi {
    private final c a = new org.bouncycastle.jcajce.b.a();
    private AlgorithmParameters b;
    private PSSParameterSpec c;
    private PSSParameterSpec d;
    private org.bouncycastle.crypto.a e;
    private j f;
    private j g;
    private int h;
    private byte i;
    private boolean j;
    private org.bouncycastle.crypto.j.a k;

    private static byte a(int n2) {
        if (n2 == 1) {
            return -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void a() {
        this.f = this.g;
    }

    protected PSSSignatureSpi(org.bouncycastle.crypto.a a2, PSSParameterSpec pSSParameterSpec) {
        this(a2, pSSParameterSpec, 0);
    }

    private PSSSignatureSpi(org.bouncycastle.crypto.a a2, PSSParameterSpec pSSParameterSpec, byte by2) {
        this.e = a2;
        this.d = pSSParameterSpec;
        this.c = pSSParameterSpec == null ? PSSParameterSpec.DEFAULT : pSSParameterSpec;
        this.g = org.bouncycastle.jcajce.provider.c.d.a(this.c.getDigestAlgorithm());
        this.h = this.c.getSaltLength();
        this.i = PSSSignatureSpi.a(this.c.getTrailerField());
        this.j = false;
        this.a();
    }

    protected void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.k = new org.bouncycastle.crypto.j.a(this.e, this.f, this.g, this.h, this.i);
        this.k.a(false, org.bouncycastle.jcajce.provider.asymmetric.rsa.d.a((RSAPublicKey)publicKey));
    }

    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.k = new org.bouncycastle.crypto.j.a(this.e, this.f, this.g, this.h, this.i);
        this.k.a(true, new org.bouncycastle.crypto.i.j(org.bouncycastle.jcajce.provider.asymmetric.rsa.d.a((RSAPrivateKey)privateKey), secureRandom));
    }

    protected void engineInitSign(PrivateKey privateKey) {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.k = new org.bouncycastle.crypto.j.a(this.e, this.f, this.g, this.h, this.i);
        this.k.a(true, org.bouncycastle.jcajce.provider.asymmetric.rsa.d.a((RSAPrivateKey)privateKey));
    }

    protected void engineUpdate(byte by2) {
        this.k.a(by2);
    }

    protected void engineUpdate(byte[] byArray, int n2, int n3) {
        this.k.a(byArray, n2, n3);
    }

    protected byte[] engineSign() {
        try {
            return this.k.a();
        } catch (e e2) {
            throw new SignatureException(e2.getMessage());
        }
    }

    protected boolean engineVerify(byte[] byArray) {
        return this.k.a(byArray);
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            algorithmParameterSpec = (PSSParameterSpec)algorithmParameterSpec;
            if (this.d != null && !org.bouncycastle.jcajce.provider.c.d.a(this.d.getDigestAlgorithm(), ((PSSParameterSpec)algorithmParameterSpec).getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("parameter must be using " + this.d.getDigestAlgorithm());
            }
            if (!((PSSParameterSpec)algorithmParameterSpec).getMGFAlgorithm().equalsIgnoreCase("MGF1") && !((PSSParameterSpec)algorithmParameterSpec).getMGFAlgorithm().equals(org.bouncycastle.asn1.f.a.h.b())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(((PSSParameterSpec)algorithmParameterSpec).getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown MGF parameters");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)((PSSParameterSpec)algorithmParameterSpec).getMGFParameters();
            if (!org.bouncycastle.jcajce.provider.c.d.a(mGF1ParameterSpec.getDigestAlgorithm(), ((PSSParameterSpec)algorithmParameterSpec).getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            j j2 = org.bouncycastle.jcajce.provider.c.d.a(mGF1ParameterSpec.getDigestAlgorithm());
            if (j2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.b = null;
            this.c = algorithmParameterSpec;
            this.g = j2;
            this.h = this.c.getSaltLength();
            this.i = PSSSignatureSpi.a(this.c.getTrailerField());
            this.a();
            return;
        }
        throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
    }

    protected AlgorithmParameters engineGetParameters() {
        if (this.b == null && this.c != null) {
            try {
                this.b = this.a.c("PSS");
                this.b.init(this.c);
            } catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        return this.b;
    }

    protected void engineSetParameter(String string, Object object) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected Object engineGetParameter(String string) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }
}

