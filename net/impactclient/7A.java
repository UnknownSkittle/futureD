/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import baritone.api.utils.SettingsUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.impactclient.0ay;
import net.impactclient.1D;
import net.impactclient.6r;
import net.impactclient.8U;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 7A {
    public static final boolean \u200b;
    private static final List<6r> 0;

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(boolean bl2) {
        boolean bl3 = \u200b;
        if (bl3 || bl3) return;
        if (8U.0()) {
            if (bl3 || bl3) return;
            return;
        }
        if (bl3) return;
        if (bl2) {
            if (bl3 || bl3) return;
            0ay.3().0c.execute(() -> {
                block3: {
                    block2: {
                        boolean bl2 = \u200b;
                        if (bl2 || bl2) break block2;
                        7A.0((boolean)((long)1969828025 ^ (long)1969828025));
                        if (!bl2) break block3;
                    }
                    return;
                }
            });
            if (bl3) return;
            return;
        }
        if (bl3) return;
        0.forEach(6r::0);
        if (bl3 || bl3) return;
        SettingsUtil.save(BaritoneAPI.getSettings());
        if (!bl3 && !bl3) return;
    }

    static {
        boolean bl2 = \u200b;
        if (bl2 || bl2) {
        } else {
            0 = new ArrayList<6r>();
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 1() {
        block3: {
            block2: {
                boolean bl2 = \u200b;
                if (bl2 || bl2) break block2;
                0.clear();
                if (bl2 || bl2) break block2;
                0.addAll(Arrays.stream(0ay.class.getDeclaredFields()).filter(field -> {
                    boolean bl2 = \u200b;
                    if (bl2 || bl2) return true;
                    if (6r.class.isAssignableFrom(field.getType())) {
                        if (bl2) return true;
                        if (!field.getType().isArray()) {
                            if (bl2) return true;
                            return (int)((long)-667966689 ^ (long)-667966690) != 0;
                        }
                    }
                    if (!bl2) return (int)((long)1258686850 ^ (long)1258686850) != 0;
                    return true;
                }).map(field -> {
                    boolean bl2 = \u200b;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return (6r)1D.0(0ay.3(), field);
                }).collect(Collectors.toList()));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

