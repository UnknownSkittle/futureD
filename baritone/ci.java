/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  fq
 */
package baritone;

import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.movement.IMovement;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.dv;
import baritone.g;
import baritone.gk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ci
extends gk {
    private final BetterBlockPos a;
    private final BetterBlockPos b;
    private final List<BetterBlockPos> a;
    private final List<ck> b;
    private final List<g> c;
    private final Goal a;
    private final int a;
    private final cj a;
    private volatile boolean a;

    ci(g g2, g object, int n2, Goal goal, cj cj2) {
        this.a = new BetterBlockPos(g2.a, g2.b, g2.c);
        this.b = new BetterBlockPos(((g)object).a, ((g)object).b, ((g)object).c);
        this.a = n2;
        this.b = new ArrayList();
        this.a = goal;
        this.a = cj2;
        g2 = object;
        object = new LinkedList();
        LinkedList<g> linkedList = new LinkedList<g>();
        while (g2 != null) {
            linkedList.addFirst(g2);
            ((LinkedList)object).addFirst(new BetterBlockPos(g2.a, g2.b, g2.c));
            g2 = g2.a;
        }
        this.a = new ArrayList(object);
        this.c = new ArrayList<g>(linkedList);
    }

    @Override
    public final Goal getGoal() {
        return this.a;
    }

    private boolean a() {
        if (this.a.isEmpty() || !this.b.isEmpty()) {
            throw new IllegalStateException();
        }
        for (int i2 = 0; i2 < this.a.size() - 1; ++i2) {
            double d2 = this.c.get((int)(i2 + 1)).b - this.c.get((int)i2).b;
            ci ci2 = this;
            ck ck2 = ci2.a((BetterBlockPos)((Object)ci2.a.get(i2)), (BetterBlockPos)((Object)this.a.get(i2 + 1)), d2);
            if (ck2 == null) {
                return true;
            }
            this.b.add(ck2);
        }
        return false;
    }

    private ck a(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, double d2) {
        cp[] cpArray = cp.values();
        int n2 = cpArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ck ck2 = cpArray[i2].a(this.a, betterBlockPos);
            if (!ck2.getDest().equals((Object)betterBlockPos2)) continue;
            ck2.a = Math.min(ck2.a(this.a), d2);
            return ck2;
        }
        Helper.HELPER.logDebug("Movement became impossible during calculation " + (Object)((Object)betterBlockPos) + " " + (Object)((Object)betterBlockPos2) + " " + betterBlockPos2.b((fq)betterBlockPos));
        return null;
    }

    @Override
    public final IPath postProcess() {
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        boolean bl2 = this.a();
        this.b.forEach(ck2 -> ck2.a(this.a));
        if (bl2) {
            ci ci2 = this;
            dv dv2 = new dv(ci2, ci2.movements().size());
            if (dv2.movements().size() != this.b.size()) {
                throw new IllegalStateException();
            }
            return dv2;
        }
        this.sanityCheck();
        return this;
    }

    @Override
    public final List<IMovement> movements() {
        if (!this.a) {
            throw new IllegalStateException();
        }
        return Collections.unmodifiableList(this.b);
    }

    @Override
    public final List<BetterBlockPos> positions() {
        return Collections.unmodifiableList(this.a);
    }

    @Override
    public final int getNumNodesConsidered() {
        return this.a;
    }

    @Override
    public final BetterBlockPos getSrc() {
        return this.a;
    }

    @Override
    public final BetterBlockPos getDest() {
        return this.b;
    }
}

