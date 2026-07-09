/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.stream.Stream;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinListParameterizationValueHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginMixinListParameterizationValueImpl;

public class ImpactMixinPluginCompatibilityPartnerSingularImpl
implements IImpactMixinPluginCompatibilityPartner {
    private final ImpactMixinPluginGraphemeHolder holder;

    public ImpactMixinPluginCompatibilityPartnerSingularImpl(ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        this.holder = impactMixinPluginGraphemeHolder;
    }

    @Override
    public Stream<IImpactMixinPluginMixinListParameterizationValueHolder<? extends ImpactMixinPluginGraphemeHolder>> mixins() {
        return Stream.of(new ImpactMixinPluginMixinListParameterizationValueImpl(this.holder));
    }
}

