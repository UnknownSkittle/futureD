/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bja
 *  bkv
 *  blk
 *  hh
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0aa;
import net.impactclient.0ay;
import net.impactclient.8H;
import net.impactclient.8U;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bkv.class})
public abstract class MixinGuiGameOver
extends blk {
    private 8H mod;
    private 0aa timer;
    private bja autoBtn;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void init(hh hh2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        this.mod = 0ay.3().5.0(8H.class);
        this.timer = new 0aa();
        this.timer.0();
        this.mod.7();
    }

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void afterInitGui(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        int n2 = this.m / 4 + 55;
        int n3 = 0;
        while (n3 < this.n.size()) {
            ((bja)this.n.get((int)n3)).i = n2 + ++n3 * 24;
        }
        this.autoBtn = this.b(new bja(20, this.l / 2 - 100, n2, ""));
    }

    @Inject(method={"actionPerformed"}, at={@At(value="HEAD")}, cancellable=true)
    private void actionPerformed(bja bja2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        switch (bja2.k) {
            case 0: {
                if (!this.mod.0.0) break;
                this.respawn();
                return;
            }
            case 20: {
                this.timer.0();
                this.mod.0.5();
            }
        }
    }

    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    private void drawScreen(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (this.timer.0(((Number)this.mod.5.1()).longValue()) && this.mod.0.0) {
            this.j.h.cY();
            this.mod.3();
            this.timer.0();
            return;
        }
        this.autoBtn.j = "Auto Respawn " + (this.mod.0.0 ? a.k + "ON " + a.p + "(" + ((long)this.mod.5.2 - this.timer.1()) + "ms)" : a.m + "OFF");
    }

    private void respawn() {
        this.j.h.cY();
        this.j.a(null);
        this.mod.3();
    }
}

