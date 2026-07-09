/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.d;

import com.a.a.b.ai;
import java.util.Collections;
import java.util.List;
import org.apache.a.e.d.a;

public final class c {
    private final a a;
    private final List<String> b;
    private final List<String> c;

    public c(a a2, List<String> list, List<String> list2) {
        this.a = ai.a(a2, "Domain type");
        this.b = Collections.unmodifiableList(ai.a(list, "Domain suffix rules"));
        this.c = Collections.unmodifiableList(list2 != null ? list2 : Collections.emptyList());
    }

    public final a a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final List<String> c() {
        return this.c;
    }
}

