/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bib
 *  bip
 *  bit
 *  bja
 *  blc
 *  ble
 *  blk
 *  blr
 *  blt
 *  bnf
 *  bok
 *  buk
 *  bus
 *  bus$l
 *  bus$r
 *  bve
 *  cdg
 *  cdy
 *  cey
 *  hn
 *  ho
 *  net.minecraft.realms.RealmsBridge
 *  nf
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package me.zero.clarinet.hook.mixin.gui;

import com.google.common.util.concurrent.Runnables;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Nullable;
import net.impactclient.0;
import net.impactclient.0G;
import net.impactclient.0H;
import net.impactclient.0ay;
import net.impactclient.0rB;
import net.impactclient.0rH;
import net.impactclient.1;
import net.impactclient.1A;
import net.impactclient.1s;
import net.impactclient.2;
import net.impactclient.2M;
import net.impactclient.2O;
import net.impactclient.2w;
import net.impactclient.3K;
import net.impactclient.3U;
import net.impactclient.3o;
import net.impactclient.3v;
import net.impactclient.5P;
import net.impactclient.5e;
import net.impactclient.62;
import net.impactclient.6O;
import net.impactclient.75;
import net.impactclient.7Q;
import net.impactclient.7s;
import net.impactclient.8U;
import net.impactclient.95;
import net.impactclient.9P;
import net.minecraft.realms.RealmsBridge;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={blr.class})
public abstract class MixinGuiMainMenu
extends blk {
    private static bip FONT = 62.0;
    private static bip TITLE_FONT = 62.2;
    private static 0ay impact;
    private static 9P config;
    private static String MOTD;
    private static List<String> brandings;
    private 3K particleHandler;
    private 2 impactCredits;
    @Shadow
    private float t;
    @Shadow
    private nf J;
    @Shadow
    private cdg u;

    @Shadow
    public abstract void b();

    @Shadow
    protected abstract void c(int var1, int var2, float var3);

    @Shadow
    public abstract void a(boolean var1, int var2);

    @Inject(method={"initGui"}, at={@At(value="HEAD")}, cancellable=true)
    private void preInit(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (impact == null) {
            impact = 0ay.3();
        }
        if (impact != null) {
            if (config == null) {
                config = MixinGuiMainMenu.impact.5.0(9P.class);
            }
            if (TITLE_FONT == null) {
                TITLE_FONT = 62.2;
            }
            if (FONT == null) {
                FONT = 62.0;
            }
            if (MOTD == null) {
                if (7Q.0 == null) {
                    7Q.0 = 7Q.0().trim();
                }
                MOTD = 7Q.0;
            }
            if (this.particleHandler == null) {
                this.particleHandler = new 7s();
            }
            if (brandings == null && 2M.1().0()) {
                brandings = 2M.1().3();
            }
            this.setSkin(null);
            if (MixinGuiMainMenu.config.4.0 && !MixinGuiMainMenu.config.3.0) {
                this.u = new cdg(256, 256);
                this.J = this.j.N().a("background", this.u);
            }
            this.impactCredits = new 2(-1, 4, 15, 5e.a, "Created by " + a.h.toString() + "Brady, LeafHacker, and leijurv.", () -> this.j.a((blk)new 3U(this)));
            this.b(this.impactCredits);
            this.impactCredits.0(MixinGuiMainMenu.config.4.0 ? FONT : this.q);
            if (MixinGuiMainMenu.config.4.0) {
                int n2;
                int n3 = this.m / 2 - 30;
                int n4 = n3 + 58 - 45;
                int n5 = n2 = this.l / 2;
                this.b(new 2(9, this.l - 4, 4, 5e.c, Display.getTitle() + "\nCopyright Mojang AB\nDo not distribute", () -> this.j.a((blk)new blt(false, Runnables.doNothing()))));
                Object object = new 3o(FONT, n2, n3, 5e.b, MOTD);
                this.b((bja)object);
                n4 += ((3o)((Object)object)).1() * ((3o)((Object)object)).4.size();
                if (brandings != null) {
                    object = new StringJoiner("\n");
                    brandings.forEach(((StringJoiner)object)::add);
                    object = (2)this.b(new 2(10, 4, this.m - 4, 5e.a, ((StringJoiner)object).toString(), () -> {
                        try {
                            this.j.a((blk)Class.forName("net.minecraftforge.fml.client.GuiModList").getConstructor(blk.class).newInstance(new Object[]{this}));
                            return;
                        } catch (Exception exception) {
                            return;
                        }
                    }));
                    ((2)((Object)object)).i -= ((1)((Object)object)).0();
                }
                this.b(new 1(11, n2 -= 117, n4, 65, 15, cey.a((String)"menu.singleplayer", (Object[])new Object[0]), () -> this.j.a((blk)new bok((blk)this))));
                this.b(new 1(12, n2 += 85, n4, 65, 15, StringUtils.remove(cey.a((String)"menu.online", (Object[])new Object[0]), "Minecraft "), () -> new RealmsBridge().switchToRealms((blk)this)));
                this.b(new 1(13, n2 += 85, n4, 65, 15, cey.a((String)"menu.multiplayer", (Object[])new Object[0]), () -> this.j.a((blk)new bnf((blk)this))));
                n2 = n5;
                this.b(new 1(21, n2 -= 117, n4 += 30, 65, 15, StringUtils.remove(cey.a((String)"menu.options", (Object[])new Object[0]), '.'), () -> {
                    MixinGuiMainMenu mixinGuiMainMenu = this;
                    this.j.a((blk)new ble((blk)mixinGuiMainMenu, mixinGuiMainMenu.j.t));
                }));
                this.b(new 1(brandings == null ? 23 : 31, n2 += 85, n4, 65, 15, brandings == null ? "Alts" : StringUtils.remove(cey.a((String)"options.language", (Object[])new Object[0]), '.'), () -> {
                    if (brandings == null) {
                        this.j.a((blk)new 3v(this));
                        return;
                    }
                    MixinGuiMainMenu mixinGuiMainMenu = this;
                    this.j.a((blk)new blc((blk)mixinGuiMainMenu, mixinGuiMainMenu.j.t, this.j.Q()));
                }));
                this.b(new 1(420, n2 += 85, n4, 65, 15, "Impact", () -> this.j.a((blk)new 0rH(this))));
                if (brandings == null) {
                    this.b(new 1(31, 4, this.m - 24, 58, 20, StringUtils.remove(cey.a((String)"options.language", (Object[])new Object[0]), '.'), () -> {
                        MixinGuiMainMenu mixinGuiMainMenu = this;
                        this.j.a((blk)new blc((blk)mixinGuiMainMenu, mixinGuiMainMenu.j.t, this.j.Q()));
                    }));
                }
                this.b(new 1(32, this.l / 2 - 29, this.m - 24, 58, 20, cey.a((String)"menu.quit", (Object[])new Object[0]), () -> ((bib)this.j).n()));
                this.b(new 1(33, this.l - 62, this.m - 24, 58, 20, cey.a((String)"options.particles", (Object[])new Object[0]), () -> {
                    int n2 = ((0rB)this.particleHandler.4()).0().ordinal();
                    if (++n2 >= 6O.values().length) {
                        n2 = 0;
                    }
                    0rB.0(6O.values()[n2]);
                }));
                this.particleHandler.1(this.l, this.m);
                callbackInfo.cancel();
            }
        }
    }

    private void setSkin(@Nullable String string) {
        if (string != null && !string.isEmpty()) {
            0ay.0a.error("Setting skin to custom skin \"{}\"", (Object)string);
            0G.0.0(string);
            return;
        }
        0ay.0a.error("Setting skin to impaste");
        0G.0.0("impact");
    }

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void postInit(CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        this.insertButton();
    }

    @Inject(method={"actionPerformed"}, at={@At(value="HEAD")}, cancellable=true)
    private void preAction(bja bja2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (MixinGuiMainMenu.config.4.0) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"drawScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void preDraw(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (MixinGuiMainMenu.config.4.0) {
            this.t += f2;
            bus.d();
            this.c(n2, n3, f2);
            bus.e();
            if (!MixinGuiMainMenu.config.3.0) {
                this.a(0, 0, this.l, this.m, -2130706433, 0xFFFFFF);
                this.a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
            }
            1s s2 = this.getMouseOffset(n2, n3);
            bus.G();
            bus.c((float)s2.1, (float)s2.0, (float)0.0f);
            if (this.particleHandler != null) {
                this.particleHandler.0((int)((float)n2 - s2.1), (int)((float)n3 - s2.0));
            }
            bus.H();
            this.drawImpactMenu(n2, n3, f2);
            this.drawInfoText(FONT, 4, 4);
            super.a(n2, n3, f2);
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/GuiMainMenu;drawGradientRect(IIIIII)V"))
    private void drawScreenGradient(blr blr2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (8U.0() || !MixinGuiMainMenu.config.3.0) {
            this.a(n2, n3, n4, n5, n6, n7);
        }
    }

    @Inject(method={"drawScreen"}, at={@At(value="INVOKE", ordinal=0, target="Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V", shift=At.Shift.AFTER)})
    private void postDraw(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        MixinGuiMainMenu mixinGuiMainMenu = this;
        mixinGuiMainMenu.drawInfoText(mixinGuiMainMenu.q, 4, 4);
    }

    @Inject(method={"renderSkybox"}, at={@At(value="HEAD")}, cancellable=true)
    private void preSkybox(int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        if (MixinGuiMainMenu.config.3.0) {
            this.drawBackground(n2, n3);
            callbackInfo.cancel();
        }
    }

    @Inject(method={"keyTyped"}, at={@At(value="HEAD")}, cancellable=true)
    private void onKeyTyped(char c2, int n2, CallbackInfo callbackInfo) {
        if (8U.0()) {
            return;
        }
        75 var1_2 = MixinGuiMainMenu.impact.5.0(95.class).0();
        if (n2 == var1_2.0) {
            var1_2.2();
            callbackInfo.cancel();
        }
    }

    private void insertButton() {
        if (impact != null && MixinGuiMainMenu.impact.5.0(9P.class).0.0) {
            return;
        }
        bja bja2 = null;
        bja bja3 = null;
        for (bja bja4 : this.n) {
            switch (bja4.k) {
                case 6: {
                    bja2 = bja4;
                    break;
                }
                case 14: {
                    bja3 = bja4;
                }
            }
        }
        if (bja3 == null) {
            0ay.0a.error("Couldn't inject button into GuiMainMenu, Realms button not found");
            return;
        }
        int n2 = bja3.h;
        int n3 = bja3.i;
        if (bja2 != null) {
            for (bja bja5 : this.n) {
                n3 = this.m / 4 + 48;
                if ((n3 = (bja5.i - n3) % 24) > 0) {
                    bja5.i -= n3;
                }
                bja5.i -= 12;
            }
            bja3.j = cey.a((String)"menu.online", (Object[])new Object[0]);
            bja3.a(200);
            bja3.h = this.l / 2 - 100;
            n3 = bja2.i += 24;
            for (bja bja5 : this.n) {
                if (bja5.i < n3 || bja5.equals(bja2)) continue;
                bja5.i += 24;
            }
        } else {
            bja3.j = cey.a((String)"menu.online", (Object[])new Object[0]).replaceAll("Minecraft\\s*", "");
            bja3.a(98);
            bja3.h = this.l / 2 + 2;
        }
        this.b(new 0(420, n2, n3, 98, 20, impact == null ? "" : "Impact", () -> this.j.a((blk)new 0rH(this))));
    }

    private void drawImpactMenu(int n2, int n3, float f2) {
        String string = "Impact";
        String string2 = "4.9.1";
        1A.0((float)this.l / 2.0f - 150.0f, (float)this.m / 2.0f - 80.0f, (float)this.l / 2.0f + 150.0f, (float)this.m / 2.0f + 80.0f, 1.0f, 0, Integer.MIN_VALUE);
        TITLE_FONT.a(string, (float)this.l / 2.0f - (float)TITLE_FONT.a(string) / 2.0f, (float)this.m / 2.0f - 60.0f, -1);
        FONT.a(string2, (float)this.l / 2.0f + (float)FONT.a(string) / 2.0f - 6.0f, (float)this.m / 2.0f - 63.0f, -1);
    }

    private void drawInfoText(bip bip2, int n2, int n3) {
        int n4 = bip2.a + 2;
        boolean bl2 = impact != null && !MixinGuiMainMenu.impact.5.0(9P.class).0.0;
        if (bl2) {
            this.drawIcon(n2, n3);
            this.drawWatermark(bip2, this.iconOffset(n2), n3);
            this.drawUserLogin(bip2, n2, n3 + (n4 << 1));
        }
        this.impactCredits.m = bl2;
        this.impactCredits.i = n3 + n4;
    }

    private void drawWatermark(bip bip2, int n2, int n3) {
        Object object = 0H.1().0;
        int n4 = ((5P)object).1().orElse(-1);
        object = ((5P)object).0();
        ho ho2 = new ho("");
        ho2.a(new ho("Impact").a(new hn().a(a.p)));
        if (!((String)object).isEmpty()) {
            ho2.a(" ".concat(String.valueOf(object)));
        }
        ho2.a(new ho(" 4.9.1").a(new hn().a(a.h)));
        this.c(bip2, ho2.d(), n2, n3, n4);
    }

    private void drawUserLogin(bip bip2, int n2, int n3) {
        int n4 = 0H.1().0().2().orElse(-1);
        ho ho2 = new ho("");
        ho2.a(new ho("Logged in as ").a(new hn().a(a.p)));
        ho2.a(this.j.K().c());
        this.c(bip2, ho2.d(), n2, n3, n4);
    }

    private void drawBackground(int n2, int n3) {
        bus.G();
        bit bit2 = new bit(this.j);
        float f2 = (float)bit2.a() / 2.0f;
        float f3 = (float)bit2.b() / 2.0f;
        1s s2 = this.getMouseOffset(n2, n3);
        s2 = new 1s(s2.1 * 0.5f, s2.0 * 0.5f);
        bus.c((float)s2.1, (float)s2.0, (float)0.0f);
        bus.c((float)f2, (float)f3, (float)0.0f);
        bus.a((double)1.25, (double)1.25, (double)1.0);
        bus.c((float)(-f2), (float)(-f3), (float)0.0f);
        bus.j();
        bus.a((boolean)false);
        bus.a((bus.r)bus.r.l, (bus.l)bus.l.j, (bus.r)bus.r.e, (bus.l)bus.l.n);
        bus.c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bus.d();
        this.j.N().a(0G.0.1.0);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        s2 = bve.a();
        buk buk2 = s2.c();
        buk2.a(7, cdy.g);
        buk2.b(0.0, (double)bit2.b(), -90.0).a(0.0, 1.0).d();
        buk2.b((double)bit2.a(), (double)bit2.b(), -90.0).a(1.0, 1.0).d();
        buk2.b((double)bit2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        buk2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        s2.b();
        bus.a((boolean)true);
        bus.k();
        bus.e();
        bus.c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        1A.0(0.0f, 0.0f, (float)this.l, (float)this.m, 2w.1(0.0f, 0.0f, 0.0f, 0.15f));
        bus.H();
    }

    private void drawIcon(int n2, int n3) {
        this.getIcon().ifPresent(nf2 -> 2O.0(nf2, n2, n3, 8));
    }

    private int iconOffset(int n2) {
        if (this.getIcon().isPresent()) {
            return n2 + 10;
        }
        return n2;
    }

    private Optional<nf> getIcon() {
        return 0H.1().0.2();
    }

    private 1s getMouseOffset(int n2, int n3) {
        bit bit2 = new bit(this.j);
        float f2 = ((float)n2 - (float)bit2.a() / 2.0f) / -50.0f;
        float f3 = ((float)n3 - (float)bit2.b() / 2.0f) / -50.0f;
        return new 1s(f2, f3);
    }
}

