/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.function.Consumer;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistrationBuilder;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;

public class ImpactMixinPluginCompatibilityPartnerRegistrySubmissionAdapter<R1 extends IImpactMixinPluginCompatibilityPartnerRegistry> {
    <B extends IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R2, B>, R2 extends IImpactMixinPluginCompatibilityPartnerRegistration> Consumer<R1> constructAdaptingSubmitter(IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R2, B> iImpactMixinPluginCompatibilityPartnerRegistrationBuilder) {
        return iImpactMixinPluginCompatibilityPartnerRegistry -> iImpactMixinPluginCompatibilityPartnerRegistry.submit(iImpactMixinPluginCompatibilityPartnerRegistrationBuilder.coalesce());
    }
}

