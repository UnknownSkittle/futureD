/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class cc
extends Enum<cc> {
    public static final /* enum */ cc a = new cc("list", "get", "l");
    public static final /* enum */ cc b = new cc("clear", "c");
    public static final /* enum */ cc c = new cc("save", "s");
    public static final /* enum */ cc d = new cc("info", "show", "i");
    public static final /* enum */ cc e = new cc("delete", "d");
    public static final /* enum */ cc f = new cc("goal", "goto", "g");
    private final String[] a;
    private static final /* synthetic */ cc[] a;

    public static cc[] values() {
        return (cc[])a.clone();
    }

    public static cc valueOf(String string) {
        return Enum.valueOf(cc.class, string);
    }

    private cc(String ... stringArray) {
        this.a = stringArray;
    }

    public static cc a(String string) {
        for (cc cc2 : cc.values()) {
            String[] stringArray = cc2.a;
            int n2 = cc2.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!stringArray[i2].equalsIgnoreCase(string)) continue;
                return cc2;
            }
        }
        return null;
    }

    public static String[] a() {
        HashSet<String> hashSet = new HashSet<String>();
        for (cc cc2 : cc.values()) {
            hashSet.addAll(Arrays.asList(cc2.a));
        }
        return hashSet.toArray(new String[0]);
    }

    static /* synthetic */ String[] a(cc cc2) {
        return cc2.a;
    }

    static {
        a = new cc[]{a, b, c, d, e, f};
    }
}

