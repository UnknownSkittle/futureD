/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  hb
 *  ht
 *  hv
 *  nr
 *  tr
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.31;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={hv.class})
public class MixinPacketThreadUtil {
    @Inject(method={"checkThreadAndEnqueue"}, at={@At(value="INVOKE", target="net/minecraft/util/IThreadListener.addScheduledTask(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;")})
    private static <T extends hb> void addScheduledTask(ht<T> ht2, T t2, tr tr2, CallbackInfo callbackInfo) {
        if (tr2 == bib.z()) {
            tr2.a(new 31<T>(ht2, t2));
            throw nr.a;
        }
    }
}

