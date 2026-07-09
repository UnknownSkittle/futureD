/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class bu
extends Enum<bu> {
    public static final /* enum */ bu a = new bu("pos1", "p1", "1");
    public static final /* enum */ bu b = new bu("pos2", "p2", "2");
    public static final /* enum */ bu c = new bu("clear", "c");
    public static final /* enum */ bu d = new bu("undo", "u");
    public static final /* enum */ bu e = new bu("set", "fill", "s", "f");
    public static final /* enum */ bu f = new bu("walls", "w");
    public static final /* enum */ bu g = new bu("shell", "shl");
    public static final /* enum */ bu h = new bu("cleararea", "ca");
    public static final /* enum */ bu i = new bu("replace", "r");
    public static final /* enum */ bu j = new bu("expand", "ex");
    public static final /* enum */ bu k = new bu("contract", "ct");
    public static final /* enum */ bu l = new bu("shift", "sh");
    private final String[] a;
    private static final /* synthetic */ bu[] a;

    public static bu[] values() {
        return (bu[])a.clone();
    }

    public static bu valueOf(String string) {
        return Enum.valueOf(bu.class, string);
    }

    private bu(String ... stringArray) {
        this.a = stringArray;
    }

    public static bu a(String string) {
        for (bu bu2 : bu.values()) {
            String[] stringArray = bu2.a;
            int n2 = bu2.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!stringArray[i2].equalsIgnoreCase(string)) continue;
                return bu2;
            }
        }
        return null;
    }

    public static String[] a() {
        HashSet<String> hashSet = new HashSet<String>();
        for (bu bu2 : bu.values()) {
            hashSet.addAll(Arrays.asList(bu2.a));
        }
        return hashSet.toArray(new String[0]);
    }

    static {
        a = new bu[]{a, b, c, d, e, f, g, h, i, j, k, l};
    }
}

