/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.io.Serializable;
import java.security.Principal;

public final class o
implements Serializable,
Principal {
    private final String a;
    private final String b;
    private final String c;

    @Override
    public final String getName() {
        return this.c;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ai.a(ai.a(17, (Object)this.a), (Object)this.b);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof o) {
            object = (o)object;
            if (ai.a((Object)this.a, (Object)((o)object).a) && ai.a((Object)this.b, (Object)((o)object).b)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.c;
    }
}

