/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.b;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.jcajce.b.c;

public final class b
implements c {
    public final Cipher a(String string) {
        return Cipher.getInstance(string);
    }

    public final KeyAgreement b(String string) {
        return KeyAgreement.getInstance(string);
    }

    public final AlgorithmParameters c(String string) {
        return AlgorithmParameters.getInstance(string);
    }

    public final KeyFactory d(String string) {
        return KeyFactory.getInstance(string);
    }

    public final KeyPairGenerator e(String string) {
        return KeyPairGenerator.getInstance(string);
    }

    public final MessageDigest f(String string) {
        return MessageDigest.getInstance(string);
    }

    public final Signature g(String string) {
        return Signature.getInstance(string);
    }
}

