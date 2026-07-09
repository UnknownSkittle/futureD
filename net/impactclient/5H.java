/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  javax.xml.bind.DatatypeConverter
 */
package net.impactclient;

import java.util.function.Function;
import javax.xml.bind.DatatypeConverter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 5H {
    public static final Function<byte[], String> 0;
    public static final Function<byte[], byte[]> 1;
    public static final boolean \u2001\u2008\u200a\u200d\u2008\u2007\u2003\u2003;

    static {
        boolean bl2 = \u2001\u2008\u200a\u200d\u2008\u2007\u2003\u2003;
        if (bl2 || bl2) {
        } else {
            0 = byArray -> {
                boolean bl2 = \u2001\u2008\u200a\u200d\u2008\u2007\u2003\u2003;
                if (bl2 || bl2) {
                    return null;
                }
                return DatatypeConverter.printHexBinary((byte[])byArray).toLowerCase();
            };
            if (!bl2 && !bl2) {
                1 = byArray -> {
                    boolean bl2 = \u2001\u2008\u200a\u200d\u2008\u2007\u2003\u2003;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return byArray;
                };
                if (!bl2) {
                    // empty if block
                }
            }
        }
    }
}

