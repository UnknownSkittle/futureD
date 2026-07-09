/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.b.ae;
import org.bouncycastle.e.k;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.b.p;
import org.bouncycastle.openpgp.m;

final class q {
    static byte[] a(o o2, int n2, ae ae2, char[] objectArray) {
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
            case 10: {
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
            default: {
                throw new m("unknown symmetric algorithm: ".concat(String.valueOf(n2)));
            }
        }
        objectArray = k.a(objectArray);
        byte[] byArray = new byte[(n2 + 7) / 8];
        int n3 = 0;
        int n4 = 0;
        if (ae2 != null) {
            if (ae2.c() != o2.a()) {
                throw new m("s2k/digestCalculator mismatch");
            }
        } else if (o2.a() != 1) {
            throw new m("digestCalculator not for MD5");
        }
        OutputStream outputStream = o2.b();
        try {
            while (n3 < byArray.length) {
                block35: {
                    block37: {
                        block36: {
                            if (ae2 == null) break block36;
                            for (int i2 = 0; i2 != n4; ++i2) {
                                outputStream.write(0);
                            }
                            byte[] byArray2 = ae2.d();
                            switch (ae2.b()) {
                                case 0: {
                                    outputStream.write((byte[])objectArray);
                                    break block35;
                                }
                                case 1: {
                                    outputStream.write(byArray2);
                                    break block37;
                                }
                                case 3: {
                                    long l2 = ae2.e();
                                    outputStream.write(byArray2);
                                    outputStream.write((byte[])objectArray);
                                    l2 -= (long)(byArray2.length + objectArray.length);
                                    while (l2 > 0L) {
                                        if (l2 < (long)byArray2.length) {
                                            outputStream.write(byArray2, 0, (int)l2);
                                            break block35;
                                        }
                                        outputStream.write(byArray2);
                                        if ((l2 -= (long)byArray2.length) < (long)objectArray.length) {
                                            outputStream.write((byte[])objectArray, 0, (int)l2);
                                            l2 = 0L;
                                            continue;
                                        }
                                        outputStream.write((byte[])objectArray);
                                        l2 -= (long)objectArray.length;
                                    }
                                    break block35;
                                }
                                default: {
                                    throw new m("unknown S2K type: " + ae2.b());
                                }
                            }
                        }
                        for (int i3 = 0; i3 != n4; ++i3) {
                            outputStream.write(0);
                        }
                    }
                    outputStream.write((byte[])objectArray);
                }
                outputStream.close();
                byte[] byArray3 = o2.c();
                if (byArray3.length > byArray.length - n3) {
                    System.arraycopy(byArray3, 0, byArray, n3, byArray.length - n3);
                } else {
                    System.arraycopy(byArray3, 0, byArray, n3, byArray3.length);
                }
                n3 += byArray3.length;
                ++n4;
            }
        } catch (IOException iOException) {
            throw new m("exception calculating digest: " + iOException.getMessage(), iOException);
        }
        for (int i4 = 0; i4 != objectArray.length; ++i4) {
            objectArray[i4] = '\u0000';
        }
        return byArray;
    }

    public static byte[] a(p object, int n2, ae ae2, char[] cArray) {
        object = ae2 != null ? object.a(ae2.c()) : object.a(1);
        return q.a((o)object, n2, ae2, cArray);
    }
}

