/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.List;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinListParameterizationValueHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public interface IImpactMixinPluginMixinCollection<P extends IImpactMixinPluginMixinListParameterizationValueHolder<? extends ImpactMixinPluginGraphemeHolder>> {
    public List<String> adaptToMixin();

    public P getAt(int var1);
}

