/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryHolder;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue;

public interface IImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation
extends IImpactMixinPluginCompatibilityPartnerRegistry,
IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler,
IImpactMixinPluginCompatibilityPartnerRegistryHolder,
IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryHolder {
    @Override
    default public <R extends IImpactMixinPluginCompatibilityPartnerRegistration> ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue submit(R r2) {
        throw new UnsupportedOperationException("A lensed navigation registry is read-only!");
    }

    @Override
    default public void unravel(IImpactMixinPluginCompatibilityPartnerRegistryNavigator iImpactMixinPluginCompatibilityPartnerRegistryNavigator) {
        IImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation iImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation = this;
        IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler.super.unravel(iImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation.getUnderlyingPredicatedLensFactory().constructLens(iImpactMixinPluginCompatibilityPartnerRegistryNavigator));
    }
}

