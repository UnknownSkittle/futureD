/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import java.util.BitSet;
import org.apache.a.j.v;
import org.apache.a.n.b;

public final class w {
    public static final w a = new w();

    public static BitSet a(int ... nArray) {
        BitSet bitSet = new BitSet();
        for (int n2 : nArray) {
            bitSet.set(n2);
        }
        return bitSet;
    }

    private static boolean a(char c2) {
        return c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n';
    }

    public static String a(b b2, v v2, BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        while (!v2.c()) {
            char c2 = b2.charAt(v2.b());
            if (bitSet != null && bitSet.get(c2)) break;
            if (w.a(c2)) {
                w.a(b2, v2);
                bl2 = true;
                continue;
            }
            if (bl2 && stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            w.a(b2, v2, bitSet, stringBuilder);
            bl2 = false;
        }
        return stringBuilder.toString();
    }

    public static String b(b b2, v v2, BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        while (!v2.c()) {
            char c2 = b2.charAt(v2.b());
            if (bitSet != null && bitSet.get(c2)) break;
            if (w.a(c2)) {
                w.a(b2, v2);
                bl2 = true;
                continue;
            }
            if (c2 == '\"') {
                if (bl2 && stringBuilder.length() > 0) {
                    stringBuilder.append(' ');
                }
                w.a(b2, v2, stringBuilder);
                bl2 = false;
                continue;
            }
            if (bl2 && stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            w.b(b2, v2, bitSet, stringBuilder);
            bl2 = false;
        }
        return stringBuilder.toString();
    }

    public static void a(b b2, v v2) {
        int n2 = v2.b();
        int n3 = v2.a();
        for (int i2 = v2.b(); i2 < n3 && w.a(b2.charAt(i2)); ++i2) {
            ++n2;
        }
        v2.a(n2);
    }

    private static void a(b b2, v v2, BitSet bitSet, StringBuilder stringBuilder) {
        int n2 = v2.b();
        int n3 = v2.a();
        for (int i2 = v2.b(); i2 < n3; ++i2) {
            char c2 = b2.charAt(i2);
            if (bitSet != null && bitSet.get(c2) || w.a(c2)) break;
            ++n2;
            stringBuilder.append(c2);
        }
        v2.a(n2);
    }

    private static void b(b b2, v v2, BitSet bitSet, StringBuilder stringBuilder) {
        int n2 = v2.b();
        int n3 = v2.a();
        for (int i2 = v2.b(); i2 < n3; ++i2) {
            char c2 = b2.charAt(i2);
            if (bitSet != null && bitSet.get(c2) || w.a(c2) || c2 == '\"') break;
            ++n2;
            stringBuilder.append(c2);
        }
        v2.a(n2);
    }

    private static void a(b b2, v v2, StringBuilder stringBuilder) {
        if (v2.c()) {
            return;
        }
        int n2 = v2.b();
        int n3 = v2.b();
        int n4 = v2.a();
        if (b2.charAt(n2) != '\"') {
            return;
        }
        ++n2;
        ++n3;
        boolean bl2 = false;
        while (n3 < n4) {
            char c2 = b2.charAt(n3);
            if (bl2) {
                if (c2 != '\"' && c2 != '\\') {
                    stringBuilder.append('\\');
                }
                stringBuilder.append(c2);
                bl2 = false;
            } else {
                if (c2 == '\"') {
                    ++n2;
                    break;
                }
                if (c2 == '\\') {
                    bl2 = true;
                } else if (c2 != '\r' && c2 != '\n') {
                    stringBuilder.append(c2);
                }
            }
            ++n3;
            ++n2;
        }
        v2.a(n2);
    }
}

