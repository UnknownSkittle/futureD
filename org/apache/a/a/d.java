/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.n;

public final class d {
    public static final String a = null;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final n f;

    public d(String string, int n2, String string2, String string3) {
        this.d = string == null ? null : string.toLowerCase(Locale.ROOT);
        this.e = n2 < 0 ? -1 : n2;
        this.c = string2 == null ? null : string2;
        this.b = string3 == null ? null : string3.toUpperCase(Locale.ROOT);
        this.f = null;
    }

    public d(n n2, String string, String string2) {
        ai.a(n2, "Host");
        this.d = n2.a().toLowerCase(Locale.ROOT);
        this.e = n2.b() < 0 ? -1 : n2.b();
        this.c = string == null ? null : string;
        this.b = string2 == null ? null : string2.toUpperCase(Locale.ROOT);
        this.f = n2;
    }

    public d(n n2) {
        this(n2, null, null);
    }

    public d(String string, int n2) {
        this(string, n2, null, null);
    }

    public final int a(d d2) {
        int n2 = 0;
        if (ai.a((Object)this.b, (Object)d2.b)) {
            ++n2;
        } else if (this.b != null && d2.b != null) {
            return -1;
        }
        if (ai.a((Object)this.c, (Object)d2.c)) {
            n2 += 2;
        } else if (this.c != null && d2.c != null) {
            return -1;
        }
        if (this.e == d2.e) {
            n2 += 4;
        } else if (this.e != -1 && d2.e != -1) {
            return -1;
        }
        if (ai.a((Object)this.d, (Object)d2.d)) {
            n2 += 8;
        } else if (this.d != null && d2.d != null) {
            return -1;
        }
        return n2;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof d)) {
            return super.equals(object);
        }
        object = (d)object;
        return ai.a((Object)this.d, (Object)((d)object).d) && this.e == ((d)object).e && ai.a((Object)this.c, (Object)((d)object).c) && ai.a((Object)this.b, (Object)((d)object).b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b != null) {
            stringBuilder.append(this.b.toUpperCase(Locale.ROOT));
            stringBuilder.append(' ');
        }
        if (this.c != null) {
            stringBuilder.append('\'');
            stringBuilder.append(this.c);
            stringBuilder.append('\'');
        } else {
            stringBuilder.append("<any realm>");
        }
        if (this.d != null) {
            stringBuilder.append('@');
            stringBuilder.append(this.d);
            if (this.e >= 0) {
                stringBuilder.append(':');
                stringBuilder.append(this.e);
            }
        }
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int n2 = this.e;
        return ai.a(ai.a(ai.a(17, (Object)this.d) * 37 + n2, (Object)this.c), (Object)this.b);
    }

    static {
        new d(null, -1, null, null);
    }
}

