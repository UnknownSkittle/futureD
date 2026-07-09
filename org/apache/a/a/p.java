/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.io.Serializable;
import java.security.Principal;
import org.apache.a.a.g;
import org.apache.a.a.j;

public final class p
implements Serializable,
j {
    private final g a;
    private final String b;

    @Deprecated
    public p(String string) {
        ai.a(string, "Username:password string");
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            this.a = new g(string.substring(0, n2));
            this.b = string.substring(n2 + 1);
            return;
        }
        this.a = new g(string);
        this.b = null;
    }

    public p(String string, String string2) {
        ai.a(string, "Username");
        this.a = new g(string);
        this.b = string2;
    }

    @Override
    public final Principal a() {
        return this.a;
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof p) {
            object = (p)object;
            if (ai.a(this.a, (Object)((p)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.a.toString();
    }
}

