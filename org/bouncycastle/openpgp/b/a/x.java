/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.b.l;
import org.bouncycastle.b.n;
import org.bouncycastle.b.v;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.j;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.s;
import org.bouncycastle.openpgp.b.t;
import org.bouncycastle.openpgp.m;

public final class x
extends s {
    private y a = new y(new b());
    private j b = new j();

    public x(ab ab2) {
        super(ab2);
    }

    public final x a(String string) {
        this.a = new y(new d(string));
        this.b.a(string);
        return this;
    }

    protected final byte[] a(ab object, byte[] object2) {
        try {
            if (((ab)object).e() == 18) {
                Object object3 = (l)((ab)object).h().d();
                aa aa2 = org.bouncycastle.asn1.util.a.b(((n)object3).e());
                Object object4 = this.a.e("EC");
                ((AlgorithmParameters)object4).init(new org.bouncycastle.asn1.k.y(((n)object3).e()).j());
                Object object5 = this.a.c("EC");
                ((KeyPairGenerator)object5).initialize(((AlgorithmParameters)object4).getParameterSpec(AlgorithmParameterSpec.class));
                object4 = ((KeyPairGenerator)object5).generateKeyPair();
                object5 = this.a.b(t.a(((ab)object).h()));
                ((KeyAgreement)object5).init((Key)((KeyPair)object4).getPrivate(), new org.bouncycastle.jcajce.a.a(t.a(((ab)object).h(), new a())));
                ((KeyAgreement)object5).doPhase(this.b.a((ab)object), true);
                object = ((KeyAgreement)object5).generateSecret(t.a(((l)object3).c()).b());
                object3 = this.a.c(((l)object3).c());
                ((Cipher)object3).init(3, (Key)object, (SecureRandom)null);
                object = object2;
                object5 = new byte[40];
                System.arraycopy(object, 0, object5, 0, ((Object)object).length);
                byte by2 = (byte)(40 - ((Object)object).length);
                for (int i2 = ((Object)object).length; i2 != 40; ++i2) {
                    object5[i2] = by2;
                }
                Object object6 = object5;
                object6 = ((Cipher)object3).wrap(new SecretKeySpec((byte[])object6, ap.a(object2[0])));
                object2 = c.a(((KeyPair)object4).getPublic().getEncoded());
                object2 = new ac(aa2.a(), object2.c().c()).a();
                byte[] byArray = new v(new BigInteger(1, object2.b(false))).a();
                object2 = byArray;
                object3 = new byte[byArray.length + 1 + ((Object)object6).length];
                System.arraycopy(object2, 0, object3, 0, ((byte[])object2).length);
                object3[((byte[])object2).length] = (byte)((Object)object6).length;
                System.arraycopy(object6, 0, object3, ((byte[])object2).length + 1, ((Object)object6).length);
                return object3;
            }
            Cipher cipher = this.a.b(((ab)object).e());
            PublicKey publicKey = this.b.a((ab)object);
            cipher.init(1, (Key)publicKey, (SecureRandom)null);
            return cipher.doFinal((byte[])object2);
        } catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new m("illegal block size: " + illegalBlockSizeException.getMessage(), illegalBlockSizeException);
        } catch (BadPaddingException badPaddingException) {
            throw new m("bad padding: " + badPaddingException.getMessage(), badPaddingException);
        } catch (InvalidKeyException invalidKeyException) {
            throw new m("key invalid: " + invalidKeyException.getMessage(), invalidKeyException);
        } catch (IOException iOException) {
            throw new m("unable to encode MPI: " + iOException.getMessage(), iOException);
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("unable to set up ephemeral keys: " + generalSecurityException.getMessage(), generalSecurityException);
        }
    }
}

