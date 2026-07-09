/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  afw
 *  ahb
 *  ain
 *  aip
 *  ajb
 *  aow
 *  aox
 *  awt
 *  bud
 *  et
 *  fa
 *  fi
 *  vp
 */
package baritone;

import baritone.a;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.b;
import baritone.ea;
import baritone.fz;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c
extends b {
    public c(a a2) {
        super(a2);
    }

    @Override
    public final void onTick(TickEvent tickEvent) {
        if (!((Boolean)baritone.a.a().allowInventory.value).booleanValue()) {
            return;
        }
        if (tickEvent.getType() == TickEvent$Type.OUT) {
            return;
        }
        if (this.a.player().by != this.a.player().bx) {
            return;
        }
        if (this.a() >= 9) {
            c c2 = this;
            c2.a(c2.a(), 8);
        }
        Class<ajb> clazz = ajb.class;
        aow aow2 = aox.b;
        tickEvent = this.a.player().bv.a;
        int n2 = -1;
        double d2 = -1.0;
        for (int i2 = 0; i2 < tickEvent.size(); ++i2) {
            double d3;
            aip aip2 = (aip)tickEvent.get(i2);
            if (aip2.b() || !clazz.isInstance(aip2.c())) continue;
            double d4 = fz.a(aip2, aow2.t());
            if (!(d3 > d2)) continue;
            d2 = d4;
            n2 = i2;
        }
        int n3 = n2;
        if (n3 >= 9) {
            this.a(n3, 0);
        }
    }

    public final void a(int n2, Predicate<Integer> object) {
        int n3;
        Predicate<Integer> predicate = object;
        object = this;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n3 = 1; n3 < 8; ++n3) {
            if (!((aip)((c)object).a.player().bv.a.get(n3)).b() || predicate.test(n3)) continue;
            arrayList.add(n3);
        }
        if (arrayList.isEmpty()) {
            for (n3 = 1; n3 < 8; ++n3) {
                if (predicate.test(n3)) continue;
                arrayList.add(n3);
            }
        }
        if (((OptionalInt)(object = arrayList.isEmpty() ? OptionalInt.empty() : OptionalInt.of((Integer)arrayList.get(new Random().nextInt(arrayList.size()))))).isPresent()) {
            this.a(n2, ((OptionalInt)object).getAsInt());
        }
    }

    private void a(int n2, int n3) {
        this.a.playerController().windowClick(this.a.player().bx.d, n2 < 9 ? n2 + 36 : n2, n3, afw.c, (aed)this.a.player());
    }

    private int a() {
        fi fi2 = this.a.player().bv.a;
        for (int i2 = 0; i2 < fi2.size(); ++i2) {
            if (!((List)baritone.a.a().acceptableThrowawayItems.value).contains(((aip)fi2.get(i2)).c())) continue;
            return i2;
        }
        return -1;
    }

    public final boolean a() {
        for (ain ain2 : (List)baritone.a.a().acceptableThrowawayItems.value) {
            if (!this.a(false, (? super aip aip2) -> ain2.equals(aip2.c()))) continue;
            return true;
        }
        return false;
    }

    public final boolean a(boolean bl2, int n2, int n3, int n4) {
        awt awt2 = this.a.a.a(n2, n3, n4);
        int n5 = n4;
        n4 = n3;
        n3 = n2;
        Object object = this.a.a;
        if ((!((ea)object).isActive() ? null : (!((ea)object).a.inSchematic(n3 - ((ea)object).a.p(), n4 - ((ea)object).a.q(), n5 - ((ea)object).a.r(), awt2) ? null : (object = (object = ((ea)object).a.desiredState(n3 - ((ea)object).a.p(), n4 - ((ea)object).a.q(), n5 - ((ea)object).a.r(), awt2, (List<awt>)((Object)((ea)object).a))).u() == aox.a ? null : object))) != null && this.a(bl2, arg_0 -> this.b((awt)object, arg_0))) {
            return true;
        }
        if (object != null && this.a(bl2, arg_0 -> c.a((awt)object, arg_0))) {
            return true;
        }
        for (ain ain2 : (List)baritone.a.a().acceptableThrowawayItems.value) {
            if (!this.a(bl2, (? super aip aip2) -> ain2.equals(aip2.c()))) continue;
            return true;
        }
        return false;
    }

    public final boolean a(boolean bl2, Predicate<? super aip> predicate) {
        aip aip2;
        int n2;
        bud bud2 = this.a.player();
        fi fi2 = bud2.bv.a;
        for (n2 = 0; n2 < 9; ++n2) {
            aip2 = (aip)fi2.get(n2);
            if (!predicate.test((aip)aip2)) continue;
            if (bl2) {
                bud2.bv.d = n2;
            }
            return true;
        }
        if (predicate.test((aip)bud2.bv.c.get(0))) {
            for (n2 = 0; n2 < 9; ++n2) {
                aip2 = (aip)fi2.get(n2);
                if (!aip2.b() && !(aip2.c() instanceof ajb)) continue;
                if (bl2) {
                    bud2.bv.d = n2;
                }
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ boolean a(awt awt2, aip aip2) {
        return aip2.c() instanceof ahb && ((ahb)aip2.c()).d().equals(awt2.u());
    }

    private /* synthetic */ boolean b(awt awt2, aip aip2) {
        return aip2.c() instanceof ahb && awt2.equals(((ahb)aip2.c()).d().a(this.a.world(), (et)this.a.playerFeet(), fa.b, (float)this.a.player().p, (float)this.a.player().q, (float)this.a.player().r, aip2.c().a(aip2.j()), (vp)this.a.player()));
    }
}

