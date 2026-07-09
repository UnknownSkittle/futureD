/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.alpine.bus;

import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;

public interface EventBus {
    public void subscribe(Listenable var1);

    public void subscribe(Listener var1);

    public void subscribeAll(Listenable ... var1);

    public void subscribeAll(Iterable<Listenable> var1);

    public void unsubscribe(Listenable var1);

    public void unsubscribe(Listener var1);

    public void unsubscribeAll(Listenable ... var1);

    public void unsubscribeAll(Iterable<Listenable> var1);

    public void post(Object var1);
}

