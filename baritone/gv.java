/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  awt
 *  fy
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 */
package baritone;

import baritone.gq;
import baritone.gw;
import baritone.gx;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;

public final class gv
extends gq {
    public gv(fy fy2) {
        int n2;
        Object object;
        int n3;
        Object object22;
        this.x = fy2.h("Width");
        this.y = fy2.h("Height");
        this.z = fy2.h("Length");
        this.a = new awt[this.x][this.z][this.y];
        Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
        fy fy3 = fy2.p("Palette");
        for (Object object22 : fy3.c()) {
            n3 = fy3.h((String)object22);
            gw gw2 = gw.a((String)object22);
            if (gw2 == null) {
                throw new IllegalArgumentException("Unable to parse palette tag");
            }
            object = gw.a(gw2);
            if (object == null) {
                throw new IllegalArgumentException("Unable to deserialize palette tag");
            }
            int2ObjectArrayMap.put(n3, object);
        }
        Object object3 = fy2.m("BlockData");
        object22 = new int[this.x * this.y * this.z];
        n3 = 0;
        for (n2 = 0; n2 < ((Object)object22).length; ++n2) {
            if (n3 >= ((Object)object3).length) {
                throw new IllegalArgumentException("No remaining bytes in BlockData for complete schematic");
            }
            object = gx.a((byte[])object3, n3);
            object22[n2] = object.a;
            n3 += object.b;
        }
        for (n2 = 0; n2 < this.y; ++n2) {
            for (int i2 = 0; i2 < this.z; ++i2) {
                for (int i3 = 0; i3 < this.x; ++i3) {
                    int n4 = (n2 * this.z + i2) * this.x + i3;
                    object3 = (awt)int2ObjectArrayMap.get((int)object22[n4]);
                    if (object3 == null) {
                        throw new IllegalArgumentException("Invalid Palette Index ".concat(String.valueOf(n4)));
                    }
                    this.a[i3][i2][n2] = object3;
                }
            }
        }
    }
}

