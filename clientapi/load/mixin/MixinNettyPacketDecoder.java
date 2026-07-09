/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  gx
 *  gz
 *  ht
 *  hu
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package clientapi.load.mixin;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;
import net.impactclient.12;
import net.impactclient.1J;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={gz.class})
public class MixinNettyPacketDecoder {
    @Shadow
    @Final
    private hu c;
    private 12 event;

    @Redirect(method={"decode"}, at=@At(value="INVOKE", target="Lnet/minecraft/network/EnumConnectionState;getPacket(Lnet/minecraft/network/EnumPacketDirection;I)Lnet/minecraft/network/Packet;"))
    private ht<?> mutatePacket(gx gx2, hu hu2, int n2) {
        hu2 = gx2.a(hu2, n2);
        if (this.c == hu.b) {
            this.event = new 12((ht<?>)hu2, gx2);
            4t.1.post(this.event);
            return ((1J)this.event).0;
        }
        return hu2;
    }

    @Inject(method={"decode"}, at={@At(value="JUMP", ordinal=0)})
    private void checkCancelled(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list, CallbackInfo callbackInfo) {
        if (this.event != null && this.event.isCancelled()) {
            callbackInfo.cancel();
        }
        this.event = null;
    }
}

