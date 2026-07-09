/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  acl
 *  aip
 *  aom
 *  aow
 *  aox
 *  aqm
 *  awt
 *  bud
 *  et
 *  fq
 *  vg
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalRunAway;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.process.IMineProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.BlockUtils;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.cl;
import baritone.fd;
import baritone.fe;
import baritone.fk;
import baritone.fn;
import baritone.l;
import baritone.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fc
extends fk
implements IMineProcess {
    private BlockOptionalMetaLookup a;
    private List<et> a;
    private List<et> b;
    private Map<et, Long> a;
    private et a;
    private GoalRunAway a;
    private int a;
    private int b;

    public fc(a a2) {
        super(a2);
    }

    @Override
    public final boolean isActive() {
        return this.a != null;
    }

    @Override
    public final PathingCommand onTick(boolean bl2, boolean bl3) {
        Object object;
        int n2;
        if (this.a > 0) {
            n2 = this.a.player().bv.a.stream().filter(aip2 -> this.a.has((aip)aip2)).mapToInt(aip::E).sum();
            System.out.println("Currently have " + n2 + " valid items");
            if (n2 >= this.a) {
                this.logDirect("Have " + n2 + " valid items");
                this.cancel();
                return null;
            }
        }
        if (bl2) {
            if (!this.a.isEmpty() && ((Boolean)baritone.a.a().blacklistClosestOnFailure.value).booleanValue()) {
                this.logDirect("Unable to find any path to " + this.a + ", blacklisting presumably unreachable closest instance...");
                this.a.stream().min(Comparator.comparingDouble(arg_0 -> ((bud)this.a.player()).c(arg_0))).ifPresent(this.b::add);
                this.a.removeIf(this.b::contains);
            } else {
                this.logDirect("Unable to find any path to " + this.a + ", canceling mine");
                this.cancel();
                return null;
            }
        }
        if (!((Boolean)baritone.a.a().allowBreak.value).booleanValue()) {
            this.logDirect("Unable to mine when allowBreak is false!");
            this.cancel();
            return null;
        }
        this.a();
        n2 = (Integer)baritone.a.a().mineGoalUpdateInterval.value;
        Object object2 = new ArrayList(this.a);
        if (n2 != 0 && this.b++ % n2 == 0) {
            cj cj2 = new cj((IBaritone)((Object)this.a), true);
            baritone.a.a().execute(() -> this.a((List<et>)object2, cj2));
        }
        if (((Boolean)baritone.a.a().legitMine.value).booleanValue()) {
            this.b();
        }
        Object object3 = object2.stream().filter(et2 -> et2.p() == this.a.playerFeet().p() && et2.r() == this.a.playerFeet().r()).filter(et2 -> et2.q() >= this.a.playerFeet().q()).filter(et2 -> !(fn.a((IPlayerContext)((Object)this.a), et2).u() instanceof aom)).min(Comparator.comparingDouble(arg_0 -> ((bud)this.a.player()).c(arg_0)));
        ((a)((Object)this.a)).a.clearAllKeys();
        if (((Optional)object3).isPresent() && this.a.player().z) {
            object2 = ((Optional)object3).get();
            object3 = ((a)((Object)this.a)).a.a((et)object2);
            if (!cl.a(((a)((Object)this.a)).a, object2.p(), object2.q(), object2.r(), (awt)object3) && ((Optional)(object3 = RotationUtils.reachable((IPlayerContext)((Object)this.a), (et)object2))).isPresent() && bl3) {
                ((a)((Object)this.a)).a.updateTarget((Rotation)((Optional)object3).get(), true);
                cl.a((IPlayerContext)((Object)this.a), this.a.world().o((et)object2));
                if (this.a.isLookingAt((et)object2) || this.a.playerRotations().isReallyCloseTo((Rotation)((Optional)object3).get())) {
                    ((a)((Object)this.a)).a.setInputForceState(Input.CLICK_LEFT, true);
                }
                return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
            }
        }
        object2 = this;
        bl3 = (Boolean)baritone.a.a().legitMine.value;
        object3 = ((fc)object2).a;
        if (!object3.isEmpty()) {
            Object object4 = new cj((IBaritone)((Object)((fc)object2).a));
            object3 = fc.a((cj)object4, new ArrayList<et>((Collection<et>)object3), ((fc)object2).a, ((fc)object2).b, super.a());
            object4 = new GoalComposite((Goal[])object3.stream().map(arg_0 -> ((fc)object2).a((List)object3, (cj)object4, arg_0)).toArray(Goal[]::new));
            ((fc)object2).a = object3;
            object = new PathingCommand((Goal)object4, bl3 ? PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH : PathingCommandType.REVALIDATE_GOAL_AND_PATH);
        } else if (!bl3) {
            object = null;
        } else {
            int n3 = (Integer)baritone.a.a().legitMineYLevel.value;
            if (((fc)object2).a == null) {
                ((fc)object2).a = ((fc)object2).a.playerFeet();
            }
            if (((fc)object2).a == null) {
                ((fc)object2).a = new fd((fc)object2, (Integer)n3, ((fc)object2).a);
            }
            object = object2 = new PathingCommand(((fc)object2).a, PathingCommandType.REVALIDATE_GOAL_AND_PATH);
        }
        if (object == null) {
            this.cancel();
            return null;
        }
        return object2;
    }

    private void a() {
        HashMap hashMap = new HashMap(this.a);
        this.a.getSelectedBlock().ifPresent(et2 -> {
            if (this.a.contains(et2)) {
                hashMap.put(et2, System.currentTimeMillis() + (Long)baritone.a.a().mineDropLoiterDurationMSThanksLouca.value);
            }
        });
        for (et et3 : this.a.keySet()) {
            if ((Long)hashMap.get(et3) >= System.currentTimeMillis()) continue;
            hashMap.remove(et3);
        }
        this.a = hashMap;
    }

    @Override
    public final void onLostControl() {
        this.mine(0, (BlockOptionalMetaLookup)null);
    }

    @Override
    public final String displayName0() {
        return "Mine " + this.a;
    }

    private void a(List<et> list, cj cj2) {
        if (this.a == null) {
            return;
        }
        if (((Boolean)baritone.a.a().legitMine.value).booleanValue()) {
            return;
        }
        List<et> list2 = this.a();
        list = fc.a(cj2, this.a, list, this.b, list2);
        list.addAll(list2);
        if (list.isEmpty()) {
            this.logDirect("No locations for " + this.a + " known, cancelling");
            this.cancel();
            return;
        }
        this.a = list;
    }

    private boolean a(et et2, cj cj2, List<et> awt2) {
        if (awt2.contains(et2)) {
            return true;
        }
        awt2 = cj2.a.a(et2);
        if (((Boolean)baritone.a.a().internalMiningAirException.value).booleanValue() && awt2.u() instanceof aom) {
            return true;
        }
        return this.a.has(awt2) && fc.a(cj2, et2);
    }

    private List<et> a() {
        if (!((Boolean)baritone.a.a().mineScanDroppedItems.value).booleanValue()) {
            return Collections.emptyList();
        }
        ArrayList<et> arrayList = new ArrayList<et>();
        for (vg vg2 : this.a.world().e) {
            acl acl2;
            if (!(vg2 instanceof acl) || !this.a.has((acl2 = (acl)vg2).k())) continue;
            arrayList.add(new et(vg2));
        }
        arrayList.addAll(this.a.keySet());
        return arrayList;
    }

    public static List<et> a(cj cj2, BlockOptionalMetaLookup blockOptionalMetaLookup, List<et> list, List<et> list2, List<et> list3) {
        List<et> list4 = new ArrayList<et>();
        ArrayList<aow> arrayList = new ArrayList<aow>();
        Iterator<BlockOptionalMeta> iterator = blockOptionalMetaLookup.blocks().iterator();
        while (iterator.hasNext()) {
            aow aow2 = iterator.next().getBlock();
            if (l.a.contains(aow2)) {
                BetterBlockPos betterBlockPos = cj2.a.getPlayerContext().playerFeet();
                list4.addAll(cj2.a.getCachedWorld().getLocationsOf(BlockUtils.blockToString(aow2), (Integer)baritone.a.a().maxCachedWorldScanCount.value, betterBlockPos.a, betterBlockPos.c, 2));
                continue;
            }
            arrayList.add(aow2);
        }
        list4 = fc.a(cj2, list4, blockOptionalMetaLookup, list2, list3);
        if (!arrayList.isEmpty() || ((Boolean)baritone.a.a().extendCacheOnThreshold.value).booleanValue() && list4.size() < 64) {
            list4.addAll(w.a.scanChunkRadius(cj2.a.getPlayerContext(), blockOptionalMetaLookup, 64, 10, 32));
        }
        list4.addAll(list);
        return fc.a(cj2, list4, blockOptionalMetaLookup, list2, list3);
    }

    private void b() {
        List<et> list = this.a();
        this.a.addAll(list);
        BetterBlockPos betterBlockPos = this.a.playerFeet();
        fn fn2 = new fn((IPlayerContext)((Object)this.a));
        for (int i2 = betterBlockPos.p() - 10; i2 <= betterBlockPos.p() + 10; ++i2) {
            for (int i3 = betterBlockPos.q() - 10; i3 <= betterBlockPos.q() + 10; ++i3) {
                for (int i4 = betterBlockPos.r() - 10; i4 <= betterBlockPos.r() + 10; ++i4) {
                    if (!this.a.has(fn2.a(i2, i3, i4))) continue;
                    et et2 = new et(i2, i3, i4);
                    if ((!((Boolean)baritone.a.a().legitMineIncludeDiagonals.value).booleanValue() || !this.a.stream().anyMatch(et3 -> et3.n((fq)et2) <= 2.0)) && !RotationUtils.reachable(this.a.player(), et2, 20.0).isPresent()) continue;
                    this.a.add(et2);
                }
            }
        }
        this.a = fc.a(new cj((IBaritone)((Object)this.a)), (List<et>)((Object)this.a), this.a, this.b, list);
    }

    private static List<et> a(cj object, List<et> list, BlockOptionalMetaLookup blockOptionalMetaLookup, List<et> list2, List<et> list3) {
        list3.removeIf(arg_0 -> fc.a(list, blockOptionalMetaLookup, (cj)object, arg_0));
        object = list.stream().distinct().filter(arg_0 -> fc.a((cj)object, blockOptionalMetaLookup, list3, arg_0)).filter(arg_0 -> fc.b((cj)object, arg_0)).filter(et2 -> !list2.contains(et2)).sorted(Comparator.comparingDouble(arg_0 -> ((bud)((cj)object).a.getPlayerContext().player()).c(arg_0))).collect(Collectors.toList());
        if (object.size() > 64) {
            return object.subList(0, 64);
        }
        return object;
    }

    private static boolean a(cj cj2, et et2) {
        if (cl.a(cj2, et2.p(), et2.q(), et2.r(), cj2.a.a(et2), true) >= 1000000.0) {
            return false;
        }
        return cj2.a.a(et2.a()).u() != aox.h || cj2.a.a(et2.b()).u() != aox.h;
    }

    @Override
    public final void mineByName(int n2, String ... stringArray) {
        this.mine(n2, new BlockOptionalMetaLookup(stringArray));
    }

    @Override
    public final void mine(int n2, BlockOptionalMetaLookup blockOptionalMetaLookup) {
        while (true) {
            this.a = blockOptionalMetaLookup;
            if (blockOptionalMetaLookup == null || ((Boolean)baritone.a.a().allowBreak.value).booleanValue()) break;
            this.logDirect("Unable to mine when allowBreak is false!");
            blockOptionalMetaLookup = null;
        }
        this.a = n2;
        this.a = new ArrayList();
        this.b = new ArrayList<et>();
        this.a = null;
        this.a = null;
        this.a = new HashMap();
        if (blockOptionalMetaLookup != null) {
            this.a(new ArrayList<et>(), new cj((IBaritone)((Object)this.a)));
        }
    }

    private static /* synthetic */ boolean b(cj cj2, et et2) {
        return fc.a(cj2, et2);
    }

    private static /* synthetic */ boolean a(cj cj2, BlockOptionalMetaLookup blockOptionalMetaLookup, List list, et et2) {
        return !cj2.a.a(et2.p(), et2.r()) || blockOptionalMetaLookup.has(cj2.a(et2.p(), et2.q(), et2.r())) || list.contains(et2);
    }

    private static /* synthetic */ boolean a(List object, BlockOptionalMetaLookup blockOptionalMetaLookup, cj cj2, et et2) {
        object = object.iterator();
        while (object.hasNext()) {
            et et3;
            et et4 = (et)object.next();
            if (!(et3.n((fq)et2) <= 9.0) || !blockOptionalMetaLookup.has(cj2.a(et4.p(), et4.q(), et4.r())) || !fc.a(cj2, et4)) continue;
            return true;
        }
        return false;
    }

    private /* synthetic */ Goal a(List object, cj cj2, et object2) {
        boolean bl2;
        et et2 = object2;
        cj cj3 = cj2;
        object2 = object;
        cj2 = et2;
        object = this;
        boolean bl3 = bl2 = !(((a)((Object)((fc)object).a)).a.a(cj2.a()).u() instanceof aqm);
        if (!((Boolean)baritone.a.a().forceInternalMining.value).booleanValue()) {
            if (bl2) {
                return new fe((et)cj2);
            }
            return new GoalTwoBlocks((et)cj2);
        }
        boolean bl4 = super.a(cj2.a(), cj3, (List<et>)object2);
        boolean bl5 = super.a(cj2.b(), cj3, (List<et>)object2);
        boolean bl6 = super.a(cj2.c(2), cj3, (List<et>)object2);
        if (bl4 == bl5) {
            if (bl6 && bl2) {
                return new fe((et)cj2);
            }
            return new GoalTwoBlocks((et)cj2);
        }
        if (bl4) {
            return new GoalBlock((et)cj2);
        }
        if (bl6 && bl2) {
            return new GoalTwoBlocks(cj2.b());
        }
        return new GoalBlock(cj2.b());
    }
}

