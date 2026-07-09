/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 4e
extends RuntimeException {
    public static final boolean \u2001\u2003\u200c\u200b\u2006\u2009\u2004\u2002\u2007;

    private 4e(String string) {
        boolean bl2 = \u2001\u2003\u200c\u200b\u2006\u2009\u2004\u2002\u2007;
        super(string);
    }

    public 4e(String string, Object ... objectArray) {
        boolean bl2 = \u2001\u2003\u200c\u200b\u2006\u2009\u2004\u2002\u2007;
        this(String.format(string, objectArray));
    }
}

