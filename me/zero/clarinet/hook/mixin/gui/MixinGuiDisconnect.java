/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bip
 *  bja
 *  bky
 *  blk
 *  hh
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0aa;
import net.impactclient.0ay;
import net.impactclient.3v;
import net.impactclient.6i;
import net.impactclient.85;
import net.impactclient.8U;
import net.impactclient.8f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bky.class})
public abstract class MixinGuiDisconnect
extends blk {
    private 8f disconnectMod;
    private 85 reconnectMod;
    private 6i reconnectCmd;
    private 0aa timer;
    @Shadow
    @Final
    private blk h;
    private bja rcModToggle;
    private boolean failedConnect;
    private boolean disconnected;
    private boolean reconnecting;
    private boolean reconnectEnabled;

    @Shadow
    public abstract void b();

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void init(blk blk2, String string, hh hh2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        this.disconnectMod = 0ay.3().5.0(8f.class);
        this.reconnectMod = 0ay.3().5.0(85.class);
        this.reconnectCmd = 0ay.3().0i.0(6i.class);
        this.disconnected = this.disconnectMod.7;
        this.reconnecting = this.reconnectCmd.1;
        this.reconnectCmd.1 = false;
        this.disconnectMod.7 = false;
        this.reconnectEnabled = !this.disconnected || this.reconnecting;
        this.failedConnect = string.equals("connect.failed");
        this.timer = new 0aa();
        this.timer.0();
    }

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void afterInitGui(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        int n2 = ((bja)this.n.get((int)0)).i;
        this.rcModToggle = this.reconnecting ? null : this.b(new bja(20, this.l / 2 - 100, n2 += 24, ""));
        this.b(new bja(21, this.l / 2 - 100, n2 += 24, "Reconnect"));
        if (this.failedConnect) {
            this.b(new bja(22, this.l / 2 - 100, n2 += 24, "Alts"));
        }
    }

    @Inject(method={"actionPerformed"}, at={@At(value="HEAD")}, cancellable=true)
    private void actionPerformed(bja bja2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        switch (bja2.k) {
            case 20: {
                this.timer.0();
                if (this.reconnectEnabled || !this.reconnectMod.4()) {
                    this.reconnectMod.5();
                }
                this.reconnectEnabled = true;
                callbackInfo.cancel();
                return;
            }
            case 21: {
                this.reconnectMod.0(this.h);
                callbackInfo.cancel();
                return;
            }
            case 22: {
                this.j.a((blk)new 3v(this.h));
                callbackInfo.cancel();
                return;
            }
            case 23: {
                this.disconnectMod.5();
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    private void drawScreen(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (this.shouldConnect()) {
            this.reconnectMod.0(this.h);
            return;
        }
        if (this.rcModToggle != null) {
            this.rcModToggle.j = "Auto Reconnect " + (this.reconnectMod.4() ? a.k + "ON " + (this.reconnectEnabled ? a.p + "(" + ((long)this.reconnectMod.0.2 - this.timer.1()) + "ms)" : a.h + a.u + "DISABLED") : a.m + "OFF");
        }
    }

    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiDisconnected;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V", ordinal=0))
    private void drawTitleString(bky bky2, bip bip2, String string, int n2, int n3, int n4) {
        if (!8U.0()) {
            if (this.disconnected) {
                string = "Disconnected Automatically";
            }
            if (this.reconnecting) {
                string = "Reconnecting Automatically";
            }
        }
        bky2.a(bip2, string, n2, n3, n4);
    }

    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiDisconnected;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V", ordinal=1))
    private void drawSubtitleString(bky bky2, bip bip2, String string, int n2, int n3, int n4) {
        if (!8U.0()) {
            if (this.disconnected) {
                string = "Health was " + this.disconnectMod.3;
                if (this.disconnectMod.3 <= 0) {
                    string = string + " (oops)";
                }
            }
            if (this.reconnecting) {
                string = (long)this.reconnectCmd.3 - this.timer.1() + "ms";
            }
        }
        bky2.a(bip2, string, n2, n3, n4);
    }

    private boolean shouldConnect() {
        if (!this.reconnectEnabled) {
            return false;
        }
        if (!this.reconnecting && !this.reconnectMod.4()) {
            return false;
        }
        return this.timer.0(this.reconnecting ? (long)this.reconnectCmd.3 : (long)this.reconnectMod.0.2);
    }
}

