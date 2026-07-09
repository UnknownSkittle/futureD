/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Date;
import java.util.regex.Pattern;
import org.apache.a.f.b;
import org.apache.a.f.m;
import org.apache.a.h.d.a;

public final class s
extends a
implements b {
    private static final Pattern a = Pattern.compile("^\\-?[0-9]+$");

    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (ai.b(string)) {
            return;
        }
        if (a.matcher(string).matches()) {
            int n2;
            try {
                n2 = Integer.parseInt(string);
            } catch (NumberFormatException numberFormatException) {
                return;
            }
            Date date = n2 >= 0 ? new Date(System.currentTimeMillis() + (long)n2 * 1000L) : new Date(Long.MIN_VALUE);
            m2.b(date);
        }
    }

    @Override
    public final String a() {
        return "max-age";
    }
}

