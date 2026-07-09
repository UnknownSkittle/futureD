/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryMutableHolderImpl;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder$1;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue;

public class ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder
extends ImpactMixinPluginCompatibilityPartnerRegistryMutableHolderImpl
implements IImpactMixinPluginCompatibilityPartnerRegistryDelegatedSubregistryUnraveler {
    @Override
    public <R extends IImpactMixinPluginCompatibilityPartnerRegistration> ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue submit(R r2) {
        this.setUnderlyingRegistry(new ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilder$1(this, r2).withUnderlying(this.getUnderlyingRegistry()));
        return ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue.SUCCESS;
    }
}

