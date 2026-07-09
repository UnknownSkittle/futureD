/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import org.bouncycastle.b.g;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ae;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.al;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.d;
import org.bouncycastle.openpgp.b.a.p;
import org.bouncycastle.openpgp.examples.a;

public class DetachedSignatureProcessor {
    private static void a(String object, InputStream object2, InputStream object3) {
        int n2;
        Object object4;
        object2 = ap.a((InputStream)object2);
        if ((object2 = new org.bouncycastle.openpgp.a.a((InputStream)object2).a()) instanceof org.bouncycastle.openpgp.a) {
            object4 = (org.bouncycastle.openpgp.a)object2;
            object2 = (al)new org.bouncycastle.openpgp.a.a(((org.bouncycastle.openpgp.a)object4).a()).a();
        } else {
            object2 = (al)object2;
        }
        object4 = new ae(ap.a((InputStream)object3), new org.bouncycastle.openpgp.b.a.a());
        object = new BufferedInputStream(new FileInputStream((String)object));
        object2 = ((al)object2).a();
        object3 = ((ae)object4).a(((aj)object2).c());
        ((aj)object2).a(new d().a("BC"), (ab)object3);
        while ((n2 = ((InputStream)object).read()) >= 0) {
            ((aj)object2).a((byte)n2);
        }
        ((InputStream)object).close();
        if (((aj)object2).a()) {
            System.out.println("signature verified.");
            return;
        }
        System.out.println("signature verification failed.");
    }

    private static void a(String string, String object, String object2, char[] cArray, boolean bl2) {
        object = new BufferedInputStream(new FileInputStream((String)object));
        object2 = new BufferedOutputStream(new FileOutputStream((String)object2));
        DetachedSignatureProcessor.a(string, (InputStream)object, (OutputStream)object2, cArray, bl2);
        ((OutputStream)object2).close();
        ((InputStream)object).close();
    }

    private static void a(String object, InputStream object2, OutputStream outputStream, char[] object3, boolean bl2) {
        int n2;
        if (bl2) {
            outputStream = new org.bouncycastle.b.b(outputStream);
        }
        object2 = a.a((InputStream)object2);
        object3 = ((ag)object2).a(new p().a("BC").a((char[])object3));
        object2 = new ak(new b(((ag)object2).b().e(), 2).a("BC"));
        ((ak)object2).a(0, (aa)object3);
        object3 = new g(outputStream);
        object = new BufferedInputStream(new FileInputStream((String)object));
        while ((n2 = ((InputStream)object).read()) >= 0) {
            ((ak)object2).a((byte)n2);
        }
        ((InputStream)object).close();
        ((ak)object2).c().a((OutputStream)object3);
        if (bl2) {
            outputStream.close();
        }
    }

    public static void main(String[] object) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        if (object[0].equals("-s")) {
            if (object[1].equals("-a")) {
                DetachedSignatureProcessor.a(object[2], object[3], object[2] + ".asc", object[4].toCharArray(), true);
                return;
            }
            DetachedSignatureProcessor.a(object[1], object[2], object[1] + ".bpg", object[3].toCharArray(), false);
            return;
        }
        if (object[0].equals("-v")) {
            Object object2 = object[3];
            Object object3 = object[2];
            object = object[1];
            object3 = new BufferedInputStream(new FileInputStream((String)object3));
            object2 = new BufferedInputStream(new FileInputStream((String)object2));
            DetachedSignatureProcessor.a((String)object, (InputStream)object3, (InputStream)object2);
            ((InputStream)object2).close();
            ((InputStream)object3).close();
            return;
        }
        System.err.println("usage: DetachedSignatureProcessor [-s [-a] file keyfile passPhrase]|[-v file sigFile keyFile]");
    }
}

