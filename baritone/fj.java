/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ams
 *  amx
 *  amz
 *  bid
 *  blr
 *  cib
 *  et
 *  tz
 */
package baritone;

import baritone.api.BaritoneAPI;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fj
implements AbstractGameEventListener,
Helper {
    public static final fj a = new fj();
    public static final boolean a = "true".equals(System.getenv("BARITONE_AUTO_TEST"));
    private static final et a = new et(0, 65, 0);
    private static final Goal a = new GoalBlock(69, 69, 420);

    public static void a() {
        if (!a) {
            return;
        }
        System.out.println("Optimizing Game Settings");
        bid bid2 = fj.mc.t;
        fj.mc.t.i = 20;
        bid2.K = 0;
        bid2.aH = 2;
        bid2.D = 128;
        bid2.E = 128;
        bid2.F = false;
        bid2.M = false;
        bid2.G = 0.0f;
        bid2.l = 0;
        bid2.j = 0;
        bid2.k = false;
        bid2.S = cib.f;
        bid2.av = true;
        bid2.aD = 30.0f;
    }

    @Override
    public final void onTick(TickEvent tickEvent) {
        IPlayerContext iPlayerContext = BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext();
        if (fj.mc.m instanceof blr) {
            System.out.println("Beginning Baritone automatic test routine");
            mc.a(null);
            amx amx2 = new amx(-928872506371745L, ams.b, true, false, amz.b);
            mc.a("BaritoneAutoTest", "BaritoneAutoTest", amx2);
        }
        if (mc.F() != null) {
            mc.F().a(tz.a);
            for (amx amx3 : fj.mc.F().d) {
                if (amx3 == null) continue;
                amx3.A(a);
                amx3.W().a("spawnRadius", "0");
            }
        }
        if (tickEvent.getType() == TickEvent$Type.IN) {
            if (mc.E() && !mc.F().a()) {
                mc.F().a(ams.b, false);
            }
            if (tickEvent.getCount() < 200) {
                System.out.println("Waiting for world to generate... " + tickEvent.getCount());
                return;
            }
            if (tickEvent.getCount() % 100 == 0) {
                System.out.println((Object)((Object)iPlayerContext.playerFeet()) + " " + tickEvent.getCount());
            }
            if (!BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().isActive()) {
                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath(a);
            }
            if (a.isInGoal(iPlayerContext.playerFeet())) {
                System.out.println("Successfully pathed to " + (Object)((Object)iPlayerContext.playerFeet()) + " in " + tickEvent.getCount() + " ticks");
                mc.n();
            }
            if (tickEvent.getCount() > 3300) {
                throw new IllegalStateException("took too long");
            }
        }
    }

    private fj() {
    }
}

