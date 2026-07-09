/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bja
 *  blk
 *  blm
 */
package me.zero.clarinet.hook.mixin.gui;

import java.util.Arrays;
import java.util.Collections;
import net.impactclient.0H;
import net.impactclient.8U;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={blm.class})
public abstract class MixinGuiCustomizeSkin
extends blk {
    private int doneY = -100;

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void afterInitGui(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        callbackInfo = this.n.stream().filter(bja2 -> bja2.k == 200).findFirst().orElse(null);
        this.doneY = callbackInfo == null ? -100 : ((bja)callbackInfo).i;
    }

    @Inject(method={"drawScreen"}, at={@At(value="RETURN")})
    private void render(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        String[] stringArray = 0H.1().0;
        if ((0H.1().0.9 == null || stringArray.9.1 == null ? Collections.emptyList() : Collections.unmodifiableList(Arrays.asList(stringArray.9.1))).contains("cape")) {
            stringArray = new String[]{"Impact's cape settings have moved.", "You can find them under ClickGUI -> Render -> Cape."};
            for (n3 = 0; n3 < 2; ++n3) {
                String string = stringArray[n3];
                int n4 = this.doneY + 20 + 4 + n3 * (this.q.a + 2);
                MixinGuiCustomizeSkin mixinGuiCustomizeSkin = this;
                mixinGuiCustomizeSkin.a(mixinGuiCustomizeSkin.q, string, this.l / 2, n4, -1);
            }
        }
    }
}

