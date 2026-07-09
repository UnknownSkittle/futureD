/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.f;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.compress.archivers.f.c;
import org.apache.commons.compress.archivers.g.as;

public final class a
implements org.apache.commons.compress.archivers.a {
    private String a = "";
    private final boolean b;
    private int c;
    private long d = 0L;
    private long e = 0L;
    private long f = 0L;
    private long g;
    private boolean h;
    private byte i;
    private String j = "";
    private String k = "ustar\u0000";
    private String l = "00";
    private String m;
    private String n = "";
    private int o = 0;
    private int p = 0;
    private boolean q;
    private long r;
    private boolean s;
    private boolean t;
    private final File u;
    private final Map<String, String> v = new HashMap<String, String>();

    private a() {
        String string = System.getProperty("user.name", "");
        if (string.length() > 31) {
            string = string.substring(0, 31);
        }
        this.m = string;
        this.u = null;
        this.b = false;
    }

    public a(byte[] object, as object2) {
        this();
        Object object3;
        as as2 = object2;
        object2 = object;
        object = this;
        this.a = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 0, 100, as2);
        ((a)object).c = (int)org.apache.commons.compress.archivers.f.c.b((byte[])object2, 100, 8);
        ((a)object).d = (int)org.apache.commons.compress.archivers.f.c.b((byte[])object2, 108, 8);
        ((a)object).e = (int)org.apache.commons.compress.archivers.f.c.b((byte[])object2, 116, 8);
        ((a)object).f = org.apache.commons.compress.archivers.f.c.b((byte[])object2, 124, 12);
        ((a)object).g = org.apache.commons.compress.archivers.f.c.b((byte[])object2, 136, 12);
        ((a)object).h = org.apache.commons.compress.archivers.f.c.a((byte[])object2);
        ((a)object).i = (byte)object2[156];
        ((a)object).j = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 157, 100, as2);
        ((a)object).k = org.apache.commons.compress.archivers.f.c.c((byte[])object2, 257, 6);
        ((a)object).l = org.apache.commons.compress.archivers.f.c.c((byte[])object2, 263, 2);
        ((a)object).m = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 265, 32, as2);
        ((a)object).n = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 297, 32, as2);
        if (((a)object).i == 51 || ((a)object).i == 52) {
            ((a)object).o = (int)org.apache.commons.compress.archivers.f.c.b((byte[])object2, 329, 8);
            ((a)object).p = (int)org.apache.commons.compress.archivers.f.c.b((byte[])object2, 337, 8);
        }
        switch (org.apache.commons.compress.b.a.a("ustar ", (byte[])(object3 = object2), 257, 6) ? 2 : (org.apache.commons.compress.b.a.a("ustar\u0000", (byte[])object3, 257, 6) ? (org.apache.commons.compress.b.a.a("tar\u0000", (byte[])object3, 508, 4) ? 4 : 3) : 0)) {
            case 2: {
                ((a)object).q = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 482);
                ((a)object).r = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 483, 12);
                return;
            }
            case 4: {
                object2 = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 345, 131, as2);
                if (((String)object2).length() <= 0) break;
                ((a)object).a = (String)object2 + "/" + ((a)object).a;
                return;
            }
            default: {
                object2 = org.apache.commons.compress.archivers.f.c.a((byte[])object2, 345, 155, as2);
                if (((a)object).i() && !((a)object).a.endsWith("/")) {
                    ((a)object).a = ((a)object).a + "/";
                }
                if (((String)object2).length() <= 0) break;
                ((a)object).a = (String)object2 + "/" + ((a)object).a;
            }
        }
    }

    public final boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        a a2 = (a)object;
        object = this;
        return a2 != null && ((a)object).getName().equals(a2.getName());
    }

    public final int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public final String getName() {
        return this.a;
    }

    public final void a(String string) {
        String string2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (string2 != null) {
            int n2;
            if (string2.startsWith("windows")) {
                if (string.length() > 2) {
                    char c2 = string.charAt(0);
                    if (string.charAt(1) == ':' && (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z')) {
                        string = string.substring(2);
                    }
                }
            } else if (string2.contains("netware") && (n2 = string.indexOf(58)) != -1) {
                string = string.substring(n2 + 1);
            }
        }
        string = string.replace(File.separatorChar, '/');
        while (string.startsWith("/")) {
            string = string.substring(1);
        }
        this.a = string;
    }

    public final void b(String string) {
        this.j = string;
    }

    public final boolean a() {
        return this.h;
    }

    public final long b() {
        return this.f;
    }

    public final boolean c() {
        return this.q;
    }

    public final boolean d() {
        return this.i == 83;
    }

    public final boolean e() {
        return this.i == 75;
    }

    public final boolean f() {
        return this.i == 76;
    }

    public final boolean g() {
        return this.i == 120 || this.i == 88;
    }

    public final boolean h() {
        return this.i == 103;
    }

    public final boolean i() {
        if (this.i == 53) {
            return true;
        }
        return !this.g() && !this.h() && this.getName().endsWith("/");
    }

    public final boolean j() {
        a a2 = this;
        return a2.d() || a2.s || this.t;
    }

    final void a(Map<String, String> map) {
        block30: for (Map.Entry<String, String> entry : map.entrySet()) {
            String string = entry.getKey();
            String string2 = entry.getValue();
            Map<String, String> map2 = map;
            String string3 = string2;
            a a2 = this;
            switch (string) {
                case "path": {
                    a2.a(string3);
                    continue block30;
                }
                case "linkpath": {
                    a2.j = string3;
                    continue block30;
                }
                case "gid": {
                    a2.e = Long.parseLong(string3);
                    continue block30;
                }
                case "gname": {
                    a2.n = string3;
                    continue block30;
                }
                case "uid": {
                    a2.d = Long.parseLong(string3);
                    continue block30;
                }
                case "uname": {
                    a2.m = string3;
                    continue block30;
                }
                case "size": {
                    long l2 = Long.parseLong(string3);
                    a a3 = a2;
                    if (l2 < 0L) {
                        throw new IllegalArgumentException("Size is out of range: ".concat(String.valueOf(l2)));
                    }
                    a3.f = l2;
                    continue block30;
                }
                case "mtime": {
                    a2.g = (long)(Double.parseDouble(string3) * 1000.0) / 1000L;
                    continue block30;
                }
                case "SCHILY.devminor": {
                    int n2 = Integer.parseInt(string3);
                    a a4 = a2;
                    if (n2 < 0) {
                        throw new IllegalArgumentException("Minor device number is out of range: ".concat(String.valueOf(n2)));
                    }
                    a4.p = n2;
                    continue block30;
                }
                case "SCHILY.devmajor": {
                    int n3 = Integer.parseInt(string3);
                    a a5 = a2;
                    if (n3 < 0) {
                        throw new IllegalArgumentException("Major device number is out of range: ".concat(String.valueOf(n3)));
                    }
                    a5.o = n3;
                    continue block30;
                }
                case "GNU.sparse.size": {
                    Map<String, String> map3 = map2;
                    a a6 = a2;
                    a2.s = true;
                    a6.r = Integer.parseInt(map3.get("GNU.sparse.size"));
                    if (!map3.containsKey("GNU.sparse.name")) continue block30;
                    a6.a = map3.get("GNU.sparse.name");
                    continue block30;
                }
                case "GNU.sparse.realsize": {
                    Map<String, String> map4 = map2;
                    a a7 = a2;
                    a2.s = true;
                    a7.r = Integer.parseInt(map4.get("GNU.sparse.realsize"));
                    a7.a = map4.get("GNU.sparse.name");
                    continue block30;
                }
                case "SCHILY.filetype": {
                    if (!"sparse".equals(string3)) continue block30;
                    Map<String, String> map5 = map2;
                    a a8 = a2;
                    a2.t = true;
                    if (!map5.containsKey("SCHILY.realsize")) continue block30;
                    a8.r = Long.parseLong(map5.get("SCHILY.realsize"));
                    continue block30;
                }
            }
            a2.v.put(string, string3);
        }
    }
}

