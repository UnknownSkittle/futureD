/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryMutableHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryHolderImpl;

public class ImpactMixinPluginCompatibilityPartnerRegistryMutableHolderImpl
extends ImpactMixinPluginCompatibilityPartnerRegistryHolderImpl
implements IImpactMixinPluginCompatibilityPartnerRegistryMutableHolder {
    @Override
    public void setUnderlyingRegistry(IImpactMixinPluginCompatibilityPartnerRegistry iImpactMixinPluginCompatibilityPartnerRegistry) {
        this.registry = iImpactMixinPluginCompatibilityPartnerRegistry;
    }
}

