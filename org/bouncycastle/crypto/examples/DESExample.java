/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.e.b;
import org.bouncycastle.crypto.i.h;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bo;

public class DESExample {
    private boolean a = true;
    private org.bouncycastle.crypto.h.b b = null;
    private BufferedInputStream c = null;
    private BufferedOutputStream d = null;
    private byte[] e = null;

    public static void main(String[] object) {
        Object object2;
        boolean bl2 = true;
        if (((String[])object).length < 2) {
            object2 = new DESExample();
            System.err.println("Usage: java " + object2.getClass().getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String string = "deskey.dat";
        object2 = object[0];
        String string2 = object[1];
        if (((String[])object).length > 2) {
            bl2 = false;
            string = object[2];
        }
        object = new DESExample((String)object2, string2, string, bl2);
        new DESExample((String)object2, string2, string, bl2).b = new org.bouncycastle.crypto.h.b(new ad(new b()));
        if (((DESExample)object).a) {
            Object object3 = object;
            super.a(((DESExample)object3).e);
        } else {
            Object object4 = object;
            super.b(((DESExample)object4).e);
        }
        try {
            ((DESExample)object).c.close();
            ((DESExample)object).d.flush();
            ((DESExample)object).d.close();
            return;
        } catch (IOException iOException) {
            System.err.println("exception closing resources: " + iOException.getMessage());
            return;
        }
    }

    public DESExample() {
    }

    private DESExample(String object, String object2, String string, boolean bl2) {
        this.a = bl2;
        try {
            this.c = new BufferedInputStream(new FileInputStream((String)object));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Input file not found [" + (String)object + "]");
            System.exit(1);
        }
        try {
            this.d = new BufferedOutputStream(new FileOutputStream((String)object2));
        } catch (IOException iOException) {
            System.err.println("Output file not created [" + (String)object2 + "]");
            System.exit(1);
        }
        if (bl2) {
            try {
                object = null;
                try {
                    object = new SecureRandom();
                    ((SecureRandom)object).setSeed("www.bouncycastle.org".getBytes());
                } catch (Exception exception) {
                    System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                    System.exit(1);
                }
                object2 = new bo((SecureRandom)object);
                org.bouncycastle.crypto.f.b b2 = new org.bouncycastle.crypto.f.b();
                b2.a((bo)object2);
                this.e = b2.a();
                object = new BufferedOutputStream(new FileOutputStream(string));
                object2 = f.b(this.e);
                ((BufferedOutputStream)object).write((byte[])object2, 0, ((Object)object2).length);
                ((BufferedOutputStream)object).flush();
                ((FilterOutputStream)object).close();
                return;
            } catch (IOException iOException) {
                System.err.println("Could not decryption create key file [" + string + "]");
                System.exit(1);
                return;
            }
        }
        try {
            object = new BufferedInputStream(new FileInputStream(string));
            int n2 = ((BufferedInputStream)object).available();
            byte[] byArray = new byte[n2];
            ((BufferedInputStream)object).read(byArray, 0, n2);
            this.e = f.c(byArray);
            return;
        } catch (IOException iOException) {
            System.err.println("Decryption key file not found, or not valid [" + string + "]");
            System.exit(1);
            return;
        }
    }

    private void a(byte[] byArray) {
        this.b.a(true, new h(byArray));
        int n2 = this.b.b(47);
        byte[] byArray2 = new byte[47];
        byte[] byArray3 = new byte[n2];
        try {
            int n3;
            while ((n3 = this.c.read(byArray2, 0, 47)) > 0) {
                if ((n3 = this.b.a(byArray2, 0, n3, byArray3)) <= 0) continue;
                byte[] byArray4 = f.a(byArray3, 0, n3);
                this.d.write(byArray4, 0, byArray4.length);
                this.d.write(10);
            }
            try {
                n3 = this.b.a(byArray3);
                if (n3 > 0) {
                    byte[] byArray5 = f.a(byArray3, 0, n3);
                    this.d.write(byArray5, 0, byArray5.length);
                    this.d.write(10);
                }
                return;
            } catch (e e2) {
                return;
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private void b(byte[] object) {
        this.b.a(false, new h((byte[])object));
        object = new BufferedReader(new InputStreamReader(this.c));
        try {
            Object object2;
            byte[] byArray = null;
            while ((object2 = ((BufferedReader)object).readLine()) != null) {
                int n2 = this.b.a((byte[])(object2 = (Object)f.a((String)object2)), 0, ((Object)object2).length, byArray = new byte[this.b.b(((Object)object2).length)]);
                if (n2 <= 0) continue;
                this.d.write(byArray, 0, n2);
            }
            try {
                int n3 = this.b.a(byArray);
                if (n3 > 0) {
                    this.d.write(byArray, 0, n3);
                }
                return;
            } catch (e e2) {
                return;
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }
}

