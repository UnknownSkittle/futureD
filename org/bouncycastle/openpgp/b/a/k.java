/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Date;
import javax.crypto.interfaces.DHPrivateKey;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.e;
import org.bouncycastle.b.r;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.b.a.j;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.o;

public final class k
extends o {
    public k(int n2, KeyPair keyPair, Date serializable) {
        Object object = serializable;
        serializable = keyPair.getPublic();
        this.a = new j().a(n2, (PublicKey)serializable, (Date)object);
        serializable = keyPair.getPrivate();
        Object object2 = this.a;
        new j();
        ab ab2 = object2;
        object2 = serializable;
        object = ab2;
        switch (ab2.e()) {
            case 1: 
            case 2: 
            case 3: {
                object2 = (RSAPrivateCrtKey)object2;
                object2 = new ad(object2.getPrivateExponent(), object2.getPrimeP(), object2.getPrimeQ());
                break;
            }
            case 17: {
                object2 = (DSAPrivateKey)object2;
                object2 = new org.bouncycastle.b.k(object2.getX());
                break;
            }
            case 16: 
            case 20: {
                object2 = (DHPrivateKey)object2;
                object2 = new r(object2.getX());
                break;
            }
            case 18: 
            case 19: {
                object2 = (ECPrivateKey)object2;
                object2 = new org.bouncycastle.b.o(object2.getS());
                break;
            }
            default: {
                throw new m("unknown key class");
            }
        }
        this.b = new aa(((ab)object).a(), ((ab)object).h(), (e)object2);
    }
}

