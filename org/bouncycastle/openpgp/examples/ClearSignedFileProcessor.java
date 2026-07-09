/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import org.bouncycastle.b.g;
import org.bouncycastle.e.k;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ae;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.al;
import org.bouncycastle.openpgp.am;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.b;
import org.bouncycastle.openpgp.b.a.d;
import org.bouncycastle.openpgp.b.a.p;
import org.bouncycastle.openpgp.examples.a;

public class ClearSignedFileProcessor {
    private static int a(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) {
        int n2;
        byteArrayOutputStream.reset();
        int n3 = -1;
        while ((n2 = inputStream.read()) >= 0) {
            byteArrayOutputStream.write(n2);
            if (n2 != 13 && n2 != 10) continue;
            n3 = ClearSignedFileProcessor.b(byteArrayOutputStream, n2, inputStream);
            break;
        }
        return n3;
    }

    private static int a(ByteArrayOutputStream byteArrayOutputStream, int n2, InputStream inputStream) {
        byteArrayOutputStream.reset();
        int n3 = n2;
        do {
            byteArrayOutputStream.write(n3);
            if (n3 != 13 && n3 != 10) continue;
            n2 = ClearSignedFileProcessor.b(byteArrayOutputStream, n3, inputStream);
            break;
        } while ((n3 = inputStream.read()) >= 0);
        if (n3 < 0) {
            n2 = -1;
        }
        return n2;
    }

    private static int b(ByteArrayOutputStream byteArrayOutputStream, int n2, InputStream inputStream) {
        int n3 = inputStream.read();
        if (n2 == 13 && n3 == 10) {
            byteArrayOutputStream.write(n3);
            n3 = inputStream.read();
        }
        return n3;
    }

    private static void a(InputStream object, InputStream object2, String string) {
        Object object3;
        object = new org.bouncycastle.b.a((InputStream)object);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = ClearSignedFileProcessor.a(byteArrayOutputStream, (InputStream)object);
        byte[] byArray = ClearSignedFileProcessor.a();
        if (n2 != -1 && ((org.bouncycastle.b.a)object).a()) {
            object3 = byteArrayOutputStream.toByteArray();
            ((OutputStream)bufferedOutputStream).write((byte[])object3, 0, ClearSignedFileProcessor.a(object3));
            ((OutputStream)bufferedOutputStream).write(byArray);
            while (n2 != -1 && ((org.bouncycastle.b.a)object).a()) {
                n2 = ClearSignedFileProcessor.a(byteArrayOutputStream, n2, (InputStream)object);
                object3 = byteArrayOutputStream.toByteArray();
                ((OutputStream)bufferedOutputStream).write((byte[])object3, 0, ClearSignedFileProcessor.a(object3));
                ((OutputStream)bufferedOutputStream).write(byArray);
            }
        } else if (n2 != -1) {
            object3 = byteArrayOutputStream.toByteArray();
            ((OutputStream)bufferedOutputStream).write((byte[])object3, 0, ClearSignedFileProcessor.a(object3));
            ((OutputStream)bufferedOutputStream).write(byArray);
        }
        ((OutputStream)bufferedOutputStream).close();
        object3 = new ae((InputStream)object2, new org.bouncycastle.openpgp.b.a.a());
        object = ((al)new org.bouncycastle.openpgp.a.a((InputStream)object).a()).a();
        object2 = object3.a(((aj)object).c());
        ((aj)object).a(new d().a("BC"), (ab)object2);
        object2 = new BufferedInputStream(new FileInputStream(string));
        n2 = ClearSignedFileProcessor.a(byteArrayOutputStream, (InputStream)object2);
        ClearSignedFileProcessor.a((aj)object, byteArrayOutputStream.toByteArray());
        if (n2 != -1) {
            do {
                n2 = ClearSignedFileProcessor.a(byteArrayOutputStream, n2, (InputStream)object2);
                ((aj)object).a((byte)13);
                ((aj)object).a((byte)10);
                ClearSignedFileProcessor.a((aj)object, byteArrayOutputStream.toByteArray());
            } while (n2 != -1);
        }
        ((InputStream)object2).close();
        if (((aj)object).a()) {
            System.out.println("signature verified.");
            return;
        }
        System.out.println("signature verification failed.");
    }

    private static byte[] a() {
        String string = k.b();
        byte[] byArray = new byte[string.length()];
        for (int i2 = 0; i2 != byArray.length; ++i2) {
            byArray[i2] = (byte)string.charAt(i2);
        }
        return byArray;
    }

    private static void a(String object, InputStream object2, OutputStream outputStream, char[] object3, String string) {
        int n2 = string.equals("SHA256") ? 8 : (string.equals("SHA384") ? 9 : (string.equals("SHA512") ? 10 : (string.equals("MD5") ? 1 : (string.equals("RIPEMD160") ? 3 : 2))));
        object2 = a.a((InputStream)object2);
        object3 = ((ag)object2).a(new p().a("BC").a((char[])object3));
        ak ak2 = new ak(new b(((ag)object2).b().e(), n2).a("BC"));
        am am2 = new am();
        ak2.a(1, (aa)object3);
        object2 = ((ag)object2).b().f();
        if (object2.hasNext()) {
            am2.a(object2.next());
            ak2.a(am2.a());
        }
        object = new BufferedInputStream(new FileInputStream((String)object));
        object2 = new org.bouncycastle.b.b(outputStream);
        ((org.bouncycastle.b.b)object2).a(n2);
        outputStream = new ByteArrayOutputStream();
        int n3 = ClearSignedFileProcessor.a((ByteArrayOutputStream)outputStream, (InputStream)object);
        ClearSignedFileProcessor.a((OutputStream)object2, ak2, ((ByteArrayOutputStream)outputStream).toByteArray());
        if (n3 != -1) {
            do {
                n3 = ClearSignedFileProcessor.a((ByteArrayOutputStream)outputStream, n3, (InputStream)object);
                ak2.a((byte)13);
                ak2.a((byte)10);
                ClearSignedFileProcessor.a((OutputStream)object2, ak2, ((ByteArrayOutputStream)outputStream).toByteArray());
            } while (n3 != -1);
        }
        ((InputStream)object).close();
        ((org.bouncycastle.b.b)object2).a();
        object = new g((OutputStream)object2);
        ak2.c().a((OutputStream)object);
        ((org.bouncycastle.b.b)object2).close();
    }

    private static void a(aj aj2, byte[] byArray) {
        int n2 = ClearSignedFileProcessor.b(byArray);
        if (n2 > 0) {
            aj2.a(byArray, n2);
        }
    }

    private static void a(OutputStream outputStream, ak ak2, byte[] byArray) {
        int n2 = ClearSignedFileProcessor.b(byArray);
        if (n2 > 0) {
            ak2.a(byArray, n2);
        }
        outputStream.write(byArray, 0, byArray.length);
    }

    private static int a(byte[] byArray) {
        int n2;
        for (n2 = byArray.length - 1; n2 >= 0 && ClearSignedFileProcessor.b(byArray[n2]); --n2) {
        }
        return n2 + 1;
    }

    private static boolean a(byte by2) {
        return by2 == 13 || by2 == 10;
    }

    private static int b(byte[] byArray) {
        int n2;
        for (n2 = byArray.length - 1; n2 >= 0 && ClearSignedFileProcessor.b(byArray[n2]); --n2) {
        }
        return n2 + 1;
    }

    private static boolean b(byte by2) {
        return ClearSignedFileProcessor.a(by2) || by2 == 9 || by2 == 32;
    }

    public static void main(String[] stringArray) {
        Security.addProvider(new org.bouncycastle.c.a.a());
        if (stringArray[0].equals("-s")) {
            InputStream inputStream = ap.a(new FileInputStream(stringArray[2]));
            FileOutputStream fileOutputStream = new FileOutputStream(stringArray[1] + ".asc");
            if (stringArray.length == 4) {
                ClearSignedFileProcessor.a(stringArray[1], inputStream, fileOutputStream, stringArray[3].toCharArray(), "SHA1");
                return;
            }
            ClearSignedFileProcessor.a(stringArray[1], inputStream, fileOutputStream, stringArray[3].toCharArray(), stringArray[4]);
            return;
        }
        if (stringArray[0].equals("-v")) {
            if (stringArray[1].indexOf(".asc") < 0) {
                System.err.println("file needs to end in \".asc\"");
                System.exit(1);
            }
            FileInputStream fileInputStream = new FileInputStream(stringArray[1]);
            InputStream inputStream = ap.a(new FileInputStream(stringArray[2]));
            ClearSignedFileProcessor.a(fileInputStream, inputStream, stringArray[1].substring(0, stringArray[1].length() - 4));
            return;
        }
        System.err.println("usage: ClearSignedFileProcessor [-s file keyfile passPhrase]|[-v sigFile keyFile]");
    }
}

