/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.impactclient.6r;
import net.impactclient.7Z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 3j<T>
extends ArrayList<T>
implements 6r {
    private final String 2;
    private static 7Z[] 1;
    private final Map<Class<? extends T>, T> 0;
    public static final boolean \u2006\u2006\u2005;

    public static 7Z[] 0() {
        boolean bl2 = \u2006\u2006\u2005;
        if (bl2) {
            return null;
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 3j(String string) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2006\u2005;
                if (bl2 || bl2) break block2;
                this.0 = new HashMap<Class<? extends T>, T>();
                if (bl2 || bl2) break block2;
                this.2 = string;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    static {
        block5: {
            boolean bl2;
            block6: {
                block4: {
                    bl2 = \u2006\u2006\u2005;
                    if (!bl2) break block4;
                    break block5;
                }
                if (3j.0() != null) break block6;
                if (bl2) break block5;
                3j.0(new 7Z[(int)((long)-1367376241 ^ (long)-1367376242)]);
                if (bl2) break block5;
            }
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(7Z[] zArray) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2006\u2005;
                if (bl2) break block2;
                1 = zArray;
                if (!bl2) break block3;
            }
            return;
        }
    }

    public final <I extends T> I 0(Class<I> clazz2) {
        boolean bl2 = \u2006\u2006\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return (I)this.0.computeIfAbsent(clazz2, clazz -> {
            boolean bl2 = \u2006\u2006\u2005;
            if (bl2 || bl2) {
                return null;
            }
            return this.stream().filter(object -> {
                boolean bl2 = \u2006\u2006\u2005;
                if (bl2 || bl2) {
                    return true;
                }
                return object.getClass().equals(clazz);
            }).findFirst().orElse(null);
        });
    }
}

