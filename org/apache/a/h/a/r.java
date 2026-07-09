/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.security.MessageDigest;
import org.apache.a.h.a.o;

final class r {
    private byte[] a;
    private byte[] b;
    private MessageDigest c;

    r(byte[] byArray) {
        int n2;
        try {
            this.c = MessageDigest.getInstance("MD5");
        } catch (Exception exception) {
            throw new o("Error getting md5 message digest implementation: " + exception.getMessage(), exception);
        }
        this.a = new byte[64];
        this.b = new byte[64];
        int n3 = byArray.length;
        if (n3 > 64) {
            this.c.update(byArray);
            byArray = this.c.digest();
            n3 = byArray.length;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            this.a[n2] = (byte)(byArray[n2] ^ 0x36);
            this.b[n2] = (byte)(byArray[n2] ^ 0x5C);
        }
        while (n2 < 64) {
            this.a[n2] = 54;
            this.b[n2] = 92;
            ++n2;
        }
        this.c.reset();
        this.c.update(this.a);
    }

    final byte[] a() {
        byte[] byArray = this.c.digest();
        this.c.update(this.b);
        return this.c.digest(byArray);
    }

    final void a(byte[] byArray) {
        this.c.update(byArray);
    }
}

