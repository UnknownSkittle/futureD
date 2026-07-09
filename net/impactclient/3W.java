/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.stream.Stream;
import me.zero.alpine.event.EventState;
import net.impactclient.0aA;
import net.impactclient.1b;
import net.impactclient.2b;
import net.impactclient.40;
import net.impactclient.5Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 3W<T>
extends 40,
5Q,
2b,
1b {
    public static final boolean \u200f\u200c\u2005\u2004;

    default public Class<?> 0() {
        boolean bl2 = \u200f\u200c\u2005\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return this.1().getClass();
    }

    public static Stream<3W> 0(3W w2) {
        boolean bl2 = \u200f\u200c\u2005\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return Stream.concat(Stream.of(w2), w2.0().stream().flatMap(3W::0));
    }

    /*
     * Enabled aggressive block sorting
     */
    default public void 0(0aA<T> aA) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200c\u2005\u2004;
                if (bl2 || bl2) break block2;
                this.0(EventState.POST, aA);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public void 0(T var1);

    public T 1();

    /*
     * Enabled aggressive block sorting
     */
    default public void 1(0aA<T> aA) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200c\u2005\u2004;
                if (bl2 || bl2) break block2;
                this.0(EventState.PRE, aA);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public void 0(EventState var1, 0aA<T> var2);
}

