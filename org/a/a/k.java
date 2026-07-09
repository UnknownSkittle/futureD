/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.b;
import org.a.a.c.a;
import org.a.a.c.g;
import org.a.c.a.f;

public final class k
extends org.a.c.a.b {
    private final org.a.b.g a = new org.a.b.g();
    private String b;
    private StringBuilder c = new StringBuilder();

    private k(char c2, int n2, int n3) {
        this.a.a(c2);
        this.a.a(n2);
        this.a.b(n3);
    }

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final org.a.c.a.a a(f var1_1) {
        var2_4 = var1_1.d();
        var3_7 = var1_1.c();
        var4_8 = var1_1.b();
        if (var1_1.f() >= g.a) ** GOTO lbl-1000
        var5_9 = var2_4;
        var2_5 = var4_8;
        var1_1 = this;
        var6_10 = var1_1.a.c();
        var1_2 = var1_1.a.d();
        if ((var6_10 = g.a((char)var6_10, var2_5, var5_9, var2_5.length()) - var5_9) >= var1_2 && g.b(var2_5, var5_9 + var6_10, var2_5.length()) == var2_5.length()) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        if (v0) {
            return new b(-1, -1, true);
        }
        var2_6 = var4_8.length();
        for (var1_3 = this.a.e(); var1_3 > 0 && var3_7 < var2_6 && var4_8.charAt(var3_7) == ' '; ++var3_7, --var1_3) {
        }
        return org.a.c.a.a.a(var3_7);
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        this.c.append(charSequence);
        this.c.append('\n');
    }

    @Override
    public final void c() {
        this.a.a(org.a.a.c.a.a(this.b.trim()));
        this.a.b(this.c.toString());
    }

    static /* synthetic */ k a(CharSequence charSequence, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = charSequence.length();
        block4: for (int i2 = n2; i2 < n6; ++i2) {
            switch (charSequence.charAt(i2)) {
                case '`': {
                    ++n4;
                    continue block4;
                }
                case '~': {
                    ++n5;
                    continue block4;
                }
            }
        }
        if (n4 >= 3 && n5 == 0) {
            if (g.a('`', charSequence, n2 + n4) == -1) {
                return new k('`', n4, n3);
            }
        } else if (n5 >= 3 && n4 == 0 && g.a('~', charSequence, n2 + n5) == -1) {
            return new k('~', n5, n3);
        }
        return null;
    }

    static /* synthetic */ org.a.b.g a(k k2) {
        return k2.a;
    }
}

