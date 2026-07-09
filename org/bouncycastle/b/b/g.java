/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.b.ai;
import org.bouncycastle.e.k;

public final class g
extends ai {
    public g(boolean bl2, boolean bl3, byte[] byArray) {
        super(20, bl2, bl3, byArray);
    }

    public g(String string, String object) {
        String string2 = string;
        string = object;
        Object object2 = string2;
        object = new ByteArrayOutputStream();
        ((ByteArrayOutputStream)object).write(128);
        ((ByteArrayOutputStream)object).write(0);
        ((ByteArrayOutputStream)object).write(0);
        ((ByteArrayOutputStream)object).write(0);
        byte[] byArray = k.a((String)object2);
        int n2 = Math.min(byArray.length, 65535);
        if (n2 != byArray.length) {
            throw new IllegalArgumentException("notationName exceeds maximum length.");
        }
        byte[] byArray2 = k.a(string);
        object2 = byArray2;
        int n3 = Math.min(byArray2.length, 65535);
        if (n3 != ((Object)object2).length) {
            throw new IllegalArgumentException("notationValue exceeds maximum length.");
        }
        ((ByteArrayOutputStream)object).write(n2 >>> 8 & 0xFF);
        ((ByteArrayOutputStream)object).write(n2 & 0xFF);
        ((ByteArrayOutputStream)object).write(n3 >>> 8 & 0xFF);
        ((ByteArrayOutputStream)object).write(n3 & 0xFF);
        ((ByteArrayOutputStream)object).write(byArray, 0, n2);
        ((ByteArrayOutputStream)object).write((byte[])object2, 0, n3);
        super(20, true, false, ((ByteArrayOutputStream)object).toByteArray());
    }

    public final String b() {
        int n2 = ((this.a[4] & 0xFF) << 8) + (this.a[5] & 0xFF);
        byte[] byArray = new byte[n2];
        System.arraycopy(this.a, 8, byArray, 0, n2);
        return k.a(byArray);
    }

    public final String c() {
        g g2 = this;
        int n2 = ((g2.a[4] & 0xFF) << 8) + (g2.a[5] & 0xFF);
        int n3 = ((g2.a[6] & 0xFF) << 8) + (g2.a[7] & 0xFF);
        byte[] byArray = new byte[n3];
        System.arraycopy(g2.a, n2 + 8, byArray, 0, n3);
        return k.a(byArray);
    }
}

