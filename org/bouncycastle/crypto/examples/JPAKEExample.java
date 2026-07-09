/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.examples;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.a.a.a;
import org.bouncycastle.crypto.a.a.b;
import org.bouncycastle.crypto.b.g;
import org.bouncycastle.crypto.j;
import org.bouncycastle.math.ec.a.c.bu;
import org.bouncycastle.math.ec.a.c.ca;
import org.bouncycastle.math.ec.a.c.ck;
import org.bouncycastle.openpgp.ap;

public class JPAKEExample {
    public static void main(String[] object) {
        object = b.a;
        Object object2 = ((a)object).a();
        Object object3 = ((a)object).b();
        Object object4 = ((a)object).c();
        Object object5 = "password";
        Object object6 = "password";
        System.out.println("********* Initialization **********");
        System.out.println("Public parameters for the cyclic group:");
        System.out.println("p (" + ((BigInteger)object2).bitLength() + " bits): " + ((BigInteger)object2).toString(16));
        System.out.println("q (" + ((BigInteger)object3).bitLength() + " bits): " + ((BigInteger)object3).toString(16));
        System.out.println("g (" + ((BigInteger)object2).bitLength() + " bits): " + ((BigInteger)object4).toString(16));
        System.out.println("p mod q = " + ((BigInteger)object2).mod((BigInteger)object3).toString(16));
        System.out.println("g^{q} mod p = " + ((BigInteger)object4).modPow((BigInteger)object3, (BigInteger)object2).toString(16));
        System.out.println("");
        System.out.println("(Secret passwords used by Alice and Bob: \"" + (String)object5 + "\" and \"" + (String)object6 + "\")\n");
        object2 = new g();
        object3 = new SecureRandom();
        object4 = new bu("alice", ((String)object5).toCharArray(), (a)object, (j)object2, (SecureRandom)object3);
        object = new bu("bob", ((String)object6).toCharArray(), (a)object, (j)object2, (SecureRandom)object3);
        object2 = ((bu)object4).a();
        object3 = ((bu)object).a();
        System.out.println("************ Round 1 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println("g^{x1}=" + ((ca)object2).b().toString(16));
        System.out.println("g^{x2}=" + ((ca)object2).c().toString(16));
        System.out.println("KP{x1}={" + ((ca)object2).d()[0].toString(16) + "};{" + ((ca)object2).d()[1].toString(16) + "}");
        System.out.println("KP{x2}={" + ((ca)object2).e()[0].toString(16) + "};{" + ((ca)object2).e()[1].toString(16) + "}");
        System.out.println("");
        System.out.println("Bob sends to Alice: ");
        System.out.println("g^{x3}=" + ((ca)object3).b().toString(16));
        System.out.println("g^{x4}=" + ((ca)object3).c().toString(16));
        System.out.println("KP{x3}={" + ((ca)object3).d()[0].toString(16) + "};{" + ((ca)object3).d()[1].toString(16) + "}");
        System.out.println("KP{x4}={" + ((ca)object3).e()[0].toString(16) + "};{" + ((ca)object3).e()[1].toString(16) + "}");
        System.out.println("");
        ((bu)object4).a((ca)object3);
        System.out.println("Alice checks g^{x4}!=1: OK");
        System.out.println("Alice checks KP{x3}: OK");
        System.out.println("Alice checks KP{x4}: OK");
        System.out.println("");
        ((bu)object).a((ca)object2);
        System.out.println("Bob checks g^{x2}!=1: OK");
        System.out.println("Bob checks KP{x1},: OK");
        System.out.println("Bob checks KP{x2},: OK");
        System.out.println("");
        object2 = ((bu)object4).b();
        object3 = ((bu)object).b();
        System.out.println("************ Round 2 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println("A=" + ((ck)object2).b().toString(16));
        System.out.println("KP{x2*s}={" + ((ck)object2).c()[0].toString(16) + "},{" + ((ck)object2).c()[1].toString(16) + "}");
        System.out.println("");
        System.out.println("Bob sends to Alice");
        System.out.println("B=" + ((ck)object3).b().toString(16));
        System.out.println("KP{x4*s}={" + ((ck)object3).c()[0].toString(16) + "},{" + ((ck)object3).c()[1].toString(16) + "}");
        System.out.println("");
        ((bu)object4).a((ck)object3);
        System.out.println("Alice checks KP{x4*s}: OK\n");
        ((bu)object).a((ck)object2);
        System.out.println("Bob checks KP{x2*s}: OK\n");
        object2 = ((bu)object4).c();
        object3 = ((bu)object).c();
        System.out.println("********* After round 2 ***********");
        System.out.println("Alice computes key material \t K=" + ((BigInteger)object2).toString(16));
        System.out.println("Bob computes key material \t K=" + ((BigInteger)object3).toString(16));
        System.out.println();
        JPAKEExample.a((BigInteger)object2);
        JPAKEExample.a((BigInteger)object3);
        object5 = ((bu)object4).b((BigInteger)object2);
        object6 = ((bu)object).b((BigInteger)object3);
        System.out.println("************ Round 3 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println("MacTag=" + ((ap)object5).b().toString(16));
        System.out.println("");
        System.out.println("Bob sends to Alice: ");
        System.out.println("MacTag=" + ((ap)object6).b().toString(16));
        System.out.println("");
        ((bu)object4).a((ap)object6, (BigInteger)object2);
        System.out.println("Alice checks MacTag: OK\n");
        ((bu)object).a((ap)object5, (BigInteger)object3);
        System.out.println("Bob checks MacTag: OK\n");
        System.out.println();
        System.out.println("MacTags validated, therefore the keying material matches.");
    }

    private static BigInteger a(BigInteger object) {
        g g2 = new g();
        object = ((BigInteger)object).toByteArray();
        byte[] byArray = new byte[g2.b()];
        g2.a((byte[])object, 0, ((Object)object).length);
        g2.a(byArray, 0);
        return new BigInteger(byArray);
    }
}

