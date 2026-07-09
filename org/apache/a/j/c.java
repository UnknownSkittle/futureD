/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.f;
import org.apache.a.y;

public final class c
implements Cloneable,
f {
    private final String a;
    private final String b;
    private final y[] c;

    public c(String string, String string2, y[] yArray) {
        this.a = ai.a(string, "Name");
        this.b = string2;
        if (yArray != null) {
            this.c = yArray;
            return;
        }
        this.c = new y[0];
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final String b() {
        return this.b;
    }

    @Override
    public final y[] c() {
        return (y[])this.c.clone();
    }

    @Override
    public final y a(String string) {
        ai.a(string, "Name");
        y y2 = null;
        y[] yArray = this.c;
        int n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            y y3 = yArray[i2];
            if (!y3.a().equalsIgnoreCase(string)) continue;
            y2 = y3;
            break;
        }
        return y2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof f) {
            object = (c)object;
            return this.a.equals(((c)object).a) && ai.a((Object)this.b, (Object)((c)object).b) && ai.a(this.c, ((c)object).c);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = ai.a(ai.a(17, (Object)this.a), (Object)this.b);
        y[] yArray = this.c;
        int n3 = this.c.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            y y2 = yArray[i2];
            n2 = ai.a(n2, (Object)y2);
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        if (this.b != null) {
            stringBuilder.append("=");
            stringBuilder.append(this.b);
        }
        y[] yArray = this.c;
        int n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            y y2 = yArray[i2];
            stringBuilder.append("; ");
            stringBuilder.append(y2);
        }
        return stringBuilder.toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

