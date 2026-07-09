/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;

public final class RSA {
    private static final Map<String, String> a = new HashMap<String, String>();

    static /* synthetic */ Map a() {
        return a;
    }

    static {
        a.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}

