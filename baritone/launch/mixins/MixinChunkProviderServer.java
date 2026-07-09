/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ayf
 *  on
 */
package baritone.launch.mixins;

import baritone.ge;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={on.class})
public class MixinChunkProviderServer
implements ge {
    @Shadow
    @Final
    private ayf d;

    @Override
    public ayf getChunkLoader() {
        return this.d;
    }
}

