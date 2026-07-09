/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.pathing.goals.Goal;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.cj;

public final class fu
extends PathingCommand {
    public final cj a;

    public fu(Goal goal, PathingCommandType pathingCommandType, cj cj2) {
        super(goal, pathingCommandType);
        this.a = cj2;
    }
}

