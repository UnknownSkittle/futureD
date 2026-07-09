/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.Date;
import org.apache.commons.compress.archivers.g.ar;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;

public class y
implements au {
    private static final ax a = new ax(10);
    private static final ax b = new ax(1);
    private static final ax c = new ax(24);
    private ar d = ar.a;
    private ar e = ar.a;
    private ar f = ar.a;

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(32);
    }

    @Override
    public final ax d() {
        return this.f();
    }

    @Override
    public final byte[] e() {
        byte[] byArray = new byte[this.f().b()];
        System.arraycopy(b.a(), 0, byArray, 4, 2);
        System.arraycopy(c.a(), 0, byArray, 6, 2);
        System.arraycopy(this.d.a(), 0, byArray, 8, 8);
        System.arraycopy(this.e.a(), 0, byArray, 16, 8);
        System.arraycopy(this.f.a(), 0, byArray, 24, 8);
        return byArray;
    }

    @Override
    public final byte[] c() {
        return this.e();
    }

    @Override
    public final void a(byte[] object, int n2, int n3) {
        n3 = n2 + n3;
        n2 += 4;
        while (n2 + 4 <= n3) {
            ax ax2 = new ax((byte[])object, n2);
            n2 += 2;
            if (ax2.equals(b)) {
                ax ax3;
                int n4 = n3 - n2;
                n3 = n2;
                byte[] byArray = object;
                object = this;
                if (n4 >= 26 && c.equals(ax3 = new ax(byArray, n3))) {
                    object.d = new ar(byArray, n3 += 2);
                    object.e = new ar(byArray, n3 += 8);
                    object.f = new ar(byArray, n3 += 8);
                }
                return;
            }
            ax2 = new ax((byte[])object, n2);
            n2 += 2 + ax2.b();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x000A Zip Extra Field: Modify:[").append(y.a(this.d)).append("]  Access:[").append(y.a(this.e)).append("]  Create:[").append(y.a(this.f)).append("] ");
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object instanceof y) {
            object = (y)object;
            return (this.d == ((y)object).d || this.d != null && this.d.equals(((y)object).d)) && (this.e == ((y)object).e || this.e != null && this.e.equals(((y)object).e)) && (this.f == ((y)object).f || this.f != null && this.f.equals(((y)object).f));
        }
        return false;
    }

    public int hashCode() {
        int n2 = -123;
        if (this.d != null) {
            n2 = 0xFFFFFF85 ^ this.d.hashCode();
        }
        if (this.e != null) {
            n2 ^= Integer.rotateLeft(this.e.hashCode(), 11);
        }
        if (this.f != null) {
            n2 ^= Integer.rotateLeft(this.f.hashCode(), 22);
        }
        return n2;
    }

    private static Date a(ar ar2) {
        if (ar2 == null || ar.a.equals(ar2)) {
            return null;
        }
        long l2 = (ar2.b() + -116444736000000000L) / 10000L;
        return new Date(l2);
    }
}

