/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.behavior.ILookBehavior;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.RotationMoveEvent$Type;
import baritone.api.utils.Rotation;
import baritone.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d
extends b
implements ILookBehavior {
    public Rotation a;
    private boolean a;
    private float a;

    public d(a a2) {
        super(a2);
    }

    @Override
    public final void updateTarget(Rotation rotation, boolean bl2) {
        this.a = rotation;
        this.a = bl2 || (Boolean)baritone.a.a().freeLook.value == false;
    }

    @Override
    public final void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent) {
        if (this.a == null) {
            return;
        }
        boolean bl2 = (Boolean)baritone.a.a().antiCheatCompatibility.value != false && !this.a;
        switch (playerUpdateEvent.getState()) {
            case PRE: {
                if (this.a) {
                    float f2;
                    this.a.player().v = this.a.getYaw();
                    float f3 = this.a.player().w;
                    this.a.player().w = f2 = this.a.getPitch();
                    this.a.player().v = (float)((double)this.a.player().v + (Math.random() - 0.5) * (Double)baritone.a.a().randomLooking.value);
                    this.a.player().w = (float)((double)this.a.player().w + (Math.random() - 0.5) * (Double)baritone.a.a().randomLooking.value);
                    if (f2 == f3 && !((Boolean)baritone.a.a().freeLook.value).booleanValue()) {
                        d d2;
                        d d3 = this;
                        if (d2.a.player().w < -20.0f) {
                            d3.a.player().w += 1.0f;
                        } else if (d3.a.player().w > 10.0f) {
                            d3.a.player().w -= 1.0f;
                        }
                    }
                    this.a = null;
                }
                if (!bl2) break;
                this.a = this.a.player().v;
                this.a.player().v = this.a.getYaw();
                return;
            }
            case POST: {
                if (!bl2) break;
                this.a.player().v = this.a;
                this.a = null;
            }
        }
    }

    @Override
    public final void onPlayerRotationMove(RotationMoveEvent rotationMoveEvent) {
        if (this.a != null) {
            rotationMoveEvent.setYaw(this.a.getYaw());
            if (!((Boolean)baritone.a.a().antiCheatCompatibility.value).booleanValue() && rotationMoveEvent.getType() == RotationMoveEvent$Type.MOTION_UPDATE && !this.a) {
                this.a = null;
            }
        }
    }
}

