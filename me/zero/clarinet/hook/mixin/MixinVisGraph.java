/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bxu
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8N;
import net.impactclient.9l;
import net.impactclient.9p;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bxu.class})
public class MixinVisGraph {
    @Inject(method={"setOpaqueCube"}, at={@At(value="HEAD")}, cancellable=true)
    private void setOpaqueCube(et et2, CallbackInfo callbackInfo) {
        if (9p.0.4() || 8N.6.4() || 9l.0.4()) {
            callbackInfo.cancel();
        }
    }
}

