/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.a;

import com.a.a.b.ai;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.a.e.a.e;
import org.apache.a.e.a.f;
import org.apache.a.e.a.g;
import org.apache.a.n;

public final class b
implements Cloneable,
e {
    private final n a;
    private final InetAddress b;
    private final List<n> c;
    private final g d;
    private final f e;
    private final boolean f;

    private b(n object, InetAddress inetAddress, List<n> list, boolean bl2, g g2, f f2) {
        n n2;
        ai.a(object, "Target host");
        if (((n)object).b() >= 0) {
            n2 = object;
        } else {
            InetAddress inetAddress2 = ((n)object).d();
            String string = ((n)object).c();
            if (inetAddress2 != null) {
                n2 = new n(inetAddress2, org.apache.a.e.a.b.a(string), string);
            } else {
                object = ((n)object).a();
                n2 = new n((String)object, org.apache.a.e.a.b.a(string), string);
            }
        }
        this.a = n2;
        this.b = inetAddress;
        this.c = list != null && !list.isEmpty() ? new ArrayList<n>(list) : null;
        if (g2 == g.b) {
            ai.a(this.c != null, "Proxy required if tunnelled");
        }
        this.f = bl2;
        this.d = g2 != null ? g2 : g.a;
        this.e = f2 != null ? f2 : org.apache.a.e.a.f.a;
    }

    private static int a(String string) {
        if ("http".equalsIgnoreCase(string)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(string)) {
            return 443;
        }
        return -1;
    }

    public b(n n2, InetAddress inetAddress, n[] nArray, boolean bl2, g g2, f f2) {
        this(n2, inetAddress, nArray != null ? Arrays.asList(nArray) : null, bl2, g2, f2);
    }

    public b(n n2, InetAddress inetAddress, boolean bl2) {
        this(n2, inetAddress, Collections.emptyList(), bl2, g.a, org.apache.a.e.a.f.a);
    }

    public b(n n2, InetAddress inetAddress, n n3, boolean bl2) {
        boolean bl3 = bl2;
        this(n2, inetAddress, Collections.singletonList(ai.a(n3, "Proxy host")), bl3, bl3 ? g.b : g.a, bl2 ? org.apache.a.e.a.f.b : org.apache.a.e.a.f.a);
    }

    @Override
    public final n a() {
        return this.a;
    }

    @Override
    public final InetAddress b() {
        return this.b;
    }

    public final InetSocketAddress c() {
        if (this.b != null) {
            return new InetSocketAddress(this.b, 0);
        }
        return null;
    }

    @Override
    public final int d() {
        if (this.c != null) {
            return this.c.size() + 1;
        }
        return 1;
    }

    @Override
    public final n a(int n2) {
        ai.b(n2, "Hop index");
        int n3 = this.d();
        ai.a(n2 < n3, "Hop index exceeds tracked route length");
        if (n2 < n3 - 1) {
            return this.c.get(n2);
        }
        return this.a;
    }

    @Override
    public final n e() {
        if (this.c != null && !this.c.isEmpty()) {
            return this.c.get(0);
        }
        return null;
    }

    @Override
    public final boolean f() {
        return this.d == g.b;
    }

    @Override
    public final boolean g() {
        return this.e == org.apache.a.e.a.f.b;
    }

    @Override
    public final boolean h() {
        return this.f;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            return this.f == ((b)object).f && this.d == ((b)object).d && this.e == ((b)object).e && ai.a(this.a, (Object)((b)object).a) && ai.a(this.b, (Object)((b)object).b) && ai.a(this.c, ((b)object).c);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = ai.a(ai.a(17, (Object)this.a), (Object)this.b);
        if (this.c != null) {
            for (n n3 : this.c) {
                n2 = ai.a(n2, (Object)n3);
            }
        }
        return ai.a(ai.a(ai.a(n2, this.f), (Object)this.d), (Object)this.e);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(50 + this.d() * 30);
        if (this.b != null) {
            stringBuilder.append(this.b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.d == g.b) {
            stringBuilder.append('t');
        }
        if (this.e == org.apache.a.e.a.f.b) {
            stringBuilder.append('l');
        }
        if (this.f) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.c != null) {
            for (n n2 : this.c) {
                stringBuilder.append(n2);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

