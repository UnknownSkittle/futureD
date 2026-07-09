/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.b;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.jcajce.b.c;

public class e
implements c {
    private Provider a;

    public e(Provider provider) {
        this.a = provider;
    }

    public final Cipher a(String string) {
        return Cipher.getInstance(string, this.a);
    }

    public final KeyAgreement b(String string) {
        return KeyAgreement.getInstance(string, this.a);
    }

    public final AlgorithmParameters c(String string) {
        return AlgorithmParameters.getInstance(string, this.a);
    }

    public final KeyFactory d(String string) {
        return KeyFactory.getInstance(string, this.a);
    }

    public final KeyPairGenerator e(String string) {
        return KeyPairGenerator.getInstance(string, this.a);
    }

    public final MessageDigest f(String string) {
        return MessageDigest.getInstance(string, this.a);
    }

    public final Signature g(String string) {
        return Signature.getInstance(string, this.a);
    }
}

