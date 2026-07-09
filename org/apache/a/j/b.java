/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.io.Serializable;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.j.g;
import org.apache.a.j.j;

public final class b
implements Serializable,
Cloneable,
e {
    private final String a;
    private final String b;

    public b(String string, String string2) {
        this.a = ai.a(string, "Name");
        this.b = string2;
    }

    @Override
    public final String c() {
        return this.a;
    }

    @Override
    public final String d() {
        return this.b;
    }

    public final String toString() {
        return j.a.a(null, this).toString();
    }

    @Override
    public final f[] e() {
        if (this.b != null) {
            return g.a(this.b);
        }
        return new f[0];
    }

    public final Object clone() {
        return super.clone();
    }
}

