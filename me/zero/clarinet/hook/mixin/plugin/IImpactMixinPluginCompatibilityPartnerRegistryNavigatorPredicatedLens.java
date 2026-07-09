/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorHolder;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public interface IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicatedLens
extends IImpactMixinPluginCompatibilityPartnerRegistryNavigator,
IImpactMixinPluginCompatibilityPartnerRegistryNavigatorHolder,
IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate {
    @Override
    default public void accept(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        if (this.test(iImpactMixinPluginCompatibilityPartner, impactMixinPluginGraphemeHolder)) {
            this.getUnderlyingNavigator().accept(iImpactMixinPluginCompatibilityPartner, impactMixinPluginGraphemeHolder);
        }
    }
}

