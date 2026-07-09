/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bih
 *  bii
 *  blk
 *  bsb
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package clientapi.load.mixin;

import javax.annotation.Nullable;
import me.zero.alpine.event.EventState;
import net.impactclient.0C;
import net.impactclient.0i;
import net.impactclient.2B;
import net.impactclient.2m;
import net.impactclient.3S;
import net.impactclient.3k;
import net.impactclient.3m;
import net.impactclient.4t;
import net.impactclient.5f;
import net.impactclient.5i;
import net.impactclient.5s;
import net.impactclient.7c;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bib.class})
public abstract class MixinMinecraft
implements 2B {
    @Shadow
    public blk m;

    @Override
    @Accessor
    public abstract bih getTimer();

    @Override
    @Accessor
    public abstract void setSession(bii var1);

    @Override
    @Accessor
    public abstract void setRightClickDelayTimer(int var1);

    @Shadow
    private void aA() {
    }

    @Shadow
    private void aB() {
    }

    @Shadow
    private void aH() {
    }

    @Override
    public void clickMouse(int n2) {
        if (n2 == 0) {
            this.aA();
        }
        if (n2 == 1) {
            this.aB();
        }
        if (n2 == 2) {
            this.aH();
        }
    }

    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    private void preRunTick(CallbackInfo callbackInfo) {
        4t.1.post(new 7c(EventState.PRE));
    }

    @Inject(method={"runTick"}, at={@At(value="RETURN")})
    private void postRunTick(CallbackInfo callbackInfo) {
        4t.1.post(new 7c(EventState.POST));
    }

    @Inject(method={"runGameLoop"}, at={@At(value="HEAD")})
    private void preRunGameLoop(CallbackInfo callbackInfo) {
        4t.1.post(new 3m(EventState.PRE));
    }

    @Inject(method={"runGameLoop"}, at={@At(value="RETURN")})
    private void postRunGameLoop(CallbackInfo callbackInfo) {
        4t.1.post(new 3m(EventState.POST));
    }

    @Inject(method={"runTickKeyboard"}, at={@At(value="INVOKE_ASSIGN", target="org/lwjgl/input/Keyboard.getEventKeyState()Z", remap=false)})
    private void onKeyEvent(CallbackInfo callbackInfo) {
        if (this.m != null) {
            return;
        }
        boolean bl2 = Keyboard.getEventKeyState();
        int n2 = Keyboard.getEventKey();
        char c2 = Keyboard.getEventCharacter();
        4t.1.post(bl2 ? new 3k(n2, c2) : new 0i(n2, c2));
    }

    @Inject(method={"runTickMouse"}, at={@At(value="INVOKE_ASSIGN", id="org/lwjgl/input/Mouse.getEventButton()I")})
    private void onMouseEvent(CallbackInfo callbackInfo) {
        if (this.m != null) {
            return;
        }
        int n2 = Mouse.getEventButton();
        if (n2 >= 0) {
            boolean bl2 = Mouse.getEventButtonState();
            5s s2 = 5s.a;
            if (s2.b.length <= n2) {
                boolean[] blArray = new boolean[n2 + 1];
                System.arraycopy(s2.b, 0, blArray, 0, s2.b.length);
                s2.b = blArray;
            }
            boolean bl3 = bl2 && !s2.b[n2];
            s2.b[n2] = bl2;
            if (bl3) {
                4t.1.post(new 3S(n2));
            }
        }
    }

    @Inject(method={"init"}, at={@At(value="RETURN")})
    private void init(CallbackInfo callbackInfo) {
        4t.0();
    }

    @ModifyVariable(method={"displayGuiScreen"}, at=@At(value="HEAD"))
    private blk displayGuiScreen$HEAD(blk object) {
        object = new 5i(EventState.PRE, (blk)object);
        4t.1.post(object);
        return object.0;
    }

    @Inject(method={"displayGuiScreen"}, at={@At(value="RETURN")})
    private void displayGuiScreen$RETURN(blk blk2, CallbackInfo callbackInfo) {
        4t.1.post(new 5i(EventState.POST, blk2));
    }

    @Inject(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at={@At(value="HEAD")})
    private void loadWorld(@Nullable bsb bsb2, String string, CallbackInfo callbackInfo) {
        if (bsb2 != null) {
            4t.1.post(new 0C(bsb2));
            return;
        }
        4t.1.post(new 2m());
    }

    @Inject(method={"shutdown"}, at={@At(value="HEAD")}, cancellable=true)
    private void shutdown(CallbackInfo callbackInfo) {
        5f f2 = new 5f();
        4t.1.post(f2);
        if (f2.isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

