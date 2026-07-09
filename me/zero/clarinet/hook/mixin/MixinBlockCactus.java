/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  ape
 *  bhb
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8t;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ape.class})
public class MixinBlockCactus {
    @Shadow
    @Final
    protected static bhb b;

    @Redirect(method={"getCollisionBoundingBox"}, at=@At(value="FIELD", target="net/minecraft/block/BlockCactus.CACTUS_COLLISION_AABB:Lnet/minecraft/util/math/AxisAlignedBB;", opcode=180))
    private bhb getCollisionBoundingBox(ape ape2) {
        if (8t.8.4() && 8t.8.1.0) {
            return aow.j;
        }
        return b;
    }
}

