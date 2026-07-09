/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public interface IImpactMixinPluginCompatibilityPartnerRegistration {
    public IImpactMixinPluginCompatibilityPartner getPartner();

    public ImpactMixinPluginGraphemeHolder getIdentifier();
}

