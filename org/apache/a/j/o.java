/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.io.Serializable;
import org.apache.a.ac;
import org.apache.a.af;
import org.apache.a.j.j;

public final class o
implements Serializable,
Cloneable,
af {
    private final ac a;
    private final int b;
    private final String c;

    public o(ac ac2, int n2, String string) {
        this.a = ai.a(ac2, "Version");
        this.b = ai.b(n2, "Status code");
        this.c = string;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final ac a() {
        return this.a;
    }

    @Override
    public final String c() {
        return this.c;
    }

    public final String toString() {
        return j.a(this).toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

