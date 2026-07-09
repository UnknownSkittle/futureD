/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events;

public final class SprintStateEvent {
    private Boolean state;

    public final void setState(boolean bl2) {
        this.state = bl2;
    }

    public final Boolean getState() {
        return this.state;
    }
}

