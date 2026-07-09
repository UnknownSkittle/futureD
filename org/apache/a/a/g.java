/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.io.Serializable;
import java.security.Principal;

public final class g
implements Serializable,
Principal {
    private final String a;

    public g(String string) {
        ai.a(string, "User name");
        this.a = string;
    }

    @Override
    public final String getName() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return ai.a(17, (Object)this.a);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            object = (g)object;
            if (ai.a((Object)this.a, (Object)((g)object).a)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

