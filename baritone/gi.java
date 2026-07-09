/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap
 */
package baritone;

import baritone.api.pathing.calc.IPath;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.cj;
import baritone.gh;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;

public final class gi {
    public final Long2DoubleOpenHashMap a = new Long2DoubleOpenHashMap();

    public gi(IPlayerContext object, IPath object2, cj cj2) {
        this((IPath)object2, cj2);
        object = gh.a((IPlayerContext)object).iterator();
        while (object.hasNext()) {
            cj2 = this.a;
            object2 = (gh)object.next();
            for (int i2 = -((gh)object2).d; i2 <= ((gh)object2).d; ++i2) {
                for (int i3 = -((gh)object2).d; i3 <= ((gh)object2).d; ++i3) {
                    for (int i4 = -((gh)object2).d; i4 <= ((gh)object2).d; ++i4) {
                        int n2 = i2;
                        int n3 = i3;
                        int n4 = i4;
                        if (n2 * n2 + n3 * n3 + n4 * n4 > ((gh)object2).d * ((gh)object2).d) continue;
                        long l2 = BetterBlockPos.longHash(((gh)object2).a + i2, ((gh)object2).b + i3, ((gh)object2).c + i4);
                        cj2.put(l2, cj2.get(l2) * ((gh)object2).a);
                    }
                }
            }
        }
        Helper.HELPER.logDebug("Favoring size: " + this.a.size());
    }

    private gi(IPath iPath, cj cj2) {
        this.a.defaultReturnValue(1.0);
        double d2 = cj2.d;
        if (d2 != 1.0 && iPath != null) {
            iPath.positions().forEach(betterBlockPos -> this.a.put(BetterBlockPos.longHash(betterBlockPos), d2));
        }
    }
}

