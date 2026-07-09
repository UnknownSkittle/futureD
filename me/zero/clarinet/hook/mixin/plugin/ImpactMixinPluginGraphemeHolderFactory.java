/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginGraphemeHolderFactory {
    public static ImpactMixinPluginGraphemeHolder create(String string) {
        ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder = new ImpactMixinPluginGraphemeHolder();
        new ImpactMixinPluginGraphemeHolder().internal = string;
        return impactMixinPluginGraphemeHolder;
    }
}

