/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactory;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryImplDefault;

public class ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl$ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation
implements IImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation {
    IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate predicate;
    final /* synthetic */ ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl this$0;

    public ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl$ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation(ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl, IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate) {
        this.this$0 = impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl;
        this.predicate = iImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
    }

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistry getUnderlyingRegistry() {
        return ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl.access$000(this.this$0);
    }

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactory getUnderlyingPredicatedLensFactory() {
        return new ImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLensFactoryImplDefault(this.predicate);
    }
}

