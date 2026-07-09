/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  aow
 *  aox
 *  aqa
 *  aqb
 *  aqb$b
 *  aqh
 *  aqm
 *  aqp
 *  arf
 *  arf$a
 *  arm
 *  aru
 *  asa
 *  att
 *  atw
 *  aud
 *  aur
 *  auy
 *  awt
 *  axf
 *  axj
 *  bhc
 *  bhc$a
 *  bhe
 *  et
 *  fa
 *  fa$a
 *  vg
 */
package baritone;

import baritone.a;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.ActionCosts;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cm;
import baritone.cn;
import baritone.co;
import baritone.fn;
import baritone.fz;
import java.util.List;
import java.util.Optional;

public interface cl
extends ActionCosts,
Helper {
    public static boolean a(fn fn2, int n2, int n3, int n4, awt awt2) {
        return (awt2 = awt2.u()) == aox.aI || awt2 instanceof asa || cl.a(fn2, n2, n3 + 1, n4, true) || cl.a(fn2, n2 + 1, n3, n4, false) || cl.a(fn2, n2 - 1, n3, n4, false) || cl.a(fn2, n2, n3, n4 + 1, false) || cl.a(fn2, n2, n3, n4 - 1, false);
    }

    public static boolean a(fn fn2, int n2, int n3, int n4, boolean bl2) {
        aow aow2 = fn2.a(n2, n3, n4).u();
        if (!bl2 && aow2 instanceof aqm && ((Boolean)a.a().avoidUpdatingFallingBlocks.value).booleanValue() && aqm.x((awt)fn2.a(n2, n3 - 1, n4))) {
            return true;
        }
        return aow2 instanceof aru;
    }

    public static boolean a(IPlayerContext iPlayerContext, BetterBlockPos betterBlockPos) {
        return cl.a(new fn(iPlayerContext), betterBlockPos.a, betterBlockPos.b, betterBlockPos.c);
    }

    public static boolean a(fn fn2, int n2, int n3, int n4) {
        return cl.b(fn2, n2, n3, n4, fn2.a(n2, n3, n4));
    }

    public static boolean b(fn fn2, int n2, int n3, int n4, awt awt2) {
        aow aow2 = awt2.u();
        if (aow2 == aox.a) {
            return true;
        }
        if (aow2 == aox.ab || aow2 == aox.bS || aow2 == aox.G || aow2 == aox.bF || aow2 == aox.bN || aow2 instanceof att || aow2 instanceof aur || aow2 == aox.cQ) {
            return false;
        }
        if (((List)a.a().blocksToAvoid.value).contains(aow2)) {
            return false;
        }
        if (aow2 instanceof aqa || aow2 instanceof aqp) {
            return aow2 != aox.aA;
        }
        if (aow2 == aox.cy) {
            return cl.b(fn2, n2, n3 - 1, n4);
        }
        if (aow2 instanceof atw) {
            if (!fn2.a(n2, n4)) {
                return true;
            }
            if ((Integer)awt2.c((axj)atw.a) >= 3) {
                return false;
            }
            return cl.b(fn2, n2, n3 - 1, n4);
        }
        if (cl.a(n2, n3, n4, awt2, fn2)) {
            return false;
        }
        if (aow2 instanceof aru) {
            if (((Boolean)a.a().assumeWalkOnWater.value).booleanValue()) {
                return false;
            }
            if ((fn2 = fn2.a(n2, n3 + 1, n4)).u() instanceof aru || fn2.u() instanceof auy) {
                return false;
            }
            return aow2 == aox.j || aow2 == aox.i;
        }
        return aow2.b(fn2.b, (et)fn2.a.c(n2, n3, n4));
    }

    public static boolean a(cj cj2, int n2, int n3, int n4) {
        return cl.a(cj2.a.b, (et)cj2.a.a.c(n2, n3, n4), cj2.a.a(n2, n3, n4));
    }

    public static boolean a(IPlayerContext iPlayerContext, et et2) {
        return cl.a((amy)iPlayerContext.world(), et2, iPlayerContext.world().o(et2));
    }

    public static boolean a(amy amy2, et et2, awt awt2) {
        if ((awt2 = awt2.u()) == aox.a) {
            return true;
        }
        if (awt2 == aox.ab || awt2 == aox.bS || awt2 == aox.G || awt2 == aox.bn || awt2 == aox.au || awt2 == aox.bN || awt2 instanceof aqa || awt2 instanceof aqp || awt2 instanceof atw || awt2 instanceof aru || awt2 instanceof aur || awt2 instanceof aqh || awt2 instanceof att) {
            return false;
        }
        return awt2.b(amy2, et2);
    }

    public static boolean a(int n2, int n3, awt awt2, fn fn2) {
        aow aow2 = awt2.u();
        if (aow2 == aox.a || cl.b(aow2)) {
            return true;
        }
        if (aow2 instanceof atw) {
            if (!fn2.a(n2, n3)) {
                return true;
            }
            return (Integer)awt2.c((axj)atw.a) == 1;
        }
        if (aow2 instanceof aqb) {
            aqb.b b2 = (aqb.b)awt2.c((axj)aqb.a);
            return b2 == aqb.b.d || b2 == aqb.b.c;
        }
        return awt2.a().j();
    }

    public static boolean a(IPlayerContext iPlayerContext, et object, et et2) {
        if (et2.equals(object)) {
            return false;
        }
        if (!((iPlayerContext = fn.a(iPlayerContext, object)).u() instanceof aqa)) {
            return true;
        }
        et et3 = object;
        axf axf2 = aqa.b;
        object = iPlayerContext;
        iPlayerContext = et3;
        if (!et2.equals((Object)iPlayerContext)) {
            fa.a a2 = ((fa)object.c((axj)arm.D)).k();
            boolean bl2 = (Boolean)object.c((axj)axf2);
            if (et2.c().equals((Object)iPlayerContext) || et2.d().equals((Object)iPlayerContext)) {
                iPlayerContext = fa.a.c;
            } else if (et2.f().equals((Object)iPlayerContext) || et2.e().equals((Object)iPlayerContext)) {
                iPlayerContext = fa.a.a;
            } else {
                return true;
            }
            if (a2 == iPlayerContext == bl2) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(IPlayerContext iPlayerContext, et et2, et et3) {
        if (et3.equals((Object)et2)) {
            return false;
        }
        if (!((iPlayerContext = fn.a(iPlayerContext, et2)).u() instanceof aqp)) {
            return true;
        }
        return (Boolean)iPlayerContext.c((axj)aqp.a);
    }

    public static boolean a(aow aow2) {
        return aow2 instanceof aru || aow2 == aox.df || aow2 == aox.aK || aow2 == aox.ab || aow2 == aox.bF || aow2 == aox.G;
    }

    public static boolean c(fn fn2, int n2, int n3, int n4, awt awt2) {
        aow aow2 = awt2.u();
        if (aow2 == aox.a || aow2 == aox.df) {
            return false;
        }
        if (awt2.k()) {
            return true;
        }
        if (aow2 == aox.au || aow2 == aox.bn && ((Boolean)a.a().allowVines.value).booleanValue()) {
            return true;
        }
        if (aow2 == aox.ak || aow2 == aox.da) {
            return true;
        }
        if (aow2 == aox.bQ || aow2 == aox.ae || aow2 == aox.cg) {
            return true;
        }
        if (cl.b(aow2)) {
            aow aow3 = fn2.a(n2, n3 + 1, n4).u();
            if (aow3 == aox.bx || aow3 == aox.cy) {
                return true;
            }
            if (cl.a(n2, n3, n4, awt2, fn2) || aow2 == aox.i) {
                return cl.b(aow3) && (Boolean)a.a().assumeWalkOnWater.value == false;
            }
            return cl.b(aow3) ^ (Boolean)a.a().assumeWalkOnWater.value;
        }
        if (((Boolean)a.a().assumeWalkOnLava.value).booleanValue() && cl.c(aow2) && !cl.a(n2, n3, n4, awt2, fn2)) {
            return true;
        }
        if (aow2 == aox.w || aow2 == aox.cG) {
            return true;
        }
        if (aow2 instanceof arf) {
            if (!((Boolean)a.a().allowWalkOnBottomSlab.value).booleanValue()) {
                if (((arf)aow2).e()) {
                    return true;
                }
                return awt2.c((axj)arf.a) != arf.a.b;
            }
            return true;
        }
        return aow2 instanceof aud;
    }

    public static boolean b(IPlayerContext iPlayerContext, et et2) {
        return cl.b(new fn(iPlayerContext), et2.p(), et2.q(), et2.r());
    }

    public static boolean b(IPlayerContext iPlayerContext, BetterBlockPos betterBlockPos) {
        return cl.b(new fn(iPlayerContext), betterBlockPos.a, betterBlockPos.b, betterBlockPos.c);
    }

    public static boolean b(fn fn2, int n2, int n3, int n4) {
        return cl.c(fn2, n2, n3, n4, fn2.a(n2, n3, n4));
    }

    public static boolean c(fn fn2, int n2, int n3, int n4) {
        return (fn2 = fn2.a(n2, n3, n4)).k() || fn2.b() || fn2.u() == aox.w || fn2.u() == aox.cG;
    }

    public static boolean c(IPlayerContext iPlayerContext, et et2) {
        return cl.c(new fn(iPlayerContext), et2.p(), et2.q(), et2.r());
    }

    public static double a(cj cj2, int n2, int n3, int n4, boolean bl2) {
        return cl.a(cj2, n2, n3, n4, cj2.a(n2, n3, n4), bl2);
    }

    public static double a(cj cj2, int n2, int n3, int n4, awt awt2, boolean bl2) {
        aow aow2 = awt2.u();
        if (!cl.b(cj2.a, n2, n3, n4, awt2)) {
            double d2;
            double d3;
            if (aow2 instanceof aru) {
                return 1000000.0;
            }
            double d4 = cj2.b(n2, n3, n4, awt2);
            if (d3 >= 1000000.0) {
                return 1000000.0;
            }
            if (cl.a(cj2.a, n2, n3, n4, awt2)) {
                return 1000000.0;
            }
            double d5 = cj2.a.a(awt2);
            if (d2 <= 0.0) {
                return 1000000.0;
            }
            double d6 = (1.0 / d5 + cj2.c) * d4;
            if (bl2 && (awt2 = cj2.a(n2, n3 + 1, n4)).u() instanceof aqm) {
                d6 += cl.a(cj2, n2, n3 + 1, n4, awt2, true);
            }
            return d6;
        }
        return 0.0;
    }

    public static boolean a(awt awt2) {
        return awt2.u() instanceof arf && !((arf)awt2.u()).e() && awt2.c((axj)arf.a) == arf.a.b;
    }

    public static void a(IPlayerContext iPlayerContext, awt awt2) {
        cl.a(iPlayerContext, awt2, new fz(iPlayerContext.player()), (Boolean)BaritoneAPI.getSettings().preferSilkTouch.value);
    }

    public static void a(IPlayerContext iPlayerContext, awt awt2, fz fz2, boolean bl2) {
        iPlayerContext.player().bv.d = fz2.a(awt2.u(), bl2);
    }

    public static void a(IPlayerContext iPlayerContext, cn cn2, et et2) {
        cn2.a(new co(new Rotation(RotationUtils.calcRotationFromVec3d(iPlayerContext.playerHead(), VecUtils.getBlockPosCenter(et2), iPlayerContext.playerRotations()).getYaw(), iPlayerContext.player().w), false)).a(Input.MOVE_FORWARD, true);
    }

    public static boolean b(aow aow2) {
        return aow2 == aox.i || aow2 == aox.j;
    }

    public static boolean d(IPlayerContext iPlayerContext, et et2) {
        return cl.b(fn.a(iPlayerContext, et2));
    }

    public static boolean c(aow aow2) {
        return aow2 == aox.k || aow2 == aox.l;
    }

    public static boolean e(IPlayerContext iPlayerContext, et et2) {
        return fn.a(iPlayerContext, et2) instanceof aru;
    }

    public static boolean b(awt awt2) {
        return awt2.u() instanceof aru && (Integer)awt2.c((axj)aru.b) != 0;
    }

    public static boolean a(int n2, int n3, int n4, awt awt2, fn fn2) {
        if (!(awt2.u() instanceof aru)) {
            return false;
        }
        if ((Integer)awt2.c((axj)aru.b) != 0) {
            return true;
        }
        return cl.b(fn2.a(n2 + 1, n3, n4)) || cl.b(fn2.a(n2 - 1, n3, n4)) || cl.b(fn2.a(n2, n3, n4 + 1)) || cl.b(fn2.a(n2, n3, n4 - 1));
    }

    public static int a(cn cn2, IBaritone iBaritone, et et2, boolean bl2, boolean bl3) {
        et et3;
        IPlayerContext iPlayerContext = iBaritone.getPlayerContext();
        Optional<Rotation> optional = RotationUtils.reachable(iPlayerContext, et2, bl3);
        boolean bl4 = false;
        if (optional.isPresent()) {
            cn2.a(new co(optional.get(), true));
            bl4 = true;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            et3 = et2.a(ck.a[i2]);
            if (!cl.c(iPlayerContext, et3)) continue;
            if (!((a)iBaritone).a.a(false, et2.p(), et2.q(), et2.r())) {
                Helper.HELPER.logDebug("bb pls get me some blocks. dirt, netherrack, cobble");
                cn2.a = MovementStatus.UNREACHABLE;
                return cm.c;
            }
            double d2 = ((double)(et2.p() + et3.p()) + 1.0) * 0.5;
            double d3 = ((double)(et2.q() + et3.q()) + 0.5) * 0.5;
            double d4 = ((double)(et2.r() + et3.r()) + 1.0) * 0.5;
            Rotation rotation = RotationUtils.calcRotationFromVec3d(bl3 ? RayTraceUtils.inferSneakingEyePosition((vg)iPlayerContext.player()) : iPlayerContext.playerHead(), new bhe(d2, d3, d4), iPlayerContext.playerRotations());
            bhc bhc2 = RayTraceUtils.rayTraceTowards((vg)iPlayerContext.player(), rotation, iPlayerContext.playerController().getBlockReachDistance(), bl3);
            if (bhc2 == null || bhc2.a != bhc.a.b || !bhc2.a().equals((Object)et3) || !bhc2.a().a(bhc2.b).equals((Object)et2)) continue;
            cn2.a(new co(rotation, true));
            bl4 = true;
            if (!bl2) break;
        }
        if (iPlayerContext.getSelectedBlock().isPresent()) {
            et et4 = iPlayerContext.getSelectedBlock().get();
            et3 = iPlayerContext.objectMouseOver().b;
            if (et4.equals((Object)et2) || cl.c(iPlayerContext, et4) && et4.a((fa)et3).equals((Object)et2)) {
                if (bl3) {
                    cn2.a(Input.SNEAK, true);
                }
                ((a)iBaritone).a.a(true, et2.p(), et2.q(), et2.r());
                return cm.a;
            }
        }
        if (bl4) {
            if (bl3) {
                cn2.a(Input.SNEAK, true);
            }
            ((a)iBaritone).a.a(true, et2.p(), et2.q(), et2.r());
            return cm.b;
        }
        return cm.c;
    }
}

