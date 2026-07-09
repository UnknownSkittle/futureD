/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 05 {
    public static final boolean \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
    private final String 0;
    private static final Map<String, 05> 1;

    public static 05 0(String string) {
        boolean bl2 = \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
        if (bl2 || bl2) {
            return null;
        }
        return 1.computeIfAbsent(string, 05::new);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> T 0(byte[] byArray, Function<byte[], T> function) {
        boolean bl2 = \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
        if (bl2 || bl2) return null;
        Objects.requireNonNull(function);
        if (bl2) return null;
        try {
            if (bl2) return null;
            MessageDigest messageDigest = MessageDigest.getInstance(this.0);
            if (bl2 || bl2) return null;
            return (T)function.apply(messageDigest.digest(byArray));
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (bl2 || bl2) return null;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private 05(String string) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
                if (bl2 || bl2) break block2;
                this.0 = string;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final <T> T 0(String string, Function<byte[], T> function) {
        boolean bl2 = \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(string.getBytes(), function);
    }

    static {
        boolean bl2 = \u2007\u200e\u2006\u200a\u2005\u2009\u2008\u200f\u200c;
        if (bl2 || bl2) {
        } else {
            1 = new HashMap<String, 05>();
            if (!bl2) {
                // empty if block
            }
        }
    }
}

