/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.c;

import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.c.a;
import org.bouncycastle.jcajce.provider.c.c;

public abstract class b
extends a {
    protected static void a(org.bouncycastle.jcajce.provider.a.a a2, n n2, String string, c c2) {
        a2.a("Alg.Alias.KeyFactory.".concat(String.valueOf(n2)), string);
        a2.a("Alg.Alias.KeyPairGenerator.".concat(String.valueOf(n2)), string);
        a2.a(n2, c2);
    }

    protected static void a(org.bouncycastle.jcajce.provider.a.a a2, n n2, String string) {
        a2.a("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(n2)), string);
    }
}

