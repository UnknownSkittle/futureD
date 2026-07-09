/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.listener;

import baritone.api.event.listener.IGameEventListener;

public interface IEventBus
extends IGameEventListener {
    public void registerEventListener(IGameEventListener var1);
}

