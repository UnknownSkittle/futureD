/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLens;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactory;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensImpl;

public class ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryImplDefault
implements IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactory {
    private final IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate predicate;

    public ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryImplDefault(IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate) {
        this.predicate = iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
    }

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLens constructLens(IImpactMixinPluginCompatibilityPartnerRegistryNavigator iImpactMixinPluginCompatibilityPartnerRegistryNavigator) {
        return new ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensImpl(this.predicate, iImpactMixinPluginCompatibilityPartnerRegistryNavigator);
    }
}

