/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.BlockById;
import baritone.api.command.datatypes.ForBlockOptionalMeta;
import baritone.api.utils.BlockOptionalMeta;
import baritone.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class bk
extends Command {
    public bk(IBaritone iBaritone) {
        super(iBaritone, "mine");
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        int n2 = iArgConsumer.getAsOrDefault(Integer.class, 0);
        iArgConsumer.requireMin(1);
        ArrayList arrayList = new ArrayList();
        while (iArgConsumer.hasAny()) {
            arrayList.add(iArgConsumer.getDatatypeFor(ForBlockOptionalMeta.INSTANCE));
        }
        w.a.repack(this.ctx);
        this.logDirect(String.format("Mining %s", ((Object)arrayList).toString()));
        this.baritone.getMineProcess().mine(n2, arrayList.toArray(new BlockOptionalMeta[0]));
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return iArgConsumer.tabCompleteDatatype(BlockById.INSTANCE);
    }

    @Override
    public final String getShortDesc() {
        return "Mine some blocks";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The mine command allows you to tell Baritone to search for and mine individual blocks.", "", "The specified blocks can be ores (which are commonly cached), or any other block.", "", "Also see the legitMine settings (see #set l legitMine).", "", "Usage:", "> mine diamond_ore - Mines all diamonds it can find.", "> mine redstone_ore lit_redstone_ore - Mines redstone ore.", "> mine log:0 - Mines only oak logs.");
    }
}

