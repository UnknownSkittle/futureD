/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.compress.archivers.sevenz.f;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.x;

final class h
extends f {
    private final byte[] b = new byte[8192];

    @Override
    public final void a(x x2, w w2) {
        Object object = new File(w2.getName());
        if (w2.b()) {
            if (!((File)object).isDirectory() && !((File)object).mkdirs()) {
                throw new IOException("Cannot create directory ".concat(String.valueOf(object)));
            }
            System.out.println("created directory ".concat(String.valueOf(object)));
            return;
        }
        System.out.println("extracting to ".concat(String.valueOf(object)));
        Serializable serializable = ((File)object).getParentFile();
        if (serializable != null && !((File)serializable).exists() && !((File)serializable).mkdirs()) {
            throw new IOException("Cannot create ".concat(String.valueOf(serializable)));
        }
        object = new FileOutputStream((File)object);
        serializable = null;
        try {
            int n2;
            long l2 = w2.j();
            for (long i2 = 0L; i2 < l2; i2 += (long)n2) {
                n2 = (int)Math.min(l2 - i2, 8192L);
                if ((n2 = x2.a(this.b, n2)) <= 0) {
                    throw new IOException("reached end of entry " + w2.getName() + " after " + i2 + " bytes, expected " + l2);
                }
                ((FileOutputStream)object).write(this.b, 0, n2);
            }
        } catch (Throwable throwable) {
            try {
                Throwable throwable2 = throwable;
                serializable = throwable;
                throw throwable2;
            } catch (Throwable throwable3) {
                if (serializable != null) {
                    try {
                        ((FileOutputStream)object).close();
                    } catch (Throwable throwable4) {
                        ((Throwable)serializable).addSuppressed(throwable4);
                    }
                } else {
                    ((FileOutputStream)object).close();
                }
                throw throwable3;
            }
        }
        ((FileOutputStream)object).close();
        return;
    }
}

