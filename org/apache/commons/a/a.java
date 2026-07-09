/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.a;

import java.nio.charset.Charset;

public final class a {
    public static final Charset a;

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        a = Charset.forName("UTF-8");
    }
}

