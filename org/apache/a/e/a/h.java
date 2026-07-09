/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.a;

import com.a.a.b.ai;
import com.a.a.r;
import java.net.InetAddress;
import org.apache.a.e.a.b;
import org.apache.a.e.a.e;
import org.apache.a.e.a.f;
import org.apache.a.e.a.g;
import org.apache.a.n;

public final class h
implements Cloneable,
e {
    private final n a;
    private final InetAddress b;
    private boolean c;
    private n[] d;
    private g e;
    private f f;
    private boolean g;

    private h(n n2, InetAddress inetAddress) {
        ai.a(n2, "Target host");
        this.a = n2;
        this.b = inetAddress;
        this.e = org.apache.a.e.a.g.a;
        this.f = org.apache.a.e.a.f.a;
    }

    public h(b b2) {
        this(b2.a(), b2.b());
    }

    public final void a(boolean bl2) {
        r.a(!this.c, "Already connected");
        this.c = true;
        this.g = bl2;
    }

    public final void a(n n2) {
        ai.a(n2, "Proxy host");
        r.a(!this.c, "Already connected");
        this.c = true;
        this.d = new n[]{n2};
        this.g = false;
    }

    public final void c() {
        r.a(this.c, "No tunnel unless connected");
        r.a(this.d, "No tunnel without proxy");
        this.e = org.apache.a.e.a.g.b;
        this.g = false;
    }

    public final void b(boolean bl2) {
        r.a(this.c, "No layered protocol unless connected");
        this.f = org.apache.a.e.a.f.b;
        this.g = bl2;
    }

    @Override
    public final n a() {
        return this.a;
    }

    @Override
    public final InetAddress b() {
        return this.b;
    }

    @Override
    public final int d() {
        int n2 = 0;
        if (this.c) {
            n2 = this.d == null ? 1 : this.d.length + 1;
        }
        return n2;
    }

    @Override
    public final n a(int n2) {
        ai.b(n2, "Hop index");
        int n3 = this.d();
        ai.a(n2 < n3, "Hop index exceeds tracked route length");
        n n4 = n2 < n3 - 1 ? this.d[n2] : this.a;
        return n4;
    }

    @Override
    public final n e() {
        if (this.d == null) {
            return null;
        }
        return this.d[0];
    }

    @Override
    public final boolean f() {
        return this.e == org.apache.a.e.a.g.b;
    }

    @Override
    public final boolean g() {
        return this.f == org.apache.a.e.a.f.b;
    }

    @Override
    public final boolean h() {
        return this.g;
    }

    public final b i() {
        if (!this.c) {
            return null;
        }
        return new b(this.a, this.b, this.d, this.g, this.e, this.f);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        return this.c == ((h)object).c && this.g == ((h)object).g && this.e == ((h)object).e && this.f == ((h)object).f && ai.a(this.a, (Object)((h)object).a) && ai.a(this.b, (Object)((h)object).b) && ai.a(this.d, ((h)object).d);
    }

    public final int hashCode() {
        int n2 = ai.a(ai.a(17, (Object)this.a), (Object)this.b);
        if (this.d != null) {
            n[] nArray = this.d;
            int n3 = this.d.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                n n4 = nArray[i2];
                n2 = ai.a(n2, (Object)n4);
            }
        }
        return ai.a(ai.a(ai.a(ai.a(n2, this.c), this.g), (Object)this.e), (Object)this.f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(50 + this.d() * 30);
        stringBuilder.append("RouteTracker[");
        if (this.b != null) {
            stringBuilder.append(this.b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.c) {
            stringBuilder.append('c');
        }
        if (this.e == org.apache.a.e.a.g.b) {
            stringBuilder.append('t');
        }
        if (this.f == org.apache.a.e.a.f.b) {
            stringBuilder.append('l');
        }
        if (this.g) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.d != null) {
            n[] nArray = this.d;
            int n2 = this.d.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                n n3 = nArray[i2];
                stringBuilder.append(n3);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final Object clone() {
        return super.clone();
    }
}

