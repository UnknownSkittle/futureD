/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.alpine.bus;

import java.util.ArrayList;
import java.util.List;
import me.zero.alpine.bus.EventBus;
import me.zero.alpine.bus.EventManager;
import me.zero.alpine.bus.type.AttachableEventBus;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;

public class AttachableEventManager
extends EventManager
implements AttachableEventBus {
    private final List<EventBus> ATTACHED_BUSES = new ArrayList<EventBus>();

    @Override
    public void subscribe(Listenable listenable) {
        super.subscribe(listenable);
        if (!this.ATTACHED_BUSES.isEmpty()) {
            this.ATTACHED_BUSES.forEach(bus2 -> bus2.subscribe(listenable));
        }
    }

    @Override
    public void subscribe(Listener listener) {
        super.subscribe(listener);
        if (!this.ATTACHED_BUSES.isEmpty()) {
            this.ATTACHED_BUSES.forEach(bus2 -> bus2.subscribe(listener));
        }
    }

    @Override
    public void unsubscribe(Listenable listenable) {
        super.unsubscribe(listenable);
        if (!this.ATTACHED_BUSES.isEmpty()) {
            this.ATTACHED_BUSES.forEach(bus2 -> bus2.unsubscribe(listenable));
        }
    }

    @Override
    public void unsubscribe(Listener listener) {
        super.unsubscribe(listener);
        if (!this.ATTACHED_BUSES.isEmpty()) {
            this.ATTACHED_BUSES.forEach(bus2 -> bus2.unsubscribe(listener));
        }
    }

    @Override
    public void post(Object event) {
        super.post(event);
        if (!this.ATTACHED_BUSES.isEmpty()) {
            this.ATTACHED_BUSES.forEach(bus2 -> bus2.post(event));
        }
    }

    @Override
    public void attach(EventBus bus2) {
        if (!this.ATTACHED_BUSES.contains(bus2)) {
            this.ATTACHED_BUSES.add(bus2);
        }
    }

    @Override
    public void detach(EventBus bus2) {
        this.ATTACHED_BUSES.remove(bus2);
    }
}

