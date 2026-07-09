/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.2Y;
import net.impactclient.3W;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 6g<T>
extends 2Y<T>,
3W<T> {
    public static final boolean \u2001\u2005\u2004\u2005;

    /*
     * Enabled aggressive block sorting
     */
    default public T 4() {
        int n2;
        T t2;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u2005\u2004\u2005;
                    if (bl2 || bl2) break block2;
                    t2 = this.0();
                    n2 = ArrayUtils.indexOf(t2, this.1());
                    if (bl2 || bl2) break block2;
                    --n2;
                    if (bl2) break block2;
                    if (n2 >= 0) break block3;
                    if (bl2 || bl2) break block2;
                    n2 = ((T)t2).length - (int)((long)1164256052 ^ (long)1164256053);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return null;
        }
        return t2[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    default public T 5() {
        T t2;
        block3: {
            block2: {
                boolean bl2 = \u2001\u2005\u2004\u2005;
                if (bl2 || bl2) break block2;
                t2 = this.4();
                if (bl2 || bl2) break block2;
                this.0(t2);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return t2;
    }

    /*
     * Enabled aggressive block sorting
     */
    default public T 0() {
        int n2;
        T t2;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u2005\u2004\u2005;
                    if (bl2 || bl2) break block2;
                    t2 = this.0();
                    n2 = ArrayUtils.indexOf(t2, this.1());
                    if (bl2 || bl2) break block2;
                    ++n2;
                    if (bl2) break block2;
                    if (n2 < ((T)t2).length) break block3;
                    if (bl2 || bl2) break block2;
                    n2 = (int)((long)1292985563 ^ (long)1292985563);
                    if (bl2) return null;
                }
                if (!bl2) break block4;
            }
            return null;
        }
        return t2[n2];
    }

    default public T 3() {
        boolean bl2 = \u2001\u2005\u2004\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return this.1();
    }

    /*
     * Enabled aggressive block sorting
     */
    default public T 2() {
        T t2;
        block3: {
            block2: {
                boolean bl2 = \u2001\u2005\u2004\u2005;
                if (bl2 || bl2) break block2;
                t2 = this.0();
                if (bl2 || bl2) break block2;
                this.0(t2);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return t2;
    }
}

