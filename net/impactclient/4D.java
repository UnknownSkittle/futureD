/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.impactclient.0f;
import net.impactclient.3Z;
import net.impactclient.3t;
import net.impactclient.4f;
import net.impactclient.4o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 4D
implements 3t {
    private List<4o> 0;
    public static final boolean \u200e;

    /*
     * Enabled aggressive block sorting
     */
    final 4D 0() {
        ArrayList<4o> arrayList;
        block3: {
            block2: {
                boolean bl2 = \u200e;
                if (bl2 || bl2) break block2;
                arrayList = new ArrayList<4o>();
                if (bl2 || bl2) break block2;
                this.0.forEach(o2 -> {
                    boolean bl2 = \u200e;
                    if (bl2 || bl2) return;
                    4o o4 = arrayList.stream().filter(o3 -> {
                        boolean bl2 = \u200e;
                        if (bl2 || bl2) {
                            return true;
                        }
                        return o3.1.equals(o2.1);
                    }).findFirst().orElse(null);
                    if (o4 == null) {
                        if (bl2 || bl2) return;
                        arrayList.add((4o)o2);
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    o4.2 += o2.2;
                    if (!bl2 && !bl2) return;
                });
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new 4D(arrayList);
    }

    @Override
    public final 3Z 1() {
        boolean bl2 = \u200e;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.stream().map(o2 -> {
            boolean bl2 = \u200e;
            if (bl2 || bl2) {
                return null;
            }
            return o2.0;
        }).reduce(new 3Z(), 3Z::1).0(1.0f / (float)this.0.size());
    }

    /*
     * Enabled aggressive block sorting
     */
    private 4D(List<4o> list) {
        block3: {
            block2: {
                boolean bl2 = \u200e;
                if (bl2 || bl2) break block2;
                this.0 = new ArrayList<4o>(list);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final 4f 0(0f f2) {
        int n2;
        float f3;
        block3: {
            block2: {
                boolean bl2 = \u200e;
                if (bl2 || bl2) break block2;
                f3 = f2.0 * 2.0f;
                if (bl2 || bl2) break block2;
                n2 = this.0.stream().map(4o::0).mapToInt(arg_0 -> ((bip)f2.3).a(arg_0)).max().orElse((int)((long)-1771176231 ^ (long)-1771176231));
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new 4f((float)n2 + f3, (float)(f2.3.a * this.0.size()) + f2.1 * (float)(this.0.size() - (int)((long)1675800464 ^ (long)1675800465)) + f3);
    }

    4D(4o o2) {
        boolean bl2 = \u200e;
        this(Collections.singletonList(o2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean 0(4f f2, float f3, 4f f4) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) return true;
        if (f2.0(f4) > f3) {
            if (bl2) return true;
            return (int)((long)1530100077 ^ (long)1530100076) != 0;
        }
        if (!bl2) return (int)((long)21414460 ^ (long)21414460) != 0;
        return true;
    }

    final boolean 0(0f f2, 4f f3) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) {
            return true;
        }
        return this.0().map(z2 -> {
            boolean bl2 = \u200e;
            if (bl2 || bl2) {
                return null;
            }
            return this.0(f2).1((float)z2.2, (float)z2.0);
        }).filter(arg_0 -> 4D.0(f3, 0.1f, arg_0)).isPresent();
    }

    static /* synthetic */ List 0(4D d2) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) {
            return null;
        }
        return d2.0;
    }
}

