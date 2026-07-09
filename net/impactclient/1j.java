/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  vg
 *  vp
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1j
extends ArrayList<vg> {
    public static final boolean \u2008\u2001\u200f\u2004\u200e\u200c\u2005\u2009\u2006;

    public final List<vp> 0() {
        boolean bl2 = \u2008\u2001\u200f\u2004\u200e\u200c\u2005\u2009\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.stream().filter(aed.class::isInstance).map(aed.class::cast).collect(Collectors.toList());
    }

    /*
     * Enabled aggressive block sorting
     */
    public 1j() {
        boolean bl2 = \u2008\u2001\u200f\u2004\u200e\u200c\u2005\u2009\u2006;
        if (bl2) {
            return;
        }
    }

    public final List<vp> 1() {
        boolean bl2 = \u2008\u2001\u200f\u2004\u200e\u200c\u2005\u2009\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.stream().filter(vp.class::isInstance).map(vp.class::cast).collect(Collectors.toList());
    }
}

