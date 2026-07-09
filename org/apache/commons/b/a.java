/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.b;

import java.nio.charset.Charset;

public final class a {
    public static Charset a(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }
}

