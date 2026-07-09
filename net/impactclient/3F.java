/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.3W;
import pw.knx.feather.structures.Color;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 3F
extends 3W<Color> {
    public static final boolean \u200d\u2007\u200b\u2005\u2005\u200e;

    default public int 2() {
        boolean bl2 = \u200d\u2007\u200b\u2005\u2005\u200e;
        if (bl2 || bl2) {
            return 1029791382;
        }
        return ((Color)this.1()).getHex();
    }

    @Override
    default public float 1() {
        boolean bl2 = \u200d\u2007\u200b\u2005\u2005\u200e;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return ((Color)this.1()).getGreen();
    }

    default public float 0() {
        boolean bl2 = \u200d\u2007\u200b\u2005\u2005\u200e;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return ((Color)this.1()).getBlue();
    }

    default public float 3() {
        boolean bl2 = \u200d\u2007\u200b\u2005\u2005\u200e;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return ((Color)this.1()).getRed();
    }
}

