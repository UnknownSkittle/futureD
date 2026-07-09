/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.a.a;
import org.a.a.a.c;
import org.a.a.aa;
import org.a.a.ab;
import org.a.a.c.f;
import org.a.a.g;
import org.a.a.t;
import org.a.b.d;
import org.a.b.h;
import org.a.b.k;
import org.a.b.l;
import org.a.b.n;
import org.a.b.q;
import org.a.b.v;
import org.a.c.b.b;

public final class s
implements aa,
org.a.c.a {
    private static final Pattern a = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern b = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern c = Pattern.compile("^(?:\"(\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^\"\\x00])*\"|'(\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^'\\x00])*'|\\((\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^)\\x00])*\\))");
    private static final Pattern d = Pattern.compile("^(?:[<](?:[^<> \\t\\n\\\\]|\\\\.)*[>])");
    private static final Pattern e = Pattern.compile("^\\[(?:[^\\\\\\[\\]]|\\\\.)*\\]");
    private static final Pattern f = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern g = Pattern.compile("^&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern h = Pattern.compile("`+");
    private static final Pattern i = Pattern.compile("^`+");
    private static final Pattern j = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern k = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern l = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern m = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern n = Pattern.compile("\\s+");
    private static final Pattern o = Pattern.compile(" *$");
    private static final Pattern p = Pattern.compile("^ *(?:\n|$)");
    private final BitSet q;
    private final BitSet r;
    private final Map<Character, org.a.c.b.a> s;
    private Map<String, n> t = new HashMap<String, n>();
    private q u;
    private String v;
    private int w;
    private g x;
    private org.a.a.f y;

    public s(List<org.a.c.b.a> object) {
        Cloneable cloneable = new HashMap<Character, org.a.c.b.a>();
        org.a.a.s.a(Arrays.asList(new a(), new c()), cloneable);
        org.a.a.s.a(object, cloneable);
        this.s = cloneable;
        this.r = org.a.a.s.a(this.s.keySet());
        object = this.r;
        cloneable = new BitSet();
        ((BitSet)cloneable).or((BitSet)object);
        ((BitSet)cloneable).set(10);
        ((BitSet)cloneable).set(96);
        ((BitSet)cloneable).set(91);
        ((BitSet)cloneable).set(93);
        ((BitSet)cloneable).set(92);
        ((BitSet)cloneable).set(33);
        ((BitSet)cloneable).set(60);
        ((BitSet)cloneable).set(38);
        this.q = cloneable;
    }

    private static BitSet a(Set<Character> object) {
        BitSet bitSet = new BitSet();
        object = object.iterator();
        while (object.hasNext()) {
            Character c2 = (Character)object.next();
            bitSet.set(c2.charValue());
        }
        return bitSet;
    }

    private static void a(Iterable<org.a.c.b.a> object, Map<Character, org.a.c.b.a> map) {
        object = object.iterator();
        while (object.hasNext()) {
            char c2;
            org.a.c.b.a a2 = (org.a.c.b.a)object.next();
            char c3 = a2.a();
            if (c3 == (c2 = a2.b())) {
                org.a.c.b.a a3 = map.get(Character.valueOf(c3));
                if (a3 != null && a3.a() == a3.b()) {
                    ab ab2;
                    if (a3 instanceof ab) {
                        ab2 = (ab)a3;
                    } else {
                        ab2 = new ab(c3);
                        ab2.a(a3);
                    }
                    ab2.a(a2);
                    map.put(Character.valueOf(c3), ab2);
                    continue;
                }
                org.a.a.s.a(c3, a2, map);
                continue;
            }
            org.a.a.s.a(c3, a2, map);
            org.a.a.s.a(c2, a2, map);
        }
    }

    private static void a(char c2, org.a.c.b.a a2, Map<Character, org.a.c.b.a> map) {
        if (map.put(Character.valueOf(c2), a2) != null) {
            throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a(String var1_1, q var2_2) {
        this.u = var2_2;
        this.v = var1_1.trim();
        this.w = 0;
        this.x = null;
        this.y = null;
        do {
            if ((var4_14 = (var1_1 = this).a()) == '\u0000') {
                v0 = false;
                continue;
            }
            switch (var4_14) {
                case '\n': {
                    var3_3 = var1_1;
                    ++var3_3.w;
                    var5_15 = var3_3.u.k();
                    if (var5_15 != null && var5_15 instanceof v && ((v)var5_15).a().endsWith(" ")) {
                        var6_24 = (v)var5_15;
                        var7_33 = var6_24.a();
                        var8_37 = org.a.a.s.o.matcher((CharSequence)var7_33);
                        var9_42 = var8_37.find() != false ? var8_37.end() - var8_37.start() : 0;
                        if (var9_42 > 0) {
                            var6_24.a(var7_33.substring(0, var7_33.length() - var9_42));
                        }
                        super.a(var9_42 >= 2 ? new h() : new org.a.b.t());
                    } else {
                        super.a(new org.a.b.t());
                    }
                    while (super.a() == ' ') {
                        ++var3_3.w;
                    }
                    v1 = true;
                    break;
                }
                case '\\': {
                    var3_4 = var1_1;
                    ++var3_4.w;
                    if (super.a() == '\n') {
                        super.a(new h());
                        ++var3_4.w;
                    } else if (var3_4.w < var3_4.v.length() && org.a.a.s.f.matcher(var3_4.v.substring(var3_4.w, var3_4.w + 1)).matches()) {
                        v2 = var3_4;
                        super.a(v2.v, var3_4.w, var3_4.w + 1);
                        ++var3_4.w;
                    } else {
                        super.a((CharSequence)"\\");
                    }
                    v1 = true;
                    break;
                }
                case '`': {
                    var3_5 = var1_1;
                    var5_16 = super.a(org.a.a.s.i);
                    if (var5_16 != null) ** GOTO lbl53
                    v3 = false;
                    ** GOTO lbl67
lbl53:
                    // 1 sources

                    var6_25 = var3_5.w;
                    while ((var7_33 = super.a(org.a.a.s.h)) != null) {
                        if (!var7_33.equals(var5_16)) continue;
                        var8_38 = new d();
                        var9_43 = var3_5.v.substring(var6_25, var3_5.w - var5_16.length());
                        var10_46 = org.a.a.s.n.matcher(var9_43.trim()).replaceAll(" ");
                        var8_38.a(var10_46);
                        super.a(var8_38);
                        v3 = true;
                        ** GOTO lbl67
                    }
                    var3_5.w = var6_25;
                    super.a((CharSequence)var5_16);
                    v3 = true;
lbl67:
                    // 3 sources

                    var3_6 = v3;
                    break;
                }
                case '[': {
                    var3_7 = var1_1;
                    var5_17 = var3_7.w++;
                    var6_26 = super.a((CharSequence)"[");
                    super.a(org.a.a.f.a(var6_26, var5_17, var3_7.y, var3_7.x));
                    v1 = true;
                    break;
                }
                case '!': {
                    var3_8 = var1_1;
                    var5_18 = var3_8.w++;
                    if (super.a() == '[') {
                        ++var3_8.w;
                        var6_27 = super.a((CharSequence)"![");
                        super.a(org.a.a.f.b(var6_27, var5_18 + 1, var3_8.y, var3_8.x));
                    } else {
                        super.a((CharSequence)"!");
                    }
                    v1 = true;
                    break;
                }
                case ']': {
                    var3_9 = var1_1;
                    var5_19 = ++var3_9.w;
                    var6_28 = var3_9.y;
                    if (var6_28 == null) {
                        super.a((CharSequence)"]");
                        v4 = true;
                    } else if (!var6_28.f) {
                        super.a((CharSequence)"]");
                        super.c();
                        v4 = true;
                    } else {
                        var7_33 = null;
                        var8_39 = null;
                        var9_44 = false;
                        if (super.a() == '(') {
                            ++var3_9.w;
                            super.b();
                            var7_33 = super.d();
                            if (var7_33 != null) {
                                super.b();
                                if (org.a.a.s.n.matcher(var3_9.v.substring(var3_9.w - 1, var3_9.w)).matches()) {
                                    var8_39 = super.f();
                                    super.b();
                                }
                                if (super.a() == ')') {
                                    ++var3_9.w;
                                    var9_44 = true;
                                } else {
                                    var3_9.w = var5_19;
                                }
                            }
                        }
                        if (!var9_44) {
                            var10_47 = var3_9.w;
                            var11_52 = super.g();
                            var12_56 = null;
                            if (var11_52 > 2) {
                                v5 = var10_47;
                                var12_56 = var3_9.v.substring(v5, v5 + var11_52);
                            } else if (!var6_28.g) {
                                var12_56 = var3_9.v.substring(var6_28.b, var5_19);
                            }
                            if (var12_56 != null && (var10_48 = var3_9.t.get(org.a.a.c.a.b((String)var12_56))) != null) {
                                var7_33 = var10_48.a();
                                var8_39 = var10_48.c();
                                var9_44 = true;
                            }
                        }
                        if (var9_44) {
                            var10_49 = var6_28.c != false ? new l((String)var7_33, var8_39) : new n((String)var7_33, var8_39);
                            var11_53 = var6_28.a.h();
                            while (var11_53 != null) {
                                var12_56 = var11_53.h();
                                var10_49.b((q)var11_53);
                                var11_53 = var12_56;
                            }
                            super.a(var10_49);
                            super.a(var6_28.e);
                            org.a.a.s.b(var10_49);
                            var6_28.a.l();
                            super.c();
                            if (!var6_28.c) {
                                var12_56 = var3_9.y;
                                while (var12_56 != null) {
                                    if (!var12_56.c) {
                                        var12_56.f = false;
                                    }
                                    var12_56 = var12_56.d;
                                }
                            }
                            v4 = true;
                        } else {
                            super.a((CharSequence)"]");
                            super.c();
                            var3_9.w = var5_19;
                            v4 = true;
                        }
                    }
                    var3_6 = v4;
                    break;
                }
                case '<': {
                    var3_10 = var1_1;
                    var5_20 = super.a(org.a.a.s.j);
                    if (var5_20 != null) {
                        var6_29 = var5_20.substring(1, var5_20.length() - 1);
                        var7_33 = new n("mailto:".concat(String.valueOf(var6_29)), null);
                        var7_33.b(new v(var6_29));
                        super.a((q)var7_33);
                        v6 = true;
                    } else {
                        var5_20 = super.a(org.a.a.s.k);
                        if (var5_20 != null) {
                            var6_30 = var5_20.substring(1, var5_20.length() - 1);
                            var7_33 = new n(var6_30, null);
                            var7_33.b(new v(var6_30));
                            super.a((q)var7_33);
                            v6 = true;
                        } else {
                            v6 = false;
                        }
                    }
                    if (v6) ** GOTO lbl-1000
                    var3_10 = var1_1;
                    var5_20 = super.a(org.a.a.s.b);
                    if (var5_20 != null) {
                        var6_31 = new k();
                        var6_31.a(var5_20);
                        super.a(var6_31);
                        v7 = true;
                    } else {
                        v7 = false;
                    }
                    if (v7) lbl-1000:
                    // 2 sources

                    {
                        v8 = true;
                    } else {
                        v8 = false;
                    }
                    var3_6 = v8;
                    break;
                }
                case '&': {
                    var3_11 = var1_1;
                    var5_21 = super.a(org.a.a.s.g);
                    if (var5_21 != null) {
                        super.a((CharSequence)org.a.a.c.f.a(var5_21));
                        v9 = true;
                    } else {
                        v9 = false;
                    }
                    var3_6 = v9;
                    break;
                }
                default: {
                    if (var1_1.r.get(var4_14)) {
                        var3_12 = var1_1.s.get(Character.valueOf(var4_14));
                        var6_32 = var4_14;
                        var5_22 = var3_12;
                        var3_12 = var1_1;
                        var8_40 = var6_32;
                        var7_33 = var5_22;
                        var5_22 = var3_12;
                        var9_45 = var3_12.w;
                        var10_50 = 0;
                        while (super.a() == var8_40) {
                            ++var10_50;
                            ++var5_22.w;
                        }
                        if (var10_50 < var7_33.c()) {
                            var5_22.w = var9_45;
                            v10 = null;
                        } else {
                            var11_54 = var9_45 == 0 ? "\n" : var5_22.v.substring(var9_45 - 1, var9_45);
                            var12_57 = super.a();
                            var12_58 = var12_57 == '\u0000' ? "\n" : String.valueOf(var12_57);
                            var13_60 = org.a.a.s.a.matcher(var11_54).matches();
                            var11_55 = org.a.a.s.m.matcher(var11_54).matches();
                            var14_61 = org.a.a.s.a.matcher(var12_58).matches();
                            var12_59 = org.a.a.s.m.matcher(var12_58).matches();
                            var15_62 = var12_59 == false && (var14_61 == false || var11_55 != false || var13_60 != false);
                            v11 = var11_55 = var11_55 == false && (var13_60 == false || var12_59 != false || var14_61 != false);
                            if (var8_40 == 95) {
                                var12_59 = var15_62 != false && (var11_55 == false || var13_60 != false);
                                var7_34 = var11_55 != false && (var15_62 == false || var14_61 != false);
                            } else {
                                var12_59 = var15_62 != false && var8_40 == var7_33.a();
                                var7_34 = var11_55 != false && var8_40 == var7_33.b();
                            }
                            var5_22.w = var9_45;
                            v10 = var7_35 = new t(var10_50, var12_59, var7_34);
                        }
                        if (v10 == null) {
                            v12 = false;
                        } else {
                            var8_40 = var7_35.a;
                            var9_45 = var3_12.w;
                            var3_12.w += var8_40;
                            v13 = var3_12;
                            var10_51 = super.a(v13.v, var9_45, var3_12.w);
                            var3_12.x = new g(var10_51, var6_32, var7_35.c, var7_35.b, var3_12.x);
                            var3_12.x.g = var8_40;
                            var3_12.x.h = var8_40;
                            if (var3_12.x.e != null) {
                                var3_12.x.e.f = var3_12.x;
                            }
                            v12 = true;
                        }
                        var3_6 = v12;
                        break;
                    }
                    var5_23 = var1_1;
                    var7_36 = var5_23.w;
                    var8_41 = var5_23.v.length();
                    while (var5_23.w != var8_41 && !var5_23.q.get(var5_23.v.charAt(var5_23.w))) {
                        ++var5_23.w;
                    }
                    if (var7_36 != var5_23.w) {
                        v14 = var5_23;
                        super.a(v14.v, var7_36, var5_23.w);
                        v1 = true;
                        break;
                    }
                    v1 = var3_6 = false;
                }
            }
            if (!var3_6) {
                ++var1_1.w;
                var3_13 = String.valueOf(var4_14);
                super.a((CharSequence)var3_13);
            }
            v0 = true;
        } while (v0);
        this.a((g)null);
        org.a.a.s.b(var2_2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int a(String string) {
        this.v = string;
        this.w = 0;
        int n2 = this.w++;
        int n3 = this.g();
        if (n3 == 0) {
            return 0;
        }
        String string2 = this.v.substring(0, n3);
        if (this.a() != ':') {
            return 0;
        }
        this.b();
        Object object = this.d();
        if (object == null) return 0;
        if (((String)object).length() == 0) {
            return 0;
        }
        int n4 = this.w;
        this.b();
        String string3 = this.f();
        if (string3 == null) {
            this.w = n4;
        }
        boolean bl2 = true;
        if (this.w != this.v.length() && this.a(p) == null) {
            if (string3 == null) return 0;
            string3 = null;
            this.w = n4;
            if (this.a(p) == null) return 0;
            boolean bl3 = true;
            bl2 = bl3;
        }
        if (!bl2) {
            return 0;
        }
        if ((string2 = org.a.a.c.a.b(string2)).isEmpty()) {
            return 0;
        }
        if (this.t.containsKey(string2)) return this.w - n2;
        object = new n((String)object, string3);
        this.t.put(string2, (n)object);
        return this.w - n2;
    }

    private v a(CharSequence charSequence, int n2, int n3) {
        return this.a(charSequence.subSequence(n2, n3));
    }

    private v a(CharSequence object) {
        object = new v(object.toString());
        this.a((q)object);
        return object;
    }

    private void a(q q2) {
        this.u.b(q2);
    }

    private String a(Pattern object) {
        if (this.w >= this.v.length()) {
            return null;
        }
        object = ((Pattern)object).matcher(this.v);
        ((Matcher)object).region(this.w, this.v.length());
        if (((Matcher)object).find()) {
            this.w = ((Matcher)object).end();
            return ((Matcher)object).group();
        }
        return null;
    }

    private char a() {
        if (this.w < this.v.length()) {
            return this.v.charAt(this.w);
        }
        return '\u0000';
    }

    private boolean b() {
        this.a(l);
        return true;
    }

    private void a(org.a.a.f f2) {
        if (this.y != null) {
            this.y.g = true;
        }
        this.y = f2;
    }

    private void c() {
        this.y = this.y.d;
    }

    private String d() {
        String string = this.a(d);
        if (string != null) {
            if (string.length() == 2) {
                return "";
            }
            return org.a.a.c.a.a(string.substring(1, string.length() - 1));
        }
        int n2 = this.w;
        this.e();
        return org.a.a.c.a.a(this.v.substring(n2, this.w));
    }

    private void e() {
        int n2 = 0;
        while (true) {
            char c2 = this.a();
            switch (c2) {
                case '\u0000': {
                    return;
                }
                case '\\': {
                    if (this.w + 1 >= this.v.length() || !f.matcher(this.v.substring(this.w + 1, this.w + 2)).matches()) break;
                    ++this.w;
                    break;
                }
                case '(': {
                    ++n2;
                    break;
                }
                case ')': {
                    if (n2 == 0) {
                        return;
                    }
                    --n2;
                    break;
                }
                case ' ': {
                    return;
                }
                default: {
                    if (!Character.isISOControl(c2)) break;
                    return;
                }
            }
            ++this.w;
        }
    }

    private String f() {
        String string = this.a(c);
        if (string != null) {
            return org.a.a.c.a.a(string.substring(1, string.length() - 1));
        }
        return null;
    }

    private int g() {
        String string = this.a(e);
        if (string == null || string.length() > 1001) {
            return 0;
        }
        return string.length();
    }

    private void a(g g2) {
        HashMap<Character, g> hashMap = new HashMap<Character, g>();
        Object object = this.x;
        while (object != null && ((g)object).e != g2) {
            object = ((g)object).e;
        }
        while (object != null) {
            char c2 = ((g)object).b;
            org.a.c.b.a a2 = this.s.get(Character.valueOf(c2));
            if (!((g)object).d || a2 == null) {
                object = ((g)object).f;
                continue;
            }
            char c3 = a2.a();
            int n2 = 0;
            boolean bl2 = false;
            boolean bl3 = false;
            g g3 = ((g)object).e;
            while (g3 != null && g3 != g2 && g3 != hashMap.get(Character.valueOf(c2))) {
                if (g3.c && g3.b == c3) {
                    bl3 = true;
                    n2 = a2.a(g3, (b)object);
                    if (n2 > 0) {
                        bl2 = true;
                        break;
                    }
                }
                g3 = g3.e;
            }
            if (!bl2) {
                if (!bl3) {
                    hashMap.put(Character.valueOf(c2), ((g)object).e);
                    if (!((g)object).c) {
                        this.c((g)object);
                    }
                }
                object = ((g)object).f;
                continue;
            }
            Object object2 = g3.a;
            v v2 = ((g)object).a;
            g3.g -= n2;
            ((g)object).g -= n2;
            v v3 = object2;
            v3.a(v3.a().substring(0, ((v)object2).a().length() - n2));
            v v4 = v2;
            v4.a(v4.a().substring(0, v2.a().length() - n2));
            this.a(g3, (g)object);
            org.a.a.s.a((q)object2, v2);
            a2.a((v)object2, v2, n2);
            if (g3.g == 0) {
                this.b(g3);
            }
            if (((g)object).g != 0) continue;
            object2 = ((g)object).f;
            this.b((g)object);
            object = object2;
        }
        while (this.x != null && this.x != g2) {
            s s2 = this;
            s2.c(s2.x);
        }
    }

    private void a(g g2, g g3) {
        g3 = g3.e;
        while (g3 != null && g3 != g2) {
            g g4 = g3.e;
            this.c(g3);
            g3 = g4;
        }
    }

    private void b(g g2) {
        g2.a.l();
        this.c(g2);
    }

    private void c(g g2) {
        if (g2.e != null) {
            g2.e.f = g2.f;
        }
        if (g2.f == null) {
            this.x = g2.e;
            return;
        }
        g2.f.e = g2.e;
    }

    private static void a(q q2, q q3) {
        if (q2 == q3 || q2.h() == q3) {
            return;
        }
        org.a.a.s.b(q2.h(), q3.i());
    }

    private static void b(q q2) {
        if (q2.j() == q2.k()) {
            return;
        }
        org.a.a.s.b(q2.j(), q2.k());
    }

    private static void b(q q2, q q3) {
        v v2 = null;
        v v3 = null;
        int n2 = 0;
        while (q2 != null) {
            if (q2 instanceof v) {
                v3 = (v)q2;
                if (v2 == null) {
                    v2 = v3;
                }
                n2 += v3.a().length();
            } else {
                org.a.a.s.a(v2, v3, n2);
                v2 = null;
                v3 = null;
                n2 = 0;
            }
            if (q2 == q3) break;
            q2 = q2.h();
        }
        org.a.a.s.a(v2, v3, n2);
    }

    private static void a(v v2, v q2, int n2) {
        if (v2 != null && q2 != null && v2 != q2) {
            Object object;
            StringBuilder stringBuilder = new StringBuilder(n2);
            stringBuilder.append(v2.a());
            q2 = q2.h();
            for (q q3 = v2.h(); q3 != q2; q3 = q3.h()) {
                stringBuilder.append(((v)q3).a());
                object = q3;
                ((q)object).l();
            }
            object = stringBuilder.toString();
            v2.a((String)object);
        }
    }
}

