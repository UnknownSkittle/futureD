/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;

public class ae
implements Serializable,
Cloneable,
au {
    private static final ax a = new ax(21589);
    private byte b;
    private boolean c;
    private boolean d;
    private boolean e;
    private av f;
    private av g;
    private av h;

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(1 + (this.c ? 4 : 0) + (this.d && this.g != null ? 4 : 0) + (this.e && this.h != null ? 4 : 0));
    }

    @Override
    public final ax d() {
        return new ax(1 + (this.c ? 4 : 0));
    }

    @Override
    public final byte[] e() {
        byte[] byArray = new byte[this.f().b()];
        int n2 = 0;
        ++n2;
        byArray[0] = 0;
        if (this.c) {
            byArray[0] = (byte)(byArray[0] | 1);
            System.arraycopy(this.f.a(), 0, byArray, 1, 4);
            n2 += 4;
        }
        if (this.d && this.g != null) {
            byArray[0] = (byte)(byArray[0] | 2);
            System.arraycopy(this.g.a(), 0, byArray, n2, 4);
            n2 += 4;
        }
        if (this.e && this.h != null) {
            byArray[0] = (byte)(byArray[0] | 4);
            System.arraycopy(this.h.a(), 0, byArray, n2, 4);
        }
        return byArray;
    }

    @Override
    public final byte[] c() {
        byte[] byArray = new byte[this.d().b()];
        System.arraycopy(this.e(), 0, byArray, 0, byArray.length);
        return byArray;
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        ae ae2 = this;
        ae2.a((byte)0);
        ae2.f = null;
        ae2.g = null;
        ae2.h = null;
        n3 = n2 + n3;
        this.a(byArray[n2++]);
        if (this.c) {
            this.f = new av(byArray, n2);
            n2 += 4;
        }
        if (this.d && n2 + 4 <= n3) {
            this.g = new av(byArray, n2);
            n2 += 4;
        }
        if (this.e && n2 + 4 <= n3) {
            this.h = new av(byArray, n2);
        }
    }

    private void a(byte by2) {
        this.b = by2;
        this.c = (by2 & 1) == 1;
        this.d = (by2 & 2) == 2;
        this.e = (by2 & 4) == 4;
    }

    public String toString() {
        Date date;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x5455 Zip Extra Field: Flags=");
        stringBuilder.append(Integer.toBinaryString(ay.a((int)this.b))).append(" ");
        if (this.c && this.f != null) {
            date = ae.a(this.f);
            stringBuilder.append(" Modify:[").append(date).append("] ");
        }
        if (this.d && this.g != null) {
            date = ae.a(this.g);
            stringBuilder.append(" Access:[").append(date).append("] ");
        }
        if (this.e && this.h != null) {
            date = ae.a(this.h);
            stringBuilder.append(" Create:[").append(date).append("] ");
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof ae) {
            object = (ae)object;
            return (this.b & 7) == (((ae)object).b & 7) && (this.f == ((ae)object).f || this.f != null && this.f.equals(((ae)object).f)) && (this.g == ((ae)object).g || this.g != null && this.g.equals(((ae)object).g)) && (this.h == ((ae)object).h || this.h != null && this.h.equals(((ae)object).h));
        }
        return false;
    }

    public int hashCode() {
        int n2 = -123 * (this.b & 7);
        if (this.f != null) {
            n2 ^= this.f.hashCode();
        }
        if (this.g != null) {
            n2 ^= Integer.rotateLeft(this.g.hashCode(), 11);
        }
        if (this.h != null) {
            n2 ^= Integer.rotateLeft(this.h.hashCode(), 22);
        }
        return n2;
    }

    private static Date a(av av2) {
        if (av2 != null) {
            return new Date((long)av2.c() * 1000L);
        }
        return null;
    }
}

