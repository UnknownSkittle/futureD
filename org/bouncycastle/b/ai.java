/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.OutputStream;

public class ai {
    private int b;
    private boolean c;
    private boolean d;
    protected byte[] a;

    protected ai(int n2, boolean bl2, boolean bl3, byte[] byArray) {
        this.b = n2;
        this.c = bl2;
        this.d = bl3;
        this.a = byArray;
    }

    public final int a() {
        return this.b;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(OutputStream var1_1) {
        var2_2 = this.a.length + 1;
        if (this.d) ** GOTO lbl-1000
        if (var2_2 < 192) {
            var1_1.write((byte)var2_2);
        } else if (var2_2 <= 8383) {
            var1_1.write((byte)(((var2_2 -= 192) >> 8 & 255) + 192));
            var1_1.write((byte)var2_2);
        } else lbl-1000:
        // 2 sources

        {
            var1_1.write(255);
            var1_1.write((byte)(var2_2 >> 24));
            var1_1.write((byte)(var2_2 >> 16));
            var1_1.write((byte)(var2_2 >> 8));
            var1_1.write((byte)var2_2);
        }
        if (this.c) {
            var1_1.write(128 | this.b);
        } else {
            var1_1.write(this.b);
        }
        var1_1.write(this.a);
    }
}

