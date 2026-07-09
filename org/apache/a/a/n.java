/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.io.Serializable;
import java.security.Principal;
import org.apache.a.a.j;
import org.apache.a.a.o;

public final class n
implements Serializable,
j {
    private final o a;
    private final String b;
    private final String c;

    @Override
    public final Principal a() {
        return this.a;
    }

    public final String c() {
        return this.a.b();
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final String d() {
        return this.a.a();
    }

    public final String e() {
        return this.c;
    }

    public final int hashCode() {
        return ai.a(ai.a(17, (Object)this.a), (Object)this.c);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof n) {
            object = (n)object;
            if (ai.a(this.a, (Object)((n)object).a) && ai.a((Object)this.c, (Object)((n)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.a);
        stringBuilder.append("][workstation: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

