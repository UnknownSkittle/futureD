/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.a;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.IExploreProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.eo;
import baritone.ep;
import baritone.eq;
import baritone.er;
import baritone.es;
import baritone.fk;
import java.nio.file.Path;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class en
extends fk
implements IExploreProcess {
    private et a;
    private es a;
    private int a;

    public en(a a2) {
        super(a2);
    }

    @Override
    public final boolean isActive() {
        return this.a != null;
    }

    @Override
    public final void explore(int n2, int n3) {
        this.a = new et(n2, 0, n3);
        this.a = 0;
    }

    @Override
    public final void applyJsonFilter(Path path, boolean bl2) {
        this.a = new baritone.et(this, path, bl2, 0);
    }

    private es a() {
        es es2;
        if (this.a != null) {
            en en2 = this;
            es2 = new er(en2, en2.a, new eq(this, 0), 0);
        } else {
            es2 = new eq(this, 0);
        }
        return es2;
    }

    @Override
    public final PathingCommand onTick(boolean bl2, boolean bl3) {
        if (bl2) {
            this.logDirect("Failed");
            this.onLostControl();
            return null;
        }
        Goal[] goalArray = this.a();
        if (!((Boolean)baritone.a.a().disableCompletionCheck.value).booleanValue() && goalArray.a() == 0) {
            this.logDirect("Explored all chunks");
            this.onLostControl();
            return null;
        }
        en en2 = this;
        if ((goalArray = en2.a(en2.a, (es)goalArray)) == null) {
            this.logDebug("awaiting region load from disk");
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        return new PathingCommand(new GoalComposite(goalArray), PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Goal[] a(et et3, es es2) {
        int n2 = et3.p() >> 4;
        int n3 = et3.r() >> 4;
        int n4 = Math.min(es2.a(), (Integer)baritone.a.a().exploreChunkSetMinimumSize.value);
        ArrayList<et> arrayList = new ArrayList<et>();
        int n5 = (Integer)baritone.a.a().worldExploringChunkOffset.value;
        int n6 = this.a;
        block5: while (true) {
            int n7 = -n6;
            while (true) {
                int n8;
                if (n7 <= n6) {
                    n8 = n6 - Math.abs(n7);
                } else {
                    if (n6 % 10 == 0) {
                        n4 = Math.min(es2.a(), (Integer)baritone.a.a().exploreChunkSetMinimumSize.value);
                    }
                    if (arrayList.size() >= n4) {
                        return (Goal[])arrayList.stream().map(et2 -> {
                            int n2 = et2.r();
                            int n3 = et2.p();
                            if ((Integer)baritone.a.a().exploreMaintainY.value == -1) {
                                return new GoalXZ(n3, n2);
                            }
                            return new eo(n3, n2);
                        }).toArray(Goal[]::new);
                    }
                    if (arrayList.isEmpty()) {
                        this.a = n6 + 1;
                    }
                    ++n6;
                    continue block5;
                }
                block7: for (int i2 = 0; i2 < 2; ++i2) {
                    int n9 = ((i2 << 1) - 1) * n8;
                    if (Math.abs(n7) + Math.abs(n9) != n6) {
                        throw new IllegalStateException();
                    }
                    switch (ep.a[es2.a(n2 + n7, n3 + n9) - 1]) {
                        case 1: {
                            return null;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            continue block7;
                        }
                    }
                    int n10 = (n2 + n7 << 4) + 8;
                    int n11 = (n3 + n9 << 4) + 8;
                    int n12 = n5 << 4;
                    n10 = n7 < 0 ? (n10 -= n12) : (n10 += n12);
                    n11 = n9 < 0 ? (n11 -= n12) : (n11 += n12);
                    arrayList.add(new et(n10, 0, n11));
                }
                ++n7;
            }
            break;
        }
    }

    @Override
    public final void onLostControl() {
        this.a = null;
    }

    @Override
    public final String displayName0() {
        en en2 = this;
        return "Exploring around " + this.a + ", distance completed " + this.a + ", currently going to " + new GoalComposite(en2.a(en2.a, this.a()));
    }

    static /* synthetic */ a a(en en2) {
        return en2.a;
    }
}

