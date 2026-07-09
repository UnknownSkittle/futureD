/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  bus$l
 *  bus$r
 */
package net.impactclient;

import java.awt.Font;
import net.impactclient.0am;
import net.impactclient.0ay;
import net.impactclient.1A;
import net.impactclient.5j;
import net.impactclient.72;
import net.impactclient.74;
import net.impactclient.7b;
import net.impactclient.9e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class 5J
extends 5j {
    boolean 1;
    final 74 4;
    final 74 2;
    public static final boolean \u200a;
    final 74 3;

    /*
     * Enabled aggressive block sorting
     */
    public 5J(Font object, boolean bl2) {
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    bl3 = \u200a;
                    if (bl3 || bl3) break block2;
                    this.4 = new 74();
                    if (bl3 || bl3) break block2;
                    this.3 = new 74();
                    if (bl3 || bl3) break block2;
                    this.2 = new 74();
                    if (bl3 || bl3) break block2;
                    boolean bl4 = this.1 = bl2;
                    Object object2 = object;
                    object = this;
                    ((5J)object).0.0((Font)object2);
                    if (bl3 || bl3) break block2;
                    if (!bl4) break block3;
                    if (bl3 || bl3) break block2;
                    ((5J)object).4.0(((Font)object2).deriveFont((int)((long)1508057009 ^ (long)1508057008)));
                    if (bl3 || bl3) break block2;
                    ((5J)object).3.0(((Font)object2).deriveFont((int)((long)49465413 ^ (long)49465415)));
                    if (bl3 || bl3) break block2;
                    ((5J)object).2.0(((Font)object2).deriveFont((int)((long)-1862615358 ^ (long)-1862615359)));
                    if (bl3) break block2;
                }
                if (!bl3) break block4;
            }
            return;
        }
    }

    @Override
    public final int 0(String string, float f2, float f3, int n2) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) {
            return -1123474882;
        }
        5J j2 = this;
        return (int)j2.0(j2.0, string, f2, f3, n2, (boolean)((long)2115467830 ^ (long)2115467830));
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private float 0(74 var1_1, String string, float f2, float f3, int n2, boolean bl2) {
        int n3;
        boolean bl3;
        block12: {
            float f4;
            bl3 = \u200a;
            if (bl3) return 0.0f;
            String[] stringArray = 7b.0();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            if (string == null) {
                if (bl3) return 0.0f;
                if (bl3) return 0.0f;
                return 0.0f;
            }
            if (bl3) return 0.0f;
            if ((n2 & (int)((long)889446126 ^ (long)-922493202)) == 0) {
                if (bl3) return 0.0f;
                if (bl3) return 0.0f;
                n2 |= (int)((long)-1210226888 ^ (long)1222469432);
                if (bl3) return 0.0f;
            }
            if (bl3) return 0.0f;
            if (bl2) {
                if (bl3) return 0.0f;
                if (bl3) return 0.0f;
                n2 = (n2 & (int)((long)-410532713 ^ (long)-411355029)) >> (int)((long)1701931069 ^ (long)1701931071) | n2 & (int)((long)2043895251 ^ (long)-2032968237);
                if (bl3) return 0.0f;
            }
            if (bl3) return 0.0f;
            float f5 = (float)(n2 >>> (int)((long)2000833504 ^ (long)2000833528)) / 255.0f;
            if (f4 <= 0.1254902f) {
                if (bl3) return 0.0f;
                if (bl3) return 0.0f;
                f5 = 1.0f;
                if (bl3) return 0.0f;
            }
            if (bl3) return 0.0f;
            0am am2 = new 0am(this, n2, bl2);
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            f2 *= 4.0f;
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            f3 *= 4.0f;
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.G();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.b((float)0.25f, (float)0.25f, (float)0.25f);
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.e();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.m();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.a((bus.r)bus.r.l, (bus.l)bus.l.j);
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            bus.c((float)((float)(n2 >> (int)((long)-875181300 ^ (long)-875181284) & (int)((long)-1389805345 ^ (long)-1389805536)) / 255.0f), (float)((float)(n2 >> (int)((long)-428370296 ^ (long)-428370304) & (int)((long)285249444 ^ (long)285249371)) / 255.0f), (float)((float)(n2 & (int)((long)1292486563 ^ (long)1292486492)) / 255.0f), (float)f5);
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            am2.0(f5);
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            n2 = string.length();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            var1_1.1();
            if (bl3) return 0.0f;
            if (bl3) return 0.0f;
            int n4 = (int)((long)925928255 ^ (long)925928255);
            if (bl3) return 0.0f;
            do {
                block16: {
                    char c2;
                    block15: {
                        if (bl3) return 0.0f;
                        if (n4 >= n2) break block12;
                        if (bl3) return 0.0f;
                        if (bl3) return 0.0f;
                        n3 = string.charAt(n4);
                        if (stringArray == null) return n3;
                        if (n3 != (int)((long)242216162 ^ (long)242216005)) break block15;
                        if (bl3) return 0.0f;
                        if (n4 + (int)((long)555206364 ^ (long)555206365) >= n2) break block15;
                        if (bl3) return 0.0f;
                        if (bl3) return 0.0f;
                        am2.0(string.charAt(n4 + (int)((long)-1197282872 ^ (long)-1197282871)));
                        if (bl3) return 0.0f;
                        if (bl3) return 0.0f;
                        ++n4;
                        if (bl3) return 0.0f;
                        if (stringArray != null) break block16;
                        if (bl3) return 0.0f;
                    }
                    if (bl3) return 0.0f;
                    am2.0(f5);
                    if (bl3) return 0.0f;
                    if (bl3) return 0.0f;
                    if (74.0(c2)) {
                        block14: {
                            if (bl3) return 0.0f;
                            if (bl3) return 0.0f;
                            if (am2.2()) {
                                char c3;
                                block13: {
                                    if (bl3) return 0.0f;
                                    if (bl3) return 0.0f;
                                    int n5 = (int)((long)-1436879218 ^ (long)-1436879218);
                                    if (bl3) return 0.0f;
                                    do {
                                        if (bl3) return 0.0f;
                                        if (var1_1.1((char)c3).0 == var1_1.1((char)c2).0) break block13;
                                        if (bl3) return 0.0f;
                                        if (bl3) return 0.0f;
                                        c3 = (char)(Math.random() * 256.0);
                                        if (bl3) return 0.0f;
                                        if (stringArray == null) break block14;
                                        if (bl3) return 0.0f;
                                    } while (stringArray != null);
                                    if (bl3) return 0.0f;
                                }
                                if (bl3) return 0.0f;
                                c2 = c3;
                                if (bl3) return 0.0f;
                            }
                        }
                        if (bl3) return 0.0f;
                        72 var11_13 = var1_1.1(c2);
                        if (bl3) return 0.0f;
                        if (bl3) return 0.0f;
                        5J.0(f2, f3, var11_13.0, var11_13.1, (float)var11_13.3 / (float)var1_1.0.1, (float)var11_13.2 / (float)var1_1.0.2, (float)(var11_13.3 + var11_13.0) / (float)var1_1.0.1, (float)(var11_13.2 + var11_13.1) / (float)var1_1.0.2);
                        if (bl3) return 0.0f;
                        if (bl3) return 0.0f;
                        if (am2.0()) {
                            if (bl3) return 0.0f;
                            if (bl3) return 0.0f;
                            1A.0(f2, f3 + (float)var11_13.1 / 4.0f + 2.0f, f2 + (float)var11_13.0 / 2.0f, f3 + (float)var11_13.1 / 4.0f + 2.0f, 1.0f);
                            if (bl3) return 0.0f;
                        }
                        if (bl3) return 0.0f;
                        if (am2.1()) {
                            if (bl3) return 0.0f;
                            if (bl3) return 0.0f;
                            1A.0(f2, f3 + (float)var11_13.1 / 2.0f, f2 + (float)var11_13.0 / 2.0f, f3 + (float)var11_13.1 / 2.0f, 1.0f);
                            if (bl3) return 0.0f;
                        }
                        if (bl3) return 0.0f;
                        f2 += (float)var11_13.0;
                        if (bl3) return 0.0f;
                    }
                }
                if (bl3) return 0.0f;
                ++n4;
                if (bl3) return 0.0f;
            } while (stringArray != null);
            if (bl3) return 0.0f;
        }
        if (bl3) return 0.0f;
        bus.H();
        if (bl3) return 0.0f;
        if (bl3) return 0.0f;
        n3 = (int)(f2 / 4.0f);
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final float 0(String string, float f2, float f3, int n2) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return 0.0f;
        float f4 = 0ay.3().5.0(9e.class).0E.2;
        if (f4 == 0.0f) {
            if (bl2 || bl2) return 0.0f;
            5J j2 = this;
            return j2.0(j2.0, string, f2, f3, n2, (boolean)((long)-649407261 ^ (long)-649407261));
        }
        if (bl2) {
            return 0.0f;
        }
        5J j3 = this;
        5J j4 = this;
        return Math.max(j3.0(j3.0, string, f2 + f4, f3 + f4, n2, (boolean)((long)-1723660613 ^ (long)-1723660614)), j4.0(j4.0, string, f2, f3, n2, (boolean)((long)1809629679 ^ (long)1809629679)));
    }
}

