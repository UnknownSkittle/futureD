/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.d.b;
import org.apache.commons.compress.b.h;

public final class a
extends c {
    private final InputStream a;
    private long b = 0L;
    private boolean c;
    private b d = null;
    private byte[] e = null;
    private long f = -1L;
    private final byte[] g = new byte[58];

    public a(InputStream inputStream) {
        this.a = inputStream;
        this.c = false;
    }

    private String b(int n2) {
        if (this.e == null) {
            throw new IOException("Cannot process GNU long filename as no // record was found");
        }
        for (int i2 = n2; i2 < this.e.length; ++i2) {
            if (this.e[i2] != 10 && this.e[i2] != 0) continue;
            if (this.e[i2 - 1] == 47) {
                --i2;
            }
            return org.apache.commons.compress.b.a.a(this.e, n2, i2 - n2);
        }
        throw new IOException("Failed to read entry: ".concat(String.valueOf(n2)));
    }

    private static long a(byte[] byArray, int n2, int n3) {
        return Long.parseLong(org.apache.commons.compress.b.a.a(byArray, n2, n3).trim());
    }

    private static int b(byte[] byArray, int n2) {
        return org.apache.commons.compress.archivers.a.a.a(byArray, n2, 6, 10, true);
    }

    private static int a(byte[] object, int n2, int n3, int n4, boolean bl2) {
        String string = org.apache.commons.compress.b.a.a(object, n2, n3).trim();
        object = string;
        if (string.length() == 0 && bl2) {
            return 0;
        }
        return Integer.parseInt((String)object, n4);
    }

    @Override
    public final org.apache.commons.compress.archivers.a a() {
        int n2;
        Object object;
        Object object2;
        a a2 = this;
        while (true) {
            int n3;
            byte[] byArray;
            if (a2.d != null) {
                long l2 = a2.f + a2.d.a();
                long l3 = h.a(a2.a, l2 - a2.b);
                a2.c(l3);
                a2.d = null;
            }
            if (a2.b == 0L) {
                byte[] byArray2 = org.apache.commons.compress.b.a.a("!<arch>\n");
                byArray = new byte[byArray2.length];
                int n4 = h.a(a2.a, byArray);
                a2.c(n4);
                if (n4 != byArray2.length) {
                    throw new IOException("failed to read header. Occured at byte: " + a2.b());
                }
                for (n3 = 0; n3 < byArray2.length; ++n3) {
                    if (byArray2[n3] == byArray[n3]) continue;
                    throw new IOException("invalid header " + org.apache.commons.compress.b.a.a(byArray));
                }
            }
            if (a2.b % 2L != 0L) {
                if (a2.a.read() < 0) {
                    return null;
                }
                a2.c(1L);
            }
            if (a2.a.available() == 0) {
                return null;
            }
            int n5 = h.a(a2.a, a2.g);
            a2.c(n5);
            if (n5 < 58) {
                throw new IOException("truncated ar archive");
            }
            object2 = org.apache.commons.compress.b.a.a("`\n");
            byArray = new byte[((byte[])object2).length];
            int n6 = h.a(a2.a, byArray);
            a2.c(n6);
            if (n6 != ((byte[])object2).length) {
                throw new IOException("failed to read entry trailer. Occured at byte: " + a2.b());
            }
            for (n3 = 0; n3 < ((byte[])object2).length; ++n3) {
                if (object2[n3] == byArray[n3]) continue;
                throw new IOException("invalid entry trailer. not read the content? Occured at byte: " + a2.b());
            }
            a2.f = a2.b;
            String string = org.apache.commons.compress.b.a.a(a2.g, 0, 16).trim();
            object2 = string;
            object = string;
            if (!"//".equals(object)) break;
            object2 = a2.g;
            object = a2;
            n2 = org.apache.commons.compress.archivers.a.a.a((byte[])object2, 48, 10, 10, false);
            ((a)object).e = new byte[n2];
            int n7 = h.a(((a)object).a, ((a)object).e, 0, n2);
            super.c(n7);
            if (n7 != n2) {
                throw new IOException("Failed to read complete // record: expected=" + n2 + " read=" + n7);
            }
            a2.d = new b("//", n2);
        }
        long l4 = org.apache.commons.compress.archivers.a.a.a(a2.g, 48, 10);
        if (((String)object2).endsWith("/")) {
            object2 = ((String)object2).substring(0, ((String)object2).length() - 1);
        } else {
            object = object2;
            if (object != null && ((String)object).matches("^/\\d+")) {
                int n8 = Integer.parseInt(((String)object2).substring(1));
                object2 = a2.b(n8);
            } else {
                object = object2;
                if (object != null && ((String)object).matches("^#1/\\d+")) {
                    object = a2;
                    int n9 = Integer.parseInt(((String)object2).substring(3));
                    byte[] byArray = new byte[n9];
                    n2 = h.a(((a)object).a, byArray);
                    super.c(n2);
                    if (n2 != n9) {
                        throw new EOFException();
                    }
                    object2 = org.apache.commons.compress.b.a.a(byArray);
                    int n10 = ((String)object2).length();
                    l4 -= (long)n10;
                    a2.f += (long)n10;
                }
            }
        }
        a2.d = new b((String)object2, l4, org.apache.commons.compress.archivers.a.a.b(a2.g, 28), org.apache.commons.compress.archivers.a.a.b(a2.g, 34), org.apache.commons.compress.archivers.a.a.a(a2.g, 40, 8, 8, false), org.apache.commons.compress.archivers.a.a.a(a2.g, 16, 12));
        return a2.d;
    }

    @Override
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
        }
        this.d = null;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.d == null) {
            throw new IllegalStateException("No current ar entry");
        }
        long l2 = this.f + this.d.a();
        if (n3 <= 0 || l2 <= this.b) {
            return -1;
        }
        n3 = (int)Math.min((long)n3, l2 - this.b);
        int n4 = this.a.read(byArray, n2, n3);
        this.c(n4);
        return n4;
    }

    public static boolean a(byte[] byArray, int n2) {
        return n2 >= 8 && byArray[0] == 33 && byArray[1] == 60 && byArray[2] == 97 && byArray[3] == 114 && byArray[4] == 99 && byArray[5] == 104 && byArray[6] == 62 && byArray[7] == 10;
    }

    private void c(long l2) {
        this.a(l2);
        if (l2 > 0L) {
            this.b += l2;
        }
    }
}

