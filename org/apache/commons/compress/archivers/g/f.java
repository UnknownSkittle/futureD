/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.g.c;
import org.apache.commons.compress.archivers.g.d;
import org.apache.commons.compress.archivers.g.e;
import org.apache.commons.compress.archivers.g.g;

final class f
extends InputStream {
    private final InputStream a;
    private d b;
    private final int c;
    private final int d;
    private final int e;
    private c f;
    private c g;
    private c h;
    private final e i = new e();
    private long j = 0L;
    private long k = 0L;

    public f(int n2, int n3, InputStream inputStream) {
        if (n2 != 4096 && n2 != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (n3 != 2 && n3 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.c = n2;
        this.d = n3;
        this.e = n3;
        this.a = inputStream;
    }

    @Override
    public final int read() {
        int n2;
        block16: {
            int n3;
            Object object;
            block17: {
                if (this.i.a()) break block16;
                object = this;
                f f2 = object;
                if (((f)object).b != null) break block17;
                f f3 = f2;
                g g2 = new g(f3, f3.a);
                Throwable throwable = null;
                try {
                    if (f2.d == 3) {
                        f2.f = org.apache.commons.compress.archivers.g.c.a(g2, 256);
                    }
                    f2.g = org.apache.commons.compress.archivers.g.c.a(g2, 64);
                    f2.h = org.apache.commons.compress.archivers.g.c.a(g2, 64);
                    f2.k += g2.a();
                } catch (Throwable throwable2) {
                    try {
                        object = throwable2;
                        throwable = throwable2;
                        throw object;
                    } catch (Throwable throwable3) {
                        if (throwable != null) {
                            try {
                                ((FilterInputStream)g2).close();
                            } catch (Throwable throwable4) {
                                throwable.addSuppressed(throwable4);
                            }
                        } else {
                            ((FilterInputStream)g2).close();
                        }
                        throw throwable3;
                    }
                }
                ((FilterInputStream)g2).close();
                f2.b = new d(f2.a);
            }
            if ((n3 = (int)((f)object).b.a(1)) == 1) {
                n3 = ((f)object).f != null ? ((f)object).f.a(((f)object).b) : (int)((f)object).b.a(8);
                if (n3 != -1) {
                    ((f)object).i.a(n3);
                }
            } else if (n3 == 0) {
                n3 = ((f)object).c == 4096 ? 6 : 7;
                int n4 = (int)((f)object).b.a(n3);
                int n5 = ((f)object).h.a(((f)object).b);
                if (n5 != -1 || n4 > 0) {
                    n3 = n5 << n3 | n4;
                    n4 = ((f)object).g.a(((f)object).b);
                    if (n4 == 63) {
                        n4 = (int)((long)n4 + ((f)object).b.a(8));
                    }
                    ((f)object).i.a(n3 + 1, n4 += ((f)object).e);
                }
            }
        }
        if ((n2 = this.i.b()) >= 0) {
            ++this.j;
        }
        return n2;
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

