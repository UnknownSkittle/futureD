/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.impactclient.0rB$1f;
import net.impactclient.6f;
import net.impactclient.7Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3n {
    public static final boolean \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
    private static final Map<6f, List<String>> 0;

    public static List<String> 1(6f f3) {
        boolean bl2 = \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return 0.computeIfAbsent(f3, f2 -> {
            ArrayList arrayList;
            block3: {
                block2: {
                    boolean bl2 = \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
                    if (bl2 || bl2) break block2;
                    arrayList = new ArrayList();
                    if (bl2 || bl2) break block2;
                    f2.3.forEach(w2 -> {
                        String string;
                        Object object;
                        block8: {
                            block7: {
                                boolean bl2 = \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
                                if (bl2 || bl2) break block7;
                                object = w2.1;
                                if (!bl2 && !bl2) break block8;
                            }
                            return;
                        }
                        if (((String[])object).length > 0) {
                            string = object[(int)((long)-1090710652 ^ (long)-1090710652)];
                            if (\u2008\u2003\u2000\u2003\u200b\u200d\u200b) {
                                throw null;
                            }
                        } else {
                            string = 0rB$1f.XNZw("", -1972874045);
                        }
                        object = new StringBuilder(string);
                        w2.4.forEach(arg_0 -> 3n.0((StringBuilder)object, arg_0));
                        arrayList.add(((StringBuilder)object).toString());
                    });
                    if (!bl2 && !bl2) break block3;
                }
                return null;
            }
            return arrayList;
        });
    }

    static {
        boolean bl2 = \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
        if (bl2 || bl2) {
        } else {
            0 = new HashMap<6f, List<String>>();
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0(StringBuilder stringBuilder, 7Q q2) {
        String string;
        String string2;
        String string3;
        block14: {
            String string4;
            block12: {
                block13: {
                    block11: {
                        boolean bl2 = \u2008\u2003\u2000\u2003\u200b\u200d\u200b;
                        if (bl2 || bl2) break block11;
                        if (!q2.1()) break block12;
                        if (!bl2) break block13;
                    }
                    return;
                }
                string4 = 0rB$1f.XNZw("\ud066", -1193740550);
                if (\u2008\u2003\u2000\u2003\u200b\u200d\u200b) {
                    throw null;
                }
                break block14;
            }
            string4 = string3 = 0rB$1f.XNZw("\u0cae", 72952405);
        }
        if (q2.1()) {
            string2 = 0rB$1f.XNZw("\ube3c", -2075354970);
            if (\u2008\u2003\u2000\u2003\u200b\u200d\u200b) {
                throw null;
            }
        } else {
            string2 = 0rB$1f.XNZw("\u2fb4", 79759693);
        }
        String string5 = string2;
        StringBuilder stringBuilder2 = stringBuilder;
        if (stringBuilder2.length() > 0) {
            string = 0rB$1f.XNZw("\ua4a3", -834174396);
            if (\u2008\u2003\u2000\u2003\u200b\u200d\u200b) {
                throw null;
            }
        } else {
            string = 0rB$1f.XNZw("", 1502122848);
        }
        stringBuilder2.append(string).append(string3).append(q2.2()).append(string5);
    }
}

