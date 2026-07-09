/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import org.apache.commons.codec.binary.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@FunctionalInterface
public interface 5m {
    public static final boolean \u200c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    default public String 0(String string) {
        boolean bl2 = \u200c;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return Base64.encodeBase64String(this.0(string.getBytes()));
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return string;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    default public String 1(String object) {
        boolean bl2 = \u200c;
        if (bl2) return null;
        try {
            if (bl2) return null;
            object = this.0(Base64.decodeBase64((String)object));
            if (bl2 || bl2) return null;
            return new String((byte[])object);
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return null;
        }
    }

    public byte[] 0(byte[] var1);
}

