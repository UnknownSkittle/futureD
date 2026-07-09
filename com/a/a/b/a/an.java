/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.BitSet;

final class an
extends ag<BitSet> {
    an() {
    }

    private static BitSet a(a a2) {
        BitSet bitSet = new BitSet();
        a2.a();
        int n2 = 0;
        c c2 = a2.f();
        while (c2 != c.b) {
            boolean bl2;
            switch (c2) {
                case g: {
                    bl2 = a2.m() != 0;
                    break;
                }
                case h: {
                    bl2 = a2.i();
                    break;
                }
                case f: {
                    String string = a2.h();
                    try {
                        bl2 = Integer.parseInt(string) != 0;
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        throw new ac("Error: Expecting: bitset number value (1, 0), Found: ".concat(String.valueOf(string)));
                    }
                }
                default: {
                    throw new ac("Invalid bitset value type: ".concat(String.valueOf((Object)c2)));
                }
            }
            if (bl2) {
                bitSet.set(n2);
            }
            ++n2;
            c2 = a2.f();
        }
        a2.b();
        return bitSet;
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return an.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        object = (BitSet)object;
        d2.b();
        int n2 = ((BitSet)object).length();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = ((BitSet)object).get(i2) ? 1 : 0;
            d2.a((long)n3);
        }
        d2.c();
    }
}

