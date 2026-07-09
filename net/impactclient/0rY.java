/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Map;
import java.util.Set;
import me.zero.alpine.event.EventState;
import net.impactclient.0aA;
import net.impactclient.3Q;
import net.impactclient.3W;
import net.impactclient.7Z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class 0rY<T>
extends 7Z
implements 3W<T> {
    public static final boolean \u2004;
    private final String 0;
    private final Map<EventState, Set<0aA<T>>> 1;
    private final String 2;
    private final String 4;
    private static int 3;

    @Override
    public final String 0() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return this.2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(EventState eventState, 0aA<T> aA) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                this.1.get((Object)eventState).add(aA);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2) break block2;
                3 = n2;
                if (!bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final String 2() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }

    public static int 1() {
        boolean bl2 = \u2004;
        if (bl2) {
            return 802140957;
        }
        return 3;
    }

    @Override
    public final String 1() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return this.4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0rY(String string, String string2, String string3) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                this.1 = new 3Q(this, EventState.class);
                if (bl2 || bl2) break block2;
                this.0 = string;
                if (bl2 || bl2) break block2;
                this.4 = string2;
                if (bl2 || bl2) break block2;
                this.2 = string3;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int 0() {
        boolean bl2 = \u2004;
        if (bl2) return 1510801325;
        int n2 = 0rY.1();
        if (bl2) return 1510801325;
        if (n2 == 0) {
            if (bl2) return 1510801325;
            return (int)((long)-1934947040 ^ (long)-1934947063);
        }
        if (!bl2) return (int)((long)759456034 ^ (long)759456034);
        return 1510801325;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                Object t3 = this.1();
                if (bl2 || bl2) break block2;
                this.1.get((Object)EventState.PRE).forEach(aA -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2004;
                            if (bl2 || bl2) break block2;
                            aA.0(this, t3, t2);
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (bl2 || bl2) break block2;
                this.1(t2);
                if (bl2 || bl2) break block2;
                this.1.get((Object)EventState.POST).forEach(aA -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2004;
                            if (bl2 || bl2) break block2;
                            aA.0(this, t3, t2);
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
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
                    bl2 = \u2004;
                    if (!bl2) break block4;
                    break block5;
                }
                if (0rY.1() != 0) break block6;
                if (bl2) break block5;
                0rY.0((int)((long)1828036904 ^ (long)1828036915));
                if (bl2) break block5;
            }
            if (!bl2) {
                // empty if block
            }
        }
    }

    protected abstract void 1(T var1);
}

