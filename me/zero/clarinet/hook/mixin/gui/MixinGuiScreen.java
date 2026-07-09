/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bir
 *  bja
 *  blk
 */
package me.zero.clarinet.hook.mixin.gui;

import net.impactclient.0;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={blk.class})
public abstract class MixinGuiScreen
extends bir {
    @Shadow
    protected abstract void a(bja var1);

    @Redirect(method={"mouseClicked"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiScreen;actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V"))
    private void actionPerformed(blk blk2, bja bja2, int n2, int n3, int n4) {
        if (bja2 instanceof 0) {
            this.callActionButton((0)bja2, n2, n3, n4);
        }
        this.a(bja2);
    }

    private void callActionButton(0 var1_1, int n2, int n3, int n4) {
        var1_1.0.run();
    }
}

