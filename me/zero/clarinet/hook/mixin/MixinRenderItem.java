/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  air
 *  bus
 *  bzw
 *  cfy
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.4t;
import net.impactclient.4z;
import net.impactclient.7P;
import net.impactclient.8J;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bzw.class})
public abstract class MixinRenderItem {
    @ModifyArg(method={"renderEffect"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index=1)
    private int renderEffect$renderModel(int n2) {
        7P p2 = new 7P(4z.b, n2);
        4t.1.post(p2);
        return p2.0;
    }

    @Inject(method={"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;)V"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.color(FFFF)V")})
    private void renderItem$color(aip object, cfy cfy2, CallbackInfo callbackInfo) {
        if (object.c() != air.cR) {
            return;
        }
        object = 0ay.3().5.0(8J.class);
        if (object.4() && object.0.0) {
            bus.b((double)0.0, (double)(-object.7.2), (double)0.0);
        }
    }
}

