/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue;

public interface IImpactMixinPluginCompatibilityPartnerRegistrySubmitUnsupported
extends IImpactMixinPluginCompatibilityPartnerRegistry {
    @Override
    default public <R extends IImpactMixinPluginCompatibilityPartnerRegistration> ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue submit(R r2) {
        throw new UnsupportedOperationException("unsupported");
    }
}

