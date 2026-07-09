/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  axj
 */
package baritone.launch.mixins;

import com.google.common.collect.ImmutableMap;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets={"net.minecraft.block.state.BlockStateContainer$StateImplementation"})
public abstract class MixinStateImplementation {
    @Shadow
    @Final
    private ImmutableMap<axj<?>, Comparable<?>> b;
    @Unique
    private int hashCode;

    @Inject(method={"<init>*"}, at={@At(value="RETURN")})
    private void onInit(CallbackInfo callbackInfo) {
        this.hashCode = this.b.hashCode();
    }

    @Overwrite
    public int hashCode() {
        return this.hashCode;
    }
}

