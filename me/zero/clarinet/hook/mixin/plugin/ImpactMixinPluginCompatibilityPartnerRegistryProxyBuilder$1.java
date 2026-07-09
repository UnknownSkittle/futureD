/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryProxy;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder;

class ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder$1
extends ImpactMixinPluginCompatibilityPartnerRegistryProxy {
    final /* synthetic */ IImpactMixinPluginCompatibilityPartnerRegistration val$registration;
    final /* synthetic */ ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder this$0;

    ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder$1(ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder impactMixinPluginCompatibilityPartnerRegistryProxyBuilder, IImpactMixinPluginCompatibilityPartnerRegistration iImpactMixinPluginCompatibilityPartnerRegistration) {
        this.this$0 = impactMixinPluginCompatibilityPartnerRegistryProxyBuilder;
        this.val$registration = iImpactMixinPluginCompatibilityPartnerRegistration;
    }

    @Override
    public IImpactMixinPluginCompatibilityPartnerRegistration getUnderlyingRegistration() {
        return this.val$registration;
    }
}

