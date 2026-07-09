/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.n.b;
import org.apache.a.y;

public final class f {
    public static final f a;

    public static b a(b b2, y[] yArray) {
        int n2;
        int n3;
        ai.a(yArray, "Header parameter array");
        y[] yArray2 = yArray;
        if (yArray == null || yArray2.length <= 0) {
            n3 = 0;
        } else {
            n2 = yArray2.length - 1 << 1;
            for (y y2 : yArray2) {
                n2 += f.a(y2);
            }
            n3 = n2;
        }
        n2 = n3;
        b2.a(n2);
        for (n2 = 0; n2 < yArray.length; ++n2) {
            if (n2 > 0) {
                b2.a("; ");
            }
            f.a(b2, yArray[n2], false);
        }
        return b2;
    }

    public static b a(b b2, y object, boolean bl2) {
        ai.a(object, "Name / value pair");
        int n2 = f.a((y)object);
        if (b2 == null) {
            b2 = new b(n2);
        } else {
            b2.a(n2);
        }
        b2.a(object.a());
        object = object.b();
        if (object != null) {
            b2.a('=');
            f.a(b2, (String)object, bl2);
        }
        return b2;
    }

    private static int a(y object) {
        if (object == null) {
            return 0;
        }
        int n2 = object.a().length();
        if ((object = object.b()) != null) {
            n2 += 3 + ((String)object).length();
        }
        return n2;
    }

    private static void a(b b2, String string, boolean bl2) {
        int n2;
        if (!bl2) {
            for (n2 = 0; n2 < string.length() && !bl2; ++n2) {
                bl2 = f.a(string.charAt(n2));
            }
        }
        if (bl2) {
            b2.a('\"');
        }
        for (n2 = 0; n2 < string.length(); ++n2) {
            char c2 = string.charAt(n2);
            if (f.b(c2)) {
                b2.a('\\');
            }
            b2.a(c2);
        }
        if (bl2) {
            b2.a('\"');
        }
    }

    private static boolean a(char c2) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c2) >= 0;
    }

    private static boolean b(char c2) {
        return "\"\\".indexOf(c2) >= 0;
    }

    static {
        new f();
        a = new f();
    }
}

