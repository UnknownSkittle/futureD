/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  gw
 *  io.netty.channel.ChannelHandlerContext
 */
package me.zero.clarinet.hook.mixin;

import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.TimeoutException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={gw.class})
public class MixinNetworkManager {
    @Inject(method={"exceptionCaught"}, at={@At(value="HEAD")})
    private void preExceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable, CallbackInfo callbackInfo) {
        if (!(throwable instanceof TimeoutException)) {
            throwable.printStackTrace();
        }
    }
}

