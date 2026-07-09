/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.el;
import baritone.em;
import baritone.fk;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ek
extends fk
implements ICustomGoalProcess {
    private Goal a;
    private int a;

    public ek(a a2) {
        super(a2);
    }

    @Override
    public final void setGoal(Goal goal) {
        this.a = goal;
        if (this.a == em.a) {
            this.a = em.b;
        }
        if (this.a == em.d) {
            this.a = em.c;
        }
    }

    @Override
    public final void path() {
        this.a = em.c;
    }

    @Override
    public final Goal getGoal() {
        return this.a;
    }

    @Override
    public final boolean isActive() {
        return this.a != em.a;
    }

    @Override
    public final PathingCommand onTick(boolean bl2, boolean bl3) {
        switch (el.a[this.a - 1]) {
            case 1: {
                return new PathingCommand(this.a, PathingCommandType.CANCEL_AND_SET_GOAL);
            }
            case 2: {
                PathingCommand pathingCommand = new PathingCommand(this.a, PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH);
                this.a = em.d;
                return pathingCommand;
            }
            case 3: {
                if (bl2) {
                    this.onLostControl();
                    return new PathingCommand(this.a, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                if (this.a == null || this.a.isInGoal(this.a.playerFeet()) && this.a.isInGoal(((a)((Object)this.a)).a.a())) {
                    this.onLostControl();
                    if (((Boolean)baritone.a.a().disconnectOnArrival.value).booleanValue()) {
                        this.a.world().O();
                    }
                    return new PathingCommand(this.a, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                return new PathingCommand(this.a, PathingCommandType.SET_GOAL_AND_PATH);
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final void onLostControl() {
        this.a = em.a;
        this.a = null;
    }

    @Override
    public final String displayName0() {
        return "Custom Goal " + this.a;
    }
}

