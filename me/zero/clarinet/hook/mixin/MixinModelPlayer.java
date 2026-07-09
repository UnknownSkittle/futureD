/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  bqj
 *  vg
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0rT;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bqj.class})
public class MixinModelPlayer {
    @Inject(method={"setRotationAngles"}, at={@At(value="INVOKE", target="net/minecraft/client/model/ModelBiped.setRotationAngles(FFFFFFLnet/minecraft/entity/Entity;)V")})
    private void setRotationAngles$setRotationAngles(float f2, float f3, float f4, float f5, float f6, float f7, vg vg2, CallbackInfo callbackInfo) {
        if (vg2 instanceof aed) {
            0rT.0((aed)vg2, (bqj)this);
        }
    }
}

