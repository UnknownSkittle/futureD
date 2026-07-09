/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amn
 *  awt
 *  axr
 *  axw
 *  brx
 *  et
 */
package baritone;

import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IWorldScanner;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.IPlayerContext;
import baritone.gc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class w
extends Enum<w>
implements IWorldScanner {
    public static final /* enum */ w a = new w("INSTANCE");
    private static final int[] a;
    private static final /* synthetic */ w[] a;

    public static w[] values() {
        return (w[])a.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    @Override
    public final List<et> scanChunkRadius(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, int n4, int n5, int n6) {
        ArrayList<et> arrayList = new ArrayList<et>();
        if (blockOptionalMetaLookup.blocks().isEmpty()) {
            return arrayList;
        }
        brx brx2 = (brx)iPlayerContext.world().B();
        int n7 = n6;
        n6 = n7 * n7;
        int n8 = iPlayerContext.playerFeet().p() >> 4;
        int n9 = iPlayerContext.playerFeet().r() >> 4;
        int n10 = iPlayerContext.playerFeet().q();
        int n11 = n10 >> 4;
        int[] nArray = IntStream.range(0, 16).boxed().sorted(Comparator.comparingInt(n3 -> Math.abs(n3 - n11))).mapToInt(n2 -> n2).toArray();
        int n12 = 0;
        boolean bl2 = false;
        while (true) {
            boolean bl3 = true;
            boolean bl4 = false;
            for (int i2 = -n12; i2 <= n12; ++i2) {
                for (int i3 = -n12; i3 <= n12; ++i3) {
                    int n13 = i2;
                    int n14 = i3;
                    if (n13 * n13 + n14 * n14 != n12) continue;
                    bl4 = true;
                    int n15 = i2 + n8;
                    int n16 = i3 + n9;
                    axw axw2 = brx2.a(n15, n16);
                    if (axw2 == null) continue;
                    bl3 = false;
                    if (!w.a(n15 << 4, n16 << 4, axw2, blockOptionalMetaLookup, arrayList, n4, n5, n10, nArray)) continue;
                    bl2 = true;
                }
            }
            if (bl3 && bl4 || arrayList.size() >= n4 && (n12 > n6 || n12 > 1 && bl2)) {
                return arrayList;
            }
            ++n12;
        }
    }

    @Override
    public final List<et> scanChunk(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, amn amn2, int n2, int n3) {
        if (blockOptionalMetaLookup.blocks().isEmpty()) {
            return Collections.emptyList();
        }
        axw axw2 = ((brx)iPlayerContext.world().B()).a(amn2.a, amn2.b);
        int n4 = iPlayerContext.playerFeet().q();
        if (axw2 == null || axw2.f()) {
            return Collections.emptyList();
        }
        ArrayList<et> arrayList = new ArrayList<et>();
        w.a(amn2.a << 4, amn2.b << 4, axw2, blockOptionalMetaLookup, arrayList, n2, n3, n4, a);
        return arrayList;
    }

    @Override
    public final int repack(IPlayerContext iPlayerContext) {
        return this.repack(iPlayerContext, 40);
    }

    @Override
    public final int repack(IPlayerContext object, int n2) {
        axr axr2 = object.world().B();
        ICachedWorld iCachedWorld = object.worldData().getCachedWorld();
        object = object.playerFeet();
        int n3 = object.p() >> 4;
        int n4 = object.r() >> 4;
        int n5 = n3 - n2;
        int n6 = n4 - n2;
        n3 += n2;
        n4 += n2;
        n2 = 0;
        while (n5 <= n3) {
            for (int i2 = n6; i2 <= n4; ++i2) {
                axw axw2 = axr2.a(n5, i2);
                if (axw2 == null || axw2.f()) continue;
                ++n2;
                iCachedWorld.queueForPacking(axw2);
            }
            ++n5;
        }
        return n2;
    }

    private static boolean a(int n2, int n3, axw axxArray, BlockOptionalMetaLookup blockOptionalMetaLookup, Collection<et> collection, int n4, int n5, int n6, int[] nArray) {
        axxArray = axxArray.h();
        boolean bl2 = false;
        for (int i2 = 0; i2 < 16; ++i2) {
            int n7 = nArray[i2];
            Object object = axxArray[n7];
            if (object == null) continue;
            n7 <<= 4;
            object = (gc)object.g();
            int[] nArray2 = object.storageArray();
            for (int i3 = 0; i3 < 4096; ++i3) {
                awt awt2 = object.getAtPalette(nArray2[i3]);
                if (!blockOptionalMetaLookup.has(awt2)) continue;
                int n8 = n7 | i3 >> 8 & 0xF;
                if (collection.size() >= n4) {
                    if (Math.abs(n8 - n6) < n5) {
                        bl2 = true;
                    } else if (bl2) {
                        return true;
                    }
                }
                collection.add(new et(n2 | i3 & 0xF, n8, n3 | i3 >> 4 & 0xF));
            }
        }
        return bl2;
    }

    static {
        a = new w[]{a};
        a = IntStream.range(0, 16).toArray();
    }
}

