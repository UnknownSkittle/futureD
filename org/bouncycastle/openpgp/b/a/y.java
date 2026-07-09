/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.b.c;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.z;
import org.bouncycastle.openpgp.b.k;
import org.bouncycastle.openpgp.m;

final class y {
    private c a;

    y(c c2) {
        this.a = c2;
    }

    final MessageDigest a(int n2) {
        MessageDigest messageDigest;
        String string;
        int n3 = n2;
        switch (n3) {
            case 2: {
                string = "SHA-1";
                break;
            }
            case 5: {
                string = "MD2";
                break;
            }
            case 1: {
                string = "MD5";
                break;
            }
            case 3: {
                string = "RIPEMD160";
                break;
            }
            case 8: {
                string = "SHA-256";
                break;
            }
            case 9: {
                string = "SHA-384";
                break;
            }
            case 10: {
                string = "SHA-512";
                break;
            }
            case 11: {
                string = "SHA-224";
                break;
            }
            case 6: {
                string = "TIGER";
                break;
            }
            default: {
                throw new m("unknown hash algorithm tag in getDigestName: ".concat(String.valueOf(n3)));
            }
        }
        String string2 = string;
        try {
            messageDigest = this.a.f(string2);
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (n2 >= 8 && n2 <= 11) {
                messageDigest = this.a.f("SHA" + string2.substring(4));
            }
            throw noSuchAlgorithmException;
        }
        return messageDigest;
    }

    final KeyFactory a(String string) {
        return this.a.d(string);
    }

    public final KeyAgreement b(String string) {
        return this.a.b(string);
    }

    public final KeyPairGenerator c(String string) {
        return this.a.e(string);
    }

    final k a(boolean bl2, int n2, byte[] object) {
        try {
            object = new SecretKeySpec((byte[])object, ap.a(n2));
            Cipher cipher = this.a(n2, bl2);
            if (bl2) {
                byte[] byArray = new byte[cipher.getBlockSize()];
                cipher.init(2, (Key)object, new IvParameterSpec(byArray));
            } else {
                cipher.init(2, (Key)object);
            }
            return new z(this, cipher);
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("Exception creating cipher", exception);
        }
    }

    final Cipher a(int n2, boolean bl2) {
        String string = bl2 ? "CFB" : "OpenPGPCFB";
        String string2 = ap.a(n2) + "/" + string + "/NoPadding";
        return this.d(string2);
    }

    final Cipher d(String string) {
        try {
            return this.a.a(string);
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("cannot create cipher: " + generalSecurityException.getMessage(), generalSecurityException);
        }
    }

    final Cipher b(int n2) {
        switch (n2) {
            case 1: 
            case 2: {
                return this.d("RSA/ECB/PKCS1Padding");
            }
            case 16: 
            case 20: {
                return this.d("ElGamal/ECB/PKCS1Padding");
            }
            case 17: {
                throw new m("Can't use DSA for encryption.");
            }
            case 19: {
                throw new m("Can't use ECDSA for encryption.");
            }
        }
        throw new m("unknown asymmetric algorithm: ".concat(String.valueOf(n2)));
    }

    final Cipher c(int n2) {
        try {
            switch (n2) {
                case 7: 
                case 8: 
                case 9: {
                    return this.a.a("AESWrap");
                }
                case 11: 
                case 12: 
                case 13: {
                    return this.a.a("CamelliaWrap");
                }
            }
            throw new m("unknown wrap algorithm: ".concat(String.valueOf(n2)));
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("cannot create cipher: " + generalSecurityException.getMessage(), generalSecurityException);
        }
    }

    private Signature f(String string) {
        try {
            return this.a.g(string);
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("cannot create signature: " + generalSecurityException.getMessage(), generalSecurityException);
        }
    }

    public final Signature a(int n2, int n3) {
        String string;
        String string2;
        switch (n2) {
            case 1: 
            case 3: {
                string2 = "RSA";
                break;
            }
            case 17: {
                string2 = "DSA";
                break;
            }
            case 16: 
            case 20: {
                string2 = "ElGamal";
                break;
            }
            case 19: {
                string2 = "ECDSA";
                break;
            }
            default: {
                throw new m("unknown algorithm tag in signature:".concat(String.valueOf(n2)));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        switch (n3) {
            case 2: {
                string = "SHA1";
                break;
            }
            case 5: {
                string = "MD2";
                break;
            }
            case 1: {
                string = "MD5";
                break;
            }
            case 3: {
                string = "RIPEMD160";
                break;
            }
            case 8: {
                string = "SHA256";
                break;
            }
            case 9: {
                string = "SHA384";
                break;
            }
            case 10: {
                string = "SHA512";
                break;
            }
            case 11: {
                string = "SHA224";
                break;
            }
            case 6: {
                string = "TIGER";
                break;
            }
            default: {
                throw new m("unknown hash algorithm tag in getDigestName: ".concat(String.valueOf(n3)));
            }
        }
        return this.f(stringBuilder.append(string).append("with").append(string2).toString());
    }

    public final AlgorithmParameters e(String string) {
        return this.a.c(string);
    }
}

