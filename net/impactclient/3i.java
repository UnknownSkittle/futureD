/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  hg
 *  hh
 *  hn
 *  ho
 */
package net.impactclient;

import java.util.Arrays;
import javax.annotation.Nullable;
import net.impactclient.07;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3i {
    public final hh 0;
    public static final boolean \u2007;

    /*
     * Enabled aggressive block sorting
     */
    private 3i 0(String string, @Nullable hg hg2, a ... aArray) {
        block3: {
            block2: {
                boolean bl2 = \u2007;
                if (bl2 || bl2) break block2;
                string = new ho(string);
                hn hn2 = string.b();
                if (bl2 || bl2) break block2;
                Arrays.stream(aArray).forEach(a2 -> {
                    block8: {
                        block7: {
                            boolean bl2 = \u2007;
                            if (bl2 || bl2) break block7;
                            switch (07.0[a2.ordinal()]) {
                                case 1: {
                                    if (bl2) break;
                                    hn2.a(Boolean.TRUE);
                                    if (bl2 || bl2) break;
                                    return;
                                }
                                case 2: {
                                    if (bl2) break;
                                    hn2.b(Boolean.TRUE);
                                    if (bl2 || bl2) break;
                                    return;
                                }
                                case 3: {
                                    if (bl2) break;
                                    hn2.d(Boolean.TRUE);
                                    if (bl2 || bl2) break;
                                    return;
                                }
                                case 4: {
                                    if (bl2) break;
                                    hn2.c(Boolean.TRUE);
                                    if (bl2 || bl2) break;
                                    return;
                                }
                                case 5: {
                                    if (bl2) break;
                                    hn2.e(Boolean.TRUE);
                                    if (bl2 || bl2) break;
                                    return;
                                }
                                default: {
                                    if (bl2) break;
                                    hn2.a(a2);
                                    if (!bl2 && !bl2) break block8;
                                }
                            }
                        }
                        return;
                    }
                });
                if (bl2 || bl2) break block2;
                hn2.a(hg2).a(null);
                if (bl2 || bl2) break block2;
                this.0.a((hh)string);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 3i() {
        block3: {
            block2: {
                boolean bl2 = \u2007;
                if (bl2 || bl2) break block2;
                this.0 = new ho(0rB$1f.XNZw("", 512594211));
                if (!bl2) break block3;
            }
            return;
        }
    }

    public final 3i 0(String string, a ... aArray) {
        boolean bl2 = \u2007;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(string, (hg)null, aArray);
    }

    public final 3i 1(String string, hg hg2, a ... aArray) {
        boolean bl2 = \u2007;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(string, hg2, aArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 3i 0(String string) {
        block3: {
            block2: {
                boolean bl2 = \u2007;
                if (bl2 || bl2) break block2;
                this.0.a((hh)new ho(string));
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return this;
    }
}

