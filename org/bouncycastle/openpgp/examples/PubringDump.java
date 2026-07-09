/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.FileInputStream;
import java.security.Security;
import org.bouncycastle.c.a.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.ae;
import org.bouncycastle.openpgp.ap;

public class PubringDump {
    public static void main(String[] object) {
        Security.addProvider(new a());
        object = new ae(ap.a(new FileInputStream(object[0])), new org.bouncycastle.openpgp.b.a.a()).a();
        while (object.hasNext()) {
            Object object2 = (ad)object.next();
            try {
                ((ad)object2).a();
            } catch (Exception exception) {
                exception.printStackTrace();
                continue;
            }
            object2 = ((ad)object2).b();
            boolean bl2 = true;
            while (object2.hasNext()) {
                String string;
                ab ab2 = (ab)object2.next();
                if (bl2) {
                    System.out.println("Key ID: " + Long.toHexString(ab2.a()));
                    bl2 = false;
                } else {
                    System.out.println("Key ID: " + Long.toHexString(ab2.a()) + " (subkey)");
                }
                StringBuilder stringBuilder = new StringBuilder("            Algorithm: ");
                switch (ab2.e()) {
                    case 1: {
                        string = "RSA_GENERAL";
                        break;
                    }
                    case 2: {
                        string = "RSA_ENCRYPT";
                        break;
                    }
                    case 3: {
                        string = "RSA_SIGN";
                        break;
                    }
                    case 16: {
                        string = "ELGAMAL_ENCRYPT";
                        break;
                    }
                    case 17: {
                        string = "DSA";
                        break;
                    }
                    case 18: {
                        string = "ECDH";
                        break;
                    }
                    case 19: {
                        string = "ECDSA";
                        break;
                    }
                    case 20: {
                        string = "ELGAMAL_GENERAL";
                        break;
                    }
                    case 21: {
                        string = "DIFFIE_HELLMAN";
                        break;
                    }
                    default: {
                        string = "unknown";
                    }
                }
                System.out.println(stringBuilder.append(string).toString());
                System.out.println("            Fingerprint: " + new String(f.b(ab2.b())));
            }
        }
    }
}

