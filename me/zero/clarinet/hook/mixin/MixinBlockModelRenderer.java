/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  awt
 *  bib
 *  buk
 *  bvo
 *  cfy
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.9p;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={bvo.class})
public class MixinBlockModelRenderer {
    @Inject(method={"renderModel(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderModel(amy amy2, cfy cfy2, awt awt2, et et2, buk buk2, boolean bl2, long l2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (9p.0.4() && !9p.0(awt2.u())) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }

    @Redirect(method={"renderModel(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z"}, at=@At(value="INVOKE", target="net/minecraft/client/Minecraft.isAmbientOcclusionEnabled()Z"))
    private boolean isAmbientOcclusion() {
        if (9p.0.4()) {
            return false;
        }
        return bib.y();
    }

    @ModifyVariable(method={"renderModel(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z"}, at=@At(value="HEAD"), ordinal=0)
    private boolean modifyCheckSides(boolean bl2) {
        if (9p.0.4()) {
            return false;
        }
        return bl2;
    }

    @Redirect(method={"renderModelFlat"}, at=@At(value="INVOKE", target="net/minecraft/block/state/IBlockState.getPackedLightmapCoords(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I"))
    private int getPackedLightmapCoords(awt awt2, amy amy2, et et2) {
        if (9p.0.4()) {
            return 0xF000F0;
        }
        return awt2.b(amy2, et2);
    }
}

