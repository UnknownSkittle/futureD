/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginCompatibilityPartnerCollectingUnravelerRegistryNavigator
implements IImpactMixinPluginCompatibilityPartnerRegistryNavigator {
    List<IImpactMixinPluginCompatibilityPartner> partners = new ArrayList<IImpactMixinPluginCompatibilityPartner>();

    @Override
    public void accept(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        this.partners.add(iImpactMixinPluginCompatibilityPartner);
    }

    public Stream<IImpactMixinPluginCompatibilityPartner> partners() {
        return this.partners.parallelStream();
    }
}

