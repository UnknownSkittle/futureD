/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.io.UnsupportedEncodingException;
import org.apache.a.h.a.o;
import org.apache.a.h.a.t;

final class v
extends t {
    private byte[] a = new byte[8];
    private String b;
    private byte[] c;
    private int d;

    v(String object) {
        super((String)object);
        v v2 = this;
        v2.a(v2.a);
        this.d = this.a(20);
        if ((this.d & 1) == 0) {
            throw new o("NTLM type 2 message indicates no support for Unicode. Flags are: " + Integer.toString(this.d));
        }
        this.b = null;
        if (this.a() >= 20) {
            byte[] byArray = this.b(12);
            object = byArray;
            if (byArray.length != 0) {
                try {
                    this.b = new String((byte[])object, "UnicodeLittleUnmarked");
                } catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw new o(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
                }
            }
        }
        this.c = null;
        if (this.a() >= 48) {
            byte[] byArray = this.b(40);
            object = byArray;
            if (byArray.length != 0) {
                this.c = (byte[])object;
            }
        }
    }

    final byte[] c() {
        return this.a;
    }

    final String d() {
        return this.b;
    }

    final byte[] e() {
        return this.c;
    }

    final int f() {
        return this.d;
    }
}

