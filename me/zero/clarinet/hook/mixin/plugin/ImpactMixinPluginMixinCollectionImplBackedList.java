/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.clarinet.hook.mixin.plugin;

import java.util.ArrayList;
import java.util.List;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinCollection;
import me.zero.clarinet.hook.mixin.plugin.IImpactMixinPluginMixinListParameterizationValueHolder;
import me.zero.clarinet.hook.mixin.plugin.ImpactMixinPluginGraphemeHolder;

public class ImpactMixinPluginMixinCollectionImplBackedList<T extends IImpactMixinPluginMixinListParameterizationValueHolder<? extends ImpactMixinPluginGraphemeHolder>>
extends ArrayList<T>
implements IImpactMixinPluginMixinCollection<T> {
    @Override
    public List<String> adaptToMixin() {
        for (int i2 = 0; i2 < this.size(); ++i2) {
            this.set(i2, ((ImpactMixinPluginGraphemeHolder)this.getAt((int)i2).extract()).internal);
        }
        return this;
    }

    @Override
    public T getAt(int n2) {
        return (T)((IImpactMixinPluginMixinListParameterizationValueHolder)this.get(n2));
    }
}

