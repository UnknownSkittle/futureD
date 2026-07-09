/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.b.i;
import org.bouncycastle.b.v;
import org.bouncycastle.b.z;
import org.bouncycastle.math.b.a;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.m;

public abstract class s
extends a {
    private ab a;

    protected s(ab ab2) {
        this.a = ab2;
        switch (ab2.e()) {
            case 1: 
            case 2: {
                return;
            }
            case 3: {
                throw new IllegalArgumentException("Can't use an RSA_SIGN key for encryption.");
            }
            case 16: 
            case 20: {
                return;
            }
            case 18: {
                return;
            }
            case 17: {
                throw new IllegalArgumentException("Can't use DSA for encryption.");
            }
            case 19: {
                throw new IllegalArgumentException("Can't use ECDSA for encryption.");
            }
        }
        throw new IllegalArgumentException("unknown asymmetric algorithm: " + ab2.e());
    }

    private static byte[] a(byte[] byArray) {
        try {
            return new v(new BigInteger(1, byArray)).a();
        } catch (IOException iOException) {
            throw new m("Invalid MPI encoding: " + iOException.getMessage(), iOException);
        }
    }

    public final i a(int n2, byte[] byArray) {
        long l2 = this.a.a();
        int n3 = this.a.e();
        s s2 = this;
        byArray = s2.a(this.a, byArray);
        Object object = s2;
        switch (s2.a.e()) {
            case 1: 
            case 2: {
                byte[][] byArrayArray = new byte[1][];
                object = byArrayArray;
                byArrayArray[0] = s.a(byArray);
                break;
            }
            case 16: 
            case 20: {
                byte[] byArray2 = new byte[byArray.length / 2];
                byte[] byArray3 = new byte[byArray.length / 2];
                System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
                System.arraycopy(byArray, byArray2.length, byArray3, 0, byArray3.length);
                byte[][] byArrayArray = new byte[2][];
                object = byArrayArray;
                byArrayArray[0] = s.a(byArray2);
                object[1] = s.a(byArray3);
                break;
            }
            case 18: {
                byte[][] byArrayArray = new byte[1][];
                object = byArrayArray;
                byArrayArray[0] = byArray;
                break;
            }
            default: {
                throw new m("unknown asymmetric algorithm: " + ((s)object).a.e());
            }
        }
        return new z(l2, n3, (byte[][])object);
    }

    protected abstract byte[] a(ab var1, byte[] var2);
}

