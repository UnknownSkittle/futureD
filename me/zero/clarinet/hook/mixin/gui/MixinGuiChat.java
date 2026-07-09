/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bje
 *  bkn
 *  blk
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0ay;
import net.impactclient.0rW;
import net.impactclient.1A;
import net.impactclient.32;
import net.impactclient.8U;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bkn.class})
public abstract class MixinGuiChat
extends blk {
    private static final 32 commandManager = 0ay.3().0i;
    @Shadow
    protected bje a;

    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    private void beforeDrawScreen(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        String string = String.valueOf(MixinGuiChat.commandManager.0.6);
        if (this.a.b().startsWith(string) && 0rW.a.b) {
            1A.0(1.0f, this.m - 15, this.l - 1, this.m - 1, 1.0f, 0rW.a.c, 0x7F000000);
        }
    }
}

