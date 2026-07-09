/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistrationBuilder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular
implements IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields, ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular> {
    private IImpactMixinPluginCompatibilityPartner partner;
    private ImpactMixinPluginGraphemeHolder identifier;

    @Override
    public ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular attachPartner(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner) {
        if (this.partner != null) {
            throw new UnsupportedOperationException("Only one attached partner is permitted in singular builder impl mode!");
        }
        this.partner = iImpactMixinPluginCompatibilityPartner;
        return this;
    }

    @Override
    public ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular detachPartner(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner) {
        if (this.partner != iImpactMixinPluginCompatibilityPartner) {
            throw new UnsupportedOperationException("This partner is not attached!");
        }
        this.partner = null;
        return this;
    }

    @Override
    public ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular attachIdentifier(ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        this.identifier = impactMixinPluginGraphemeHolder;
        return this;
    }

    @Override
    public ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields coalesce() {
        return new ImpactMixinPluginCompatibilityPartnerRegistrationImplBackedFields(this.partner, this.identifier);
    }
}

