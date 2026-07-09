/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.util.Date;
import org.bouncycastle.c.a.a;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.k;
import org.bouncycastle.openpgp.b.a.r;
import org.bouncycastle.openpgp.o;

public class RSAKeyPairGenerator {
    private static void a(OutputStream outputStream, OutputStream outputStream2, KeyPair object, String string, char[] cArray, boolean bl2) {
        if (bl2) {
            outputStream = new org.bouncycastle.b.b(outputStream);
        }
        org.bouncycastle.openpgp.b.o o2 = new g().a(2);
        object = new k(1, (KeyPair)object, new Date());
        object = new ag(16, (o)object, string, o2, new b(((o)object).a().e(), 2), new r(3, o2).a("BC").a(cArray));
        ((ag)object).a(outputStream);
        outputStream.close();
        if (bl2) {
            outputStream2 = new org.bouncycastle.b.b(outputStream2);
        }
        ((ag)object).b().a(outputStream2);
        outputStream2.close();
    }

    public static void main(String[] stringArray) {
        Security.addProvider(new a());
        Object object = KeyPairGenerator.getInstance("RSA", "BC");
        ((KeyPairGenerator)object).initialize(1024);
        object = ((KeyPairGenerator)object).generateKeyPair();
        if (stringArray.length < 2) {
            System.out.println("RSAKeyPairGenerator [-a] identity passPhrase");
            System.exit(0);
        }
        if (stringArray[0].equals("-a")) {
            if (stringArray.length < 3) {
                System.out.println("RSAKeyPairGenerator [-a] identity passPhrase");
                System.exit(0);
            }
            FileOutputStream fileOutputStream = new FileOutputStream("secret.asc");
            FileOutputStream fileOutputStream2 = new FileOutputStream("pub.asc");
            RSAKeyPairGenerator.a(fileOutputStream, fileOutputStream2, (KeyPair)object, stringArray[1], stringArray[2].toCharArray(), true);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream("secret.bpg");
        FileOutputStream fileOutputStream3 = new FileOutputStream("pub.bpg");
        RSAKeyPairGenerator.a(fileOutputStream, fileOutputStream3, (KeyPair)object, stringArray[0], stringArray[1].toCharArray(), false);
    }
}

