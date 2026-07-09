/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aec
 *  aip
 *  air
 *  aow
 *  aox
 *  arq
 *  axj
 *  bhe
 *  et
 *  fa
 *  fq
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cn;
import baritone.co;
import baritone.dn;
import baritone.gj;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dq
extends ck {
    private static final aip a = new aip(air.aA);
    private static final aip b = new aip(air.az);

    public dq(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, dq.a(betterBlockPos, betterBlockPos2));
    }

    @Override
    public final double a(cj cj2) {
        gj gj2 = new gj();
        dn.a(cj2, this.a.a, this.a.b, this.a.c, this.b.a, this.b.c, gj2);
        if (gj2.b != this.b.b) {
            return 1000000.0;
        }
        return gj2.a;
    }

    @Override
    public final Set<BetterBlockPos> a() {
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>();
        hashSet.add((BetterBlockPos)this.a);
        for (int i2 = this.a.b - this.b.b; i2 >= 0; --i2) {
            hashSet.add(this.b.up(i2));
        }
        return hashSet;
    }

    @Override
    public final cn a(cn object) {
        fa fa2;
        Rotation rotation;
        Rotation rotation2;
        Object object2;
        block23: {
            gj gj2;
            dq dq2;
            super.a((cn)object);
            if (((cn)object).a != MovementStatus.RUNNING) {
                return object;
            }
            object2 = this.a.playerFeet();
            rotation2 = RotationUtils.calcRotationFromVec3d(this.a.playerHead(), VecUtils.getBlockPosCenter((et)this.b), this.a.playerRotations());
            rotation = null;
            aow aow2 = this.a.world().o((et)this.b).u();
            boolean bl2 = aow2 == aox.j || aow2 == aox.i;
            if (!bl2) {
                dq2 = this;
                cj cj2 = new cj((IBaritone)dq2.a);
                gj2 = new gj();
                if (dn.a(cj2, dq2.a.b, dq2.b.a, dq2.b.c, 0.0, cj2.a(dq2.b.a, dq2.a.b - 2, dq2.b.c), gj2) && !object2.equals(this.b)) {
                    if (!aec.e((int)this.a.player().bv.b(a)) || this.a.world().s.n()) {
                        Object object3 = object;
                        object = MovementStatus.UNREACHABLE;
                        object2 = object3;
                        ((cn)object3).a = object;
                        return object2;
                    }
                    if (this.a.player().q - (double)this.b.q() < this.a.playerController().getBlockReachDistance() && !this.a.player().z) {
                        this.a.player().bv.d = this.a.player().bv.b(a);
                        rotation = new Rotation(rotation2.getYaw(), 90.0f);
                        if (this.a.isLookingAt((et)this.b) || this.a.isLookingAt(this.b.down())) {
                            ((cn)object).a(Input.CLICK_RIGHT, true);
                        }
                    }
                }
            }
            if (rotation != null) {
                ((cn)object).a(new co(rotation, true));
            } else {
                ((cn)object).a(new co(rotation2, false));
            }
            if (object2.equals(this.b) && (this.a.player().q - (double)object2.q() < 0.094 || bl2)) {
                if (bl2) {
                    if (aec.e((int)this.a.player().bv.b(b))) {
                        this.a.player().bv.d = this.a.player().bv.b(b);
                        if (this.a.player().t >= 0.0) {
                            return ((cn)object).a(Input.CLICK_RIGHT, true);
                        }
                        return object;
                    }
                    if (this.a.player().t >= 0.0) {
                        Object object4 = object;
                        object = MovementStatus.SUCCESS;
                        object2 = object4;
                        ((cn)object4).a = object;
                        return object2;
                    }
                } else {
                    cn cn2 = object;
                    object = MovementStatus.SUCCESS;
                    object2 = cn2;
                    cn2.a = object;
                    return object2;
                }
            }
            object2 = VecUtils.getBlockPosCenter((et)this.b);
            if (Math.abs(this.a.player().p + this.a.player().s - ((bhe)object2).b) > 0.1 || Math.abs(this.a.player().r + this.a.player().u - ((bhe)object2).d) > 0.1) {
                if (!this.a.player().z && Math.abs(this.a.player().t) > 0.4) {
                    ((cn)object).a(Input.SNEAK, true);
                }
                ((cn)object).a(Input.MOVE_FORWARD, true);
            }
            dq2 = this;
            for (int i2 = 0; i2 < 15; ++i2) {
                gj2 = dq2.a.world().o((et)dq2.a.playerFeet().down(i2));
                if (gj2.u() != aox.au) continue;
                fa2 = (fa)gj2.c((axj)arq.a);
                break block23;
            }
            fa2 = null;
        }
        rotation2 = Optional.ofNullable(fa2).map(fa::n).orElse(null);
        if (rotation2 == null) {
            rotation2 = this.a.b((fq)this.b);
        } else if (Math.abs((double)rotation2.p() * (((bhe)object2).b - (double)rotation2.p() / 2.0 - this.a.player().p)) + Math.abs((double)rotation2.r() * (((bhe)object2).d - (double)rotation2.r() / 2.0 - this.a.player().r)) < 0.6) {
            ((cn)object).a(Input.MOVE_FORWARD, true);
        } else if (!this.a.player().z) {
            ((cn)object).a(Input.SNEAK, false);
        }
        if (rotation == null) {
            object2 = new bhe(((bhe)object2).b + 0.125 * (double)rotation2.p(), ((bhe)object2).c, ((bhe)object2).d + 0.125 * (double)rotation2.r());
            ((cn)object).a(new co(RotationUtils.calcRotationFromVec3d(this.a.playerHead(), (bhe)object2, this.a.playerRotations()), false));
        }
        return object;
    }

    @Override
    public final boolean b(cn cn2) {
        return this.a.playerFeet().equals(this.a) || cn2.a != MovementStatus.RUNNING;
    }

    private static BetterBlockPos[] a(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPosArray) {
        int n2 = betterBlockPos.p() - betterBlockPosArray.p();
        int n3 = betterBlockPos.r() - betterBlockPosArray.r();
        betterBlockPosArray = new BetterBlockPos[betterBlockPos.q() - betterBlockPosArray.q() + 2];
        for (int i2 = 0; i2 < betterBlockPosArray.length; ++i2) {
            betterBlockPosArray[i2] = new BetterBlockPos(betterBlockPos.p() - n2, betterBlockPos.q() + 1 - i2, betterBlockPos.r() - n3);
        }
        return betterBlockPosArray;
    }

    @Override
    public final boolean a(cn cn2) {
        if (cn2.a == MovementStatus.WAITING) {
            return true;
        }
        for (int i2 = 0; i2 < 4 && i2 < ((aip)this.a).length; ++i2) {
            if (cl.a((IPlayerContext)this.a, (BetterBlockPos)this.a[i2])) continue;
            return super.a(cn2);
        }
        return true;
    }
}

