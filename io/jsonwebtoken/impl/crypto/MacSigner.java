/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import io.jsonwebtoken.impl.crypto.Signer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class MacSigner
extends MacProvider
implements Signer {
    public MacSigner(SignatureAlgorithm alg, byte[] key) {
        this(alg, new SecretKeySpec(key, alg.getJcaName()));
    }

    public MacSigner(SignatureAlgorithm alg, Key key) {
        super(alg, key);
        Assert.isTrue(alg.isHmac(), "The MacSigner only supports HMAC signature algorithms.");
        if (!(key instanceof SecretKey)) {
            String msg = "MAC signatures must be computed and verified using a SecretKey.  The specified key of type " + key.getClass().getName() + " is not a SecretKey.";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public byte[] sign(byte[] data) {
        Mac mac = this.getMacInstance();
        return mac.doFinal(data);
    }

    protected Mac getMacInstance() throws SignatureException {
        try {
            return this.doGetMacInstance();
        } catch (NoSuchAlgorithmException e2) {
            String msg = "Unable to obtain JCA MAC algorithm '" + this.alg.getJcaName() + "': " + e2.getMessage();
            throw new SignatureException(msg, e2);
        } catch (InvalidKeyException e3) {
            String msg = "The specified signing key is not a valid " + this.alg.name() + " key: " + e3.getMessage();
            throw new SignatureException(msg, e3);
        }
    }

    protected Mac doGetMacInstance() throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(this.alg.getJcaName());
        mac.init(this.key);
        return mac;
    }
}

