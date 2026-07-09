/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  brz
 *  bud
 *  je
 *  jo
 */
package baritone.launch.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.ChunkEvent$Type;
import baritone.api.event.events.type.EventState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={brz.class})
public class MixinNetHandlerPlayClient {
    @Inject(method={"handleChunkData"}, at={@At(value="INVOKE", target="net/minecraft/world/chunk/Chunk.read(Lnet/minecraft/network/PacketBuffer;IZ)V")})
    private void preRead(je je2, CallbackInfo object) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            bud bud2 = iBaritone.getPlayerContext().player();
            if (bud2 == null || bud2.d != (brz)this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, je2.e() ? ChunkEvent$Type.POPULATE_FULL : ChunkEvent$Type.POPULATE_PARTIAL, je2.b(), je2.c()));
        }
    }

    @Inject(method={"handleChunkData"}, at={@At(value="RETURN")})
    private void postHandleChunkData(je je2, CallbackInfo object) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            bud bud2 = iBaritone.getPlayerContext().player();
            if (bud2 == null || bud2.d != (brz)this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, je2.e() ? ChunkEvent$Type.POPULATE_FULL : ChunkEvent$Type.POPULATE_PARTIAL, je2.b(), je2.c()));
        }
    }

    @Inject(method={"handleCombatEvent"}, at={@At(value="INVOKE", target="net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V")})
    private void onPlayerDeath(jo object, CallbackInfo object22) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            bud bud2 = iBaritone.getPlayerContext().player();
            if (bud2 == null || bud2.d != (brz)this) continue;
            iBaritone.getGameEventHandler().onPlayerDeath();
        }
    }
}

