/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.io.Serializable;
import org.apache.a.y;

public final class m
implements Serializable,
Cloneable,
y {
    private final String a;
    private final String b;

    public m(String string, String string2) {
        this.a = ai.a(string, "Name");
        this.b = string2;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final String toString() {
        if (this.b == null) {
            return this.a;
        }
        int n2 = this.a.length() + 1 + this.b.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof y) {
            object = (m)object;
            return this.a.equals(((m)object).a) && ai.a((Object)this.b, (Object)((m)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return ai.a(ai.a(17, (Object)this.a), (Object)this.b);
    }

    public final Object clone() {
        return super.clone();
    }
}

