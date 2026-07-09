/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  btf
 *  btg
 *  bth
 */
package clientapi.load.mixin;

import net.impactclient.0d;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={btg.class})
public class MixinParticleManager {
    @Redirect(method={"spawnEffectParticle"}, at=@At(value="INVOKE", target="net/minecraft/client/particle/IParticleFactory.createParticle(ILnet/minecraft/world/World;DDDDDD[I)Lnet/minecraft/client/particle/Particle;"))
    private btf spawnParticle(bth bth2, int n2, amu amu2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        0d d8 = new 0d(n2, d2, d3, d4, d5, d6, d7);
        4t.1.post(d8);
        if (d8.isCancelled()) {
            return null;
        }
        return bth2.a(n2, amu2, d2, d3, d4, d5, d6, d7, nArray);
    }
}

