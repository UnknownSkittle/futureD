/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.c.a;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.n;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.c;
import org.bouncycastle.d.c.b.a.e;
import org.bouncycastle.d.c.b.e.f;
import org.bouncycastle.d.c.b.e.g;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class a
extends Provider
implements org.bouncycastle.jcajce.provider.a.a {
    private static String a = "BouncyCastle Security Provider v1.60";
    private static final Map b;
    private static final String[] c;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    private static final String[] g;
    private static final String[] h;
    private static final String[] i;
    private static final String[] j;

    public a() {
        super("BC", 1.6, a);
        AccessController.doPrivileged(new b(this));
    }

    private void a(String string, String[] stringArray) {
        for (int i2 = 0; i2 != stringArray.length; ++i2) {
            Class clazz = org.bouncycastle.jcajce.provider.b.a.a.a(a.class, string + stringArray[i2] + "$Mappings");
            if (clazz == null) continue;
            try {
                ((org.bouncycastle.jcajce.provider.c.a)clazz.newInstance()).a(this);
                continue;
            } catch (Exception exception) {
                throw new InternalError("cannot create instance of " + string + stringArray[i2] + "$Mappings : " + exception);
            }
        }
    }

    @Override
    public final boolean b(String string, String string2) {
        return this.containsKey(string + "." + string2) || this.containsKey("Alg.Alias." + string + "." + string2);
    }

    @Override
    public final void a(String string, String string2) {
        if (this.containsKey(string)) {
            throw new IllegalStateException("duplicate provider key (" + string + ") found");
        }
        this.put(string, string2);
    }

    @Override
    public final void a(String string, n n2, String string2) {
        this.a(string + "." + n2, string2);
        this.a(string + ".OID." + n2, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(n n2, org.bouncycastle.jcajce.provider.c.c c2) {
        Map map = b;
        synchronized (map) {
            b.put(n2, c2);
            return;
        }
    }

    @Override
    public final void a(String string, Map<String, String> map) {
        for (String string2 : map.keySet()) {
            String string3 = string + " " + string2;
            if (this.containsKey(string3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + string3 + ") found");
            }
            this.put(string3, map.get(string2));
        }
    }

    static /* synthetic */ void a(a a2) {
        a2.a("org.bouncycastle.jcajce.provider.digest.", h);
        a2.a("org.bouncycastle.jcajce.provider.symmetric.", c);
        a2.a("org.bouncycastle.jcajce.provider.symmetric.", d);
        a2.a("org.bouncycastle.jcajce.provider.symmetric.", e);
        a2.a("org.bouncycastle.jcajce.provider.asymmetric.", f);
        a2.a("org.bouncycastle.jcajce.provider.asymmetric.", g);
        a2.a("org.bouncycastle.jcajce.provider.keystore.", i);
        a2.a("org.bouncycastle.jcajce.provider.drbg.", j);
        a a3 = a2;
        a3.a(org.bouncycastle.d.a.e.e, new org.bouncycastle.d.c.b.d.c());
        a3.a(org.bouncycastle.d.a.e.f, new org.bouncycastle.d.c.b.b.c());
        a3.a(org.bouncycastle.d.a.e.g, new f());
        a3.a(org.bouncycastle.d.a.e.h, new g());
        a3.a(org.bouncycastle.d.a.e.c, new org.bouncycastle.d.c.b.a.f());
        a3.a(org.bouncycastle.d.a.e.d, new e());
        a3.a(org.bouncycastle.d.a.e.a, new org.bouncycastle.d.c.b.c.c());
        a2.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        a2.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        a2.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        a2.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        a2.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        a2.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        a2.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        a2.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        a2.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        a2.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        a2.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        a2.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        a2.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        a2.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        a2.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        a2.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        a2.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        a2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        a2.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        a2.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        a2.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        a2.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        a2.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        a2.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        a2.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    static {
        new c();
        b = new HashMap();
        c = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        d = new String[]{"SipHash", "Poly1305"};
        e = new String[]{"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};
        f = new String[]{"X509", "IES"};
        g = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};
        h = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};
        i = new String[]{"BC", "BCFKS", "PKCS12"};
        j = new String[]{"DRBG"};
    }
}

