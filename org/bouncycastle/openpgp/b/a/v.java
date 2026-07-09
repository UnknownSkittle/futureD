/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHKey;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.j;
import org.bouncycastle.openpgp.b.a.w;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.r;
import org.bouncycastle.openpgp.b.t;
import org.bouncycastle.openpgp.m;

public final class v {
    private y a = new y(new b());
    private y b = new y(new b());
    private j c = new j();
    private a d = new a();

    public final v a(String string) {
        this.a = new y(new d(string));
        this.c.a(string);
        this.b = this.a;
        return this;
    }

    public final r a(aa aa2) {
        return new w(this, aa2);
    }

    private byte[] a(j object, aa object2, byte[][] object3) {
        Object object4 = ((aa)object2).b();
        l l2 = (l)((org.bouncycastle.b.aa)object4).d();
        Object object5 = org.bouncycastle.asn1.util.a.b(l2.e());
        byte[] byArray = object3[0];
        object3 = byArray;
        int n2 = (((byArray[0] & 0xFF) << 8) + (object3[1] & 0xFF) + 7) / 8;
        byte[] byArray2 = new byte[n2];
        System.arraycopy(object3, 2, byArray2, 0, n2);
        byte[] byArray3 = new byte[object3[n2 + 2]];
        System.arraycopy(object3, n2 + 2 + 1, byArray3, 0, byArray3.length);
        object3 = ((org.bouncycastle.asn1.k.aa)object5).a().a(byArray2);
        try {
            object5 = t.a((org.bouncycastle.b.aa)object4, this.d);
            object4 = this.a.b(t.a((org.bouncycastle.b.aa)object4));
            object2 = ((j)object).a((aa)object2);
            ((KeyAgreement)object4).init((Key)object2, new org.bouncycastle.jcajce.a.a((byte[])object5));
            ((KeyAgreement)object4).doPhase(((j)object).a(new ab(new org.bouncycastle.b.aa(18, new Date(), new l(l2.e(), (p)object3, l2.b(), l2.c())), this.d)), true);
            object = ((KeyAgreement)object4).generateSecret(t.a(l2.c()).b());
            object2 = this.a.c(l2.c());
            ((Cipher)object2).init(4, (Key)object);
            return org.bouncycastle.asn1.util.a.a(((Cipher)object2).unwrap(byArray3, "Session", 3).getEncoded());
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("error setting asymmetric cipher", invalidKeyException);
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new m("error setting asymmetric cipher", noSuchAlgorithmException);
        } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new m("error setting asymmetric cipher", invalidAlgorithmParameterException);
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("error setting asymmetric cipher", generalSecurityException);
        } catch (IOException iOException) {
            throw new m("error setting asymmetric cipher", iOException);
        }
    }

    private byte[] a(int n2, PrivateKey object, byte[][] byArray) {
        Cipher cipher = this.a.b(n2);
        try {
            cipher.init(2, (Key)object);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("error setting asymmetric cipher", invalidKeyException);
        }
        if (n2 == 2 || n2 == 1) {
            byte[] byArray2 = byArray[0];
            cipher.update(byArray2, 2, byArray2.length - 2);
        } else {
            n2 = (((DHKey)object).getParams().getP().bitLength() + 7) / 8;
            object = new byte[n2];
            byte[] byArray3 = byArray[0];
            if (byArray3.length - 2 > n2) {
                cipher.update(byArray3, 3, byArray3.length - 3);
            } else {
                System.arraycopy(byArray3, 2, object, n2 - (byArray3.length - 2), byArray3.length - 2);
                cipher.update((byte[])object);
            }
            byArray3 = byArray[1];
            for (int i2 = 0; i2 != n2; ++i2) {
                object[i2] = false;
            }
            if (byArray3.length - 2 > n2) {
                cipher.update(byArray3, 3, byArray3.length - 3);
            } else {
                System.arraycopy(byArray3, 2, object, n2 - (byArray3.length - 2), byArray3.length - 2);
                cipher.update((byte[])object);
            }
        }
        try {
            return cipher.doFinal();
        } catch (Exception exception) {
            throw new m("exception decrypting session data", exception);
        }
    }

    static /* synthetic */ byte[] a(v v2, int n2, PrivateKey privateKey, byte[][] byArray) {
        return v2.a(n2, privateKey, byArray);
    }

    static /* synthetic */ y a(v v2) {
        return v2.b;
    }

    static /* synthetic */ j b(v v2) {
        return v2.c;
    }

    static /* synthetic */ byte[] a(v v2, j j2, aa aa2, byte[][] byArray) {
        return v2.a(j2, aa2, byArray);
    }
}

