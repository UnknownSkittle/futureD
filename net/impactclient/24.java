/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  kg
 */
package net.impactclient;

import java.util.function.Predicate;
import net.impactclient.1J;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 24<T extends 1J>
implements Predicate<T> {
    public static final boolean \u200d\u2009\u2003\u2007\u2007;
    private final int 1;
    private final Class<? extends ain> 0;

    /*
     * Enabled aggressive block sorting
     */
    public 24(Class<? extends ain> clazz) {
        block3: {
            block2: {
                boolean bl2 = \u200d\u2009\u2003\u2007\u2007;
                if (bl2 || bl2) break block2;
                this.1 = (int)((long)556343592 ^ (long)0x21292129);
                if (bl2 || bl2) break block2;
                this.0 = clazz;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ boolean test(Object object) {
        boolean bl2 = \u200d\u2009\u2003\u2007\u2007;
        if (bl2 || bl2) return true;
        1J j2 = (1J)object;
        object = this;
        if (bl2 || bl2) return true;
        if (j2.0 instanceof kg) {
            if (bl2 || bl2) return true;
            j2 = (kg)j2.0;
            if (j2.c().b() == (int)((long)914298582 ^ (long)914298583)) {
                if (bl2) return true;
                if (((24)object).0.isAssignableFrom(j2.a().c().getClass())) {
                    if (bl2) return true;
                    return (int)((long)-2062468475 ^ (long)-2062468476) != 0;
                }
            }
        }
        if (!bl2) return (int)((long)-870273770 ^ (long)-870273770) != 0;
        return true;
    }
}

