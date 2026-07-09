/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bih
 */
package clientapi.load.mixin;

import net.impactclient.0z;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={bih.class})
public class MixinTimer
implements 0z {
    @Shadow
    private float e;
    private float speed = 1.0f;

    @Redirect(method={"updateTimer"}, at=@At(value="FIELD", target="Lnet/minecraft/util/Timer;tickLength:F", opcode=180))
    private float getTickLength(bih bih2) {
        return this.e / this.speed;
    }

    @Override
    public final void setSpeed(float f2) {
        this.speed = f2;
    }

    @Override
    public final float getSpeed() {
        return this.speed;
    }
}

