/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.x;

final class y
extends FilterInputStream {
    private /* synthetic */ x a;

    y(x x2, InputStream inputStream) {
        this.a = x2;
        super(inputStream);
    }

    @Override
    public final int read() {
        int n2 = this.in.read();
        if (n2 >= 0) {
            this.a(1);
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = this.in.read(byArray, n2, n3);
        if (n4 >= 0) {
            this.a(n4);
        }
        return n4;
    }

    private void a(int n2) {
        x.a(this.a, x.a(this.a) + (long)n2);
    }
}

