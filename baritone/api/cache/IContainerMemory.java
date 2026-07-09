/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone.api.cache;

import baritone.api.cache.IRememberedInventory;
import java.util.Map;

public interface IContainerMemory {
    public IRememberedInventory getInventoryByPos(et var1);

    public Map<et, IRememberedInventory> getRememberedInventories();
}

