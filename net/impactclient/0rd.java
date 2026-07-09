/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Consumer;
import java.util.function.Supplier;
import net.impactclient.1N;
import net.impactclient.55;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rd<T>
implements 1N<T> {
    private final 1N<T> 1;
    public static final boolean \u2004\u2000;
    private T 0;

    /*
     * Enabled aggressive block sorting
     */
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2000;
                if (bl2 || bl2) break block2;
                this.1.accept(this.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private 0rd(1N<T> n2) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2000;
                if (bl2 || bl2) break block2;
                this.1 = n2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final T get() {
        boolean bl2 = \u2004\u2000;
        if (bl2 || bl2) {
            return null;
        }
        return this.1.get();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void accept(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2000;
                if (bl2 || bl2) break block2;
                this.0 = this.1.get();
                if (bl2 || bl2) break block2;
                this.1.accept(t2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 0rd(Consumer<T> consumer, Supplier<T> supplier) {
        boolean bl2 = \u2004\u2000;
        this(new 55<T>(consumer, supplier));
    }
}

