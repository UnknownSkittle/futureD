/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.Set;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public interface IImpactMixinPluginAbstractFramework
extends IMixinConfigPlugin {
    @Override
    default public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    @Override
    default public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    @Override
    default public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    @Override
    default public boolean shouldApplyMixin(String string, String string2) {
        return true;
    }
}

