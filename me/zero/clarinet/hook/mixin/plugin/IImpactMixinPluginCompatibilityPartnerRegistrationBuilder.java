/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.function.Consumer;
import java.util.function.Function;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistration;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrationBuilderInvalidAttachmentModeException;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionAdapter;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public interface IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R extends IImpactMixinPluginCompatibilityPartnerRegistration, T extends IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R, T>> {
    public T attachPartner(IImpactMixinPluginCompatibilityPartner var1);

    public T detachPartner(IImpactMixinPluginCompatibilityPartner var1);

    default public T reevaluatePartner(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode impactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode) {
        switch (impactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode) {
            case ATTACH: {
                return this.attachPartner(iImpactMixinPluginCompatibilityPartner);
            }
            case DETACH: {
                return this.detachPartner(iImpactMixinPluginCompatibilityPartner);
            }
        }
        throw new ImpactMixinPluginCompatibilityPartnerRegistrationBuilderInvalidAttachmentModeException();
    }

    public T attachIdentifier(ImpactMixinPluginGraphemeHolder var1);

    public R coalesce();

    public static <R1 extends IImpactMixinPluginCompatibilityPartnerRegistry, B extends IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R2, B>, R2 extends IImpactMixinPluginCompatibilityPartnerRegistration> Function<IImpactMixinPluginCompatibilityPartnerRegistrationBuilder<R2, B>, Consumer<R1>> constructPreferredAdapter() {
        return new ImpactMixinPluginCompatibilityPartnerRegistrySubmissionAdapter()::constructAdaptingSubmitter;
    }
}

