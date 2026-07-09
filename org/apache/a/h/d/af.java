/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.StringTokenizer;
import org.apache.a.f.a;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.f.n;

public final class af
implements b {
    private static int[] a(String object) {
        object = new StringTokenizer((String)object, ",");
        int[] nArray = new int[((StringTokenizer)object).countTokens()];
        try {
            int n2 = 0;
            while (((StringTokenizer)object).hasMoreTokens()) {
                nArray[n2] = Integer.parseInt(((StringTokenizer)object).nextToken().trim());
                if (nArray[n2] < 0) {
                    throw new l("Invalid Port attribute.");
                }
                ++n2;
            }
        } catch (NumberFormatException numberFormatException) {
            throw new l("Invalid Port attribute: " + numberFormatException.getMessage());
        }
        return nArray;
    }

    private static boolean a(int n2, int[] nArray) {
        boolean bl2 = false;
        for (int n3 : nArray) {
            if (n2 != n3) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    @Override
    public final void a(m m2, String object) {
        ai.a(m2, "Cookie");
        if (m2 instanceof n) {
            m2 = (n)m2;
            if (object != null && !((String)object).trim().isEmpty()) {
                object = af.a((String)object);
                m2.a((int[])object);
            }
        }
    }

    @Override
    public final void a(c c2, f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        int n2 = f2.c();
        if (c2 instanceof a && ((a)c2).b("port") && !af.a(n2, c2.f())) {
            throw new i("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override
    public final boolean b(c c2, f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        int n2 = f2.c();
        if (c2 instanceof a && ((a)c2).b("port")) {
            if (c2.f() == null) {
                return false;
            }
            if (!af.a(n2, c2.f())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String a() {
        return "port";
    }
}

