/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aru
 *  et
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.event.events.PathEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.PathCalculationResult;
import baritone.api.utils.PathCalculationResult$Type;
import baritone.api.utils.interfaces.IGoalRenderPos;
import baritone.b;
import baritone.cg;
import baritone.ch;
import baritone.cj;
import baritone.cl;
import baritone.dw;
import baritone.ft;
import baritone.fu;
import baritone.fv;
import baritone.gi;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j
extends b
implements IPathingBehavior,
Helper {
    public dw a;
    public dw b;
    private Goal a;
    public cj a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    public boolean a;
    private volatile ch a;
    private final Object a;
    private final Object b;
    private boolean g;
    private BetterBlockPos a;
    private final LinkedBlockingQueue<PathEvent> a = new Object();

    public j(a a2) {
        super(a2);
        this.b = new Object();
        this.a = new LinkedBlockingQueue();
    }

    private void a(PathEvent pathEvent) {
        ((AbstractQueue)((Object)this.a)).add(pathEvent);
    }

    private void b() {
        Object object = new ArrayList();
        ((LinkedBlockingQueue)((Object)this.a)).drainTo(object);
        this.a = ((ArrayList)object).contains((Object)PathEvent.CALC_FAILED);
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            PathEvent pathEvent = (PathEvent)((Object)object.next());
            ((a)((Object)this.a)).getGameEventHandler().onPathEvent(pathEvent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void onTick(TickEvent object) {
        block50: {
            this.b();
            if (((TickEvent)object).getType() == TickEvent$Type.OUT) {
                this.c();
                ((a)((Object)this.a)).a.a();
                return;
            }
            this.a = this.a();
            object = ((a)((Object)this.a)).a;
            ((fv)object).a = ((fv)object).b;
            ((fv)object).b = null;
            Object object2 = ((fv)object).a.a;
            ((fv)object).a = ((fv)object).a();
            if (((fv)object).a == null) {
                ((j)object2).b();
                ((j)object2).a = null;
            } else {
                if (!Objects.equals(((fv)object).b, ((fv)object).a) && ((fv)object).a.commandType != PathingCommandType.REQUEST_PAUSE && ((fv)object).a != null && !((fv)object).a.isTemporary()) {
                    ((j)object2).b();
                }
                switch (((fv)object).a.commandType) {
                    case REQUEST_PAUSE: {
                        ((j)object2).c = true;
                        break;
                    }
                    case CANCEL_AND_SET_GOAL: {
                        ((j)object2).a = ((fv)object).a.goal;
                        ((j)object2).b();
                        break;
                    }
                    case FORCE_REVALIDATE_GOAL_AND_PATH: {
                        if (((j)object2).isPathing() || ((j)object2).getInProgress().isPresent()) break;
                        ((j)object2).a(((fv)object).a);
                        break;
                    }
                    case REVALIDATE_GOAL_AND_PATH: {
                        if (((j)object2).isPathing() || ((j)object2).getInProgress().isPresent()) break;
                        ((j)object2).a(((fv)object).a);
                        break;
                    }
                    case SET_GOAL_AND_PATH: {
                        if (((fv)object).a.goal == null) break;
                        ((fv)object).a.a.a(((fv)object).a);
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            object = this;
            this.e = false;
            if (((j)object).c && ((j)object).b) {
                ((j)object).c = false;
                if (((j)object).d) {
                    ((a)((Object)((j)object).a)).a.clearAllKeys();
                    ((a)((Object)((j)object).a)).a.a.a();
                }
                ((j)object).d = false;
                ((j)object).e = true;
            } else {
                ((j)object).d = true;
                if (((j)object).f) {
                    ((j)object).f = false;
                    ((a)((Object)((j)object).a)).a.clearAllKeys();
                }
                object2 = ((j)object).b;
                synchronized (object2) {
                    Object object3 = ((j)object).a;
                    synchronized (object3) {
                        if (((j)object).a != null) {
                            BetterBlockPos betterBlockPos = ((j)object).a.a();
                            Optional<IPath> optional = ((j)object).a.bestPathSoFar();
                            if (!(((j)object).a != null && ((j)object).a.getPath().getDest().equals((Object)betterBlockPos) || betterBlockPos.equals((Object)((j)object).a.playerFeet()) || betterBlockPos.equals((Object)((j)object).a) || optional.isPresent() && (optional.get().positions().contains((Object)((j)object).a.playerFeet()) || optional.get().positions().contains((Object)((j)object).a)))) {
                                ((j)object).a.a();
                            }
                        }
                    }
                    if (((j)object).a == null) {
                        break block50;
                    }
                    ((j)object).b = ((j)object).a.a();
                    if (((j)object).a.a || ((j)object).a.b()) {
                        ((j)object).a = null;
                        if (((j)object).a == null || ((j)object).a.isInGoal(((j)object).a.playerFeet())) {
                            object.logDebug("All done. At " + ((j)object).a);
                            super.a(PathEvent.AT_GOAL);
                            ((j)object).b = null;
                            if (((Boolean)baritone.a.a().disconnectOnArrival.value).booleanValue()) {
                                ((j)object).a.world().O();
                            }
                            break block50;
                        }
                        if (((j)object).b != null && !((j)object).b.getPath().positions().contains((Object)((j)object).a.playerFeet()) && !((j)object).b.getPath().positions().contains((Object)((j)object).a)) {
                            object.logDebug("Discarding next path as it does not contain current position");
                            super.a(PathEvent.DISCARD_NEXT);
                            ((j)object).b = null;
                        }
                        if (((j)object).b != null) {
                            object.logDebug("Continuing on to planned next path");
                            super.a(PathEvent.CONTINUING_ONTO_PLANNED_NEXT);
                            ((j)object).a = ((j)object).b;
                            ((j)object).b = null;
                            ((j)object).a.a();
                            break block50;
                        }
                        object3 = ((j)object).a;
                        synchronized (object3) {
                            if (((j)object).a != null) {
                                super.a(PathEvent.PATH_FINISHED_NEXT_STILL_CALCULATING);
                                break block50;
                            }
                            super.a(PathEvent.CALC_STARTED);
                            Object object4 = object;
                            super.a(((j)object4).a, true, ((j)object).a);
                        }
                    }
                    if (((j)object).b && ((j)object).b != null) {
                        boolean bl2;
                        object3 = ((j)object).b;
                        if (!((dw)object3).a.player().z && !(((dw)object3).a.world().o((et)((dw)object3).a.playerFeet()).u() instanceof aru)) {
                            bl2 = false;
                        } else if (((dw)object3).a.player().t < -0.1) {
                            bl2 = false;
                        } else {
                            int n2 = ((dw)object3).a.positions().indexOf((Object)((dw)object3).a.playerFeet());
                            if (n2 == -1) {
                                bl2 = false;
                            } else {
                                ((dw)object3).a = n2;
                                ((dw)object3).a();
                                bl2 = true;
                            }
                        }
                        if (bl2) {
                            object.logDebug("Splicing into planned next path early...");
                            super.a(PathEvent.SPLICING_ONTO_NEXT_EARLY);
                            ((j)object).a = ((j)object).b;
                            ((j)object).b = null;
                            ((j)object).a.a();
                            break block50;
                        }
                    }
                    if (((Boolean)baritone.a.a().splicePath.value).booleanValue()) {
                        ((j)object).a = ((j)object).a.a(((j)object).b);
                    }
                    if (((j)object).b != null && ((j)object).a.getPath().getDest().equals((Object)((j)object).b.getPath().getDest())) {
                        ((j)object).b = null;
                    }
                    object3 = ((j)object).a;
                    synchronized (object3) {
                        if (((j)object).a != null) {
                            break block50;
                        }
                        if (((j)object).b != null) {
                            break block50;
                        }
                        if (((j)object).a == null || ((j)object).a.isInGoal(((j)object).a.getPath().getDest())) {
                            break block50;
                        }
                        if (object.ticksRemainingInSegment(false).get() < (double)((Integer)baritone.a.a().planningTickLookahead.value).intValue()) {
                            object.logDebug("Path almost over. Planning ahead...");
                            super.a(PathEvent.NEXT_SEGMENT_CALC_STARTED);
                            Object object5 = object;
                            super.a(((j)object5).a.getPath().getDest(), false, ((j)object).a);
                        }
                    }
                }
            }
        }
        this.b();
    }

    @Override
    public final void onPlayerSprintState(SprintStateEvent sprintStateEvent) {
        if (this.isPathing()) {
            sprintStateEvent.setState(this.a.b);
        }
    }

    @Override
    public final void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent) {
        if (this.a != null) {
            switch (playerUpdateEvent.getState()) {
                case PRE: {
                    this.g = j.mc.t.R;
                    j.mc.t.R = false;
                    return;
                }
                case POST: {
                    j.mc.t.R = this.g;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(PathingCommand object) {
        this.a = ((PathingCommand)object).goal;
        this.a = object instanceof fu ? ((fu)object).a : new cj((IBaritone)((Object)this.a), true);
        if (this.a == null) {
            return false;
        }
        if (this.a.isInGoal(this.a.playerFeet()) || this.a.isInGoal(this.a)) {
            return false;
        }
        object = this.b;
        synchronized (object) {
            if (this.a != null) {
                return false;
            }
            Object object2 = this.a;
            synchronized (object2) {
                if (this.a != null) {
                    return false;
                }
                this.a(PathEvent.CALC_STARTED);
                j j2 = this;
                j2.a(j2.a, true, this.a);
                return true;
            }
        }
    }

    @Override
    public final Goal getGoal() {
        return this.a;
    }

    @Override
    public final boolean isPathing() {
        return this.hasPath() && !this.e;
    }

    public final Optional<ch> getInProgress() {
        return Optional.ofNullable(this.a);
    }

    public final boolean a() {
        return this.a == null || this.b;
    }

    private boolean b() {
        if (this.a()) {
            this.c();
            return true;
        }
        return false;
    }

    @Override
    public final boolean cancelEverything() {
        boolean bl2 = this.a();
        if (bl2) {
            this.c();
        }
        ((a)((Object)this.a)).a.a();
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a() {
        Object object = this.b;
        synchronized (object) {
            this.getInProgress().ifPresent(ch::a);
            if (!this.a()) {
                return;
            }
            this.a = null;
            this.b = null;
        }
        this.f = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        this.a(PathEvent.CANCELED);
        Object object = this.b;
        synchronized (object) {
            this.getInProgress().ifPresent(ch::a);
            if (this.a != null) {
                this.a = null;
                this.b = null;
                ((a)((Object)this.a)).a.clearAllKeys();
                ((a)((Object)this.a)).a.a.a();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void forceCancel() {
        this.cancelEverything();
        this.c();
        Object object = this.a;
        synchronized (object) {
            this.a = null;
            return;
        }
    }

    public final BetterBlockPos a() {
        BetterBlockPos betterBlockPos2 = this.a.playerFeet();
        if (!cl.b((IPlayerContext)((Object)this.a), betterBlockPos2.down())) {
            if (this.a.player().z) {
                int n2;
                double d2 = this.a.player().p;
                double d3 = this.a.player().r;
                ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
                for (n2 = -1; n2 <= 1; ++n2) {
                    for (int i2 = -1; i2 <= 1; ++i2) {
                        arrayList.add(new BetterBlockPos(betterBlockPos2.a + n2, betterBlockPos2.b, betterBlockPos2.c + i2));
                    }
                }
                arrayList.sort(Comparator.comparingDouble(betterBlockPos -> ((double)betterBlockPos.a + 0.5 - d2) * ((double)betterBlockPos.a + 0.5 - d2) + ((double)betterBlockPos.c + 0.5 - d3) * ((double)betterBlockPos.c + 0.5 - d3)));
                for (n2 = 0; n2 < 4; ++n2) {
                    BetterBlockPos betterBlockPos3 = (BetterBlockPos)((Object)arrayList.get(n2));
                    double d4 = Math.abs((double)betterBlockPos3.a + 0.5 - d2);
                    double d5 = Math.abs((double)betterBlockPos3.c + 0.5 - d3);
                    if (d4 > 0.8 && d5 > 0.8 || !cl.b((IPlayerContext)((Object)this.a), betterBlockPos3.down()) || !cl.a((IPlayerContext)((Object)this.a), betterBlockPos3) || !cl.a((IPlayerContext)((Object)this.a), betterBlockPos3.up())) continue;
                    return betterBlockPos3;
                }
            } else if (cl.b((IPlayerContext)((Object)this.a), betterBlockPos2.down().down())) {
                return betterBlockPos2.down();
            }
        }
        return betterBlockPos2;
    }

    private void a(et et2, boolean bl2, cj object) {
        long l2;
        long l3;
        if (!Thread.holdsLock(this.a)) {
            throw new IllegalStateException("Must be called with synchronization on pathCalcLock");
        }
        if (this.a != null) {
            throw new IllegalStateException("Already doing it");
        }
        if (!((cj)object).a) {
            throw new IllegalStateException("Improper context thread safety level");
        }
        Goal goal = this.a;
        if (goal == null) {
            this.logDebug("no goal");
            return;
        }
        if (this.a == null) {
            l3 = (Long)baritone.a.a().primaryTimeoutMS.value;
            l2 = (Long)baritone.a.a().failureTimeoutMS.value;
        } else {
            l3 = (Long)baritone.a.a().planAheadPrimaryTimeoutMS.value;
            l2 = (Long)baritone.a.a().planAheadFailureTimeoutMS.value;
        }
        object = j.a(et2, goal, this.a == null ? null : this.a.getPath(), (cj)object);
        if (!Objects.equals(((ch)object).getGoal(), goal)) {
            this.logDebug("Simplifying " + goal.getClass() + " to GoalXZ due to distance");
        }
        this.a = object;
        baritone.a.a().execute(() -> this.a(bl2, et2, goal, (ch)object, l3, l2));
    }

    private static ch a(et et2, Goal object, IPath iPath, cj cj2) {
        Goal goal = object;
        if (((Boolean)baritone.a.a().simplifyUnloadedYCoord.value).booleanValue() && object instanceof IGoalRenderPos && !cj2.a.a((object = ((IGoalRenderPos)object).getGoalPos()).p(), object.r())) {
            goal = new GoalXZ(object.p(), object.r());
        }
        object = new gi(cj2.a.getPlayerContext(), iPath, cj2);
        return new cg(et2.p(), et2.q(), et2.r(), goal, (gi)object, cj2);
    }

    @Override
    public final void onRenderPass(RenderEvent renderEvent) {
        ft.a(renderEvent, this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void a(boolean bl2, et et2, Goal goal, ch object, long l2, long l3) {
        if (bl2) {
            this.logDebug("Starting to search for path from " + et2 + " to " + goal);
        }
        object = ((ch)object).calculate(l2, l3);
        Object object2 = this.b;
        synchronized (object2) {
            Optional<dw> optional = ((PathCalculationResult)object).getPath().map(iPath -> new dw(this, (IPath)iPath));
            if (this.a == null) {
                if (optional.isPresent()) {
                    if (optional.get().getPath().positions().contains((Object)this.a)) {
                        this.a(PathEvent.CALC_FINISHED_NOW_EXECUTING);
                        this.a = optional.get();
                    } else {
                        this.logDebug("Warning: discarding orphan path segment with incorrect start");
                    }
                } else if (((PathCalculationResult)object).getType() != PathCalculationResult$Type.CANCELLATION && ((PathCalculationResult)object).getType() != PathCalculationResult$Type.EXCEPTION) {
                    this.a(PathEvent.CALC_FAILED);
                }
            } else if (this.b == null) {
                if (optional.isPresent()) {
                    if (optional.get().getPath().getSrc().equals((Object)this.a.getPath().getDest())) {
                        this.a(PathEvent.NEXT_SEGMENT_CALC_FINISHED);
                        this.b = optional.get();
                    } else {
                        this.logDebug("Warning: discarding orphan next segment with incorrect start");
                    }
                } else {
                    this.a(PathEvent.NEXT_CALC_FAILED);
                }
            } else {
                this.logDirect("Warning: PathingBehaivor illegal state! Discarding invalid path!");
            }
            if (bl2 && this.a != null && this.a.getPath() != null) {
                if (goal.isInGoal(this.a.getPath().getDest())) {
                    this.logDebug("Finished finding a path from " + et2 + " to " + goal + ". " + this.a.getPath().getNumNodesConsidered() + " nodes considered");
                } else {
                    this.logDebug("Found path segment from " + et2 + " towards " + goal + ". " + this.a.getPath().getNumNodesConsidered() + " nodes considered");
                }
            }
            Object object3 = this.a;
            synchronized (object3) {
                this.a = null;
            }
            return;
        }
    }
}

