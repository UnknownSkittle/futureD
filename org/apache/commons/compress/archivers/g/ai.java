/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.g.aj;
import org.apache.commons.compress.archivers.g.ak;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.h;
import org.apache.commons.compress.archivers.g.i;
import org.apache.commons.compress.archivers.g.j;
import org.apache.commons.compress.archivers.g.t;

public class ai
extends ZipEntry
implements a {
    private static final byte[] a = new byte[0];
    private int b = -1;
    private long c = -1L;
    private int d = 0;
    private int e = 0;
    private long f = 0L;
    private int g = 0;
    private au[] h;
    private t i = null;
    private String j = null;
    private byte[] k = null;
    private j l = new j();
    private static final au[] m = new au[0];
    private long n = -1L;
    private long o = -1L;
    private boolean p = false;
    private int q = ak.a;
    private int r = aj.a;

    private ai(String string) {
        super(string);
        this.a(string);
    }

    private ai(ZipEntry zipEntry) {
        super(zipEntry);
        this.a(zipEntry.getName());
        byte[] byArray = zipEntry.getExtra();
        if (byArray != null) {
            this.a(org.apache.commons.compress.archivers.g.h.a(byArray, org.apache.commons.compress.archivers.g.i.a));
        } else {
            this.d();
        }
        this.setMethod(zipEntry.getMethod());
        this.c = zipEntry.getSize();
    }

    public ai(ai cloneable) {
        this((ZipEntry)cloneable);
        this.d = ((ai)cloneable).d;
        this.f = ((ai)cloneable).f;
        ai ai2 = this;
        ai2.a(ai2.h());
        this.e = ((ai)cloneable).e;
        cloneable = ((ai)cloneable).l;
        this.l = cloneable == null ? null : (j)((j)cloneable).clone();
    }

    protected ai() {
        this("");
    }

    @Override
    public Object clone() {
        ai ai2 = (ai)super.clone();
        ((ai)super.clone()).d = this.d;
        ai2.f = this.f;
        ai2.a(this.h());
        return ai2;
    }

    @Override
    public int getMethod() {
        return this.b;
    }

    @Override
    public void setMethod(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: ".concat(String.valueOf(n2)));
        }
        this.b = n2;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.f;
    }

    public final int c() {
        return this.e;
    }

    protected final void a(int n2) {
        this.e = n2;
    }

    private void a(au[] auArray) {
        ArrayList<au> arrayList = new ArrayList<au>();
        for (au au2 : auArray) {
            if (au2 instanceof t) {
                this.i = (t)au2;
                continue;
            }
            arrayList.add(au2);
        }
        ArrayList<au> arrayList2 = arrayList;
        this.h = arrayList2.toArray(new au[arrayList2.size()]);
        this.d();
    }

    private au[] h() {
        if (this.h == null) {
            return this.j();
        }
        if (this.i != null) {
            return this.i();
        }
        return this.h;
    }

    private static au[] a(au[] auArray, int n2) {
        au[] auArray2 = new au[n2];
        System.arraycopy(auArray, 0, auArray2, 0, Math.min(auArray.length, n2));
        return auArray2;
    }

    private au[] i() {
        au[] auArray = ai.a(this.h, this.h.length + 1);
        au[] auArray2 = auArray;
        auArray[this.h.length] = this.i;
        return auArray2;
    }

    private au[] j() {
        if (this.i == null) {
            return m;
        }
        return new au[]{this.i};
    }

    public final void a(au au2) {
        if (this.a(au2.a()) != null) {
            this.b(au2.a());
        }
        au[] auArray = this.h;
        int n2 = this.h != null ? this.h.length + 1 : 1;
        this.h = new au[n2];
        this.h[0] = au2;
        if (auArray != null) {
            System.arraycopy(auArray, 0, this.h, 1, this.h.length - 1);
        }
        this.d();
    }

    private void b(ax ax2) {
        if (this.h == null) {
            throw new NoSuchElementException();
        }
        ArrayList<au> arrayList = new ArrayList<au>();
        au[] auArray = this.h;
        int n2 = this.h.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            au au2 = auArray[i2];
            if (ax2.equals(au2.a())) continue;
            arrayList.add(au2);
        }
        if (this.h.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        ArrayList<au> arrayList2 = arrayList;
        this.h = arrayList2.toArray(new au[arrayList2.size()]);
        this.d();
    }

    public final au a(ax ax2) {
        if (this.h != null) {
            au[] auArray = this.h;
            int n2 = this.h.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                au au2 = auArray[i2];
                if (!ax2.equals(au2.a())) continue;
                return au2;
            }
        }
        return null;
    }

    @Override
    public void setExtra(byte[] object) {
        try {
            object = org.apache.commons.compress.archivers.g.h.a((byte[])object, org.apache.commons.compress.archivers.g.i.a);
            ai ai2 = this;
            Object[] objectArray = object;
            object = ai2;
            if (ai2.h == null) {
                super.a((au[])objectArray);
                return;
            }
            int n2 = objectArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object2 = objectArray[i2];
                Object object3 = object2 instanceof t ? ((ai)object).i : ((ai)object).a(object2.a());
                if (object3 == null) {
                    object3 = object2;
                    object2 = object;
                    if (object3 instanceof t) {
                        object2.i = (t)object3;
                    } else if (object2.h == null) {
                        object2.h = new au[]{object3};
                    } else {
                        if (object2.a(object3.a()) != null) {
                            super.b(object3.a());
                        }
                        au[] auArray = ai.a(object2.h, object2.h.length + 1);
                        au[] auArray2 = auArray;
                        auArray[auArray.length - 1] = object3;
                        object2.h = auArray2;
                    }
                    object2.d();
                    continue;
                }
                object2 = object2.e();
                object3.a((byte[])object2, 0, ((byte)object2).length);
            }
            ((ai)object).d();
            return;
        } catch (ZipException zipException) {
            throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + zipException.getMessage(), zipException);
        }
    }

    protected final void d() {
        ai ai2 = this;
        super.setExtra(org.apache.commons.compress.archivers.g.h.a(ai2.h()));
    }

    private byte[] k() {
        byte[] byArray = this.getExtra();
        if (byArray != null) {
            return byArray;
        }
        return a;
    }

    public final byte[] e() {
        return org.apache.commons.compress.archivers.g.h.b(this.h());
    }

    @Override
    public String getName() {
        if (this.j == null) {
            return super.getName();
        }
        return this.j;
    }

    @Override
    public boolean isDirectory() {
        return this.getName().endsWith("/");
    }

    protected final void a(String string) {
        if (string != null && this.e == 0 && !string.contains("/")) {
            string = string.replace('\\', '/');
        }
        this.j = string;
    }

    @Override
    public long getSize() {
        return this.c;
    }

    @Override
    public void setSize(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("invalid entry size");
        }
        this.c = l2;
    }

    protected final void a(String string, byte[] byArray) {
        this.a(string);
        this.k = byArray;
    }

    protected final void a(long l2) {
        this.n = l2;
    }

    protected final void b(long l2) {
        this.o = l2;
    }

    protected final void f() {
        this.p = true;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    public final j g() {
        return this.l;
    }

    public final void a(j j2) {
        this.l = j2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (ai)object;
        String string = this.getName();
        String string2 = ((ai)object).getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        string = this.getComment();
        string2 = ((ZipEntry)object).getComment();
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        return this.getTime() == ((ZipEntry)object).getTime() && string.equals(string2) && this.d == ((ai)object).d && this.e == ((ai)object).e && this.f == ((ai)object).f && this.getMethod() == ((ai)object).getMethod() && this.getSize() == ((ai)object).getSize() && this.getCrc() == ((ZipEntry)object).getCrc() && this.getCompressedSize() == ((ZipEntry)object).getCompressedSize() && Arrays.equals(org.apache.commons.compress.archivers.g.h.b(this.h()), org.apache.commons.compress.archivers.g.h.b(super.h())) && Arrays.equals(this.k(), super.k()) && this.n == ((ai)object).n && this.o == ((ai)object).o && this.l.equals(((ai)object).l);
    }

    public final void b(int n2) {
        this.q = n2;
    }
}

