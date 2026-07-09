/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aox
 *  et
 *  fa
 *  fq
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForBlockOptionalMeta;
import baritone.api.command.datatypes.ForEnumFacing;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.schematic.CompositeSchematic;
import baritone.api.schematic.FillSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.ReplaceSchematic;
import baritone.api.schematic.ShellSchematic;
import baritone.api.schematic.WallsSchematic;
import baritone.api.selection.ISelection;
import baritone.api.selection.ISelectionManager;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.bt;
import baritone.bu;
import baritone.bv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bs
extends Command {
    private ISelectionManager a;
    private BetterBlockPos a;

    public bs(IBaritone iBaritone) {
        super(iBaritone, "sel", "selection", "s");
        this.a = this.baritone.getSelectionManager();
        this.a = null;
        iBaritone.getGameEventHandler().registerEventListener(new bt(this));
    }

    @Override
    public final void execute(String object, IArgConsumer object2) {
        object = bu.a(object2.getString());
        if (object == null) {
            throw new CommandInvalidTypeException(object2.consumed(), "an action");
        }
        if (object == bu.a || object == bu.b) {
            if (object == bu.b && this.a == null) {
                throw new CommandInvalidStateException("Set pos1 first before using pos2");
            }
            BetterBlockPos betterBlockPos = mc.aa() != null ? BetterBlockPos.from(new et(mc.aa())) : this.ctx.playerFeet();
            BetterBlockPos betterBlockPos2 = object2.hasAny() ? (BetterBlockPos)((Object)object2.getDatatypePost(RelativeBlockPos.INSTANCE, betterBlockPos)) : betterBlockPos;
            object2.requireMax(0);
            if (object == bu.a) {
                this.a = betterBlockPos2;
                this.logDirect("Position 1 has been set");
                return;
            }
            this.a.addSelection(this.a, betterBlockPos2);
            this.a = null;
            this.logDirect("Selection added");
            return;
        }
        if (object == bu.c) {
            object2.requireMax(0);
            this.a = null;
            this.logDirect(String.format("Removed %d selections", this.a.removeAllSelections().length));
            return;
        }
        if (object == bu.d) {
            object2.requireMax(0);
            if (this.a != null) {
                this.a = null;
                this.logDirect("Undid pos1");
                return;
            }
            ISelection[] iSelectionArray = this.a.getSelections();
            if (iSelectionArray.length <= 0) {
                throw new CommandInvalidStateException("Nothing to undo!");
            }
            this.a = this.a.removeSelection(iSelectionArray[iSelectionArray.length - 1]).pos1();
            this.logDirect("Undid pos2");
            return;
        }
        if (object == bu.e || object == bu.f || object == bu.g || object == bu.h || object == bu.i) {
            BetterBlockPos betterBlockPos;
            int n2;
            Object object3;
            BlockOptionalMeta blockOptionalMeta = object == bu.h ? new BlockOptionalMeta(aox.a) : (BlockOptionalMeta)object2.getDatatypeFor(ForBlockOptionalMeta.INSTANCE);
            BlockOptionalMetaLookup blockOptionalMetaLookup = null;
            if (object == bu.i) {
                object2.requireMin(1);
                object3 = new ArrayList();
                object3.add(blockOptionalMeta);
                while (object2.has(2)) {
                    object3.add(object2.getDatatypeFor(ForBlockOptionalMeta.INSTANCE));
                }
                blockOptionalMeta = (BlockOptionalMeta)object2.getDatatypeFor(ForBlockOptionalMeta.INSTANCE);
                blockOptionalMetaLookup = new BlockOptionalMetaLookup(object3.toArray(new BlockOptionalMeta[0]));
            } else {
                object2.requireMax(0);
            }
            object3 = this.a.getSelections();
            if (((ISelection[])object3).length == 0) {
                throw new CommandInvalidStateException("No selections");
            }
            object2 = object3[0].min();
            CompositeSchematic compositeSchematic = new CompositeSchematic(0, 0, 0);
            ISelection[] iSelectionArray = object3;
            int n3 = ((ISelection[])object3).length;
            for (n2 = 0; n2 < n3; ++n2) {
                betterBlockPos = iSelectionArray[n2].min();
                object2 = new BetterBlockPos(Math.min(((BetterBlockPos)((Object)object2)).a, betterBlockPos.a), Math.min(((BetterBlockPos)((Object)object2)).b, betterBlockPos.b), Math.min(((BetterBlockPos)((Object)object2)).c, betterBlockPos.c));
            }
            iSelectionArray = object3;
            n3 = ((ISelection[])object3).length;
            for (n2 = 0; n2 < n3; ++n2) {
                Object object4 = iSelectionArray[n2];
                betterBlockPos = object4.size();
                object3 = object4.min();
                object4 = new FillSchematic(betterBlockPos.p(), betterBlockPos.q(), betterBlockPos.r(), blockOptionalMeta);
                if (object == bu.f) {
                    object4 = new WallsSchematic((ISchematic)object4);
                } else if (object == bu.g) {
                    object4 = new ShellSchematic((ISchematic)object4);
                } else if (object == bu.i) {
                    object4 = new ReplaceSchematic((ISchematic)object4, blockOptionalMetaLookup);
                }
                compositeSchematic.put((ISchematic)object4, object3.a - ((BetterBlockPos)((Object)object2)).a, object3.b - ((BetterBlockPos)((Object)object2)).b, object3.c - ((BetterBlockPos)((Object)object2)).c);
            }
            this.baritone.getBuilderProcess().build("Fill", compositeSchematic, (fq)object2);
            this.logDirect("Filling now");
            return;
        }
        if (object == bu.j || object == bu.k || object == bu.l) {
            object2.requireExactly(3);
            Object object5 = bv.a(object2.getString());
            if (object5 == null) {
                throw new CommandInvalidStateException("Invalid transform type");
            }
            fa fa2 = (fa)object2.getDatatypeFor(ForEnumFacing.INSTANCE);
            int n4 = object2.getAs(Integer.class);
            object2 = this.a.getSelections();
            if (((ISelection[])object2).length <= 0) {
                throw new CommandInvalidStateException("No selections found");
            }
            bv bv2 = object5;
            object5 = object2;
            object2 = (ISelection[])bv2.a.apply(object5);
            ISelection[] iSelectionArray = object2;
            int n5 = ((ISelection[])object2).length;
            for (int i2 = 0; i2 < n5; ++i2) {
                ISelection iSelection = iSelectionArray[i2];
                if (object == bu.j) {
                    this.a.expand(iSelection, fa2, n4);
                    continue;
                }
                if (object == bu.k) {
                    this.a.contract(iSelection, fa2, n4);
                    continue;
                }
                this.a.shift(iSelection, fa2, n4);
            }
            this.logDirect(String.format("Transformed %d selections", ((Object)object2).length));
        }
    }

    @Override
    public final Stream<String> tabComplete(String object, IArgConsumer iArgConsumer) {
        if (iArgConsumer.hasExactlyOne()) {
            return new TabCompleteHelper().append(bu.a()).filterPrefix(iArgConsumer.getString()).sortAlphabetically().stream();
        }
        object = bu.a(iArgConsumer.getString());
        if (object != null) {
            if (object == bu.a || object == bu.b) {
                if (iArgConsumer.hasAtMost(3)) {
                    return iArgConsumer.tabCompleteDatatype(RelativeBlockPos.INSTANCE);
                }
            } else if (object == bu.e || object == bu.f || object == bu.h || object == bu.i) {
                if (iArgConsumer.hasExactlyOne() || object == bu.i) {
                    while (iArgConsumer.has(2)) {
                        iArgConsumer.get();
                    }
                    return iArgConsumer.tabCompleteDatatype(ForBlockOptionalMeta.INSTANCE);
                }
            } else if (object == bu.j || object == bu.k || object == bu.l) {
                if (iArgConsumer.hasExactlyOne()) {
                    return new TabCompleteHelper().append(bv.a()).filterPrefix(iArgConsumer.getString()).sortAlphabetically().stream();
                }
                if (bv.a(iArgConsumer.getString()) != null && iArgConsumer.hasExactlyOne()) {
                    return iArgConsumer.tabCompleteDatatype(ForEnumFacing.INSTANCE);
                }
            }
        }
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "WorldEdit-like commands";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The sel command allows you to manipulate Baritone's selections, similarly to WorldEdit.", "", "Using these selections, you can clear areas, fill them with blocks, or something else.", "", "The expand/contract/shift commands use a kind of selector to choose which selections to target. Supported ones are a/all, n/newest, and o/oldest.", "", "Usage:", "> sel pos1/p1/1 - Set position 1 to your current position.", "> sel pos1/p1/1 <x> <y> <z> - Set position 1 to a relative position.", "> sel pos2/p2/2 - Set position 2 to your current position.", "> sel pos2/p2/2 <x> <y> <z> - Set position 2 to a relative position.", "", "> sel clear/c - Clear the selection.", "> sel undo/u - Undo the last action (setting positions, creating selections, etc.)", "> sel set/fill/s/f [block] - Completely fill all selections with a block.", "> sel walls/w [block] - Fill in the walls of the selection with a specified block.", "> sel shell/shl [block] - The same as walls, but fills in a ceiling and floor too.", "> sel cleararea/ca - Basically 'set air'.", "> sel replace/r <blocks...> <with> - Replaces blocks with another block.", "", "> sel expand <target> <direction> <blocks> - Expand the targets.", "> sel contract <target> <direction> <blocks> - Contract the targets.", "> sel shift <target> <direction> <blocks> - Shift the targets (does not resize).");
    }

    static /* synthetic */ BetterBlockPos a(bs bs2) {
        return bs2.a;
    }
}

