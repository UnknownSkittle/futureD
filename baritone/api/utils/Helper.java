/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bib
 *  hh
 *  ho
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import baritone.api.utils.Helper$1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface Helper {
    public static final Helper HELPER = new Helper$1();
    public static final bib mc = bib.z();

    public static hh getPrefix() {
        boolean bl2;
        Calendar calendar = Calendar.getInstance();
        boolean bl3 = bl2 = calendar.get(2) == 3 && calendar.get(5) <= 3;
        ho ho2 = new ho(bl2 ? "Baritoe" : ((Boolean)BaritoneAPI.getSettings().shortBaritonePrefix.value != false ? "B" : "Baritone"));
        ho2.b().a(a.n);
        ho ho3 = new ho("");
        ho3.b().a(a.f);
        ho3.a("[");
        ho3.a((hh)ho2);
        ho3.a("]");
        return ho3;
    }

    default public void logDebug(String string) {
        if (!((Boolean)BaritoneAPI.getSettings().chatDebug.value).booleanValue()) {
            return;
        }
        this.logDirect(string);
    }

    default public void logDirect(hh ... hhArray) {
        ho ho2 = new ho("");
        ho2.a(Helper.getPrefix());
        ho2.a((hh)new ho(" "));
        Arrays.asList(hhArray).forEach(arg_0 -> ((hh)ho2).a(arg_0));
        bib.z().a(() -> Helper.lambda$logDirect$0((hh)ho2));
    }

    default public void logDirect(String string2, a a2) {
        Stream.of(string2.split("\n")).forEach(string -> {
            string = new ho(string.replace("\t", "    "));
            string.b().a(a2);
            this.logDirect(new hh[]{string});
        });
    }

    default public void logDirect(String string) {
        this.logDirect(string, a.h);
    }

    private static /* synthetic */ void lambda$logDirect$0(hh hh2) {
        ((Consumer)BaritoneAPI.getSettings().logger.value).accept(hh2);
    }
}

