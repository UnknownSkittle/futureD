/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

import com.a.a.b.ai;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

public final class n
implements Serializable,
Cloneable {
    private String a;
    private String b;
    private int c;
    private String d;
    private InetAddress e;

    public n(String string, int n2, String string2) {
        String string3 = "Host name";
        String string4 = string;
        if (string4 == null) {
            throw new IllegalArgumentException(string3 + " may not be null");
        }
        if (ai.c(string4)) {
            throw new IllegalArgumentException(string3 + " may not contain blanks");
        }
        this.a = string4;
        this.b = string.toLowerCase(Locale.ROOT);
        this.d = string2 != null ? string2.toLowerCase(Locale.ROOT) : "http";
        this.c = n2;
        this.e = null;
    }

    public n(String string, int n2) {
        this(string, n2, null);
    }

    public n(InetAddress inetAddress, int n2, String string) {
        this(ai.a(inetAddress, "Inet address"), inetAddress.getHostName(), n2, string);
    }

    private n(InetAddress inetAddress, String string, int n2, String string2) {
        this.e = ai.a(inetAddress, "Inet address");
        this.a = ai.a(string, "Hostname");
        this.b = this.a.toLowerCase(Locale.ROOT);
        this.d = string2 != null ? string2.toLowerCase(Locale.ROOT) : "http";
        this.c = n2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final InetAddress d() {
        return this.e;
    }

    public final String e() {
        if (this.c != -1) {
            StringBuilder stringBuilder = new StringBuilder(this.a.length() + 6);
            stringBuilder.append(this.a);
            stringBuilder.append(":");
            stringBuilder.append(Integer.toString(this.c));
            return stringBuilder.toString();
        }
        return this.a;
    }

    public final String toString() {
        n n2 = this;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2.d);
        stringBuilder.append("://");
        stringBuilder.append(n2.a);
        if (n2.c != -1) {
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString(n2.c));
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof n) {
            object = (n)object;
            return this.b.equals(((n)object).b) && this.c == ((n)object).c && this.d.equals(((n)object).d) && (this.e == null ? ((n)object).e == null : this.e.equals(((n)object).e));
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.c;
        n2 = ai.a(ai.a(17, (Object)this.b) * 37 + n2, (Object)this.d);
        if (this.e != null) {
            n2 = ai.a(n2, (Object)this.e);
        }
        return n2;
    }

    public final Object clone() {
        return super.clone();
    }
}

