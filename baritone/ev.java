/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  acl
 *  ahs
 *  aht
 *  ain
 *  aip
 *  air
 *  amu
 *  aom
 *  aow
 *  aox
 *  aoz
 *  awt
 *  bhc
 *  bhc$a
 *  bhe
 *  et
 *  fa
 *  vg
 */
package baritone;

import baritone.a;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.process.IFarmProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.cl;
import baritone.eg;
import baritone.ew;
import baritone.fk;
import baritone.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ev
extends fk
implements IFarmProcess {
    private boolean a;
    private List<et> a;
    private int a;
    private static final List<ain> b = Arrays.asList(air.cV, air.bp, air.Q, air.bo, air.cd, air.cc);
    private static final List<ain> c = Arrays.asList(air.cV, air.cW, air.bp, air.bn, ain.a((aow)aox.bk), air.Q, air.R, air.bo, ain.a((aow)aox.aU), air.cd, air.cc, air.bG, air.aR, ain.a((aow)aox.aK));

    public ev(a a2) {
        super(a2);
    }

    @Override
    public final boolean isActive() {
        return this.a;
    }

    @Override
    public final void farm() {
        this.a = true;
        this.a = null;
    }

    private static boolean a(amu amu2, et et2, awt awt2) {
        for (ew ew2 : ew.values()) {
            if (ew2.a != awt2.u()) continue;
            return ew2.a(amu2, et2, awt2);
        }
        return false;
    }

    private boolean a(aip aip2) {
        return b.contains(aip2.c());
    }

    private boolean b(aip aip2) {
        return !aip2.b() && aip2.c() instanceof aht && ahs.a((int)aip2.j()) == ahs.a;
    }

    private boolean c(aip aip2) {
        return !aip2.b() && aip2.c().equals(air.bG);
    }

    @Override
    public final PathingCommand onTick(boolean bl2, boolean bl3) {
        Object object;
        Object object22;
        Object object32;
        Object object5 = new ArrayList<aow>();
        for (ew object42 : ew.values()) {
            ((ArrayList)object5).add(object42.a);
        }
        if (((Boolean)baritone.a.a().replantCrops.value).booleanValue()) {
            ((ArrayList)object5).add(aox.ak);
            if (((Boolean)baritone.a.a().replantNetherWart.value).booleanValue()) {
                ((ArrayList)object5).add(aox.aW);
            }
        }
        if ((Integer)baritone.a.a().mineGoalUpdateInterval.value != 0 && this.a++ % (Integer)baritone.a.a().mineGoalUpdateInterval.value == 0) {
            baritone.a.a().execute(() -> {
                this.a = w.a.scanChunkRadius((IPlayerContext)this.a, (List<aow>)object5, 256, 10, 10);
            });
        }
        if (this.a == null) {
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<Object> arrayList3 = new ArrayList<Object>();
        ArrayList<Object> arrayList4 = new ArrayList<Object>();
        for (Object object32 : this.a) {
            object22 = this.a.world().o((et)object32);
            boolean optional = this.a.world().o(object32.a()).u() instanceof aom;
            if (object22.u() == aox.ak) {
                if (!optional) continue;
                arrayList2.add(object32);
                continue;
            }
            if (object22.u() == aox.aW) {
                if (!optional) continue;
                arrayList4.add(object32);
                continue;
            }
            if (ev.a(this.a.world(), (et)object32, (awt)object22)) {
                arrayList.add(object32);
                continue;
            }
            if (!(object22.u() instanceof aoz) || !(object = (aoz)object22.u()).a(this.a.world(), (et)object32, (awt)object22, true) || !object.a(this.a.world(), this.a.world().r, (et)object32, (awt)object22)) continue;
            arrayList3.add(object32);
        }
        this.a.a.clearAllKeys();
        object5 = arrayList.iterator();
        while (object5.hasNext()) {
            object32 = (et)object5.next();
            object22 = RotationUtils.reachable((IPlayerContext)this.a, (et)object32);
            if (!((Optional)object22).isPresent() || !bl3) continue;
            this.a.a.updateTarget((Rotation)((Optional)object22).get(), true);
            cl.a((IPlayerContext)this.a, this.a.world().o((et)object32));
            if (this.a.isLookingAt((et)object32)) {
                this.a.a.setInputForceState(Input.CLICK_LEFT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        object5 = new ArrayList<Object>(arrayList2);
        ((ArrayList)object5).addAll(arrayList4);
        object32 = ((ArrayList)object5).iterator();
        while (object32.hasNext()) {
            object22 = (et)object32.next();
            boolean et2 = arrayList4.contains(object22);
            object = RotationUtils.reachableOffset((vg)this.a.player(), (et)object22, new bhe((double)object22.p() + 0.5, (double)(object22.q() + 1), (double)object22.r() + 0.5), this.a.playerController().getBlockReachDistance(), false);
            if (!((Optional)object).isPresent() || !bl3 || !this.a.a.a(true, et2 ? this::c : this::a)) continue;
            object5 = RayTraceUtils.rayTraceTowards((vg)this.a.player(), (Rotation)((Optional)object).get(), this.a.playerController().getBlockReachDistance());
            if (((bhc)object5).a != bhc.a.b || ((bhc)object5).b != fa.b) continue;
            this.a.a.updateTarget((Rotation)((Optional)object).get(), true);
            if (this.a.isLookingAt((et)object22)) {
                this.a.a.setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        for (Object object22 : arrayList3) {
            Optional<Rotation> et3 = RotationUtils.reachable((IPlayerContext)this.a, (et)object22);
            if (!et3.isPresent() || !bl3 || !this.a.a.a(true, this::b)) continue;
            this.a.a.updateTarget(et3.get(), true);
            if (this.a.isLookingAt((et)object22)) {
                this.a.a.setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        if (bl2) {
            this.logDirect("Farm failed");
            this.onLostControl();
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        object32 = new ArrayList();
        object22 = arrayList.iterator();
        while (object22.hasNext()) {
            et et4 = (et)object22.next();
            object32.add(new eg(et4));
        }
        if (this.a.a.a(false, this::a)) {
            for (et et5 : arrayList2) {
                object32.add(new GoalBlock(et5.a()));
            }
        }
        if (this.a.a.a(false, this::c)) {
            for (et vg2 : arrayList4) {
                object32.add(new GoalBlock(vg2.a()));
            }
        }
        if (this.a.a.a(false, this::b)) {
            for (et et2 : arrayList3) {
                object32.add(new GoalBlock(et2));
            }
        }
        for (vg vg2 : this.a.world().e) {
            if (!(vg2 instanceof acl) || !vg2.z || !c.contains((object = (acl)vg2).k().c())) continue;
            object32.add(new GoalBlock(new et(vg2.p, vg2.q + 0.1, vg2.r)));
        }
        return new PathingCommand(new GoalComposite(object32.toArray(new Goal[0])), PathingCommandType.SET_GOAL_AND_PATH);
    }

    @Override
    public final void onLostControl() {
        this.a = false;
    }

    @Override
    public final String displayName0() {
        return "Farming";
    }
}

