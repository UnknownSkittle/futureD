/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1A;
import net.impactclient.1c;
import net.impactclient.21;
import net.impactclient.2F;
import net.impactclient.2K;
import net.impactclient.2N;
import net.impactclient.2W;
import net.impactclient.2n;
import net.impactclient.2o;
import net.impactclient.2u;
import net.impactclient.2w;
import net.impactclient.2y;
import net.impactclient.33;
import net.impactclient.3F;
import net.impactclient.3W;
import net.impactclient.44;
import net.impactclient.6g;
import net.impactclient.73;
import net.impactclient.7Z;
import net.impactclient.7b;
import net.impactclient.7f;
import net.impactclient.7x;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2C
extends 2F {
    private static final String[] b;
    private boolean 0e;
    private final boolean 0;
    private static final String[] a;
    public static final boolean \u2004;
    private final 73 0c;
    private static final Pattern 2;
    private boolean 0f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void 0(int n2, int n3, int n4) {
        boolean bl2 = \u2004;
        if (bl2 || bl2) return;
        if (this.1(n2, n3)) {
            if (bl2 || bl2) return;
            if (n4 == 0) {
                if (bl2 || bl2) return;
                2C c2 = this;
                if (!c2.0) {
                    int n5;
                    if (bl2 || bl2) return;
                    if (!c2.0f) {
                        n5 = (int)((long)-342981345 ^ (long)-342981346);
                        if (\u2004) {
                            throw null;
                        }
                    } else {
                        n5 = (int)((long)-1556253424 ^ (long)-1556253424);
                    }
                    c2.0f = n5;
                    try {
                        c2.0c.5();
                        return;
                    } finally {
                        if (bl2) return;
                    }
                }
                if (bl2) return;
                return;
            }
        }
        if (bl2) return;
        super.0(n2, n3, n4);
        if (!bl2 && !bl2) return;
    }

    private static String 1() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return 0ay.3().3.8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, float f2) {
        int n4;
        float f3;
        block15: {
            block13: {
                block14: {
                    block11: {
                        boolean bl2;
                        block12: {
                            bl2 = \u2004;
                            if (bl2 || bl2) break block11;
                            f3 = Math.min(this.0a + 0.5f + this.9 * 0.3f, 1.0f);
                            if (bl2 || bl2) break block11;
                            if (!this.0()) break block12;
                            if (bl2 || bl2) break block11;
                            f3 = 0.1f;
                            if (bl2) return;
                        }
                        if (bl2) break block11;
                        2C c2 = this;
                        if (bl2 || bl2) break block11;
                        if (2C.1() == null) break block13;
                        if (bl2) break block11;
                        if (c2.0()) break block13;
                        if (!bl2) break block14;
                    }
                    return;
                }
                n4 = (int)((long)-715293455 ^ (long)-715293456);
                if (\u2004) {
                    throw null;
                }
                break block15;
            }
            n4 = (int)((long)-248601900 ^ (long)-248601900);
        }
        if (n4 != 0 && f3 < 0.7f) {
            f3 = 0.7f;
        }
        float f4 = f3;
        int n5 = 2w.1(f4, f4, f3, 1.0f);
        1.a(this.7, (float)(this.3 + (int)((long)-744064633 ^ (long)-744064615)), (float)(this.6 + (int)((long)-284864247 ^ (long)-284864256)), n5);
        float f5 = Math.min(this.0a + 0.5f + this.4 * 0.3f, 1.0f);
        n5 = 2w.1(f5, f5, f5, 1.0f);
        this.3(n5);
        1A.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)(this.6 + this.5), (int)(this.9 * 0.1f * 255.0f) << (int)((long)1195973439 ^ (long)1195973415));
        1A.0(this.3, this.6, this.3 + this.0b, (float)this.6 + this.0d, 1.0f, (int)((long)1560852479 ^ (long)487110655), (int)((long)-944933058 ^ (long)-944933058));
        n5 = 2w.0((int)((long)531115563 ^ (long)-520886428), (int)((long)1888618040 ^ (long)-1890568696), this.0a);
        if (!this.0) {
            String string;
            2w.0((float)(this.3 + this.0b) - this.9 * 40.0f, (float)this.6, (float)(this.3 + this.0b), (float)(this.6 + this.5));
            1A.0((float)(this.3 + this.0b) - 40.0f, (float)this.6 + 6.0f, (float)(this.3 + this.0b - (int)((long)784463496 ^ (long)784463497)), (float)(this.6 + this.5) - 6.0f, n5);
            if (this.0f) {
                string = 2C.a((int)((long)544461217 ^ (long)544454421), (int)((long)1888591380 ^ (long)1888585371));
                if (\u2004) {
                    throw null;
                }
            } else {
                string = 2C.a((int)((long)-1862669553 ^ (long)-1862693441), (int)((long)344986319 ^ (long)345012974));
            }
            String string2 = string;
            1.a(string2, (float)(this.3 + this.0b) - (40.0f + (float)1.a(string2) + 1.0f) / 2.0f, (float)(this.6 + (int)((long)-1860538684 ^ (long)-1860538675)), (int)((long)386812585 ^ (long)-386812586));
            2w.1();
        }
        if (this.0g || this.0d > (float)this.5) {
            2w.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)this.6 + this.0d);
            this.1().forEach(k2 -> {
                block3: {
                    block2: {
                        boolean bl2 = \u2004;
                        if (bl2 || bl2) break block2;
                        k2.0(n2, n3, f2);
                        if (!bl2 && !bl2) break block3;
                    }
                    return;
                }
            });
            2w.1();
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 2C.\u2004;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)373484451 ^ (long)373460246)) & (int)((long)462974332 ^ (long)462983811);
            if (var9_2) ** GOTO lbl-1000
            if (2C.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 2C.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-609409128 ^ (long)-609409128)] & (int)((long)-1714816031 ^ (long)-1714816226)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-237715309 ^ (long)-237715399);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1564717079 ^ (long)-1564717168);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1437985604 ^ (long)1437985652);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)631568376 ^ (long)631568232);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1882447498 ^ (long)-1882447461);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)1397434517 ^ (long)1397434543);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)692456004 ^ (long)692456137);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-1258387004 ^ (long)-1258387058);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1626754305 ^ (long)-1626754435);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-789861378 ^ (long)-789861492);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)631761068 ^ (long)631761028);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-2066608831 ^ (long)-2066608764);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)1288235097 ^ (long)1288235063);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)1367258296 ^ (long)1367258147);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)1684112703 ^ (long)1684112725);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)318907427 ^ (long)318907466);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-1200341529 ^ (long)-1200341601);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1071265483 ^ (long)-1071265390);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)825025612 ^ (long)825025549);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-1679223099 ^ (long)-1679223109);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-720027565 ^ (long)-720027597);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)31586759 ^ (long)31586619);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1261327985 ^ (long)1261327987);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)1463637779 ^ (long)1463637975);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)1182173823 ^ (long)1182173808);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)354759360 ^ (long)354759409);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)564055577 ^ (long)564055563);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-570979361 ^ (long)-570979509);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-431698266 ^ (long)-431698284);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1365371837 ^ (long)1365371670);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-919898524 ^ (long)-919898560);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)182431676 ^ (long)182431616);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1085963282 ^ (long)1085963265);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)951310348 ^ (long)951310445);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1094573122 ^ (long)-1094573166);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1023488381 ^ (long)1023488498);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1927609313 ^ (long)-1927609111);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)206190951 ^ (long)206190898);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)1329462506 ^ (long)1329462307);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-57117894 ^ (long)-57117929);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1854967724 ^ (long)-1854967801);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-142890165 ^ (long)-142890073);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1611517066 ^ (long)1611517097);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-849291107 ^ (long)-849291112);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)360767375 ^ (long)360767316);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)884109103 ^ (long)884109279);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)1291019735 ^ (long)1291019604);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1637430488 ^ (long)-1637430512);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1825939391 ^ (long)-1825939280);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1012664289 ^ (long)-1012664197);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1845843342 ^ (long)1845843395);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1753667440 ^ (long)-1753667480);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-770601615 ^ (long)-770601557);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1363005944 ^ (long)1363005738);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)804550907 ^ (long)804550873);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-22780409 ^ (long)-22780229);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)340023547 ^ (long)340023345);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1790515413 ^ (long)1790515360);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)316342038 ^ (long)316342133);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)934857607 ^ (long)934857646);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)1529696505 ^ (long)1529696266);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1072326433 ^ (long)1072326627);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1446728051 ^ (long)-1446728102);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)1328170885 ^ (long)1328170815);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1795812567 ^ (long)1795812368);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-444526427 ^ (long)-444526565);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)2044955967 ^ (long)2044956031);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1724495763 ^ (long)1724495829);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)187169763 ^ (long)187169688);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1437579005 ^ (long)1437578806);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1500331217 ^ (long)-1500331201);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-600273124 ^ (long)-600272902);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)510834002 ^ (long)510834028);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-719019979 ^ (long)-719019826);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1595009594 ^ (long)-1595009711);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)846166355 ^ (long)846166334);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)654902703 ^ (long)654902771);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)529339506 ^ (long)529339434);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-131969367 ^ (long)-131969460);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1997575895 ^ (long)-1997575899);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)1973102107 ^ (long)1973102153);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-1216428518 ^ (long)-1216428526);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1490271623 ^ (long)1490271703);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1224973226 ^ (long)1224973098);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-319400712 ^ (long)-319400746);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-530045313 ^ (long)-530045345);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1329661249 ^ (long)1329661427);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-711705957 ^ (long)-711705868);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)1946427916 ^ (long)1946428027);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)710021678 ^ (long)710021802);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1769216409 ^ (long)1769216308);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)862459074 ^ (long)862459096);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)1255244939 ^ (long)1255244982);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-1591396854 ^ (long)-1591396735);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1478060782 ^ (long)1478060747);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1622308087 ^ (long)1622307848);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)150603357 ^ (long)150603266);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1921649240 ^ (long)1921649204);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-403991925 ^ (long)-403992023);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1545805173 ^ (long)1545805110);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-1389507391 ^ (long)-1389507369);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)58049237 ^ (long)58049050);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-951645917 ^ (long)-951645709);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1525133019 ^ (long)-1525132804);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-2031918528 ^ (long)-2031918412);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1706795767 ^ (long)1706795699);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-396125412 ^ (long)-396125248);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-2043327607 ^ (long)-2043327494);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-1933985875 ^ (long)-1933985909);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1891537259 ^ (long)-1891537238);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-1829800955 ^ (long)-1829800944);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1090320969 ^ (long)1090320901);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-93735219 ^ (long)-93735269);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)320986976 ^ (long)320986909);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-2083590538 ^ (long)-2083590552);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)204606639 ^ (long)204606577);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-567258561 ^ (long)-567258471);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)130792699 ^ (long)130792462);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-1675307262 ^ (long)-1675307038);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1163537643 ^ (long)1163537464);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1643341225 ^ (long)1643341219);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)694824516 ^ (long)694824504);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1106408355 ^ (long)-1106408229);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-1768561748 ^ (long)-1768561843);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)1071114971 ^ (long)1071114895);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)952982158 ^ (long)952982071);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-156597198 ^ (long)-156597080);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1789504764 ^ (long)1789504610);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-335206035 ^ (long)-335205917);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1150854845 ^ (long)-1150854817);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)415287119 ^ (long)415287200);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-1680532061 ^ (long)-1680532140);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)910475490 ^ (long)910475389);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)676059996 ^ (long)676059995);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1426410541 ^ (long)-1426410741);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)2102957050 ^ (long)2102956895);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)74072094 ^ (long)74072246);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)1194546516 ^ (long)1194546447);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)461938333 ^ (long)461938368);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-960723099 ^ (long)-960723100);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-2022729881 ^ (long)-2022729786);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-498578664 ^ (long)-498578445);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1180733959 ^ (long)-1180734121);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)193808613 ^ (long)193808429);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)764663116 ^ (long)764663284);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)1774103803 ^ (long)1774103681);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-776452778 ^ (long)-776452627);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1304873622 ^ (long)-1304873577);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)1029347463 ^ (long)1029347386);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)366894173 ^ (long)366894334);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1410189984 ^ (long)-1410189869);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-856549616 ^ (long)-856549447);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-1045885863 ^ (long)-1045885922);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1649708994 ^ (long)-1649708883);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)600011952 ^ (long)600011931);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1315976608 ^ (long)-1315976569);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1105101745 ^ (long)1105101751);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1034687122 ^ (long)-1034687069);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-884921598 ^ (long)-884921555);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-433253729 ^ (long)-433253690);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)359587215 ^ (long)359587197);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1371883215 ^ (long)1371883136);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1489552691 ^ (long)1489552716);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)285576753 ^ (long)285576726);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-624344987 ^ (long)-624345075);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)2140541417 ^ (long)2140541421);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-588041379 ^ (long)-588041392);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-106771532 ^ (long)-106771712);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1486922212 ^ (long)-1486922107);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1571355167 ^ (long)1571355158);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1837055541 ^ (long)1837055715);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1951938958 ^ (long)1951938862);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-105296217 ^ (long)-105296240);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-910585878 ^ (long)-910586049);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1064302851 ^ (long)-1064302904);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-1158451030 ^ (long)-1158450996);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)250599795 ^ (long)250599787);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1269808898 ^ (long)1269808921);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-29578976 ^ (long)-29578843);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)185727663 ^ (long)185727644);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-1964437954 ^ (long)-1964437904);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1145079878 ^ (long)1145079856);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-166254574 ^ (long)-166254440);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1095379016 ^ (long)-1095378947);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)1544783361 ^ (long)1544783473);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-572227716 ^ (long)-572227813);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1902304265 ^ (long)-1902304263);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)367947591 ^ (long)367947652);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)645501147 ^ (long)645501010);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)810760357 ^ (long)810760391);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-259476155 ^ (long)-259476206);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1242923523 ^ (long)1242923554);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)307393368 ^ (long)307393321);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)2100082174 ^ (long)2100082095);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-994092292 ^ (long)-994092319);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1771062764 ^ (long)-1771062583);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1462718746 ^ (long)-1462718801);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)1832820746 ^ (long)1832820974);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-754538858 ^ (long)-754538796);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)2035813909 ^ (long)2035813898);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1650660223 ^ (long)-1650660253);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1569091932 ^ (long)-1569092061);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-857316282 ^ (long)-857316180);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-700537196 ^ (long)-700537154);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)718840233 ^ (long)718840240);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1843575268 ^ (long)-1843575133);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)318105136 ^ (long)318105097);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)902582517 ^ (long)902582329);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1896383550 ^ (long)-1896383498);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-2099243222 ^ (long)-2099243019);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1105811603 ^ (long)1105811704);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1934963582 ^ (long)-1934963583);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)333635935 ^ (long)333636073);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1712182408 ^ (long)-1712182378);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1161115789 ^ (long)-1161115679);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1987814499 ^ (long)-1987814499);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)123692171 ^ (long)123692051);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1365714331 ^ (long)1365714202);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)1597460137 ^ (long)1597459974);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1957804084 ^ (long)1957804138);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1288200779 ^ (long)1288200837);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1083719794 ^ (long)-1083719777);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-2041355552 ^ (long)-2041355663);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1618629633 ^ (long)1618629769);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-1528582980 ^ (long)-1528583099);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-321354066 ^ (long)-321354156);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)661890765 ^ (long)661890685);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1253752786 ^ (long)1253752759);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)285961006 ^ (long)285961168);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1411662613 ^ (long)-1411662730);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1863791000 ^ (long)-1863791054);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)2110205301 ^ (long)2110205365);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1756972448 ^ (long)-1756972458);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)2054923523 ^ (long)2054923754);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1840012830 ^ (long)1840012837);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1560625177 ^ (long)-1560625168);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1413468778 ^ (long)-1413468857);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1416487367 ^ (long)-1416487275);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1108025980 ^ (long)-1108026088);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-896523597 ^ (long)-896523685);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1408279774 ^ (long)1408279634);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1373589114 ^ (long)1373589006);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-148410999 ^ (long)-148411074);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1810596406 ^ (long)-1810596513);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-519538149 ^ (long)-519538002);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1487739170 ^ (long)-1487739361);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1658684237 ^ (long)-1658684165);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)2082168807 ^ (long)2082168812);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-307905035 ^ (long)-307905055);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-887616346 ^ (long)-887616398);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)398403841 ^ (long)398403991);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)160592312 ^ (long)160592156);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-320097689 ^ (long)-320097578);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-579941021 ^ (long)-579940955);
                    if (!2C.\u2004) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1518976934 ^ (long)-1518976839);
                    if (!2C.\u2004) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-454381724 ^ (long)-454381777);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-54275500 ^ (long)-54275413)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1603142497 ^ (long)1603206302)) >>> (int)((long)1645322631 ^ (long)1645322639)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)1086226574 ^ (long)1086226574);
            if (!2C.\u2004) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)798224052 ^ (long)798224054);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)973972351 ^ (long)973972348) | var5_6 << (int)((long)1249062149 ^ (long)1249062144)) ^ var3_4[var7_8]) & (int)((long)1834967583 ^ (long)1834967776);
                    if (2C.\u2004) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)699242163 ^ (long)699242160) | var6_7 << (int)((long)2037623680 ^ (long)2037623685)) ^ var3_4[var7_8]) & (int)((long)-646898505 ^ (long)-646898616);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            2C.b[var2_3] = new String(var3_4).intern();
        }
        return 2C.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0(2F f2, 73 var1_1, 9m m2) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                m2.0().forEach(w2 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2004;
                            if (bl2 || bl2) break block2;
                            2C.0(f2, w2, () -> {
                                int n2;
                                boolean bl2 = \u2004;
                                if (bl2 || bl2) return null;
                                if (var1_1.5() == m2) {
                                    if (bl2) {
                                        return null;
                                    }
                                    n2 = (int)((long)2088593185 ^ (long)2088593184);
                                    if (!\u2004) return n2 != 0;
                                    throw null;
                                }
                                n2 = (int)((long)-1443222993 ^ (long)-1443222993);
                                return n2 != 0;
                            });
                            if (!bl2 && !bl2) break block3;
                        }
                        return;
                    }
                });
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 2C.\u2004;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)588959848 ^ (long)588959855)];
            if (var7) break block25;
            var3_2 = (int)((long)1669311607 ^ (long)1669311607);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\uea7e\uc2e1\u0140\ufc73\uead6\uc2cf\u0175\ufc15\ueaf3\uc218\u01d8\ufcde\uea98\uc29f\u01a1\ufc51\ueaa1\uc261\u010d\ufce3\uea49\uc294\u01b2\ufc3b\uea82\uc205\u01be\ufc35\uea8c\uc270\u01b7\ufc15\uea0f\uc2e9\u0149\ufc24\uea31\uc28e\u014b\ufc54\uea0f\uc26c\u0173\ufc32\uea61\uc298\u01fa\ufce4\uea77\uc2b8\u01b9\ufc58\uea34\uc2e7\u0174\ufce1\uea12\uc255\u0136\ufce4\uea67\uc2de\u01c9\ufcd0\uea87\uc285\u01ce\ufc27\ueabb\uc20d\u0156\ufc1e\uea90\uc280\u01de\ufc77\uea2e\uc2ab\u0100\ufc74\ueae8", 867159086);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)370957591 ^ (long)370957621);
            if (var7) break block25;
            var0_6 = (int)((long)63370119 ^ (long)-63370120);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)1567371364 ^ (long)1567371359);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)1525756097 ^ (long)-1525756098);
                        if (2C.\u2004) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!2C.\u2004) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\ufbde\ud3fb\u1088\uedf1\ufb8b\ud313\u1098\ued71\ufbb0\ud3e3\u102e\ued17\ufbd8\ud35a\u10f4\ued9f\ufb10\ud3e6\u1027\ued43\ufb6e\ud3de", 654957872);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)-1847604758 ^ (long)-1847604759);
                                var0_6 = (int)((long)-2039430081 ^ (long)2039430080);
                                while (true) {
                                    v0 = (int)((long)1959889292 ^ (long)1959889309);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)-1419617086 ^ (long)-1419617086);
                                    if (!2C.\u2004) break block21;
                                    throw null;
                                }
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!2C.\u2004) ** continue;
                                    throw null;
                                }
                                2C.a = var5_1;
                                2C.b = new String[(int)((long)249389925 ^ (long)249389922)];
                                if (2C.\u2004) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)-595029408 ^ (long)-595029408);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)-1881121849 ^ (long)-1881121850)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)408447501 ^ (long)408447498)) {
                                    case 0: {
                                        v15 = (int)((long)-1433932641 ^ (long)-1433932652);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)121344792 ^ (long)121344800);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-1607015358 ^ (long)-1607015329);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)2069010304 ^ (long)2069010315);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)1183340890 ^ (long)1183340862);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-98116953 ^ (long)-98116930);
                                        if (!2C.\u2004) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)-1185104774 ^ (long)-1185104845);
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var6_7;
                                v8 = v11;
                                if (v11 != 0) break block23;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            } while (!2C.\u2004);
                            throw null;
                        }
                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var6_7);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl119:
                        // 1 sources

                        ** continue;
                    }
                }
                2C.2 = Pattern.compile(2C.a((int)((long)1221067060 ^ (long)1221093255), (int)((long)484367961 ^ (long)-484371557)));
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void 0(2F f2, 3W w2, Supplier<Boolean> supplier) {
        block13: {
            block7: {
                boolean bl2;
                block12: {
                    Object object;
                    block9: {
                        block11: {
                            block10: {
                                block8: {
                                    bl2 = \u2004;
                                    if (bl2 || bl2) break block7;
                                    object = null;
                                    if (bl2) return;
                                    if (bl2) break block7;
                                    if (!(w2 instanceof 1c)) break block8;
                                    if (bl2 || bl2) break block7;
                                    object = (1c)w2;
                                    if (bl2 || bl2) break block7;
                                    object = new 2N(object.2(), object.0(), (7f)object, supplier);
                                    f2.0((2K)object);
                                    if (bl2 || bl2) break block7;
                                    if (\u2004) {
                                        throw null;
                                    }
                                    break block9;
                                }
                                if (bl2) break block7;
                                if (!(w2 instanceof 44)) break block10;
                                if (bl2 || bl2) break block7;
                                object = new 2W((44)w2, supplier);
                                f2.0((2K)object);
                                if (bl2) break block7;
                                if (\u2004) {
                                    throw null;
                                }
                                break block9;
                            }
                            if (bl2) break block7;
                            if (!(w2 instanceof 6g)) break block11;
                            if (bl2 || bl2) break block7;
                            object = new 21(7x.0((6g)w2), supplier);
                            f2.0((2K)object);
                            if (bl2) break block7;
                            if (\u2004) {
                                throw null;
                            }
                            break block9;
                        }
                        if (bl2) break block7;
                        if (!(w2 instanceof 3F)) break block9;
                        if (bl2 || bl2) break block7;
                        object = new 2u((3F)w2, supplier);
                        f2.0((2K)object);
                        if (bl2) break block7;
                    }
                    if (bl2) break block7;
                    if (!(object instanceof 2F)) break block12;
                    if (bl2 || bl2) break block7;
                    object = (2F)object;
                    if (bl2 || bl2) break block7;
                    w2.0().forEach(arg_0 -> 2C.0((2F)object, arg_0));
                    if (bl2) break block7;
                }
                if (!bl2) break block13;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean 0() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) return true;
        if (2C.1() == null) {
            if (bl2 || bl2) return true;
            return (int)((long)292125632 ^ (long)292125632) != 0;
        }
        if (bl2) return true;
        if (!2C.0(this.0c.2()).contains(2C.0(2C.1()))) {
            if (bl2) return true;
            return (int)((long)-486752610 ^ (long)-486752609) != 0;
        }
        if (!bl2) return (int)((long)1073193464 ^ (long)1073193464) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2C(73 var1_1) {
        block10: {
            block11: {
                Object object;
                String[] stringArray;
                boolean bl2;
                block12: {
                    bl2 = \u2004;
                    String[] stringArray2 = 7b.0();
                    this.0f = (int)((long)1661007058 ^ (long)1661007058);
                    this.0e = (int)((long)-1429507729 ^ (long)-1429507729);
                    this.0c = var1_1;
                    stringArray = stringArray2;
                    if (bl2 || bl2) break block11;
                    this.7 = this.0c.2();
                    if (bl2 || bl2) break block11;
                    this.8 = this.0c.0();
                    if (bl2 || bl2) break block11;
                    this.0 = this.0c.1(2C.a((int)((long)-1916516534 ^ (long)-1916526083), (int)((long)1935912091 ^ (long)-1935907921)));
                    if (bl2 || bl2) break block11;
                    if (!var1_1.7()) break block12;
                    if (bl2 || bl2) break block11;
                    object = new 2n(7x.0(var1_1));
                    if (bl2 || bl2) break block11;
                    this.0((2K)object);
                    if (bl2 || bl2) break block11;
                    var1_1.9().forEach(arg_0 -> 2C.0((2F)object, var1_1, arg_0));
                    if (bl2) break block11;
                }
                if (!bl2) {
                    object = var1_1.0().iterator();
                    if (!bl2) {
                        while (!bl2) {
                            boolean bl3;
                            if (object.hasNext()) {
                                if (bl2) break;
                                3W w2 = (3W)object.next();
                                if (bl2 || bl2) break;
                                Supplier<Boolean> supplier = () -> {
                                    boolean bl2 = \u2004;
                                    if (bl2 || bl2) {
                                        return null;
                                    }
                                    return Boolean.TRUE;
                                };
                                if (bl2 || bl2) break;
                                Matcher matcher = 2.matcher((CharSequence)w2.1());
                                bl3 = matcher.matches();
                                if (stringArray != null) {
                                    if (bl3) {
                                        if (bl2 || bl2) break;
                                        supplier = () -> {
                                            int n2;
                                            boolean bl2 = \u2004;
                                            if (bl2) return null;
                                            if (bl2) return null;
                                            if ((var1_1 = ((7Z)var1_1).0(matcher.group((int)((long)-1272393635 ^ (long)-1272393636)))) != null) {
                                                int n3;
                                                if (bl2) return null;
                                                int n4 = var1_1.1().toString().equalsIgnoreCase(matcher.group((int)((long)-1934570 ^ (long)-1934571)));
                                                if (!matcher.group((int)((long)-1733060204 ^ (long)-1733060202)).equals(0rB$1f.XNZw("\uab0e", -275411630))) {
                                                    n3 = (int)((long)1060280124 ^ (long)1060280125);
                                                    if (\u2004) {
                                                        throw null;
                                                    }
                                                } else {
                                                    n3 = (int)((long)-1572157912 ^ (long)-1572157912);
                                                }
                                                if (n4 != n3) {
                                                    n2 = (int)((long)1783056880 ^ (long)1783056880);
                                                    return n2 != 0;
                                                }
                                            }
                                            n2 = (int)((long)-467960188 ^ (long)-467960187);
                                            if (!\u2004) return n2 != 0;
                                            throw null;
                                        };
                                        if (bl2) break;
                                    }
                                    if (bl2) break;
                                    2C.0((2F)this, w2, supplier);
                                    if (bl2 || bl2) break;
                                    if (stringArray != null) continue;
                                    if (bl2) break;
                                }
                            } else {
                                if (bl2) break;
                                bl3 = this.0;
                            }
                            if (!bl3) {
                                if (bl2 || bl2) break;
                                this.0((2K)new 2y(2C.a((int)((long)-591448868 ^ (long)-591441299), (int)((long)-1869645610 ^ (long)1869650977)), 2C.a((int)((long)1593598982 ^ (long)1593574064), (int)((long)-1627758469 ^ (long)1627772124)), new 33(this, var1_1)));
                                if (bl2 || bl2) break;
                                this.0(new 2o(var1_1));
                                if (bl2) break;
                            }
                            if (!bl2) break block10;
                        }
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0(2F f2, 3W w2) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                2C.0(f2, w2, () -> {
                    boolean bl2 = \u2004;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return Boolean.TRUE;
                });
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, boolean bl2, float f2) {
        float f3;
        float f4;
        block8: {
            block7: {
                boolean bl3 = \u2004;
                if (bl3 || bl3) break block7;
                this.0f = this.0c.4();
                if (bl3 || bl3) break block7;
                this.5 = (int)((long)1158391823 ^ (long)1158391852);
                if (bl3 || bl3) break block7;
                f4 = 0.1f * f2;
                if (!bl3 && !bl3) break block8;
            }
            return;
        }
        if (this.0f) {
            f3 = f4;
            if (\u2004) {
                throw null;
            }
        } else {
            f3 = -f4;
        }
        this.0a += f3;
        this.0a = Math.max(0.0f, Math.min(1.0f, this.0a));
        super.0(n2, n3, bl2, f2);
    }

    private static String 0(String string) {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return string.replace(0rB$1f.XNZw("\u2c03", -75429282), 0rB$1f.XNZw("", 1756378004)).toLowerCase();
    }
}

