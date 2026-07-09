/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.registry.Registry;
import baritone.api.schematic.ISchematicSystem;
import baritone.api.schematic.format.ISchematicFormat;
import baritone.gr;
import java.io.File;
import java.util.Arrays;
import java.util.Optional;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gp
extends Enum<gp>
implements ISchematicSystem {
    public static final /* enum */ gp a = new gp("INSTANCE");
    private final Registry<ISchematicFormat> a = new Registry();
    private static final /* synthetic */ gp[] a;

    public static gp[] values() {
        return (gp[])a.clone();
    }

    public static gp valueOf(String string) {
        return Enum.valueOf(gp.class, string);
    }

    private gp() {
        Arrays.stream(gr.values()).forEach(((Registry)((Object)this.a))::register);
    }

    @Override
    public final Registry<ISchematicFormat> getRegistry() {
        return this.a;
    }

    @Override
    public final Optional<ISchematicFormat> getByFile(File file) {
        return ((Registry)((Object)this.a)).stream().filter(iSchematicFormat -> iSchematicFormat.isFileType(file)).findFirst();
    }

    static {
        a = new gp[]{a};
    }
}

