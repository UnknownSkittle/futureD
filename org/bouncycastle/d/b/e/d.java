/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.b.e;

public final class d
implements e {
    private static final Map<String, d> a;
    private final int b;
    private final String c;

    private d(String string) {
        this.b = 0x1000001;
        this.c = string;
    }

    public static d a(String string, int n2, int n3, int n4, int n5) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return a.get(d.b(string, n2, n3, n4, n5));
    }

    private static String b(String string, int n2, int n3, int n4, int n5) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return string + "-" + n2 + "-16-" + n3 + "-" + n4 + "-" + n5;
    }

    public final String toString() {
        return this.c;
    }

    static {
        HashMap<String, d> hashMap = new HashMap<String, d>();
        hashMap.put(d.b("SHA-256", 32, 67, 20, 2), new d("XMSSMT_SHA2-256_W16_H20_D2"));
        hashMap.put(d.b("SHA-256", 32, 67, 20, 4), new d("XMSSMT_SHA2-256_W16_H20_D4"));
        hashMap.put(d.b("SHA-256", 32, 67, 40, 2), new d("XMSSMT_SHA2-256_W16_H40_D2"));
        hashMap.put(d.b("SHA-256", 32, 67, 40, 2), new d("XMSSMT_SHA2-256_W16_H40_D4"));
        hashMap.put(d.b("SHA-256", 32, 67, 40, 4), new d("XMSSMT_SHA2-256_W16_H40_D8"));
        hashMap.put(d.b("SHA-256", 32, 67, 60, 8), new d("XMSSMT_SHA2-256_W16_H60_D3"));
        hashMap.put(d.b("SHA-256", 32, 67, 60, 6), new d("XMSSMT_SHA2-256_W16_H60_D6"));
        hashMap.put(d.b("SHA-256", 32, 67, 60, 12), new d("XMSSMT_SHA2-256_W16_H60_D12"));
        hashMap.put(d.b("SHA2-512", 64, 131, 20, 2), new d("XMSSMT_SHA2-512_W16_H20_D2"));
        hashMap.put(d.b("SHA2-512", 64, 131, 20, 4), new d("XMSSMT_SHA2-512_W16_H20_D4"));
        hashMap.put(d.b("SHA2-512", 64, 131, 40, 2), new d("XMSSMT_SHA2-512_W16_H40_D2"));
        hashMap.put(d.b("SHA2-512", 64, 131, 40, 4), new d("XMSSMT_SHA2-512_W16_H40_D4"));
        hashMap.put(d.b("SHA2-512", 64, 131, 40, 8), new d("XMSSMT_SHA2-512_W16_H40_D8"));
        hashMap.put(d.b("SHA2-512", 64, 131, 60, 3), new d("XMSSMT_SHA2-512_W16_H60_D3"));
        hashMap.put(d.b("SHA2-512", 64, 131, 60, 6), new d("XMSSMT_SHA2-512_W16_H60_D6"));
        hashMap.put(d.b("SHA2-512", 64, 131, 60, 12), new d("XMSSMT_SHA2-512_W16_H60_D12"));
        hashMap.put(d.b("SHAKE128", 32, 67, 20, 2), new d("XMSSMT_SHAKE128_W16_H20_D2"));
        hashMap.put(d.b("SHAKE128", 32, 67, 20, 4), new d("XMSSMT_SHAKE128_W16_H20_D4"));
        hashMap.put(d.b("SHAKE128", 32, 67, 40, 2), new d("XMSSMT_SHAKE128_W16_H40_D2"));
        hashMap.put(d.b("SHAKE128", 32, 67, 40, 4), new d("XMSSMT_SHAKE128_W16_H40_D4"));
        hashMap.put(d.b("SHAKE128", 32, 67, 40, 8), new d("XMSSMT_SHAKE128_W16_H40_D8"));
        hashMap.put(d.b("SHAKE128", 32, 67, 60, 3), new d("XMSSMT_SHAKE128_W16_H60_D3"));
        hashMap.put(d.b("SHAKE128", 32, 67, 60, 6), new d("XMSSMT_SHAKE128_W16_H60_D6"));
        hashMap.put(d.b("SHAKE128", 32, 67, 60, 12), new d("XMSSMT_SHAKE128_W16_H60_D12"));
        hashMap.put(d.b("SHAKE256", 64, 131, 20, 2), new d("XMSSMT_SHAKE256_W16_H20_D2"));
        hashMap.put(d.b("SHAKE256", 64, 131, 20, 4), new d("XMSSMT_SHAKE256_W16_H20_D4"));
        hashMap.put(d.b("SHAKE256", 64, 131, 40, 2), new d("XMSSMT_SHAKE256_W16_H40_D2"));
        hashMap.put(d.b("SHAKE256", 64, 131, 40, 4), new d("XMSSMT_SHAKE256_W16_H40_D4"));
        hashMap.put(d.b("SHAKE256", 64, 131, 40, 8), new d("XMSSMT_SHAKE256_W16_H40_D8"));
        hashMap.put(d.b("SHAKE256", 64, 131, 60, 3), new d("XMSSMT_SHAKE256_W16_H60_D3"));
        hashMap.put(d.b("SHAKE256", 64, 131, 60, 6), new d("XMSSMT_SHAKE256_W16_H60_D6"));
        hashMap.put(d.b("SHAKE256", 64, 131, 60, 12), new d("XMSSMT_SHAKE256_W16_H60_D12"));
        a = Collections.unmodifiableMap(hashMap);
    }
}

