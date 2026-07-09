/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinListParameterizationValueHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginMixinListParameterizationValueImpl
implements IImpactMixinPluginMixinListParameterizationValueHolder<ImpactMixinPluginGraphemeHolder> {
    private final ImpactMixinPluginGraphemeHolder holder;

    @Override
    public ImpactMixinPluginGraphemeHolder extract() {
        return this.holder;
    }

    public ImpactMixinPluginMixinListParameterizationValueImpl(ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        this.holder = impactMixinPluginGraphemeHolder;
    }
}

