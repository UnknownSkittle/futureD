/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.invoke.LambdaMetafactory;
import java.util.Optional;
import java.util.function.Function;
import net.impactclient.11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 4f {
    public final float 0;
    public final float 3;
    public final float 1;
    public static final boolean \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
    public final float 2;

    private /* synthetic */ Float 1(4f f2) {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return Float.valueOf(f2.0() / this.0());
    }

    public final 4f 0(float f2, float f3) {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return new 4f(this.2 + f2, this.0 + f3, this.1 + f2, this.3 + f3);
    }

    public final 11 2() {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return new 11((this.2 + this.1) / 2.0f, (this.0 + this.3) / 2.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public 4f(float f2, float f3, float f4, float f5) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
                if (bl2 || bl2) break block2;
                this.2 = Math.min(f2, f4);
                if (bl2 || bl2) break block2;
                this.0 = Math.min(f3, f5);
                if (bl2 || bl2) break block2;
                this.1 = Math.max(f2, f4);
                if (bl2 || bl2) break block2;
                this.3 = Math.max(f3, f5);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    private float 0() {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return 0.0f;
        }
        4f f2 = this;
        return (f2.1 - f2.2) * this.1();
    }

    public final float 1() {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return this.3 - this.0;
    }

    public final 4f 1(float f2, float f3) {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        4f f4 = this;
        return f4.0(f4.2().0()).0(f2, f3);
    }

    public 4f(float f2, float f3) {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        this(0.0f, 0.0f, f2, f3);
    }

    /*
     * Unable to fully structure code
     */
    public final float 0(4f var1_1) {
        var5_2 = 4f.\u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (var5_2 || var5_2) lbl-1000:
        // 5 sources

        {
            return 0.0f;
        }
        var2_3 = var1_1;
        var1_1 = this;
        var4_4 = var2_3;
        var3_5 = var1_1;
        if (!(v0.2 < var4_4.1)) ** GOTO lbl-1000
        if (var5_2) ** GOTO lbl-1000
        if (!(var4_4.2 < var3_5.1)) ** GOTO lbl-1000
        if (var5_2) ** GOTO lbl-1000
        if (!(var3_5.0 < var4_4.3)) ** GOTO lbl-1000
        if (var5_2) ** GOTO lbl-1000
        if (var4_4.0 < var3_5.3) {
            if (var5_2) ** continue;
            v1 = (int)((long)2619884 ^ (long)2619885);
            if (4f.\u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e) {
                throw null;
            }
        } else lbl-1000:
        // 4 sources

        {
            v1 = (int)((long)-1941989244 ^ (long)-1941989244);
        }
        if (v1 == 0) {
            v2 = Optional.empty();
            if (4f.\u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e) {
                throw null;
            }
        } else {
            v2 = Optional.of(new 4f(Math.max(var1_1.2, var2_3.2), Math.max(var1_1.0, var2_3.0), Math.min(var1_1.1, var2_3.1), Math.min(var1_1.3, var2_3.3)));
        }
        return v2.map((Function<4f, Float>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, 1(net.impactclient.4f ), (Lnet/impactclient/4f;)Ljava/lang/Float;)((4f)this)).orElse(Float.valueOf(0.0f)).floatValue();
    }

    private 4f 0(11 var1_1) {
        boolean bl2 = \u2006\u2001\u2001\u2008\u2009\u200c\u200a\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(var1_1.1, var1_1.0);
    }
}

