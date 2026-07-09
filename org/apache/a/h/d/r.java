/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.a.f.b;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.a;
import org.apache.a.j.v;

public final class r
extends a
implements b {
    private static TimeZone a;
    private static final BitSet b;
    private static final Map<String, Integer> c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;

    @Override
    public final void a(m m2, String string) {
        Object object;
        ai.a(m2, "Cookie");
        v v2 = new v(0, string.length());
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        try {
            while (!v2.c()) {
                r.a(string, v2);
                stringBuilder.setLength(0);
                r.a(string, v2, stringBuilder);
                if (stringBuilder.length() != 0) {
                    if (!bl2 && ((Matcher)(object = d.matcher(stringBuilder))).matches()) {
                        bl2 = true;
                        n4 = Integer.parseInt(((Matcher)object).group(1));
                        n3 = Integer.parseInt(((Matcher)object).group(2));
                        n2 = Integer.parseInt(((Matcher)object).group(3));
                        continue;
                    }
                    if (!bl3 && ((Matcher)(object = e.matcher(stringBuilder))).matches()) {
                        bl3 = true;
                        n5 = Integer.parseInt(((Matcher)object).group(1));
                        continue;
                    }
                    if (!bl4 && ((Matcher)(object = f.matcher(stringBuilder))).matches()) {
                        bl4 = true;
                        n6 = c.get(((Matcher)object).group(1).toLowerCase(Locale.ROOT));
                        continue;
                    }
                    if (bl5 || !((Matcher)(object = g.matcher(stringBuilder))).matches()) continue;
                    bl5 = true;
                    n7 = Integer.parseInt(((Matcher)object).group(1));
                    continue;
                }
                break;
            }
        } catch (NumberFormatException numberFormatException) {
            throw new l("Invalid 'expires' attribute: ".concat(String.valueOf(string)));
        }
        if (!(bl2 && bl3 && bl4 && bl5)) {
            throw new l("Invalid 'expires' attribute: ".concat(String.valueOf(string)));
        }
        if (n7 >= 70 && n7 <= 99) {
            n7 += 1900;
        }
        if (n7 >= 0 && n7 <= 69) {
            n7 += 2000;
        }
        if (n5 <= 0 || n5 > 31 || n7 < 1601 || n4 > 23 || n3 > 59 || n2 > 59) {
            throw new l("Invalid 'expires' attribute: ".concat(String.valueOf(string)));
        }
        object = Calendar.getInstance();
        ((Calendar)object).setTimeZone(a);
        ((Calendar)object).setTimeInMillis(0L);
        ((Calendar)object).set(13, n2);
        ((Calendar)object).set(12, n3);
        ((Calendar)object).set(11, n4);
        ((Calendar)object).set(5, n5);
        ((Calendar)object).set(2, n6);
        ((Calendar)object).set(1, n7);
        m2.b(((Calendar)object).getTime());
    }

    private static void a(CharSequence charSequence, v v2) {
        char c2;
        int n2 = v2.b();
        int n3 = v2.a();
        for (int i2 = v2.b(); i2 < n3 && b.get(c2 = charSequence.charAt(i2)); ++i2) {
            ++n2;
        }
        v2.a(n2);
    }

    private static void a(CharSequence charSequence, v v2, StringBuilder stringBuilder) {
        char c2;
        int n2 = v2.b();
        int n3 = v2.a();
        for (int i2 = v2.b(); i2 < n3 && !b.get(c2 = charSequence.charAt(i2)); ++i2) {
            ++n2;
            stringBuilder.append(c2);
        }
        v2.a(n2);
    }

    @Override
    public final String a() {
        return "expires";
    }

    static {
        int n2;
        a = TimeZone.getTimeZone("UTC");
        Serializable serializable = new BitSet();
        ((BitSet)serializable).set(9);
        for (n2 = 32; n2 <= 47; ++n2) {
            ((BitSet)serializable).set(n2);
        }
        for (n2 = 59; n2 <= 64; ++n2) {
            ((BitSet)serializable).set(n2);
        }
        for (n2 = 91; n2 <= 96; ++n2) {
            ((BitSet)serializable).set(n2);
        }
        for (n2 = 123; n2 <= 126; ++n2) {
            ((BitSet)serializable).set(n2);
        }
        b = serializable;
        serializable = new ConcurrentHashMap<String, Integer>(12);
        ((ConcurrentHashMap)serializable).put("jan", 0);
        ((ConcurrentHashMap)serializable).put("feb", 1);
        ((ConcurrentHashMap)serializable).put("mar", 2);
        ((ConcurrentHashMap)serializable).put("apr", 3);
        ((ConcurrentHashMap)serializable).put("may", 4);
        ((ConcurrentHashMap)serializable).put("jun", 5);
        ((ConcurrentHashMap)serializable).put("jul", 6);
        ((ConcurrentHashMap)serializable).put("aug", 7);
        ((ConcurrentHashMap)serializable).put("sep", 8);
        ((ConcurrentHashMap)serializable).put("oct", 9);
        ((ConcurrentHashMap)serializable).put("nov", 10);
        ((ConcurrentHashMap)serializable).put("dec", 11);
        c = serializable;
        d = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
        e = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
        f = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
        g = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");
    }
}

