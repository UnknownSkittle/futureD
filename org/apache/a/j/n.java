/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.io.Serializable;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.j.j;

public final class n
implements Serializable,
Cloneable,
ae {
    private final ac a;
    private final String b;
    private final String c;

    public n(String string, String string2, ac ac2) {
        this.b = ai.a(string, "Method");
        this.c = ai.a(string2, "URI");
        this.a = ai.a(ac2, "Version");
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public final ac b() {
        return this.a;
    }

    @Override
    public final String c() {
        return this.c;
    }

    public final String toString() {
        return j.a.a(null, this).toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

