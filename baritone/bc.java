/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  vg
 *  vq
 */
package baritone;

import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class bc
extends Enum<bc> {
    private static /* enum */ bc a = new bc(vq.class::isInstance);
    private static /* enum */ bc b = new bc(aed.class::isInstance);
    final Predicate<vg> a;
    private static final /* synthetic */ bc[] a;

    public static bc[] values() {
        return (bc[])a.clone();
    }

    public static bc valueOf(String string) {
        return Enum.valueOf(bc.class, string);
    }

    private bc(Predicate<vg> predicate) {
        this.a = predicate;
    }

    static {
        a = new bc[]{a, b};
    }
}

