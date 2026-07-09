/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 */
package net.impactclient;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.impactclient.0aV;
import net.impactclient.6;
import net.impactclient.7;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0H {
    private static final Map<UUID, 6> 1;
    private static 7 0;
    public static final boolean \u2001\u200a\u200d\u200d\u2002\u200b\u2005;

    /*
     * Enabled aggressive block sorting
     */
    public static void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
                if (bl2 || bl2) break block2;
                0aV.3();
                if (bl2 || bl2) break block2;
                1.forEach((uUID, var1_1) -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
                            if (bl2 || bl2) break block2;
                            var1_1.0(0aV.0(uUID));
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (bl2 || bl2) break block2;
                0 = new 7();
                if (bl2 || bl2) break block2;
                1.put(((6)0H.0).1, 0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static 6 0(aed object) {
        UUID uUID;
        block3: {
            block2: {
                boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
                if (bl2 || bl2) break block2;
                uUID = object.bm();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        UUID uUID3 = uUID;
        return 1.computeIfAbsent(uUID3, uUID2 -> {
            boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
            if (bl2 || bl2) {
                return null;
            }
            return new 6(uUID3);
        });
    }

    static {
        boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
        if (bl2 || bl2) {
        } else {
            1 = new HashMap<UUID, 6>();
            if (!bl2) {
                // empty if block
            }
        }
    }

    public static 7 1() {
        boolean bl2 = \u2001\u200a\u200d\u200d\u2002\u200b\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return 0;
    }
}

