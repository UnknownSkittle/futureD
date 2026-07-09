/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events;

import baritone.api.event.events.TickEvent$Type;
import baritone.api.event.events.type.EventState;
import java.util.function.BiFunction;

public final class TickEvent {
    private static int overallTickCount;
    private final EventState state;
    private final TickEvent$Type type;
    private final int count;

    public TickEvent(EventState eventState, TickEvent$Type tickEvent$Type, int n2) {
        this.state = eventState;
        this.type = tickEvent$Type;
        this.count = n2;
    }

    public final int getCount() {
        return this.count;
    }

    public final TickEvent$Type getType() {
        return this.type;
    }

    public final EventState getState() {
        return this.state;
    }

    public static synchronized BiFunction<EventState, TickEvent$Type, TickEvent> createNextProvider() {
        return (arg_0, arg_1) -> TickEvent.lambda$createNextProvider$0(overallTickCount++, arg_0, arg_1);
    }

    private static /* synthetic */ TickEvent lambda$createNextProvider$0(int n2, EventState eventState, TickEvent$Type tickEvent$Type) {
        return new TickEvent(eventState, tickEvent$Type, n2);
    }
}

