/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.f;

import com.a.a.b.ai;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.a.b.f.d;
import org.apache.a.e.a.e;
import org.apache.a.e.d.b;
import org.apache.a.n;
import org.apache.a.y;

public final class c {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private List<y> k;
    private String l;
    private Charset m;
    private String n;
    private String o;

    public c() {
        this.g = -1;
    }

    public c(URI object) {
        URI uRI = object;
        object = this;
        this.a = uRI.getScheme();
        ((c)object).b = uRI.getRawSchemeSpecificPart();
        ((c)object).c = uRI.getRawAuthority();
        ((c)object).f = uRI.getHost();
        ((c)object).g = uRI.getPort();
        ((c)object).e = uRI.getRawUserInfo();
        ((c)object).d = uRI.getUserInfo();
        ((c)object).i = uRI.getRawPath();
        ((c)object).h = uRI.getPath();
        ((c)object).j = uRI.getRawQuery();
        Charset charset = ((c)object).m != null ? ((c)object).m : org.apache.a.c.a;
        String string = uRI.getRawQuery();
        ((c)object).k = string != null && !string.isEmpty() ? org.apache.a.b.f.d.a(string, charset) : null;
        ((c)object).o = uRI.getRawFragment();
        ((c)object).n = uRI.getFragment();
    }

    public final c a(Charset charset) {
        this.m = charset;
        return this;
    }

    public final URI a() {
        return new URI(this.d());
    }

    private String d() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(this.a).append(':');
        }
        if (this.b != null) {
            stringBuilder.append(this.b);
        } else {
            if (this.c != null) {
                stringBuilder.append("//").append(this.c);
            } else if (this.f != null) {
                stringBuilder.append("//");
                if (this.e != null) {
                    stringBuilder.append(this.e).append("@");
                } else if (this.d != null) {
                    c c2 = this;
                    stringBuilder.append(c2.c(c2.d)).append("@");
                }
                if (org.apache.a.e.d.b.b(this.f)) {
                    stringBuilder.append("[").append(this.f).append("]");
                } else {
                    stringBuilder.append(this.f);
                }
                if (this.g >= 0) {
                    stringBuilder.append(":").append(this.g);
                }
            }
            if (this.i != null) {
                stringBuilder.append(org.apache.a.b.f.c.f(this.i));
            } else if (this.h != null) {
                c c3 = this;
                stringBuilder.append(c3.d(org.apache.a.b.f.c.f(c3.h)));
            }
            if (this.j != null) {
                stringBuilder.append("?").append(this.j);
            } else if (this.k != null) {
                c c4 = this;
                stringBuilder.append("?").append(c4.b(c4.k));
            }
        }
        if (this.o != null) {
            stringBuilder.append("#").append(this.o);
        } else if (this.n != null) {
            c c5 = this;
            stringBuilder.append("#").append(c5.e(c5.n));
        }
        return stringBuilder.toString();
    }

    private String c(String string) {
        return org.apache.a.b.f.d.b(string, this.m != null ? this.m : org.apache.a.c.a);
    }

    private String d(String string) {
        return org.apache.a.b.f.d.d(string, this.m != null ? this.m : org.apache.a.c.a);
    }

    private String b(List<y> list) {
        return org.apache.a.b.f.d.a(list, this.m != null ? this.m : org.apache.a.c.a);
    }

    private String e(String string) {
        return org.apache.a.b.f.d.c(string, this.m != null ? this.m : org.apache.a.c.a);
    }

    public final c a(String string) {
        this.f = string;
        this.b = null;
        this.c = null;
        return this;
    }

    private c a(int n2) {
        this.g = n2 < 0 ? -1 : n2;
        this.b = null;
        this.c = null;
        return this;
    }

    public final c b(String string) {
        this.h = string;
        this.b = null;
        this.i = null;
        return this;
    }

    public final c a(List<y> list) {
        if (this.k == null) {
            this.k = new ArrayList<y>();
        }
        this.k.addAll(list);
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    private c e() {
        this.n = null;
        this.o = null;
        return this;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.h;
    }

    public final String toString() {
        return this.d();
    }

    private static String f(String string) {
        int n2;
        if (string == null) {
            return "/";
        }
        for (n2 = 0; n2 < string.length() && string.charAt(n2) == '/'; ++n2) {
        }
        if (n2 > 1) {
            string = string.substring(n2 - 1);
        }
        if (!string.startsWith("/")) {
            string = "/".concat(String.valueOf(string));
        }
        return string;
    }

    public static URI a(URI object, n n2, boolean bl2) {
        ai.a(object, "URI");
        if (((URI)object).isOpaque()) {
            return object;
        }
        object = new c((URI)object);
        if (n2 != null) {
            ((c)object).a = n2.c();
            ((c)object).a(n2.a());
            super.a(n2.b());
        } else {
            ((c)object).a = null;
            ((c)object).a((String)null);
            super.a(-1);
        }
        if (bl2) {
            super.e();
        }
        if (ai.a((CharSequence)((c)object).h)) {
            ((c)object).b("/");
        }
        return ((c)object).a();
    }

    private static URI b(URI object) {
        ai.a(object, "URI");
        if (((URI)object).isOpaque()) {
            return object;
        }
        object = new c((URI)object);
        if (((c)object).d != null) {
            Object object2 = object;
            ((c)object).d = null;
            ((c)object2).b = null;
            ((c)object2).c = null;
            ((c)object2).e = null;
        }
        if (ai.a((CharSequence)((c)object).h)) {
            ((c)object).b("/");
        }
        if (((c)object).f != null) {
            Object object3 = object;
            ((c)object3).a(((c)object3).f.toLowerCase(Locale.ROOT));
        }
        super.e();
        return ((c)object).a();
    }

    public static URI a(URI uRI, e object) {
        if (uRI == null) {
            return null;
        }
        if (object.e() != null && !object.f()) {
            if (!uRI.isAbsolute()) {
                object = object.a();
                return org.apache.a.b.f.c.a(uRI, (n)object, true);
            }
            return org.apache.a.b.f.c.b(uRI);
        }
        if (uRI.isAbsolute()) {
            return org.apache.a.b.f.c.a(uRI, null, true);
        }
        return org.apache.a.b.f.c.b(uRI);
    }

    public static URI a(URI object, URI object2) {
        ai.a(object, "Base URI");
        ai.a(object2, "Reference URI");
        String string = ((URI)object2).toASCIIString();
        if (string.startsWith("?")) {
            object2 = ((URI)object).toASCIIString();
            int n2 = ((String)object2).indexOf(63);
            object2 = n2 >= 0 ? ((String)object2).substring(0, n2) : object2;
            return URI.create((String)object2 + string);
        }
        if (string.isEmpty()) {
            object = ((URI)object).resolve(URI.create("#")).toASCIIString();
            object = URI.create(((String)object).substring(0, ((String)object).indexOf(35)));
        } else {
            object = ((URI)object).resolve((URI)object2);
        }
        try {
            return org.apache.a.b.f.c.c((URI)object);
        } catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException(uRISyntaxException);
        }
    }

    private static URI c(URI object) {
        if (((URI)object).isOpaque() || ((URI)object).getAuthority() == null) {
            return object;
        }
        ai.a(((URI)object).isAbsolute(), "Base URI must be absolute");
        object = new c((URI)object);
        String string = ((c)object).h;
        if (string != null && !string.equals("/")) {
            Object object2 = string.split("/");
            Stack<String> stack = new Stack<String>();
            for (String string2 : object2) {
                if (string2.isEmpty() || ".".equals(string2)) continue;
                if ("..".equals(string2)) {
                    if (stack.isEmpty()) continue;
                    stack.pop();
                    continue;
                }
                stack.push(string2);
            }
            object2 = new StringBuilder();
            for (String string3 : stack) {
                ((StringBuilder)object2).append('/').append(string3);
            }
            if (string.lastIndexOf(47) == string.length() - 1) {
                ((StringBuilder)object2).append('/');
            }
            ((c)object).b(((StringBuilder)object2).toString());
        }
        if (((c)object).a != null) {
            ((c)object).a = ((c)object).a.toLowerCase(Locale.ROOT);
        }
        if (((c)object).f != null) {
            Object object3 = object;
            ((c)object3).a(((c)object3).f.toLowerCase(Locale.ROOT));
        }
        return ((c)object).a();
    }

    public static n a(URI uRI) {
        if (uRI == null) {
            return null;
        }
        n n2 = null;
        if (uRI.isAbsolute()) {
            int n3 = uRI.getPort();
            String string = uRI.getHost();
            if (string == null && (string = uRI.getAuthority()) != null) {
                int n4 = string.indexOf(64);
                if (n4 >= 0) {
                    string = string.length() > n4 + 1 ? string.substring(n4 + 1) : null;
                }
                if (string != null && (n4 = string.indexOf(58)) >= 0) {
                    int n5 = n4 + 1;
                    int n6 = 0;
                    for (int i2 = n5; i2 < string.length() && Character.isDigit(string.charAt(i2)); ++i2) {
                        ++n6;
                    }
                    if (n6 > 0) {
                        try {
                            int n7 = n5;
                            n3 = Integer.parseInt(string.substring(n7, n7 + n6));
                        } catch (NumberFormatException numberFormatException) {}
                    }
                    string = string.substring(0, n4);
                }
            }
            String string2 = uRI.getScheme();
            if (!ai.b(string)) {
                try {
                    n2 = new n(string, n3, string2);
                } catch (IllegalArgumentException illegalArgumentException) {}
            }
        }
        return n2;
    }
}

