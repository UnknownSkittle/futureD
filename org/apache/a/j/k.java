/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.af;
import org.apache.a.e;
import org.apache.a.j.o;
import org.apache.a.j.q;
import org.apache.a.j.u;
import org.apache.a.m.c;
import org.apache.a.n.b;
import org.apache.a.v;

public final class k
implements u {
    public static final k a;
    private ac b = v.b;

    private k() {
    }

    private k(byte by2) {
        this();
    }

    private ac c(b b2, org.apache.a.j.v v2) {
        int n2;
        int n3;
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        String string = this.b.a();
        int n4 = string.length();
        int n5 = v2.b();
        int n6 = v2.a();
        k.d(b2, v2);
        int n7 = v2.b();
        if (n7 + n4 + 4 > n6) {
            throw new aa("Not a valid protocol version: " + b2.a(n5, n6));
        }
        boolean bl2 = true;
        for (n3 = 0; bl2 && n3 < n4; ++n3) {
            bl2 = b2.charAt(n7 + n3) == string.charAt(n3);
        }
        if (bl2) {
            boolean bl3 = bl2 = b2.charAt(n7 + n4) == '/';
        }
        if (!bl2) {
            throw new aa("Not a valid protocol version: " + b2.a(n5, n6));
        }
        n3 = b2.a(46, n7 += n4 + 1, n6);
        if (n3 == -1) {
            throw new aa("Invalid protocol version number: " + b2.a(n5, n6));
        }
        try {
            n2 = Integer.parseInt(b2.b(n7, n3));
        } catch (NumberFormatException numberFormatException) {
            throw new aa("Invalid protocol major version number: " + b2.a(n5, n6));
        }
        n7 = n3 + 1;
        n4 = b2.a(32, n7, n6);
        if (n4 == -1) {
            n4 = n6;
        }
        try {
            n7 = Integer.parseInt(b2.b(n7, n4));
        } catch (NumberFormatException numberFormatException) {
            throw new aa("Invalid protocol minor version number: " + b2.a(n5, n6));
        }
        v2.a(n4);
        int n8 = n2;
        n2 = n7;
        int n9 = n8;
        return this.b.a(n9, n2);
    }

    @Override
    public final boolean a(b b2, org.apache.a.j.v v2) {
        int n2;
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        String string = this.b.a();
        int n3 = string.length();
        if (b2.length() < n3 + 4) {
            return false;
        }
        if (n2 < 0) {
            n2 = b2.length() - 4 - n3;
        } else if (n2 == 0) {
            for (n2 = v2.b(); n2 < b2.length() && c.a(b2.charAt(n2)); ++n2) {
            }
        }
        if (n2 + n3 + 4 > b2.length()) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = 0; bl2 && i2 < n3; ++i2) {
            bl2 = b2.charAt(n2 + i2) == string.charAt(i2);
        }
        if (bl2) {
            bl2 = b2.charAt(n2 + n3) == '/';
        }
        return bl2;
    }

    @Override
    public final af b(b b2, org.apache.a.j.v v2) {
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        int n2 = v2.b();
        int n3 = v2.a();
        try {
            int n4;
            ac ac2 = this.c(b2, v2);
            k.d(b2, v2);
            int n5 = v2.b();
            int n6 = b2.a(32, n5, n3);
            if (n6 < 0) {
                n6 = n3;
            }
            String string = b2.b(n5, n6);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (Character.isDigit(string.charAt(i2))) continue;
                throw new aa("Status line contains invalid status code: " + b2.a(n2, n3));
            }
            try {
                n4 = Integer.parseInt(string);
            } catch (NumberFormatException numberFormatException) {
                throw new aa("Status line contains invalid status code: " + b2.a(n2, n3));
            }
            int n7 = n6;
            String string2 = n7 < n3 ? b2.b(n7, n3) : "";
            String string3 = string2;
            int n8 = n4;
            ac ac3 = ac2;
            return new o(ac3, n8, string3);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new aa("Invalid status line: " + b2.a(n2, n3));
        }
    }

    @Override
    public final e a(b b2) {
        return new q(b2);
    }

    private static void d(b b2, org.apache.a.j.v v2) {
        int n2;
        int n3 = v2.a();
        for (n2 = v2.b(); n2 < n3 && c.a(b2.charAt(n2)); ++n2) {
        }
        v2.a(n2);
    }

    static {
        new k(0);
        a = new k(0);
    }
}

