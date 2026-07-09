/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package clientapi.load.mixin;

import net.impactclient.4t;
import net.impactclient.5n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={bip.class})
public abstract class MixinFontRenderer {
    @ModifyVariable(method={"renderStringAtPos"}, at=@At(value="HEAD"))
    private String renderStringAtPos(String object) {
        object = new 5n((String)object);
        4t.1.post(object);
        return ((5n)object).0;
    }

    @ModifyVariable(method={"getStringWidth"}, at=@At(value="HEAD"))
    private String getStringWidth(String object) {
        object = new 5n((String)object);
        4t.1.post(object);
        return ((5n)object).0;
    }
}

