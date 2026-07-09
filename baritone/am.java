/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  fq
 *  org.apache.commons.io.FilenameUtils
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.datatypes.RelativeFile;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.utils.BetterBlockPos;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.apache.commons.io.FilenameUtils;

public final class am
extends Command {
    private static final File a = new File(bib.z().w, "schematics");

    public am(IBaritone iBaritone) {
        super(iBaritone, "build");
    }

    @Override
    public final void execute(String object, IArgConsumer object2) {
        object = ((File)object2.getDatatypePost(RelativeFile.INSTANCE, a)).getAbsoluteFile();
        if (FilenameUtils.getExtension((String)((File)object).getAbsolutePath()).isEmpty()) {
            object = new File(((File)object).getAbsolutePath() + "." + baritone.a.a().schematicFallbackExtension);
        }
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        if (object2.hasAny()) {
            object2.requireMax(3);
            object2 = (BetterBlockPos)((Object)object2.getDatatypePost(RelativeBlockPos.INSTANCE, betterBlockPos));
        } else {
            object2.requireMax(0);
            object2 = betterBlockPos;
        }
        if (!this.baritone.getBuilderProcess().build(((File)object).getName(), (File)object, (fq)object2)) {
            throw new CommandInvalidStateException("Couldn't load the schematic. Make sure to use the FULL file name, including the extension (e.g. blah.schematic).");
        }
        this.logDirect(String.format("Successfully loaded schematic for building\nOrigin: %s", object2));
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        if (iArgConsumer.hasExactlyOne()) {
            return RelativeFile.tabComplete(iArgConsumer, a);
        }
        if (iArgConsumer.has(2)) {
            iArgConsumer.get();
            return iArgConsumer.tabCompleteDatatype(RelativeBlockPos.INSTANCE);
        }
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Build a schematic";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("Build a schematic from a file.", "", "Usage:", "> build <filename> - Loads and builds '<filename>.schematic'", "> build <filename> <x> <y> <z> - Custom position");
    }
}

