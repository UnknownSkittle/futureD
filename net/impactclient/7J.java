/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.impactclient.0rB$1f;
import net.impactclient.3;
import net.impactclient.3o;
import net.impactclient.5e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 7J
extends LinkedList<Map.Entry<String, String>> {
    private static final String[] b;
    private static final String[] a;
    public static final boolean \u200c\u2005;
    private /* synthetic */ 3o 0;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean isEmpty() {
        boolean bl2 = \u200c\u2005;
        if (bl2 || bl2) return true;
        if (super.isEmpty()) {
            if (bl2) return true;
            return (int)((long)-1717059186 ^ (long)-1717059185) != 0;
        }
        if (bl2) return true;
        if (!this.toString().matches(7J.a((int)((long)-1282506764 ^ (long)-1282518497), (int)((long)-426624195 ^ (long)-426623901)))) {
            if (bl2) return true;
            return (int)((long)-1182421587 ^ (long)-1182421588) != 0;
        }
        if (!bl2) return (int)((long)185521940 ^ (long)185521940) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 1(String string) {
        boolean bl2 = \u200c\u2005;
        if (bl2 || bl2) return null;
        if ((string = string.trim()).matches(7J.a((int)((long)639151138 ^ (long)639140290), (int)((long)668174296 ^ (long)-668173847)))) {
            if (bl2 || bl2) return null;
            if (string.matches(7J.a((int)((long)-1442634101 ^ (long)-1442641050), (int)((long)1392431998 ^ (long)1392415283)))) {
                if (bl2 || bl2) return null;
                string = 7J.a((int)((long)1493345586 ^ (long)1493338332), (int)((long)847920436 ^ (long)847912044)).concat(String.valueOf(string));
                if (bl2) return null;
            }
            if (bl2) return null;
            if (!string.matches(7J.a((int)((long)283794613 ^ (long)283799900), (int)((long)1911121476 ^ (long)1911106530)))) {
                if (bl2 || bl2) return null;
                string = 7J.a((int)((long)-1986848734 ^ (long)-1986841142), (int)((long)193468228 ^ (long)-193494230)).concat(String.valueOf(string));
                if (bl2) return null;
            }
            if (bl2) return null;
            return string;
        }
        if (!bl2) return null;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2005;
                if (bl2 || bl2) break block2;
                String string2 = string;
                this.add(new AbstractMap.SimpleEntry<String, String>(string2, 7J.1(string2)));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        block4: {
            boolean bl2 = \u200c\u2005;
            if (!bl2) {
                while (!bl2) {
                    Object object = (Map.Entry)this.pollLast();
                    if (object != null) {
                        if (bl2 || bl2) break;
                        if (((String)(object = (String)object.getKey())).matches(7J.a((int)((long)-453755369 ^ (long)-453766152), (int)((long)-776321856 ^ (long)-776331906)))) {
                            if (bl2 || bl2) break;
                            this.0(((String)object).replaceAll(7J.a((int)((long)1232520974 ^ (long)1232530146), (int)((long)2053466352 ^ (long)2053460527)), 0rB$1f.XNZw("", -1749761710)));
                            if (bl2 || bl2) break;
                            return;
                        }
                        if (bl2) break;
                        if (!\u200c\u2005) continue;
                        throw null;
                    }
                    if (!bl2) break block4;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2005;
                if (bl2 || bl2) break block2;
                float[] fArray = new float[(int)((long)355985666 ^ (long)355985667)];
                fArray[(int)((long)956353998 ^ (long)956353998)] = this.0();
                float[] fArray2 = fArray;
                if (bl2 || bl2) break block2;
                7J j2 = this;
                j2.forEach(object -> {
                    block5: {
                        block2: {
                            String string;
                            boolean bl2;
                            block4: {
                                block3: {
                                    bl2 = \u200c\u2005;
                                    if (bl2 || bl2) break block2;
                                    string = (String)object.getKey();
                                    if (bl2 || bl2) break block2;
                                    if ((object = (String)object.getValue()) == null) break block3;
                                    if (bl2) break block2;
                                    if (!((String)object).isEmpty()) break block4;
                                    if (bl2) break block2;
                                }
                                if (bl2) break block2;
                                this.0.0.a(string, fArray2[(int)((long)-115956849 ^ (long)-115956849)], (float)n2, 3o.0());
                                if (bl2) break block2;
                            }
                            if (bl2) break block2;
                            n2 = this.0.0.a(string);
                            if (bl2 || bl2) break block2;
                            int n3 = (int)((long)1886547423 ^ (long)1886547423);
                            fArray[n3] = fArray2[n3] + (float)n2;
                            if (!bl2 && !bl2) break block5;
                        }
                        return;
                    }
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 7J(3o o2) {
        boolean bl2 = \u200c\u2005;
        this.0 = o2;
        if (bl2 || bl2) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 7J.\u200c\u2005;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-1336640352 ^ (long)-1336640343)];
            if (var7) break block23;
            var3_2 = (int)((long)-1467512808 ^ (long)-1467512808);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\ubc3d\u95c1\u560d\uab03\ubc6f\u958b\u56dc\uabc4\ubc8b\u9522\u562b\uabe4\ubce1\u95af\u561e\uabe6\ubc01\u9560\u5615\uabb7\ubc00\u9504\u562e\uabbd\ubcdd\u95b5\u56fd\uabd4\ubc86\u9522\u5617\uabdc\ubcd0\u95b6\u5612\uab50\ubc30\u95b7\u565f\uabd7\ubc69\u95e5\u56b8\uab7c\ubcea\u95cb\u5674\uabff\ubc60\u95bd\u5687\uabb4\ubc51\u9575\u56b4\uab41\ubcd3\u955b\u56ac\uab04\ubc62\u95b3\u5673\uabed\ubcdd\u958a\u564c\uabeb\ubc6b\u9573\u5668\uab13\ubc0c\u952f\u56b4\uab2f\ubcf8\u9502\u56b4\uab71\ubca5", 405969691);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)572466491 ^ (long)572466492);
            if (var7) break block23;
            var0_6 = (int)((long)917785289 ^ (long)-917785290);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)1542871265 ^ (long)1542871262);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)167829806 ^ (long)-167829807);
                    if (7J.\u200c\u2005) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!7J.\u200c\u2005) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u8519\uac46\u6fec\u9286\u85ac\uacbe\u6f51\u92c1\u8589\uacea\u6ff4\u926a\u850a\uac25\u6f6b\u92da\u85da\uac51\u6fbe\u92e0\u852d\uac1c\u6f65\u9299\u85fc\uac43\u6fae\u923c\u8573\uacfd\u6f91\u92a8\u85c0\uac8e\u6f99\u925d\u858c\uac0a\u6f20\u922b\u85fa\uaca4\u6fc3\u926c\u852b\uace3\u6f84\u9222\u85b1\uacb1\u6f39\u9218\u8526\uacf7\u6f21\u9285\u8578\uac6a\u6fff\u92ed\u85e4\uac1f\u6f65\u9214\u85c7\uac43\u6f76\u9277\u85b3\uac00\u6fcb\u92c0\u8546\uac2d\u6fe9\u92e8\u854e\uac2c\u6f66\u922f\u8501\uac2b\u6ff9\u9258\u850f\uacfa\u6fcb\u927b\u8569\uac7a\u6f19\u9280\u8522\uacbe\u6f32\u9264\u85ec\uac97\u6fc8\u92b9\u8549\uacdf\u6fa2\u92fe\u851c\uac07\u6fdd\u926a\u85a5\uac98\u6ffa\u9229\u8567\uaca5\u6f5e\u9209\u85df\uac65\u6feb\u925b\u8567\uace5\u6f9b\u926d\u8586\uacda\u6fb1\u92cb\u85a2\uaca3\u6fb9\u9229\u85b7\uac4d\u6f30\u925b\u859c", -1310678381);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)27761849 ^ (long)27761854);
                            var0_6 = (int)((long)2049001024 ^ (long)-2049001025);
                            while (true) {
                                v0 = (int)((long)-1167366076 ^ (long)-1167366101);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)1201896488 ^ (long)1201896488);
                                if (!7J.\u200c\u2005) break block20;
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
                                if (!7J.\u200c\u2005) ** continue;
                                throw null;
                            }
                            7J.a = var5_1;
                            7J.b = new String[(int)((long)-987606900 ^ (long)-987606907)];
                            if (!7J.\u200c\u2005) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-629002270 ^ (long)-629002270);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)340311134 ^ (long)340311135)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)709298798 ^ (long)709298793)) {
                                case 0: {
                                    v15 = (int)((long)-1096677561 ^ (long)-1096677520);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-438155290 ^ (long)-438155359);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-1385011835 ^ (long)-1385011714);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-1312100190 ^ (long)-1312100163);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-1686466287 ^ (long)-1686466205);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)1415016482 ^ (long)1415016456);
                                    if (!7J.\u200c\u2005) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)-2134398717 ^ (long)-2134398712);
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
                        } while (!7J.\u200c\u2005);
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

    @Override
    public final String toString() {
        boolean bl2 = \u200c\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return String.join((CharSequence)0rB$1f.XNZw("", -2013098780), this.stream().map(Map.Entry::getKey).collect(Collectors.toList()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private int 0() {
        int n2;
        block3: {
            block2: {
                boolean bl2 = \u200c\u2005;
                if (bl2 || bl2) break block2;
                n2 = this.0.0.a(this.toString());
                if (!bl2 && !bl2) break block3;
            }
            return -513596774;
        }
        return this.0.h + Math.round(3o.0((3o)this.0).d * (float)n2);
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 7J.\u200c\u2005;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-504752028 ^ (long)-504744564)) & (int)((long)-271604811 ^ (long)-271623094);
            if (var9_2) ** GOTO lbl-1000
            if (7J.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 7J.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)2072049673 ^ (long)2072049673)] & (int)((long)-2106551023 ^ (long)-2106550802)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1414001661 ^ (long)-1414001518);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)355715429 ^ (long)355715483);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-412152038 ^ (long)-412151963);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)441760019 ^ (long)441760201);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1342390049 ^ (long)-1342390237);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-439337617 ^ (long)-439337678);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-886627327 ^ (long)-886627125);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)597916168 ^ (long)597916248);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)741383042 ^ (long)741383049);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)2057393683 ^ (long)2057393767);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1466245190 ^ (long)-1466245295);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1156508935 ^ (long)-1156509118);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-614341228 ^ (long)-614341219);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)43528041 ^ (long)43527999);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-165037954 ^ (long)-165038028);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1862588649 ^ (long)1862588432);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-453089195 ^ (long)-453089153);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-174799188 ^ (long)-174799354);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)108918472 ^ (long)108918525);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-682700873 ^ (long)-682701048);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-220626846 ^ (long)-220626808);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-136276811 ^ (long)-136276987);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)225327405 ^ (long)225327402);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)474969255 ^ (long)474969251);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)423221241 ^ (long)423221103);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)539274512 ^ (long)539274565);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-388928162 ^ (long)-388928254);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-540810379 ^ (long)-540810352);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1396430836 ^ (long)-1396430659);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1658359435 ^ (long)1658359367);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)1834442679 ^ (long)1834442610);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)463235095 ^ (long)463235111);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1486381916 ^ (long)-1486381909);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1547532586 ^ (long)-1547532789);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1877794472 ^ (long)-1877794405);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)2104510651 ^ (long)2104510610);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-816777203 ^ (long)-816777184);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)716874934 ^ (long)716874924);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)1221982180 ^ (long)1221982058);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1783409722 ^ (long)-1783409911);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)1268780376 ^ (long)1268780435);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-714134208 ^ (long)-714134217);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)2016834068 ^ (long)2016834092);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-691185530 ^ (long)-691185448);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1427113463 ^ (long)-1427113403);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)836302289 ^ (long)836302195);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-1932768596 ^ (long)-1932768558);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-412326690 ^ (long)-412326890);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-304152485 ^ (long)-304152446);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)1125820992 ^ (long)1125821013);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-450013221 ^ (long)-450013337);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)261161676 ^ (long)261161521);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)710599790 ^ (long)710599699);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)812841789 ^ (long)812841797);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1677329937 ^ (long)1677330103);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-156462561 ^ (long)-156462544);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)1817384916 ^ (long)1817384901);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1053433180 ^ (long)-1053433129);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1235970350 ^ (long)-1235970389);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-176832020 ^ (long)-176832183);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)32449039 ^ (long)32449274);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1175385780 ^ (long)1175385671);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1788163343 ^ (long)-1788163517);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-560108889 ^ (long)-560108883);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-821532275 ^ (long)-821532170);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-446403771 ^ (long)-446403618);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1843443827 ^ (long)-1843443753);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1075229076 ^ (long)1075229110);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-1187367021 ^ (long)-1187367167);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)834845181 ^ (long)834845147);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1783959002 ^ (long)1783958824);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-643918079 ^ (long)-643917841);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1545430996 ^ (long)-1545430992);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)1556985393 ^ (long)1556985407);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1148467947 ^ (long)-1148467868);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-435612020 ^ (long)-435612066);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)392561175 ^ (long)392561173);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)305138609 ^ (long)305138530);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1368042437 ^ (long)1368042321);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1306368354 ^ (long)-1306368415);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-1455081222 ^ (long)-1455081336);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-556073412 ^ (long)-556073371);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-959823020 ^ (long)-959823002);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)934562493 ^ (long)934562346);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-14670939 ^ (long)-14670990);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1736587798 ^ (long)1736587817);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1680405084 ^ (long)-1680405052);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)1463300533 ^ (long)1463300399);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)1856292517 ^ (long)1856292353);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-1777199323 ^ (long)-1777199227);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)449235019 ^ (long)449234958);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)1139993687 ^ (long)1139993648);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)1039618744 ^ (long)1039618793);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-529708800 ^ (long)-529708754);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)308043499 ^ (long)308043359);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-591602864 ^ (long)-591602695);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1021030938 ^ (long)-1021030960);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1529265883 ^ (long)-1529265753);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-435299680 ^ (long)-435299686);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1340204640 ^ (long)1340204669);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-191497414 ^ (long)-191497315);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1618307051 ^ (long)-1618306822);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1550805263 ^ (long)-1550805306);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-429922043 ^ (long)-429922025);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)807915276 ^ (long)807915313);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-515023208 ^ (long)-515023289);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1137873316 ^ (long)-1137873204);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1542821040 ^ (long)-1542821060);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)836802774 ^ (long)836802741);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)1737416156 ^ (long)1737416055);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-1397077846 ^ (long)-1397077877);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)922560686 ^ (long)922560585);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)739004193 ^ (long)739004209);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-2127582862 ^ (long)-2127582798);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1540426959 ^ (long)-1540426966);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1415232244 ^ (long)1415232014);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1793060705 ^ (long)-1793060791);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)11934165 ^ (long)11933957);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)837353763 ^ (long)837353840);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-208646251 ^ (long)-208646186);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1308105509 ^ (long)1308105669);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)2058706392 ^ (long)2058706409);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-171997123 ^ (long)-171996980);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1475656817 ^ (long)1475656942);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1594456916 ^ (long)-1594457024);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-1563659719 ^ (long)-1563659667);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-1118335795 ^ (long)-1118335959);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1713561497 ^ (long)-1713561577);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)1741536258 ^ (long)1741536294);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)500708669 ^ (long)500708692);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1019805593 ^ (long)1019805655);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-541483239 ^ (long)-541483144);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)25211171 ^ (long)25211152);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)339808928 ^ (long)339808975);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1857384871 ^ (long)-1857384719);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-642238349 ^ (long)-642238274);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-2036850571 ^ (long)-2036850673);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)734266341 ^ (long)734266216);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)566815614 ^ (long)566815699);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1161095848 ^ (long)-1161095711);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-257474783 ^ (long)-257474621);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)591440843 ^ (long)591440663);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)39473892 ^ (long)0x25A522A);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)255167337 ^ (long)255167279);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1266138115 ^ (long)-1266138170);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)536862894 ^ (long)536862936);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-1611966403 ^ (long)-1611966278);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1151115139 ^ (long)-1151115109);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-225007629 ^ (long)-225007635);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)156566172 ^ (long)156566215);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)580206643 ^ (long)580206837);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)422698879 ^ (long)422698806);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1277561168 ^ (long)1277561146);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)1705154818 ^ (long)1705154912);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)127685281 ^ (long)127685249);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1577326313 ^ (long)-1577326276);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)522151295 ^ (long)522151404);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-2085426963 ^ (long)-2085426998);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)1180047293 ^ (long)1180047288);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1362650962 ^ (long)-1362651135);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-1167441261 ^ (long)-1167441307);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)923424461 ^ (long)923424460);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-883655420 ^ (long)-883655294);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)1821481284 ^ (long)1821481216);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-1906173680 ^ (long)-1906173674);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-1605063433 ^ (long)-1605063534);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)821194153 ^ (long)821194024);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)436615118 ^ (long)436614992);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1510805382 ^ (long)1510805319);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1969982550 ^ (long)1969982486);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-825153657 ^ (long)-825153789);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)821064296 ^ (long)821064296);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-1894269391 ^ (long)-1894269216);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1842022311 ^ (long)-1842022220);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1114919456 ^ (long)-1114919539);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-311441159 ^ (long)-311441231);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1324188684 ^ (long)1324188916);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1638834119 ^ (long)1638833991);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1170841421 ^ (long)1170841344);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)174117092 ^ (long)174116945);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)716316515 ^ (long)716316621);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)348346828 ^ (long)348346692);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-974619476 ^ (long)-974619631);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1799583605 ^ (long)-1799583705);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1235520769 ^ (long)-1235520834);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-297125295 ^ (long)-297125262);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-455752259 ^ (long)-455752278);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1458610164 ^ (long)-1458610064);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)373966318 ^ (long)373966181);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-1030164463 ^ (long)-1030164433);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-1736844687 ^ (long)-1736844774);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1707957261 ^ (long)1707957278);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1274824789 ^ (long)-1274824769);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-733241130 ^ (long)-733241181);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1733115554 ^ (long)-1733115424);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)948737130 ^ (long)948737270);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1240418393 ^ (long)-1240418402);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1934473936 ^ (long)-1934473792);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-1236258386 ^ (long)-1236258535);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1647853623 ^ (long)1647853586);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1364563499 ^ (long)1364563635);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)1407806520 ^ (long)1407806594);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1696375067 ^ (long)-1696375266);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)5183972 ^ (long)5183952);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1759363177 ^ (long)-1759363274);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-990606923 ^ (long)-990606994);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)849229661 ^ (long)849229822);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1263521032 ^ (long)1263521040);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1987103754 ^ (long)1987103950);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)597906716 ^ (long)597906705);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-24935148 ^ (long)-24935017);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)371470391 ^ (long)371470456);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-2099687938 ^ (long)-2099688076);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-2073861198 ^ (long)-2073861295);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)272303047 ^ (long)272302975);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-7665516 ^ (long)-7665496);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-941141271 ^ (long)-941141408);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)528028249 ^ (long)528028230);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-2094679033 ^ (long)-2094678860);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1949089891 ^ (long)-1949089981);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-777660065 ^ (long)-777660140);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1478983362 ^ (long)1478983296);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1253048242 ^ (long)1253048103);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)104881320 ^ (long)104881323);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)2066574513 ^ (long)2066574376);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-565285786 ^ (long)-565285888);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1309563130 ^ (long)1309563026);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)645349398 ^ (long)645349630);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1861903183 ^ (long)-1861903316);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-469859753 ^ (long)-469859824);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1019913099 ^ (long)-1019913174);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-2046819030 ^ (long)-2046819012);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1978032599 ^ (long)1978032481);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-102404962 ^ (long)-102404880);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-2075628466 ^ (long)-2075628446);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)154514271 ^ (long)154514246);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1763507601 ^ (long)1763507529);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-79207728 ^ (long)-79207851);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1480908694 ^ (long)-1480908642);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-874352200 ^ (long)-874352150);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1665189038 ^ (long)1665188998);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)943645581 ^ (long)943645519);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)647179249 ^ (long)647179064);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1984249154 ^ (long)1984249294);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)1205449340 ^ (long)1205449384);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1918678411 ^ (long)1918678396);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-651881870 ^ (long)-651881947);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-49322105 ^ (long)-49322013);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-337804703 ^ (long)-337804695);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-2068913582 ^ (long)-2068913570);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1106379664 ^ (long)-1106379521);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1621842077 ^ (long)1621841992);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)246336564 ^ (long)246336755);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1687414160 ^ (long)-1687414119);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)2137893824 ^ (long)2137893665);
                    if (!7J.\u200c\u2005) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)747326385 ^ (long)747326441);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-510490680 ^ (long)-510490825)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-124598823 ^ (long)-124634586)) >>> (int)((long)1700269898 ^ (long)1700269890)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-408610611 ^ (long)-408610611);
            if (!7J.\u200c\u2005) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1892381928 ^ (long)1892381930);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1305134282 ^ (long)1305134281) | var5_6 << (int)((long)-2075859270 ^ (long)-2075859265)) ^ var3_4[var7_8]) & (int)((long)1267642748 ^ (long)1267642755);
                    if (7J.\u200c\u2005) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-1295341622 ^ (long)-1295341623) | var6_7 << (int)((long)-1511081650 ^ (long)-1511081653)) ^ var3_4[var7_8]) & (int)((long)418536341 ^ (long)418536298);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            7J.b[var2_3] = new String(var3_4).intern();
        }
        return 7J.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public final List<3> 0(int n2) {
        LinkedList<3> linkedList;
        block3: {
            block2: {
                boolean bl2 = \u200c\u2005;
                if (bl2 || bl2) break block2;
                linkedList = new LinkedList<3>();
                if (bl2 || bl2) break block2;
                int[] nArray = new int[(int)((long)230074461 ^ (long)230074460)];
                nArray[(int)((long)-3206858 ^ (long)-3206858)] = this.0();
                int[] nArray2 = nArray;
                if (bl2 || bl2) break block2;
                7J j2 = this;
                j2.forEach(object -> {
                    int n3;
                    String string;
                    block6: {
                        int n4;
                        block9: {
                            block7: {
                                Matcher matcher;
                                block8: {
                                    block5: {
                                        boolean bl2 = \u200c\u2005;
                                        if (bl2 || bl2) break block5;
                                        string = (String)object.getKey();
                                        if (bl2 || bl2) break block5;
                                        if ((object = (String)object.getValue()) == null) break block6;
                                        if (bl2) break block5;
                                        if (((String)object).isEmpty()) break block6;
                                        if (bl2 || bl2) break block5;
                                        matcher = Pattern.compile(7J.a((int)((long)-1459112894 ^ (long)-1459119704), (int)((long)-1688086955 ^ (long)1688078622))).matcher(string);
                                        if (!matcher.find()) break block7;
                                        if (!bl2) break block8;
                                    }
                                    return;
                                }
                                n4 = this.0.0.a(matcher.group());
                                if (\u200c\u2005) {
                                    throw null;
                                }
                                break block9;
                            }
                            n4 = (int)((long)567311316 ^ (long)567311316);
                        }
                        n3 = n4;
                        3 var2_3 = new 3(n3 + nArray2[(int)((long)-1534688169 ^ (long)-1534688169)], n2, 5e.a, string.trim(), (String)object, (boolean)((long)487949950 ^ (long)487949950));
                        var2_3.0(this.0.0);
                        linkedList.add(var2_3);
                    }
                    n3 = this.0.0.a(string);
                    int n5 = (int)((long)808477241 ^ (long)808477241);
                    nArray[n5] = nArray2[n5] + n3;
                });
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return linkedList;
    }

    public 7J(3o o2, 7J j2) {
        boolean bl2 = \u200c\u2005;
        this(o2);
        this.addAll(j2);
    }
}

