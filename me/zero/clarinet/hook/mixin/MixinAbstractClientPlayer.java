/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  amu
 *  bsc
 *  bua
 *  com.mojang.authlib.GameProfile
 *  nf
 */
package me.zero.clarinet.hook.mixin;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;
import net.impactclient.09;
import net.impactclient.0H;
import net.impactclient.0ay;
import net.impactclient.47;
import net.impactclient.6;
import net.impactclient.7b;
import net.impactclient.8U;
import net.impactclient.9V;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={bua.class})
public abstract class MixinAbstractClientPlayer
extends aed {
    private static final int ofErrorsLimit = 100;
    private int ofErrorsCount = 0;
    @Unique
    private static Field locationOfCapeField = null;

    @Shadow
    protected abstract bsc b();

    public MixinAbstractClientPlayer(amu amu2, GameProfile gameProfile) {
        super(amu2, gameProfile);
    }

    @Inject(method={"getLocationCape"}, at={@At(value="RETURN")}, cancellable=true)
    private void getLocationCape(CallbackInfoReturnable<nf> callbackInfoReturnable) {
        block9: {
            6 var3_3;
            block8: {
                47 var4_4;
                if (8U.0()) {
                    return;
                }
                Object object = 0ay.3().5.0(9V.class);
                if (object == null) {
                    0ay.0a.error("Capes config was null in hook");
                    return;
                }
                if (!((7b)object).4()) {
                    return;
                }
                var3_3 = 0H.0(this);
                if (var3_3 == null) {
                    return;
                }
                if (0H.1().equals(var3_3) && (var4_4 = (47)((Object)((9V)object).1.1())) != 47.d) {
                    object = var4_4 == 47.a ? this.getVanillaCape() : (var4_4 == 47.b ? this.getOptiFineCape() : (var4_4 == 47.c ? 0H.1().0().4() : Optional.empty()));
                    callbackInfoReturnable.setReturnValue((nf)((Optional)object).orElse(null));
                    return;
                }
                if (0H.1().equals(var3_3)) break block8;
                if (!((9V)object).0.0().booleanValue()) break block9;
            }
            var3_3.0().4().ifPresent(callbackInfoReturnable::setReturnValue);
        }
    }

    private Optional<nf> getVanillaCape() {
        bsc bsc2 = this.b();
        if (bsc2 != null) {
            return Optional.ofNullable(bsc2.h());
        }
        return Optional.empty();
    }

    private Optional<nf> getOptiFineCape() {
        if (!09.0() || this.ofErrorsCount > 100) {
            return Optional.empty();
        }
        try {
            if (locationOfCapeField == null) {
                locationOfCapeField = bua.class.getDeclaredField("locationOfCape");
                locationOfCapeField.setAccessible(true);
            }
            if (locationOfCapeField != null) {
                return Optional.ofNullable((nf)locationOfCapeField.get((Object)this));
            }
        } catch (IllegalAccessError | IllegalAccessException throwable) {
            0ay.0a.error("Error accessing OptiFine cape", throwable);
            ++this.ofErrorsCount;
        } catch (ClassCastException classCastException) {
            0ay.0a.error("Error casting OptiFine cape to ResourceLocation (" + nf.class.getName() + ")", (Throwable)classCastException);
            ++this.ofErrorsCount;
        } catch (NoSuchFieldError | NoSuchFieldException throwable) {
            String string3 = Optional.ofNullable(((Object)((Object)this)).getClass().getCanonicalName()).orElse("Anonymous: " + ((Object)((Object)this)).getClass().getName());
            String string4 = Arrays.stream(((Object)((Object)this)).getClass().getDeclaredFields()).map(Field::getName).filter(string -> string.length() > 1).filter(string -> !string.startsWith("field_")).reduce((string, string2) -> string + ", " + string2).orElse("No fields found!");
            0ay.0a.error("Error accessing OptiFine cape: Cannot find locationOfCape on `" + string3 + "`: Declared fields: `" + string4 + "`", throwable);
            ++this.ofErrorsCount;
        } catch (Throwable throwable) {
            0ay.0a.error("Unexpected error getting OptiFine cape: ", throwable);
            ++this.ofErrorsCount;
        }
        return Optional.empty();
    }
}

