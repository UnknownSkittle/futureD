/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.b.ai;
import org.bouncycastle.b.b.a;
import org.bouncycastle.b.b.b;
import org.bouncycastle.b.b.c;
import org.bouncycastle.b.b.d;
import org.bouncycastle.b.b.e;
import org.bouncycastle.b.b.f;
import org.bouncycastle.b.b.g;
import org.bouncycastle.b.b.h;
import org.bouncycastle.b.b.i;
import org.bouncycastle.b.b.j;
import org.bouncycastle.b.b.k;
import org.bouncycastle.b.b.l;
import org.bouncycastle.b.b.m;
import org.bouncycastle.b.b.n;
import org.bouncycastle.b.b.o;

public final class aj
extends InputStream {
    private InputStream a;

    public aj(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int available() {
        return this.a.available();
    }

    public final int read() {
        return this.a.read();
    }

    public final ai a() {
        int n2;
        int n3 = this.read();
        if (n3 < 0) {
            return null;
        }
        boolean bl2 = false;
        if (n3 >= 192) {
            if (n3 <= 223) {
                n3 = (n3 - 192 << 8) + this.a.read() + 192;
            } else if (n3 == 255) {
                bl2 = true;
                n3 = this.a.read() << 24 | this.a.read() << 16 | this.a.read() << 8 | this.a.read();
            } else {
                throw new IOException("unexpected length header");
            }
        }
        if ((n2 = this.a.read()) < 0) {
            throw new EOFException("unexpected EOF reading signature sub packet");
        }
        byte[] byArray = new byte[n3 - 1];
        int n4 = org.bouncycastle.e.b.a.a(this.a, byArray);
        boolean bl3 = (n2 & 0x80) != 0;
        n2 &= 0x7F;
        if (n4 != byArray.length) {
            switch (n2) {
                case 2: {
                    byArray = aj.a(byArray, 4, n4, "Signature Creation Time");
                    break;
                }
                case 16: {
                    byArray = aj.a(byArray, 8, n4, "Issuer");
                    break;
                }
                case 9: {
                    byArray = aj.a(byArray, 4, n4, "Signature Key Expiration Time");
                    break;
                }
                case 3: {
                    byArray = aj.a(byArray, 4, n4, "Signature Expiration Time");
                    break;
                }
                default: {
                    throw new EOFException("truncated subpacket data.");
                }
            }
        }
        switch (n2) {
            case 2: {
                return new k(bl3, bl2, byArray);
            }
            case 32: {
                return new a(bl3, bl2, byArray);
            }
            case 9: {
                return new e(bl3, bl2, byArray);
            }
            case 3: {
                return new l(bl3, bl2, byArray);
            }
            case 7: {
                return new i(bl3, bl2, byArray);
            }
            case 4: {
                return new b(bl3, bl2, byArray);
            }
            case 30: {
                return new c(bl3, bl2, byArray);
            }
            case 16: {
                return new d(bl3, bl2, byArray);
            }
            case 5: {
                return new o(bl3, bl2, byArray);
            }
            case 11: 
            case 21: 
            case 22: {
                return new a(n2, bl3, bl2, byArray);
            }
            case 27: {
                return new f(bl3, bl2, byArray);
            }
            case 25: {
                return new h(bl3, bl2, byArray);
            }
            case 28: {
                return new n(bl3, bl2, byArray);
            }
            case 20: {
                return new g(bl3, bl2, byArray);
            }
            case 29: {
                return new j(bl3, bl2, byArray);
            }
            case 31: {
                return new m(bl3, bl2, byArray);
            }
        }
        return new ai(n2, bl3, bl2, byArray);
    }

    private static byte[] a(byte[] byArray, int n2, int n3, String string) {
        if (n3 != n2) {
            throw new EOFException("truncated " + string + " subpacket data.");
        }
        return org.bouncycastle.e.a.b(byArray, n2);
    }
}

