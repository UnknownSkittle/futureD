/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.impactclient.0_;
import net.impactclient.0rG;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 38
implements 0rG {
    public static final boolean \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
    private final List<0rG> 0;

    /*
     * Enabled aggressive block sorting
     */
    public 38() {
        block3: {
            block2: {
                boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                if (bl2 || bl2) break block2;
                this.0 = new ArrayList<0rG>();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final int 0() {
        boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
        if (bl2 || bl2) {
            return -206076477;
        }
        return 0_.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(vg vg2) {
        boolean bl2;
        block7: {
            block8: {
                bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                if (bl2 || bl2) return true;
                boolean bl3 = this.0.stream().anyMatch(rG -> {
                    boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                    if (bl2 || bl2) return true;
                    if (rG.0() == 0_.b) {
                        if (bl2) return true;
                        return (int)((long)-1905498760 ^ (long)-1905498759) != 0;
                    }
                    if (!bl2) return (int)((long)881581471 ^ (long)881581471) != 0;
                    return true;
                });
                if (bl2 || bl2) return true;
                if (vg2 == null) break block7;
                if (bl2) return true;
                if (!this.0.stream().filter(rG -> {
                    boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                    if (bl2 || bl2) return true;
                    if (rG.0() == 0_.a) {
                        if (bl2) return true;
                        return (int)((long)-917959786 ^ (long)-917959785) != 0;
                    }
                    if (!bl2) return (int)((long)-1396800500 ^ (long)-1396800500) != 0;
                    return true;
                }).allMatch(rG -> {
                    boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                    if (bl2 || bl2) {
                        return true;
                    }
                    return rG.0(vg2);
                })) break block7;
                if (bl2) return true;
                if (!bl3) break block8;
                if (bl2) return true;
                if (!this.0.stream().filter(rG -> {
                    boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                    if (bl2 || bl2) return true;
                    if (rG.0() == 0_.b) {
                        if (bl2) return true;
                        return (int)((long)1471204317 ^ (long)1471204316) != 0;
                    }
                    if (!bl2) return (int)((long)1917866333 ^ (long)1917866333) != 0;
                    return true;
                }).anyMatch(rG -> {
                    boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                    if (bl2 || bl2) {
                        return true;
                    }
                    return rG.0(vg2);
                })) break block7;
                if (bl2) return true;
            }
            if (bl2) return true;
            return (int)((long)-897123416 ^ (long)-897123415) != 0;
        }
        if (!bl2) return (int)((long)-457545623 ^ (long)-457545623) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private 38(Iterable<0rG> iterable) {
        block3: {
            block2: {
                boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
                if (bl2 || bl2) break block2;
                this.0 = new ArrayList<0rG>();
                if (bl2 || bl2) break block2;
                iterable.forEach(this.0::add);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 38(0rG ... rGArray) {
        boolean bl2 = \u200b\u200b\u2005\u2000\u2005\u2004\u2007;
        this(Arrays.asList(rGArray));
    }
}

