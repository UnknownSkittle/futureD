/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aox
 *  bhb
 *  bus
 *  bwv
 *  cdy
 *  et
 *  org.lwjgl.opengl.GL11
 *  rk
 *  vg
 */
package baritone;

import baritone.a;
import baritone.api.BaritoneAPI;
import baritone.api.event.events.RenderEvent;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.pathing.goals.GoalInverted;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.interfaces.IGoalRenderPos;
import baritone.dw;
import baritone.fn;
import baritone.fp;
import baritone.fq;
import baritone.j;
import java.awt.Color;
import java.util.Collection;
import java.util.Collections;
import org.lwjgl.opengl.GL11;

public final class ft
implements fq {
    public static void a(RenderEvent renderEvent, j j2) {
        int n2;
        int n3;
        float f2 = renderEvent.getPartialTicks();
        Object object = j2.getGoal();
        if (Helper.mc.m instanceof fp) {
            ((fp)Helper.mc.m).a();
        }
        if ((n3 = ((a)((Object)j2.a)).getPlayerContext().world().s.q().a()) != (n2 = BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext().world().s.q().a())) {
            return;
        }
        vg vg2 = Helper.mc.aa();
        if (vg2.l != BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext().world()) {
            System.out.println("I have no idea what's going on");
            System.out.println("The primary baritone is in a different world than the render view entity");
            System.out.println("Not rendering the path");
            return;
        }
        if (object != null && ((Boolean)ft.a.renderGoal.value).booleanValue()) {
            ft.a(vg2, (Goal)object, f2, (Color)ft.a.colorGoalBox.value);
        }
        if (!((Boolean)ft.a.renderPath.value).booleanValue()) {
            return;
        }
        dw dw2 = j2.a;
        object = j2.b;
        if (dw2 != null && ((Boolean)ft.a.renderSelectionBoxes.value).booleanValue()) {
            ft.a(vg2, Collections.unmodifiableSet(dw2.a), (Color)ft.a.colorBlocksToBreak.value);
            ft.a(vg2, Collections.unmodifiableSet(dw2.b), (Color)ft.a.colorBlocksToPlace.value);
            ft.a(vg2, Collections.unmodifiableSet(dw2.c), (Color)ft.a.colorBlocksToWalkInto.value);
        }
        if (dw2 != null && dw2.getPath() != null) {
            n2 = Math.max(dw2.getPosition() - 3, 0);
            ft.a(dw2.getPath(), n2, (Color)ft.a.colorCurrentPath.value, (boolean)((Boolean)ft.a.fadePath.value));
        }
        if (object != null && ((dw)object).getPath() != null) {
            ft.a(((dw)object).getPath(), 0, (Color)ft.a.colorNextPath.value, (boolean)((Boolean)ft.a.fadePath.value));
        }
        j2.getInProgress().ifPresent(ch2 -> {
            ch2.bestPathSoFar().ifPresent(iPath -> ft.a(iPath, 0, (Color)ft.a.colorBestPathSoFar.value, (boolean)((Boolean)ft.a.fadePath.value)));
            ch2.pathToMostRecentNodeConsidered().ifPresent(iPath -> {
                ft.a(iPath, 0, (Color)ft.a.colorMostRecentConsidered.value, (boolean)((Boolean)ft.a.fadePath.value));
                ft.a(vg2, Collections.singletonList(iPath.getDest()), (Color)ft.a.colorMostRecentConsidered.value);
            });
        });
    }

    private static void a(IPath object, int n2, Color color, boolean bl2) {
        fq.a(color, ((Float)ft.a.pathRenderLineWidthPixels.value).floatValue(), (Boolean)ft.a.renderPathIgnoreDepth.value);
        int n3 = n2 + 10;
        int n4 = n2 + 20;
        object = object.positions();
        while (n2 < object.size() - 1) {
            BetterBlockPos betterBlockPos = (BetterBlockPos)((Object)object.get(n2));
            int n5 = n2 + 1;
            BetterBlockPos betterBlockPos2 = (BetterBlockPos)((Object)object.get(n5));
            int n6 = betterBlockPos2.a - betterBlockPos.a;
            int n7 = betterBlockPos2.b - betterBlockPos.b;
            int n8 = betterBlockPos2.c - betterBlockPos.c;
            while (!(n5 + 1 >= object.size() || bl2 && n5 + 1 >= n3 || n6 != ((BetterBlockPos)((Object)object.get((int)(n5 + 1)))).a - betterBlockPos2.a || n7 != ((BetterBlockPos)((Object)object.get((int)(n5 + 1)))).b - betterBlockPos2.b || n8 != ((BetterBlockPos)((Object)object.get((int)(n5 + 1)))).c - betterBlockPos2.c)) {
                betterBlockPos2 = (BetterBlockPos)((Object)object.get(++n5));
            }
            if (bl2) {
                float f2;
                if (n2 <= n3) {
                    f2 = 0.4f;
                } else {
                    if (n2 > n4) break;
                    f2 = 0.4f * (1.0f - (float)(n2 - n3) / (float)(n4 - n3));
                }
                fq.a(color, f2);
            }
            ft.a(betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, betterBlockPos2.a, betterBlockPos2.b, betterBlockPos2.c);
            a.b();
            n2 = n5;
        }
        fq.a((Boolean)ft.a.renderPathIgnoreDepth.value);
    }

    private static void a(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = ft.a.h;
        double d9 = ft.a.i;
        double d10 = ft.a.j;
        boolean bl2 = (Boolean)ft.a.renderPathAsLine.value == false;
        a.a(bl2 ? 3 : 1, cdy.e);
        a.b(d2 + 0.5 - d8, d3 + 0.5 - d9, d4 + 0.5 - d10).d();
        a.b(d5 + 0.5 - d8, d6 + 0.5 - d9, d7 + 0.5 - d10).d();
        if (bl2) {
            a.b(d5 + 0.5 - d8, d6 + 0.53 - d9, d7 + 0.5 - d10).d();
            a.b(d2 + 0.5 - d8, d3 + 0.53 - d9, d4 + 0.5 - d10).d();
            a.b(d2 + 0.5 - d8, d3 + 0.5 - d9, d4 + 0.5 - d10).d();
        }
    }

    public static void a(vg vg2, Collection<et> collection, Color object) {
        fq.a((Color)object, ((Float)ft.a.pathRenderLineWidthPixels.value).floatValue(), (Boolean)ft.a.renderSelectionBoxesIgnoreDepth.value);
        object = new fn(BaritoneAPI.getProvider().getPrimaryBaritone().getPlayerContext());
        collection.forEach(arg_0 -> ft.a((fn)object, vg2, arg_0));
        fq.a((Boolean)ft.a.renderSelectionBoxesIgnoreDepth.value);
    }

    private static void a(vg vg2, Goal goal, float f2, Color color) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        block12: {
            double d10;
            double d11;
            double d12;
            double d13;
            while (true) {
                d13 = ft.a.h;
                d12 = ft.a.i;
                d11 = ft.a.j;
                d10 = rk.b((float)((float)((double)((float)(System.nanoTime() / 100000L % 20000L) / 20000.0f) * Math.PI * 2.0)));
                if (goal instanceof IGoalRenderPos) {
                    et et2 = ((IGoalRenderPos)((Object)goal)).getGoalPos();
                    d9 = (double)et2.p() + 0.002 - d13;
                    d8 = (double)(et2.p() + 1) - 0.002 - d13;
                    d7 = (double)et2.r() + 0.002 - d11;
                    d6 = (double)(et2.r() + 1) - 0.002 - d11;
                    if (goal instanceof GoalGetToBlock || goal instanceof GoalTwoBlocks) {
                        d10 /= 2.0;
                    }
                    d5 = d10 + 1.0 + (double)et2.q() - d12;
                    d4 = 1.0 - d10 + (double)et2.q() - d12;
                    d3 = (double)et2.q() - d12;
                    d2 = d3 + 2.0;
                    if (goal instanceof GoalGetToBlock || goal instanceof GoalTwoBlocks) {
                        d5 -= 0.5;
                        d4 -= 0.5;
                        d2 -= 1.0;
                    }
                    break block12;
                }
                if (goal instanceof GoalXZ) {
                    GoalXZ goalXZ = (GoalXZ)goal;
                    if (((Boolean)ft.a.renderGoalXZBeacon.value).booleanValue()) {
                        GL11.glPushAttrib((int)64);
                        Helper.mc.N().a(bwv.a);
                        if (((Boolean)ft.a.renderGoalIgnoreDepth.value).booleanValue()) {
                            bus.j();
                        }
                        bwv.a((double)((double)goalXZ.getX() - d13), (double)(-d12), (double)((double)goalXZ.getZ() - d11), (double)f2, (double)1.0, (double)vg2.l.R(), (int)0, (int)256, (float[])color.getColorComponents(null));
                        if (((Boolean)ft.a.renderGoalIgnoreDepth.value).booleanValue()) {
                            bus.k();
                        }
                        GL11.glPopAttrib();
                        return;
                    }
                    d9 = (double)goalXZ.getX() + 0.002 - d13;
                    d8 = (double)(goalXZ.getX() + 1) - 0.002 - d13;
                    d7 = (double)goalXZ.getZ() + 0.002 - d11;
                    d6 = (double)(goalXZ.getZ() + 1) - 0.002 - d11;
                    d5 = 0.0;
                    d4 = 0.0;
                    d3 = 0.0 - d12;
                    d2 = 256.0 - d12;
                    break block12;
                }
                if (goal instanceof GoalComposite) {
                    for (Goal goal2 : ((GoalComposite)goal).goals()) {
                        ft.a(vg2, goal2, f2, color);
                    }
                    return;
                }
                if (!(goal instanceof GoalInverted)) break;
                color = (Color)ft.a.colorInvertedGoalBox.value;
                goal = ((GoalInverted)goal).origin;
            }
            if (goal instanceof GoalYLevel) {
                GoalYLevel goalYLevel = (GoalYLevel)goal;
                d9 = vg2.p - (Double)ft.a.yLevelBoxSize.value - d13;
                d7 = vg2.r - (Double)ft.a.yLevelBoxSize.value - d11;
                d8 = vg2.p + (Double)ft.a.yLevelBoxSize.value - d13;
                d6 = vg2.r + (Double)ft.a.yLevelBoxSize.value - d11;
                d3 = (double)((GoalYLevel)goal).level - d12;
                d2 = d3 + 2.0;
                d5 = d10 + 1.0 + (double)goalYLevel.level - d12;
                d4 = 1.0 - d10 + (double)goalYLevel.level - d12;
            } else {
                return;
            }
        }
        fq.a(color, ((Float)ft.a.goalRenderLineWidthPixels.value).floatValue(), (Boolean)ft.a.renderGoalIgnoreDepth.value);
        ft.a(d9, d8, d7, d6, d5);
        ft.a(d9, d8, d7, d6, d4);
        a.a(1, cdy.e);
        a.b(d9, d3, d7).d();
        a.b(d9, d2, d7).d();
        a.b(d8, d3, d7).d();
        a.b(d8, d2, d7).d();
        a.b(d8, d3, d6).d();
        a.b(d8, d2, d6).d();
        a.b(d9, d3, d6).d();
        a.b(d9, d2, d6).d();
        a.b();
        fq.a((Boolean)ft.a.renderGoalIgnoreDepth.value);
    }

    private static void a(double d2, double d3, double d4, double d5, double d6) {
        if (d6 != 0.0) {
            a.a(2, cdy.e);
            a.b(d2, d6, d4).d();
            a.b(d3, d6, d4).d();
            a.b(d3, d6, d5).d();
            a.b(d2, d6, d5).d();
            a.b();
        }
    }

    private static /* synthetic */ void a(fn fn2, vg vg2, et et2) {
        fn2 = (fn2 = fn2.a(et2)).u().equals(aox.a) ? aox.d.t().c(vg2.l, et2) : fn2.c(vg2.l, et2);
        fq.a((bhb)fn2, 0.002);
    }
}

