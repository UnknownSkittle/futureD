/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryHolder;

public abstract class ImpactMixinPluginCompatibilityPartnerRegistryHolderImpl
implements IImpactMixinPluginCompatibilityPartnerRegistryHolder {
    protected IImpactMixinPluginCompatibilityPartnerRegistry registry;

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistry getUnderlyingRegistry() {
        return this.registry;
    }
}

