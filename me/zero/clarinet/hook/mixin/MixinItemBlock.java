/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ahb
 *  amu
 *  awt
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.3q;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ahb.class})
public class MixinItemBlock {
    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="net/minecraft/world/World.setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)Z"))
    private boolean setBlockState(amu amu2, et et2, awt awt2, int n2) {
        3q q2 = new 3q(et2);
        4t.1.post(q2);
        if (q2.isCancelled()) {
            return false;
        }
        return amu2.a(et2, awt2, n2);
    }
}

