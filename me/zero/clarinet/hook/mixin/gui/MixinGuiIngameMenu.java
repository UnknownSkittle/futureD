/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bja
 *  blg
 *  blk
 *  org.lwjgl.input.Keyboard
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0ay;
import net.impactclient.0rH;
import net.impactclient.1C;
import net.impactclient.8U;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={blg.class})
public abstract class MixinGuiIngameMenu
extends blk {
    private static boolean hiding;

    @Shadow
    public abstract void b();

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void postInit(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (!hiding) {
            callbackInfo = 1C.0(this.n, "menu.returnToGame");
            bja bja2 = 1C.0(this.n, "menu.options");
            if (callbackInfo == null || bja2 == null) {
                0ay.0a.error("Couldn't inject button into GuiIngameMenu, target not found");
                return;
            }
            callbackInfo = new bja(420, bja2.h, bja2.i, callbackInfo.b(), 20, "Impact");
            this.n.forEach(arg_0 -> MixinGuiIngameMenu.lambda$postInit$0((bja)callbackInfo, arg_0));
            this.n.add(callbackInfo);
        }
    }

    @Inject(method={"actionPerformed"}, at={@At(value="HEAD")}, cancellable=true)
    private void preAction(bja bja2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (bja2.k == 420) {
            this.j.a((blk)new 0rH(this));
            callbackInfo.cancel();
        }
    }

    protected void a(char c2, int n2) {
        if (!8U.0() && n2 == 42) {
            hiding = !hiding;
            this.n.clear();
            this.b();
            return;
        }
        super.a(c2, n2);
    }

    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    private void postDraw(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (!hiding) {
            String string = "Press " + Keyboard.getKeyName((int)42) + " to hide the Impact button";
            MixinGuiIngameMenu mixinGuiIngameMenu = this;
            mixinGuiIngameMenu.c(mixinGuiIngameMenu.j.k, string, this.l - this.j.k.a(string) - 2, 2, -1);
        }
    }

    private static /* synthetic */ void lambda$postInit$0(bja bja2, bja bja3) {
        if (bja3.i >= bja2.i) {
            bja3.i += 24;
        }
    }
}

