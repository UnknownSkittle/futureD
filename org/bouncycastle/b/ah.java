/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.aj;
import org.bouncycastle.b.b.d;
import org.bouncycastle.b.b.k;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.v;
import org.bouncycastle.e.a;

public final class ah
extends i {
    private int a;
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private v[] g;
    private byte[] h;
    private ai[] i;
    private ai[] j;
    private byte[] k;

    ah(c object) {
        int n2;
        Object object2;
        Object object3;
        this.a = ((c)object).read();
        if (this.a == 3 || this.a == 2) {
            ((c)object).read();
            this.b = ((c)object).read();
            this.c = ((long)((c)object).read() << 24 | (long)(((c)object).read() << 16) | (long)(((c)object).read() << 8) | (long)((c)object).read()) * 1000L;
            this.d |= (long)((c)object).read() << 56;
            this.d |= (long)((c)object).read() << 48;
            this.d |= (long)((c)object).read() << 40;
            this.d |= (long)((c)object).read() << 32;
            this.d |= (long)((c)object).read() << 24;
            this.d |= (long)((c)object).read() << 16;
            this.d |= (long)((c)object).read() << 8;
            this.d |= (long)((c)object).read();
            this.e = ((c)object).read();
            this.f = ((c)object).read();
        } else if (this.a == 4) {
            ai ai2;
            ai ai3;
            this.b = ((c)object).read();
            this.e = ((c)object).read();
            this.f = ((c)object).read();
            object3 = new byte[((c)object).read() << 8 | ((c)object).read()];
            ((c)object).a((byte[])object3);
            object3 = new aj(new ByteArrayInputStream((byte[])object3));
            object2 = new Vector<ai>();
            while ((ai3 = ((aj)object3).a()) != null) {
                ((Vector)object2).addElement(ai3);
            }
            this.i = new ai[((Vector)object2).size()];
            for (int i2 = 0; i2 != this.i.length; ++i2) {
                object3 = (ai)((Vector)object2).elementAt(i2);
                if (object3 instanceof d) {
                    this.d = ((d)object3).b();
                } else if (object3 instanceof k) {
                    this.c = ((k)object3).b().getTime();
                }
                this.i[i2] = object3;
            }
            object3 = new byte[((c)object).read() << 8 | ((c)object).read()];
            ((c)object).a((byte[])object3);
            object3 = new aj(new ByteArrayInputStream((byte[])object3));
            ((Vector)object2).removeAllElements();
            while ((ai2 = ((aj)object3).a()) != null) {
                ((Vector)object2).addElement(ai2);
            }
            this.j = new ai[((Vector)object2).size()];
            for (n2 = 0; n2 != this.j.length; ++n2) {
                object3 = (ai)((Vector)object2).elementAt(n2);
                if (object3 instanceof d) {
                    this.d = ((d)object3).b();
                }
                this.j[n2] = object3;
            }
        } else {
            throw new RuntimeException("unsupported version: " + this.a);
        }
        this.h = new byte[2];
        ((c)object).a(this.h);
        switch (this.e) {
            case 1: 
            case 3: {
                object3 = new v((c)object);
                this.g = new v[1];
                this.g[0] = object3;
                return;
            }
            case 17: {
                object3 = new v((c)object);
                v v2 = new v((c)object);
                this.g = new v[2];
                this.g[0] = object3;
                this.g[1] = v2;
                return;
            }
            case 16: 
            case 20: {
                object3 = new v((c)object);
                object2 = new v((c)object);
                v v3 = new v((c)object);
                this.g = new v[3];
                this.g[0] = object3;
                this.g[1] = object2;
                this.g[2] = v3;
                return;
            }
            case 19: {
                object3 = new v((c)object);
                v v4 = new v((c)object);
                this.g = new v[2];
                this.g[0] = object3;
                this.g[1] = v4;
                return;
            }
            case 22: {
                object3 = new v((c)object);
                object = new v((c)object);
                this.g = new v[2];
                this.g[0] = object3;
                this.g[1] = object;
                return;
            }
        }
        if (this.e >= 100 && this.e <= 110) {
            this.g = null;
            object3 = new ByteArrayOutputStream();
            while ((n2 = ((c)object).read()) >= 0) {
                ((ByteArrayOutputStream)object3).write(n2);
            }
            this.k = ((ByteArrayOutputStream)object3).toByteArray();
            return;
        }
        throw new IOException("unknown signature key algorithm: " + this.e);
    }

    public ah(int n2, long l2, int n3, int n4, ai[] aiArray, ai[] aiArray2, byte[] byArray, v[] vArray) {
        this(n2, l2, n3, n4, aiArray, aiArray2, byArray, vArray, 0);
    }

    private ah(int n2, long l2, int n3, int n4, ai[] aiArray, ai[] aiArray2, byte[] byArray, v[] vArray, byte by2) {
        this.a = 4;
        this.b = n2;
        this.d = l2;
        this.e = n3;
        this.f = n4;
        this.i = aiArray;
        this.j = aiArray2;
        this.h = byArray;
        this.g = vArray;
        if (aiArray != null) {
            ah ah2 = this;
            for (n2 = 0; n2 != ah2.i.length; ++n2) {
                if (!(ah2.i[n2] instanceof k)) continue;
                ah2.c = ((k)ah2.i[n2]).b().getTime();
                return;
            }
        }
    }

    public final int a() {
        return this.b;
    }

    public final long b() {
        return this.d;
    }

    public final byte[] c() {
        Object[] objectArray;
        if (this.a == 3 || this.a == 2) {
            objectArray = new byte[5];
            long l2 = this.c / 1000L;
            objectArray[0] = (byte)this.b;
            objectArray[1] = (byte)(l2 >> 24);
            objectArray[2] = (byte)(l2 >> 16);
            objectArray[3] = (byte)(l2 >> 8);
            objectArray[4] = (byte)l2;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write((byte)this.a);
                byteArrayOutputStream.write((byte)this.b);
                byteArrayOutputStream.write((byte)this.e);
                byteArrayOutputStream.write((byte)this.f);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                objectArray = this.i;
                for (int i2 = 0; i2 != objectArray.length; ++i2) {
                    objectArray[i2].a(byteArrayOutputStream2);
                }
                byte[] byArray = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream.write((byte)(byArray.length >> 8));
                byteArrayOutputStream.write((byte)byArray.length);
                byteArrayOutputStream.write(byArray);
                objectArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.write((byte)this.a);
                byteArrayOutputStream.write(-1);
                byteArrayOutputStream.write((byte)(objectArray.length >> 24));
                byteArrayOutputStream.write((byte)(objectArray.length >> 16));
                byteArrayOutputStream.write((byte)(objectArray.length >> 8));
                byteArrayOutputStream.write((byte)objectArray.length);
            } catch (IOException iOException) {
                throw new RuntimeException("exception generating trailer: ".concat(String.valueOf(iOException)));
            }
            objectArray = byteArrayOutputStream.toByteArray();
        }
        return objectArray;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final v[] f() {
        return this.g;
    }

    public final byte[] g() {
        if (this.k == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g g2 = new g(byteArrayOutputStream);
            for (int i2 = 0; i2 != this.g.length; ++i2) {
                try {
                    v v2 = this.g[i2];
                    g g3 = g2;
                    ((f)v2).a(g3);
                    continue;
                } catch (IOException iOException) {
                    throw new RuntimeException("internal error: ".concat(String.valueOf(iOException)));
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        return org.bouncycastle.e.a.d(this.k);
    }

    public final ai[] h() {
        return this.i;
    }

    public final void a(g g2) {
        Object object;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g g3 = new g(byteArrayOutputStream);
        g3.write(this.a);
        if (this.a == 3 || this.a == 2) {
            g3.write(5);
            long l2 = this.c / 1000L;
            g3.write(this.b);
            g3.write((byte)(l2 >> 24));
            g3.write((byte)(l2 >> 16));
            g3.write((byte)(l2 >> 8));
            g3.write((byte)l2);
            g3.write((byte)(this.d >> 56));
            g3.write((byte)(this.d >> 48));
            g3.write((byte)(this.d >> 40));
            g3.write((byte)(this.d >> 32));
            g3.write((byte)(this.d >> 24));
            g3.write((byte)(this.d >> 16));
            g3.write((byte)(this.d >> 8));
            g3.write((byte)this.d);
            g3.write(this.e);
            g3.write(this.f);
        } else if (this.a == 4) {
            g3.write(this.b);
            g3.write(this.e);
            g3.write(this.f);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i2 = 0; i2 != this.i.length; ++i2) {
                this.i[i2].a(byteArrayOutputStream2);
            }
            byte[] byArray = byteArrayOutputStream2.toByteArray();
            g3.write(byArray.length >> 8);
            g3.write(byArray.length);
            g3.write(byArray);
            byteArrayOutputStream2.reset();
            for (int i3 = 0; i3 != this.j.length; ++i3) {
                this.j[i3].a(byteArrayOutputStream2);
            }
            object = byteArrayOutputStream2.toByteArray();
            g3.write(((byte[])object).length >> 8);
            g3.write(((byte[])object).length);
            g3.write((byte[])object);
        } else {
            throw new IOException("unknown version: " + this.a);
        }
        g3.write(this.h);
        if (this.g != null) {
            for (int i4 = 0; i4 != this.g.length; ++i4) {
                v v2 = this.g[i4];
                object = g3;
                ((f)v2).a((g)object);
            }
        } else {
            g3.write(this.k);
        }
        g3.close();
        g2.a(2, byteArrayOutputStream.toByteArray(), true);
    }
}

