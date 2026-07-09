/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  buq
 */
package baritone.launch.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RenderEvent;
import java.util.Iterator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={buq.class})
public class MixinEntityRenderer {
    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE_STRING", target="Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args={"ldc=hand"})})
    private void renderWorldPass(int n2, float f2, long l2, CallbackInfo callbackInfo) {
        Iterator<IBaritone> iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            iterator.next().getGameEventHandler().onRenderPass(new RenderEvent(f2));
        }
    }
}

