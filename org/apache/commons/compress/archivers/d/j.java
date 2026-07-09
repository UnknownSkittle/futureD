/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.b;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.d.d;
import org.apache.commons.compress.archivers.d.e;
import org.apache.commons.compress.archivers.d.k;
import org.apache.commons.compress.archivers.d.l;
import org.apache.commons.compress.archivers.d.m;
import org.apache.commons.compress.archivers.d.o;
import org.apache.commons.compress.archivers.d.q;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;

public final class j
extends c {
    private l a;
    private e b;
    private boolean c;
    private boolean d;
    private long e;
    private long f;
    private int g;
    private final byte[] h = new byte[1024];
    private byte[] i;
    private int j;
    private long k;
    private o l;
    private final Map<Integer, org.apache.commons.compress.archivers.d.a> m = new HashMap<Integer, org.apache.commons.compress.archivers.d.a>();
    private final Map<Integer, e> n = new HashMap<Integer, e>();
    private Queue<e> o;
    private final as p;
    private String q;

    public j(InputStream inputStream) {
        this(inputStream, null);
    }

    public j(InputStream object, String object2) {
        this.l = new o((InputStream)object);
        this.d = false;
        this.q = object2;
        this.p = at.a((String)object2);
        try {
            byte[] byArray = this.l.b();
            object = byArray;
            if (!org.apache.commons.compress.archivers.d.a.a(byArray)) {
                throw new q();
            }
            this.a = new l((byte[])object, this.p);
            this.l.a(this.a.a(), this.a.b());
            this.i = new byte[4096];
            object = this;
            byte[] byArray2 = ((j)object).l.b();
            object2 = byArray2;
            if (!org.apache.commons.compress.archivers.d.a.a(byArray2)) {
                throw new m();
            }
            ((j)object).b = org.apache.commons.compress.archivers.d.e.a((byte[])object2);
            if (org.apache.commons.compress.archivers.d.d.e != ((j)object).b.b()) {
                throw new m();
            }
            if (((j)object).l.skip(1024L * (long)((j)object).b.c()) == -1L) {
                throw new EOFException();
            }
            ((j)object).g = ((j)object).b.c();
            object = this;
            byte[] byArray3 = ((j)object).l.b();
            object2 = byArray3;
            if (!org.apache.commons.compress.archivers.d.a.a(byArray3)) {
                throw new m();
            }
            ((j)object).b = org.apache.commons.compress.archivers.d.e.a((byte[])object2);
            if (org.apache.commons.compress.archivers.d.d.b != ((j)object).b.b()) {
                throw new m();
            }
            if (((j)object).l.skip(1024L * (long)((j)object).b.c()) == -1L) {
                throw new EOFException();
            }
            ((j)object).g = ((j)object).b.c();
        } catch (IOException iOException) {
            throw new b(iOException.getMessage(), iOException);
        }
        object = new org.apache.commons.compress.archivers.d.a(2, 2, 4, ".");
        this.m.put(2, (org.apache.commons.compress.archivers.d.a)object);
        this.o = new PriorityQueue<e>(10, new k(this));
    }

    @Override
    public final long b() {
        return this.l.c();
    }

    private void a(e e2) {
        long l2 = e2.g();
        int n2 = 1;
        while (n2 != 0 || org.apache.commons.compress.archivers.d.d.c == e2.b()) {
            int n3;
            if (n2 == 0) {
                this.l.b();
            }
            if (!this.m.containsKey(e2.a()) && org.apache.commons.compress.archivers.d.d.a == e2.b()) {
                this.n.put(e2.a(), e2);
            }
            if (this.i.length < (n2 = 1024 * e2.c())) {
                this.i = new byte[n2];
            }
            if (this.l.read(this.i, 0, n2) != n2) {
                throw new EOFException();
            }
            for (int i2 = 0; i2 < n2 - 8 && (long)i2 < l2 - 8L; i2 += n3) {
                int n4 = (int)org.apache.commons.compress.archivers.d.b.a(this.i, i2, 4);
                n3 = (int)org.apache.commons.compress.archivers.d.b.a(this.i, i2 + 4, 2);
                byte by2 = this.i[i2 + 6];
                String string = org.apache.commons.compress.archivers.d.a.a(this.p, this.i, i2 + 8, this.i[i2 + 7]);
                if (".".equals(string) || "..".equals(string)) continue;
                org.apache.commons.compress.archivers.d.a entry2 = new org.apache.commons.compress.archivers.d.a(n4, e2.a(), by2, string);
                this.m.put(n4, entry2);
                for (Map.Entry<Integer, e> entry : this.n.entrySet()) {
                    string = this.b(entry.getValue());
                    if (string == null) continue;
                    entry.getValue().b(string);
                    entry.getValue().a(this.m.get(entry.getKey()).c());
                    this.o.add(entry.getValue());
                }
                for (e e3 : this.o) {
                    this.n.remove(e3.a());
                }
            }
            byte[] byArray = this.l.a();
            if (!org.apache.commons.compress.archivers.d.a.a(byArray)) {
                throw new m();
            }
            e2 = org.apache.commons.compress.archivers.d.e.a(byArray);
            n2 = 0;
            l2 -= 1024L;
        }
    }

    private String b(e e2) {
        Stack<String> stack = new Stack<String>();
        int n2 = e2.a();
        while (true) {
            if (!this.m.containsKey(n2)) {
                stack.clear();
                break;
            }
            org.apache.commons.compress.archivers.d.a a2 = this.m.get(n2);
            stack.push(a2.c());
            if (a2.a() == a2.b()) break;
            n2 = a2.b();
        }
        if (stack.isEmpty()) {
            this.n.put(e2.a(), e2);
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder((String)stack.pop());
        while (!stack.isEmpty()) {
            stringBuilder.append('/');
            stringBuilder.append((String)stack.pop());
        }
        return stringBuilder.toString();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = 0;
        if (this.d || this.c || this.f >= this.e) {
            return -1;
        }
        if (this.b == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if ((long)n3 + this.f > this.e) {
            n3 = (int)(this.e - this.f);
        }
        while (n3 > 0) {
            int n5;
            int n6 = n5 = n3 > 1024 - this.j ? 1024 - this.j : n3;
            if (this.j + n5 <= 1024) {
                System.arraycopy(this.h, this.j, byArray, n2, n5);
                n4 += n5;
                this.j += n5;
                n3 -= n5;
                n2 += n5;
            }
            if (n3 <= 0) continue;
            if (this.g >= 512) {
                byte[] byArray2 = this.l.b();
                if (!org.apache.commons.compress.archivers.d.a.a(byArray2)) {
                    throw new m();
                }
                this.b = org.apache.commons.compress.archivers.d.e.a(byArray2);
                this.g = 0;
            }
            if (!this.b.a(this.g++)) {
                if (this.l.read(this.h, 0, 1024) != 1024) {
                    throw new EOFException();
                }
            } else {
                Arrays.fill(this.h, (byte)0);
            }
            this.j = 0;
        }
        this.f += (long)n4;
        return n4;
    }

    @Override
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.l.close();
        }
    }

    public static boolean a(byte[] byArray, int n2) {
        if (n2 < 32) {
            return false;
        }
        if (n2 >= 1024) {
            return org.apache.commons.compress.archivers.d.a.a(byArray);
        }
        return 60012 == (int)org.apache.commons.compress.archivers.d.b.a(byArray, 24, 4);
    }

    @Override
    public final /* synthetic */ a a() {
        j j2 = this;
        Object object = null;
        String string = null;
        if (!j2.o.isEmpty()) {
            return j2.o.remove();
        }
        while (object == null) {
            if (j2.d) {
                return null;
            }
            while (j2.g < j2.b.c()) {
                if (j2.b.a(j2.g++) || j2.l.skip(1024L) != -1L) continue;
                throw new EOFException();
            }
            j2.g = 0;
            j2.k = j2.l.c();
            byte[] byArray = j2.l.b();
            object = byArray;
            if (!org.apache.commons.compress.archivers.d.a.a(byArray)) {
                throw new m();
            }
            j2.b = org.apache.commons.compress.archivers.d.e.a((byte[])object);
            while (org.apache.commons.compress.archivers.d.d.c == j2.b.b()) {
                if (j2.l.skip(1024L * (long)(j2.b.c() - j2.b.d())) == -1L) {
                    throw new EOFException();
                }
                j2.k = j2.l.c();
                byte[] byArray2 = j2.l.b();
                object = byArray2;
                if (!org.apache.commons.compress.archivers.d.a.a(byArray2)) {
                    throw new m();
                }
                j2.b = org.apache.commons.compress.archivers.d.e.a((byte[])object);
            }
            if (org.apache.commons.compress.archivers.d.d.d == j2.b.b()) {
                j2.d = true;
                return null;
            }
            object = j2.b;
            if (((e)object).f()) {
                j j3 = j2;
                j3.a(j3.b);
                j2.f = 0L;
                j2.e = 0L;
                j2.g = j2.b.c();
            } else {
                j2.f = 0L;
                j2.e = j2.b.g();
                j2.g = 0;
            }
            j2.j = 1024;
            string = j2.b((e)object);
            if (string != null) continue;
            object = null;
        }
        ((e)object).b(string);
        ((e)object).a(j2.m.get(((e)object).a()).c());
        ((e)object).a(j2.k);
        return object;
    }
}

