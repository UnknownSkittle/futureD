/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.05;
import net.impactclient.0rB$1f;
import net.impactclient.5H;
import net.impactclient.7b;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 3u {
    public static final boolean \u2003\u2008\u2004\u200f\u2003\u200d;
    private static final 05 0;

    /*
     * Enabled aggressive block sorting
     */
    static strictfp boolean 0(String object) {
        float f2;
        float[] fArray;
        block7: {
            String[] stringArray;
            block10: {
                block9: {
                    boolean bl2 = \u2003\u2008\u2004\u200f\u2003\u200d;
                    if (bl2) break block9;
                    stringArray = 7b.0();
                    if (!bl2 && !bl2) break block10;
                }
                return true;
            }
            fArray = new float[(int)((long)246492314 ^ (long)246492312)];
            fArray[(int)((long)1585615259 ^ (long)1585615259)] = 1.6838259E10f;
            fArray[(int)((long)-1657643123 ^ (long)-1657643124)] = -1.3856338E10f;
            object = 0.0((String)object, 5H.0);
            float f3 = 1.0f;
            object = ((String)object).toCharArray();
            int n2 = (int)((long)-434044222 ^ (long)-434044222);
            while (n2 < ((Object)object).length) {
                block8: {
                    float f4 = (float)object[n2] + (float)StrictMath.cos((float)((double)(360.0f / (float)(n2 + (int)((long)1015532599 ^ (long)1015532598))) * 180.0 / Math.PI));
                    f2 = 0.0f;
                    if (stringArray == null) break block7;
                    float f5 = f2;
                    int n3 = (int)((long)-1088267623 ^ (long)-1088267640);
                    while (f5 == 0.0f) {
                        f5 = f4 % (float)n3++ / (1.0f / (float)StrictMath.cos((float)((double)f4 * 180.0 / Math.PI)));
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block8;
                    }
                    f3 *= f5;
                    ++n2;
                }
                if (stringArray != null) continue;
            }
            f2 = (float)Math.cbrt(f3);
        }
        return ArrayUtils.contains(fArray, f2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 3u.\u2003\u2008\u2004\u200f\u2003\u200d;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-328554491 ^ (long)328554490);
                if (3u.\u2003\u2008\u2004\u200f\u2003\u200d) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (3u.\u2003\u2008\u2004\u200f\u2003\u200d) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u6597\u4dba\u8e13\u73f5\u65af\u4d81\u8e06", 2083865386).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)692639490 ^ (long)692639490);
                v4 = (int)((long)615954233 ^ (long)615954274);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-801453892 ^ (long)-801453891)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)405486799 ^ (long)405486792)) {
                                case 0: {
                                    v11 = (int)((long)-580693307 ^ (long)-580693314);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-1184344041 ^ (long)-1184344003);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)1625484800 ^ (long)1625484870);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)1579791061 ^ (long)1579791023);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)147704395 ^ (long)147704425);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-2032970702 ^ (long)-2032970658);
                                    if (!3u.\u2003\u2008\u2004\u200f\u2003\u200d) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-1258959366 ^ (long)-1258959394);
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var1_2;
                            v4 = v7;
                            if (v7 != 0) break block14;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        } while (!3u.\u2003\u2008\u2004\u200f\u2003\u200d);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!3u.\u2003\u2008\u2004\u200f\u2003\u200d)
lbl76:
                // 1 sources

                throw null;
            }
            3u.0 = 05.0(var0_1);
        }
    }
}

