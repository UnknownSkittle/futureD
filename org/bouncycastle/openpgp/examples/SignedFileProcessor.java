/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.File;
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
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.al;
import org.bouncycastle.openpgp.am;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.p;
import org.bouncycastle.openpgp.d;
import org.bouncycastle.openpgp.examples.a;
import org.bouncycastle.openpgp.s;
import org.bouncycastle.openpgp.t;
import org.bouncycastle.openpgp.v;
import org.bouncycastle.openpgp.x;
import org.bouncycastle.openpgp.y;

public class SignedFileProcessor {
    private static void a(InputStream object, InputStream object2) {
        int n2;
        object = ap.a((InputStream)object);
        object = (org.bouncycastle.openpgp.a)new org.bouncycastle.openpgp.a.a((InputStream)object).a();
        object = new org.bouncycastle.openpgp.a.a(((org.bouncycastle.openpgp.a)object).a());
        x x2 = ((y)((v)object).a()).a();
        Object object3 = (s)((v)object).a();
        InputStream inputStream = ((s)object3).b();
        object2 = new ae(ap.a((InputStream)object2), new org.bouncycastle.openpgp.b.a.a()).a(x2.a());
        object3 = new FileOutputStream(((s)object3).a());
        x2.a(new org.bouncycastle.openpgp.b.a.d().a("BC"), (ab)object2);
        while ((n2 = inputStream.read()) >= 0) {
            x2.a((byte)n2);
            ((FileOutputStream)object3).write(n2);
        }
        ((FileOutputStream)object3).close();
        object = (al)((v)object).a();
        if (x2.a(((al)object).a())) {
            System.out.println("signature verified.");
            return;
        }
        System.out.println("signature verification failed.");
    }

    private static void a(String object, InputStream object2, OutputStream outputStream, char[] object3, boolean bl2) {
        int n2;
        if (bl2) {
            outputStream = new org.bouncycastle.b.b(outputStream);
        }
        object2 = a.a((InputStream)object2);
        object3 = ((ag)object2).a(new p().a("BC").a((char[])object3));
        ak ak2 = new ak(new b(((ag)object2).b().e(), 2).a("BC"));
        ak2.a(0, (aa)object3);
        object2 = ((ag)object2).b().f();
        if (object2.hasNext()) {
            am am2 = new am();
            object3 = am2;
            am2.a(object2.next());
            ak2.a(((am)object3).a());
        }
        object3 = new d(2);
        object2 = new g(((d)object3).a(outputStream));
        ak2.b().a((OutputStream)object2);
        object = new File((String)object);
        t t2 = new t();
        OutputStream outputStream2 = t2.a((OutputStream)object2, (File)object);
        object = new FileInputStream((File)object);
        while ((n2 = ((FileInputStream)object).read()) >= 0) {
            outputStream2.write(n2);
            ak2.a((byte)n2);
        }
        t2.a();
        ak2.c().a((OutputStream)object2);
        ((d)object3).a();
        if (bl2) {
            outputStream.close();
        }
    }

    public static void main(String[] stringArray) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        if (stringArray[0].equals("-s")) {
            if (stringArray[1].equals("-a")) {
                FileInputStream fileInputStream = new FileInputStream(stringArray[3]);
                FileOutputStream fileOutputStream = new FileOutputStream(stringArray[2] + ".asc");
                SignedFileProcessor.a(stringArray[2], fileInputStream, fileOutputStream, stringArray[4].toCharArray(), true);
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(stringArray[2]);
            FileOutputStream fileOutputStream = new FileOutputStream(stringArray[1] + ".bpg");
            SignedFileProcessor.a(stringArray[1], fileInputStream, fileOutputStream, stringArray[3].toCharArray(), false);
            return;
        }
        if (stringArray[0].equals("-v")) {
            FileInputStream fileInputStream = new FileInputStream(stringArray[1]);
            FileInputStream fileInputStream2 = new FileInputStream(stringArray[2]);
            SignedFileProcessor.a(fileInputStream, fileInputStream2);
            return;
        }
        System.err.println("usage: SignedFileProcessor -v|-s [-a] file keyfile [passPhrase]");
    }
}

