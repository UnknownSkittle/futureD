/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  bib
 *  vg
 *  vp
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8G;
import net.impactclient.8z;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={vp.class})
public abstract class MixinEntityLivingBase
extends vg {
    public MixinEntityLivingBase(amu amu2) {
        super(amu2);
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="FIELD", target="net/minecraft/entity/EntityLivingBase.onGround:Z", opcode=180))
    private boolean onLivingUpdate$onGround(vp vp2) {
        return vp2 == bib.z().h && 0ay.3().5.0(8z.class).4() || vp2.z;
    }

    @ModifyConstant(method={"travel"}, constant={@Constant(doubleValue=0.2, ordinal=0)})
    private double getLadderMotion(double d2) {
        8G g2 = 0ay.3().5.0(8G.class);
        return d2 * (g2.4() && g2.4.0 ? g2.0.2 : 1.0);
    }
}

