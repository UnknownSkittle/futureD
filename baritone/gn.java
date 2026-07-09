/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  afw
 *  aip
 *  ams
 *  amu
 *  bhe
 *  bsb
 *  bud
 *  et
 *  fa
 *  ub
 *  ud
 */
package baritone;

import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerController;
import baritone.gg;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gn
extends Enum<gn>
implements Helper,
IPlayerController {
    public static final /* enum */ gn a = new gn("INSTANCE");
    private static final /* synthetic */ gn[] a;

    public static gn[] values() {
        return (gn[])a.clone();
    }

    public static gn valueOf(String string) {
        return Enum.valueOf(gn.class, string);
    }

    @Override
    public final void syncHeldItem() {
        ((gg)gn.mc.c).callSyncCurrentPlayItem();
    }

    @Override
    public final boolean hasBrokenBlock() {
        return ((gg)gn.mc.c).getCurrentBlock().q() == -1;
    }

    @Override
    public final boolean onPlayerDamageBlock(et et2, fa fa2) {
        return gn.mc.c.b(et2, fa2);
    }

    @Override
    public final void resetBlockRemoving() {
        gn.mc.c.c();
    }

    @Override
    public final aip windowClick(int n2, int n3, int n4, afw afw2, aed aed2) {
        return gn.mc.c.a(n2, n3, n4, afw2, aed2);
    }

    @Override
    public final ams getGameType() {
        return gn.mc.c.l();
    }

    @Override
    public final ud processRightClickBlock(bud bud2, amu amu2, et et2, fa fa2, bhe bhe2, ub ub2) {
        return gn.mc.c.a(bud2, (bsb)amu2, et2, fa2, bhe2, ub2);
    }

    @Override
    public final ud processRightClick(bud bud2, amu amu2, ub ub2) {
        return gn.mc.c.a((aed)bud2, amu2, ub2);
    }

    @Override
    public final boolean clickBlock(et et2, fa fa2) {
        return gn.mc.c.a(et2, fa2);
    }

    @Override
    public final void setHittingBlock(boolean bl2) {
        ((gg)gn.mc.c).setIsHittingBlock(bl2);
    }

    static {
        a = new gn[]{a};
    }
}

