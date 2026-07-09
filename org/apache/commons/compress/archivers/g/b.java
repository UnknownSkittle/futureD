/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;

public class b
implements Cloneable,
au {
    private static final ax a = new ax(30062);
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private String e = "";
    private boolean f = false;
    private CRC32 g = new CRC32();

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(14 + this.e.getBytes().length);
    }

    @Override
    public final ax d() {
        return this.f();
    }

    @Override
    public final byte[] e() {
        byte[] byArray = new byte[this.f().b() - 4];
        System.arraycopy(ax.a(this.b), 0, byArray, 0, 2);
        byte[] byArray2 = this.e.getBytes();
        System.arraycopy(av.a(byArray2.length), 0, byArray, 2, 4);
        System.arraycopy(ax.a(this.c), 0, byArray, 6, 2);
        System.arraycopy(ax.a(this.d), 0, byArray, 8, 2);
        System.arraycopy(byArray2, 0, byArray, 10, byArray2.length);
        this.g.reset();
        this.g.update(byArray);
        long l2 = this.g.getValue();
        byArray2 = new byte[byArray.length + 4];
        System.arraycopy(av.a(l2), 0, byArray2, 0, 4);
        System.arraycopy(byArray, 0, byArray2, 4, byArray.length);
        return byArray2;
    }

    @Override
    public final byte[] c() {
        return this.e();
    }

    private boolean b() {
        return this.e.length() != 0;
    }

    private boolean g() {
        return this.f && !this.b();
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        long l2 = av.b(byArray, n2);
        byte[] byArray2 = new byte[n3 - 4];
        System.arraycopy(byArray, n2 + 4, byArray2, 0, n3 - 4);
        this.g.reset();
        this.g.update(byArray2);
        long l3 = this.g.getValue();
        if (l2 != l3) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(l2) + " instead of " + Long.toHexString(l3));
        }
        int n4 = ax.a(byArray2, 0);
        Object object = new byte[(int)av.b(byArray2, 2)];
        this.c = ax.a(byArray2, 6);
        this.d = ax.a(byArray2, 8);
        if (((byte[])object).length == 0) {
            this.e = "";
        } else {
            System.arraycopy(byArray2, 10, object, 0, ((byte[])object).length);
            this.e = new String((byte[])object);
        }
        n3 = (n4 & 0x4000) != 0 ? 1 : 0;
        object = this;
        this.f = n3;
        ((b)object).b = super.a(((b)object).b);
        n3 = n4;
        this.b = this.a(n3);
    }

    private int a(int n2) {
        int n3 = 32768;
        if (this.b()) {
            n3 = 40960;
        } else if (this.g()) {
            n3 = 16384;
        }
        return n3 | n2 & 0xFFF;
    }

    public Object clone() {
        try {
            b b2 = (b)super.clone();
            ((b)super.clone()).g = new CRC32();
            return b2;
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }
}

