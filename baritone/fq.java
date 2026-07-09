/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  buk
 *  bus
 *  bve
 *  bzf
 *  cdy
 */
package baritone;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.utils.Helper;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface fq {
    public static final bve a = bve.a();
    public static final buk a = a.c();
    public static final bzf a = Helper.mc.ac();
    public static final Settings a = BaritoneAPI.getSettings();

    public static void a(Color object, float f2) {
        float[] fArray = ((Color)object).getColorComponents(null);
        object = fArray;
        bus.c((float)fArray[0], (float)object[1], (float)object[2], (float)f2);
    }

    public static void a(Color color, float f2, float f3, boolean bl2) {
        bus.m();
        bus.g();
        bus.a((int)770, (int)771, (int)1, (int)0);
        fq.a(color, f2);
        bus.d((float)f3);
        bus.z();
        bus.a((boolean)false);
        if (bl2) {
            bus.j();
        }
    }

    public static void a(Color color, float f2, boolean bl2) {
        fq.a(color, 0.4f, f2, bl2);
    }

    public static void a(boolean bl2) {
        if (bl2) {
            bus.k();
        }
        bus.a((boolean)true);
        bus.y();
        bus.f();
        bus.l();
    }

    public static void a(bhb bhb2) {
        bhb2 = bhb2.d(-fq.a.h, -fq.a.i, -fq.a.j);
        a.a(1, cdy.e);
        a.b(bhb2.a, bhb2.b, bhb2.c).d();
        a.b(bhb2.d, bhb2.b, bhb2.c).d();
        a.b(bhb2.d, bhb2.b, bhb2.c).d();
        a.b(bhb2.d, bhb2.b, bhb2.f).d();
        a.b(bhb2.d, bhb2.b, bhb2.f).d();
        a.b(bhb2.a, bhb2.b, bhb2.f).d();
        a.b(bhb2.a, bhb2.b, bhb2.f).d();
        a.b(bhb2.a, bhb2.b, bhb2.c).d();
        a.b(bhb2.a, bhb2.e, bhb2.c).d();
        a.b(bhb2.d, bhb2.e, bhb2.c).d();
        a.b(bhb2.d, bhb2.e, bhb2.c).d();
        a.b(bhb2.d, bhb2.e, bhb2.f).d();
        a.b(bhb2.d, bhb2.e, bhb2.f).d();
        a.b(bhb2.a, bhb2.e, bhb2.f).d();
        a.b(bhb2.a, bhb2.e, bhb2.f).d();
        a.b(bhb2.a, bhb2.e, bhb2.c).d();
        a.b(bhb2.a, bhb2.b, bhb2.c).d();
        a.b(bhb2.a, bhb2.e, bhb2.c).d();
        a.b(bhb2.d, bhb2.b, bhb2.c).d();
        a.b(bhb2.d, bhb2.e, bhb2.c).d();
        a.b(bhb2.d, bhb2.b, bhb2.f).d();
        a.b(bhb2.d, bhb2.e, bhb2.f).d();
        a.b(bhb2.a, bhb2.b, bhb2.f).d();
        a.b(bhb2.a, bhb2.e, bhb2.f).d();
        a.b();
    }

    public static void a(bhb bhb2, double d2) {
        double d3 = d2;
        fq.a(bhb2.c(d3, d3, d2));
    }
}

