/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.c.b;
import org.a.a.c.c;
import org.a.a.c.d;
import org.a.a.c.e;

public final class a {
    private static final Pattern a = Pattern.compile("[\\\\&]");
    private static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern c = Pattern.compile("[&<>\"]");
    private static final Pattern d = Pattern.compile("&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});|[&<>\"]", 2);
    private static final char[] e;
    private static final Pattern f;
    private static final e g;
    private static final e h;

    public static String a(String string, boolean bl2) {
        return org.a.a.c.a.a(bl2 ? d : c, string, g);
    }

    public static String a(String string) {
        if (a.matcher(string).find()) {
            return org.a.a.c.a.a(b, string, h);
        }
        return string;
    }

    public static String b(String string) {
        string = string.substring(1, string.length() - 1).trim().toLowerCase(Locale.ROOT);
        return f.matcher(string).replaceAll(" ");
    }

    private static String a(Pattern object, String string, e e2) {
        if (!((Matcher)(object = ((Pattern)object).matcher(string))).find()) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16);
        int n2 = 0;
        do {
            stringBuilder.append(string, n2, ((Matcher)object).start());
            e2.a(((Matcher)object).group(), stringBuilder);
            n2 = ((Matcher)object).end();
        } while (((Matcher)object).find());
        if (n2 != string.length()) {
            stringBuilder.append(string, n2, string.length());
        }
        return stringBuilder.toString();
    }

    static /* synthetic */ char[] a() {
        return e;
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        f = Pattern.compile("[ \t\r\n]+");
        g = new b();
        h = new c();
        new d();
    }
}

