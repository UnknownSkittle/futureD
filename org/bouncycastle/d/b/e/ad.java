/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.i.i;
import org.bouncycastle.d.b.e.ae;
import org.bouncycastle.e.a;

public final class ad
implements b {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private b e = null;
    private boolean f;

    public static int a(int n2) {
        int n3 = 0;
        while ((n2 >>= 1) != 0) {
            ++n3;
        }
        return n3;
    }

    public static byte[] a(long l2, int n2) {
        byte[] byArray = new byte[n2];
        --n2;
        while (n2 >= 0) {
            byArray[n2] = (byte)l2;
            l2 >>>= 8;
            --n2;
        }
        return byArray;
    }

    public static long a(byte[] byArray, int n2) {
        if (byArray == null) {
            throw new NullPointerException("in == null");
        }
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            l2 = l2 << 8 | (long)(byArray[i2] & 0xFF);
        }
        return l2;
    }

    public static byte[] a(byte[] byArray) {
        if (byArray == null) {
            throw new NullPointerException("in == null");
        }
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        return byArray2;
    }

    public static byte[][] a(byte[][] byArray) {
        if (ad.b(byArray)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] byArrayArray = new byte[byArray.length][];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArrayArray[i2] = new byte[byArray[i2].length];
            System.arraycopy(byArray[i2], 0, byArrayArray[i2], 0, byArray[i2].length);
        }
        return byArrayArray;
    }

    public static boolean b(byte[][] byArray) {
        if (byArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2] != null) continue;
            return true;
        }
        return false;
    }

    public static void a(byte[] byArray, byte[] byArray2, int n2) {
        if (byArray2 == null) {
            throw new NullPointerException("src == null");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (byArray2.length + n2 > byArray.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray[n2 + i2] = byArray2[i2];
        }
    }

    public static byte[] a(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException("src == null");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (n2 + n3 > byArray.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] byArray2 = new byte[n3];
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            byArray2[i2] = byArray[n2 + i2];
        }
        return byArray2;
    }

    public static boolean a(int n2, long l2) {
        if (l2 < 0L) {
            throw new IllegalStateException("index must not be negative");
        }
        return l2 < 1L << n2;
    }

    public static int b(long l2, int n2) {
        return (int)(l2 & (1L << n2) - 1L);
    }

    public static byte[] a(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static Object a(byte[] object, Class clazz) {
        object = new ByteArrayInputStream((byte[])object);
        ae ae2 = new ae(clazz, (InputStream)object);
        object = ae2;
        Object object2 = ae2.readObject();
        if (((ObjectInputStream)object).available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (clazz.isInstance(object2)) {
            return object2;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static int a(int n2, int n3) {
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            if ((n2 >> i2 & 1) != 0) continue;
            n4 = i2;
            break;
        }
        return n4;
    }

    public ad(b b2) {
        this.e = b2;
        this.d = b2.a();
        this.a = new byte[this.d];
        this.b = new byte[this.d];
        this.c = new byte[this.d];
    }

    public final void a(boolean bl2, e e2) {
        boolean bl3 = this.f;
        this.f = bl2;
        if (e2 instanceof i) {
            if ((null).length != this.d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(null, 0, this.a, 0, (null).length);
            this.b();
            if (bl3 != bl2) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            return;
        }
        this.b();
        if (e2 != null) {
            this.e.a(bl2, e2);
            return;
        }
        if (bl3 != bl2) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    public final int a() {
        return this.e.a();
    }

    public final int a(byte[] object, int n2, byte[] byArray, int n3) {
        if (this.f) {
            int n4;
            int n5 = n3;
            byte[] byArray2 = byArray;
            int n6 = n2;
            byte[] byArray3 = object;
            object = this;
            if (n6 + object.d > byArray3.length) {
                throw new org.bouncycastle.crypto.i("input buffer too short");
            }
            for (n4 = 0; n4 < object.d; ++n4) {
                int n7 = n4;
                object.b[n7] = (byte)(object.b[n7] ^ byArray3[n6 + n4]);
            }
            n4 = object.e.a(object.b, 0, byArray2, n5);
            System.arraycopy(byArray2, n5, object.b, 0, object.b.length);
            return n4;
        }
        int n8 = n3;
        byte[] byArray4 = byArray;
        int n9 = n2;
        byte[] byArray5 = object;
        object = this;
        if (n9 + object.d > byArray5.length) {
            throw new org.bouncycastle.crypto.i("input buffer too short");
        }
        System.arraycopy(byArray5, n9, object.c, 0, object.d);
        int n10 = object.e.a(byArray5, n9, byArray4, n8);
        for (int i2 = 0; i2 < object.d; ++i2) {
            int n11 = n8 + i2;
            byArray4[n11] = (byte)(byArray4[n11] ^ object.b[i2]);
        }
        byte[] byArray6 = object.b;
        object.b = object.c;
        object.c = byArray6;
        return n10;
    }

    public final void b() {
        System.arraycopy(this.a, 0, this.b, 0, this.a.length);
        org.bouncycastle.e.a.b(this.c);
        this.e.b();
    }
}

