/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.k;

import java.util.Set;
import org.apache.a.k.c;
import org.apache.a.k.d;

@Deprecated
public abstract class a
implements c,
d {
    protected a() {
    }

    @Override
    public final long a(String object, long l2) {
        if ((object = this.a((String)object)) == null) {
            return l2;
        }
        return (Long)object;
    }

    @Override
    public final int a(String object, int n2) {
        if ((object = this.a((String)object)) == null) {
            return n2;
        }
        return (Integer)object;
    }

    @Override
    public final boolean a(String object, boolean bl2) {
        if ((object = this.a((String)object)) == null) {
            return bl2;
        }
        return (Boolean)object;
    }

    @Override
    public Set<String> a() {
        throw new UnsupportedOperationException();
    }
}

