/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.b.v;
import org.bouncycastle.e.a;
import org.bouncycastle.e.a.c;
import org.bouncycastle.openpgp.aq;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.t;

public final class ap {
    private final String a;
    private final BigInteger b;

    public static String a(int n2) {
        switch (n2) {
            case 0: {
                return null;
            }
            case 2: {
                return "DESEDE";
            }
            case 1: {
                return "IDEA";
            }
            case 3: {
                return "CAST5";
            }
            case 4: {
                return "Blowfish";
            }
            case 5: {
                return "SAFER";
            }
            case 6: {
                return "DES";
            }
            case 7: {
                return "AES";
            }
            case 8: {
                return "AES";
            }
            case 9: {
                return "AES";
            }
            case 11: {
                return "Camellia";
            }
            case 12: {
                return "Camellia";
            }
            case 13: {
                return "Camellia";
            }
            case 10: {
                return "Twofish";
            }
        }
        throw new IllegalArgumentException("unknown symmetric algorithm: ".concat(String.valueOf(n2)));
    }

    static v[] a(byte[] object) {
        k k2;
        v[] vArray;
        object = new j((byte[])object);
        try {
            vArray = (v[])((j)object).b();
            object = (k)vArray.a(0);
            k2 = (k)vArray.a(1);
        } catch (IOException iOException) {
            throw new m("exception encoding signature", iOException);
        }
        v[] vArray2 = new v[2];
        vArray = vArray2;
        vArray2[0] = new v(((k)object).b());
        vArray[1] = new v(k2.b());
        return vArray;
    }

    public static byte[] a(int n2, SecureRandom secureRandom) {
        switch (n2) {
            case 2: {
                n2 = 192;
                break;
            }
            case 1: {
                n2 = 128;
                break;
            }
            case 3: {
                n2 = 128;
                break;
            }
            case 4: {
                n2 = 128;
                break;
            }
            case 5: {
                n2 = 128;
                break;
            }
            case 6: {
                n2 = 64;
                break;
            }
            case 7: {
                n2 = 128;
                break;
            }
            case 8: {
                n2 = 192;
                break;
            }
            case 9: {
                n2 = 256;
                break;
            }
            case 11: {
                n2 = 128;
                break;
            }
            case 12: {
                n2 = 192;
                break;
            }
            case 13: {
                n2 = 256;
                break;
            }
            case 10: {
                n2 = 256;
                break;
            }
            default: {
                throw new m("unknown symmetric algorithm: ".concat(String.valueOf(n2)));
            }
        }
        byte[] byArray = new byte[(n2 + 7) / 8];
        secureRandom.nextBytes(byArray);
        return byArray;
    }

    public static void a(OutputStream outputStream, File file) {
        outputStream = new t().a(outputStream, file);
        ap.a(file, outputStream, new byte[32768]);
    }

    public static void a(OutputStream outputStream, File file, byte[] byArray) {
        outputStream = new t().a(outputStream, file.getName(), new Date(file.lastModified()), byArray);
        ap.a(file, outputStream, byArray);
    }

    private static void a(File object, OutputStream outputStream, byte[] byArray) {
        object = new FileInputStream((File)object);
        try {
            int n2;
            while ((n2 = ((FileInputStream)object).read(byArray)) > 0) {
                outputStream.write(byArray, 0, n2);
            }
            outputStream.close();
        } catch (Throwable throwable) {
            org.bouncycastle.e.a.b(byArray);
            try {
                ((FileInputStream)object).close();
            } catch (IOException iOException) {}
            throw throwable;
        }
        org.bouncycastle.e.a.b(byArray);
        try {
            ((FileInputStream)object).close();
            return;
        } catch (IOException iOException) {
            return;
        }
    }

    private static boolean b(int n2) {
        return n2 >= 65 && n2 <= 90 || n2 >= 97 && n2 <= 122 || n2 >= 48 && n2 <= 57 || n2 == 43 || n2 == 47 || n2 == 13 || n2 == 10;
    }

    public static InputStream a(InputStream inputStream) {
        int n2;
        if (!inputStream.markSupported()) {
            inputStream = new aq(inputStream);
        }
        inputStream.mark(60);
        int n3 = inputStream.read();
        if ((n3 & 0x80) != 0) {
            inputStream.reset();
            return inputStream;
        }
        if (!ap.b(n3)) {
            inputStream.reset();
            return new org.bouncycastle.b.a(inputStream);
        }
        byte[] byArray = new byte[60];
        int n4 = 1;
        byArray[0] = (byte)n3;
        for (n2 = 1; n2 != 60 && (n3 = inputStream.read()) >= 0; ++n2) {
            if (!ap.b(n3)) {
                inputStream.reset();
                return new org.bouncycastle.b.a(inputStream);
            }
            if (n3 == 10 || n3 == 13) continue;
            byArray[n4++] = (byte)n3;
        }
        inputStream.reset();
        if (n2 < 4) {
            return new org.bouncycastle.b.a(inputStream);
        }
        byte[] byArray2 = new byte[8];
        System.arraycopy(byArray, 0, byArray2, 0, 8);
        try {
            if ((org.bouncycastle.e.a.a.a(byArray2)[0] & 0x80) != 0) {
                return new org.bouncycastle.b.a(inputStream, false);
            }
            return new org.bouncycastle.b.a(inputStream);
        } catch (c c2) {
            throw new IOException(c2.getMessage());
        }
    }

    public ap(String string, BigInteger bigInteger) {
        this.a = string;
        this.b = bigInteger;
    }

    public final String a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }
}

