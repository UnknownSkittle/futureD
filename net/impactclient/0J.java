/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 */
package net.impactclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.Objects;
import net.impactclient.02;
import net.impactclient.0rB$1f;
import net.impactclient.0rZ;
import net.impactclient.1b;
import net.impactclient.1i;
import net.impactclient.3F;
import net.impactclient.3W;
import net.impactclient.5_;
import net.impactclient.7b;
import pw.knx.feather.structures.Color;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0J
implements 1i<aow> {
    private static final String[] a;
    public static final boolean \u200f\u2003\u2005\u2005\u2001;
    private static final String[] b;

    @Override
    public final /* synthetic */ Object 0(5_ _, Type type, String string) {
        boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return aow.b((String)string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static JsonObject 0(3W object) {
        JsonPrimitive jsonPrimitive;
        boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
        if (bl2) return null;
        if (bl2) return null;
        if (object instanceof 0rZ) {
            if (bl2) return null;
            if (bl2) return null;
            return null;
        }
        if (bl2) return null;
        JsonObject jsonObject = new JsonObject();
        if (bl2) return null;
        if (bl2) return null;
        Object object2 = object;
        Object t2 = object2.1();
        if (bl2) return null;
        if (bl2) return null;
        if (object2 instanceof 3F) {
            if (bl2) return null;
            if (bl2) return null;
            if (02.a.1((3F)object2)) {
                if (bl2) return null;
                if (bl2) return null;
                jsonPrimitive = new JsonPrimitive(0J.a((int)((long)-1260138914 ^ (long)1260135095), (int)((long)235879423 ^ (long)-235886944)));
                if (\u200f\u2003\u2005\u2005\u2001) {
                    throw null;
                }
            } else {
                jsonPrimitive = new JsonPrimitive(Integer.toHexString((int)((long)2030051175 ^ (long)2046812312) & ((Color)t2).getHex()));
                if (\u200f\u2003\u2005\u2005\u2001) {
                    throw null;
                }
            }
        } else if (t2 instanceof Number) {
            jsonPrimitive = new JsonPrimitive((Number)t2);
            if (\u200f\u2003\u2005\u2005\u2001) {
                throw null;
            }
        } else if (t2 instanceof Boolean) {
            jsonPrimitive = new JsonPrimitive((Boolean)t2);
            if (\u200f\u2003\u2005\u2005\u2001) {
                throw null;
            }
        } else if (t2 instanceof String) {
            jsonPrimitive = new JsonPrimitive((String)t2);
            if (\u200f\u2003\u2005\u2005\u2001) {
                throw null;
            }
        } else {
            if (!(t2 instanceof Enum)) return null;
            jsonPrimitive = new JsonPrimitive(((Enum)t2).name());
            if (\u200f\u2003\u2005\u2005\u2001) {
                throw null;
            }
        }
        object2 = jsonPrimitive;
        if (jsonPrimitive == null) {
            return null;
        }
        jsonObject.addProperty(0J.a((int)((long)476550442 ^ (long)-476546618), (int)((long)2093141300 ^ (long)2093132404)), (String)object.1());
        jsonObject.add(0J.a((int)((long)910608026 ^ (long)-910611854), (int)((long)1088281255 ^ (long)1088276262)), (JsonElement)object2);
        object = 0J.0((1b)object);
        if (object == null) {
            return jsonObject;
        }
        jsonObject.add(0J.a((int)((long)1846492021 ^ (long)-1846487137), (int)((long)-1005809293 ^ (long)1005805633)), (JsonElement)object);
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(Type type) {
        boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
        if (bl2 || bl2) return true;
        if (type instanceof Class) {
            if (bl2) return true;
            if (aow.class.isAssignableFrom((Class)type)) {
                if (bl2) return true;
                return (int)((long)699165100 ^ (long)699165101) != 0;
            }
        }
        if (!bl2) return (int)((long)-1694411900 ^ (long)-1694411900) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0J() {
        boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
        if (bl2) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 0J.\u200f\u2003\u2005\u2005\u2001;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1712616284 ^ (long)1712611403)) & (int)((long)2104749691 ^ (long)2104693124);
            if (var9_2) ** GOTO lbl-1000
            if (0J.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 0J.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)505684653 ^ (long)505684653)] & (int)((long)-1871601981 ^ (long)-1871602116)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1326880312 ^ (long)-1326880438);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1126460792 ^ (long)-1126460702);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1384602589 ^ (long)-1384602571);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)235461144 ^ (long)235461331);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)262664792 ^ (long)262664765);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-518137434 ^ (long)-518137426);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-609834895 ^ (long)-609834949);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-1264932038 ^ (long)-1264931944);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1206135230 ^ (long)1206135052);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1257034143 ^ (long)1257034036);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1291353397 ^ (long)-1291353487);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)2016609850 ^ (long)2016609893);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1914105281 ^ (long)-1914105297);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)403021442 ^ (long)403021488);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1490129278 ^ (long)-1490129354);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1586323907 ^ (long)1586323728);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)78347494 ^ (long)78347347);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)1795107889 ^ (long)1795108083);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)862537320 ^ (long)862537318);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-1370083372 ^ (long)-1370083531);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)277777373 ^ (long)277777302);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1639070255 ^ (long)1639070443);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1179128584 ^ (long)1179128625);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)1631107388 ^ (long)1631107434);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)2030433029 ^ (long)2030433117);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-843990358 ^ (long)-843990510);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-806555857 ^ (long)-806555766);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1279865478 ^ (long)-1279865420);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-720546542 ^ (long)-720546326);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1449161725 ^ (long)-1449161515);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-800255002 ^ (long)-800255065);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-504742372 ^ (long)-504742334);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1822475234 ^ (long)1822475035);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1569890776 ^ (long)1569890566);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-120987210 ^ (long)-120987152);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)2140253608 ^ (long)2140253601);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-466801299 ^ (long)-466801374);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1021556629 ^ (long)1021556642);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)81081604 ^ (long)81081768);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1273516834 ^ (long)1273516932);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)586740412 ^ (long)586740412);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-271844236 ^ (long)-271844097);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)947013825 ^ (long)947013746);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)427884585 ^ (long)427884751);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)967427217 ^ (long)967427100);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1567293215 ^ (long)1567293411);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)114406406 ^ (long)114406462);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-804416234 ^ (long)-804416201);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)955695183 ^ (long)955695247);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1394825569 ^ (long)-1394825498);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-1745213259 ^ (long)-1745213331);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)2014473193 ^ (long)2014473213);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)2044838639 ^ (long)2044838488);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1646036560 ^ (long)-1646036710);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1298830705 ^ (long)1298830829);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-613225536 ^ (long)-613225476);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1544550601 ^ (long)-1544550570);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)162550169 ^ (long)162550249);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1282670114 ^ (long)-1282670294);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)870096839 ^ (long)870096656);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-903754741 ^ (long)-903754527);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1638739796 ^ (long)1638739793);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-266341107 ^ (long)-266340865);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1203851254 ^ (long)-1203851012);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-162900607 ^ (long)-162900725);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)1124338079 ^ (long)1124337966);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)346026037 ^ (long)346026200);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1019318498 ^ (long)1019318523);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)961440854 ^ (long)961440892);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-940926380 ^ (long)-940926375);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-234374674 ^ (long)-234374818);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)362589934 ^ (long)362589816);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1047016716 ^ (long)-1047016951);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)1120885200 ^ (long)1120885220);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-503357344 ^ (long)-503357367);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-856886259 ^ (long)-856886241);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1226428937 ^ (long)-1226429068);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-219741902 ^ (long)-219741900);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)57114834 ^ (long)57114775);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1720351362 ^ (long)-1720351411);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-1716630707 ^ (long)-1716630713);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1812438497 ^ (long)1812438342);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1976863164 ^ (long)1976863194);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1295718835 ^ (long)1295718882);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-240793967 ^ (long)-240794106);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1143079121 ^ (long)1143079000);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)341373283 ^ (long)341373259);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-956481667 ^ (long)-956481656);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)632503107 ^ (long)632503079);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-58846397 ^ (long)-58846356);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)644017553 ^ (long)644017457);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)1292546707 ^ (long)1292546572);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-295558000 ^ (long)-295557906);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-487785570 ^ (long)-487785694);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1307752142 ^ (long)1307752147);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-444516919 ^ (long)-444516992);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)185143266 ^ (long)185143099);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)356126894 ^ (long)356126735);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-829114023 ^ (long)-829114069);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-19445126 ^ (long)-19444998);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)2127679723 ^ (long)2127679591);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1909535532 ^ (long)-1909535666);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)1619606448 ^ (long)1619606516);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-2070416487 ^ (long)-2070416591);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-985338226 ^ (long)-985338142);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-280322402 ^ (long)-280322431);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1153861036 ^ (long)-1153861101);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1531567276 ^ (long)-1531567262);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)977429332 ^ (long)977429495);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-297344573 ^ (long)-297344598);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-196061260 ^ (long)-196061323);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)88265937 ^ (long)88265778);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1646228802 ^ (long)1646228757);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1199054179 ^ (long)-1199054104);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-554852900 ^ (long)-554853106);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1359981300 ^ (long)-1359981174);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-128406587 ^ (long)-128406691);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1365618504 ^ (long)-1365618634);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)1954385655 ^ (long)1954385464);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)379746049 ^ (long)379746084);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)2076473142 ^ (long)2076473141);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)2140913982 ^ (long)2140913987);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1933427008 ^ (long)-1933427046);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-1423762215 ^ (long)-1423762210);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)220753687 ^ (long)220753804);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-804880560 ^ (long)-804880491);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-1301865545 ^ (long)-1301865630);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-672580373 ^ (long)-672580587);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-190392221 ^ (long)-190392155);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)741147123 ^ (long)741147071);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-16795760 ^ (long)-16795707);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)306180019 ^ (long)306179966);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1988644713 ^ (long)-1988644646);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1600514929 ^ (long)1600515044);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)663406834 ^ (long)663406665);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-1427251135 ^ (long)-1427251126);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)896529322 ^ (long)896529157);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1942346252 ^ (long)-1942346419);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-517169948 ^ (long)-517169991);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1915433461 ^ (long)-1915433283);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)605435671 ^ (long)605435848);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)379472317 ^ (long)379472296);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1786592824 ^ (long)1786592913);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-1183812637 ^ (long)-1183812801);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)226925120 ^ (long)226925119);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1355041222 ^ (long)-1355041093);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-607842384 ^ (long)-607842402);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1561217051 ^ (long)1561217061);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)1283291489 ^ (long)1283291414);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)827190882 ^ (long)827190963);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-2049952605 ^ (long)-2049952663);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1866473424 ^ (long)1866473226);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1605727512 ^ (long)1605727714);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-2065627258 ^ (long)-2065627213);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)2084638172 ^ (long)2084638029);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)1626037549 ^ (long)1626037729);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1437387038 ^ (long)1437387086);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-181217107 ^ (long)-181217238);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)1097393154 ^ (long)1097393213);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)999108858 ^ (long)999108825);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)611172682 ^ (long)611172630);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1676810983 ^ (long)1676810998);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-1520646055 ^ (long)-1520646059);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-600618255 ^ (long)-600618459);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)886455308 ^ (long)886455381);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)213336188 ^ (long)213336156);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-524871666 ^ (long)-524871570);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)524018162 ^ (long)524018077);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-937755058 ^ (long)-937754959);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-824382632 ^ (long)-824382520);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-918135875 ^ (long)-918135850);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-793993527 ^ (long)-793993619);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-1815923182 ^ (long)-1815923130);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)2039304617 ^ (long)2039304595);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-719783649 ^ (long)-719783573);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-146511884 ^ (long)-146511890);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)892885988 ^ (long)892885763);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-826045013 ^ (long)-826045056);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1104675867 ^ (long)1104676051);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)1278474780 ^ (long)1278474975);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-64639486 ^ (long)-64639451);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)675868180 ^ (long)675868214);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)1384437160 ^ (long)1384437226);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-672566411 ^ (long)-672566374);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-2024836116 ^ (long)-2024836152);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)172341174 ^ (long)172341214);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1412534568 ^ (long)-1412534629);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1605365579 ^ (long)-1605365722);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-598567227 ^ (long)-598567360);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-103577329 ^ (long)-103577294);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1433543290 ^ (long)1433543367);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-411803866 ^ (long)-411803695);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1588508314 ^ (long)-1588508415);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1854277980 ^ (long)1854278061);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-2113368802 ^ (long)-2113368717);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)916663030 ^ (long)916662884);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)761980692 ^ (long)761980913);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1370110407 ^ (long)-1370110247);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)1677574513 ^ (long)1677574554);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)626203766 ^ (long)626203796);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1554426675 ^ (long)1554426679);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-473086972 ^ (long)-473086913);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1126699064 ^ (long)-1126699056);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)2018258324 ^ (long)2018258341);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-166526064 ^ (long)-166526162);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)1359026985 ^ (long)1359027026);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)614821507 ^ (long)614821402);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-17278411 ^ (long)-17278245);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-789544251 ^ (long)-789544246);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-738472753 ^ (long)-738472754);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1793902015 ^ (long)1793902079);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-2082300637 ^ (long)-2082300592);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1690214689 ^ (long)1690214767);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1845427550 ^ (long)-1845427697);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-2014854927 ^ (long)-2014855021);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)314393205 ^ (long)314393171);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)1510650043 ^ (long)1510649963);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1247903281 ^ (long)1247903426);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-552967140 ^ (long)-552967062);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1402847979 ^ (long)-1402847830);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)280300567 ^ (long)280300795);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1611415153 ^ (long)1611415212);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)390347030 ^ (long)390347066);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1586307172 ^ (long)-1586307327);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)27619199 ^ (long)27619307);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-2130018259 ^ (long)-2130018212);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1197852576 ^ (long)-1197852485);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1140199093 ^ (long)1140199126);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1393063399 ^ (long)-1393063305);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)72872344 ^ (long)72872373);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-989959010 ^ (long)-989958942);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-766445364 ^ (long)-766445316);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1398137928 ^ (long)-1398137926);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-77661510 ^ (long)-77661622);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)809782952 ^ (long)809782994);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-2142737961 ^ (long)-2142738036);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1779034170 ^ (long)1779034150);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1592435367 ^ (long)-1592435445);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-565420193 ^ (long)-565420095);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1804084 ^ (long)1804208);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)478156759 ^ (long)478156676);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)834197148 ^ (long)834197131);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1206150523 ^ (long)-1206150548);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-2136702121 ^ (long)-2136702050);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1343602013 ^ (long)-1343602105);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-709136721 ^ (long)-709136857);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1358195427 ^ (long)-1358195238);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)1347652315 ^ (long)1347652296);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)617766138 ^ (long)617766066);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1427150159 ^ (long)1427150260);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1426693784 ^ (long)-1426693657);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1390344506 ^ (long)1390344596);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-437570542 ^ (long)-437570454);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)352990901 ^ (long)352990894);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-599868348 ^ (long)-599868244);
                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)571542549 ^ (long)571542539);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-1866198832 ^ (long)-1866198993)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)518295546 ^ (long)518287365)) >>> (int)((long)-1433117426 ^ (long)-1433117434)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)357215932 ^ (long)357215932);
            if (!0J.\u200f\u2003\u2005\u2005\u2001) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1424340187 ^ (long)-1424340185);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-1776102041 ^ (long)-1776102044) | var5_6 << (int)((long)227866871 ^ (long)227866866)) ^ var3_4[var7_8]) & (int)((long)-1089458007 ^ (long)-1089458090);
                    if (0J.\u200f\u2003\u2005\u2005\u2001) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1980134803 ^ (long)1980134800) | var6_7 << (int)((long)-566386593 ^ (long)-566386598)) ^ var3_4[var7_8]) & (int)((long)-1657007976 ^ (long)-1657008025);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            0J.b[var2_3] = new String(var3_4).intern();
        }
        return 0J.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(1b b2, JsonArray jsonArray) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
                if (bl2 || bl2) break block2;
                jsonArray.forEach(jsonElement -> {
                    boolean bl2;
                    block30: {
                        Object t2;
                        1b b3;
                        JsonPrimitive jsonPrimitive;
                        String[] stringArray;
                        block32: {
                            block31: {
                                bl2 = \u200f\u2003\u2005\u2005\u2001;
                                if (bl2) return;
                                stringArray = 7b.0();
                                if (bl2 || bl2) return;
                                if (!jsonElement.isJsonObject()) {
                                    if (bl2 || bl2) return;
                                    return;
                                }
                                if (bl2) return;
                                if (!((JsonObject)(jsonElement = jsonElement.getAsJsonObject())).has(0J.a((int)((long)-1571727343 ^ (long)1571730687), (int)((long)-1588272591 ^ (long)-1588272224)))) break block31;
                                if (bl2) return;
                                if (((JsonObject)jsonElement).get(0J.a((int)((long)1983283903 ^ (long)-1983287725), (int)((long)1019566779 ^ (long)1019559419))).isJsonPrimitive()) break block32;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            return;
                        }
                        if (bl2) return;
                        if ((b2 = b2.0(((JsonObject)jsonElement).get(0J.a((int)((long)-252021021 ^ (long)252025359), (int)((long)1647927749 ^ (long)1647904389))).getAsString())) == null) {
                            if (bl2 || bl2) return;
                            return;
                        }
                        if (bl2) return;
                        if (!((JsonObject)jsonElement).has(0J.a((int)((long)1476485313 ^ (long)-1476490194), (int)((long)1493834499 ^ (long)1493839669)))) break block30;
                        if (bl2) return;
                        if (!((JsonObject)jsonElement).get(0J.a((int)((long)-2023153626 ^ (long)2023148750), (int)((long)196157322 ^ (long)196149771))).isJsonPrimitive()) break block30;
                        if (bl2) return;
                        try {
                            if (bl2) return;
                            jsonPrimitive = ((JsonObject)jsonElement).get(0J.a((int)((long)-1137323872 ^ (long)1137327176), (int)((long)20791926 ^ (long)20799479))).getAsJsonPrimitive();
                            b3 = b2;
                            t2 = b3.1();
                            if (bl2 || bl2) return;
                            if (b3 instanceof 3F) {
                                if (bl2 || bl2) return;
                                boolean bl3 = jsonPrimitive.getAsString().equals(0J.a((int)((long)-1671118266 ^ (long)1671114401), (int)((long)-1901819387 ^ (long)-1901800441)));
                                if (bl2 || bl2) return;
                                02.a.0((3F)b3, bl3);
                                if (bl2 || bl2) return;
                                if (!bl3) {
                                    if (bl2 || bl2) return;
                                    b3.0(Color.fromHex((int)Long.parseLong(jsonPrimitive.getAsString(), (int)((long)1761525709 ^ (long)1761525725))));
                                    if (bl2) return;
                                }
                                if (bl2) return;
                                if (\u200f\u2003\u2005\u2005\u2001) {
                                    throw null;
                                }
                                break block30;
                            }
                        } catch (Exception exception) {
                            exception.printStackTrace();
                            if (bl2) return;
                            break block30;
                        }
                        {
                            if (bl2) return;
                            if (t2 instanceof Float) {
                                if (bl2 || bl2) return;
                                b3.0(Float.valueOf(jsonPrimitive.getAsNumber().floatValue()));
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (t2 instanceof Integer) {
                                if (bl2 || bl2) return;
                                b3.0(jsonPrimitive.getAsNumber().intValue());
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (t2 instanceof Double) {
                                if (bl2 || bl2) return;
                                b3.0(jsonPrimitive.getAsNumber().doubleValue());
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (t2 instanceof Boolean) {
                                if (bl2 || bl2) return;
                                b3.0(jsonPrimitive.getAsBoolean());
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (t2 instanceof String) {
                                if (bl2 || bl2) return;
                                b3.0(jsonPrimitive.getAsString());
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (t2 instanceof Enum) {
                                if (bl2 || bl2) return;
                                b3.0(Enum.valueOf(((Enum)t2).getDeclaringClass(), jsonPrimitive.getAsString()));
                                if (bl2) return;
                                if (stringArray != null) break block30;
                                if (bl2) return;
                            }
                            if (bl2) return;
                            throw new IllegalStateException(0J.a((int)((long)567967848 ^ (long)-567972731), (int)((long)-708251987 ^ (long)-708263302)) + t2 + 0rB$1f.XNZw("\uc2e4", 2089870466) + t2.getClass());
                        }
                    }
                    if (bl2) return;
                    if (((JsonObject)jsonElement).has(0J.a((int)((long)-2068189527 ^ (long)2068185666), (int)((long)-184636159 ^ (long)-184617735)))) {
                        if (bl2) return;
                        if (((JsonObject)jsonElement).get(0J.a((int)((long)1405340191 ^ (long)-1405344011), (int)((long)332576026 ^ (long)-332577752))).isJsonArray()) {
                            if (bl2 || bl2) return;
                            0J.0(b2, ((JsonObject)jsonElement).get(0J.a((int)((long)1039139911 ^ (long)-1039144787), (int)((long)-1508088490 ^ (long)1508086884))).getAsJsonArray());
                            if (bl2) return;
                        }
                    }
                    if (!bl2) return;
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static JsonArray 0(1b b2) {
        boolean bl2 = \u200f\u2003\u2005\u2005\u2001;
        if (bl2 || bl2) return null;
        JsonArray jsonArray = new JsonArray();
        if (bl2 || bl2) return null;
        b2.0().stream().map(0J::0).filter(Objects::nonNull).forEach(jsonArray::add);
        if (bl2 || bl2) return null;
        if (jsonArray.size() > 0) {
            if (bl2) return null;
            return jsonArray;
        }
        if (!bl2) return null;
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 0J.\u200f\u2003\u2005\u2005\u2001;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-746190627 ^ (long)-746190636)];
            if (var7) break block23;
            var3_2 = (int)((long)1988542904 ^ (long)1988542904);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\ud228\ufa94\u3987\uc4ca\ud235\ufa2e\u39c7\uc4c6\ud2cd\ufa29\u396b\uc4ac\ud2cc\ufa84\u3980\uc4c8\ud2b0\ufad1\u3908\uc434\ud2d2\ufa0b\u3998\uc454\ud24c\ufa0d\u39e6\uc453\ud23a\ufa96\u3954\uc41b\ud2a8\ufa2a\u3945\uc4ed\ud26d\ufad0\u392f\uc434\ud2c4\ufa43\u3998\uc420\ud25c\ufa5a\u398a\uc4a6", -225315707);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-960979748 ^ (long)-960979751);
            if (var7) break block23;
            var0_6 = (int)((long)-1595986685 ^ (long)1595986684);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-172616059 ^ (long)-172615992);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)-108387459 ^ (long)108387458);
                    if (0J.\u200f\u2003\u2005\u2005\u2001) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!0J.\u200f\u2003\u2005\u2005\u2001) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u7240\u5a56\u9902\u641a\u720d\u5a33\u99f8\u64cb\u72d3\u5a87\u99d2\u6432\u7233", -405318499);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-2144818655 ^ (long)-2144818652);
                            var0_6 = (int)((long)-403672967 ^ (long)403672966);
                            while (true) {
                                v0 = (int)((long)-446016029 ^ (long)-446016101);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-1675670180 ^ (long)-1675670180);
                                if (!0J.\u200f\u2003\u2005\u2005\u2001) break block20;
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
                                if (!0J.\u200f\u2003\u2005\u2005\u2001) ** continue;
                                throw null;
                            }
                            0J.a = var5_1;
                            0J.b = new String[(int)((long)556221297 ^ (long)556221304)];
                            if (!0J.\u200f\u2003\u2005\u2005\u2001) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-1597177276 ^ (long)-1597177276);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)676366359 ^ (long)676366358)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1172465724 ^ (long)-1172465725)) {
                                case 0: {
                                    v15 = (int)((long)-1459042910 ^ (long)-1459042838);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)864427983 ^ (long)864427981);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)394621800 ^ (long)394621771);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-2033480669 ^ (long)-2033480652);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-502307679 ^ (long)-502307649);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-1543088251 ^ (long)-1543088170);
                                    if (!0J.\u200f\u2003\u2005\u2005\u2001) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)876455937 ^ (long)876456001);
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var6_7;
                            v8 = v11;
                            if (v11 != 0) break block21;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        } while (!0J.\u200f\u2003\u2005\u2005\u2001);
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
lbl118:
                    // 1 sources

                    ** continue;
                }
            }
        }
    }
}

