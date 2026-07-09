/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.a.a.aa;
import org.a.a.ad;
import org.a.a.b;
import org.a.a.c.g;
import org.a.a.d;
import org.a.a.e;
import org.a.a.h;
import org.a.a.j;
import org.a.a.l;
import org.a.a.n;
import org.a.a.p;
import org.a.a.r;
import org.a.a.v;
import org.a.a.z;
import org.a.b.m;
import org.a.b.o;
import org.a.b.s;
import org.a.b.w;
import org.a.c.a;
import org.a.c.a.c;
import org.a.c.a.f;

public final class i
implements f {
    private static final Set<Class<? extends org.a.b.a>> a = new LinkedHashSet<Class>(Arrays.asList(org.a.b.b.class, org.a.b.i.class, org.a.b.g.class, org.a.b.j.class, w.class, o.class, m.class));
    private static final Map<Class<? extends org.a.b.a>, c> b;
    private CharSequence c;
    private int d = 0;
    private int e = 0;
    private boolean f;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private boolean j;
    private final List<c> k;
    private final a l;
    private final h m;
    private List<org.a.c.a.b> n = new ArrayList<org.a.c.a.b>();
    private Set<org.a.c.a.b> o = new HashSet<org.a.c.a.b>();

    public i(List<c> list, a a2) {
        this.k = list;
        this.l = a2;
        this.m = new h();
        i i2 = this;
        i2.d(i2.m);
    }

    public static Set<Class<? extends org.a.b.a>> a() {
        return a;
    }

    public static List<c> a(List<c> object, Set<Class<? extends org.a.b.a>> object2) {
        ArrayList<c> arrayList = new ArrayList<c>();
        arrayList.addAll((Collection<c>)object);
        object = object2.iterator();
        while (object.hasNext()) {
            object2 = (Class)object.next();
            arrayList.add(b.get(object2));
        }
        return arrayList;
    }

    public final org.a.b.e a(Reader object) {
        String string;
        object = object instanceof BufferedReader ? (BufferedReader)object : new BufferedReader((Reader)object);
        while ((string = ((BufferedReader)object).readLine()) != null) {
            this.a(string);
        }
        object = this;
        ((i)object).a(((i)object).n);
        super.l();
        return ((i)object).m.d_();
    }

    @Override
    public final CharSequence b() {
        return this.c;
    }

    @Override
    public final int c() {
        return this.d;
    }

    @Override
    public final int d() {
        return this.g;
    }

    @Override
    public final int e() {
        return this.e;
    }

    @Override
    public final int f() {
        return this.i;
    }

    @Override
    public final boolean g() {
        return this.j;
    }

    @Override
    public final org.a.c.a.b h() {
        return this.n.get(this.n.size() - 1);
    }

    private void a(CharSequence charSequence) {
        Object object;
        this.c = org.a.a.c.g.b(charSequence);
        this.d = 0;
        this.e = 0;
        this.f = false;
        int n2 = 1;
        for (org.a.c.a.b object2 : this.n.subList(1, this.n.size())) {
            this.i();
            object = object2.a(this);
            if (!(object instanceof b)) break;
            b b2 = (b)object;
            if (b2.c()) {
                this.b(object2);
                return;
            }
            if (b2.a() != -1) {
                this.a(b2.a());
            } else if (b2.b() != -1) {
                this.b(b2.b());
            }
            ++n2;
        }
        List<org.a.c.a.b> list = this.n;
        ArrayList<org.a.c.a.b> arrayList = new ArrayList<org.a.c.a.b>(list.subList(n2, list.size()));
        object = this.n.get(n2 - 1);
        boolean bl2 = arrayList.isEmpty();
        int n3 = n2 = ((org.a.c.a.b)object).b() instanceof s || ((org.a.c.a.b)object).a() ? 1 : 0;
        while (n2 != 0) {
            this.i();
            if (this.j || this.i < org.a.a.c.g.a && org.a.a.c.g.a(this.c, this.g)) {
                i i2 = this;
                i2.a(i2.g);
                break;
            }
            e e2 = this.a((org.a.c.a.b)object);
            if (e2 == null) {
                i i3 = this;
                i3.a(i3.g);
                break;
            }
            if (!bl2) {
                this.a((List<org.a.c.a.b>)arrayList);
                bl2 = true;
            }
            if (e2.b() != -1) {
                this.a(e2.b());
            } else if (e2.c() != -1) {
                this.b(e2.c());
            }
            if (e2.d()) {
                i i4 = this;
                org.a.c.a.b b3 = i4.h();
                i4.m();
                i4.o.remove(b3);
                b3.b().l();
            }
            for (org.a.c.a.b b4 : e2.a()) {
                object = this.c(b4);
                n2 = b4.a() ? 1 : 0;
            }
        }
        if (!bl2 && !this.j && this.h() instanceof z) {
            this.k();
            return;
        }
        if (!bl2) {
            this.a((List<org.a.c.a.b>)arrayList);
        }
        if (!((org.a.c.a.b)object).a()) {
            this.k();
            return;
        }
        if (!this.j) {
            this.c(new z());
            this.k();
        }
    }

    private void i() {
        int n2 = this.d;
        int n3 = this.e;
        this.j = true;
        int n4 = this.c.length();
        block4: while (n2 < n4) {
            switch (this.c.charAt(n2)) {
                case ' ': {
                    ++n2;
                    ++n3;
                    continue block4;
                }
                case '\t': {
                    ++n2;
                    n3 += 4 - n3 % 4;
                    continue block4;
                }
            }
            this.j = false;
            break;
        }
        this.g = n2;
        this.h = n3;
        this.i = this.h - this.e;
    }

    private void a(int n2) {
        if (n2 >= this.g) {
            this.d = this.g;
            this.e = this.h;
        }
        int n3 = this.c.length();
        while (this.d < n2 && this.d != n3) {
            this.j();
        }
        this.f = false;
    }

    private void b(int n2) {
        if (n2 >= this.h) {
            this.d = this.g;
            this.e = this.h;
        }
        int n3 = this.c.length();
        while (this.e < n2 && this.d != n3) {
            this.j();
        }
        if (this.e > n2) {
            --this.d;
            this.e = n2;
            this.f = true;
            return;
        }
        this.f = false;
    }

    private void j() {
        if (this.c.charAt(this.d) == '\t') {
            ++this.d;
            this.e += org.a.a.c.g.a(this.e);
            return;
        }
        ++this.d;
        ++this.e;
    }

    private void k() {
        CharSequence charSequence;
        if (this.f) {
            CharSequence charSequence2 = this.c;
            charSequence = charSequence2.subSequence(this.d + 1, charSequence2.length());
            int n2 = org.a.a.c.g.a(this.e);
            StringBuilder stringBuilder = new StringBuilder(n2 + charSequence.length());
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(charSequence);
            charSequence = stringBuilder.toString();
        } else {
            charSequence = this.c.subSequence(this.d, this.c.length());
        }
        this.h().a(charSequence);
    }

    private e a(org.a.c.a.b object) {
        object = new j((org.a.c.a.b)object);
        Iterator<c> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            org.a.c.a.d d2 = iterator.next().a(this, (org.a.c.a.e)object);
            if (!(d2 instanceof e)) continue;
            return (e)d2;
        }
        return null;
    }

    private void b(org.a.c.a.b b2) {
        if (this.h() == b2) {
            this.m();
        }
        b2.c();
        if (b2 instanceof z && this.l instanceof aa) {
            ((z)b2).a((aa)((Object)this.l));
        }
    }

    private void l() {
        Iterator<org.a.c.a.b> iterator = this.o.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.l);
        }
    }

    private <T extends org.a.c.a.b> T c(T t2) {
        while (!this.h().a(t2.b())) {
            i i2 = this;
            i2.b(i2.h());
        }
        this.h().b().b(t2.b());
        this.d(t2);
        return t2;
    }

    private void d(org.a.c.a.b b2) {
        this.n.add(b2);
        this.o.add(b2);
    }

    private void m() {
        this.n.remove(this.n.size() - 1);
    }

    private void a(List<org.a.c.a.b> list) {
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            org.a.c.a.b b2 = list.get(i2);
            this.b(b2);
        }
    }

    static {
        HashMap<Class<m>, c> hashMap = new HashMap<Class<m>, c>();
        hashMap.put(org.a.b.b.class, new d());
        hashMap.put(org.a.b.i.class, new n());
        hashMap.put(org.a.b.g.class, new l());
        hashMap.put(org.a.b.j.class, new p());
        hashMap.put(w.class, new ad());
        hashMap.put(o.class, new v());
        hashMap.put(m.class, new r());
        b = Collections.unmodifiableMap(hashMap);
    }
}

