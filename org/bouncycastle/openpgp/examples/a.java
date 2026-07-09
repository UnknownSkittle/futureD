/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.ae;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.ah;
import org.bouncycastle.openpgp.ai;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.p;
import org.bouncycastle.openpgp.d;

final class a {
    static byte[] a(String string) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d d2 = new d(1);
        ap.a(d2.a(byteArrayOutputStream), new File(string));
        d2.a();
        return byteArrayOutputStream.toByteArray();
    }

    static aa a(ai object, long l2, char[] cArray) {
        if ((object = ((ai)object).a(l2)) == null) {
            return null;
        }
        return ((ag)object).a(new p().a("BC").a(cArray));
    }

    static ab b(String object) {
        object = new BufferedInputStream(new FileInputStream((String)object));
        ab ab2 = a.b((InputStream)object);
        ((InputStream)object).close();
        return ab2;
    }

    private static ab b(InputStream object) {
        object = new ae(ap.a((InputStream)object), new org.bouncycastle.openpgp.b.a.a()).a();
        while (object.hasNext()) {
            Iterator<ab> iterator = ((ad)object.next()).b();
            while (iterator.hasNext()) {
                ab ab2 = iterator.next();
                if (!ab2.c()) continue;
                return ab2;
            }
        }
        throw new IllegalArgumentException("Can't find encryption key in key ring.");
    }

    static ag a(InputStream object) {
        object = new ai(ap.a((InputStream)object), new org.bouncycastle.openpgp.b.a.a()).a();
        while (object.hasNext()) {
            Iterator<ag> iterator = ((ah)object.next()).b();
            while (iterator.hasNext()) {
                ag ag2 = iterator.next();
                if (!ag2.a()) continue;
                return ag2;
            }
        }
        throw new IllegalArgumentException("Can't find signing key in key ring.");
    }
}

