/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.e;
import org.bouncycastle.b.k;
import org.bouncycastle.b.o;
import org.bouncycastle.b.q;
import org.bouncycastle.b.r;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.b.a.a;
import org.bouncycastle.openpgp.b.a.l;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.n;

public final class j {
    private y a = new y(new b());
    private org.bouncycastle.openpgp.b.a b = new a();

    public final j a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    public final PublicKey a(ab object) {
        object = ((ab)object).h();
        try {
            switch (((org.bouncycastle.b.aa)object).b()) {
                case 1: 
                case 2: 
                case 3: {
                    object = (ac)((org.bouncycastle.b.aa)object).d();
                    RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(((ac)object).c(), ((ac)object).b());
                    return this.a.a("RSA").generatePublic(rSAPublicKeySpec);
                }
                case 17: {
                    object = (org.bouncycastle.b.j)((org.bouncycastle.b.aa)object).d();
                    DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(((org.bouncycastle.b.j)object).e(), ((org.bouncycastle.b.j)object).c(), ((org.bouncycastle.b.j)object).d(), ((org.bouncycastle.b.j)object).b());
                    return this.a.a("DSA").generatePublic(dSAPublicKeySpec);
                }
                case 16: 
                case 20: {
                    object = (q)((org.bouncycastle.b.aa)object).d();
                    DHPublicKeySpec dHPublicKeySpec = new DHPublicKeySpec(((q)object).d(), ((q)object).b(), ((q)object).c());
                    return this.a.a("ElGamal").generatePublic(dHPublicKeySpec);
                }
                case 18: {
                    object = (org.bouncycastle.b.l)((org.bouncycastle.b.aa)object).d();
                    Object object2 = org.bouncycastle.asn1.util.a.b(((org.bouncycastle.b.n)object).e());
                    object2 = org.bouncycastle.openpgp.b.a.a.a(((org.bouncycastle.b.n)object).d(), ((org.bouncycastle.asn1.k.aa)object2).a());
                    object2 = new ECPublicKeySpec(new ECPoint(((p)object2).e().a(), ((p)object2).f().a()), this.b(((org.bouncycastle.b.n)object).e()));
                    return this.a.a("ECDH").generatePublic((KeySpec)object2);
                }
                case 19: {
                    object = (org.bouncycastle.b.m)((org.bouncycastle.b.aa)object).d();
                    Object object3 = org.bouncycastle.asn1.util.a.b(((org.bouncycastle.b.n)object).e());
                    object3 = org.bouncycastle.openpgp.b.a.a.a(((org.bouncycastle.b.n)object).d(), ((org.bouncycastle.asn1.k.aa)object3).a());
                    object3 = new ECPublicKeySpec(new ECPoint(((p)object3).e().a(), ((p)object3).f().a()), this.b(((org.bouncycastle.b.n)object).e()));
                    return this.a.a("ECDSA").generatePublic((KeySpec)object3);
                }
            }
            throw new m("unknown public key algorithm encountered");
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("exception constructing public key", exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ab a(int n2, PublicKey publicKey, Date object) {
        Object object2 = object;
        object = publicKey;
        int n3 = n2;
        j j2 = this;
        if (object instanceof RSAPublicKey) {
            object = (RSAPublicKey)object;
            object = new ac(object.getModulus(), object.getPublicExponent());
            return new ab(new org.bouncycastle.b.aa(n3, (Date)object2, (e)object), j2.b);
        } else if (object instanceof DSAPublicKey) {
            object = (DSAPublicKey)object;
            DSAParams dSAParams = object.getParams();
            object = new org.bouncycastle.b.j(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG(), object.getY());
            return new ab(new org.bouncycastle.b.aa(n3, (Date)object2, (e)object), j2.b);
        } else if (object instanceof DHPublicKey) {
            object = (DHPublicKey)object;
            DHParameterSpec dHParameterSpec = object.getParams();
            object = new q(dHParameterSpec.getP(), dHParameterSpec.getG(), object.getY());
            return new ab(new org.bouncycastle.b.aa(n3, (Date)object2, (e)object), j2.b);
        } else {
            if (!(object instanceof ECPublicKey)) throw new m("unknown key class");
            object = c.a(object.getEncoded());
            org.bouncycastle.asn1.n n4 = org.bouncycastle.asn1.n.a(((c)object).a().b());
            org.bouncycastle.asn1.k.aa aa2 = org.bouncycastle.asn1.util.a.b(n4);
            object = new ba(((c)object).c().c());
            object = new org.bouncycastle.asn1.k.ac(aa2.a(), (org.bouncycastle.asn1.p)object);
            if (n3 == 18) {
                new n();
                object = new org.bouncycastle.b.l(n4, ((org.bouncycastle.asn1.k.ac)object).a(), 8, 7);
                return new ab(new org.bouncycastle.b.aa(n3, (Date)object2, (e)object), j2.b);
            } else {
                if (n3 != 19) throw new m("unknown EC algorithm");
                object = new org.bouncycastle.b.m(n4, ((org.bouncycastle.asn1.k.ac)object).a());
            }
        }
        return new ab(new org.bouncycastle.b.aa(n3, (Date)object2, (e)object), j2.b);
    }

    public final PrivateKey a(aa object) {
        if (object instanceof l) {
            return ((l)object).d();
        }
        Object object2 = ((aa)object).b();
        object = ((aa)object).c();
        try {
            switch (((org.bouncycastle.b.aa)object2).b()) {
                case 1: 
                case 2: 
                case 3: {
                    object2 = (ac)((org.bouncycastle.b.aa)object2).d();
                    object = (ad)object;
                    object2 = new RSAPrivateCrtKeySpec(((ad)object).b(), ((ac)object2).b(), ((ad)object).c(), ((ad)object).d(), ((ad)object).e(), ((ad)object).f(), ((ad)object).g(), ((ad)object).h());
                    return this.a.a("RSA").generatePrivate((KeySpec)object2);
                }
                case 17: {
                    object2 = (org.bouncycastle.b.j)((org.bouncycastle.b.aa)object2).d();
                    object = (k)object;
                    object2 = new DSAPrivateKeySpec(((k)object).b(), ((org.bouncycastle.b.j)object2).c(), ((org.bouncycastle.b.j)object2).d(), ((org.bouncycastle.b.j)object2).b());
                    return this.a.a("DSA").generatePrivate((KeySpec)object2);
                }
                case 18: {
                    object2 = (org.bouncycastle.b.l)((org.bouncycastle.b.aa)object2).d();
                    object = (o)object;
                    object2 = new ECPrivateKeySpec(((o)object).b(), this.a(((org.bouncycastle.b.n)object2).e()));
                    return this.a.a("ECDH").generatePrivate((KeySpec)object2);
                }
                case 19: {
                    object2 = (org.bouncycastle.b.m)((org.bouncycastle.b.aa)object2).d();
                    object = (o)object;
                    object2 = new ECPrivateKeySpec(((o)object).b(), this.a(((org.bouncycastle.b.n)object2).e()));
                    return this.a.a("ECDSA").generatePrivate((KeySpec)object2);
                }
                case 16: 
                case 20: {
                    object2 = (q)((org.bouncycastle.b.aa)object2).d();
                    object = (r)object;
                    object2 = new DHPrivateKeySpec(((r)object).b(), ((q)object2).b(), ((q)object2).c());
                    return this.a.a("ElGamal").generatePrivate((KeySpec)object2);
                }
            }
            throw new m("unknown public key algorithm encountered");
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("Exception constructing key", exception);
        }
    }

    private ECParameterSpec a(org.bouncycastle.asn1.n n2) {
        org.bouncycastle.asn1.n n3 = n2;
        org.bouncycastle.asn1.util.a.b(n3);
        return this.b(n3);
    }

    private ECParameterSpec b(org.bouncycastle.asn1.n n2) {
        AlgorithmParameters algorithmParameters = this.a.e("EC");
        algorithmParameters.init(new ECGenParameterSpec(org.bouncycastle.asn1.util.a.a(n2)));
        return algorithmParameters.getParameterSpec(ECParameterSpec.class);
    }
}

