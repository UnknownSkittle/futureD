/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.b.aa;
import org.bouncycastle.b.ab;
import org.bouncycastle.b.af;
import org.bouncycastle.b.ag;
import org.bouncycastle.b.ah;
import org.bouncycastle.b.ak;
import org.bouncycastle.b.al;
import org.bouncycastle.b.am;
import org.bouncycastle.b.an;
import org.bouncycastle.b.ao;
import org.bouncycastle.b.ar;
import org.bouncycastle.b.d;
import org.bouncycastle.b.h;
import org.bouncycastle.b.s;
import org.bouncycastle.b.t;
import org.bouncycastle.b.u;
import org.bouncycastle.b.w;
import org.bouncycastle.b.x;
import org.bouncycastle.b.y;
import org.bouncycastle.b.z;
import org.bouncycastle.e.b.a;
import org.bouncycastle.math.ec.a.c.bo;

public final class c
extends InputStream {
    private InputStream a;
    private boolean b = false;
    private int c;

    public c(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int available() {
        return this.a.available();
    }

    public final int read() {
        if (this.b) {
            this.b = false;
            return this.c;
        }
        return this.a.read();
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        if (!this.b) {
            return this.a.read(byArray, n2, n3);
        }
        if (this.c < 0) {
            return -1;
        }
        byArray[n2] = (byte)this.c;
        this.b = false;
        return 1;
    }

    public final void a(byte[] byArray, int n2, int n3) {
        if (org.bouncycastle.e.b.a.a(this, byArray, n2, n3) < n3) {
            throw new EOFException();
        }
    }

    public final void a(byte[] byArray) {
        this.a(byArray, 0, byArray.length);
    }

    public final int a() {
        if (!this.b) {
            try {
                this.c = this.a.read();
            } catch (EOFException eOFException) {
                this.c = -1;
            }
            this.b = true;
        }
        if (this.c < 0) {
            return this.c;
        }
        int n2 = this.c & 0x3F;
        if ((this.c & 0x40) == 0) {
            n2 >>= 2;
        }
        return n2;
    }

    public final bo b() {
        int n2 = this.read();
        if (n2 < 0) {
            return null;
        }
        if ((n2 & 0x80) == 0) {
            throw new IOException("invalid header encountered");
        }
        int n3 = (n2 & 0x40) != 0 ? 1 : 0;
        int n4 = 0;
        boolean bl2 = false;
        if (n3 != 0) {
            n2 &= 0x3F;
            n3 = this.read();
            if (n3 < 192) {
                n4 = n3;
            } else if (n3 <= 223) {
                n4 = this.a.read();
                n4 = (n3 - 192 << 8) + n4 + 192;
            } else if (n3 == 255) {
                n4 = this.a.read() << 24 | this.a.read() << 16 | this.a.read() << 8 | this.a.read();
            } else {
                bl2 = true;
                n4 = 1 << (n3 & 0x1F);
            }
        } else {
            n3 = n2 & 3;
            n2 = (n2 & 0x3F) >> 2;
            switch (n3) {
                case 0: {
                    n4 = this.read();
                    break;
                }
                case 1: {
                    n4 = this.read() << 8 | this.read();
                    break;
                }
                case 2: {
                    n4 = this.read() << 24 | this.read() << 16 | this.read() << 8 | this.read();
                    break;
                }
                case 3: {
                    bl2 = true;
                    break;
                }
                default: {
                    throw new IOException("unknown length type encountered");
                }
            }
        }
        c c2 = n4 == 0 && bl2 ? this : new c(new d(this, bl2, n4));
        switch (n2) {
            case 0: {
                return new t(c2);
            }
            case 1: {
                return new z(c2);
            }
            case 2: {
                return new ah(c2);
            }
            case 3: {
                return new am(c2);
            }
            case 4: {
                return new y(c2);
            }
            case 5: {
                return new af(c2);
            }
            case 6: {
                return new aa(c2);
            }
            case 7: {
                return new ag(c2);
            }
            case 8: {
                return new h(c2);
            }
            case 9: {
                return new ak(c2);
            }
            case 10: {
                return new w(c2);
            }
            case 11: {
                return new u(c2);
            }
            case 12: {
                return new an(c2);
            }
            case 13: {
                return new ar(c2);
            }
            case 17: {
                return new ao(c2);
            }
            case 14: {
                return new ab(c2);
            }
            case 18: {
                return new al(c2);
            }
            case 19: {
                return new x(c2);
            }
            case 60: 
            case 61: 
            case 62: 
            case 63: {
                return new s(n2, c2);
            }
        }
        throw new IOException("unknown packet type encountered: ".concat(String.valueOf(n2)));
    }

    public final void close() {
        this.a.close();
    }
}

