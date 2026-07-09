/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.List;
import java.util.stream.Collectors;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginAbstractFramework;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartner;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistry;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginCompatibilityPartnerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinCollection;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerCollectingUnravelerRegistryNavigator;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl$ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilderFactory;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerRegistrySubmissionAdapter;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginCompatibilityPartnerSingularImpl;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginExceptionCheckerPredicate;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolderFactory;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginMixinListBuilderFactory;
import net.minecraft.launchwrapper.Launch;

public final class ImpactMixinPlugin
implements IImpactMixinPluginAbstractFramework {
    IImpactMixinPluginCompatibilityPartnerRegistry registry = ImpactMixinPluginCompatibilityPartnerRegistryProxyBuilderFactory.coalesceRegistry();

    @Override
    public final void onLoad(String string) {
        this.createSimpleRegistration(new ImpactMixinPluginCompatibilityPartnerSingularImpl(ImpactMixinPluginGraphemeHolderFactory.create("optifine.MixinConfig")), ImpactMixinPluginGraphemeHolderFactory.create("OptiFine")).run();
        this.createSimpleRegistration(new ImpactMixinPluginCompatibilityPartnerSingularImpl(ImpactMixinPluginGraphemeHolderFactory.create("idfk some shit")), ImpactMixinPluginGraphemeHolderFactory.create("Future")).run();
        ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl = new ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl(this.registry);
        impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl.getClass();
        this.registry = new ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl$ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation(impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl, new ImpactMixinPluginExceptionCheckerPredicate(ImpactMixinPluginGraphemeHolderFactory.create("OptiFine"), () -> {
            Launch.classLoader.addClassLoaderExclusion("optifine.");
            Class.forName("optifine.OptiFineTweaker", false, Launch.classLoader);
        }));
        ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl2 = new ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl(this.registry);
        impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl2.getClass();
        this.registry = new ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl$ImpactMixinPluginCompatibilityPartnerRegistryLensedNavigation(impactMixinPluginCompatibilityPartnerRegistryLensedNavigationFactoryImpl2, new ImpactMixinPluginExceptionCheckerPredicate(ImpactMixinPluginGraphemeHolderFactory.create("Future"), () -> {
            throw new RuntimeException("Future is not here!");
        }));
    }

    private Runnable createSimpleRegistration(IImpactMixinPluginCompatibilityPartner iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginGraphemeHolder impactMixinPluginGraphemeHolder) {
        return this.registry.adaptAdaptingSubmitter(new ImpactMixinPluginCompatibilityPartnerRegistrySubmissionAdapter().constructAdaptingSubmitter(((ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular)new ImpactMixinPluginCompatibilityPartnerRegistrationBuilderImplSingular().reevaluatePartner(iImpactMixinPluginCompatibilityPartner, ImpactMixinPluginCompatibilityPartnerRegistrationBuilderAttachmentMode.ATTACH)).attachIdentifier(impactMixinPluginGraphemeHolder)));
    }

    @Override
    public final String getRefMapperConfig() {
        return "mixins.impact.refmap.json";
    }

    @Override
    public final List<String> getMixins() {
        Object object = new ImpactMixinPluginCompatibilityPartnerCollectingUnravelerRegistryNavigator();
        this.registry.unravel((IImpactMixinPluginCompatibilityPartnerRegistryNavigator)object);
        object = ((IImpactMixinPluginMixinCollection)((Object)((ImpactMixinPluginCompatibilityPartnerCollectingUnravelerRegistryNavigator)object).partners().flatMap(IImpactMixinPluginCompatibilityPartner::mixins).collect(Collectors.toCollection(new ImpactMixinPluginMixinListBuilderFactory()::construct)))).adaptToMixin();
        System.out.println("Final result for mixins is ".concat(String.valueOf(object)));
        return object;
    }
}

