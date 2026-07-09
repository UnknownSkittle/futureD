/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ha
 *  ht
 *  hu
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package clientapi.load.mixin;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.impactclient.1J;
import net.impactclient.1O;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ha.class})
public class MixinNettyPacketEncoder {
    @Shadow
    @Final
    private hu c;
    private 1J event;

    @ModifyVariable(method={"encode"}, at=@At(value="HEAD"), index=1, remap=false)
    private ht<?> mutatePacket(ht<?> ht2) {
        if (this.c == hu.b) {
            this.event = new 1O(ht2);
            4t.1.post(this.event);
            return this.event.0;
        }
        return ht2;
    }

    @Inject(method={"encode"}, at={@At(value="JUMP", ordinal=0)}, cancellable=true)
    private void checkCancelled(ChannelHandlerContext channelHandlerContext, ht<?> ht2, ByteBuf byteBuf, CallbackInfo callbackInfo) {
        if (this.event != null && (this.event.isCancelled() || this.event.0 == null)) {
            callbackInfo.cancel();
        }
        this.event = null;
    }
}

