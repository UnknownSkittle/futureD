/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.g.ag;
import org.apache.commons.compress.archivers.g.ai;
import org.apache.commons.compress.archivers.g.ak;
import org.apache.commons.compress.archivers.g.am;
import org.apache.commons.compress.archivers.g.an;
import org.apache.commons.compress.archivers.g.ao;
import org.apache.commons.compress.archivers.g.ap;
import org.apache.commons.compress.archivers.g.ar;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.aw;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;
import org.apache.commons.compress.archivers.g.f;
import org.apache.commons.compress.archivers.g.j;
import org.apache.commons.compress.archivers.g.v;
import org.apache.commons.compress.archivers.g.w;
import org.apache.commons.compress.archivers.g.x;
import org.apache.commons.compress.b.h;

public class al
extends c {
    private final as a;
    private String b;
    private final boolean c;
    private final InputStream d;
    private final Inflater e = new Inflater(true);
    private final ByteBuffer f = ByteBuffer.allocate(512);
    private ao g = null;
    private boolean h = false;
    private boolean i = false;
    private ByteArrayInputStream j = null;
    private boolean k = false;
    private long l = 0L;
    private final byte[] m = new byte[30];
    private final byte[] n = new byte[1024];
    private final byte[] o = new byte[2];
    private final byte[] p = new byte[4];
    private final byte[] q = new byte[16];
    private int r = 0;
    private static final byte[] s = av.b.a();
    private static final byte[] t = av.a.a();
    private static final byte[] u = av.c.a();
    private static final byte[] v = new byte[]{65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};
    private static final BigInteger w = BigInteger.valueOf(Long.MAX_VALUE);

    public al(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public al(InputStream inputStream, String string) {
        this(inputStream, string, 0);
    }

    private al(InputStream inputStream, String string, byte by2) {
        this(inputStream, string, '\u0000');
    }

    private al(InputStream inputStream, String string, char c2) {
        this.b = string;
        this.a = at.a(string);
        this.c = true;
        this.d = new PushbackInputStream(inputStream, this.f.capacity());
        this.k = false;
        this.f.limit(0);
    }

    public final ai c() {
        av av2;
        long l2;
        block35: {
            Object object;
            block37: {
                block36: {
                    this.l = 0L;
                    boolean bl2 = true;
                    if (this.h || this.i) {
                        return null;
                    }
                    if (this.g != null) {
                        al al2 = this;
                        if (al2.h) {
                            throw new IOException("The stream is closed");
                        }
                        if (al2.g != null) {
                            if (al2.d()) {
                                al2.e();
                            } else {
                                al2.skip(Long.MAX_VALUE);
                                long l3 = ao.a(al2.g).getMethod() == 8 ? al2.f() : ao.e(al2.g);
                                int n2 = (int)(ao.f(al2.g) - l3);
                                if (n2 > 0) {
                                    al al3 = al2;
                                    al3.b(al3.f.array(), al2.f.limit() - n2, n2);
                                    ao ao2 = al2.g;
                                    ao.a(ao2, ao.f(ao2) - (long)n2);
                                }
                                if (al2.d()) {
                                    al2.e();
                                }
                            }
                            if (al2.j == null && ao.b(al2.g)) {
                                al2.g();
                            }
                            al2.e.reset();
                            al2.f.clear().flip();
                            al2.g = null;
                            al2.j = null;
                        }
                        bl2 = false;
                    }
                    l2 = this.b();
                    try {
                        if (bl2) {
                            al al4 = this;
                            byte[] byArray = al4.m;
                            al al5 = al4;
                            al4.a(byArray, 0);
                            av2 = new av(byArray);
                            if (av2.equals(av.c)) {
                                throw new w(x.d);
                            }
                            if (av2.equals(av.e)) {
                                byte[] byArray2 = new byte[4];
                                al5.a(byArray2, 0);
                                System.arraycopy(byArray, 4, byArray, 0, 26);
                                System.arraycopy(byArray2, 0, byArray, 26, 4);
                            }
                        } else {
                            al al6 = this;
                            al6.a(al6.m, 0);
                        }
                    } catch (EOFException eOFException) {
                        return null;
                    }
                    object = new av(this.m);
                    if (((av)object).equals(av.b)) break block35;
                    if (((av)object).equals(av.a) || ((av)object).equals(av.f)) break block36;
                    al al7 = this;
                    if (!al7.a(al7.m)) break block37;
                }
                this.i = true;
                object = this;
                ((al)object).c((long)((al)object).r * 46L - 30L);
                super.i();
                super.c(16L);
                Object object2 = object;
                super.a(((al)object2).o, 0);
                Object object3 = object;
                super.c(ax.a(((al)object3).o));
                return null;
            }
            throw new ZipException(String.format("Unexpected record signature: 0X%X", ((av)object).b()));
        }
        this.g = new ao(0);
        int n3 = ax.a(this.m, 4);
        ao.a(this.g).a(n3 >> 8 & 0xF);
        Object object = org.apache.commons.compress.archivers.g.j.b(this.m);
        boolean bl3 = ((j)object).a();
        Object object4 = bl3 ? at.a : this.a;
        ao.a(this.g, ((j)object).c());
        ao.a(this.g).a((j)object);
        ao.a(this.g).setMethod(ax.a(this.m, 8));
        long l4 = ay.a(av.b(this.m, 10));
        ao.a(this.g).setTime(l4);
        object = null;
        av av3 = null;
        if (!ao.b(this.g)) {
            ao.a(this.g).setCrc(av.b(this.m, 14));
            av3 = new av(this.m, 18);
            object = new av(this.m, 22);
        }
        int n4 = ax.a(this.m, 26);
        int n5 = ax.a(this.m, 28);
        byte[] byArray = new byte[n4];
        this.a(byArray, 0);
        ao.a(this.g).a(object4.a(byArray), byArray);
        if (bl3) {
            ao.a(this.g).b(ak.b);
        }
        object4 = new byte[n5];
        this.a((byte[])object4, 0);
        ao.a(this.g).setExtra((byte[])object4);
        if (!bl3) {
            ay.a(ao.a(this.g), byArray);
        }
        av2 = av3;
        Cloneable cloneable = object;
        object = this;
        ag ag2 = (ag)ao.a(((al)object).g).a(ag.a);
        ao.b(((al)object).g, ag2 != null);
        if (!ao.b(((al)object).g)) {
            if (ag2 != null && (av2.equals(av.d) || ((av)cloneable).equals(av.d))) {
                ao.a(((al)object).g).setCompressedSize(ag2.g().b());
                ao.a(((al)object).g).setSize(ag2.b().b());
            } else {
                ao.a(((al)object).g).setCompressedSize(av2.b());
                ao.a(((al)object).g).setSize(((av)cloneable).b());
            }
        }
        ao.a(this.g).a(l2);
        ao.a(this.g).b(this.b());
        ao.a(this.g).f();
        object = aw.a(ao.a(this.g).getMethod());
        if (ao.a(this.g).getCompressedSize() != -1L) {
            if (ay.a(ao.a(this.g)) && object != aw.a && object != aw.d) {
                al al8 = this;
                an an2 = new an(al8, al8.d, ao.a(this.g).getCompressedSize());
                switch (am.a[((Enum)object).ordinal()]) {
                    case 1: {
                        ao.a(this.g, new v(an2));
                        break;
                    }
                    case 2: {
                        ao.a(this.g, new f(ao.a(this.g).g().f(), ao.a(this.g).g().g(), an2));
                        break;
                    }
                    case 3: {
                        ao.a(this.g, new org.apache.commons.compress.a.a.a(an2));
                        break;
                    }
                    case 4: {
                        ao.a(this.g, new org.apache.commons.compress.a.b.a(an2));
                    }
                    default: {
                        break;
                    }
                }
            }
        } else if (object == aw.e) {
            ao.a(this.g, new org.apache.commons.compress.a.b.a(this.d));
        }
        ++this.r;
        return ao.a(this.g);
    }

    @Override
    public a a() {
        return this.c();
    }

    @Override
    public final boolean a(a a2) {
        if (a2 instanceof ai) {
            return ay.a((ai)(a2 = (ai)a2)) && al.a((ai)a2) && al.b((ai)a2);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int read(byte[] byArray, int n2, int n3) {
        if (this.h) {
            throw new IOException("The stream is closed");
        }
        if (this.g == null) {
            return -1;
        }
        if (n2 > byArray.length) throw new ArrayIndexOutOfBoundsException();
        if (n3 < 0) throw new ArrayIndexOutOfBoundsException();
        if (n2 < 0) throw new ArrayIndexOutOfBoundsException();
        if (byArray.length - n2 < n3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ay.b(ao.a(this.g));
        if (!al.a(ao.a(this.g))) {
            throw new w(x.c, ao.a(this.g));
        }
        if (!al.b(ao.a(this.g))) {
            throw new w(x.e, ao.a(this.g));
        }
        if (ao.a(this.g).getMethod() == 0) {
            int n4;
            int n5 = n3;
            byte[] byArray2 = byArray;
            al al2 = this;
            if (ao.b(al2.g)) {
                if (al2.j == null) {
                    al2.h();
                }
                n4 = al2.j.read(byArray2, n2, n5);
            } else {
                int n6;
                long l2 = ao.a(al2.g).getSize();
                if (ao.e(al2.g) >= l2) {
                    return -1;
                }
                if (al2.f.position() >= al2.f.limit()) {
                    al2.f.position(0);
                    n6 = al2.d.read(al2.f.array());
                    if (n6 == -1) {
                        al2.f.limit(0);
                        throw new IOException("Truncated ZIP file");
                    }
                    al2.f.limit(n6);
                    al2.a(n6);
                    ao ao2 = al2.g;
                    ao.a(ao2, ao.f(ao2) + (long)n6);
                }
                n6 = Math.min(al2.f.remaining(), n5);
                if (l2 - ao.e(al2.g) < (long)n6) {
                    n6 = (int)(l2 - ao.e(al2.g));
                }
                al2.f.get(byArray2, n2, n6);
                ao ao3 = al2.g;
                ao.b(ao3, ao.e(ao3) + (long)n6);
                n4 = n6;
            }
            n3 = n4;
        } else if (ao.a(this.g).getMethod() == 8) {
            al al3 = this;
            byte[] byArray3 = byArray;
            int n7 = n3;
            int n8 = al3.a(byArray3, n2, n7);
            if (n8 <= 0) {
                if (al3.e.finished()) {
                    return -1;
                }
                if (al3.e.needsDictionary()) {
                    throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
                }
                if (n8 == -1) {
                    throw new IOException("Truncated ZIP file");
                }
            }
            int n9 = n8;
            n3 = n9;
        } else {
            if (ao.a(this.g).getMethod() != aw.b.a() && ao.a(this.g).getMethod() != aw.c.a() && ao.a(this.g).getMethod() != aw.e.a()) {
                if (ao.a(this.g).getMethod() != aw.f.a()) throw new w(aw.a(ao.a(this.g).getMethod()), ao.a(this.g));
            }
            n3 = ao.c(this.g).read(byArray, n2, n3);
        }
        if (n3 < 0) return n3;
        ao.d(this.g).update(byArray, n2, n3);
        this.l += (long)n3;
        return n3;
    }

    private int a(byte[] byArray, int n2, int n3) {
        int n4 = 0;
        do {
            if (this.e.needsInput()) {
                int n5;
                al al2 = this;
                if (al2.h) {
                    throw new IOException("The stream is closed");
                }
                int n6 = al2.d.read(al2.f.array());
                if (n6 > 0) {
                    al2.f.limit(n6);
                    al al3 = al2;
                    al3.a(al3.f.limit());
                    al2.e.setInput(al2.f.array(), 0, al2.f.limit());
                }
                if ((n5 = n6) > 0) {
                    ao ao2 = this.g;
                    ao.a(ao2, ao.f(ao2) + (long)this.f.limit());
                } else {
                    if (n5 != -1) break;
                    return -1;
                }
            }
            try {
                n4 = this.e.inflate(byArray, n2, n3);
            } catch (DataFormatException dataFormatException) {
                throw (IOException)new ZipException(dataFormatException.getMessage()).initCause(dataFormatException);
            }
        } while (n4 == 0 && this.e.needsInput());
        return n4;
    }

    @Override
    public void close() {
        if (!this.h) {
            this.h = true;
            try {
                this.d.close();
                return;
            } finally {
                this.e.end();
            }
        }
    }

    @Override
    public long skip(long l2) {
        if (l2 >= 0L) {
            long l3;
            int n2;
            for (l3 = 0L; l3 < l2; l3 += (long)n2) {
                long l4 = l2 - l3;
                al al2 = this;
                n2 = al2.read(al2.n, 0, (int)(1024L > l4 ? l4 : 1024L));
                if (n2 != -1) continue;
                return l3;
            }
            return l3;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(byte[] byArray, int n2) {
        if (n2 < ap.a.length) {
            return false;
        }
        return al.a(byArray, ap.a) || al.a(byArray, ap.c) || al.a(byArray, ap.b) || al.a(byArray, av.e.a());
    }

    private static boolean a(byte[] byArray, byte[] byArray2) {
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    private boolean d() {
        return ao.f(this.g) <= ao.a(this.g).getCompressedSize() && !ao.b(this.g);
    }

    private void e() {
        long l2;
        for (long i2 = ao.a(this.g).getCompressedSize() - ao.f(this.g); i2 > 0L; i2 -= l2) {
            l2 = this.d.read(this.f.array(), 0, (int)Math.min((long)this.f.capacity(), i2));
            if (l2 < 0L) {
                throw new EOFException("Truncated ZIP entry: " + org.apache.commons.compress.b.a.b(ao.a(this.g).getName()));
            }
            this.a(l2);
        }
    }

    private long f() {
        long l2 = this.e.getBytesRead();
        if (ao.f(this.g) >= 0x100000000L) {
            while (l2 + 0x100000000L <= ao.f(this.g)) {
                l2 += 0x100000000L;
            }
        }
        return l2;
    }

    private void a(byte[] byArray, int n2) {
        int n3 = byArray.length - n2;
        int n4 = org.apache.commons.compress.b.h.a(this.d, byArray, n2, n3);
        this.a(n4);
        if (n4 < n3) {
            throw new EOFException();
        }
    }

    private void g() {
        al al2 = this;
        al2.a(al2.p, 0);
        av av2 = new av(this.p);
        if (av.c.equals(av2)) {
            al al3 = this;
            al3.a(al3.p, 0);
            av2 = new av(this.p);
        }
        ao.a(this.g).setCrc(av2.b());
        al al4 = this;
        al4.a(al4.q, 0);
        av2 = new av(this.q, 8);
        if (av2.equals(av.a) || av2.equals(av.b)) {
            al al5 = this;
            al5.b(al5.q, 8, 8);
            ao.a(this.g).setCompressedSize(av.a(this.q));
            ao.a(this.g).setSize(av.b(this.q, 4));
            return;
        }
        ao.a(this.g).setCompressedSize(ar.a(this.q));
        ao.a(this.g).setSize(ar.a(this.q, 8));
    }

    private static boolean a(ai ai2) {
        return !ai2.g().c() || ai2.getMethod() == 8 || ai2.getMethod() == aw.e.a();
    }

    private static boolean b(ai ai2) {
        if (ai2.getCompressedSize() == -1L && ai2.getMethod() != 8 && ai2.getMethod() != aw.e.a()) {
            if (ai2.g().c()) {
                // empty if block
            }
        } else {
            return true;
        }
        return false;
    }

    private void h() {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = 0;
        boolean bl2 = false;
        int n4 = n2 = ao.g(this.g) ? 20 : 12;
        while (!bl2) {
            int n5 = this.d.read(this.f.array(), n3, 512 - n3);
            if (n5 <= 0) {
                throw new IOException("Truncated ZIP file");
            }
            if (n5 + n3 < 4) {
                n3 += n5;
                continue;
            }
            bl2 = this.a(byteArrayOutputStream, n3, n5, n2);
            if (bl2) continue;
            int n6 = n2;
            int n7 = n5;
            int n8 = n3;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            al al2 = this;
            int n9 = n8 + n7 - n6 - 3;
            if (n9 > 0) {
                byteArrayOutputStream2.write(al2.f.array(), 0, n9);
                System.arraycopy(al2.f.array(), n9, al2.f.array(), 0, n6 + 3);
                n8 = n6 + 3;
            } else {
                n8 += n7;
            }
            n3 = n8;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        this.j = new ByteArrayInputStream(byArray);
    }

    private boolean a(ByteArrayOutputStream byteArrayOutputStream, int n2, int n3, int n4) {
        boolean bl2 = false;
        int n5 = 0;
        for (int i2 = 0; !bl2 && i2 < n2 + n3 - 4; ++i2) {
            if (this.f.array()[i2] != s[0] || this.f.array()[i2 + 1] != s[1]) continue;
            if (this.f.array()[i2 + 2] == s[2] && this.f.array()[i2 + 3] == s[3] || this.f.array()[i2] == t[2] && this.f.array()[i2 + 3] == t[3]) {
                n5 = n2 + n3 - i2 - n4;
                bl2 = true;
            } else if (this.f.array()[i2 + 2] == u[2] && this.f.array()[i2 + 3] == u[3]) {
                n5 = n2 + n3 - i2;
                bl2 = true;
            }
            if (!bl2) continue;
            al al2 = this;
            al2.b(al2.f.array(), n2 + n3 - n5, n5);
            byteArrayOutputStream.write(this.f.array(), 0, i2);
            this.g();
        }
        return bl2;
    }

    private void b(byte[] byArray, int n2, int n3) {
        ((PushbackInputStream)this.d).unread(byArray, n2, n3);
        this.b(n3);
    }

    private void i() {
        int n2 = -1;
        boolean bl2 = false;
        while (bl2 || (n2 = this.j()) >= 0) {
            bl2 = false;
            if (!al.b(n2)) continue;
            n2 = this.j();
            if (n2 != ap.c[1]) {
                if (n2 == -1) break;
                bl2 = al.b(n2);
                continue;
            }
            n2 = this.j();
            if (n2 != ap.c[2]) {
                if (n2 == -1) break;
                bl2 = al.b(n2);
                continue;
            }
            n2 = this.j();
            if (n2 == -1 || n2 == ap.c[3]) break;
            bl2 = al.b(n2);
        }
    }

    private void c(long l2) {
        if (l2 >= 0L) {
            int n2;
            for (long i2 = 0L; i2 < l2; i2 += (long)n2) {
                long l3 = l2 - i2;
                n2 = this.d.read(this.n, 0, (int)(1024L > l3 ? l3 : 1024L));
                if (n2 == -1) {
                    return;
                }
                this.a(n2);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private int j() {
        int n2 = this.d.read();
        if (n2 != -1) {
            this.a(1);
        }
        return n2;
    }

    private static boolean b(int n2) {
        return n2 == ap.c[0];
    }

    private boolean a(byte[] byArray) {
        BigInteger bigInteger = ar.b(byArray).add(BigInteger.valueOf(8 - byArray.length - 16));
        byte[] byArray2 = new byte[16];
        try {
            if (bigInteger.signum() < 0) {
                int n2 = byArray.length + bigInteger.intValue();
                if (n2 < 8) {
                    return false;
                }
                int n3 = Math.abs(bigInteger.intValue());
                System.arraycopy(byArray, n2, byArray2, 0, Math.min(n3, 16));
                if (n3 < 16) {
                    this.a(byArray2, n3);
                }
            } else {
                while (bigInteger.compareTo(w) > 0) {
                    this.c(Long.MAX_VALUE);
                    bigInteger = bigInteger.add(w.negate());
                }
                this.c(bigInteger.longValue());
                this.a(byArray2, 0);
            }
        } catch (EOFException eOFException) {
            return false;
        }
        return Arrays.equals(byArray2, v);
    }

    static /* synthetic */ void a(al al2) {
        al2.a(1);
    }

    static /* synthetic */ ao b(al al2) {
        return al2.g;
    }

    static /* synthetic */ void a(al al2, int n2) {
        al2.a(n2);
    }
}

