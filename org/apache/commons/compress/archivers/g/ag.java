/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.ar;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;

public class ag
implements au {
    static final ax a = new ax(1);
    private static final byte[] b = new byte[0];
    private ar c;
    private ar d;
    private ar e;
    private av f;

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(this.c != null ? 16 : 0);
    }

    @Override
    public final ax d() {
        return new ax((this.c != null ? 8 : 0) + (this.d != null ? 8 : 0) + (this.e != null ? 8 : 0) + (this.f != null ? 4 : 0));
    }

    @Override
    public final byte[] e() {
        if (this.c != null || this.d != null) {
            if (this.c == null || this.d == null) {
                throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
            }
            byte[] byArray = new byte[16];
            this.a(byArray);
            return byArray;
        }
        return b;
    }

    @Override
    public final byte[] c() {
        byte[] byArray = new byte[this.d().b()];
        int n2 = this.a(byArray);
        if (this.e != null) {
            System.arraycopy(this.e.a(), 0, byArray, n2, 8);
            n2 += 8;
        }
        if (this.f != null) {
            System.arraycopy(this.f.a(), 0, byArray, n2, 4);
        }
        return byArray;
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        if (n3 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
        this.c = new ar(byArray, n2);
        this.d = new ar(byArray, n2 += 8);
        n2 += 8;
        if ((n3 -= 16) >= 8) {
            this.e = new ar(byArray, n2);
            n2 += 8;
            n3 -= 8;
        }
        if (n3 >= 4) {
            this.f = new av(byArray, n2);
        }
    }

    public final ar b() {
        return this.c;
    }

    public final void a(ar ar2) {
        this.c = ar2;
    }

    public final ar g() {
        return this.d;
    }

    public final void b(ar ar2) {
        this.d = ar2;
    }

    public final void c(ar ar2) {
        this.e = ar2;
    }

    private int a(byte[] byArray) {
        int n2 = 0;
        if (this.c != null) {
            System.arraycopy(this.c.a(), 0, byArray, 0, 8);
            n2 += 8;
        }
        if (this.d != null) {
            System.arraycopy(this.d.a(), 0, byArray, n2, 8);
            n2 += 8;
        }
        return n2;
    }
}

