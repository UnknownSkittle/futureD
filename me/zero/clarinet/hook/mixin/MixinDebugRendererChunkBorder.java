/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bud
 *  bye
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8N;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={bye.class})
public class MixinDebugRendererChunkBorder {
    @Redirect(method={"render"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private bud getViewPlayer(bib bib2) {
        if (8N.6.4()) {
            return 8N.6.4;
        }
        return bib2.h;
    }
}

