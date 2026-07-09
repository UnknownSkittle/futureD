/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  aow
 *  aox
 *  aqb
 *  aqr
 *  aru
 *  aun
 *  awt
 *  axp
 *  axw
 *  axx
 *  bcz
 *  et
 */
package baritone;

import baritone.api.utils.BlockUtils;
import baritone.cl;
import baritone.g;
import baritone.gl;
import baritone.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class p {
    private g[] a;
    public int a = new g[1024];

    public static l a(axw axw2) {
        int n2;
        int n3;
        axx[] axxArray;
        HashMap<String, List<et>> hashMap = new HashMap<String, List<et>>();
        BitSet bitSet = new BitSet(131072);
        try {
            axxArray = axw2.h();
            for (n3 = 0; n3 < 16; ++n3) {
                axx axx2 = axxArray[n3];
                if (axx2 == null) continue;
                axp axp2 = axx2.g();
                n2 = n3 << 4;
                for (int i2 = 0; i2 < 16; ++i2) {
                    int n4 = i2 | n2;
                    for (int i3 = 0; i3 < 16; ++i3) {
                        for (int i4 = 0; i4 < 16; ++i4) {
                            aow aow2;
                            int n5 = l.a(i4, n4, i3);
                            awt awt2 = axp2.a(i4, i2, i3);
                            int n6 = i3;
                            int n7 = n4;
                            int n8 = i4;
                            axw axw3 = axw2;
                            Object object = awt2;
                            object = ((aow2 = awt2.u()) == aox.j || aow2 == aox.i ? (cl.b((awt)object) ? gl.c : (n8 != 15 && cl.b((awt)axw3.a((int)(n8 + 1), (int)n7, (int)n6)) || n8 != 0 && cl.b((awt)axw3.a((int)(n8 - 1), (int)n7, (int)n6)) || n6 != 15 && cl.b((awt)axw3.a((int)n8, (int)n7, (int)(n6 + 1))) || n6 != 0 && cl.b((awt)axw3.a((int)n8, (int)n7, (int)(n6 - 1))) ? gl.c : (n8 == 0 || n8 == 15 || n6 == 0 || n6 == 15 ? (aru.a((amy)axw3.q(), (et)new et((int)(n8 + axw3.b << 4), (int)n7, (int)(n6 + axw3.c << 4)), (bcz)object.a(), (awt)object) == -1000.0f ? gl.b : gl.c) : gl.b))) : (cl.a((aow)aow2) || cl.a((awt)object) ? gl.c : (aow2 == aox.a || aow2 instanceof aun || aow2 instanceof aqb || aow2 instanceof aqr ? gl.a : gl.d))).a;
                            bitSet.set(n5, (boolean)object[0]);
                            bitSet.set(n5 + 1, (boolean)object[1]);
                            Object object2 = awt2.u();
                            if (!l.a.contains(object2)) continue;
                            object2 = BlockUtils.blockToString(object2);
                            hashMap.computeIfAbsent((String)object2, string -> new ArrayList()).add(new et(i4, n4, i3));
                        }
                    }
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        axxArray = new awt[256];
        for (n3 = 0; n3 < 16; ++n3) {
            block7: for (int i5 = 0; i5 < 16; ++i5) {
                for (int i6 = 255; i6 >= 0; --i6) {
                    n2 = l.a(i5, i6, n3);
                    if (!bitSet.get(n2) && !bitSet.get(n2 + 1)) continue;
                    axxArray[n3 << 4 | i5] = axw2.a(i5, i6, n3);
                    continue block7;
                }
                axxArray[n3 << 4 | i5] = aox.a.t();
            }
        }
        return new l(axw2.b, axw2.c, bitSet, (awt[])axxArray, hashMap, System.currentTimeMillis());
    }

    public p() {
        this(0);
    }

    private p(byte by2) {
    }

    public final void a(g g2) {
        if (this.a >= this.a.length - 1) {
            this.a = Arrays.copyOf(this.a, this.a.length << 1);
        }
        ++this.a;
        g2.d = this.a;
        this.a[this.a] = g2;
        this.b(g2);
    }

    public final void b(g g2) {
        int n2 = g2.d;
        int n3 = n2 >>> 1;
        double d2 = g2.c;
        g g3 = this.a[n3];
        while (n2 > 1 && g3.c > d2) {
            this.a[n2] = g3;
            this.a[n3] = g2;
            g2.d = n3;
            g3.d = n2;
            n2 = n3;
            n3 = n2 >>> 1;
            g3 = this.a[n3];
        }
    }

    public final g a() {
        g g2;
        if (this.a == 0) {
            throw new IllegalStateException();
        }
        g g3 = this.a[1];
        this.a[1] = g2 = this.a[this.a];
        g2.d = 1;
        this.a[this.a] = null;
        --this.a;
        g3.d = -1;
        if (this.a < 2) {
            return g3;
        }
        int n2 = 1;
        int n3 = 2;
        double d2 = g2.c;
        do {
            g g4 = this.a[n3];
            double d3 = g4.c;
            if (n3 < this.a) {
                g g5 = this.a[n3 + 1];
                double d4 = g5.c;
                if (d3 > d4) {
                    ++n3;
                    d3 = d4;
                    g4 = g5;
                }
            }
            if (d2 <= d3) break;
            this.a[n2] = g4;
            this.a[n3] = g2;
            g2.d = n3;
            g4.d = n2;
            n2 = n3;
        } while ((n3 <<= 1) <= this.a);
        return g3;
    }
}

