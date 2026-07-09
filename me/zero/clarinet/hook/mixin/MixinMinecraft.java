/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bse
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.85;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bib.class})
public class MixinMinecraft {
    @Inject(method={"setServerData"}, at={@At(value="HEAD")})
    private void setServerData(bse object, CallbackInfo callbackInfo) {
        callbackInfo = object;
        object = 0ay.3().5.0(85.class);
        if (callbackInfo != null) {
            object.1 = callbackInfo;
        }
    }

    @ModifyConstant(method={"getLimitFramerate"}, constant={@Constant(intValue=30)})
    private int getGuiFramerate(int n2) {
        return 60;
    }
}

