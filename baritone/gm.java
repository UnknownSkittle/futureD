/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  bhc
 *  bud
 *  vg
 */
package baritone;

import baritone.api.BaritoneAPI;
import baritone.api.cache.IWorldData;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.IPlayerController;
import baritone.api.utils.RayTraceUtils;
import baritone.gn;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gm
extends Enum<gm>
implements Helper,
IPlayerContext {
    public static final /* enum */ gm a = new gm("INSTANCE");
    private static final /* synthetic */ gm[] a;

    public static gm[] values() {
        return (gm[])a.clone();
    }

    public static gm valueOf(String string) {
        return Enum.valueOf(gm.class, string);
    }

    @Override
    public final bud player() {
        return gm.mc.h;
    }

    @Override
    public final IPlayerController playerController() {
        return gn.a;
    }

    @Override
    public final amu world() {
        return gm.mc.f;
    }

    @Override
    public final IWorldData worldData() {
        return BaritoneAPI.getProvider().getPrimaryBaritone().getWorldProvider().getCurrentWorld();
    }

    @Override
    public final bhc objectMouseOver() {
        return RayTraceUtils.rayTraceTowards((vg)this.player(), this.playerRotations(), this.playerController().getBlockReachDistance());
    }

    static {
        a = new gm[]{a};
    }
}

