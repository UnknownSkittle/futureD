/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  cbp
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.1t;
import net.impactclient.2w;
import net.impactclient.4t;
import net.impactclient.4z;
import net.impactclient.7P;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={cbp.class})
public class MixinLayerArmorBase {
    @Redirect(method={"renderEnchantedGlint"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.color(FFFF)V", ordinal=1))
    private static void renderEnchantedGlint$color(float f2, float f3, float f4, float f5) {
        int n2 = 2w.1(f2, f3, f4, f5);
        7P p2 = new 7P(4z.a, n2);
        4t.1.post(p2);
        1t.0(p2.0);
    }
}

