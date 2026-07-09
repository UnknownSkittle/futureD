/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.f;

import com.a.a.b.ai;
import java.util.Locale;

public final class f {
    private final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public f(String string, int n2, String string2, boolean bl2) {
        ai.b(string, "Host");
        ai.b(n2, "Port");
        ai.a(string2, "Path");
        this.a = string.toLowerCase(Locale.ROOT);
        this.b = n2;
        this.c = !ai.b(string2) ? string2 : "/";
        this.d = bl2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        if (this.d) {
            stringBuilder.append("(secure)");
        }
        stringBuilder.append(this.a);
        stringBuilder.append(':');
        stringBuilder.append(Integer.toString(this.b));
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

