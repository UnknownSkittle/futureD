/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.File;
import java.io.OutputStream;
import java.util.Date;
import org.bouncycastle.b.g;
import org.bouncycastle.e.k;
import org.bouncycastle.openpgp.ar;
import org.bouncycastle.openpgp.as;

public final class t
implements ar {
    private g a;
    private boolean b = false;

    private static void a(OutputStream outputStream, byte[] byArray, long l2) {
        outputStream.write(98);
        outputStream.write((byte)byArray.length);
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            outputStream.write(byArray[i2]);
        }
        long l3 = l2 / 1000L;
        outputStream.write((byte)(l3 >> 24));
        outputStream.write((byte)(l3 >> 16));
        outputStream.write((byte)(l3 >> 8));
        outputStream.write((byte)l3);
    }

    public final OutputStream a(OutputStream outputStream, String object, long l2, Date date) {
        if (this.a != null) {
            throw new IllegalStateException("generator already in open state");
        }
        object = k.a((String)object);
        this.a = new g(outputStream, 11, l2 + 2L + (long)((Object)object).length + 4L);
        t.a(this.a, (byte[])object, date.getTime());
        return new as(this.a, this);
    }

    public final OutputStream a(OutputStream object, String string, Date date, byte[] byArray) {
        if (this.a != null) {
            throw new IllegalStateException("generator already in open state");
        }
        this.a = new g((OutputStream)object, 11, byArray);
        object = k.a(string);
        t.a(this.a, (byte[])object, date.getTime());
        return new as(this.a, this);
    }

    public final OutputStream a(OutputStream outputStream, File file) {
        return this.a(outputStream, file.getName(), file.length(), new Date(file.lastModified()));
    }

    public final void a() {
        if (this.a != null) {
            this.a.a();
            this.a.flush();
            this.a = null;
        }
    }
}

