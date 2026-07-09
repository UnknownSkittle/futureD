/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.aa;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.v;
import org.bouncycastle.e.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.m;

public final class a
implements org.bouncycastle.openpgp.b.a {
    public static SecretKey a(int n2, byte[] byArray) {
        String string = ap.a(n2);
        if (string == null) {
            throw new m("unknown symmetric algorithm: ".concat(String.valueOf(n2)));
        }
        return new SecretKeySpec(byArray, string);
    }

    static p a(BigInteger bigInteger, d d2) {
        return d2.a(c.a(bigInteger));
    }

    public final byte[] a(aa object) {
        Object object2 = ((aa)object).d();
        if (((aa)object).a() <= 3) {
            object = (ac)object2;
            try {
                object2 = MessageDigest.getInstance("MD5");
                byte[] byArray = new v(((ac)object).c()).a();
                ((MessageDigest)object2).update(byArray, 2, byArray.length - 2);
                byArray = new v(((ac)object).b()).a();
                ((MessageDigest)object2).update(byArray, 2, byArray.length - 2);
                return ((MessageDigest)object2).digest();
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new m("can't find MD5", noSuchAlgorithmException);
            } catch (IOException iOException) {
                throw new m("can't encode key components: " + iOException.getMessage(), iOException);
            }
        }
        try {
            object = ((aa)object).e();
            object2 = MessageDigest.getInstance("SHA1");
            ((MessageDigest)object2).update((byte)-103);
            ((MessageDigest)object2).update((byte)(((Object)object).length >> 8));
            ((MessageDigest)object2).update((byte)((Object)object).length);
            ((MessageDigest)object2).update((byte[])object);
            return ((MessageDigest)object2).digest();
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new m("can't find SHA1", noSuchAlgorithmException);
        } catch (IOException iOException) {
            throw new m("can't encode key components: " + iOException.getMessage(), iOException);
        }
    }
}

