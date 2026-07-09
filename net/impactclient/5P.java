/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  nf
 */
package net.impactclient;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import net.impactclient.0aV;
import net.impactclient.0rB$1f;
import net.impactclient.0y;
import net.impactclient.2x;
import net.impactclient.3L;
import net.impactclient.49;
import net.impactclient.5r;
import net.impactclient.5x;
import net.impactclient.7Q;
import net.impactclient.7j;
import net.impactclient.7l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 5P {
    @Nullable
    @SerializedName(value="email")
    private String 1;
    private static final String[] c;
    @SerializedName(value="incognito")
    private boolean 8;
    @SerializedName(value="legacy_enabled")
    private boolean 0;
    public static final boolean \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
    private static final String[] a;
    private final Map<String, OptionalInt> 3;
    @Nullable
    @SerializedName(value="discord")
    private 5x 5;
    @Nullable
    @SerializedName(value="info")
    public 0aV 2;
    @Nullable
    @SerializedName(value="edition")
    private 7j 7;
    @Nullable
    @SerializedName(value="roles")
    public String[] 6;
    @Nullable
    @SerializedName(value="minecraft")
    private 0y 0a;
    private static String 4;
    @Nullable
    @SerializedName(value="features")
    public 2x 9;

    /*
     * Enabled aggressive block sorting
     */
    public final String 3() {
        boolean bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
        if (bl2 || bl2) return null;
        if (this.1 == null) {
            if (bl2) return null;
            return 0rB$1f.XNZw("", 305050736);
        }
        if (!bl2) return this.1;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String 0() {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
                if (bl2 || bl2) return null;
                if (this.7 == null) break block7;
                if (bl2) return null;
                if (this.7.2 != null) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            return 0rB$1f.XNZw("", -826653739);
        }
        if (!bl2) return this.7.2;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final OptionalInt 1() {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
                if (bl2 || bl2) return null;
                if (this.7 == null) break block7;
                if (bl2) return null;
                if (this.7.1 != null) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            return OptionalInt.empty();
        }
        if (!bl2) return this.3.computeIfAbsent(5P.a((int)((long)170540003 ^ (long)-170530248), (int)((long)-1357890930 ^ (long)1357901947)), string -> {
            boolean bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
            if (bl2 || bl2) {
                return null;
            }
            return 7Q.0(this.7.1);
        });
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1052458076 ^ (long)1052447359)) & (int)((long)1203321955 ^ (long)1203356572);
            if (var9_2) ** GOTO lbl-1000
            if (5P.c[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 5P.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-1937044849 ^ (long)-1937044849)] & (int)((long)-714440511 ^ (long)-714440642)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-2112885467 ^ (long)-2112885439);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)898929300 ^ (long)898929212);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)781510967 ^ (long)781511138);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)23187515 ^ (long)23187640);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1398958173 ^ (long)-1398958324);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)721007461 ^ (long)721007414);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)986445475 ^ (long)986445390);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1764705826 ^ (long)1764706008);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)17789538 ^ (long)17789685);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)2053399860 ^ (long)2053399834);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)563172779 ^ (long)563172681);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-464568265 ^ (long)-464568291);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)1628520858 ^ (long)1628520952);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-1079898120 ^ (long)-1079898134);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-572817402 ^ (long)-572817312);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1577294440 ^ (long)1577294447);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-1201654792 ^ (long)-1201654791);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)2047991876 ^ (long)2047991828);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)1963714885 ^ (long)1963714956);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)111778688 ^ (long)111778686);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-582705091 ^ (long)-582704963);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1356312323 ^ (long)1356312387);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)272777611 ^ (long)272777554);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)21277526 ^ (long)21277511);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1262534118 ^ (long)-1262533928);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1136128792 ^ (long)-1136128999);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-760490859 ^ (long)-760490934);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)72810515 ^ (long)72810626);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-983919372 ^ (long)-983919535);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1964362321 ^ (long)-1964362372);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)217886341 ^ (long)217886277);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1915432280 ^ (long)1915432423);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1544490703 ^ (long)1544490547);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1445506181 ^ (long)1445506081);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1285115804 ^ (long)-1285115816);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)178516581 ^ (long)178516707);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)1206699935 ^ (long)1206699912);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1755096100 ^ (long)1755096293);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1023410743 ^ (long)-1023410779);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-432371161 ^ (long)-432371004);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)1944150350 ^ (long)1944150491);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1747748443 ^ (long)1747748547);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)217817576 ^ (long)217817574);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1788604615 ^ (long)-1788604597);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)977926926 ^ (long)977926919);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)301021506 ^ (long)301021646);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)563226870 ^ (long)563226693);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1242394722 ^ (long)-1242394677);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1547647795 ^ (long)-1547647920);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)461811795 ^ (long)461811821);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-413944973 ^ (long)-413944905);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-348563262 ^ (long)-348563372);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-1772864583 ^ (long)-1772864748);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1199544876 ^ (long)-1199544951);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1691841422 ^ (long)1691841327);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-175281886 ^ (long)-175281745);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-55410707 ^ (long)-55410895);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1587293372 ^ (long)1587293298);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-478927456 ^ (long)-478927362);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-79446783 ^ (long)-79446613);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-1785191615 ^ (long)-1785191612);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1449122646 ^ (long)1449122786);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-193553722 ^ (long)-193553707);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)708088817 ^ (long)708088602);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1427513810 ^ (long)-1427513692);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-674409514 ^ (long)-674409538);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1587935175 ^ (long)1587935076);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-758036306 ^ (long)-758036473);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)155411426 ^ (long)155411214);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-807626654 ^ (long)-807626731);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-503503209 ^ (long)-503503269);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)702787765 ^ (long)702787817);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-610717599 ^ (long)-610717538);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)794443296 ^ (long)794443311);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)62146645 ^ (long)62146638);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)828689599 ^ (long)828689482);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1390258651 ^ (long)-1390258527);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1575461363 ^ (long)-1575461357);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1253958881 ^ (long)-1253958826);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1688855212 ^ (long)1688855142);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)2019870620 ^ (long)2019870472);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1042257632 ^ (long)1042257422);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)873575387 ^ (long)873575308);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-798868981 ^ (long)-798868825);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-145184288 ^ (long)-145184384);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-154860781 ^ (long)-154860662);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)978005886 ^ (long)978005767);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-133442524 ^ (long)-133442510);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1637478385 ^ (long)-1637478315);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1979310199 ^ (long)1979310132);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1734412302 ^ (long)1734412531);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)2144622190 ^ (long)2144622300);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1783097668 ^ (long)-1783097747);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-1683962812 ^ (long)-1683962650);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-568820701 ^ (long)-568820595);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1288928455 ^ (long)1288928399);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1923661278 ^ (long)-1923661159);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)172423755 ^ (long)172423842);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1771823190 ^ (long)1771823149);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1469661369 ^ (long)1469661295);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1085154744 ^ (long)1085154683);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1630508771 ^ (long)1630508678);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-768951858 ^ (long)-768952061);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)2041189477 ^ (long)2041189392);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)228933331 ^ (long)228933319);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-1054800874 ^ (long)-1054800685);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1441475444 ^ (long)-1441475329);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1060205636 ^ (long)-1060205792);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)875228274 ^ (long)875228217);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-260174729 ^ (long)-260174766);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-87674477 ^ (long)-87674452);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-2130830826 ^ (long)-2130830696);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1171962042 ^ (long)1171961893);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1011743537 ^ (long)1011743580);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1433502629 ^ (long)-1433502621);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1628482160 ^ (long)1628482246);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)1580873982 ^ (long)1580873931);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-707956462 ^ (long)-707956329);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)1977609074 ^ (long)1977609030);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-872579476 ^ (long)-872579430);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1875777354 ^ (long)1875777292);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1217793122 ^ (long)-1217793112);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1854743081 ^ (long)-1854743125);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)102097450 ^ (long)102097411);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)474481422 ^ (long)474481450);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)94275610 ^ (long)94275783);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-2031666766 ^ (long)-2031666840);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1561833841 ^ (long)1561833858);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-567930604 ^ (long)-567930400);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1738343845 ^ (long)1738343698);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)184429354 ^ (long)184429403);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-405422134 ^ (long)-405422248);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1534171748 ^ (long)-1534171849);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1643476672 ^ (long)-1643476483);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)711919803 ^ (long)711919778);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1116974461 ^ (long)1116974407);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)1106665920 ^ (long)1106665977);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1557979949 ^ (long)-1557980007);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-265434598 ^ (long)-265434507);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)334450706 ^ (long)334450763);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)2060909503 ^ (long)2060909468);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)94965194 ^ (long)94965135);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1721136225 ^ (long)-1721136351);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)1710603827 ^ (long)1710603835);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-25735830 ^ (long)-25735883);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)752212429 ^ (long)752212276);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-886123221 ^ (long)-886123101);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-537514816 ^ (long)-537514997);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)2031545072 ^ (long)2031545072);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)399389653 ^ (long)399389510);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)1781528077 ^ (long)1781528178);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1557542838 ^ (long)-1557542661);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-2089094412 ^ (long)-2089094408);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-309389785 ^ (long)-309389782);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)271315320 ^ (long)271315244);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1612977206 ^ (long)-1612977300);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)2044360428 ^ (long)2044360327);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1025599033 ^ (long)-1025599072);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)545132493 ^ (long)545132408);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-97832789 ^ (long)-97832942);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1523951370 ^ (long)1523951581);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)2054974385 ^ (long)2054974278);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-1647101507 ^ (long)-1647101582);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)146891787 ^ (long)146891959);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1414231884 ^ (long)1414231991);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)1654163160 ^ (long)1654163126);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-1970849935 ^ (long)-1970849978);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-1135538687 ^ (long)-1135538581);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1959476135 ^ (long)-1959476223);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1591739839 ^ (long)1591739847);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1785893434 ^ (long)1785893386);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)32226895 ^ (long)32227014);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-2009461848 ^ (long)-2009461992);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)1692317364 ^ (long)1692317423);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1300626239 ^ (long)1300626228);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-1723090607 ^ (long)-1723090569);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1030330572 ^ (long)1030330475);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1234435961 ^ (long)-1234436084);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)262304248 ^ (long)262304195);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-868894487 ^ (long)-868894468);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)427814622 ^ (long)427814414);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)138852369 ^ (long)138852432);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-459407360 ^ (long)-459407321);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1880141793 ^ (long)-1880141717);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)1021846632 ^ (long)1021846638);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-966784423 ^ (long)-966784465);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1593675733 ^ (long)-1593675606);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1789740376 ^ (long)-1789740308);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-1419474193 ^ (long)-1419474423);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)969870169 ^ (long)969870187);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1038506290 ^ (long)1038506476);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)698903286 ^ (long)698903179);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-301065012 ^ (long)-301064996);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1799554675 ^ (long)1799554576);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)1808896731 ^ (long)1808896574);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)1422878760 ^ (long)1422878720);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1641414315 ^ (long)1641414296);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)980625933 ^ (long)980626133);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)398723109 ^ (long)398723080);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-740441016 ^ (long)-740440872);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)529337542 ^ (long)529337577);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1234902690 ^ (long)-1234902587);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)143534332 ^ (long)143534150);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1408435380 ^ (long)1408435446);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-965860417 ^ (long)-965860386);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1310582978 ^ (long)-1310582929);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1611454295 ^ (long)1611454293);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)739914830 ^ (long)739914804);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1170710795 ^ (long)1170710955);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1255167778 ^ (long)1255167942);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)2060057859 ^ (long)2060057906);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-476751767 ^ (long)-476751759);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)271850902 ^ (long)271850873);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-767967032 ^ (long)-767967232);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)1596495484 ^ (long)1596495409);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1121218625 ^ (long)1121218755);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-682964899 ^ (long)-682964896);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1692791483 ^ (long)1692791541);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)2070469198 ^ (long)2070469289);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1640896493 ^ (long)1640896418);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1346445049 ^ (long)-1346444928);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)51010578 ^ (long)51010608);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)460524104 ^ (long)460524065);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1040934122 ^ (long)-1040933916);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-326600720 ^ (long)-326600943);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-414328767 ^ (long)-414328663);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-2133899954 ^ (long)-2133899950);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)590675670 ^ (long)590675472);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)491096088 ^ (long)491096312);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)809194215 ^ (long)809194182);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)898320220 ^ (long)898320214);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1419841404 ^ (long)-1419841361);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1277614327 ^ (long)1277614109);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1696150471 ^ (long)1696150468);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-881501685 ^ (long)-881501551);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1101201625 ^ (long)1101201494);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-2013143867 ^ (long)-2013143841);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1617180378 ^ (long)1617180296);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)839068961 ^ (long)839069171);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1325937596 ^ (long)1325937531);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-1528191391 ^ (long)-1528191471);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1382957840 ^ (long)-1382957897);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1624171982 ^ (long)1624171797);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1895296864 ^ (long)-1895296962);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1675641083 ^ (long)-1675641087);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-286436838 ^ (long)-286436857);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1108964656 ^ (long)1108964655);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)1152857055 ^ (long)1152856843);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1227024681 ^ (long)1227024727);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1878242795 ^ (long)1878242587);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)656201778 ^ (long)656201930);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)241994921 ^ (long)241994889);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1851844879 ^ (long)1851844931);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1035004956 ^ (long)1035005092);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)1260123865 ^ (long)1260123791);
                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)827968583 ^ (long)827968619);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)2002050590 ^ (long)2002050785)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1498292564 ^ (long)-1498341037)) >>> (int)((long)-940613234 ^ (long)-940613242)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1435979482 ^ (long)-1435979482);
            if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-733626707 ^ (long)-733626705);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1531496880 ^ (long)1531496883) | var5_6 << (int)((long)688624892 ^ (long)688624889)) ^ var3_4[var7_8]) & (int)((long)1706164019 ^ (long)1706164172);
                    if (5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-1627225041 ^ (long)-1627225044) | var6_7 << (int)((long)1172599365 ^ (long)1172599360)) ^ var3_4[var7_8]) & (int)((long)-202630466 ^ (long)-202630591);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            5P.c[var2_3] = new String(var3_4).intern();
        }
        return 5P.c[var2_3];
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static 5P 0(@Nullable 49 object) {
        boolean bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
        if (bl2 || bl2) return null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (bl2 || bl2) return null;
        if (object != null) {
            if (bl2 || bl2) return null;
            hashMap.put(5P.a((int)((long)106479831 ^ (long)-106491634), (int)((long)-1250115237 ^ (long)-1250110774)), 5P.a((int)((long)-2146104004 ^ (long)2146098402), (int)((long)854595136 ^ (long)-854609509)) + ((49)object).toString());
            if (bl2) return null;
        }
        try {
            if (bl2) return null;
            object = 7l.0(5P.a((int)((long)1312565784 ^ (long)-1312556096), (int)((long)106753167 ^ (long)106742847)) + 4, hashMap);
            if (!((5r)object).2()) {
                if (bl2 || bl2) return null;
                throw new IOException(4 + 5P.a((int)((long)1243491697 ^ (long)-1243480914), (int)((long)-1864554711 ^ (long)-1864562512)) + ((5r)object).0);
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
            if (bl2 || bl2) return null;
            return new 5P();
        }
        {
            if (bl2) return null;
            return ((5r)object).0(5P.class);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5P() {
        block3: {
            block2: {
                boolean bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
                if (bl2 || bl2) break block2;
                this.3 = new HashMap<String, OptionalInt>();
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Optional<nf> 2() {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200d\u2004\u2006\u200e\u2005\u200f\u2004;
                if (bl2 || bl2) return null;
                if (this.7 == null) break block7;
                if (bl2) return null;
                if (this.7.0 == null) break block7;
                if (bl2) return null;
                if (!this.7.0.isEmpty()) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            return Optional.empty();
        }
        if (!bl2) return Optional.ofNullable(3L.0(this.7.0, (boolean)((long)993100904 ^ (long)993100904)));
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)792958751 ^ (long)792958745)];
            if (var7) break block25;
            var3_2 = (int)((long)-87537476 ^ (long)-87537476);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\u89cd\ua126\u6205\u9fb2\u892f\ua1eb\u6236\u9fbc\u89df\ua133\u625e\u9f32\u8906\ua188\u6268\u9fce\u898d\ua1b1\u6284\u9f48\u8964\ua1a6\u62f9\u9fb9\u89a4\ua1f6\u62c9\u9f10\u890e\ua100\u621d\u9f18\u89e7\ua144\u62e3\u9f0e\u8988\ua140\u624c\u9f72\u89fd\ua1b5\u629f\u9f86\u895e\ua1a1\u62c4\u9f4a\u89e6\ua11f\u6228\u9f03\u895c\ua1ae\u622a\u9fb2\u8973\ua1f0\u6240\u9f88\u89f8\ua1bc", 1080799079);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)273077815 ^ (long)273077808);
            if (var7) break block25;
            var0_6 = (int)((long)-1718205282 ^ (long)1718205281);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)387840756 ^ (long)387840669);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)369567127 ^ (long)-369567128);
                        if (5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u1143\u39a5\ufa45\u075c\u111f\u398e\ufaab\u0765\u11fa\u39d3\ufa02\u0735\u1156\u3923\ufac0\u075a\u1153\u395d\ufac7\u0745\u113b\u39aa\ufa59\u0760\u118f", 499922931);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)-1079642669 ^ (long)-1079642686);
                                var0_6 = (int)((long)-962150027 ^ (long)962150026);
                                while (true) {
                                    v0 = (int)((long)1770622297 ^ (long)1770622329);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)-325328582 ^ (long)-325328582);
                                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break block21;
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
                                    if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) ** continue;
                                    throw null;
                                }
                                5P.a = var5_1;
                                5P.c = new String[(int)((long)-1660643663 ^ (long)-1660643657)];
                                if (5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)-346408861 ^ (long)-346408861);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)-2008738385 ^ (long)-2008738386)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)-568810934 ^ (long)-568810931)) {
                                    case 0: {
                                        v15 = (int)((long)565471872 ^ (long)565471962);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)2039182101 ^ (long)2039182080);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)2103328335 ^ (long)2103328334);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)1508310307 ^ (long)1508310338);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)505975380 ^ (long)505975378);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-814739344 ^ (long)-814739352);
                                        if (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)-1552288210 ^ (long)-1552288191);
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
                            } while (!5P.\u200d\u2004\u2006\u200e\u2005\u200f\u2004);
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
                5P.4 = 5P.a((int)((long)-1075722184 ^ (long)1075714530), (int)((long)1203753841 ^ (long)1203760383));
                break;
            }
        }
    }
}

