/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.schematic.format;

import baritone.api.schematic.IStaticSchematic;
import java.io.File;
import java.io.InputStream;

public interface ISchematicFormat {
    public IStaticSchematic parse(InputStream var1);

    public boolean isFileType(File var1);
}

