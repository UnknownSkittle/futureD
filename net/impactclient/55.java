/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Consumer;
import java.util.function.Supplier;
import net.impactclient.1N;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 55<T>
implements 1N<T> {
    private final Supplier<T> 1;
    private final Consumer<T> 0;
    public static final boolean \u2000\u2003\u200b\u2004\u2005;

    /*
     * Enabled aggressive block sorting
     */
    public 55(Consumer<T> consumer, Supplier<T> supplier) {
        block3: {
            block2: {
                boolean bl2 = \u2000\u2003\u200b\u2004\u2005;
                if (bl2 || bl2) break block2;
                this.0 = consumer;
                if (bl2 || bl2) break block2;
                this.1 = supplier;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void accept(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2000\u2003\u200b\u2004\u2005;
                if (bl2 || bl2) break block2;
                this.0.accept(t2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final T get() {
        boolean bl2 = \u2000\u2003\u200b\u2004\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return this.1.get();
    }
}

