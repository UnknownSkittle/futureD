/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryHolder;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;

public interface IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler
extends IImpactMixinPluginCompatibilityPartnerRegistry,
IImpactMixinPluginCompatibilityPartnerRegistryHolder {
    @Override
    default public void unravel(IImpactMixinPluginCompatibilityPartnerRegistryNavigator iImpactMixinPluginCompatibilityPartnerRegistryNavigator) {
        this.getUnderlyingRegistry().unravel(iImpactMixinPluginCompatibilityPartnerRegistryNavigator);
    }
}

