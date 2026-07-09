/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  awt
 *  axp
 *  aya
 *  qw
 */
package baritone.launch.mixins;

import baritone.gb;
import baritone.gc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={axp.class})
public abstract class MixinBlockStateContainer
implements gc {
    @Shadow
    protected qw b;
    @Shadow
    protected aya c;

    @Override
    public awt getAtPalette(int n2) {
        return this.c.a(n2);
    }

    @Override
    public int[] storageArray() {
        return ((gb)this.b).toArray();
    }
}

