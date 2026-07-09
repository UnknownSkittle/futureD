/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  amu
 *  bib
 *  vp
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.86;
import net.impactclient.8B;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={aed.class})
public abstract class MixinEntityPlayer
extends vp {
    public MixinEntityPlayer(amu amu2) {
        super(amu2);
    }

    @ModifyConstant(method={"attackTargetEntityWithCurrentItem"}, constant={@Constant(doubleValue=0.6)})
    private double getMotion(double d2) {
        if (this.shouldKeepVelocity()) {
            return 1.0;
        }
        return 0.6;
    }

    @Redirect(method={"attackTargetEntityWithCurrentItem"}, at=@At(value="INVOKE", target="net/minecraft/entity/player/EntityPlayer.setSprinting(Z)V"))
    private void setSprinting(aed aed2, boolean bl2) {
        aed2.f(this.shouldKeepVelocity() && aed2.aV());
    }

    private boolean shouldKeepVelocity() {
        aed aed2 = (aed)this;
        86 var2_2 = 0ay.3().5.0(86.class);
        8B b2 = 0ay.3().5.0(8B.class);
        return aed2 == bib.z().h && var2_2.4() && var2_2.4.0 || b2.4() && b2.0.0;
    }
}

