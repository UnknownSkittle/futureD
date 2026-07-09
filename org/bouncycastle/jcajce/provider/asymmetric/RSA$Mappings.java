/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.i.p;
import org.bouncycastle.asn1.j.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.a.a;
import org.bouncycastle.jcajce.provider.asymmetric.RSA;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.c.b;

public class RSA$Mappings
extends b {
    public final void a(a a2) {
        a2.a("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
        a2.a("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
        a2.a("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        a2.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
        a2.a("Cipher.RSA", RSA.a());
        a2.a("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        a2.a("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        a2.a("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a2.a("Cipher", org.bouncycastle.asn1.f.a.b, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a2.a("Cipher", d.a, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        a2.a("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
        a2.a("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
        a2.a("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        a2.a("Cipher", org.bouncycastle.asn1.f.a.g, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        a2.a("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
        a2.a("Alg.Alias.Cipher.RSA//RAW", "RSA");
        a2.a("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        a2.a("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        a2.a("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        a2.a("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        a2.a("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
        a2.a("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
        KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.b, "RSA", keyFactorySpi);
        RSA$Mappings.a(a2, d.a, "RSA", keyFactorySpi);
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.g, "RSA", keyFactorySpi);
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.i, "RSA", keyFactorySpi);
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.b, "RSA");
        RSA$Mappings.a(a2, d.a, "RSA");
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.g, "OAEP");
        RSA$Mappings.a(a2, org.bouncycastle.asn1.f.a.i, "PSS");
        a2.a("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a2.a("Signature." + org.bouncycastle.asn1.f.a.i, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a2.a("Signature.OID." + org.bouncycastle.asn1.f.a.i, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        a2.a("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
        a2.a("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
        a2.a("Alg.Alias.Signature.RAWRSA", "RSA");
        a2.a("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        a2.a("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        a2.a("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        a2.a("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        a2.a("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
        a2.a("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        RSA$Mappings.b(a2, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
        RSA$Mappings.b(a2, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
        RSA$Mappings.b(a2, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
        RSA$Mappings.b(a2, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
        RSA$Mappings.b(a2, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
        RSA$Mappings.b(a2, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
        RSA$Mappings.b(a2, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
        RSA$Mappings.b(a2, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
        RSA$Mappings.b(a2, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
        RSA$Mappings.b(a2, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
        if (a2.b("MessageDigest", "MD2")) {
            RSA$Mappings.a(a2, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", org.bouncycastle.asn1.f.a.c);
        }
        if (a2.b("MessageDigest", "MD4")) {
            RSA$Mappings.a(a2, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", org.bouncycastle.asn1.f.a.d);
        }
        if (a2.b("MessageDigest", "MD5")) {
            RSA$Mappings.a(a2, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", org.bouncycastle.asn1.f.a.e);
            RSA$Mappings.a(a2, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
        }
        if (a2.b("MessageDigest", "SHA1")) {
            a2.a("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
            a2.a("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
            RSA$Mappings.b(a2, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
            RSA$Mappings.a(a2, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", org.bouncycastle.asn1.f.a.f);
            RSA$Mappings.a(a2, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
            a2.a("Alg.Alias.Signature." + org.bouncycastle.asn1.e.a.b, "SHA1WITHRSA");
            a2.a("Alg.Alias.Signature.OID." + org.bouncycastle.asn1.e.a.b, "SHA1WITHRSA");
            RSA$Mappings.c(a2, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
        }
        RSA$Mappings.a(a2, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", org.bouncycastle.asn1.f.a.m);
        RSA$Mappings.a(a2, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", org.bouncycastle.asn1.f.a.j);
        RSA$Mappings.a(a2, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", org.bouncycastle.asn1.f.a.k);
        RSA$Mappings.a(a2, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", org.bouncycastle.asn1.f.a.l);
        RSA$Mappings.a(a2, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", org.bouncycastle.asn1.f.a.n);
        RSA$Mappings.a(a2, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", org.bouncycastle.asn1.f.a.o);
        RSA$Mappings.a(a2, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", org.bouncycastle.asn1.d.b.t);
        RSA$Mappings.a(a2, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", org.bouncycastle.asn1.d.b.u);
        RSA$Mappings.a(a2, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", org.bouncycastle.asn1.d.b.v);
        RSA$Mappings.a(a2, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", org.bouncycastle.asn1.d.b.w);
        RSA$Mappings.a(a2, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
        RSA$Mappings.a(a2, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
        RSA$Mappings.a(a2, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
        RSA$Mappings.a(a2, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
        RSA$Mappings.a(a2, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
        RSA$Mappings.a(a2, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
        RSA$Mappings.c(a2, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
        if (a2.b("MessageDigest", "RIPEMD128")) {
            RSA$Mappings.a(a2, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", p.d);
            RSA$Mappings.a(a2, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
            RSA$Mappings.c(a2, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            RSA$Mappings.c(a2, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
        }
        if (a2.b("MessageDigest", "RIPEMD160")) {
            RSA$Mappings.a(a2, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", p.c);
            RSA$Mappings.a(a2, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
            a2.a("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
            a2.a("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
            RSA$Mappings.c(a2, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            RSA$Mappings.c(a2, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
        }
        if (a2.b("MessageDigest", "RIPEMD256")) {
            RSA$Mappings.a(a2, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", p.e);
            RSA$Mappings.a(a2, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
        }
        if (a2.b("MessageDigest", "WHIRLPOOL")) {
            RSA$Mappings.a(a2, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
            RSA$Mappings.a(a2, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
            RSA$Mappings.c(a2, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            RSA$Mappings.c(a2, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
        }
    }

    private static void a(a a2, String string, String string2, n n2) {
        String string3 = string + "WITHRSA";
        String string4 = string + "withRSA";
        String string5 = string + "WithRSA";
        String string6 = string + "/RSA";
        String string7 = string + "WITHRSAENCRYPTION";
        String string8 = string + "withRSAEncryption";
        string = string + "WithRSAEncryption";
        a2.a("Signature.".concat(String.valueOf(string3)), string2);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string4)), string3);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string5)), string3);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string7)), string3);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string8)), string3);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string)), string3);
        a2.a("Alg.Alias.Signature.".concat(String.valueOf(string6)), string3);
        if (n2 != null) {
            a2.a("Alg.Alias.Signature.".concat(String.valueOf(n2)), string3);
            a2.a("Alg.Alias.Signature.OID.".concat(String.valueOf(n2)), string3);
        }
    }

    private static void a(a a2, String string, String string2) {
        a2.a("Alg.Alias.Signature." + string + "withRSA/ISO9796-2", string + "WITHRSA/ISO9796-2");
        a2.a("Alg.Alias.Signature." + string + "WithRSA/ISO9796-2", string + "WITHRSA/ISO9796-2");
        a2.a("Signature." + string + "WITHRSA/ISO9796-2", string2);
    }

    private static void b(a a2, String string, String string2) {
        a2.a("Alg.Alias.Signature." + string + "withRSA/PSS", string + "WITHRSAANDMGF1");
        a2.a("Alg.Alias.Signature." + string + "WithRSA/PSS", string + "WITHRSAANDMGF1");
        a2.a("Alg.Alias.Signature." + string + "withRSAandMGF1", string + "WITHRSAANDMGF1");
        a2.a("Alg.Alias.Signature." + string + "WithRSAAndMGF1", string + "WITHRSAANDMGF1");
        a2.a("Signature." + string + "WITHRSAANDMGF1", string2);
    }

    private static void c(a a2, String string, String string2) {
        a2.a("Alg.Alias.Signature." + string + "withRSA/X9.31", string + "WITHRSA/X9.31");
        a2.a("Alg.Alias.Signature." + string + "WithRSA/X9.31", string + "WITHRSA/X9.31");
        a2.a("Signature." + string + "WITHRSA/X9.31", string2);
    }
}

