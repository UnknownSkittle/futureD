/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  caa
 *  ccg
 *  vp
 */
package clientapi.load.mixin;

import net.impactclient.3y;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={caa.class})
public class MixinRenderLivingBase {
    @Redirect(method={"renderLayers"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/entity/layers/LayerRenderer.doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V"))
    private void renderLayers$doRenderLayer(ccg ccg2, vp vp2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        3y y2 = new 3y(vp2, ccg2);
        4t.1.post(y2);
        if (!y2.isCancelled()) {
            ccg2.a(vp2, f2, f3, f4, f5, f6, f7, f8);
        }
    }
}

