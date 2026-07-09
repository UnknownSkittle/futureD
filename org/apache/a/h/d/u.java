/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.BitSet;
import org.apache.a.f;
import org.apache.a.j.c;
import org.apache.a.j.m;
import org.apache.a.j.v;
import org.apache.a.j.w;
import org.apache.a.n.b;
import org.apache.a.y;

public final class u {
    public static final u a = new u();
    private static final BitSet b = w.a(61, 59);
    private static final BitSet c = w.a(59);
    private final w d = w.a;

    public static f a(b b2, v v2) {
        ai.a(b2, "Char array buffer");
        ai.a(v2, "Parser cursor");
        y y2 = u.b(b2, v2);
        ArrayList<y> arrayList = new ArrayList<y>();
        while (!v2.c()) {
            y y3 = u.b(b2, v2);
            arrayList.add(y3);
        }
        ArrayList<y> arrayList2 = arrayList;
        return new c(y2.a(), y2.b(), arrayList2.toArray(new y[arrayList2.size()]));
    }

    private static y b(b charSequence, v v2) {
        String string = w.a(charSequence, v2, b);
        if (v2.c()) {
            return new m(string, null);
        }
        char c2 = charSequence.charAt(v2.b());
        v v3 = v2;
        v3.a(v3.b() + 1);
        if (c2 != '=') {
            return new m(string, null);
        }
        charSequence = w.a(charSequence, v2, c);
        if (!v2.c()) {
            v v4 = v2;
            v4.a(v4.b() + 1);
        }
        return new m(string, (String)charSequence);
    }
}

