/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.Security;
import java.util.Iterator;
import org.bouncycastle.b.b.g;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.ah;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.am;
import org.bouncycastle.openpgp.an;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.p;

public class DirectKeySignature {
    public static void main(String[] object) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        if (((String[])object).length == 1) {
            Iterator iterator = new ad(ap.a(new FileInputStream(object[0])), new a()).a().g();
            while (iterator.hasNext()) {
                aj aj2 = (aj)iterator.next();
                System.out.println("Signature date is: " + aj2.e().b());
                object = aj2.e().a();
                for (int i2 = 0; i2 < ((Object[])object).length; ++i2) {
                    System.out.println("Found Notaion named '" + ((g)object[i2]).b() + "' with content '" + ((g)object[i2]).c() + "'.");
                }
            }
            return;
        }
        if (((String[])object).length == 5) {
            Object object2 = new ah(ap.a(new FileInputStream(object[0])), new a());
            Object object3 = object[1];
            Object object4 = new ad(ap.a(new FileInputStream(object[2])), new a());
            Object object5 = object[3];
            object = object[4];
            ag ag2 = ((ah)object2).a();
            String string = object3;
            ab ab2 = object4.a();
            Object object6 = object5;
            object5 = object;
            object4 = object6;
            object3 = ab2;
            object2 = string;
            object = ag2;
            object2 = ag2.a(new p().a("BC").a(((String)object2).toCharArray()));
            object = new ak(new b(((ag)object).b().e(), 2).a("BC"));
            ((ak)object).a(31, (aa)object2);
            object2 = new am();
            ((am)object2).a((String)object4, (String)object5);
            object2 = ((am)object2).a();
            ((ak)object).a((an)object2);
            object = ab.a((ab)object3, ((ak)object).c());
            object2 = new ByteArrayOutputStream();
            ((ab)object).b((OutputStream)object2);
            object2 = new ad(new ByteArrayInputStream(((ByteArrayOutputStream)object2).toByteArray()), new a());
            object = new org.bouncycastle.b.b(new FileOutputStream("SignedKey.asc"));
            ((ad)object2).a((OutputStream)object);
            ((org.bouncycastle.b.b)object).flush();
            ((org.bouncycastle.b.b)object).close();
            return;
        }
        System.err.println("usage: DirectKeySignature secretKeyFile secretKeyPass publicKeyFile(key to be signed) NotationName NotationValue");
        System.err.println("or: DirectKeySignature signedPublicKeyFile");
    }
}

