/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 *  vg
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.pathing.goals.GoalBlock;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class ap
extends Command {
    public ap(IBaritone iBaritone) {
        super(iBaritone, "come");
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        string = mc.aa();
        if (string == null) {
            throw new CommandInvalidStateException("render view entity is null");
        }
        this.baritone.getCustomGoalProcess().setGoalAndPath(new GoalBlock(new et((vg)string)));
        this.logDirect("Coming");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Start heading towards your camera";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The come command tells Baritone to head towards your camera.", "", "This can be useful in hacked clients where freecam doesn't move your player position.", "", "Usage:", "> come");
    }
}

