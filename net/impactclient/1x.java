/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 1x
implements Function<Double, double[]>,
Predicate<Double> {
    public static final boolean \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
    private final Predicate<Double> 1;
    private final Function<Double, double[]> 0;

    @Override
    public final /* synthetic */ Object apply(Object object) {
        boolean bl2 = \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return this.1((Double)object);
    }

    public final boolean 0(Double d2) {
        boolean bl2 = \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
        if (bl2 || bl2) {
            return true;
        }
        return this.1.test(d2);
    }

    @Override
    public final /* synthetic */ boolean test(Object object) {
        boolean bl2 = \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
        if (bl2 || bl2) {
            return true;
        }
        return this.0((Double)object);
    }

    public final double[] 1(Double d2) {
        boolean bl2 = \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.apply(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    1x(Predicate<Double> predicate, Function<Double, double[]> function) {
        block3: {
            block2: {
                boolean bl2 = \u2005\u200e\u2003\u200a\u200c\u2008\u200d;
                if (bl2 || bl2) break block2;
                this.1 = predicate;
                if (bl2 || bl2) break block2;
                this.0 = function;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

