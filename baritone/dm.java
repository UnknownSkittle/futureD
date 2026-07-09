/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aox
 *  aqm
 *  awt
 *  et
 *  fa
 *  fq
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cm;
import baritone.cn;
import baritone.fn;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class dm
extends ck {
    private int a = 0;

    public dm(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2, betterBlockPos.up(2), betterBlockPos2.up()}, betterBlockPos2.down());
    }

    @Override
    public final void reset() {
        super.reset();
        this.a = 0;
    }

    @Override
    public final double a(cj cj2) {
        return dm.a(cj2, this.a.a, this.a.b, this.a.c, this.b.a, this.b.c);
    }

    @Override
    public final Set<BetterBlockPos> a() {
        BetterBlockPos betterBlockPos;
        BetterBlockPos betterBlockPos2 = betterBlockPos = new BetterBlockPos(this.a.b((fq)this.getDirection()).a());
        return ImmutableSet.of(this.a, this.a.up(), this.b, betterBlockPos2, betterBlockPos2.up());
    }

    /*
     * Unable to fully structure code
     */
    public static double a(cj var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block13: {
            block12: {
                var6_6 = var0.a(var4_4, var2_2, var5_5);
                var7_7 = 0.0;
                if (!cl.c(var0.a, var4_4, var2_2, var5_5, var6_6)) {
                    var7_7 = var0.a(var4_4, var2_2, var5_5, var6_6);
                    if (v0 >= 1000000.0) {
                        return 1000000.0;
                    }
                    if (!cl.a(var4_4, var5_5, var6_6, var0.a)) {
                        return 1000000.0;
                    }
                    var9_8 = false;
                    for (var10_10 = 0; var10_10 < 5; ++var10_10) {
                        var11_12 = var4_4 + dm.a[var10_10].g();
                        var12_13 = var2_2 + dm.a[var10_10].h();
                        var13_14 = var5_5 + dm.a[var10_10].i();
                        if (var11_12 == var1_1 && var13_14 == var3_3 || !cl.c(var0.a, var11_12, var12_13, var13_14)) continue;
                        var9_8 = true;
                        break;
                    }
                    if (!var9_8) {
                        return 1000000.0;
                    }
                }
                var9_9 = var0.a(var1_1, var2_2 + 2, var3_3);
                if (var0.a(var1_1, var2_2 + 3, var3_3).u() instanceof aqm && (cl.a(var0.a, var1_1, var2_2 + 1, var3_3) || !(var9_9.u() instanceof aqm))) {
                    return 1000000.0;
                }
                var10_11 = var0.a(var1_1, var2_2 - 1, var3_3);
                if (var10_11.u() == aox.au || var10_11.u() == aox.bn) {
                    return 1000000.0;
                }
                var11_12 = (int)cl.a(var10_11);
                var12_13 = (int)cl.a(var6_6);
                if (var11_12 != 0 && var12_13 == 0) {
                    return 1000000.0;
                }
                if (var12_13 == 0) break block12;
                if (var11_12 != 0) ** GOTO lbl-1000
                var13_15 = 4.63284688441047;
                break block13;
            }
            if (var6_6.u() == aox.aW) {
                var13_15 = 9.26569376882094;
            } else lbl-1000:
            // 2 sources

            {
                var13_15 = Math.max(dm.JUMP_ONE_BLOCK_COST, 4.63284688441047);
            }
            var13_15 += var0.e;
        }
        var15_16 = var13_15 + var7_7 + cl.a(var0, var1_1, var2_2 + 2, var3_3, var9_9, false);
        if (v1 >= 1000000.0) {
            return 1000000.0;
        }
        var15_16 += cl.a(var0, var4_4, var2_2 + 1, var5_5, false);
        if (v2 >= 1000000.0) {
            return 1000000.0;
        }
        return var15_16 + cl.a(var0, var4_4, var2_2 + 2, var5_5, true);
    }

    @Override
    public final cn a(cn object) {
        boolean bl2;
        double d2;
        double d3;
        block13: {
            int n2;
            awt awt2;
            if (this.a.playerFeet().b < this.a.b) {
                cn cn2 = object;
                object = MovementStatus.UNREACHABLE;
                cn cn3 = cn2;
                cn2.a = object;
                return cn3;
            }
            super.a((cn)object);
            if (((cn)object).a != MovementStatus.RUNNING) {
                return object;
            }
            if (this.a.playerFeet().equals((Object)this.b) || this.a.playerFeet().equals(this.b.a((fq)this.getDirection().b()))) {
                Object object2 = object;
                object = MovementStatus.SUCCESS;
                Object object3 = object2;
                object2.a = object;
                return object3;
            }
            awt awt3 = awt2 = fn.a((IPlayerContext)this.a, this.c);
            BetterBlockPos betterBlockPos = this.c;
            if (!cl.c(new fn((IPlayerContext)(n2 = this.a++)), betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, awt3)) {
                if (cl.a((cn)object, (IBaritone)this.a, this.b.down(), false, true) == cm.a) {
                    ((cn)object).a(Input.SNEAK, true);
                    if (this.a.player().aU()) {
                        ((cn)object).a(Input.CLICK_RIGHT, true);
                    }
                }
                if (this.a > 10) {
                    ((cn)object).a(Input.MOVE_BACK, true);
                }
                return object;
            }
            cl.a((IPlayerContext)this.a, (cn)object, (et)this.b);
            if (cl.a(awt2) && !cl.a(fn.a((IPlayerContext)this.a, this.a.down()))) {
                return object;
            }
            if (((Boolean)baritone.a.a().assumeStep.value).booleanValue() || this.a.playerFeet().equals((Object)this.a.up())) {
                return object;
            }
            int n3 = Math.abs(this.a.p() - this.b.p());
            int n4 = Math.abs(this.a.r() - this.b.r());
            d3 = (double)n3 * Math.abs((double)this.b.p() + 0.5 - this.a.player().p) + (double)n4 * Math.abs((double)this.b.r() + 0.5 - this.a.player().r);
            d2 = (double)n4 * Math.abs((double)this.b.p() + 0.5 - this.a.player().p) + (double)n3 * Math.abs((double)this.b.r() + 0.5 - this.a.player().r);
            if (Math.abs((double)n3 * this.a.player().u + (double)n4 * this.a.player().s) > 0.1) {
                return object;
            }
            dm dm2 = this;
            betterBlockPos = dm2.a.up(2);
            for (int i2 = 0; i2 < 4; ++i2) {
                BetterBlockPos betterBlockPos2 = betterBlockPos.offset(fa.b((int)i2));
                if (cl.a((IPlayerContext)dm2.a, betterBlockPos2)) continue;
                bl2 = false;
                break block13;
            }
            bl2 = true;
        }
        if (bl2) {
            return ((cn)object).a(Input.JUMP, true);
        }
        if (d3 > 1.2 || d2 > 0.2) {
            return object;
        }
        return ((cn)object).a(Input.JUMP, true);
    }

    @Override
    public final boolean b(cn cn2) {
        return cn2.a != MovementStatus.RUNNING || this.a == 0;
    }
}

