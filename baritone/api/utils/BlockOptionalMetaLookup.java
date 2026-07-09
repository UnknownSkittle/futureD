/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  aow
 *  awt
 */
package baritone.api.utils;

import baritone.api.utils.BlockOptionalMeta;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BlockOptionalMetaLookup {
    private final BlockOptionalMeta[] boms;

    public BlockOptionalMetaLookup(BlockOptionalMeta ... blockOptionalMetaArray) {
        this.boms = blockOptionalMetaArray;
    }

    public BlockOptionalMetaLookup(aow ... aowArray) {
        this.boms = (BlockOptionalMeta[])Stream.of(aowArray).map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new);
    }

    public BlockOptionalMetaLookup(List<aow> list) {
        this.boms = (BlockOptionalMeta[])list.stream().map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new);
    }

    public BlockOptionalMetaLookup(String ... stringArray) {
        this.boms = (BlockOptionalMeta[])Stream.of(stringArray).map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new);
    }

    public boolean has(aow aow2) {
        BlockOptionalMeta[] blockOptionalMetaArray = this.boms;
        int n2 = this.boms.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (blockOptionalMetaArray[i2].getBlock() != aow2) continue;
            return true;
        }
        return false;
    }

    public boolean has(awt awt2) {
        BlockOptionalMeta[] blockOptionalMetaArray = this.boms;
        int n2 = this.boms.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!blockOptionalMetaArray[i2].matches(awt2)) continue;
            return true;
        }
        return false;
    }

    public boolean has(aip aip2) {
        BlockOptionalMeta[] blockOptionalMetaArray = this.boms;
        int n2 = this.boms.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!blockOptionalMetaArray[i2].matches(aip2)) continue;
            return true;
        }
        return false;
    }

    public List<BlockOptionalMeta> blocks() {
        return Arrays.asList(this.boms);
    }

    public String toString() {
        return String.format("BlockOptionalMetaLookup{%s}", Arrays.toString(this.boms));
    }
}

