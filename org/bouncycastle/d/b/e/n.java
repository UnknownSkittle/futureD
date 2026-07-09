/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.b.e;

final class n
implements e {
    private static final Map<String, n> a;
    private final int b;
    private final String c;

    private n(int n2, String string) {
        this.b = n2;
        this.c = string;
    }

    protected static n a(String string, int n2, int n3) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return a.get(n.b(string, n2, n3));
    }

    private static String b(String string, int n2, int n3) {
        if (string == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return string + "-" + n2 + "-16-" + n3;
    }

    public final String toString() {
        return this.c;
    }

    static {
        HashMap<String, n> hashMap = new HashMap<String, n>();
        hashMap.put(n.b("SHA-256", 32, 67), new n(0x1000001, "WOTSP_SHA2-256_W16"));
        hashMap.put(n.b("SHA-512", 64, 131), new n(0x2000002, "WOTSP_SHA2-512_W16"));
        hashMap.put(n.b("SHAKE128", 32, 67), new n(0x3000003, "WOTSP_SHAKE128_W16"));
        hashMap.put(n.b("SHAKE256", 64, 131), new n(0x4000004, "WOTSP_SHAKE256_W16"));
        a = Collections.unmodifiableMap(hashMap);
    }
}

