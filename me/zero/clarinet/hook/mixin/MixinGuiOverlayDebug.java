/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bjd
 *  net.minecraft.realms.RealmsSharedConstants
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8U;
import net.minecraft.realms.RealmsSharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={bjd.class})
public class MixinGuiOverlayDebug {
    @Redirect(method={"call"}, at=@At(value="INVOKE", target="net/minecraft/client/Minecraft.getVersion()Ljava/lang/String;"))
    private String onGetVersion(bib bib2) {
        if (8U.0()) {
            return RealmsSharedConstants.VERSION_STRING;
        }
        return bib2.c();
    }
}

