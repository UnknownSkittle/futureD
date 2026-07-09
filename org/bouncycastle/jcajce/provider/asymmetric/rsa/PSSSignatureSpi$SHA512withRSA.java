/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.crypto.e.c;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi;

public class PSSSignatureSpi$SHA512withRSA
extends PSSSignatureSpi {
    public PSSSignatureSpi$SHA512withRSA() {
        super(new c(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
    }
}

