/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import com.a.a.b.ai;
import org.apache.a.e.m;
import org.apache.a.n;

public final class k
implements m {
    public static final k a = new k();

    @Override
    public final int a(n object) {
        ai.a(object, "HTTP host");
        int n2 = ((n)object).b();
        if (n2 > 0) {
            return n2;
        }
        if (((String)(object = ((n)object).c())).equalsIgnoreCase("http")) {
            return 80;
        }
        if (((String)object).equalsIgnoreCase("https")) {
            return 443;
        }
        throw new org.apache.a.e.n((String)object + " protocol is not supported");
    }
}

