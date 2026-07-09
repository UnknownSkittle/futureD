/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  aow
 *  aox
 *  aps
 *  ase
 *  awt
 *  axj
 *  et
 */
package baritone;

import baritone.ex;
import baritone.ey;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class ew
extends Enum<ew> {
    private static /* enum */ ew a = new ew((aps)aox.aj);
    private static /* enum */ ew b = new ew((aps)aox.cb);
    private static /* enum */ ew c = new ew((aps)aox.cc);
    private static /* enum */ ew d = new ew((aps)aox.cZ);
    private static /* enum */ ew e = new ew(aox.aU, awt2 -> true);
    private static /* enum */ ew f = new ew(aox.bk, awt2 -> true);
    private static /* enum */ ew g = new ew(aox.bB, awt2 -> (Integer)awt2.c((axj)ase.a) >= 3);
    private static /* enum */ ew h = new ex();
    private static /* enum */ ew i = new ey();
    public final aow a;
    private Predicate<awt> a;
    private static final /* synthetic */ ew[] a;

    public static ew[] values() {
        return (ew[])a.clone();
    }

    public static ew valueOf(String string) {
        return Enum.valueOf(ew.class, string);
    }

    private ew(aps aps2) {
        aps aps3 = aps2;
        this((aow)aps3, arg_0 -> ((aps)aps3).z(arg_0));
    }

    private ew(aow aow2, Predicate<awt> predicate) {
        this.a = aow2;
        this.a = predicate;
    }

    public boolean a(amu amu2, et et2, awt awt2) {
        return this.a.test(awt2);
    }

    /* synthetic */ ew(String string, int n2, aow aow2) {
        this(aow2, null);
    }

    static {
        a = new ew[]{a, b, c, d, e, f, g, h, i};
    }
}

