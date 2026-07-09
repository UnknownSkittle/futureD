/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aye
 */
package baritone.launch.mixins;

import baritone.ga;
import java.io.File;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={aye.class})
public class MixinAnvilChunkLoader
implements ga {
    @Shadow
    @Final
    private File d;

    @Override
    public File getChunkSaveLocation() {
        return this.d;
    }
}

