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
import java.security.SecureRandom;
import java.security.Security;
import org.bouncycastle.b.b;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.o;
import org.bouncycastle.openpgp.b.a.t;
import org.bouncycastle.openpgp.examples.a;
import org.bouncycastle.openpgp.h;
import org.bouncycastle.openpgp.j;
import org.bouncycastle.openpgp.l;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.s;
import org.bouncycastle.openpgp.v;
import org.bouncycastle.openpgp.z;

public class PBEFileProcessor {
    private static void a(String object, String object2, char[] object3, boolean bl2, boolean bl3) {
        block4: {
            object = new BufferedOutputStream(new FileOutputStream((String)object));
            boolean bl4 = bl3;
            bl3 = bl2;
            Object object4 = object3;
            object3 = object2;
            object2 = object;
            if (bl3) {
                object2 = new b((OutputStream)object2);
            }
            try {
                object3 = a.a((String)object3);
                j j2 = new j(new t(3).a(bl4).a(new SecureRandom()).a("BC"));
                j2.a(new o((char[])object4).a("BC"));
                OutputStream outputStream = j2.a((OutputStream)object2, ((char[])object3).length);
                object4 = outputStream;
                outputStream.write((byte[])object3);
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
        if (object[0].equals("-e")) {
            if (object[1].equals("-a") || object[1].equals("-ai") || object[1].equals("-ia")) {
                PBEFileProcessor.a(object[2] + ".asc", object[2], object[3].toCharArray(), true, object[1].indexOf(105) > 0);
                return;
            }
            if (object[1].equals("-i")) {
                PBEFileProcessor.a(object[2] + ".bpg", object[2], object[3].toCharArray(), false, true);
                return;
            }
            PBEFileProcessor.a(object[1] + ".bpg", object[1], object[2].toCharArray(), false, false);
            return;
        }
        if (object[0].equals("-d")) {
            Object object2 = object[2].toCharArray();
            object = object[1];
            object = new BufferedInputStream(new FileInputStream((String)object));
            Object object3 = object2;
            object2 = ap.a((InputStream)object);
            org.bouncycastle.openpgp.a.a a2 = new org.bouncycastle.openpgp.a.a((InputStream)object2);
            object2 = a2;
            Object object4 = a2.a();
            object2 = object4 instanceof l ? (l)object4 : (l)((v)object2).a();
            object3 = ((z)(object2 = (z)((l)object2).a())).a(new org.bouncycastle.openpgp.b.a.m(new g().a("BC")).a("BC").a((char[])object3));
            object4 = new org.bouncycastle.openpgp.a.a((InputStream)object3).a();
            if (object4 instanceof org.bouncycastle.openpgp.a) {
                object3 = (org.bouncycastle.openpgp.a)object4;
                object4 = new org.bouncycastle.openpgp.a.a(((org.bouncycastle.openpgp.a)object3).a()).a();
            }
            s s2 = (s)object4;
            object3 = s2;
            object4 = s2.b();
            object3 = new BufferedOutputStream(new FileOutputStream(((s)object3).a()));
            org.bouncycastle.e.b.a.a((InputStream)object4, (OutputStream)object3);
            ((OutputStream)object3).close();
            if (((h)object2).a()) {
                if (!((h)object2).b()) {
                    System.err.println("message failed integrity check");
                } else {
                    System.err.println("message integrity check passed");
                }
            } else {
                System.err.println("no message integrity check");
            }
            ((InputStream)object).close();
            return;
        }
        System.err.println("usage: PBEFileProcessor -e [-ai]|-d file passPhrase");
    }
}

