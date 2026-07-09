/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.b.d;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.b.h;

public final class b
extends c {
    private final DataInputStream a;
    private final String b;
    private final d c;
    private org.apache.commons.compress.archivers.b.c d = null;
    private InputStream e = null;

    public b(InputStream object, String object2) {
        this.a = new DataInputStream((InputStream)object);
        this.b = object2;
        try {
            object = this;
            byte[] byArray = ((b)object).c();
            object2 = byArray;
            if (byArray == null) {
                throw new IOException("Archive ends without any headers");
            }
            object2 = new DataInputStream(new ByteArrayInputStream((byte[])object2));
            int n2 = ((DataInputStream)object2).readUnsignedByte();
            Object object3 = new byte[n2 - 1];
            ((DataInputStream)object2).readFully((byte[])object3);
            object3 = new DataInputStream(new ByteArrayInputStream((byte[])object3));
            d d2 = new d();
            new d().a = ((DataInputStream)object3).readUnsignedByte();
            d2.b = ((DataInputStream)object3).readUnsignedByte();
            d2.c = ((DataInputStream)object3).readUnsignedByte();
            d2.d = ((DataInputStream)object3).readUnsignedByte();
            d2.e = ((DataInputStream)object3).readUnsignedByte();
            d2.f = ((DataInputStream)object3).readUnsignedByte();
            d2.g = ((DataInputStream)object3).readUnsignedByte();
            d2.h = super.c((DataInputStream)object3);
            d2.i = super.c((DataInputStream)object3);
            d2.j = 0xFFFFFFFFL & (long)super.c((DataInputStream)object3);
            d2.k = super.c((DataInputStream)object3);
            d2.l = super.b((DataInputStream)object3);
            d2.m = super.b((DataInputStream)object3);
            ((c)object).b(20L);
            d2.n = ((DataInputStream)object3).readUnsignedByte();
            d2.o = ((DataInputStream)object3).readUnsignedByte();
            if (n2 >= 33) {
                d2.p = ((DataInputStream)object3).readUnsignedByte();
                d2.q = ((DataInputStream)object3).readUnsignedByte();
                ((DataInputStream)object3).readUnsignedByte();
                ((DataInputStream)object3).readUnsignedByte();
            }
            d2.r = super.d((DataInputStream)object2);
            d2.s = super.d((DataInputStream)object2);
            InputStream inputStream = object;
            int n3 = super.b(((b)inputStream).a);
            if (n3 > 0) {
                d2.t = new byte[n3];
                InputStream inputStream2 = object;
                super.a(((b)inputStream2).a, d2.t);
                InputStream inputStream3 = object;
                long l2 = 0xFFFFFFFFL & (long)super.c(((b)inputStream3).a);
                object = new CRC32();
                object.update(d2.t);
                if (l2 != ((CRC32)object).getValue()) {
                    throw new IOException("Extended header CRC32 verification failure");
                }
            }
            ((b)object).c = d2;
            if ((this.c.d & 1) != 0) {
                throw new org.apache.commons.compress.archivers.b("Encrypted ARJ files are unsupported");
            }
            if ((this.c.d & 4) != 0) {
                throw new org.apache.commons.compress.archivers.b("Multi-volume ARJ files are unsupported");
            }
            return;
        } catch (IOException iOException) {
            throw new org.apache.commons.compress.archivers.b(iOException.getMessage(), iOException);
        }
    }

    public b(InputStream inputStream) {
        this(inputStream, "CP437");
    }

    @Override
    public final void close() {
        this.a.close();
    }

    private int a(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readUnsignedByte();
        this.a(1);
        return n2;
    }

    private int b(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readUnsignedShort();
        this.a(2);
        return Integer.reverseBytes(n2) >>> 16;
    }

    private int c(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readInt();
        this.a(4);
        return Integer.reverseBytes(n2);
    }

    private String d(DataInputStream dataInputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n2 = dataInputStream.readUnsignedByte()) != 0) {
            byteArrayOutputStream.write(n2);
        }
        if (this.b != null) {
            return new String(byteArrayOutputStream.toByteArray(), this.b);
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    private void a(DataInputStream dataInputStream, byte[] byArray) {
        dataInputStream.readFully(byArray);
        this.a(byArray.length);
    }

    private byte[] c() {
        boolean bl2 = false;
        byte[] byArray = null;
        do {
            int n2;
            b b2 = this;
            int n3 = b2.a(b2.a);
            do {
                n2 = n3;
                b b3 = this;
                n3 = b3.a(b3.a);
            } while (n2 != 96 && n3 != 234);
            b b4 = this;
            n2 = b4.b(b4.a);
            if (n2 == 0) {
                return null;
            }
            if (n2 > 2600) continue;
            byArray = new byte[n2];
            b b5 = this;
            b5.a(b5.a, byArray);
            b b6 = this;
            long l2 = (long)b6.c(b6.a) & 0xFFFFFFFFL;
            CRC32 cRC32 = new CRC32();
            cRC32.update(byArray);
            if (l2 != cRC32.getValue()) continue;
            bl2 = true;
        } while (!bl2);
        return byArray;
    }

    /*
     * Loose catch block
     */
    private org.apache.commons.compress.archivers.b.c d() {
        Object object = this.c();
        if (object == null) {
            return null;
        }
        object = new DataInputStream(new ByteArrayInputStream((byte[])object));
        Throwable throwable = null;
        int n2 = object.readUnsignedByte();
        Object object2 = new byte[n2 - 1];
        object.readFully((byte[])object2);
        object2 = new DataInputStream(new ByteArrayInputStream((byte[])object2));
        Throwable throwable2 = null;
        org.apache.commons.compress.archivers.b.c c2 = new org.apache.commons.compress.archivers.b.c();
        new org.apache.commons.compress.archivers.b.c().a = ((DataInputStream)object2).readUnsignedByte();
        c2.b = ((DataInputStream)object2).readUnsignedByte();
        c2.c = ((DataInputStream)object2).readUnsignedByte();
        c2.d = ((DataInputStream)object2).readUnsignedByte();
        c2.e = ((DataInputStream)object2).readUnsignedByte();
        c2.f = ((DataInputStream)object2).readUnsignedByte();
        c2.g = ((DataInputStream)object2).readUnsignedByte();
        c2.h = this.c((DataInputStream)object2);
        c2.i = 0xFFFFFFFFL & (long)this.c((DataInputStream)object2);
        c2.j = 0xFFFFFFFFL & (long)this.c((DataInputStream)object2);
        c2.k = 0xFFFFFFFFL & (long)this.c((DataInputStream)object2);
        c2.l = this.b((DataInputStream)object2);
        c2.m = this.b((DataInputStream)object2);
        this.b(20L);
        c2.n = ((DataInputStream)object2).readUnsignedByte();
        c2.o = ((DataInputStream)object2).readUnsignedByte();
        org.apache.commons.compress.archivers.b.c c3 = c2;
        Object object3 = object2;
        int n3 = n2;
        Object object4 = this;
        if (n3 >= 33) {
            c3.p = ((b)object4).c((DataInputStream)object3);
            if (n3 >= 45) {
                c3.q = ((b)object4).c((DataInputStream)object3);
                c3.r = super.c((DataInputStream)object3);
                c3.s = super.c((DataInputStream)object3);
                ((c)object4).b(12L);
            }
            ((c)object4).b(4L);
        }
        c2.t = this.d((DataInputStream)object);
        c2.u = this.d((DataInputStream)object);
        object4 = new ArrayList();
        while (true) {
            b b2 = this;
            n3 = b2.b(b2.a);
            if (n3 <= 0) break;
            byte[] byArray = new byte[n3];
            b b3 = this;
            b3.a(b3.a, byArray);
            b b4 = this;
            long l2 = 0xFFFFFFFFL & (long)b4.c(b4.a);
            object3 = new CRC32();
            object3.update(byArray);
            if (l2 != ((CRC32)object3).getValue()) {
                throw new IOException("Extended header CRC32 verification failure");
            }
            ((ArrayList)object4).add(byArray);
        }
        Object object5 = object4;
        c2.v = (byte[][])((ArrayList)object5).toArray((T[])new byte[((ArrayList)object5).size()][]);
        org.apache.commons.compress.archivers.b.c c4 = c2;
        ((FilterInputStream)object2).close();
        object.close();
        return c4;
        {
            catch (Throwable throwable3) {
                try {
                    try {
                        try {
                            Throwable throwable4 = throwable3;
                            throwable2 = throwable3;
                            throw throwable4;
                        } catch (Throwable throwable5) {
                            if (throwable2 != null) {
                                try {
                                    ((FilterInputStream)object2).close();
                                } catch (Throwable throwable6) {
                                    throwable2.addSuppressed(throwable6);
                                }
                            } else {
                                ((FilterInputStream)object2).close();
                            }
                            throw throwable5;
                        }
                    } catch (Throwable throwable7) {
                        Throwable throwable8 = throwable7;
                        throwable = throwable7;
                        throw throwable8;
                    }
                } catch (Throwable throwable9) {
                    if (throwable != null) {
                        try {
                            object.close();
                        } catch (Throwable throwable10) {
                            throwable.addSuppressed(throwable10);
                        }
                    } else {
                        object.close();
                    }
                    throw throwable9;
                }
            }
        }
    }

    public static boolean a(byte[] byArray, int n2) {
        return n2 >= 2 && (0xFF & byArray[0]) == 96 && (0xFF & byArray[1]) == 234;
    }

    @Override
    public final boolean a(a a2) {
        return a2 instanceof org.apache.commons.compress.archivers.b.a && ((org.apache.commons.compress.archivers.b.a)a2).a() == 0;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.d == null) {
            throw new IllegalStateException("No current arj entry");
        }
        if (this.d.e != 0) {
            throw new IOException("Unsupported compression method " + this.d.e);
        }
        return this.e.read(byArray, n2, n3);
    }

    @Override
    public final /* synthetic */ a a() {
        b b2 = this;
        if (b2.e != null) {
            h.a(b2.e, Long.MAX_VALUE);
            b2.e.close();
            b2.d = null;
            b2.e = null;
        }
        b2.d = b2.d();
        if (b2.d != null) {
            b2.e = new org.apache.commons.compress.b.c(b2.a, b2.d.i);
            if (b2.d.e == 0) {
                b2.e = new org.apache.commons.compress.b.d(b2.e, b2.d.j, b2.d.k);
            }
            return new org.apache.commons.compress.archivers.b.a(b2.d);
        }
        b2.e = null;
        return null;
    }
}

