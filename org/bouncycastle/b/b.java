/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.e.k;
import org.bouncycastle.math.ec.a.c.au;

public final class b
extends OutputStream {
    private static final byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private OutputStream b;
    private int[] c = new int[3];
    private int d = 0;
    private au e = new au();
    private int f = 0;
    private int g;
    private boolean h = true;
    private boolean i = false;
    private boolean j = false;
    private String k = org.bouncycastle.e.k.b();
    private String l;
    private String m = "-----BEGIN PGP ";
    private String n = "-----";
    private String o = "-----END PGP ";
    private String p = "-----";
    private String q = "BCPG v1.60";
    private Hashtable r = new Hashtable();

    private static void a(OutputStream outputStream, int[] nArray, int n2) {
        switch (n2) {
            case 0: {
                return;
            }
            case 1: {
                n2 = nArray[0];
                outputStream.write(a[n2 >>> 2 & 0x3F]);
                outputStream.write(a[n2 << 4 & 0x3F]);
                outputStream.write(61);
                outputStream.write(61);
                return;
            }
            case 2: {
                n2 = nArray[0];
                int n3 = nArray[1];
                outputStream.write(a[n2 >>> 2 & 0x3F]);
                outputStream.write(a[(n2 << 4 | n3 >>> 4) & 0x3F]);
                outputStream.write(a[n3 << 2 & 0x3F]);
                outputStream.write(61);
                return;
            }
            case 3: {
                n2 = nArray[0];
                int n4 = nArray[1];
                int n5 = nArray[2];
                outputStream.write(a[n2 >>> 2 & 0x3F]);
                outputStream.write(a[(n2 << 4 | n4 >>> 4) & 0x3F]);
                outputStream.write(a[(n4 << 2 | n5 >>> 6) & 0x3F]);
                outputStream.write(a[n5 & 0x3F]);
                return;
            }
        }
        throw new IOException("unknown length in encode");
    }

    public b(OutputStream outputStream) {
        this.b = outputStream;
        if (this.k == null) {
            this.k = "\r\n";
        }
        this.r.put("Version", this.q);
    }

    public final void a(int n2) {
        int n3;
        String string;
        switch (n2) {
            case 2: {
                string = "SHA1";
                break;
            }
            case 8: {
                string = "SHA256";
                break;
            }
            case 9: {
                string = "SHA384";
                break;
            }
            case 10: {
                string = "SHA512";
                break;
            }
            case 5: {
                string = "MD2";
                break;
            }
            case 1: {
                string = "MD5";
                break;
            }
            case 3: {
                string = "RIPEMD160";
                break;
            }
            default: {
                throw new IOException("unknown hash algorithm tag in beginClearText: ".concat(String.valueOf(n2)));
            }
        }
        String string2 = "-----BEGIN PGP SIGNED MESSAGE-----" + this.k;
        string = "Hash: " + string + this.k + this.k;
        for (n3 = 0; n3 != string2.length(); ++n3) {
            this.b.write(string2.charAt(n3));
        }
        for (n3 = 0; n3 != string.length(); ++n3) {
            this.b.write(string.charAt(n3));
        }
        this.i = true;
        this.j = true;
        this.g = 0;
    }

    public final void a() {
        this.i = false;
    }

    private void a(String string, String string2) {
        int n2;
        for (n2 = 0; n2 != string.length(); ++n2) {
            this.b.write(string.charAt(n2));
        }
        this.b.write(58);
        this.b.write(32);
        for (n2 = 0; n2 != string2.length(); ++n2) {
            this.b.write(string2.charAt(n2));
        }
        for (n2 = 0; n2 != this.k.length(); ++n2) {
            this.b.write(this.k.charAt(n2));
        }
    }

    public final void write(int n2) {
        if (this.i) {
            this.b.write(n2);
            if (this.j) {
                if (n2 != 10 || this.g != 13) {
                    this.j = false;
                }
                if (n2 == 45) {
                    this.b.write(32);
                    this.b.write(45);
                }
            }
            if (n2 == 13 || n2 == 10 && this.g != 13) {
                this.j = true;
            }
            this.g = n2;
            return;
        }
        if (this.h) {
            int n3 = (n2 & 0x40) != 0 ? n2 & 0x3F : (n2 & 0x3F) >> 2;
            switch (n3) {
                case 6: {
                    this.l = "PUBLIC KEY BLOCK";
                    break;
                }
                case 5: {
                    this.l = "PRIVATE KEY BLOCK";
                    break;
                }
                case 2: {
                    this.l = "SIGNATURE";
                    break;
                }
                default: {
                    this.l = "MESSAGE";
                }
            }
            for (n3 = 0; n3 != this.m.length(); ++n3) {
                this.b.write(this.m.charAt(n3));
            }
            for (n3 = 0; n3 != this.l.length(); ++n3) {
                this.b.write(this.l.charAt(n3));
            }
            for (n3 = 0; n3 != this.n.length(); ++n3) {
                this.b.write(this.n.charAt(n3));
            }
            for (n3 = 0; n3 != this.k.length(); ++n3) {
                this.b.write(this.k.charAt(n3));
            }
            if (this.r.containsKey("Version")) {
                this.a("Version", (String)this.r.get("Version"));
            }
            Enumeration enumeration = this.r.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                if (string.equals("Version")) continue;
                this.a(string, (String)this.r.get(string));
            }
            for (int i2 = 0; i2 != this.k.length(); ++i2) {
                this.b.write(this.k.charAt(i2));
            }
            this.h = false;
        }
        if (this.d == 3) {
            org.bouncycastle.b.b.a(this.b, this.c, this.d);
            this.d = 0;
            if ((++this.f & 0xF) == 0) {
                for (int i3 = 0; i3 != this.k.length(); ++i3) {
                    this.b.write(this.k.charAt(i3));
                }
            }
        }
        this.e.a(n2);
        this.c[this.d++] = n2 & 0xFF;
    }

    public final void flush() {
    }

    public final void close() {
        if (this.l != null) {
            int n2;
            org.bouncycastle.b.b.a(this.b, this.c, this.d);
            for (n2 = 0; n2 != this.k.length(); ++n2) {
                this.b.write(this.k.charAt(n2));
            }
            this.b.write(61);
            n2 = this.e.a();
            this.c[0] = n2 >> 16 & 0xFF;
            this.c[1] = n2 >> 8 & 0xFF;
            this.c[2] = n2 & 0xFF;
            org.bouncycastle.b.b.a(this.b, this.c, 3);
            for (n2 = 0; n2 != this.k.length(); ++n2) {
                this.b.write(this.k.charAt(n2));
            }
            for (n2 = 0; n2 != this.o.length(); ++n2) {
                this.b.write(this.o.charAt(n2));
            }
            for (n2 = 0; n2 != this.l.length(); ++n2) {
                this.b.write(this.l.charAt(n2));
            }
            for (n2 = 0; n2 != this.p.length(); ++n2) {
                this.b.write(this.p.charAt(n2));
            }
            for (n2 = 0; n2 != this.k.length(); ++n2) {
                this.b.write(this.k.charAt(n2));
            }
            this.b.flush();
            this.l = null;
            this.h = true;
        }
    }
}

