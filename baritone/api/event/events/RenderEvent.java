/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events;

public final class RenderEvent {
    private final float partialTicks;

    public RenderEvent(float f2) {
        this.partialTicks = f2;
    }

    public final float getPartialTicks() {
        return this.partialTicks;
    }
}

