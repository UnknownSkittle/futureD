/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistrationHolder;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistrySubmitUnsupported;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryHolderImpl;

public abstract class ImpactMixinPluginCompatibilityPartnerRegistryProxy
extends ImpactMixinPluginCompatibilityPartnerRegistryHolderImpl
implements IImpactMixinPluginCompatibilityPartnerRegistrationHolder,
IImpactMixinPluginCompatibilityPartnerRegistry,
IImpactMixinPluginCompatibilityPartnerRegistrySubmitUnsupported {
    @Override
    public void unravel(IImpactMixinPluginCompatibilityPartnerRegistryNavigator iImpactMixinPluginCompatibilityPartnerRegistryNavigator) {
        if (this.getUnderlyingRegistry() != null) {
            this.getUnderlyingRegistry().unravel(iImpactMixinPluginCompatibilityPartnerRegistryNavigator);
        }
        iImpactMixinPluginCompatibilityPartnerRegistryNavigator.accept(this.getUnderlyingRegistration().getPartner(), this.getUnderlyingRegistration().getIdentifier());
    }

    public ImpactMixinPluginCompatibilityPartnerRegistryProxy withUnderlying(IImpactMixinPluginCompatibilityPartnerRegistry iImpactMixinPluginCompatibilityPartnerRegistry) {
        this.registry = iImpactMixinPluginCompatibilityPartnerRegistry;
        return this;
    }
}

