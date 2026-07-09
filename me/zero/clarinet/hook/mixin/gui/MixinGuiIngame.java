/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhy
 *  bib
 *  biq
 *  bir
 *  bjb
 *  vg
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.2R;
import net.impactclient.7V;
import net.impactclient.8N;
import net.impactclient.8U;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={biq.class})
public abstract class MixinGuiIngame
extends bir {
    @Shadow
    @Final
    private bib j;

    @Redirect(method={"renderGameOverlay"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiNewChat;drawChat(I)V"))
    private void drawChat(bjb bjb2, int n2) {
        if (!8U.0() && bib.z().m instanceof 2R) {
            return;
        }
        bjb2.a(n2);
    }

    @Redirect(method={"renderGameOverlay"}, at=@At(value="INVOKE", target="net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    private boolean isTabMenuKeyPressed(bhy bhy2) {
        if (!8U.0() && 7V.a.d && this.j.t.ah == bhy2) {
            return 7V.a.b;
        }
        return bhy2.e();
    }

    @Redirect(method={"renderPlayerStats"}, at=@At(value="INVOKE", target="net/minecraft/client/Minecraft.getRenderViewEntity()Lnet/minecraft/entity/Entity;", ordinal=1))
    private vg getViewPlayer(bib bib2) {
        if (8N.6.4()) {
            return bib2.h;
        }
        return bib2.aa();
    }
}

