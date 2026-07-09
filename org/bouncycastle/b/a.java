/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.e.j;
import org.bouncycastle.e.k;
import org.bouncycastle.math.ec.a.c.au;

public final class a
extends InputStream {
    private static final byte[] a = new byte[128];
    private InputStream b;
    private boolean c = true;
    private int[] d = new int[3];
    private int e = 3;
    private au f = new au();
    private boolean g = false;
    private boolean h = true;
    private String i = null;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private j m = org.bouncycastle.e.k.a();
    private int n = 0;
    private boolean o;

    private static int a(int n2, int n3, int n4, int n5, int[] nArray) {
        if (n5 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        }
        if (n4 == 61) {
            n2 = a[n2] & 0xFF;
            n3 = a[n3] & 0xFF;
            nArray[2] = (n2 << 2 | n3 >> 4) & 0xFF;
            return 2;
        }
        if (n5 == 61) {
            n2 = a[n2];
            n3 = a[n3];
            n4 = a[n4];
            nArray[1] = (n2 << 2 | n3 >> 4) & 0xFF;
            nArray[2] = (n3 << 4 | n4 >> 2) & 0xFF;
            return 1;
        }
        n2 = a[n2];
        n3 = a[n3];
        n4 = a[n4];
        n5 = a[n5];
        nArray[0] = (n2 << 2 | n3 >> 4) & 0xFF;
        nArray[1] = (n3 << 4 | n4 >> 2) & 0xFF;
        nArray[2] = (n4 << 6 | n5) & 0xFF;
        return 0;
    }

    public a(InputStream inputStream) {
        this(inputStream, true);
    }

    public a(InputStream inputStream, boolean bl2) {
        this.b = inputStream;
        this.h = bl2;
        if (bl2) {
            this.b();
        }
        this.c = false;
    }

    public final int available() {
        return this.b.available();
    }

    private boolean b() {
        int n2;
        this.i = null;
        int n3 = 0;
        boolean bl2 = false;
        this.m = org.bouncycastle.e.k.a();
        if (this.l) {
            bl2 = true;
        } else {
            while ((n2 = this.b.read()) >= 0) {
                if (n2 == 45 && (n3 == 0 || n3 == 10 || n3 == 13)) {
                    bl2 = true;
                    break;
                }
                n3 = n2;
            }
        }
        if (bl2) {
            StringBuffer stringBuffer = new StringBuffer("-");
            boolean bl3 = false;
            boolean bl4 = false;
            if (this.l) {
                stringBuffer.append('-');
            }
            while ((n2 = this.b.read()) >= 0) {
                if (n3 == 13 && n2 == 10) {
                    bl4 = true;
                }
                if (bl3 && n3 != 13 && n2 == 10 || bl3 && n2 == 13) break;
                if (n2 == 13 || n3 != 13 && n2 == 10) {
                    String string = stringBuffer.toString();
                    if (string.trim().length() == 0) break;
                    this.m.a(string);
                    stringBuffer.setLength(0);
                }
                if (n2 != 10 && n2 != 13) {
                    stringBuffer.append((char)n2);
                    bl3 = false;
                } else if (n2 == 13 || n3 != 13 && n2 == 10) {
                    bl3 = true;
                }
                n3 = n2;
            }
            if (bl4) {
                this.b.read();
            }
        }
        if (this.m.size() > 0) {
            this.i = this.m.a();
        }
        this.k = "-----BEGIN PGP SIGNED MESSAGE-----".equals(this.i);
        this.j = true;
        return bl2;
    }

    public final boolean a() {
        return this.k;
    }

    private int c() {
        int n2 = this.b.read();
        while (n2 == 32 || n2 == 9) {
            n2 = this.b.read();
        }
        return n2;
    }

    public final int read() {
        int n2;
        block20: {
            block21: {
                block22: {
                    block23: {
                        do {
                            if (this.c) {
                                if (this.h) {
                                    this.b();
                                }
                                this.f.b();
                                this.c = false;
                            }
                            if (this.k) {
                                n2 = this.b.read();
                                if (n2 == 13 || n2 == 10 && this.n != 13) {
                                    this.j = true;
                                } else if (this.j && n2 == 45) {
                                    n2 = this.b.read();
                                    if (n2 == 45) {
                                        this.k = false;
                                        this.c = true;
                                        this.l = true;
                                    } else {
                                        n2 = this.b.read();
                                    }
                                    this.j = false;
                                } else if (n2 != 10 && this.n != 13) {
                                    this.j = false;
                                }
                                this.n = n2;
                                if (n2 < 0) {
                                    this.o = true;
                                }
                                return n2;
                            }
                            if (this.e <= 2 && !this.g) break block20;
                            n2 = this.c();
                            if (n2 != 13 && n2 != 10) break block21;
                            n2 = this.c();
                            while (n2 == 10 || n2 == 13) {
                                n2 = this.c();
                            }
                            if (n2 < 0) {
                                this.o = true;
                                return -1;
                            }
                            if (n2 != 61) break block22;
                            this.e = org.bouncycastle.b.a.a(this.c(), this.c(), this.c(), this.c(), this.d);
                            if (this.e != 0) break block23;
                            n2 = (this.d[0] & 0xFF) << 16 | (this.d[1] & 0xFF) << 8 | this.d[2] & 0xFF;
                            this.g = true;
                        } while (n2 == this.f.a());
                        throw new IOException("crc check failed in armored message.");
                    }
                    throw new IOException("no crc found in armored message.");
                }
                if (n2 == 45) {
                    while ((n2 = this.b.read()) >= 0 && n2 != 10 && n2 != 13) {
                    }
                    if (!this.g) {
                        throw new IOException("crc check not found.");
                    }
                    this.g = false;
                    this.c = true;
                    this.e = 3;
                    if (n2 < 0) {
                        this.o = true;
                    }
                    return -1;
                }
                this.e = org.bouncycastle.b.a.a(n2, this.c(), this.c(), this.c(), this.d);
                break block20;
            }
            if (n2 >= 0) {
                this.e = org.bouncycastle.b.a.a(n2, this.c(), this.c(), this.c(), this.d);
            } else {
                this.o = true;
                return -1;
            }
        }
        n2 = this.d[this.e++];
        this.f.a(n2);
        return n2;
    }

    public final void close() {
        this.b.close();
    }

    static {
        int n2 = 65;
        while (n2 <= 90) {
            int n3 = n2++;
            org.bouncycastle.b.a.a[n3] = (byte)(n3 - 65);
        }
        n2 = 97;
        while (n2 <= 122) {
            int n4 = n2++;
            org.bouncycastle.b.a.a[n4] = (byte)(n4 - 97 + 26);
        }
        n2 = 48;
        while (n2 <= 57) {
            int n5 = n2++;
            org.bouncycastle.b.a.a[n5] = (byte)(n5 - 48 + 52);
        }
        org.bouncycastle.b.a.a[43] = 62;
        org.bouncycastle.b.a.a[47] = 63;
    }
}

