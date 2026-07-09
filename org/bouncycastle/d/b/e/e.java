/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
implements org.bouncycastle.b.e {
    private static final Map<String, e> a;
    private final int b;
    private final String c;

    private e(int n2, String string) {
        this.b = n2;
        this.c = string;
    }

    public static e a(String string, int n2, int n3, int n4) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return a.get(e.b(string, n2, n3, n4));
    }

    private static String b(String string, int n2, int n3, int n4) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return string + "-" + n2 + "-16-" + n3 + "-" + n4;
    }

    public final String toString() {
        return this.c;
    }

    static {
        HashMap<String, e> hashMap = new HashMap<String, e>();
        hashMap.put(e.b("SHA-256", 32, 67, 10), new e(0x1000001, "XMSS_SHA2-256_W16_H10"));
        hashMap.put(e.b("SHA-256", 32, 67, 16), new e(0x2000002, "XMSS_SHA2-256_W16_H16"));
        hashMap.put(e.b("SHA-256", 32, 67, 20), new e(0x3000003, "XMSS_SHA2-256_W16_H20"));
        hashMap.put(e.b("SHA-512", 64, 131, 10), new e(0x4000004, "XMSS_SHA2-512_W16_H10"));
        hashMap.put(e.b("SHA-512", 64, 131, 16), new e(0x5000005, "XMSS_SHA2-512_W16_H16"));
        hashMap.put(e.b("SHA-512", 64, 131, 20), new e(0x6000006, "XMSS_SHA2-512_W16_H20"));
        hashMap.put(e.b("SHAKE128", 32, 67, 10), new e(0x7000007, "XMSS_SHAKE128_W16_H10"));
        hashMap.put(e.b("SHAKE128", 32, 67, 16), new e(0x8000008, "XMSS_SHAKE128_W16_H16"));
        hashMap.put(e.b("SHAKE128", 32, 67, 20), new e(0x9000009, "XMSS_SHAKE128_W16_H20"));
        hashMap.put(e.b("SHAKE256", 64, 131, 10), new e(0xA00000A, "XMSS_SHAKE256_W16_H10"));
        hashMap.put(e.b("SHAKE256", 64, 131, 16), new e(0xB00000B, "XMSS_SHAKE256_W16_H16"));
        hashMap.put(e.b("SHAKE256", 64, 131, 20), new e(0xC00000C, "XMSS_SHAKE256_W16_H20"));
        a = Collections.unmodifiableMap(hashMap);
    }
}

