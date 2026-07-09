/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  ana
 *  awt
 *  bcz
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.7_;
import net.impactclient.9s;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={amu.class})
public class MixinWorld {
    @Redirect(method={"rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;"}, at=@At(value="INVOKE", target="net/minecraft/block/state/IBlockState.getMaterial()Lnet/minecraft/block/material/Material;"))
    private bcz rayTraceBlocks$getMaterial(awt awt2) {
        if (7_.0h) {
            return null;
        }
        return awt2.a();
    }

    @Inject(method={"checkLightFor"}, at={@At(value="HEAD")}, cancellable=true)
    private void checkLightFor(ana ana2, et et2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ana2 == ana.a && 9s.3.4() && !9s.3.0.0) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }
}

