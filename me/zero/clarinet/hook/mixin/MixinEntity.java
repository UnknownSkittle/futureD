/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  bib
 *  vg
 *  vv
 */
package me.zero.clarinet.hook.mixin;

import java.util.List;
import net.impactclient.0L;
import net.impactclient.0aZ;
import net.impactclient.1C;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={vg.class})
public abstract class MixinEntity {
    private 0aZ stepEvent;

    @Inject(method={"move"}, at={@At(value="FIELD", target="net/minecraft/entity/Entity.stepHeight:F", opcode=180, ordinal=3, shift=At.Shift.BY, by=-3)}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void move(vv vv2, double d2, double d3, double d4, CallbackInfo callbackInfo, double d5, double d6, double d7, double d8, double d9, double d10, List<bhb> list, bhb bhb2, boolean bl2) {
        vv2 = (vg)this;
        if (vv2 != bib.z().h) {
            return;
        }
        if (vv2.P > 0.0f && bl2 && (d8 != d2 || d10 != d4)) {
            this.stepEvent = new 0aZ(1C.0((vg)vv2, d2, d4, d8, d10, bhb2));
            4t.1.post(this.stepEvent);
        }
    }

    @Redirect(method={"move"}, at=@At(value="FIELD", target="net/minecraft/entity/Entity.stepHeight:F", opcode=180, ordinal=3))
    private float move$stepHeight$3(vg vg2) {
        float f2 = this.stepEvent != null && this.stepEvent.isCancelled() ? -1.0f : vg2.P;
        this.stepEvent = null;
        return f2;
    }

    @Redirect(method={"move"}, at=@At(value="INVOKE", target="net/minecraft/entity/Entity.isSneaking()Z", ordinal=0))
    private boolean move$isSneaking(vg object) {
        if (object == bib.z().h) {
            object = new 0L(object.aU());
            4t.1.post(object);
            return object.0;
        }
        return object.aU();
    }
}

