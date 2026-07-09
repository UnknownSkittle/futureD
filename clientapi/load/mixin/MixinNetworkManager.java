/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  gw
 *  hb
 *  ht
 *  hu
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package clientapi.load.mixin;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.annotation.Nullable;
import me.zero.alpine.event.Cancellable;
import net.impactclient.0rK;
import net.impactclient.1J;
import net.impactclient.1V;
import net.impactclient.1f;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={gw.class})
public abstract class MixinNetworkManager
implements 0rK {
    private boolean sendPackets = true;
    @Shadow
    @Final
    private hu h;

    @Shadow
    protected abstract void a(ht<?> var1, @Nullable GenericFutureListener<? extends Future<? super Void>>[] var2);

    @Redirect(method={"channelRead0"}, at=@At(value="INVOKE", target="net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V"))
    private void channelRead0$processPacket(ht<?> object, hb hb2) {
        if (this.h == hu.b) {
            object = new 1V((ht<?>)object);
            4t.1.post(object);
            if (((Cancellable)object).isCancelled()) {
                return;
            }
            object = ((1J)object).0;
        }
        object.a(hb2);
    }

    @Redirect(method={"sendPacket"}, at=@At(value="INVOKE", target="net/minecraft/network/NetworkManager.dispatchPacket(Lnet/minecraft/network/Packet;[Lio/netty/util/concurrent/GenericFutureListener;)V"))
    private void sendPacket$dispatchPacket(gw object, ht<?> ht2, @Nullable GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray) {
        if (this.h == hu.b) {
            object = new 1f(ht2);
            4t.1.post(object);
            if (((Cancellable)object).isCancelled()) {
                return;
            }
            ht2 = ((1J)object).0;
        }
        this.a(ht2, genericFutureListenerArray);
    }

    @Redirect(method={"sendPacket"}, at=@At(value="INVOKE", target="net/minecraft/network/NetworkManager.isChannelOpen()Z"))
    private boolean sendPacket$isChannelOpen(gw gw2) {
        return this.sendPackets && gw2.g();
    }

    @Inject(method={"flushOutboundQueue"}, at={@At(value="HEAD")}, cancellable=true)
    private void flushOutboundQueue(CallbackInfo callbackInfo) {
        if (!this.sendPackets) {
            callbackInfo.cancel();
        }
    }

    @Override
    public final void setSendPackets(boolean bl2) {
        this.sendPackets = bl2;
    }

    public final boolean isSendPackets() {
        return this.sendPackets;
    }
}

