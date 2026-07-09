/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.b;

import java.io.File;
import java.util.regex.Matcher;
import org.apache.commons.compress.archivers.b.c;

public final class a
implements org.apache.commons.compress.archivers.a {
    private final c a;

    public a() {
        this.a = new c();
    }

    a(c c2) {
        this.a = c2;
    }

    @Override
    public final String getName() {
        if ((this.a.d & 0x10) != 0) {
            return this.a.t.replaceAll("/", Matcher.quoteReplacement(File.separator));
        }
        return this.a.t;
    }

    final int a() {
        return this.a.e;
    }
}

