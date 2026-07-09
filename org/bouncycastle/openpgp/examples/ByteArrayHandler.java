/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;
import org.bouncycastle.b.b;
import org.bouncycastle.e.a.f;
import org.bouncycastle.openpgp.a;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.g;
import org.bouncycastle.openpgp.b.a.m;
import org.bouncycastle.openpgp.b.a.o;
import org.bouncycastle.openpgp.d;
import org.bouncycastle.openpgp.j;
import org.bouncycastle.openpgp.l;
import org.bouncycastle.openpgp.s;
import org.bouncycastle.openpgp.t;
import org.bouncycastle.openpgp.v;
import org.bouncycastle.openpgp.z;

public class ByteArrayHandler {
    private static byte[] a(byte[] object, char[] cArray) {
        object = ap.a(new ByteArrayInputStream((byte[])object));
        org.bouncycastle.openpgp.a.a a2 = new org.bouncycastle.openpgp.a.a((InputStream)object);
        object = a2;
        Object object2 = a2.a();
        object = object2 instanceof l ? (l)object2 : (l)((v)object).a();
        object = ((z)((l)object).a()).a(new m(new g().a("BC")).a("BC").a(cArray));
        object = (a)new org.bouncycastle.openpgp.a.a((InputStream)object).a();
        return org.bouncycastle.e.b.a.a(((s)new org.bouncycastle.openpgp.a.a(((a)object).a()).a()).b());
    }

    private static byte[] a(byte[] byArray, char[] object, String object2, int n2, boolean bl2) {
        OutputStream outputStream = new ByteArrayOutputStream();
        d d2 = new d(1);
        OutputStream outputStream2 = d2.a(outputStream);
        object2 = new t().a(outputStream2, (String)object2, byArray.length, new Date());
        ((OutputStream)object2).write(byArray);
        ((OutputStream)object2).close();
        d2.a();
        byArray = ((ByteArrayOutputStream)outputStream).toByteArray();
        object2 = new ByteArrayOutputStream();
        outputStream = object2;
        if (bl2) {
            outputStream = new b(outputStream);
        }
        j j2 = new j(new org.bouncycastle.openpgp.b.a.t(n2).a(new SecureRandom()).a("BC"));
        j2.a(new o((char[])object).a("BC"));
        OutputStream outputStream3 = j2.a(outputStream, byArray.length);
        object = outputStream3;
        outputStream3.write(byArray);
        ((OutputStream)object).close();
        if (bl2) {
            outputStream.close();
        }
        return ((ByteArrayOutputStream)object2).toByteArray();
    }

    public static void main(String[] objectArray) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        objectArray = "Dick Beck".toCharArray();
        byte[] byArray = "Hello world".getBytes();
        System.out.println("Starting PGP test");
        byte[] byArray2 = ByteArrayHandler.a(byArray, (char[])objectArray, "iway", 3, true);
        System.out.println("\nencrypted data = '" + new String(byArray2) + "'");
        byArray2 = ByteArrayHandler.a(byArray2, (char[])objectArray);
        System.out.println("\ndecrypted data = '" + new String(byArray2) + "'");
        byArray2 = ByteArrayHandler.a(byArray, (char[])objectArray, "iway", 9, false);
        System.out.println("\nencrypted data = '" + new String(f.b(byArray2)) + "'");
        byArray2 = ByteArrayHandler.a(byArray2, (char[])objectArray);
        System.out.println("\ndecrypted data = '" + new String(byArray2) + "'");
    }
}

