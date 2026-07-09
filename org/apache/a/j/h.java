/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.j.a;
import org.apache.a.j.n;
import org.apache.a.q;
import org.apache.a.v;

public final class h
extends a
implements q {
    private final String c;
    private final String d;
    private ae e;

    public h(String string, String string2, ac ac2) {
        this(new n(string, string2, ac2));
    }

    private h(ae ae2) {
        super((byte)0);
        this.e = ai.a(ae2, "Request line");
        this.c = ae2.a();
        this.d = ae2.c();
    }

    @Override
    public final ac c() {
        return this.g().b();
    }

    @Override
    public final ae g() {
        if (this.e == null) {
            this.e = new n(this.c, this.d, v.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.c + ' ' + this.d + ' ' + this.a;
    }
}

