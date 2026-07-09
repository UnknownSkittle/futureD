/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  biq
 *  brz
 *  bsb
 *  hf
 *  hh
 *  jo
 *  vg
 *  vp
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0ah;
import net.impactclient.4T;
import net.impactclient.4Y;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={brz.class})
public class MixinNetHandlerPlayClient {
    @Shadow
    private bsb g;

    @Inject(method={"handleCombatEvent"}, at={@At(value="INVOKE_ASSIGN", target="net/minecraft/client/multiplayer/WorldClient.getEntityByID(I)Lnet/minecraft/entity/Entity;")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void handleCombatEvent(jo jo2, CallbackInfo callbackInfo, vg vg2) {
        if (!(vg2 instanceof aed)) {
            return;
        }
        jo2 = this.g.a(jo2.c);
        if (jo2 == null || jo2 instanceof vp) {
            4t.1.post(new 0ah((aed)vg2, (vp)jo2));
        }
    }

    @Redirect(method={"handleChat"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/GuiIngame.addChatMessage(Lnet/minecraft/util/text/ChatType;Lnet/minecraft/util/text/ITextComponent;)V"))
    private void handleChat$addChatMessage(biq biq2, hf hf2, hh object) {
        object = new 4Y((hh)object);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            return;
        }
        biq2.a(hf2, ((4T)object).0);
    }
}

