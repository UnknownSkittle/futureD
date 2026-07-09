/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rL;
import net.impactclient.0rM;
import net.impactclient.0rQ;
import net.impactclient.1H;
import net.impactclient.1b;
import net.impactclient.2J;
import net.impactclient.2a;
import net.impactclient.2j;
import net.impactclient.2r;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 6l
extends 1b {
    public static final boolean \u2003;

    default public 1H<Integer, 0rM> 2() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (1H)new 1H(Integer.class).0(this);
    }

    default public 1H<Double, 0rQ> 3() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (1H)new 1H(Double.class).0(this);
    }

    default public 1H<Float, 0rL> 0() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (1H)new 1H(Float.class).0(this);
    }

    default public 2r 5() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (2r)new 2r().0(this);
    }

    default public 2a 4() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (2a)new 2a().0(this);
    }

    default public <T extends Enum<T>> 2j<T> 0(Class<T> clazz) {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (2j)new 2j<T>(clazz).0(this);
    }

    default public 2J 1() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (2J)new 2J().0(this);
    }
}

