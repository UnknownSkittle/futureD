/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import org.apache.a.ac;
import org.apache.a.ae;
import org.apache.a.af;
import org.apache.a.d;
import org.apache.a.e;
import org.apache.a.j.t;
import org.apache.a.n.b;

public final class j
implements t {
    public static final j a;

    private static b a(b b2) {
        if (b2 != null) {
            b2.a();
        } else {
            b2 = new b(64);
        }
        return b2;
    }

    private static b a(b b2, ac ac2) {
        ai.a(ac2, "Protocol version");
        int n2 = j.a(ac2);
        if (b2 == null) {
            b2 = new b(n2);
        } else {
            b2.a(n2);
        }
        b2.a(ac2.a());
        b2.a('/');
        b2.a(Integer.toString(ac2.b()));
        b2.a('.');
        b2.a(Integer.toString(ac2.c()));
        return b2;
    }

    private static int a(ac ac2) {
        return ac2.a().length() + 4;
    }

    @Override
    public final b a(b b2, ae object) {
        ai.a(object, "Request line");
        b2 = j.a(b2);
        ae ae2 = object;
        object = b2;
        String string = ae2.a();
        String string2 = ae2.c();
        int n2 = string.length() + 1 + string2.length() + 1 + j.a(ae2.b());
        ((b)object).a(n2);
        ((b)object).a(string);
        ((b)object).a(' ');
        ((b)object).a(string2);
        ((b)object).a(' ');
        j.a((b)object, ae2.b());
        return b2;
    }

    public static b a(af object) {
        ai.a(object, "Status line");
        b b2 = j.a(null);
        af af2 = object;
        object = b2;
        int n2 = j.a(af2.a()) + 1 + 3 + 1;
        String string = af2.c();
        if (string != null) {
            n2 += string.length();
        }
        ((b)object).a(n2);
        j.a((b)object, af2.a());
        ((b)object).a(' ');
        ((b)object).a(Integer.toString(af2.b()));
        ((b)object).a(' ');
        if (string != null) {
            ((b)object).a(string);
        }
        return b2;
    }

    @Override
    public final b a(b b2, e object) {
        ai.a(object, "Header");
        if (object instanceof d) {
            b2 = ((d)object).a();
        } else {
            b2 = j.a(b2);
            Object object2 = object;
            object = b2;
            String string = object2.c();
            object2 = object2.d();
            int n2 = string.length() + 2;
            if (object2 != null) {
                n2 += ((String)object2).length();
            }
            ((b)object).a(n2);
            ((b)object).a(string);
            ((b)object).a(": ");
            if (object2 != null) {
                ((b)object).a((String)object2);
            }
        }
        return b2;
    }

    static {
        new j();
        a = new j();
    }
}

