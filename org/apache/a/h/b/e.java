/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.io.Closeable;
import java.net.URI;
import org.apache.a.b.c.b;
import org.apache.a.b.c.l;
import org.apache.a.b.d;
import org.apache.a.b.f.c;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.commons.c.a;

public abstract class e
implements Closeable {
    private final a a = org.apache.commons.c.c.b(this.getClass());

    protected abstract b a(n var1, q var2);

    public final b a(l l2) {
        ai.a(l2, "HTTP request");
        Object object = l2;
        n n2 = null;
        object = object.i();
        if (((URI)object).isAbsolute() && (n2 = c.a((URI)object)) == null) {
            throw new d("URI does not specify a valid host name: ".concat(String.valueOf(object)));
        }
        return this.a(n2, l2);
    }
}

