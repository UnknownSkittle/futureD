/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.f;

import com.a.a.b.ai;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.apache.a.c;
import org.apache.a.g.e;
import org.apache.a.j.m;
import org.apache.a.j.v;
import org.apache.a.j.w;
import org.apache.a.k;
import org.apache.a.n.b;
import org.apache.a.y;

public final class d {
    private static final BitSet a;
    private static final BitSet b;
    private static final BitSet c;
    private static final BitSet d;
    private static final BitSet e;
    private static final BitSet f;
    private static final BitSet g;

    public static List<y> a(k object) {
        b b2;
        ai.a(object, "HTTP entity");
        Object object2 = org.apache.a.g.e.a((k)object);
        if (object2 == null || !((e)object2).a().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return Collections.emptyList();
        }
        long l2 = object.getContentLength();
        ai.a(l2 <= Integer.MAX_VALUE, "HTTP entity is too large");
        object2 = ((e)object2).b() != null ? ((e)object2).b() : org.apache.a.m.c.a;
        object = object.getContent();
        if (object == null) {
            return Collections.emptyList();
        }
        try {
            int n2;
            b2 = new b(l2 > 0L ? (int)l2 : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object, (Charset)object2);
            char[] cArray = new char[1024];
            while ((n2 = inputStreamReader.read(cArray)) != -1) {
                b2.a(cArray, 0, n2);
            }
        } finally {
            ((InputStream)object).close();
        }
        if (b2.length() == 0) {
            return Collections.emptyList();
        }
        return org.apache.a.b.f.d.a(b2, (Charset)object2, '&');
    }

    public static List<y> a(String string, Charset charset) {
        if (string == null) {
            return Collections.emptyList();
        }
        b b2 = new b(string.length());
        b2.a(string);
        return org.apache.a.b.f.d.a(b2, charset, '&', ';');
    }

    private static List<y> a(b b2, Charset charset, char ... object) {
        ai.a(b2, "Char array buffer");
        BitSet bitSet = new BitSet();
        for (char c2 : object) {
            bitSet.set(c2);
        }
        object = new v(0, b2.length());
        ArrayList<y> arrayList = new ArrayList<y>();
        while (!((v)object).c()) {
            bitSet.set(61);
            String string = w.a(b2, (v)object, bitSet);
            String string2 = null;
            if (!((v)object).c()) {
                char c3 = b2.charAt(((v)object).b());
                Object object2 = object;
                ((v)object2).a(((v)object2).b() + 1);
                if (c3 == '=') {
                    bitSet.clear(61);
                    string2 = w.b(b2, (v)object, bitSet);
                    if (!((v)object).c()) {
                        Object object3 = object;
                        ((v)object3).a(((v)object3).b() + 1);
                    }
                }
            }
            if (string.isEmpty()) continue;
            arrayList.add(new m(org.apache.a.b.f.d.f(string, charset), org.apache.a.b.f.d.f(string2, charset)));
        }
        return arrayList;
    }

    public static String a(Iterable<? extends y> object, Charset charset) {
        ai.a(object, "Parameters");
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (y)object.next();
            String string = org.apache.a.b.f.d.g(object2.a(), charset);
            object2 = org.apache.a.b.f.d.g(object2.b(), charset);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string);
            if (object2 == null) continue;
            stringBuilder.append("=");
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }

    private static String a(String object, Charset charset, BitSet bitSet, boolean bl2) {
        if (object == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object = charset.encode((String)object);
        while (((Buffer)object).hasRemaining()) {
            int n2 = ((ByteBuffer)object).get() & 0xFF;
            if (bitSet.get(n2)) {
                stringBuilder.append((char)n2);
                continue;
            }
            if (bl2 && n2 == 32) {
                stringBuilder.append('+');
                continue;
            }
            stringBuilder.append("%");
            char c2 = Character.toUpperCase(Character.forDigit(n2 >> 4 & 0xF, 16));
            n2 = Character.toUpperCase(Character.forDigit(n2 & 0xF, 16));
            stringBuilder.append(c2);
            stringBuilder.append((char)n2);
        }
        return stringBuilder.toString();
    }

    private static String e(String charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(((String)charSequence).length());
        charSequence = CharBuffer.wrap(charSequence);
        while (((Buffer)((Object)charSequence)).hasRemaining()) {
            char c2 = ((CharBuffer)charSequence).get();
            if (c2 == '%' && ((Buffer)((Object)charSequence)).remaining() >= 2) {
                c2 = ((CharBuffer)charSequence).get();
                char c3 = ((CharBuffer)charSequence).get();
                int n2 = Character.digit(c2, 16);
                int n3 = Character.digit(c3, 16);
                if (n2 != -1 && n3 != -1) {
                    byteBuffer.put((byte)((n2 << 4) + n3));
                    continue;
                }
                byteBuffer.put((byte)37);
                byteBuffer.put((byte)c2);
                byteBuffer.put((byte)c3);
                continue;
            }
            if (c2 == '+') {
                byteBuffer.put((byte)32);
                continue;
            }
            byteBuffer.put((byte)c2);
        }
        byteBuffer.flip();
        return charset.decode(byteBuffer).toString();
    }

    private static String f(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return org.apache.a.b.f.d.e(string, charset != null ? charset : org.apache.a.c.a);
    }

    private static String g(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return org.apache.a.b.f.d.a(string, charset != null ? charset : org.apache.a.c.a, g, true);
    }

    static String b(String string, Charset charset) {
        return org.apache.a.b.f.d.a(string, charset, c, false);
    }

    static String c(String string, Charset charset) {
        return org.apache.a.b.f.d.a(string, charset, e, false);
    }

    static String d(String string, Charset charset) {
        return org.apache.a.b.f.d.a(string, charset, d, false);
    }

    static {
        int n2;
        a = new BitSet(256);
        b = new BitSet(256);
        c = new BitSet(256);
        d = new BitSet(256);
        e = new BitSet(256);
        f = new BitSet(256);
        g = new BitSet(256);
        for (n2 = 97; n2 <= 122; ++n2) {
            a.set(n2);
        }
        for (n2 = 65; n2 <= 90; ++n2) {
            a.set(n2);
        }
        for (n2 = 48; n2 <= 57; ++n2) {
            a.set(n2);
        }
        a.set(95);
        a.set(45);
        a.set(46);
        a.set(42);
        g.or(a);
        a.set(33);
        a.set(126);
        a.set(39);
        a.set(40);
        a.set(41);
        b.set(44);
        b.set(59);
        b.set(58);
        b.set(36);
        b.set(38);
        b.set(43);
        b.set(61);
        c.or(a);
        c.or(b);
        d.or(a);
        d.set(47);
        d.set(59);
        d.set(58);
        d.set(64);
        d.set(38);
        d.set(61);
        d.set(43);
        d.set(36);
        d.set(44);
        f.set(59);
        f.set(47);
        f.set(63);
        f.set(58);
        f.set(64);
        f.set(38);
        f.set(61);
        f.set(43);
        f.set(36);
        f.set(44);
        f.set(91);
        f.set(93);
        e.or(f);
        e.or(a);
    }
}

