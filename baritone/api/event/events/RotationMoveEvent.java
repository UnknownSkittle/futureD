/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events;

import baritone.api.event.events.RotationMoveEvent$Type;

public final class RotationMoveEvent {
    private final RotationMoveEvent$Type type;
    private float yaw;

    public RotationMoveEvent(RotationMoveEvent$Type rotationMoveEvent$Type, float f2) {
        this.type = rotationMoveEvent$Type;
        this.yaw = f2;
    }

    public final void setYaw(float f2) {
        this.yaw = f2;
    }

    public final float getYaw() {
        return this.yaw;
    }

    public final RotationMoveEvent$Type getType() {
        return this.type;
    }
}

