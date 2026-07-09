/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.impactclient.0rB$1f;
import net.impactclient.2w;
import net.impactclient.68;
import net.impactclient.6f;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2f
extends Enum<2f> {
    public static final boolean \u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
    private static final Pattern 0;
    public static final int a;

    /*
     * Enabled aggressive block sorting
     */
    public static Optional<68> 0(String object) {
        ArrayList<String> arrayList;
        block10: {
            boolean bl2 = \u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
            if (!bl2) {
                object = 0.matcher((CharSequence)object);
                String[] stringArray = 7b.0();
                if (!bl2 && !bl2) {
                    arrayList = new ArrayList<String>();
                    if (!bl2) {
                        block0: while (!bl2) {
                            if (((Matcher)object).find()) {
                                if (bl2 || bl2) break;
                                arrayList.add(((Matcher)object).group());
                                if (bl2) break;
                                if (stringArray != null) {
                                    if (bl2) break;
                                    if (stringArray != null) continue;
                                    if (bl2) break;
                                }
                            } else {
                                if (bl2) break;
                                if (arrayList.size() == 0) {
                                    if (bl2 || bl2) break;
                                    return Optional.empty();
                                }
                            }
                            if (bl2) break;
                            object = new String[arrayList.size() - (int)((long)-367939904 ^ (long)-367939903)];
                            if (bl2 || bl2) break;
                            int n2 = (int)((long)-804696271 ^ (long)-804696272);
                            if (bl2) return null;
                            while (!bl2) {
                                if (n2 < arrayList.size()) {
                                    if (bl2 || bl2) break block0;
                                    object[n2 - (int)((long)-549850560 ^ (long)-549850559)] = ((String)arrayList.get(n2)).replace(0rB$1f.XNZw("\u6039", -1030469), 0rB$1f.XNZw("", 1536761043)).replace(0rB$1f.XNZw("\u3972", -1417732107), 0rB$1f.XNZw("", -1202851137));
                                    if (bl2 || bl2) break block0;
                                    ++n2;
                                    if (bl2) break block0;
                                    if (stringArray != null) continue;
                                    if (bl2) break block0;
                                }
                                if (!bl2) break block10;
                            }
                            break block0;
                        }
                    }
                }
            }
            return null;
        }
        return Optional.of(new 68((String)arrayList.get((int)((long)387063228 ^ (long)387063228)), (String[])object));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean 0(String string, 2w w2) {
        boolean bl2 = \u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
        if (bl2 || bl2) return true;
        if (string == null) {
            if (bl2) return true;
            if (w2.1.length == 0) {
                if (bl2) return true;
                return (int)((long)1065934817 ^ (long)1065934816) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)-1358643563 ^ (long)-1358643563) != 0;
            }
        }
        if (!bl2) return 68.0(w2.1, string);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean 0(boolean bl2, String[] stringArray, 2w w2) {
        boolean bl3;
        block7: {
            block8: {
                bl3 = \u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
                if (bl3 || bl3) return true;
                if (w2.1.length != 0) break block7;
                if (bl3) return true;
                if (!bl2) break block8;
                if (bl3) return true;
                if (stringArray.length != w2.4.size()) break block7;
                if (bl3) return true;
            }
            if (bl3) return true;
            return (int)((long)-1720491272 ^ (long)-1720491271) != 0;
        }
        if (!bl3) return (int)((long)-1339174618 ^ (long)-1339174618) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<2w> 0(6f f2, String[] stringArray) {
        Object object;
        block9: {
            Object object2;
            block7: {
                block8: {
                    block6: {
                        boolean bl2 = \u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
                        if (bl2 || bl2) break block6;
                        if (stringArray.length != 0) break block7;
                        if (!bl2) break block8;
                    }
                    return null;
                }
                object2 = null;
                if (\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) {
                    throw null;
                }
                break block9;
            }
            object2 = object = stringArray[(int)((long)-1922821075 ^ (long)-1922821075)];
        }
        if ((object = (2w)f2.3.stream().filter(arg_0 -> 2f.0((String)object, arg_0)).findFirst().orElse(null)) != null) {
            return Collections.singletonList(object);
        }
        return f2.3.stream().filter(arg_0 -> 2f.0((boolean)((long)1183763790 ^ (long)1183763791), stringArray, arg_0)).collect(Collectors.toList());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-690161973 ^ (long)690161972);
                if (2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u1759\u3f45\ufce6\u016b\u1729\u3f6b\ufca2\u0121\u1746\u3f0d\ufca4\u0150\u1764\u3f1b\ufc99\u014a\u1753\u3f66\ufce9\u0130\u1764\u3f29\ufcff\u0157\u1735\u3f5f\ufcd1\u0116", 1587753428).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)1739444809 ^ (long)1739444809);
                v4 = (int)((long)920181476 ^ (long)920181467);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)81845986 ^ (long)81845987)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)1530341219 ^ (long)1530341220)) {
                                case 0: {
                                    v11 = (int)((long)-417678922 ^ (long)-417678970);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)490392043 ^ (long)490392004);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-144830600 ^ (long)-144830645);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)1562615392 ^ (long)1562615405);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)973618052 ^ (long)973618116);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)2083276692 ^ (long)2083276768);
                                    if (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-747793738 ^ (long)-747793743);
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
                        } while (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!2f.\u2007\u200e\u2003\u200d\u2006\u200d\u2007\u2000\u200b)
lbl76:
                // 1 sources

                throw null;
            }
            2f.a = (int)((long)283682621 ^ (long)283682620);
            (new int[(int)((long)-383604472 ^ (long)-383604471)])[(int)((long)-2030016543 ^ (long)-2030016543)] = (int)((long)1285357390 ^ (long)1285357391);
            2f.0 = Pattern.compile(var0_1);
        }
    }
}

