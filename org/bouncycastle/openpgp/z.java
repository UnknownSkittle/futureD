/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.b.al;
import org.bouncycastle.b.am;
import org.bouncycastle.b.c;
import org.bouncycastle.b.t;
import org.bouncycastle.openpgp.b.b;
import org.bouncycastle.openpgp.g;
import org.bouncycastle.openpgp.h;
import org.bouncycastle.openpgp.i;
import org.bouncycastle.openpgp.m;

public final class z
extends h {
    private am e;

    z(am am2, t t2) {
        super(t2);
        this.e = am2;
    }

    /*
     * Unable to fully structure code
     */
    public final InputStream a(b var1_1) {
        try {
            var2_3 = this.e.a();
            var2_4 = var1_1.a(var2_3, this.e.b());
            var3_7 = this.a instanceof al;
            var2_4 = var1_1.a(this.e.a(), var2_4, this.e.c());
            var4_8 = new byte[var2_4.length - 1];
            System.arraycopy(var2_4, 1, var4_8, 0, var4_8.length);
            var1_1 = var1_1.a((boolean)var3_7, var2_4[0] & 255, var4_8);
            this.b = new c(var1_1.a(this.a.b()));
            if (var3_7 != 0) {
                v0 = this;
                this.c = new i(v0, v0.b);
                this.d = var1_1.b();
                this.b = new org.bouncycastle.e.b.b(this.c, this.d.b());
            }
            var1_1 = new byte[var1_1.a()];
            for (var2_5 = 0; var2_5 != ((Object)var1_1).length; ++var2_5) {
                var3_7 = this.b.read();
                if (var3_7 < 0) {
                    throw new EOFException("unexpected end of stream.");
                }
                var1_1[var2_5] = (byte)var3_7;
            }
            var2_5 = this.b.read();
            var3_7 = this.b.read();
            if (var2_5 < 0 || var3_7 < 0) {
                throw new EOFException("unexpected end of stream.");
            }
            v1 = var1_1;
            if (v1[((Object)v1).length - 2] != (byte)var2_5) ** GOTO lbl-1000
            v2 = var1_1;
            if (v2[((Object)v2).length - 1] == (byte)var3_7) {
                v3 = true;
            } else lbl-1000:
            // 2 sources

            {
                v3 = false;
            }
            var1_2 = v3;
            v4 = var2_5 = var2_5 == 0 && var3_7 == 0 ? 1 : 0;
            if (!var1_2 && var2_5 == 0) {
                throw new g("data check failed.");
            }
            return this.b;
        } catch (m v5) {
            throw v5;
        } catch (Exception var2_6) {
            throw new m("Exception creating cipher", var2_6);
        }
    }
}

