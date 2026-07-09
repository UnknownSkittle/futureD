/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.function.Consumer;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue;

public interface IImpactMixinPluginCompatibilityPartnerRegistry {
    public <R extends IImpactMixinPluginCompatibilityPartnerRegistration> ImpactMixinPluginCompatibilityPartnerRegistrySubmissionResponseValue submit(R var1);

    public void unravel(IImpactMixinPluginCompatibilityPartnerRegistryNavigator var1);

    default public Runnable adaptAdaptingSubmitter(Consumer<IImpactMixinPluginCompatibilityPartnerRegistry> consumer) {
        return () -> consumer.accept(this);
    }
}

