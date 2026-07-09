/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import com.a.a.r;
import java.io.OutputStream;
import java.nio.charset.CharsetEncoder;
import org.apache.a.h.g.l;
import org.apache.a.i.a;
import org.apache.a.i.g;
import org.apache.a.n.b;

public final class p
implements a,
g {
    private static final byte[] a = new byte[]{13, 10};
    private final l b;
    private final org.apache.a.n.a c;
    private final int d;
    private final CharsetEncoder e;
    private OutputStream f;

    public p(l l2, int n2) {
        ai.a(8192, "Buffer size");
        ai.a(l2, "HTTP transport metrcis");
        this.b = l2;
        this.c = new org.apache.a.n.a(8192);
        this.d = n2 >= 0 ? n2 : 0;
        this.e = null;
    }

    public final void a(OutputStream outputStream) {
        this.f = outputStream;
    }

    public final boolean a() {
        return this.f != null;
    }

    @Override
    public final int b() {
        return this.c.c();
    }

    private void b(byte[] byArray, int n2, int n3) {
        r.a(this.f, "Output stream");
        this.f.write(byArray, n2, n3);
    }

    private void d() {
        int n2 = this.c.c();
        if (n2 > 0) {
            p p2 = this;
            p2.b(p2.c.d(), 0, n2);
            this.c.a();
            this.b.a(n2);
        }
    }

    @Override
    public final void c() {
        this.d();
        p p2 = this;
        if (p2.f != null) {
            p2.f.flush();
        }
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            return;
        }
        if (n3 > this.d || n3 > this.c.b()) {
            this.d();
            this.b(byArray, n2, n3);
            this.b.a(n3);
            return;
        }
        int n4 = this.c.b() - this.c.c();
        if (n3 > n4) {
            this.d();
        }
        this.c.a(byArray, n2, n3);
    }

    private void a(byte[] byArray) {
        if (byArray == null) {
            return;
        }
        this.a(byArray, 0, byArray.length);
    }

    @Override
    public final void a(int n2) {
        if (this.d > 0) {
            if (this.c.f()) {
                this.d();
            }
            this.c.a(n2);
            return;
        }
        this.d();
        this.f.write(n2);
    }

    @Override
    public final void a(String string) {
        if (string == null) {
            return;
        }
        if (string.length() > 0) {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                this.a(string.charAt(i2));
            }
        }
        this.a(a);
    }

    @Override
    public final void a(b b2) {
        int n2;
        if (b2 == null) {
            return;
        }
        int n3 = 0;
        for (int i2 = b2.length(); i2 > 0; i2 -= n2) {
            n2 = Math.min(this.c.b() - this.c.c(), i2);
            if (n2 > 0) {
                int n4 = n2;
                int n5 = n3;
                b b3 = b2;
                org.apache.a.n.a a2 = this.c;
                if (b3 != null) {
                    a2.a(b3.b(), n5, n4);
                }
            }
            if (this.c.f()) {
                this.d();
            }
            n3 += n2;
        }
        this.a(a);
    }
}

