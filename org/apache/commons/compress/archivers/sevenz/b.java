/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import javax.crypto.CipherInputStream;
import org.apache.commons.compress.archivers.sevenz.a;
import org.apache.commons.compress.archivers.sevenz.i;

final class b
extends InputStream {
    private boolean a = false;
    private CipherInputStream b = null;
    private /* synthetic */ i c;
    private /* synthetic */ String d;
    private /* synthetic */ byte[] e;
    private /* synthetic */ InputStream f;
    private /* synthetic */ a g;

    b(a a2, i i2, String string, InputStream inputStream) {
        this.g = a2;
        this.c = i2;
        this.d = string;
        this.e = null;
        this.f = inputStream;
    }

    private CipherInputStream a() {
        int n2 = 0xFF & this.c.d[0];
        int n3 = 0xFF & this.c.d[1];
        int n4 = (n2 >> 6 & 1) + (n3 & 0xF);
        if ((n2 = (n2 >> 7 & 1) + (n3 >> 4)) + 2 + n4 > this.c.d.length) {
            throw new IOException("Salt size + IV size too long in " + this.d);
        }
        byte[] byArray = new byte[n2];
        System.arraycopy(this.c.d, 2, byArray, 0, n2);
        byArray = new byte[16];
        System.arraycopy(this.c.d, n2 + 2, byArray, 0, n4);
        throw new org.apache.commons.compress.a(this.d);
    }

    @Override
    public final int read() {
        return this.a().read();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        return this.a().read(byArray, n2, n3);
    }

    @Override
    public final void close() {
    }
}

