/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  blk
 */
package baritone.launch.mixins;

import baritone.gf;
import java.net.URI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={blk.class})
public abstract class MixinGuiScreen
implements gf {
    @Override
    @Invoker(value="openWebLink")
    public abstract void openLink(URI var1);
}

