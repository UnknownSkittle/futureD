/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.a.c.a;

final class v
extends a {
    private final boolean[] a;

    public v(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.b();
        this.c();
        this.a = new boolean[this.h()];
        for (int i2 = 0; i2 < 256; ++i2) {
            this.a[i2] = true;
        }
        v v2 = this;
        v2.d(v2.i() + 1);
    }

    @Override
    protected final int a(int n2, byte by2) {
        int n3;
        for (n3 = this.j(); n3 < 8192 && this.a[n3]; ++n3) {
        }
        this.d(n3);
        n2 = this.b(n2, by2);
        if (n2 >= 0) {
            this.a[n2] = true;
        }
        return n2;
    }

    private void k() {
        int n2;
        boolean[] blArray = new boolean[8192];
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (!this.a[n2] || this.b(n2) == -1) continue;
            blArray[this.b((int)n2)] = true;
        }
        for (n2 = this.i() + 1; n2 < 8192; ++n2) {
            if (blArray[n2]) continue;
            this.a[n2] = false;
            this.c(n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final int a() {
        int n2 = this.d();
        if (n2 < 0) {
            return -1;
        }
        if (n2 == this.i()) {
            int n3 = this.d();
            if (n3 < 0) {
                throw new IOException("Unexpected EOF;");
            }
            if (n3 == 1) {
                if (this.f() >= 13) throw new IOException("Attempt to increase code size beyond maximum");
                this.g();
                return 0;
            } else {
                if (n3 != 2) throw new IOException("Invalid clear code subcode ".concat(String.valueOf(n3)));
                this.k();
                v v2 = this;
                v2.d(v2.i() + 1);
            }
            return 0;
        }
        boolean bl2 = false;
        int n4 = n2;
        if (this.a[n2]) return this.a(n4, bl2);
        n4 = this.e();
        bl2 = true;
        return this.a(n4, bl2);
    }
}

