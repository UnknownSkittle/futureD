/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ahb
 *  aip
 *  amy
 *  aom
 *  aox
 *  aru
 *  awt
 *  bhc
 *  bhc$a
 *  bhe
 *  et
 *  fa
 *  fq
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  rr
 *  vg
 *  vp
 */
package baritone;

import baritone.a;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.process.IBuilderProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.schematic.FillSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.IStaticSchematic;
import baritone.api.schematic.format.ISchematicFormat;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.eb;
import baritone.ec;
import baritone.ed;
import baritone.ee;
import baritone.ef;
import baritone.eg;
import baritone.eh;
import baritone.ei;
import baritone.ej;
import baritone.fk;
import baritone.fn;
import baritone.fu;
import baritone.go;
import baritone.gp;
import baritone.utils.schematic.schematica.SchematicaHelper;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.File;
import java.io.FileInputStream;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ea
extends fk
implements IBuilderProcess {
    private HashSet<BetterBlockPos> a;
    private LongOpenHashSet a;
    private String a;
    private ISchematic b;
    public ISchematic a;
    public fq a;
    private int a;
    private boolean a;
    private int b;
    private int c;
    public List<awt> a;

    public ea(a a2) {
        super(a2);
    }

    @Override
    public final void build(String string, ISchematic iSchematic, fq fq2) {
        this.a = string;
        this.a = iSchematic;
        this.b = null;
        int n2 = fq2.p();
        int n3 = fq2.q();
        int n4 = fq2.r();
        if (((Boolean)baritone.a.a().schematicOrientationX.value).booleanValue()) {
            n2 += iSchematic.widthX();
        }
        if (((Boolean)baritone.a.a().schematicOrientationY.value).booleanValue()) {
            n3 += iSchematic.heightY();
        }
        if (((Boolean)baritone.a.a().schematicOrientationZ.value).booleanValue()) {
            n4 += iSchematic.lengthZ();
        }
        this.a = new fq(n2, n3, n4);
        this.a = false;
        this.b = 0;
        this.c = 0;
        this.a = new LongOpenHashSet();
    }

    @Override
    public final void resume() {
        this.a = false;
    }

    @Override
    public final void pause() {
        this.a = true;
    }

    @Override
    public final boolean isPaused() {
        return this.a;
    }

    @Override
    public final boolean build(String string, File object, fq fq2) {
        Optional<ISchematicFormat> optional = gp.a.getByFile((File)object);
        if (!optional.isPresent()) {
            return false;
        }
        try {
            object = optional.get().parse(new FileInputStream((File)object));
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        if (((Boolean)baritone.a.a().mapArtMode.value).booleanValue()) {
            object = new go((IStaticSchematic)object);
        }
        this.build(string, (ISchematic)object, fq2);
        return true;
    }

    @Override
    public final void buildOpenSchematic() {
        if (SchematicaHelper.a()) {
            Optional<rr<IStaticSchematic, et>> optional = SchematicaHelper.a();
            if (optional.isPresent()) {
                IStaticSchematic iStaticSchematic = (IStaticSchematic)optional.get().a();
                this.build(((IStaticSchematic)optional.get().a()).toString(), (Boolean)baritone.a.a().mapArtMode.value != false ? new go(iStaticSchematic) : iStaticSchematic, (fq)optional.get().b());
                return;
            }
            this.logDirect("No schematic currently open");
            return;
        }
        this.logDirect("Schematica is not present");
    }

    @Override
    public final void clearArea(et et2, et et3) {
        et et4 = new et(Math.min(et2.p(), et3.p()), Math.min(et2.q(), et3.q()), Math.min(et2.r(), et3.r()));
        int n2 = Math.abs(et2.p() - et3.p()) + 1;
        int n3 = Math.abs(et2.q() - et3.q()) + 1;
        int n4 = Math.abs(et2.r() - et3.r()) + 1;
        this.build("clear area", new FillSchematic(n2, n3, n4, aox.a.t()), (fq)et4);
    }

    @Override
    public final List<awt> getApproxPlaceable() {
        return new ArrayList<BetterBlockPos>(this.a);
    }

    @Override
    public final boolean isActive() {
        return this.a != null;
    }

    private Optional<rr<BetterBlockPos, Rotation>> a(ee ee2) {
        BetterBlockPos betterBlockPos = this.a.playerFeet();
        BetterBlockPos betterBlockPos2 = ((a)((Object)this.a)).a.a();
        for (int i2 = -5; i2 <= 5; ++i2) {
            int n2;
            int n3 = n2 = (Boolean)baritone.a.a().breakFromAbove.value != false ? -1 : 0;
            while (n2 <= 5) {
                for (int i3 = -5; i3 <= 5; ++i3) {
                    awt awt2;
                    awt awt3;
                    int n4 = betterBlockPos.a + i2;
                    int n5 = betterBlockPos.b + n2;
                    int n6 = betterBlockPos.c + i3;
                    if (n2 == -1 && n4 == betterBlockPos2.a && n6 == betterBlockPos2.c || (awt3 = ee.a(ee2, n4, n5, n6, ((fn)((Object)ee2.a)).a(n4, n5, n6))) == null || (awt2 = ((fn)((Object)ee2.a)).a(n4, n5, n6)).u() == aox.a || awt2.u() instanceof aru || ea.a(awt2, awt3, false)) continue;
                    BetterBlockPos betterBlockPos3 = new BetterBlockPos(n4, n5, n6);
                    Optional<Rotation> optional = RotationUtils.reachable(this.a.player(), (et)betterBlockPos3, this.a.playerController().getBlockReachDistance());
                    if (!optional.isPresent()) continue;
                    return Optional.of(new rr((Object)betterBlockPos3, (Object)optional.get()));
                }
                ++n2;
            }
        }
        return Optional.empty();
    }

    private Optional<ej> a(ee ee2, List<awt> list) {
        BetterBlockPos betterBlockPos = this.a.playerFeet();
        for (int i2 = -5; i2 <= 5; ++i2) {
            for (int i3 = -5; i3 <= 1; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    Object object;
                    Object object2;
                    block10: {
                        awt awt2;
                        int n2 = betterBlockPos.a + i2;
                        int n3 = betterBlockPos.b + i3;
                        int n4 = betterBlockPos.c + i4;
                        awt awt3 = ee.a(ee2, n2, n3, n4, ((fn)((Object)ee2.a)).a(n2, n3, n4));
                        if (awt3 == null || !cl.a(n2, n4, awt2 = ((fn)((Object)ee2.a)).a(n2, n3, n4), ee2.a) || ea.a(awt2, awt3, false) || i3 == 1 && ((fn)((Object)ee2.a)).a(n2, n3 + 1, n4).u() == aox.a) continue;
                        list.add(awt3);
                        List<awt> list2 = ee2.a;
                        int n5 = n4;
                        int n6 = n3;
                        n4 = n2;
                        awt awt4 = awt3;
                        object2 = this;
                        for (bhe[] bheArray : fa.values()) {
                            bhe[] bheArray2;
                            BetterBlockPos betterBlockPos2 = new BetterBlockPos(n4, n6, n5).offset((fa)bheArray);
                            awt awt5 = ((fn)((Object)list2)).a(betterBlockPos2);
                            if (cl.a(betterBlockPos2.a, betterBlockPos2.c, awt5, list2) || !((ea)object2).a.world().a(awt4.u(), (et)new BetterBlockPos(n4, n6, n5), false, (fa)bheArray, null)) continue;
                            awt5 = awt5.e((amy)((ea)object2).a.world(), (et)betterBlockPos2);
                            bhe[] bheArray3 = bheArray;
                            switch (ed.a[bheArray3.ordinal()]) {
                                case 1: {
                                    bhe[] bheArray4 = new bhe[5];
                                    bheArray4[0] = new bhe(0.5, 1.0, 0.5);
                                    bheArray4[1] = new bhe(0.1, 1.0, 0.5);
                                    bheArray4[2] = new bhe(0.9, 1.0, 0.5);
                                    bheArray4[3] = new bhe(0.5, 1.0, 0.1);
                                    bheArray2 = bheArray4;
                                    bheArray4[4] = new bhe(0.5, 1.0, 0.9);
                                    break;
                                }
                                case 2: {
                                    bhe[] bheArray5 = new bhe[5];
                                    bheArray5[0] = new bhe(0.5, 0.0, 0.5);
                                    bheArray5[1] = new bhe(0.1, 0.0, 0.5);
                                    bheArray5[2] = new bhe(0.9, 0.0, 0.5);
                                    bheArray5[3] = new bhe(0.5, 0.0, 0.1);
                                    bheArray2 = bheArray5;
                                    bheArray5[4] = new bhe(0.5, 0.0, 0.9);
                                    break;
                                }
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: {
                                    double d2 = bheArray3.g() == 0 ? 0.5 : (double)(1 + bheArray3.g()) / 2.0;
                                    double d3 = bheArray3.i() == 0 ? 0.5 : (double)(1 + bheArray3.i()) / 2.0;
                                    bhe[] bheArray6 = new bhe[2];
                                    bheArray6[0] = new bhe(d2, 0.25, d3);
                                    bheArray2 = bheArray6;
                                    bheArray6[1] = new bhe(d2, 0.75, d3);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException();
                                }
                            }
                            bheArray3 = bheArray2;
                            int n7 = bheArray2.length;
                            for (int i5 = 0; i5 < n7; ++i5) {
                                Object object3 = bheArray3[i5];
                                double d4 = (double)betterBlockPos2.a + awt5.a * object3.b + awt5.d * (1.0 - object3.b);
                                double d5 = (double)betterBlockPos2.b + awt5.b * object3.c + awt5.e * (1.0 - object3.c);
                                double d6 = (double)betterBlockPos2.c + awt5.c * object3.d + awt5.f * (1.0 - object3.d);
                                object3 = RotationUtils.calcRotationFromVec3d(RayTraceUtils.inferSneakingEyePosition((vg)((ea)object2).a.player()), new bhe(d4, d5, d6), ((ea)object2).a.playerRotations());
                                Object object4 = RayTraceUtils.rayTraceTowards((vg)((ea)object2).a.player(), (Rotation)object3, ((ea)object2).a.playerController().getBlockReachDistance(), true);
                                if (object4 == null || ((bhc)object4).a != bhc.a.b || !object4.a().equals((Object)betterBlockPos2) || ((bhc)object4).b != bheArray.d() || !((OptionalInt)(object4 = super.a(awt4, (bhc)object4, (Rotation)object3))).isPresent()) continue;
                                object = Optional.of(new ej(((OptionalInt)object4).getAsInt(), betterBlockPos2, bheArray.d(), (Rotation)object3));
                                break block10;
                            }
                        }
                        object = object2 = Optional.empty();
                    }
                    if (!((Optional)object).isPresent()) continue;
                    return object2;
                }
            }
        }
        return Optional.empty();
    }

    private OptionalInt a(awt awt2, bhc bhc2, Rotation rotation) {
        for (int i2 = 0; i2 < 9; ++i2) {
            aip aip2 = (aip)this.a.player().bv.a.get(i2);
            if (aip2.b() || !(aip2.c() instanceof ahb)) continue;
            float f2 = this.a.player().v;
            float f3 = this.a.player().w;
            this.a.player().v = rotation.getYaw();
            this.a.player().w = rotation.getPitch();
            aip2 = ((ahb)aip2.c()).d().a(this.a.world(), bhc2.a().a(bhc2.b), bhc2.b, (float)bhc2.c.b - (float)bhc2.a().p(), (float)bhc2.c.c - (float)bhc2.a().q(), (float)bhc2.c.d - (float)bhc2.a().r(), aip2.c().a(aip2.j()), (vp)this.a.player());
            this.a.player().v = f2;
            this.a.player().w = f3;
            if (!ea.a((awt)aip2, awt2, true)) continue;
            return OptionalInt.of(i2);
        }
        return OptionalInt.empty();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final PathingCommand onTick(boolean var1_1, boolean var2_4) {
        while (true) {
            block24: {
                this.a = this.a(36);
                this.a = this.a.a.isInputForcedDown(Input.CLICK_LEFT) ? 5 : --this.a;
                this.a.a.clearAllKeys();
                if (this.a) {
                    return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                if (((Boolean)baritone.a.a().buildInLayers.value).booleanValue()) {
                    if (this.b == null) {
                        this.b = this.a;
                    }
                    var3_8 = this.b;
                    if (((Boolean)baritone.a.a().layerOrder.value).booleanValue()) {
                        var5_12 = var3_8.heightY() - 1;
                        var4_10 = var3_8.heightY() - this.b;
                    } else {
                        var5_12 = this.b - 1;
                        var4_10 = 0;
                    }
                    this.a = new eb(this, (ISchematic)var3_8, var4_10, var5_12);
                }
                var3_8 = new ee(this);
                var5_13 = var3_8;
                var4_9 = this;
                if (var4_9.a != null) break block24;
                var4_9.a = new HashSet<E>();
                var4_9.b((ee)var5_13);
                if (var4_9.a.isEmpty()) ** GOTO lbl-1000
            }
            var4_9.a((ee)var5_13);
            if (var4_9.a.isEmpty()) {
                var4_9.b((ee)var5_13);
            }
            if (!var4_9.a.isEmpty()) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            if (v0) break;
            if (((Boolean)baritone.a.a().buildInLayers.value).booleanValue() && this.b < this.b.heightY()) {
                this.logDirect("Starting layer " + this.b);
                ++this.b;
                continue;
            }
            var4_9 = (fq)baritone.a.a().buildRepeat.value;
            var5_14 = (Integer)baritone.a.a().buildRepeatCount.value;
            ++this.c;
            if (var4_9.equals(new fq(0, 0, 0)) || var5_14 != -1 && this.c >= var5_14) {
                this.logDirect("Done building");
                this.onLostControl();
                return null;
            }
            this.b = 0;
            this.a = new et(this.a).a(var4_9);
            this.logDirect("Repeating build in vector " + var4_9 + ", new origin is " + this.a);
        }
        if (((Boolean)baritone.a.a().distanceTrim.value).booleanValue()) {
            var4_9 = this;
            var5_13 = new HashSet<BetterBlockPos>(var4_9.a);
            var5_13.removeIf((Predicate<BetterBlockPos>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, a(baritone.api.utils.BetterBlockPos ), (Lbaritone/api/utils/BetterBlockPos;)Z)((ea)var4_9));
            if (!var5_13.isEmpty()) {
                var4_9.a = var5_13;
            }
        }
        if ((var4_9 = this.a((ee)var3_8)).isPresent() && var2_4 && this.a.player().z) {
            var5_13 = (Rotation)((rr)var4_9.get()).b();
            var1_2 = (BetterBlockPos)((rr)var4_9.get()).a();
            this.a.a.updateTarget((Rotation)var5_13, true);
            cl.a(this.a, var3_8.a(var1_2));
            if (this.a.player().aU()) {
                this.a.a.setInputForceState(Input.SNEAK, true);
            }
            if (this.a.isLookingAt(var1_2) || this.a.playerRotations().isReallyCloseTo((Rotation)var5_13)) {
                this.a.a.setInputForceState(Input.CLICK_LEFT, true);
            }
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        var5_13 = new ArrayList<E>();
        var1_3 = this.a((ee)var3_8, (List<awt>)var5_13);
        if (var1_3.isPresent() && var2_4 && this.a.player().z && this.a <= 0) {
            var2_5 = var1_3.get().a;
            this.a.a.updateTarget(var2_5, true);
            this.a.player().bv.d = ((ej)var1_3.get()).a;
            this.a.a.setInputForceState(Input.SNEAK, true);
            if (this.a.isLookingAt(((ej)var1_3.get()).a) && this.a.objectMouseOver().b.equals((Object)((ej)var1_3.get()).a) || this.a.playerRotations().isReallyCloseTo(var2_5)) {
                this.a.a.setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        if (((Boolean)baritone.a.a().allowInventory.value).booleanValue()) {
            var2_6 = new ArrayList<Integer>();
            var1_3 = new ArrayList<E>();
            var4_9 = var5_13.iterator();
            block1: while (var4_9.hasNext()) {
                var5_13 = (awt)var4_9.next();
                for (var6_15 = 0; var6_15 < 9; ++var6_15) {
                    if (!ea.a((awt)this.a.get(var6_15), var5_13, true)) continue;
                    var2_6.add(var6_15);
                    continue block1;
                }
                var1_3.add(var5_13);
            }
            block3: for (var4_11 = 9; var4_11 < 36; ++var4_11) {
                var5_13 = var1_3.iterator();
                while (var5_13.hasNext()) {
                    var6_17 = (awt)var5_13.next();
                    if (!ea.a((awt)this.a.get(var4_11), var6_17, true)) continue;
                    this.a.a.a(var4_11, (Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.Object ), (Ljava/lang/Integer;)Z)(var2_6));
                    break block3;
                }
            }
        }
        if ((var2_7 = this.a((ee)var3_8, this.a.subList(0, 9))) == null && (var2_7 = this.a((ee)var3_8, (List<awt>)this.a)) == null) {
            this.logDirect("Unable to do it. Pausing. resume to resume, cancel to cancel");
            this.a = true;
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        return new fu(var2_7, PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH, (cj)var3_8);
    }

    private void a(ee ee2) {
        BetterBlockPos betterBlockPos = this.a.playerFeet();
        int n2 = (Integer)baritone.a.a().builderTickScanRadius.value;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    int n3 = betterBlockPos.a + i2;
                    int n4 = betterBlockPos.b + i3;
                    int n5 = betterBlockPos.c + i4;
                    awt awt2 = ee.a(ee2, n3, n4, n5, ((fn)((Object)ee2.a)).a(n3, n4, n5));
                    if (awt2 == null) continue;
                    BetterBlockPos betterBlockPos2 = new BetterBlockPos(n3, n4, n5);
                    if (ea.a(((fn)((Object)ee2.a)).a(n3, n4, n5), awt2, false)) {
                        this.a.remove((Object)betterBlockPos2);
                        this.a.add(BetterBlockPos.longHash(betterBlockPos2));
                        continue;
                    }
                    this.a.add(betterBlockPos2);
                    this.a.remove(BetterBlockPos.longHash(betterBlockPos2));
                }
            }
        }
    }

    private void b(ee ee2) {
        this.a = new HashSet();
        for (int i2 = 0; i2 < this.a.heightY(); ++i2) {
            for (int i3 = 0; i3 < this.a.lengthZ(); ++i3) {
                for (int i4 = 0; i4 < this.a.widthX(); ++i4) {
                    int n2;
                    int n3;
                    int n4 = i4 + this.a.p();
                    awt awt2 = ((fn)((Object)ee2.a)).a(n4, n3 = i2 + this.a.q(), n2 = i3 + this.a.r());
                    if (!this.a.inSchematic(i4, i2, i3, awt2)) continue;
                    if (((fn)((Object)ee2.a)).a(n4, n2)) {
                        if (ea.a(((fn)((Object)ee2.a)).a(n4, n3, n2), this.a.desiredState(i4, i2, i3, awt2, (List<awt>)((Object)this.a)), false)) {
                            this.a.add(BetterBlockPos.longHash(n4, n3, n2));
                            continue;
                        }
                        this.a.add(new BetterBlockPos(n4, n3, n2));
                        this.a.remove(BetterBlockPos.longHash(n4, n3, n2));
                        if (this.a.size() <= (Integer)baritone.a.a().incorrectSize.value) continue;
                        return;
                    }
                    if (this.a.contains(BetterBlockPos.longHash(n4, n3, n2))) continue;
                    this.a.add(new BetterBlockPos(n4, n3, n2));
                    if (this.a.size() <= (Integer)baritone.a.a().incorrectSize.value) continue;
                    return;
                }
            }
        }
    }

    private Goal a(ee ee2, List<awt> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a.forEach(betterBlockPos -> {
            awt awt2 = ((fn)((Object)ee2.a)).a((et)betterBlockPos);
            if (awt2.u() instanceof aom) {
                if (list.contains(ee.a(ee2, betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, awt2))) {
                    arrayList.add(betterBlockPos);
                    return;
                }
            } else if (awt2.u() instanceof aru) {
                if (!cl.b(awt2)) {
                    arrayList3.add(betterBlockPos);
                    return;
                }
            } else {
                arrayList2.add(betterBlockPos);
            }
        });
        list = new ArrayList<awt>();
        arrayList2.forEach(object3 -> {
            List list = list;
            BetterBlockPos betterBlockPos = object3;
            object3 = ee2;
            ee2 = betterBlockPos;
            list = this;
            list.add((Boolean)baritone.a.a().goalBreakFromAbove.value != false && ((fn)((Object)((ee)object3).a)).a(ee2.a()).u() instanceof aom && ((fn)((Object)((ee)object3).a)).a(ee2.b(2)).u() instanceof aom ? new ei(new eg((et)ee2), new ec((ea)((Object)list), ee2.a())) : new eg((et)ee2));
        });
        arrayList2 = new ArrayList();
        arrayList.forEach(betterBlockPos -> {
            if (!arrayList.contains((Object)betterBlockPos.down()) && !arrayList.contains((Object)betterBlockPos.down(2))) {
                Goal goal;
                List list;
                block4: {
                    list = arrayList2;
                    arrayList2 = betterBlockPos;
                    arrayList = this;
                    if (((ea)object).a.world().o((et)arrayList2).u() != aox.a) {
                        goal = new eh((et)arrayList2);
                    } else {
                        boolean bl2 = ((ea)object).a.world().o(arrayList2.a()).u() != aox.a;
                        awt awt2 = ((ea)object).a.world().o((et)arrayList2);
                        fa[] faArray = ck.a;
                        for (int i2 = 0; i2 < 5; ++i2) {
                            fa fa2 = faArray[i2];
                            if (!cl.c(((ea)object).a, arrayList2.a(fa2)) || !((ea)object).a.world().a(ee.a(ee2, arrayList2.p(), arrayList2.q(), arrayList2.r(), awt2).u(), (et)arrayList2, false, fa2, null)) continue;
                            Object object3 = arrayList2;
                            goal = new ef((et)object3, object3.a(fa2), bl2);
                            break block4;
                        }
                        goal = new eh((et)arrayList2);
                    }
                }
                list.add(goal);
            }
        });
        arrayList3.forEach(betterBlockPos -> arrayList2.add(new GoalBlock(betterBlockPos.up())));
        if (!arrayList2.isEmpty()) {
            return new ei(new GoalComposite(arrayList2.toArray(new Goal[0])), new GoalComposite(list.toArray(new Goal[0])));
        }
        if (list.isEmpty()) {
            return null;
        }
        return new GoalComposite(list.toArray(new Goal[0]));
    }

    @Override
    public final void onLostControl() {
        this.a = null;
        this.a = null;
        this.a = null;
        this.b = null;
        this.b = 0;
        this.c = 0;
        this.a = false;
        this.a = null;
    }

    @Override
    public final String displayName0() {
        if (this.a) {
            return "Builder Paused";
        }
        return "Building " + this.a;
    }

    private List<awt> a(int n2) {
        ArrayList<awt> arrayList = new ArrayList<awt>();
        for (int i2 = 0; i2 < n2; ++i2) {
            aip aip2 = (aip)this.a.player().bv.a.get(i2);
            if (aip2.b() || !(aip2.c() instanceof ahb)) {
                arrayList.add(aox.a.t());
                continue;
            }
            arrayList.add(((ahb)aip2.c()).d().a(this.a.world(), (et)this.a.playerFeet(), fa.b, (float)this.a.player().p, (float)this.a.player().q, (float)this.a.player().r, aip2.c().a(aip2.j()), (vp)this.a.player()));
        }
        return arrayList;
    }

    private static boolean a(awt awt2, awt awt3, boolean bl2) {
        if (awt3 == null) {
            return true;
        }
        if (awt2.u() instanceof aru && ((Boolean)baritone.a.a().okIfWater.value).booleanValue()) {
            return true;
        }
        if (awt3.u() instanceof aom && ((List)baritone.a.a().buildIgnoreBlocks.value).contains(awt2.u())) {
            return true;
        }
        if (!(awt2.u() instanceof aom) && ((Boolean)baritone.a.a().buildIgnoreExisting.value).booleanValue() && !bl2) {
            return true;
        }
        return awt2.equals(awt3);
    }

    private /* synthetic */ boolean a(BetterBlockPos betterBlockPos) {
        return betterBlockPos.f(this.a.player().p, this.a.player().q, this.a.player().r) > 200.0;
    }

    static /* synthetic */ List a(ea ea2) {
        return ea2.a;
    }

    static /* synthetic */ a a(ea ea2) {
        return ea2.a;
    }

    static /* synthetic */ List b(ea ea2) {
        return ea2.a(9);
    }

    static /* synthetic */ ISchematic a(ea ea2) {
        return ea2.a;
    }

    static /* synthetic */ fq a(ea ea2) {
        return ea2.a;
    }

    static /* synthetic */ boolean a(awt awt2, awt awt3) {
        return ea.a(awt2, awt3, false);
    }
}

