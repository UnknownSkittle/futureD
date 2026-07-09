/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.g.ag;
import org.apache.commons.compress.archivers.g.ai;
import org.apache.commons.compress.archivers.g.aq;
import org.apache.commons.compress.archivers.g.ar;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;
import org.apache.commons.compress.archivers.g.j;
import org.apache.commons.compress.archivers.g.q;

public final class ap
extends d {
    private boolean d;
    private final List<ai> e;
    private final q f;
    private long g;
    private long h;
    private static final byte[] i = new byte[]{0, 0};
    private final Map<ai, aq> j;
    private final SeekableByteChannel k;
    private final OutputStream l;
    private boolean m;
    private final Calendar n;
    static final byte[] a;
    static final byte[] b;
    private static byte[] o;
    static final byte[] c;

    private void a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        int n2 = 0;
        Iterator<ai> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object object2;
            Object object3;
            int n3;
            Object object4;
            Object object5 = object4 = iterator.next();
            object4 = this;
            aq aq2 = ((ap)object4).j.get(object5);
            int n4 = ((ai)object5).a(ag.a) != null || ((ZipEntry)object5).getCompressedSize() >= 0xFFFFFFFFL || ((ai)object5).getSize() >= 0xFFFFFFFFL || aq.a(aq2) >= 0xFFFFFFFFL ? 1 : (n3 = 0);
            if (n4 != 0) {
            }
            int n5 = n3;
            long l2 = aq.a(aq2);
            ai ai2 = object5;
            Object object6 = object4;
            if (n5 != 0) {
                object3 = ai2;
                ((ap)object6).m = true;
                object2 = (ag)((ai)object3).a(ag.a);
                if (object2 == null) {
                    object2 = new ag();
                }
                ((ai)object3).a((au)object2);
                object = object2;
                if (ai2.getCompressedSize() >= 0xFFFFFFFFL || ai2.getSize() >= 0xFFFFFFFFL) {
                    ((ag)object).b(new ar(ai2.getCompressedSize()));
                    ((ag)object).a(new ar(ai2.getSize()));
                } else {
                    ((ag)object).b(null);
                    ((ag)object).a((ar)null);
                }
                if (l2 < 0xFFFFFFFFL) {
                } else {
                    ((ag)object).c(new ar(l2));
                }
                ai2.d();
            }
            ai2 = object5;
            n5 = n3;
            aq aq3 = aq2;
            ByteBuffer byteBuffer = ap.a(ai2).b(ai2.getName());
            object6 = object4;
            object = ai2.e();
            object2 = ai2.getComment();
            if (object2 == null) {
                object2 = "";
            }
            object3 = ap.a(ai2).b((String)object2);
            int n6 = byteBuffer.limit() - byteBuffer.position();
            int n7 = ((Buffer)object3).limit() - ((Buffer)object3).position();
            object5 = new byte[n6 + 46 + ((Object)object).length + n7];
            System.arraycopy(o, 0, object5, 0, 4);
            ax.a(ai2.c() << 8 | (!((ap)object6).m ? 20 : 45), (byte[])object5, 4);
            int n8 = ai2.getMethod();
            ((as)null).a(ai2.getName());
            boolean bl2 = aq.b(aq3);
            n3 = n5;
            n5 = n8;
            ax.a(n3 != 0 ? 45 : (bl2 ? 20 : (n5 == 8 ? 20 : 10)), (byte[])object5, 6);
            n3 = aq.b(aq3) ? 1 : 0;
            j j2 = new j();
            j2.b();
            if (n3 != 0) {
                j2.d();
            }
            j2.a((byte[])object5);
            ax.a(n8, (byte[])object5, 10);
            ay.a(((ap)object6).n, ai2.getTime(), (byte[])object5);
            av.a(ai2.getCrc(), (byte[])object5, 16);
            if (ai2.getCompressedSize() >= 0xFFFFFFFFL || ai2.getSize() >= 0xFFFFFFFFL) {
                av.d.a((byte[])object5, 20);
                av.d.a((byte[])object5, 24);
            } else {
                av.a(ai2.getCompressedSize(), (byte[])object5, 20);
                av.a(ai2.getSize(), (byte[])object5, 24);
            }
            ax.a(n6, (byte[])object5, 28);
            ax.a(((Object)object).length, (byte[])object5, 30);
            ax.a(n7, (byte[])object5, 32);
            System.arraycopy(i, 0, object5, 34, 2);
            ax.a(ai2.a(), (byte[])object5, 36);
            av.a(ai2.b(), (byte[])object5, 38);
            if (aq.a(aq3) >= 0xFFFFFFFFL) {
                av.a(0xFFFFFFFFL, (byte[])object5, 42);
            } else {
                av.a(Math.min(aq.a(aq3), 0xFFFFFFFFL), (byte[])object5, 42);
            }
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), object5, 46, n6);
            n8 = n6 + 46;
            System.arraycopy(object, 0, object5, n8, ((Object)object).length);
            System.arraycopy(((ByteBuffer)object3).array(), ((ByteBuffer)object3).arrayOffset(), object5, n8 += ((Object)object).length, n7);
            byteArrayOutputStream.write((byte[])object5);
            if (++n2 <= 1000) continue;
            this.a(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
            n2 = 0;
        }
        this.a(byteArrayOutputStream.toByteArray());
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        throw new IllegalStateException("No current entry");
    }

    private void a(byte[] byArray) {
        this.f.a(byArray);
    }

    @Override
    public final void close() {
        try {
            if (!this.d) {
                ap ap2 = this;
                if (ap2.d) {
                    throw new IOException("This archive has already been finished");
                }
                ap2.g = ap2.f.a();
                ap2.a();
                ap2.h = ap2.f.a() - ap2.g;
                ap ap3 = ap2;
                if (!(ap3.m || ap3.g < 0xFFFFFFFFL && ap3.h < 0xFFFFFFFFL && ap3.e.size() < 65535)) {
                    ap3.m = true;
                }
                if (ap3.m) {
                    long l2 = ap3.f.a();
                    ar.a(44L);
                    ax.a(45);
                    ax.a(45);
                    ar.a(ap3.e.size());
                    ar.a(ap3.h);
                    ar.a(ap3.g);
                    ar.a(l2);
                }
                ap3 = ap2;
                ap3.a(c);
                ap3.a(i);
                ap3.a(i);
                int n2 = ap3.e.size();
                if (n2 > 65535) {
                }
                if (ap3.g > 0xFFFFFFFFL) {
                }
                byte[] byArray = ax.a(Math.min(n2, 65535));
                ap3.a(byArray);
                ap3.a(byArray);
                ap ap4 = ap3;
                ap4.a(av.a(Math.min(ap4.h, 0xFFFFFFFFL)));
                ap ap5 = ap3;
                ap5.a(av.a(Math.min(ap5.g, 0xFFFFFFFFL)));
                ByteBuffer byteBuffer = ((as)null).b(null);
                n2 = byteBuffer.limit() - byteBuffer.position();
                ap3.a(ax.a(n2));
                q q2 = ap3.f;
                byteBuffer.array();
                byteBuffer.arrayOffset();
                q2.a(n2);
                ap2.j.clear();
                ap2.e.clear();
                ap2.f.close();
                ap2.d = true;
            }
            return;
        } finally {
            this.b();
        }
    }

    @Override
    public final void flush() {
        if (this.l != null) {
            this.l.flush();
        }
    }

    private static as a(ai ai2) {
        ((as)null).a(ai2.getName());
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b() {
        try {
            if (this.k != null) {
                this.k.close();
            }
            if (this.l == null) return;
        } catch (Throwable throwable) {
            if (this.l == null) throw throwable;
            this.l.close();
            throw throwable;
        }
        this.l.close();
    }

    static {
        av.a(1L);
        a = av.b.a();
        b = av.c.a();
        o = av.a.a();
        c = av.a(101010256L);
        av.a(101075792L);
        av.a(117853008L);
    }
}

