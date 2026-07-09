/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.alpine.bus;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import me.zero.alpine.bus.EventBus;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;

public class EventManager
implements EventBus {
    private final Map<Listenable, List<Listener>> SUBSCRIPTION_CACHE = new ConcurrentHashMap<Listenable, List<Listener>>();
    private final Map<Class<?>, List<Listener>> SUBSCRIPTION_MAP = new ConcurrentHashMap();

    @Override
    public void subscribe(Listenable listenable) {
        List listeners = this.SUBSCRIPTION_CACHE.computeIfAbsent(listenable, o2 -> Arrays.stream(o2.getClass().getDeclaredFields()).filter(EventManager::isValidField).map(field -> EventManager.asListener(o2, field)).filter(Objects::nonNull).collect(Collectors.toList()));
        listeners.forEach(this::subscribe);
    }

    @Override
    public void subscribe(Listener listener) {
        int index;
        List listeners = this.SUBSCRIPTION_MAP.computeIfAbsent(listener.getTarget(), target -> new CopyOnWriteArrayList());
        for (index = 0; index < listeners.size() && listener.getPriority() >= ((Listener)listeners.get(index)).getPriority(); ++index) {
        }
        listeners.add(index, listener);
    }

    @Override
    public void subscribeAll(Listenable ... listenables) {
        Arrays.stream(listenables).forEach(this::subscribe);
    }

    @Override
    public void subscribeAll(Iterable<Listenable> listenables) {
        listenables.forEach(this::subscribe);
    }

    @Override
    public void unsubscribe(Listenable listenable) {
        List<Listener> objectListeners = this.SUBSCRIPTION_CACHE.get(listenable);
        if (objectListeners == null) {
            return;
        }
        this.SUBSCRIPTION_MAP.values().forEach(listeners -> listeners.removeIf(objectListeners::contains));
    }

    @Override
    public void unsubscribe(Listener listener) {
        this.SUBSCRIPTION_MAP.get(listener.getTarget()).removeIf(l2 -> l2.equals(listener));
    }

    @Override
    public void unsubscribeAll(Listenable ... listenables) {
        Arrays.stream(listenables).forEach(this::unsubscribe);
    }

    @Override
    public void unsubscribeAll(Iterable<Listenable> listenables) {
        listenables.forEach(this::unsubscribe);
    }

    @Override
    public void post(Object event) {
        List<Listener> listeners = this.SUBSCRIPTION_MAP.get(event.getClass());
        if (listeners != null) {
            listeners.forEach(listener -> listener.invoke(event));
        }
    }

    private static boolean isValidField(Field field) {
        return field.isAnnotationPresent(EventHandler.class) && Listener.class.isAssignableFrom(field.getType());
    }

    private static Listener asListener(Listenable listenable, Field field) {
        try {
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            Listener listener = (Listener)field.get(listenable);
            field.setAccessible(accessible);
            if (listener == null) {
                return null;
            }
            if (listener.getPriority() > 5 || listener.getPriority() < 1) {
                throw new RuntimeException("Event Priority out of bounds! %s");
            }
            return listener;
        } catch (IllegalAccessException e2) {
            return null;
        }
    }
}

