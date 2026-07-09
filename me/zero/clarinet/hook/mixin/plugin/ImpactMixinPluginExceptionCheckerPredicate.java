/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginExceptionCheckedRunnable;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginExceptionCheckerPredicate
implements IImpactMixinPluginCompatibilityPartnerRegistryNavigatorPredicate {
    private final ImpactMixinPluginExceptionCheckedRunnable runnable;
    private final ImpactMixinPluginGraphemeHolder target;

    public ImpactMixinPluginExceptionCheckerPredicate(ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder, ImpactMixinPluginExceptionCheckedRunnable impactMixinPluginExceptionCheckedRunnable) {
        this.runnable = impactMixinPluginExceptionCheckedRunnable;
        this.target = impactMixinPluginGraphemeHolder;
    }

    @Override
    public boolean test(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        if (!this.target.internal.equals(impactMixinPluginGraphemeHolder.internal)) {
            return true;
        }
        try {
            this.runnable.run();
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}

