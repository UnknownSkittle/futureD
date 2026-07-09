/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  hg
 *  hg$a
 *  hh
 *  hj
 *  hj$a
 *  ho
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypoint$Tag;
import baritone.api.cache.Waypoint;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForWaypoints;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.helpers.Paginator;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.cc;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public final class cb
extends Command {
    public cb(IBaritone iBaritone) {
        super(iBaritone, "waypoints", "waypoint", "wp");
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        cc cc3 = iArgConsumer.hasAny() ? cc.a(iArgConsumer.getString()) : cc.a;
        if (cc3 == null) {
            throw new CommandInvalidTypeException(iArgConsumer.consumed(), "an action");
        }
        Object object = (iWaypoint, cc2) -> {
            ho ho2 = new ho("");
            ho ho3 = new ho(iWaypoint.getTag().name() + " ");
            ho3.b().a(a.h);
            String string2 = iWaypoint.getName();
            ho ho4 = new ho(!string2.isEmpty() ? string2 : "<empty>");
            ho4.b().a(!string2.isEmpty() ? a.h : a.i);
            string2 = new ho(" @ " + new Date(iWaypoint.getCreationTimestamp()));
            string2.b().a(a.i);
            ho2.a((hh)ho3);
            ho2.a((hh)ho4);
            ho2.a((hh)string2);
            ho2.b().a(new hj(hj.a.a, (hh)new ho("Click to select"))).a(new hg(hg.a.c, String.format("%s%s %s %s @ %d", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, cc.a(cc2)[0], iWaypoint.getTag().getName(), iWaypoint.getCreationTimestamp())));
            return ho2;
        };
        Function<IWaypoint, hh> function = iWaypoint -> (hh)object.apply(iWaypoint, cc3 == cc.a ? cc.d : cc3);
        if (cc3 == cc.a) {
            IWaypoint[] iWaypointArray;
            IWaypoint$Tag iWaypoint$Tag = iArgConsumer.hasAny() ? IWaypoint$Tag.getByName(iArgConsumer.peekString()) : null;
            if (iWaypoint$Tag != null) {
                iArgConsumer.get();
            }
            if ((iWaypointArray = iWaypoint$Tag != null ? ForWaypoints.getWaypointsByTag(this.baritone, iWaypoint$Tag) : ForWaypoints.getWaypoints(this.baritone)).length > 0) {
                iArgConsumer.requireMax(1);
                Paginator.paginate(iArgConsumer, iWaypointArray, () -> this.logDirect(iWaypoint$Tag != null ? String.format("All waypoints by tag %s:", iWaypoint$Tag.name()) : "All waypoints:"), function, String.format("%s%s %s%s", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, cc.a(cc3)[0], iWaypoint$Tag != null ? " " + iWaypoint$Tag.getName() : ""));
                return;
            }
            iArgConsumer.requireMax(0);
            throw new CommandInvalidStateException(iWaypoint$Tag != null ? "No waypoints found by that tag" : "No waypoints found");
        }
        if (cc3 == cc.c) {
            IWaypoint$Tag iWaypoint$Tag = IWaypoint$Tag.getByName(iArgConsumer.getString());
            if (iWaypoint$Tag == null) {
                throw new CommandInvalidStateException(String.format("'%s' is not a tag ", iArgConsumer.consumedString()));
            }
            String string2 = iArgConsumer.hasAny() ? iArgConsumer.getString() : "";
            BetterBlockPos betterBlockPos = iArgConsumer.hasAny() ? (BetterBlockPos)((Object)iArgConsumer.getDatatypePost(RelativeBlockPos.INSTANCE, this.ctx.playerFeet())) : this.ctx.playerFeet();
            iArgConsumer.requireMax(0);
            Waypoint waypoint = new Waypoint(string2, iWaypoint$Tag, betterBlockPos);
            ForWaypoints.waypoints(this.baritone).addWaypoint(waypoint);
            ho ho2 = new ho("Waypoint added: ");
            ho2.b().a(a.h);
            ho2.a((hh)object.apply(waypoint, cc.d));
            this.logDirect(new hh[]{ho2});
            return;
        }
        if (cc3 == cc.b) {
            IWaypoint[] iWaypointArray;
            iArgConsumer.requireMax(1);
            IWaypoint$Tag iWaypoint$Tag = IWaypoint$Tag.getByName(iArgConsumer.getString());
            IWaypoint[] iWaypointArray2 = iWaypointArray = ForWaypoints.getWaypointsByTag(this.baritone, iWaypoint$Tag);
            int n2 = iWaypointArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = iWaypointArray2[i2];
                ForWaypoints.waypoints(this.baritone).removeWaypoint((IWaypoint)object);
            }
            this.logDirect(String.format("Cleared %d waypoints", iWaypointArray.length));
            return;
        }
        ho ho3 = (ho)iArgConsumer.getDatatypeFor(ForWaypoints.INSTANCE);
        IWaypoint iWaypoint2 = null;
        if (iArgConsumer.hasAny() && iArgConsumer.peekString().equals("@")) {
            iArgConsumer.requireExactly(2);
            iArgConsumer.get();
            long l2 = iArgConsumer.getAs(Long.class);
            for (IWaypoint iWaypoint3 : ho3) {
                if (iWaypoint3.getCreationTimestamp() != l2) continue;
                iWaypoint2 = iWaypoint3;
                break;
            }
            if (iWaypoint2 == null) {
                throw new CommandInvalidStateException("Timestamp was specified but no waypoint was found");
            }
        } else {
            switch (((IWaypoint[])ho3).length) {
                case 0: {
                    throw new CommandInvalidStateException("No waypoints found");
                }
                case 1: {
                    iWaypoint2 = ho3[0];
                }
            }
        }
        if (iWaypoint2 == null) {
            iArgConsumer.requireMax(1);
            Paginator.paginate(iArgConsumer, ho3, () -> this.logDirect("Multiple waypoints were found:"), function, String.format("%s%s %s %s", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, cc.a(cc3)[0], iArgConsumer.consumedString()));
            return;
        }
        if (cc3 == cc.d) {
            this.logDirect(function.apply(iWaypoint2));
            this.logDirect(String.format("Position: %s", new Object[]{iWaypoint2.getLocation()}));
            ho ho4 = new ho("Click to delete this waypoint");
            ho4.b().a(new hg(hg.a.c, String.format("%s%s delete %s @ %d", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, iWaypoint2.getTag().getName(), iWaypoint2.getCreationTimestamp())));
            ho ho5 = new ho("Click to set goal to this waypoint");
            ho5.b().a(new hg(hg.a.c, String.format("%s%s goal %s @ %d", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, iWaypoint2.getTag().getName(), iWaypoint2.getCreationTimestamp())));
            ho ho6 = new ho("Click to return to the waypoints list");
            ho6.b().a(new hg(hg.a.c, String.format("%s%s list", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string)));
            this.logDirect(new hh[]{ho4});
            this.logDirect(new hh[]{ho5});
            this.logDirect(new hh[]{ho6});
            return;
        }
        if (cc3 == cc.e) {
            ForWaypoints.waypoints(this.baritone).removeWaypoint(iWaypoint2);
            this.logDirect("That waypoint has successfully been deleted");
            return;
        }
        if (cc3 == cc.f) {
            GoalBlock goalBlock = new GoalBlock(iWaypoint2.getLocation());
            this.baritone.getCustomGoalProcess().setGoal(goalBlock);
            this.logDirect(String.format("Goal: %s", goalBlock));
        }
    }

    @Override
    public final Stream<String> tabComplete(String object, IArgConsumer iArgConsumer) {
        if (iArgConsumer.hasAny()) {
            if (iArgConsumer.hasExactlyOne()) {
                return new TabCompleteHelper().append(cc.a()).sortAlphabetically().filterPrefix(iArgConsumer.getString()).stream();
            }
            object = cc.a(iArgConsumer.getString());
            if (iArgConsumer.hasExactlyOne()) {
                if (object == cc.a || object == cc.c || object == cc.b) {
                    return new TabCompleteHelper().append(IWaypoint$Tag.getAllNames()).sortAlphabetically().filterPrefix(iArgConsumer.getString()).stream();
                }
                return iArgConsumer.tabCompleteDatatype(ForWaypoints.INSTANCE);
            }
            if (iArgConsumer.has(3) && object == cc.c) {
                iArgConsumer.get();
                iArgConsumer.get();
                return iArgConsumer.tabCompleteDatatype(RelativeBlockPos.INSTANCE);
            }
        }
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Manage waypoints";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The waypoint command allows you to manage Baritone's waypoints.", "", "Waypoints can be used to mark positions for later. Waypoints are each given a tag and an optional name.", "", "Note that the info, delete, and goal commands let you specify a waypoint by tag. If there is more than one waypoint with a certain tag, then they will let you select which waypoint you mean.", "", "Usage:", "> wp [l/list] - List all waypoints.", "> wp <s/save> <tag> - Save your current position as an unnamed waypoint with the specified tag.", "> wp <s/save> <tag> <name> - Save the waypoint with the specified name.", "> wp <s/save> <tag> <name> <pos> - Save the waypoint with the specified name and position.", "> wp <i/info/show> <tag> - Show info on a waypoint by tag.", "> wp <d/delete> <tag> - Delete a waypoint by tag.", "> wp <g/goal/goto> <tag> - Set a goal to a waypoint by tag.");
    }
}

