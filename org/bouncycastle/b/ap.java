/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.OutputStream;
import org.bouncycastle.e.a;

public class ap {
    private int a;
    private boolean b;
    private byte[] c;

    protected ap(int n2, boolean bl2, byte[] byArray) {
        this.a = n2;
        this.b = bl2;
        this.c = byArray;
    }

    public final void a(OutputStream outputStream) {
        int n2 = this.c.length + 1;
        if (n2 < 192 && !this.b) {
            outputStream.write((byte)n2);
        } else if (n2 <= 8383 && !this.b) {
            outputStream.write((byte)(((n2 -= 192) >> 8 & 0xFF) + 192));
            outputStream.write((byte)n2);
        } else {
            outputStream.write(255);
            outputStream.write((byte)(n2 >> 24));
            outputStream.write((byte)(n2 >> 16));
            outputStream.write((byte)(n2 >> 8));
            outputStream.write((byte)n2);
        }
        outputStream.write(this.a);
        outputStream.write(this.c);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ap)) {
            return false;
        }
        object = (ap)object;
        return this.a == ((ap)object).a && org.bouncycastle.e.a.a(this.c, ((ap)object).c);
    }

    public int hashCode() {
        return this.a ^ org.bouncycastle.e.a.c(this.c);
    }
}

