/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.BitSet;
import org.apache.a.f;
import org.apache.a.j.c;
import org.apache.a.j.m;
import org.apache.a.j.s;
import org.apache.a.j.v;
import org.apache.a.j.w;
import org.apache.a.n.b;
import org.apache.a.y;

public final class g
implements s {
    public static final g a;
    private static final BitSet b;
    private static final BitSet c;
    private final w d = w.a;

    public static f[] a(String object) {
        ai.a(object, "Value");
        b b2 = new b(((String)object).length());
        b2.a((String)object);
        object = new v(0, ((String)object).length());
        return a.a(b2, (v)object);
    }

    @Override
    public final f[] a(b b2, v v2) {
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        ArrayList<f> arrayList = new ArrayList<f>();
        while (!v2.c()) {
            f f2 = this.b(b2, v2);
            if (f2.a().length() == 0 && f2.b() == null) continue;
            arrayList.add(f2);
        }
        ArrayList<f> arrayList2 = arrayList;
        return arrayList2.toArray(new f[arrayList2.size()]);
    }

    @Override
    public final f b(b b2, v v2) {
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        y y2 = g.d(b2, v2);
        y[] yArray = null;
        if (!v2.c() && b2.charAt(v2.b() - 1) != ',') {
            yArray = g.c(b2, v2);
        }
        return g.a(y2.a(), y2.b(), yArray);
    }

    private static f a(String string, String string2, y[] yArray) {
        return new c(string, string2, yArray);
    }

    private static y[] c(b b2, v v2) {
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        w.a(b2, v2);
        ArrayList<y> arrayList = new ArrayList<y>();
        while (!v2.c()) {
            y y2 = g.d(b2, v2);
            arrayList.add(y2);
            if (b2.charAt(v2.b() - 1) != ',') continue;
        }
        ArrayList<y> arrayList2 = arrayList;
        return arrayList2.toArray(new y[arrayList2.size()]);
    }

    private static y d(b charSequence, v v2) {
        ai.a(charSequence, "Char array buffer");
        ai.a(v2, "Parser cursor");
        String string = w.a(charSequence, v2, b);
        if (v2.c()) {
            return new m(string, null);
        }
        char c2 = charSequence.charAt(v2.b());
        v v3 = v2;
        v3.a(v3.b() + 1);
        if (c2 != '=') {
            return g.a(string, null);
        }
        charSequence = w.b(charSequence, v2, c);
        if (!v2.c()) {
            v v4 = v2;
            v4.a(v4.b() + 1);
        }
        return g.a(string, (String)charSequence);
    }

    private static y a(String string, String string2) {
        return new m(string, string2);
    }

    static {
        new g();
        a = new g();
        b = w.a(61, 59, 44);
        c = w.a(59, 44);
    }
}

