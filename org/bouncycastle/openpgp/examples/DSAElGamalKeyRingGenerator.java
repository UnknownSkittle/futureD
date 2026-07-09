/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.c.a.a;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.k;
import org.bouncycastle.openpgp.b.a.r;
import org.bouncycastle.openpgp.o;
import org.bouncycastle.openpgp.q;

public class DSAElGamalKeyRingGenerator {
    private static void a(OutputStream outputStream, OutputStream outputStream2, KeyPair object, KeyPair object2, String string, char[] cArray, boolean bl2) {
        if (bl2) {
            outputStream = new org.bouncycastle.b.b(outputStream);
        }
        object = new k(17, (KeyPair)object, new Date());
        object2 = new k(16, (KeyPair)object2, new Date());
        org.bouncycastle.openpgp.b.o o2 = new g().a(2);
        object = new q((o)object, string, o2, new b(((o)object).a().e(), 2), new r(9, o2).a("BC").a(cArray));
        ((q)object).a((o)object2);
        ((q)object).a().a(outputStream);
        outputStream.close();
        if (bl2) {
            outputStream2 = new org.bouncycastle.b.b(outputStream2);
        }
        ((q)object).b().a(outputStream2);
        outputStream2.close();
    }

    public static void main(String[] stringArray) {
        Security.addProvider(new a());
        if (stringArray.length < 2) {
            System.out.println("DSAElGamalKeyRingGenerator [-a] identity passPhrase");
            System.exit(0);
        }
        Object object = KeyPairGenerator.getInstance("DSA", "BC");
        ((KeyPairGenerator)object).initialize(1024);
        object = ((KeyPairGenerator)object).generateKeyPair();
        Object object2 = KeyPairGenerator.getInstance("ELGAMAL", "BC");
        Object object3 = new BigInteger("153d5d6172adb43045b68ae8e1de1070b6137005686d29d3d73a7749199681ee5b212c9b96bfdcfa5b20cd5e3fd2044895d609cf9b410b7a0f12ca1cb9a428cc", 16);
        Object object4 = new BigInteger("9494fec095f3b85ee286542b3836fc81a5dd0a0349b4c239dd38744d488cf8e31db8bcb7d33b41abb9e5a33cca9144b1cef332c94bf0573bf047a3aca98cdf3b", 16);
        object3 = new DHParameterSpec((BigInteger)object4, (BigInteger)object3);
        ((KeyPairGenerator)object2).initialize((AlgorithmParameterSpec)object3);
        object2 = ((KeyPairGenerator)object2).generateKeyPair();
        if (stringArray[0].equals("-a")) {
            if (stringArray.length < 3) {
                System.out.println("DSAElGamalKeyRingGenerator [-a] identity passPhrase");
                System.exit(0);
            }
            object3 = new FileOutputStream("secret.asc");
            object4 = new FileOutputStream("pub.asc");
            DSAElGamalKeyRingGenerator.a((OutputStream)object3, (OutputStream)object4, (KeyPair)object, (KeyPair)object2, stringArray[1], stringArray[2].toCharArray(), true);
            return;
        }
        object3 = new FileOutputStream("secret.bpg");
        object4 = new FileOutputStream("pub.bpg");
        DSAElGamalKeyRingGenerator.a((OutputStream)object3, (OutputStream)object4, (KeyPair)object, (KeyPair)object2, stringArray[0], stringArray[1].toCharArray(), false);
    }
}

