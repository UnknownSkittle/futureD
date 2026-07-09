/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  aip
 *  akb
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={aip.class})
public class MixinItemStack {
    private int realDamage;

    @Inject(method={"<init>(Lnet/minecraft/item/Item;II)V"}, at={@At(value="RETURN")})
    private void getDamage(ain ain2, int n2, int n3, CallbackInfo callbackInfo) {
        this.realDamage = n3;
    }

    @Redirect(method={"getTooltip"}, at=@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;getItemDamage()I"))
    private int getItemDamage(aip aip2) {
        try {
            if (0ay.3().5.0(8n.class).0()) {
                return this.realDamage;
            }
        } catch (NullPointerException nullPointerException) {}
        return aip2.i();
    }

    @Redirect(method={"getTooltip"}, at=@At(value="INVOKE", target="net/minecraft/item/ItemStack.isItemDamaged()Z"))
    private boolean isItemDamaged(aip aip2) {
        try {
            if (0ay.3().5.0(8n.class).0()) {
                return true;
            }
        } catch (NullPointerException nullPointerException) {}
        return aip2.h();
    }

    @Redirect(method={"getTooltip"}, at=@At(value="INVOKE", target="net/minecraft/client/util/ITooltipFlag.isAdvanced()Z", ordinal=2))
    private boolean isAdvanced(akb akb2) {
        try {
            if (0ay.3().5.0(8n.class).0()) {
                return true;
            }
        } catch (NullPointerException nullPointerException) {}
        return akb2.a();
    }
}

