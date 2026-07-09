/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLens;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensImpl
implements IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLens {
    private final IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate predicate;
    private final IImpactMixinPluginCompatibilityPartnerRegistryNavigator navigator;

    public ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensImpl(IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate, IImpactMixinPluginCompatibilityPartnerRegistryNavigator iImpactMixinPluginCompatibilityPartnerRegistryNavigator) {
        this.predicate = iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
        this.navigator = iImpactMixinPluginCompatibilityPartnerRegistryNavigator;
    }

    @Override
    public boolean test(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        return this.predicate.test(iImpactMixinPluginCompatibilityPartner, impactMixinPluginGraphemeHolder);
    }

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistryNavigator getUnderlyingNavigator() {
        return this.navigator;
    }
}

