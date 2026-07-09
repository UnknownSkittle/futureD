/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  bzf
 *  vg
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.78;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={bzf.class})
public class MixinRenderManager {
    @Redirect(method={"renderDebugBoundingBox"}, at=@At(value="INVOKE", target="net/minecraft/entity/Entity.getEntityBoundingBox()Lnet/minecraft/util/math/AxisAlignedBB;"))
    private bhb renderDebugBoundingBox(vg vg2) {
        78 var2_2 = 0ay.3().5.0(78.class);
        return vg2.bw().g(var2_2.4() && var2_2.4.0 ? (double)var2_2.0(vg2) : 0.0);
    }
}

