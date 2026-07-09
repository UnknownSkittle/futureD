/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.ch;
import baritone.ci;
import baritone.cj;
import baritone.cp;
import baritone.fs;
import baritone.g;
import baritone.gi;
import baritone.gj;
import baritone.p;
import java.util.Optional;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cg
extends ch {
    private final gi a;
    private final cj a;

    public cg(int n2, int n3, int n4, Goal goal, gi gi2, cj cj2) {
        super(n2, n3, n4, goal, cj2);
        this.a = gi2;
        this.a = cj2;
    }

    @Override
    protected final Optional<IPath> a(long l2, long l3) {
        long l4;
        this.a = this.a((int)this.a, this.b, this.c, BetterBlockPos.longHash((int)this.a, this.b, this.c));
        ((g)((Object)this.a)).b = 0.0;
        ((g)((Object)this.a)).c = ((g)((Object)this.a)).a;
        p p2 = new p();
        p2.a((g)((Object)this.a));
        double[] dArray = new double[7];
        for (int i2 = 0; i2 < 7; ++i2) {
            dArray[i2] = ((g)((Object)this.a)).a;
            this.a[i2] = this.a;
        }
        gj gj2 = new gj();
        fs fs2 = new fs(this.a.a.al());
        long l5 = System.currentTimeMillis();
        boolean bl2 = (Boolean)baritone.a.a().slowPath.value;
        if (bl2) {
            this.logDebug("slowPath is on, path timeout will be " + baritone.a.a().slowPathTimeoutMS.value + "ms instead of " + l2 + "ms");
        }
        long l6 = l5 + (bl2 ? (Long)baritone.a.a().slowPathTimeoutMS.value : l2);
        long l7 = l5 + (bl2 ? (Long)baritone.a.a().slowPathTimeoutMS.value : l3);
        boolean bl3 = true;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl4 = !this.a.a.isEmpty();
        int n5 = (Integer)baritone.a.a().pathingMaxChunkBorderFetch.value;
        double d2 = (Boolean)baritone.a.a().minimumImprovementRepropagation.value != false ? 0.01 : 0.0;
        cp[] cpArray = cp.values();
        while (!(p2.a == 0) && n4 < n5 && this.a == false && ((n2 & 0x3F) != 0 || (l4 = System.currentTimeMillis()) - l7 < 0L && (bl3 || l4 - l6 < 0L))) {
            g g2;
            if (bl2) {
                try {
                    Thread.sleep((Long)baritone.a.a().slowPathTimeDelayMS.value);
                } catch (InterruptedException interruptedException) {}
            }
            this.b = g2 = p2.a();
            ++n2;
            if (this.a.isInGoal(g2.a, g2.b, g2.c)) {
                this.logDebug("Took " + (System.currentTimeMillis() - l5) + "ms, " + n3 + " movements considered");
                return Optional.of(new ci((g)((Object)this.a), g2, n2, (Goal)((Object)this.a), this.a));
            }
            cp[] cpArray2 = cpArray;
            int n6 = cpArray.length;
            for (int i3 = 0; i3 < n6; ++i3) {
                int n7;
                int n8;
                Object object = cpArray2[i3];
                int n9 = g2.a + object.a;
                int n10 = g2.c + object.c;
                if (!(n9 >> 4 == g2.a >> 4 && n10 >> 4 == g2.c >> 4 || this.a.a.b(n8 = n9, n7 = n10))) {
                    if (object.a) continue;
                    ++n4;
                    continue;
                }
                if (!object.a && !fs2.a(n9, n10) || g2.b + object.b > 256 || g2.b + object.b < 0) continue;
                gj2.a();
                object.a(this.a, g2.a, g2.b, g2.c, gj2);
                ++n3;
                double d3 = gj2.a;
                if (d3 >= 1000000.0) continue;
                if (d3 <= 0.0 || Double.isNaN(d3)) {
                    throw new IllegalStateException((Object)object + " calculated implausible cost " + d3);
                }
                if (object.a && !fs2.a(gj2.a, gj2.c)) continue;
                if (!(object.a || gj2.a == n9 && gj2.c == n10)) {
                    throw new IllegalStateException((Object)object + " " + gj2.a + " " + n9 + " " + gj2.c + " " + n10);
                }
                if (!object.b && gj2.b != g2.b + object.b) {
                    throw new IllegalStateException((Object)object + " " + gj2.b + " " + (g2.b + object.b));
                }
                long l8 = BetterBlockPos.longHash(gj2.a, gj2.b, gj2.c);
                if (bl4) {
                    long l9 = l8;
                    d3 *= this.a.a.get(l9);
                }
                object = this.a(gj2.a, gj2.b, gj2.c, l8);
                double d4 = g2.b + d3;
                if (!(((g)object).b - d4 > d2)) continue;
                ((g)object).a = g2;
                ((g)object).b = d4;
                ((g)object).c = d4 + ((g)object).a;
                if (((g)object).d != -1) {
                    p2.b((g)object);
                } else {
                    p2.a((g)object);
                }
                for (n9 = 0; n9 < 7; ++n9) {
                    double d5 = ((g)object).a + ((g)object).b / a[n9];
                    if (!(dArray[n9] - d5 > d2)) continue;
                    dArray[n9] = d5;
                    this.a[n9] = object;
                    if (!bl3 || !(this.a((g)object) > 25.0)) continue;
                    bl3 = false;
                }
            }
        }
        if (this.a != false) {
            return Optional.empty();
        }
        System.out.println(n3 + " movements considered");
        System.out.println("Open set size: " + p2.a);
        System.out.println("PathNode map size: " + ((ch)this).a.size());
        System.out.println((int)((double)n2 / (double)((float)(System.currentTimeMillis() - l5) / 1000.0f)) + " nodes per second");
        Optional<IPath> optional = this.a(true, n2);
        if (optional.isPresent()) {
            this.logDebug("Took " + (System.currentTimeMillis() - l5) + "ms, " + n3 + " movements considered");
        }
        return optional;
    }
}

