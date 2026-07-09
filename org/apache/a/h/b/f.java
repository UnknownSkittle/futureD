/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import org.apache.a.a.b;
import org.apache.a.a.j;

public final class f {
    private final b a;
    private final j b;

    public f(b b2, j j2) {
        ai.a(b2, "Auth scheme");
        ai.a(j2, "User credentials");
        this.a = b2;
        this.b = j2;
    }

    public final b a() {
        return this.a;
    }

    public final j b() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}

