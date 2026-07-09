/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhc
 *  bhe
 *  bib
 *  bid
 *  bsb
 *  bud
 *  buq
 *  bus
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  vg
 *  vp
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0D;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0r8;
import net.impactclient.2q;
import net.impactclient.4t;
import net.impactclient.7v;
import net.impactclient.8N;
import net.impactclient.8U;
import net.impactclient.9Y;
import net.impactclient.9s;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={buq.class})
public abstract class MixinEntityRenderer {
    @Shadow
    @Final
    private bib h;
    @Shadow
    @Final
    private int[] I;
    private 2q cameraClipEvent;

    @Inject(method={"orientCamera"}, at={@At(value="HEAD")})
    private void orientCamera(CallbackInfo callbackInfo) {
        this.cameraClipEvent = new 2q();
        4t.1.post(this.cameraClipEvent);
    }

    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"))
    private bhc orientCamera$rayTraceBlocks(bsb bsb2, bhe bhe2, bhe bhe3) {
        if (this.cameraClipEvent != null && this.cameraClipEvent.isCancelled()) {
            return null;
        }
        return this.h.f.a(bhe2, bhe3);
    }

    @Inject(method={"updateCameraAndRender"}, at={@At(value="INVOKE", target="net/minecraft/util/MouseHelper.mouseXYChange()V")})
    private void updateCameraAndRender$mouseXYChange(CallbackInfo object) {
        boolean bl2;
        object = 0D.a;
        boolean bl3 = bl2 = ((0D)object).b && Keyboard.isKeyDown((int)56) && !8U.0() && !8N.6.4();
        if (((0D)object).c != bl2) {
            ((0D)object).c = bl2;
            if (0D.2.h == null) {
                ((0D)object).c = false;
                return;
            }
            ((0D)object).d = 0D.2.h.x;
            ((0D)object).e = 0D.2.h.y;
            ((0D)object).h = 0D.2.h.v;
            ((0D)object).i = 0D.2.h.w;
        }
    }

    @Redirect(method={"updateCameraAndRender"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.turn(FF)V"))
    private void updateCameraAndRender$turn(bud bud2, float f2, float f3) {
        0T t2 = 8N.6;
        if (t2.4() && t2.4 != null) {
            t2.4.c(f2, f3);
            return;
        }
        t2 = 0D.a;
        if (((0D)t2).c) {
            ((0D)t2).d = ((0D)t2).h;
            ((0D)t2).e = ((0D)t2).i;
            ((0D)t2).h = (float)((double)((0D)t2).h + (double)f2 * 0.15);
            ((0D)t2).i = (float)((double)((0D)t2).i - (double)f3 * 0.15);
            ((0D)t2).i = Math.max(-90.0f, Math.min(90.0f, ((0D)t2).i));
            if (!this.h.t.ad.e()) {
                return;
            }
        }
        bud2.c(f2, f3);
    }

    @Redirect(method={"orientCamera"}, at=@At(value="FIELD", target="net/minecraft/entity/Entity.rotationYaw:F", opcode=180))
    private float orientCamera$rotationYaw(vg vg2) {
        if (!(!0D.a.c || vg2 instanceof vp && ((vp)vg2).cz())) {
            return 0D.a.h;
        }
        return vg2.v;
    }

    @Redirect(method={"orientCamera"}, at=@At(value="FIELD", target="net/minecraft/entity/Entity.rotationPitch:F", opcode=180))
    private float orientCamera$rotationPitch(vg vg2) {
        if (!(!0D.a.c || vg2 instanceof vp && ((vp)vg2).cz())) {
            return 0D.a.i;
        }
        return vg2.w;
    }

    @Redirect(method={"orientCamera"}, at=@At(value="FIELD", target="net/minecraft/entity/Entity.prevRotationYaw:F", opcode=180))
    private float orientCamera$prevRotationYaw(vg vg2) {
        if (!(!0D.a.c || vg2 instanceof vp && ((vp)vg2).cz())) {
            return 0D.a.d;
        }
        return vg2.x;
    }

    @Redirect(method={"orientCamera"}, at=@At(value="FIELD", target="net/minecraft/entity/Entity.prevRotationPitch:F", opcode=180))
    private float orientCamera$prevRotationPitch(vg vg2) {
        if (!(!0D.a.c || vg2 instanceof vp && ((vp)vg2).cz())) {
            return 0D.a.e;
        }
        return vg2.y;
    }

    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.matrixMode(I)V", ordinal=4)})
    private void renderWorldPass$matrixMode(int n2, float f2, long l2, CallbackInfo callbackInfo) {
        9Y y2 = 0ay.3().5.0(9Y.class);
        if (!y2.4()) {
            return;
        }
        GL11.glPushAttrib((int)1048575);
        bus.s();
        bus.a((float)-1.0f, (float)-1.0f);
        bus.d((int)1032, (int)6913);
        bus.d((float)y2.0.2);
    }

    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.shadeModel(I)V", ordinal=1)})
    private void renderWorldPass$shadeModel(int n2, float f2, long l2, CallbackInfo callbackInfo) {
        if (!0ay.3().5.0(9Y.class).4()) {
            return;
        }
        GL11.glPopAttrib();
    }

    @Redirect(method={"updateLightmap"}, at=@At(value="FIELD", target="net/minecraft/client/settings/GameSettings.gammaSetting:F", opcode=180))
    private float updateLightmap$gammaSetting(bid object) {
        object = new 7v(object.aE);
        4t.1.post(object);
        return object.0;
    }

    @Inject(method={"updateLightmap"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/texture/DynamicTexture;updateDynamicTexture()V")})
    private void updateLightmap$updateDynamicTexture(float f2, CallbackInfo callbackInfo) {
        9s s2 = 0ay.3().5.0(9s.class);
        if (s2.4() && s2.4.0) {
            for (int i2 = 0; i2 < this.I.length; ++i2) {
                int n2 = this.I[i2];
                int n3 = n2 = ((n2 >> 16 & 0xFF) + (n2 >> 8 & 0xFF) + (n2 & 0xFF)) / 3;
                this.I[i2] = n2 = 0xFF000000 | (n3 | n3 << 8 | n2 << 16 | n2 << 24);
            }
        }
    }

    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="net/minecraft/entity/Entity.getCollisionBorderSize()F"))
    private float getMouseOver$getEntityBoundingBox(vg object) {
        vg vg2 = object;
        object = new 0r8(vg2, vg2.aI());
        4t.1.post(object);
        return object.1;
    }
}

