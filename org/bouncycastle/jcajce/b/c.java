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

public interface c {
    public Cipher a(String var1);

    public KeyAgreement b(String var1);

    public AlgorithmParameters c(String var1);

    public KeyFactory d(String var1);

    public KeyPairGenerator e(String var1);

    public MessageDigest f(String var1);

    public Signature g(String var1);
}

