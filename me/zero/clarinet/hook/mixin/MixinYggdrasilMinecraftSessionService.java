/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 */
package me.zero.clarinet.hook.mixin;

import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.net.MalformedURLException;
import java.net.URL;
import net.impactclient.2G;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={YggdrasilMinecraftSessionService.class})
public class MixinYggdrasilMinecraftSessionService {
    private static URL mutateUrl(URL uRL) {
        if (2G.6()) {
            try {
                return new URL("http://sessionserver.thealtening.com" + uRL.getFile());
            } catch (MalformedURLException malformedURLException) {}
        }
        return uRL;
    }

    @ModifyArg(method={"joinServer"}, at=@At(value="INVOKE", target="Lcom/mojang/authlib/yggdrasil/YggdrasilAuthenticationService;makeRequest(Ljava/net/URL;Ljava/lang/Object;Ljava/lang/Class;)Lcom/mojang/authlib/yggdrasil/response/Response;"), index=0, remap=false)
    private URL joinServer(URL uRL) {
        return MixinYggdrasilMinecraftSessionService.mutateUrl(uRL);
    }

    @ModifyArg(method={"hasJoinedServer"}, at=@At(value="INVOKE", target="Lcom/mojang/authlib/yggdrasil/YggdrasilAuthenticationService;makeRequest(Ljava/net/URL;Ljava/lang/Object;Ljava/lang/Class;)Lcom/mojang/authlib/yggdrasil/response/Response;"), index=0, remap=false)
    private URL hasJoinedServer(URL uRL) {
        return MixinYggdrasilMinecraftSessionService.mutateUrl(uRL);
    }
}

