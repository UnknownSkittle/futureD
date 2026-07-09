/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.b.a.a;
import org.bouncycastle.b.ap;

public final class aq
extends InputStream {
    private InputStream a;

    public aq(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int available() {
        return this.a.available();
    }

    public final int read() {
        return this.a.read();
    }

    private void a(byte[] byArray, int n2, int n3) {
        int n4;
        if (n3 > 0) {
            n4 = this.read();
            if (n4 < 0) {
                throw new EOFException();
            }
            byArray[0] = (byte)n4;
            ++n2;
            --n3;
        }
        while (n3 > 0) {
            n4 = this.a.read(byArray, n2, n3);
            if (n4 < 0) {
                throw new EOFException();
            }
            n2 += n4;
            n3 -= n4;
        }
    }

    public final ap a() {
        int n2;
        int n3 = this.read();
        boolean bl2 = false;
        if (n3 < 0) {
            return null;
        }
        if (n3 >= 192) {
            if (n3 <= 223) {
                n3 = (n3 - 192 << 8) + this.a.read() + 192;
            } else if (n3 == 255) {
                n3 = this.a.read() << 24 | this.a.read() << 16 | this.a.read() << 8 | this.a.read();
                bl2 = true;
            } else {
                throw new IOException("unrecognised length reading user attribute sub packet");
            }
        }
        if ((n2 = this.a.read()) < 0) {
            throw new EOFException("unexpected EOF reading user attribute sub packet");
        }
        byte[] byArray = new byte[n3 - 1];
        this.a(byArray, 0, byArray.length);
        switch (n2) {
            case 1: {
                return new a(bl2, byArray);
            }
        }
        return new ap(n2, bl2, byArray);
    }
}

