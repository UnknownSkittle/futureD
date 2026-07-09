/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.io.Serializable;
import org.apache.a.aa;
import org.apache.a.d;
import org.apache.a.f;
import org.apache.a.j.g;
import org.apache.a.j.v;
import org.apache.a.n.b;

public final class q
implements Serializable,
Cloneable,
d {
    private final String a;
    private final b b;
    private final int c;

    public q(b b2) {
        ai.a(b2, "Char array buffer");
        int n2 = b2.b(58);
        if (n2 == -1) {
            throw new aa("Invalid header: " + b2.toString());
        }
        String string = b2.b(0, n2);
        if (string.length() == 0) {
            throw new aa("Invalid header: " + b2.toString());
        }
        this.b = b2;
        this.a = string;
        this.c = n2 + 1;
    }

    @Override
    public final String c() {
        return this.a;
    }

    @Override
    public final String d() {
        return this.b.b(this.c, this.b.length());
    }

    @Override
    public final f[] e() {
        v v2 = new v(0, this.b.length());
        v2.a(this.c);
        return g.a.a(this.b, v2);
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final b a() {
        return this.b;
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

