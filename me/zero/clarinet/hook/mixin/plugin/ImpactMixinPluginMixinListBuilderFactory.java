/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinCollection;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinListParameterizationValueHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginMixinCollectionImplBackedList;

public class ImpactMixinPluginMixinListBuilderFactory<U extends ImpactMixinPluginGraphemeHolder> {
    public <J extends IImpactMixinPluginMixinListParameterizationValueHolder<U>, T extends IImpactMixinPluginMixinCollection<J>> T construct() {
        return (T)new ImpactMixinPluginMixinCollectionImplBackedList();
    }
}

