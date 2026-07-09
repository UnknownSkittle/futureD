/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import org.apache.a.c;
import org.apache.a.h.a.o;
import org.apache.a.h.a.p;
import org.apache.commons.a.a.a;

class t {
    private byte[] a = null;
    private int b = 0;

    t() {
    }

    t(String string) {
        int n2;
        this.a = org.apache.commons.a.a.a.b(string.getBytes(p.d()));
        if (this.a.length < p.e().length) {
            throw new o("NTLM message decoding error - packet too short");
        }
        for (n2 = 0; n2 < p.e().length; ++n2) {
            if (this.a[n2] == p.e()[n2]) continue;
            throw new o("NTLM message expected - instead got unrecognized bytes");
        }
        n2 = this.a(p.e().length);
        if (n2 != 2) {
            throw new o("NTLM type " + Integer.toString(2) + " message expected - instead got type " + Integer.toString(n2));
        }
        this.b = this.a.length;
    }

    protected final int a() {
        return this.b;
    }

    protected final void a(byte[] byArray) {
        if (this.a.length < 24 + byArray.length) {
            throw new o("NTLM: Message too short");
        }
        System.arraycopy(this.a, 24, byArray, 0, byArray.length);
    }

    protected final int a(int n2) {
        return p.b(this.a, n2);
    }

    protected final byte[] b(int n2) {
        return p.c(this.a, n2);
    }

    protected final void a(int n2, int n3) {
        this.a = new byte[n2];
        this.b = 0;
        this.b(p.e());
        this.d(n3);
    }

    private void a(byte by2) {
        this.a[this.b] = by2;
        ++this.b;
    }

    protected final void b(byte[] byArray) {
        if (byArray == null) {
            return;
        }
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2;
            this.a[this.b] = by2 = byArray[i2];
            ++this.b;
        }
    }

    protected final void c(int n2) {
        this.a((byte)n2);
        this.a((byte)(n2 >> 8));
    }

    protected final void d(int n2) {
        this.a((byte)n2);
        this.a((byte)(n2 >> 8));
        this.a((byte)(n2 >> 16));
        this.a((byte)(n2 >>> 24));
    }

    String b() {
        byte[] byArray;
        if (this.a.length > this.b) {
            byArray = new byte[this.b];
            System.arraycopy(this.a, 0, byArray, 0, this.b);
        } else {
            byArray = this.a;
        }
        byArray = org.apache.commons.a.a.a.a(byArray);
        ai.a(byArray, "Input");
        int n2 = byArray.length;
        ai.a(byArray, "Input");
        return new String(byArray, 0, n2, c.b);
    }
}

