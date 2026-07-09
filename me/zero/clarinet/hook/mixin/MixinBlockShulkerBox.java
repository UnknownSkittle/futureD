/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  atr
 *  fi
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={atr.class})
public class MixinBlockShulkerBox {
    @ModifyConstant(method={"addInformation"}, constant={@Constant(intValue=4)})
    private int tooltipLength(int n2) {
        8n n3 = 0ay.3().5.0(8n.class);
        if (n3 != null && n3.4()) {
            return n3.1.2 - 1;
        }
        return n2;
    }

    @ModifyVariable(method={"addInformation"}, at=@At(value="INVOKE", shift=At.Shift.AFTER, target="Lnet/minecraft/inventory/ItemStackHelper;loadAllItems(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/util/NonNullList;)V"))
    private fi<aip> getShulkerContent(fi<aip> fi2) {
        8n n2 = 0ay.3().5.0(8n.class);
        if (n2.4()) {
            return n2.0(fi2);
        }
        return fi2;
    }
}

