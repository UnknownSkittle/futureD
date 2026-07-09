/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  afr
 *  bja
 *  bmg
 *  bmm
 *  org.lwjgl.input.Keyboard
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0ay;
import net.impactclient.8C;
import net.impactclient.8U;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bmm.class})
public abstract class MixinGuiChest
extends bmg {
    private static int TOGGLE_KEY = 54;
    private static boolean hide = false;

    public MixinGuiChest(afr afr2) {
        super(afr2);
    }

    public final void b() {
        this.n.clear();
        super.b();
        if (8U.0()) {
            return;
        }
        if (!hide) {
            this.n.add(new bja(0, this.i + this.f - 57, this.s + 4, 50, 12, "Steal"));
        }
    }

    protected final void a(char c2, int n2) {
        if (n2 == TOGGLE_KEY) {
            hide = !hide;
            this.b();
        }
        super.a(c2, n2);
    }

    protected final void a(bja bja2) {
        8C c2 = 0ay.3().5.0(8C.class);
        if (bja2.k == 0) {
            c2.0((bmm)this);
            return;
        }
        super.a(bja2);
    }

    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    private void postDraw(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (!hide) {
            String string = "Press " + Keyboard.getKeyName((int)TOGGLE_KEY) + " to hide the Steal button";
            MixinGuiChest mixinGuiChest = this;
            mixinGuiChest.c(mixinGuiChest.j.k, string, this.l - this.j.k.a(string) - 2, 2, -1);
        }
    }
}

