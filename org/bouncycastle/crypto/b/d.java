/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.b;

import org.bouncycastle.crypto.b.a;
import org.bouncycastle.e.f;

public final class d
extends a {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e = new int[16];
    private int f;

    public d() {
        this.c();
    }

    private d(d d2) {
        super(d2);
        this.a(d2);
    }

    private void a(d d2) {
        super.a(d2);
        this.a = d2.a;
        this.b = d2.b;
        this.c = d2.c;
        this.d = d2.d;
        System.arraycopy(d2.e, 0, this.e, 0, d2.e.length);
        this.f = d2.f;
    }

    public final String a() {
        return "MD5";
    }

    public final int b() {
        return 16;
    }

    protected final void b(byte[] byArray, int n2) {
        this.e[this.f++] = byArray[n2] & 0xFF | (byArray[n2 + 1] & 0xFF) << 8 | (byArray[n2 + 2] & 0xFF) << 16 | (byArray[n2 + 3] & 0xFF) << 24;
        if (this.f == 16) {
            this.f();
        }
    }

    protected final void a(long l2) {
        if (this.f > 14) {
            this.f();
        }
        this.e[14] = (int)l2;
        this.e[15] = (int)(l2 >>> 32);
    }

    private static void a(int n2, byte[] byArray, int n3) {
        byArray[n3] = (byte)n2;
        byArray[n3 + 1] = (byte)(n2 >>> 8);
        byArray[n3 + 2] = (byte)(n2 >>> 16);
        byArray[n3 + 3] = (byte)(n2 >>> 24);
    }

    public final int a(byte[] byArray, int n2) {
        this.e();
        org.bouncycastle.crypto.b.d.a(this.a, byArray, n2);
        org.bouncycastle.crypto.b.d.a(this.b, byArray, n2 + 4);
        org.bouncycastle.crypto.b.d.a(this.c, byArray, n2 + 8);
        org.bouncycastle.crypto.b.d.a(this.d, byArray, n2 + 12);
        this.c();
        return 16;
    }

    public final void c() {
        super.c();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.f = 0;
        for (int i2 = 0; i2 != this.e.length; ++i2) {
            this.e[i2] = 0;
        }
    }

    private static int a(int n2, int n3) {
        return n2 << n3 | n2 >>> 32 - n3;
    }

    private static int a(int n2, int n3, int n4) {
        return n2 & n3 | ~n2 & n4;
    }

    private static int b(int n2, int n3, int n4) {
        return n2 & n4 | n3 & ~n4;
    }

    protected final void f() {
        int n2 = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n5 = this.d;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.a(n3, n4, n5) + this.e[0] + -680876936, 7) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.a(n2, n3, n4) + this.e[1] + -389564586, 12) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.a(n5, n2, n3) + this.e[2] + 606105819, 17) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.a(n4, n5, n2) + this.e[3] + -1044525330, 22) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.a(n3, n4, n5) + this.e[4] + -176418897, 7) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.a(n2, n3, n4) + this.e[5] + 1200080426, 12) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.a(n5, n2, n3) + this.e[6] + -1473231341, 17) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.a(n4, n5, n2) + this.e[7] + -45705983, 22) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.a(n3, n4, n5) + this.e[8] + 1770035416, 7) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.a(n2, n3, n4) + this.e[9] + -1958414417, 12) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.a(n5, n2, n3) + this.e[10] + -42063, 17) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.a(n4, n5, n2) + this.e[11] + -1990404162, 22) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.a(n3, n4, n5) + this.e[12] + 1804603682, 7) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.a(n2, n3, n4) + this.e[13] + -40341101, 12) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.a(n5, n2, n3) + this.e[14] + -1502002290, 17) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.a(n4, n5, n2) + this.e[15] + 1236535329, 22) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.b(n3, n4, n5) + this.e[1] + -165796510, 5) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.b(n2, n3, n4) + this.e[6] + -1069501632, 9) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.b(n5, n2, n3) + this.e[11] + 643717713, 14) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.b(n4, n5, n2) + this.e[0] + -373897302, 20) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.b(n3, n4, n5) + this.e[5] + -701558691, 5) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.b(n2, n3, n4) + this.e[10] + 38016083, 9) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.b(n5, n2, n3) + this.e[15] + -660478335, 14) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.b(n4, n5, n2) + this.e[4] + -405537848, 20) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.b(n3, n4, n5) + this.e[9] + 568446438, 5) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.b(n2, n3, n4) + this.e[14] + -1019803690, 9) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.b(n5, n2, n3) + this.e[3] + -187363961, 14) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.b(n4, n5, n2) + this.e[8] + 1163531501, 20) + n4;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + org.bouncycastle.crypto.b.d.b(n3, n4, n5) + this.e[13] + -1444681467, 5) + n3;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + org.bouncycastle.crypto.b.d.b(n2, n3, n4) + this.e[2] + -51403784, 9) + n2;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + org.bouncycastle.crypto.b.d.b(n5, n2, n3) + this.e[7] + 1735328473, 14) + n5;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + org.bouncycastle.crypto.b.d.b(n4, n5, n2) + this.e[12] + -1926607734, 20) + n4;
        int n6 = n5;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n3 ^ n4 ^ n6) + this.e[5] + -378558, 4) + n3;
        n6 = n4;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n2 ^ n3 ^ n6) + this.e[8] + -2022574463, 11) + n2;
        n6 = n3;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n5 ^ n2 ^ n6) + this.e[11] + 1839030562, 16) + n5;
        n6 = n2;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n4 ^ n5 ^ n6) + this.e[14] + -35309556, 23) + n4;
        n6 = n5;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n3 ^ n4 ^ n6) + this.e[1] + -1530992060, 4) + n3;
        n6 = n4;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n2 ^ n3 ^ n6) + this.e[4] + 1272893353, 11) + n2;
        n6 = n3;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n5 ^ n2 ^ n6) + this.e[7] + -155497632, 16) + n5;
        n6 = n2;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n4 ^ n5 ^ n6) + this.e[10] + -1094730640, 23) + n4;
        n6 = n5;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n3 ^ n4 ^ n6) + this.e[13] + 681279174, 4) + n3;
        n6 = n4;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n2 ^ n3 ^ n6) + this.e[0] + -358537222, 11) + n2;
        n6 = n3;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n5 ^ n2 ^ n6) + this.e[3] + -722521979, 16) + n5;
        n6 = n2;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n4 ^ n5 ^ n6) + this.e[6] + 76029189, 23) + n4;
        n6 = n5;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n3 ^ n4 ^ n6) + this.e[9] + -640364487, 4) + n3;
        n6 = n4;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n2 ^ n3 ^ n6) + this.e[12] + -421815835, 11) + n2;
        n6 = n3;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n5 ^ n2 ^ n6) + this.e[15] + 530742520, 16) + n5;
        n6 = n2;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n4 ^ n5 ^ n6) + this.e[2] + -995338651, 23) + n4;
        n6 = n5;
        int n7 = n4;
        int n8 = n3;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n7 ^ (n8 | ~n6)) + this.e[0] + -198630844, 6) + n3;
        n6 = n4;
        n7 = n3;
        n8 = n2;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n7 ^ (n8 | ~n6)) + this.e[7] + 1126891415, 10) + n2;
        n6 = n3;
        n7 = n2;
        n8 = n5;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n7 ^ (n8 | ~n6)) + this.e[14] + -1416354905, 15) + n5;
        n6 = n2;
        n7 = n5;
        n8 = n4;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n7 ^ (n8 | ~n6)) + this.e[5] + -57434055, 21) + n4;
        n6 = n5;
        n7 = n4;
        n8 = n3;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n7 ^ (n8 | ~n6)) + this.e[12] + 1700485571, 6) + n3;
        n6 = n4;
        n7 = n3;
        n8 = n2;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n7 ^ (n8 | ~n6)) + this.e[3] + -1894986606, 10) + n2;
        n6 = n3;
        n7 = n2;
        n8 = n5;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n7 ^ (n8 | ~n6)) + this.e[10] + -1051523, 15) + n5;
        n6 = n2;
        n7 = n5;
        n8 = n4;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n7 ^ (n8 | ~n6)) + this.e[1] + -2054922799, 21) + n4;
        n6 = n5;
        n7 = n4;
        n8 = n3;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n7 ^ (n8 | ~n6)) + this.e[8] + 1873313359, 6) + n3;
        n6 = n4;
        n7 = n3;
        n8 = n2;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n7 ^ (n8 | ~n6)) + this.e[15] + -30611744, 10) + n2;
        n6 = n3;
        n7 = n2;
        n8 = n5;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n7 ^ (n8 | ~n6)) + this.e[6] + -1560198380, 15) + n5;
        n6 = n2;
        n7 = n5;
        n8 = n4;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n7 ^ (n8 | ~n6)) + this.e[13] + 1309151649, 21) + n4;
        n6 = n5;
        n7 = n4;
        n8 = n3;
        n2 = org.bouncycastle.crypto.b.d.a(n2 + (n7 ^ (n8 | ~n6)) + this.e[4] + -145523070, 6) + n3;
        n6 = n4;
        n7 = n3;
        n8 = n2;
        n5 = org.bouncycastle.crypto.b.d.a(n5 + (n7 ^ (n8 | ~n6)) + this.e[11] + -1120210379, 10) + n2;
        n6 = n3;
        n7 = n2;
        n8 = n5;
        n4 = org.bouncycastle.crypto.b.d.a(n4 + (n7 ^ (n8 | ~n6)) + this.e[2] + 718787259, 15) + n5;
        n6 = n2;
        n7 = n5;
        n8 = n4;
        n3 = org.bouncycastle.crypto.b.d.a(n3 + (n7 ^ (n8 | ~n6)) + this.e[9] + -343485551, 21) + n4;
        this.a += n2;
        this.b += n3;
        this.c += n4;
        this.d += n5;
        this.f = 0;
        for (n2 = 0; n2 != this.e.length; ++n2) {
            this.e[n2] = 0;
        }
    }

    public final f g() {
        return new d(this);
    }

    public final void a(f f2) {
        f2 = (d)f2;
        this.a((d)f2);
    }
}

