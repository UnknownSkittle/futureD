/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.security.Security;
import org.bouncycastle.b.b;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ac;
import org.bouncycastle.openpgp.ai;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.ar;
import org.bouncycastle.openpgp.b.a.t;
import org.bouncycastle.openpgp.b.a.x;
import org.bouncycastle.openpgp.d;
import org.bouncycastle.openpgp.examples.a;
import org.bouncycastle.openpgp.j;
import org.bouncycastle.openpgp.l;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.s;
import org.bouncycastle.openpgp.v;
import org.bouncycastle.openpgp.y;

public class KeyBasedLargeFileProcessor {
    private static void a(InputStream object, InputStream object2, char[] cArray, String string) {
        object = ap.a((InputStream)object);
        try {
            object = new org.bouncycastle.openpgp.a.a((InputStream)object);
            Object object3 = ((v)object).a();
            object = object3 instanceof l ? (l)object3 : (l)((v)object).a();
            object = ((l)object).b();
            object3 = null;
            ac ac2 = null;
            object2 = new ai(ap.a((InputStream)object2), new org.bouncycastle.openpgp.b.a.a());
            while (object3 == null && object.hasNext()) {
                ac2 = (ac)object.next();
                object3 = a.a((ai)object2, ac2.c(), cArray);
            }
            if (object3 == null) {
                throw new IllegalArgumentException("secret key for message not found.");
            }
            object = ac2.a(new org.bouncycastle.openpgp.b.a.v().a("BC").a((aa)object3));
            object = (org.bouncycastle.openpgp.a)new org.bouncycastle.openpgp.a.a((InputStream)object).a();
            object = new BufferedInputStream(((org.bouncycastle.openpgp.a)object).a());
            if ((object = new org.bouncycastle.openpgp.a.a((InputStream)object).a()) instanceof s) {
                object2 = ((s)(object = (s)object)).a();
                if (((String)object2).length() == 0) {
                    object2 = string;
                }
            } else {
                if (object instanceof y) {
                    throw new m("encrypted message contains a signed message - not literal data.");
                }
                throw new m("message is not a simple encrypted file - type unknown.");
            }
            object = ((s)object).b();
            object2 = new BufferedOutputStream(new FileOutputStream((String)object2));
            org.bouncycastle.e.b.a.a((InputStream)object, (OutputStream)object2);
            ((OutputStream)object2).close();
            if (ac2.a()) {
                if (!ac2.b()) {
                    System.err.println("message failed integrity check");
                    return;
                }
                System.err.println("message integrity check passed");
                return;
            }
            System.err.println("no message integrity check");
            return;
        } catch (m m2) {
            System.err.println(m2);
            if (m2.a() != null) {
                m2.a().printStackTrace();
            }
            return;
        }
    }

    private static void a(String object, String object2, String object3, boolean bl2, boolean bl3) {
        block4: {
            object = new BufferedOutputStream(new FileOutputStream((String)object));
            object3 = a.b((String)object3);
            boolean bl4 = bl3;
            bl3 = bl2;
            Object object4 = object3;
            object3 = object2;
            object2 = object;
            if (bl3) {
                object2 = new b((OutputStream)object2);
            }
            try {
                ar ar2 = new j(new t(3).a(bl4).a(new SecureRandom()).a("BC"));
                ((j)ar2).a(new x((ab)object4).a("BC"));
                object4 = ((j)ar2).a((OutputStream)object2, new byte[65536]);
                ar2 = new d(1);
                ap.a(((d)ar2).a((OutputStream)object4), new File((String)object3), new byte[65536]);
                ((d)ar2).a();
                ((OutputStream)object4).close();
                if (bl3) {
                    ((OutputStream)object2).close();
                }
            } catch (m m2) {
                System.err.println(m2);
                if (m2.a() == null) break block4;
                m2.a().printStackTrace();
            }
        }
        ((OutputStream)object).close();
    }

    public static void main(String[] object) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        if (((String[])object).length == 0) {
            System.err.println("usage: KeyBasedLargeFileProcessor -e|-d [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
            return;
        }
        if (object[0].equals("-e")) {
            if (object[1].equals("-a") || object[1].equals("-ai") || object[1].equals("-ia")) {
                KeyBasedLargeFileProcessor.a(object[2] + ".asc", object[2], object[3], true, object[1].indexOf(105) > 0);
                return;
            }
            if (object[1].equals("-i")) {
                KeyBasedLargeFileProcessor.a(object[2] + ".bpg", object[2], object[3], false, true);
                return;
            }
            KeyBasedLargeFileProcessor.a(object[1] + ".bpg", object[1], object[2], false, false);
            return;
        }
        if (object[0].equals("-d")) {
            String string = new File(object[1]).getName() + ".out";
            char[] cArray = object[3].toCharArray();
            Object object2 = object[2];
            object = object[1];
            object = new BufferedInputStream(new FileInputStream((String)object));
            object2 = new BufferedInputStream(new FileInputStream((String)object2));
            KeyBasedLargeFileProcessor.a((InputStream)object, (InputStream)object2, cArray, string);
            ((InputStream)object2).close();
            ((InputStream)object).close();
            return;
        }
        System.err.println("usage: KeyBasedLargeFileProcessor -d|-e [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
    }
}

