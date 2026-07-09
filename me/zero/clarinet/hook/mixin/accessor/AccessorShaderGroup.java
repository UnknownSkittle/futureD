/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bvd
 *  ccy
 *  ccz
 */
package me.zero.clarinet.hook.mixin.accessor;

import java.util.List;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ccy.class})
public interface AccessorShaderGroup {
    @Accessor
    public List<ccz> getListShaders();

    @Accessor
    public List<bvd> getListFramebuffers();
}

