/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.b.c;

final class d
extends InputStream {
    private c a;
    private boolean b;
    private int c;

    d(c c2, boolean bl2, int n2) {
        this.a = c2;
        this.b = bl2;
        this.c = n2;
    }

    public final int available() {
        int n2 = this.a.available();
        if (n2 <= this.c || this.c < 0) {
            return n2;
        }
        if (this.b && this.c == 0) {
            return 1;
        }
        return this.c;
    }

    private int a() {
        int n2 = this.a.read();
        if (n2 < 0) {
            return -1;
        }
        this.b = false;
        if (n2 < 192) {
            this.c = n2;
        } else if (n2 <= 223) {
            this.c = (n2 - 192 << 8) + this.a.read() + 192;
        } else if (n2 == 255) {
            this.c = this.a.read() << 24 | this.a.read() << 16 | this.a.read() << 8 | this.a.read();
        } else {
            this.b = true;
            this.c = 1 << (n2 & 0x1F);
        }
        return this.c;
    }

    public final int read(byte[] byArray, int n2, int n3) {
        do {
            if (this.c == 0) continue;
            n3 = this.c > n3 || this.c < 0 ? n3 : this.c;
            if ((n3 = this.a.read(byArray, n2, n3)) < 0) {
                throw new EOFException("premature end of stream in PartialInputStream");
            }
            this.c -= n3;
            return n3;
        } while (this.b && this.a() >= 0);
        return -1;
    }

    public final int read() {
        do {
            if (this.c == 0) continue;
            int n2 = this.a.read();
            if (n2 < 0) {
                throw new EOFException("premature end of stream in PartialInputStream");
            }
            --this.c;
            return n2;
        } while (this.b && this.a() >= 0);
        return -1;
    }
}

