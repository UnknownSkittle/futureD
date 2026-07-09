/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.d;

import java.util.regex.Pattern;

public final class b {
    private static final Pattern a = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern b;
    private static final Pattern c;

    public static boolean a(String string) {
        return a.matcher(string).matches();
    }

    public static boolean b(String string) {
        block4: {
            block3: {
                String string2 = string;
                if (b.matcher(string2).matches()) break block3;
                string2 = string;
                int n2 = 0;
                for (int i2 = 0; i2 < string2.length(); ++i2) {
                    if (string2.charAt(i2) != ':') continue;
                    ++n2;
                }
                if (!(n2 <= 7 && c.matcher(string2).matches())) break block4;
            }
            return true;
        }
        return false;
    }

    static {
        Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        b = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        c = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    }
}

