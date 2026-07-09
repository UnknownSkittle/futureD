/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields
implements IImpactMixinPluginCompatibilityPartnerRegistration {
    private final IImpactMixinPluginCompatibilityPartner partner;
    private final ImpactMixinPluginGraphemeHolder identifier;

    public ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        this.partner = iImpactMixinPluginCompatibilityPartner;
        this.identifier = impactMixinPluginGraphemeHolder;
    }

    @Override
    public IImpactMixinPluginCompatibilityPartner getPartner() {
        return this.partner;
    }

    @Override
    public ImpactMixinPluginGraphemeHolder getIdentifier() {
        return this.identifier;
    }
}

