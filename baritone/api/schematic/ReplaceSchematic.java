/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  awt
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.api.utils.BlockOptionalMetaLookup;

public class ReplaceSchematic
extends MaskSchematic {
    private final BlockOptionalMetaLookup filter;
    private final Boolean[][][] cache;

    public ReplaceSchematic(ISchematic iSchematic, BlockOptionalMetaLookup blockOptionalMetaLookup) {
        super(iSchematic);
        this.filter = blockOptionalMetaLookup;
        this.cache = new Boolean[this.widthX()][this.heightY()][this.lengthZ()];
    }

    @Override
    protected boolean partOfMask(int n2, int n3, int n4, awt awt2) {
        if (this.cache[n2][n3][n4] == null) {
            this.cache[n2][n3][n4] = this.filter.has(awt2);
        }
        return this.cache[n2][n3][n4];
    }
}

