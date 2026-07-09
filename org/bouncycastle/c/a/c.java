/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.c.a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.b.e;
import org.bouncycastle.jcajce.provider.a.b;

final class c
implements e {
    private ThreadLocal a = new ThreadLocal();
    private ThreadLocal b = new ThreadLocal();
    private volatile Set c = new HashSet();
    private volatile Map d = new HashMap();

    c() {
    }

    static {
        new b("BC", "threadLocalEcImplicitlyCa");
        new b("BC", "ecImplicitlyCa");
        new b("BC", "threadLocalDhDefaultParams");
        new b("BC", "DhDefaultParams");
        new b("BC", "acceptableEcCurves");
        new b("BC", "additionalEcParameters");
    }
}

