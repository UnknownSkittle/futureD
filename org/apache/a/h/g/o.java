/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import com.a.a.r;
import java.io.InputStream;
import java.nio.charset.CharsetDecoder;
import org.apache.a.d.d;
import org.apache.a.h.g.l;
import org.apache.a.i.a;
import org.apache.a.i.f;
import org.apache.a.n.b;
import org.apache.a.x;

public final class o
implements a,
f {
    private final l a;
    private final byte[] b;
    private final org.apache.a.n.a c;
    private final int d;
    private final d e;
    private final CharsetDecoder f;
    private InputStream g;
    private int h;
    private int i;

    public o(l l2, d d2) {
        ai.a(l2, "HTTP transport metrcis");
        ai.a(8192, "Buffer size");
        this.a = l2;
        this.b = new byte[8192];
        this.h = 0;
        this.i = 0;
        this.d = 512;
        this.e = d2 != null ? d2 : org.apache.a.d.d.a;
        this.c = new org.apache.a.n.a(8192);
        this.f = null;
    }

    public final void a(InputStream inputStream) {
        this.g = inputStream;
    }

    public final boolean a() {
        return this.g != null;
    }

    @Override
    public final int b() {
        return this.i - this.h;
    }

    private int b(byte[] byArray, int n2, int n3) {
        r.a(this.g, "Input stream");
        return this.g.read(byArray, n2, n3);
    }

    public final int c() {
        int n2;
        if (this.h > 0) {
            n2 = this.i - this.h;
            if (n2 > 0) {
                System.arraycopy(this.b, this.h, this.b, 0, n2);
            }
            this.h = 0;
            this.i = n2;
        }
        int n3 = this.i;
        n2 = 8192 - n3;
        o o2 = this;
        if ((n2 = o2.b(o2.b, n3, n2)) == -1) {
            return -1;
        }
        this.i = n3 + n2;
        this.a.a(n2);
        return n2;
    }

    public final boolean d() {
        return this.h < this.i;
    }

    public final void e() {
        this.h = 0;
        this.i = 0;
    }

    @Override
    public final int f() {
        while (!this.d()) {
            if (this.c() != -1) continue;
            return -1;
        }
        return this.b[this.h++] & 0xFF;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            return 0;
        }
        if (this.d()) {
            n3 = Math.min(n3, this.i - this.h);
            System.arraycopy(this.b, this.h, byArray, n2, n3);
            this.h += n3;
            return n3;
        }
        if (n3 > 512) {
            if ((n3 = this.b(byArray, n2, n3)) > 0) {
                this.a.a(n3);
            }
            return n3;
        }
        while (!this.d()) {
            if (this.c() != -1) continue;
            return -1;
        }
        n3 = Math.min(n3, this.i - this.h);
        System.arraycopy(this.b, this.h, byArray, n2, n3);
        this.h += n3;
        return n3;
    }

    @Override
    public final int a(b object) {
        ai.a(object, "Char array buffer");
        int n2 = this.e.a();
        int n3 = 0;
        int n4 = 1;
        while (n4 != 0) {
            int n5;
            int n6 = -1;
            for (n5 = this.h; n5 < this.i; ++n5) {
                if (this.b[n5] != 10) continue;
                n6 = n5;
                break;
            }
            if (n2 > 0 && this.c.c() + (n6 > 0 ? n6 : this.i) - this.h >= n2) {
                throw new x("Maximum line length limit exceeded");
            }
            if (n6 != -1) {
                if (this.c.e()) {
                    n3 = n6;
                    Object object2 = object;
                    object = this;
                    n4 = ((o)object).h;
                    ((o)object).h = n3 + 1;
                    if (n3 > n4 && ((o)object).b[n3 - 1] == 13) {
                        --n3;
                    }
                    n6 = n3 - n4;
                    ((b)object2).a(((o)object).b, n4, n6);
                    return n6;
                }
                n4 = 0;
                n5 = n6 + 1 - this.h;
                this.c.a(this.b, this.h, n5);
                this.h = n6 + 1;
                continue;
            }
            if (this.d()) {
                n5 = this.i - this.h;
                this.c.a(this.b, this.h, n5);
                this.h = this.i;
            }
            if ((n3 = this.c()) != -1) continue;
            n4 = 0;
        }
        if (n3 == -1 && this.c.e()) {
            return -1;
        }
        b b2 = object;
        object = this;
        n3 = ((o)object).c.c();
        if (n3 > 0) {
            if (((o)object).c.b(n3 - 1) == 10) {
                --n3;
            }
            if (n3 > 0 && ((o)object).c.b(n3 - 1) == 13) {
                --n3;
            }
        }
        int n7 = n3;
        b2.a(((o)object).c.d(), 0, n7);
        ((o)object).c.a();
        return n3;
    }
}

