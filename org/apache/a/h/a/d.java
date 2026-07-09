/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.a.a.f;
import org.apache.a.a.j;
import org.apache.a.c;
import org.apache.a.e;
import org.apache.a.h.a.aa;
import org.apache.a.h.a.ad;
import org.apache.a.h.a.k;
import org.apache.a.j.m;
import org.apache.a.l;
import org.apache.a.m.a;
import org.apache.a.n.b;
import org.apache.a.q;
import org.apache.a.y;

public final class d
extends aa {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private boolean b = false;
    private String c;
    private long d;
    private String e;
    private String f;
    private String g;

    public d(Charset charset) {
        super(charset);
    }

    public d() {
        this(org.apache.a.c.b);
    }

    @Override
    public final void a(e e2) {
        super.a(e2);
        this.b = true;
        if (this.f().isEmpty()) {
            throw new org.apache.a.a.m("Authentication challenge is empty");
        }
    }

    @Override
    public final boolean d() {
        String string = this.a("stale");
        if ("true".equalsIgnoreCase(string)) {
            return false;
        }
        return this.b;
    }

    @Override
    public final String a() {
        return "digest";
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    @Deprecated
    public final e a(j j2, q q2) {
        return this.a(j2, q2, new a());
    }

    @Override
    public final e a(j j2, q q2, org.apache.a.m.d d2) {
        ai.a(j2, "Credentials");
        ai.a(q2, "HTTP request");
        if (this.a("realm") == null) {
            throw new f("missing realm in challenge");
        }
        if (this.a("nonce") == null) {
            throw new f("missing nonce in challenge");
        }
        this.f().put("methodname", q2.g().a());
        this.f().put("uri", q2.g().c());
        if (this.a("charset") == null) {
            this.f().put("charset", this.a(q2));
        }
        return this.b(j2, q2);
    }

    private static MessageDigest b(String string) {
        try {
            return MessageDigest.getInstance(string);
        } catch (Exception exception) {
            throw new ad("Unsupported algorithm in HTTP Digest authentication: ".concat(String.valueOf(string)));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private e b(j object, q object2) {
        Object object3;
        String string;
        Object object4;
        Object object5 = this.a("uri");
        String string2 = this.a("realm");
        String string3 = this.a("nonce");
        String string4 = this.a("opaque");
        Object object6 = this.a("methodname");
        String string5 = this.a("algorithm");
        if (string5 == null) {
            string5 = "MD5";
        }
        HashSet<String> hashSet = new HashSet<String>(8);
        int n2 = -1;
        Object object7 = this.a("qop");
        if (object7 != null) {
            object4 = new StringTokenizer((String)object7, ",");
            while (((StringTokenizer)object4).hasMoreTokens()) {
                string = ((StringTokenizer)object4).nextToken().trim();
                hashSet.add(string.toLowerCase(Locale.ROOT));
            }
            if (object2 instanceof l && hashSet.contains("auth-int")) {
                n2 = 1;
            } else if (hashSet.contains("auth")) {
                n2 = 2;
            }
        } else {
            n2 = 0;
        }
        if (n2 == -1) {
            throw new f("None of the qop methods is supported: ".concat(String.valueOf(object7)));
        }
        object4 = this.a("charset");
        if (object4 == null) {
            object4 = "ISO-8859-1";
        }
        if ((string = string5).equalsIgnoreCase("MD5-sess")) {
            string = "MD5";
        }
        try {
            object7 = org.apache.a.h.a.d.b(string);
        } catch (ad ad2) {
            throw new f("Unsuppported digest algorithm: ".concat(String.valueOf(string)));
        }
        string = object.a().getName();
        object = object.b();
        if (string3.equals(this.c)) {
            ++this.d;
        } else {
            this.d = 1L;
            this.e = null;
            this.c = string3;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        Object object8 = new Formatter(stringBuilder, Locale.US);
        ((Formatter)object8).format("%08x", this.d);
        ((Formatter)object8).close();
        object8 = stringBuilder.toString();
        if (this.e == null) {
            object3 = new SecureRandom();
            byte[] byArray = new byte[8];
            ((SecureRandom)object3).nextBytes(byArray);
            this.e = org.apache.a.h.a.d.a(byArray);
        }
        this.f = null;
        this.g = null;
        if (string5.equalsIgnoreCase("MD5-sess")) {
            stringBuilder.setLength(0);
            stringBuilder.append(string).append(':').append(string2).append(':').append((String)object);
            object = org.apache.a.h.a.d.a(((MessageDigest)object7).digest(ai.a(stringBuilder.toString(), (String)object4)));
            stringBuilder.setLength(0);
            stringBuilder.append((String)object).append(':').append(string3).append(':').append(this.e);
            this.f = stringBuilder.toString();
        } else {
            stringBuilder.setLength(0);
            stringBuilder.append(string).append(':').append(string2).append(':').append((String)object);
            this.f = stringBuilder.toString();
        }
        object = org.apache.a.h.a.d.a(((MessageDigest)object7).digest(ai.a(this.f, (String)object4)));
        if (n2 == 2) {
            this.g = (String)object6 + ':' + (String)object5;
        } else if (n2 == 1) {
            object3 = null;
            if (object2 instanceof l) {
                object3 = ((l)object2).b();
            }
            if (object3 != null && !object3.isRepeatable()) {
                if (!hashSet.contains("auth")) throw new f("Qop auth-int cannot be used with a non-repeatable entity");
                n2 = 2;
                this.g = (String)object6 + ':' + (String)object5;
            } else {
                object2 = new k((MessageDigest)object7);
                try {
                    if (object3 != null) {
                        object3.writeTo((OutputStream)object2);
                    }
                    ((k)object2).close();
                } catch (IOException iOException) {
                    throw new f("I/O error reading entity content", iOException);
                }
                this.g = (String)object6 + ':' + (String)object5 + ':' + org.apache.a.h.a.d.a(((k)object2).a());
            }
        } else {
            this.g = (String)object6 + ':' + (String)object5;
        }
        object3 = org.apache.a.h.a.d.a(((MessageDigest)object7).digest(ai.a(this.g, (String)object4)));
        if (n2 == 0) {
            stringBuilder.setLength(0);
            stringBuilder.append((String)object).append(':').append(string3).append(':').append((String)object3);
            object2 = stringBuilder.toString();
        } else {
            stringBuilder.setLength(0);
            stringBuilder.append((String)object).append(':').append(string3).append(':').append((String)object8).append(':').append(this.e).append(':').append(n2 == 1 ? "auth-int" : "auth").append(':').append((String)object3);
            object2 = stringBuilder.toString();
        }
        object3 = object2;
        ai.a(object3, "Input");
        object = org.apache.a.h.a.d.a(((MessageDigest)object7).digest(((String)object3).getBytes(org.apache.a.c.b)));
        object2 = new b(128);
        if (this.e()) {
            ((b)object2).a("Proxy-Authorization");
        } else {
            ((b)object2).a("Authorization");
        }
        ((b)object2).a(": Digest ");
        object6 = new ArrayList<m>(20);
        object6.add(new m("username", string));
        object6.add(new m("realm", string2));
        object6.add(new m("nonce", string3));
        object6.add(new m("uri", (String)object5));
        object6.add(new m("response", (String)object));
        if (n2 != 0) {
            object6.add(new m("qop", n2 == 1 ? "auth-int" : "auth"));
            object6.add(new m("nc", (String)object8));
            object6.add(new m("cnonce", this.e));
        }
        object6.add(new m("algorithm", string5));
        if (string4 != null) {
            object6.add(new m("opaque", string4));
        }
        for (int i2 = 0; i2 < object6.size(); ++i2) {
            String string6;
            object5 = (m)object6.get(i2);
            if (i2 > 0) {
                ((b)object2).a(", ");
            }
            boolean bl2 = "nc".equals(string6 = ((m)object5).a()) || "qop".equals(string6) || "algorithm".equals(string6);
            org.apache.a.j.f.a((b)object2, (y)object5, !bl2);
        }
        return new org.apache.a.j.q((b)object2);
    }

    private static String a(byte[] byArray) {
        int n2 = byArray.length;
        char[] cArray = new char[n2 << 1];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = byArray[i2] & 0xF;
            int n4 = (byArray[i2] & 0xF0) >> 4;
            cArray[i2 << 1] = a[n4];
            cArray[(i2 << 1) + 1] = a[n3];
        }
        return new String(cArray);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DIGEST [complete=").append(this.b).append(", nonce=").append(this.c).append(", nc=").append(this.d).append("]");
        return stringBuilder.toString();
    }
}

