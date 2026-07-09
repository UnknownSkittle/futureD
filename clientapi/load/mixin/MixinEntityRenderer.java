/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  air
 *  awt
 *  bcz
 *  bib
 *  biq
 *  buq
 *  bus
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0r_;
import net.impactclient.4H;
import net.impactclient.4t;
import net.impactclient.5D;
import net.impactclient.5T;
import net.impactclient.5Y;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={buq.class})
public class MixinEntityRenderer {
    @Shadow
    @Final
    private bib h;

    @Inject(method={"updateCameraAndRender"}, at={@At(value="FIELD", opcode=178, target="net/minecraft/client/renderer/OpenGlHelper.shadersSupported:Z", shift=At.Shift.BEFORE)})
    private void updateCameraAndRender(float f2, long l2, CallbackInfo callbackInfo) {
        bus.n((int)5889);
        bus.F();
        bus.a((double)0.0, (double)this.h.d, (double)this.h.e, (double)0.0, (double)1000.0, (double)3000.0);
        bus.n((int)5888);
        bus.F();
        bus.c((float)0.0f, (float)0.0f, (float)-2000.0f);
        bus.b((int)0, (int)0, (int)this.h.d, (int)this.h.e);
        4t.1.post(new 5T(f2));
    }

    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE_STRING", target="net/minecraft/profiler/Profiler.endStartSection(Ljava/lang/String;)V", args={"ldc=hand"})})
    private void onStartHand(int n2, float f2, long l2, CallbackInfo callbackInfo) {
        4t.1.post(new 5Y(f2, n2));
    }

    @Redirect(method={"updateCameraAndRender"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/GuiIngame.renderGameOverlay(F)V"))
    private void updateCameraAndRender$renderGameOverlay(biq biq2, float f2) {
        biq2.a(f2);
        4t.1.post(new 5D(f2));
    }

    @Inject(method={"hurtCameraEffect"}, at={@At(value="HEAD")}, cancellable=true)
    private void hurtCameraEffect(float f2, CallbackInfo callbackInfo) {
        4H h2 = new 4H(0r_.d);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"setupFog"}, at=@At(value="INVOKE", target="Lnet/minecraft/block/state/IBlockState;getMaterial()Lnet/minecraft/block/material/Material;"))
    private bcz setupFog$getMaterial(awt awt2) {
        4H h2 = new 4H((awt2 = awt2.a()) == bcz.h ? 0r_.a : 0r_.b);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return bcz.a;
        }
        return awt2;
    }

    @Inject(method={"displayItemActivation"}, at={@At(value="HEAD")}, cancellable=true)
    private void displayItemActivation(aip object, CallbackInfo callbackInfo) {
        if (object.c() == air.cY) {
            object = new 4H(0r_.u);
            4t.1.post(object);
            if (((Cancellable)object).isCancelled()) {
                callbackInfo.cancel();
            }
        }
    }
}

