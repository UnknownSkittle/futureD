/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  bud
 *  vg
 *  vp
 */
package baritone.launch.mixins;

import baritone.api.BaritoneAPI;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.RotationMoveEvent$Type;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={vp.class})
public abstract class MixinEntityLivingBase
extends vg {
    private RotationMoveEvent jumpRotationEvent;

    public MixinEntityLivingBase(amu amu2, RotationMoveEvent rotationMoveEvent) {
        super(amu2);
        this.jumpRotationEvent = rotationMoveEvent;
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")})
    private void preMoveRelative(CallbackInfo object) {
        if (bud.class.isInstance((Object)this) && (object = BaritoneAPI.getProvider().getBaritoneForPlayer((bud)this)) != null) {
            this.jumpRotationEvent = new RotationMoveEvent(RotationMoveEvent$Type.JUMP, this.v);
            object.getGameEventHandler().onPlayerRotationMove(this.jumpRotationEvent);
        }
    }

    @Redirect(method={"jump"}, at=@At(value="FIELD", opcode=180, target="net/minecraft/entity/EntityLivingBase.rotationYaw:F"))
    private float overrideYaw(vp vp2) {
        if (vp2 instanceof bud && BaritoneAPI.getProvider().getBaritoneForPlayer((bud)this) != null) {
            return this.jumpRotationEvent.getYaw();
        }
        return vp2.v;
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="net/minecraft/entity/EntityLivingBase.moveRelative(FFFF)V"))
    private void travel(vp object, float f2, float f3, float f4, float f5) {
        if (!bud.class.isInstance((Object)this) || BaritoneAPI.getProvider().getBaritoneForPlayer((bud)this) == null) {
            this.b(f2, f3, f4, f5);
            return;
        }
        object = new RotationMoveEvent(RotationMoveEvent$Type.MOTION_UPDATE, this.v);
        BaritoneAPI.getProvider().getBaritoneForPlayer((bud)this).getGameEventHandler().onPlayerRotationMove((RotationMoveEvent)object);
        float f6 = this.v;
        this.v = ((RotationMoveEvent)object).getYaw();
        this.b(f2, f3, f4, f5);
        this.v = f6;
    }
}

