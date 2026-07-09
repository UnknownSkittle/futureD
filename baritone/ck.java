/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ack
 *  aru
 *  bhb
 *  et
 *  fa
 *  fq
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.IMovement;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.cl;
import baritone.cn;
import baritone.co;
import baritone.fn;
import baritone.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ck
implements IMovement,
cl {
    public static final fa[] a = new fa[]{fa.c, fa.d, fa.f, fa.e, fa.a};
    protected final IBaritone a;
    protected final IPlayerContext a;
    private cn a;
    protected final BetterBlockPos a;
    protected final BetterBlockPos b;
    protected final BetterBlockPos[] a;
    protected final BetterBlockPos c;
    public Double a;
    public List<et> a;
    private List<et> c;
    public List<et> b;
    private Set<BetterBlockPos> a;
    private Boolean a;

    protected ck(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos[] betterBlockPosArray, BetterBlockPos betterBlockPos3) {
        MovementStatus movementStatus = MovementStatus.PREPPING;
        cn cn2 = new cn();
        new cn().a = movementStatus;
        this.a = cn2;
        this.a = null;
        this.c = null;
        this.b = null;
        this.a = null;
        this.a = iBaritone;
        this.a = iBaritone.getPlayerContext();
        this.a = betterBlockPos;
        this.b = betterBlockPos2;
        this.a = betterBlockPosArray;
        this.c = betterBlockPos3;
    }

    protected ck(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos[] betterBlockPosArray) {
        this(iBaritone, betterBlockPos, betterBlockPos2, betterBlockPosArray, null);
    }

    @Override
    public double getCost() {
        return this.a;
    }

    public abstract double a(cj var1);

    protected abstract Set<BetterBlockPos> a();

    public final Set<BetterBlockPos> b() {
        if (this.a == null) {
            this.a = this.a();
            Objects.requireNonNull(this.a);
        }
        return this.a;
    }

    protected final boolean a() {
        return this.b().contains((Object)this.a.playerFeet()) || this.b().contains((Object)((j)this.a.getPathingBehavior()).a());
    }

    @Override
    public MovementStatus update() {
        this.a.player().bO.b = false;
        this.a = this.a(this.a);
        if (cl.e(this.a, this.a.playerFeet())) {
            this.a.a(Input.JUMP, true);
        }
        if (this.a.player().aD()) {
            this.a.getSelectedBlock().ifPresent(et2 -> cl.a(this.a, fn.a(this.a, et2)));
            this.a.a(Input.CLICK_LEFT, true);
        }
        Optional.ofNullable(this.a.a.a).ifPresent(rotation -> this.a.getLookBehavior().updateTarget((Rotation)rotation, this.a.a.a));
        this.a.getInputOverrideHandler().clearAllKeys();
        this.a.a.forEach((input, bl2) -> this.a.getInputOverrideHandler().setInputForceState((Input)((Object)input), (boolean)bl2));
        this.a.a.clear();
        if (this.a.a.isComplete()) {
            this.a.getInputOverrideHandler().clearAllKeys();
        }
        return this.a.a;
    }

    protected boolean a(cn cn2) {
        if (cn2.a == MovementStatus.WAITING) {
            return true;
        }
        Object object = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BetterBlockPos betterBlockPos = object[i2];
            if (!this.a.world().a(ack.class, new bhb(0.0, 0.0, 0.0, 1.0, 1.1, 1.0).a((et)betterBlockPos)).isEmpty() && ((Boolean)baritone.a.a().pauseMiningForFallingBlocks.value).booleanValue()) {
                return false;
            }
            if (cl.a(this.a, betterBlockPos) || fn.a(this.a, betterBlockPos) instanceof aru) continue;
            cl.a(this.a, fn.a(this.a, betterBlockPos));
            object = RotationUtils.reachable(this.a.player(), (et)betterBlockPos, this.a.playerController().getBlockReachDistance());
            if (((Optional)object).isPresent()) {
                object = (Rotation)((Optional)object).get();
                cn2.a(new co((Rotation)object, true));
                if (this.a.isLookingAt(betterBlockPos) || this.a.playerRotations().isReallyCloseTo((Rotation)object)) {
                    cn2.a(Input.CLICK_LEFT, true);
                }
                return false;
            }
            cn2.a(new co(RotationUtils.calcRotationFromVec3d(this.a.playerHead(), VecUtils.getBlockPosCenter(betterBlockPos), this.a.playerRotations()), true));
            cn2.a(Input.CLICK_LEFT, true);
            return false;
        }
        return true;
    }

    @Override
    public boolean safeToCancel() {
        ck ck2 = this;
        return ck2.b(ck2.a);
    }

    protected boolean b(cn cn2) {
        return true;
    }

    @Override
    public BetterBlockPos getSrc() {
        return this.a;
    }

    @Override
    public BetterBlockPos getDest() {
        return this.b;
    }

    @Override
    public void reset() {
        MovementStatus movementStatus = MovementStatus.PREPPING;
        cn cn2 = new cn();
        new cn().a = movementStatus;
        this.a = cn2;
    }

    public cn a(cn cn2) {
        if (!this.a(cn2)) {
            MovementStatus movementStatus;
            v0.a = movementStatus = MovementStatus.PREPPING;
            return cn2;
        }
        if (cn2.a == MovementStatus.PREPPING) {
            cn2.a = MovementStatus.WAITING;
        }
        if (cn2.a == MovementStatus.WAITING) {
            cn2.a = MovementStatus.RUNNING;
        }
        return cn2;
    }

    @Override
    public et getDirection() {
        return this.getDest().b((fq)this.getSrc());
    }

    public final void a(cj cj2) {
        this.a = cj2.a.a(this.b.a, this.b.c);
    }

    @Override
    public boolean calculatedWhileLoaded() {
        return this.a;
    }

    @Override
    public void resetBlockCache() {
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public List<et> a(fn fn2) {
        if (this.a != null) {
            return this.a;
        }
        ArrayList<et> arrayList = new ArrayList<et>();
        BetterBlockPos[] betterBlockPosArray = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BetterBlockPos betterBlockPos = betterBlockPosArray[i2];
            if (cl.a(fn2, betterBlockPos.a, betterBlockPos.b, betterBlockPos.c)) continue;
            arrayList.add(betterBlockPos);
        }
        this.a = arrayList;
        return arrayList;
    }

    public final List<et> b(fn fn2) {
        if (this.c != null) {
            return this.c;
        }
        ArrayList<et> arrayList = new ArrayList<et>();
        if (this.c != null && !cl.b(fn2, this.c.a, this.c.b, this.c.c)) {
            arrayList.add(this.c);
        }
        this.c = arrayList;
        return arrayList;
    }

    public List<et> c(fn fn2) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public final et[] a() {
        return this.a;
    }
}

