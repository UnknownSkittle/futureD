/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.Settings$Setting;
import java.util.function.Function;
import net.impactclient.0rZ;
import net.impactclient.44;
import net.impactclient.7Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rR<T extends Number>
extends 0rZ<T, T>
implements 44<T> {
    private final Function<Number, T> 2;
    private final T 1;
    public static final boolean \u2004\u200c\u2000\u200b;
    private final T 0;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ void 1(Object object) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u200c\u2000\u200b;
                if (bl2 || bl2) break block2;
                Number number = (Number)object;
                object = this;
                super.1(7Q.0((Number)((0rR)object).2.apply(number), ((0rR)object).0, ((0rR)object).1));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final T 1() {
        boolean bl2 = \u2004\u200c\u2000\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return this.1;
    }

    0rR(Settings$Setting<T> settings$Setting, String string, String string2, T t2, T t3, Function<Number, T> function) {
        boolean bl2 = \u2004\u200c\u2000\u200b;
        super(settings$Setting, string, string2);
        this.0 = t2;
        this.1 = t3;
        this.2 = function;
    }

    @Override
    public final T 0() {
        boolean bl2 = \u2004\u200c\u2000\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }
}

