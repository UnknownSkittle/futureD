/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  bvd
 *  cii
 */
package me.zero.clarinet.hook.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={bvd.class})
public class MixinFramebuffer {
    @Redirect(method={"framebufferRenderExt"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.colorMask(ZZZZ)V", ordinal=0))
    private void colorMask(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        bus.a((boolean)bl2, (boolean)bl3, (boolean)bl4, (boolean)true);
    }

    @ModifyArg(method={"createFramebuffer"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/OpenGlHelper.glRenderbufferStorage(IIII)V"), index=1)
    private int createFrameBuffer$glRenderbufferStorage$internalFormat(int n2) {
        return 34041;
    }

    @Redirect(method={"createFramebuffer"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/OpenGlHelper.glFramebufferRenderbuffer(IIII)V"))
    private void createFramebuffer$glFramebufferRenderbuffer(int n2, int n3, int n4, int n5) {
        cii.b((int)n2, (int)n3, (int)n4, (int)n5);
        cii.b((int)n2, (int)36128, (int)n4, (int)n5);
    }
}

