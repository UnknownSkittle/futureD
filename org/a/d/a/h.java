/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.d.a;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.a.a.c.a;

public final class h {
    private static final Map<String, String> a = Collections.emptyMap();
    private final Appendable b;
    private char c = '\u0000';

    public h(Appendable appendable) {
        this.b = appendable;
    }

    public final void a(String string) {
        this.d(string);
    }

    public final void b(String string) {
        this.d(org.a.a.c.a.a(string, false));
    }

    public final void c(String string) {
        this.a(string, a, false);
    }

    public final void a(String string, Map<String, String> map) {
        this.a(string, map, false);
    }

    /*
     * WARNING - void declaration
     */
    public final void a(String object, Map<String, String> object22, boolean bl2) {
        void var3_5;
        this.d("<");
        this.d((String)((Object)object));
        if (object22 != null && !object22.isEmpty()) {
            for (Map.Entry entry : object22.entrySet()) {
                this.d(" ");
                this.d(org.a.a.c.a.a((String)entry.getKey(), true));
                this.d("=\"");
                this.d(org.a.a.c.a.a((String)entry.getValue(), true));
                this.d("\"");
            }
        }
        if (var3_5 != false) {
            this.d(" /");
        }
        this.d(">");
    }

    public final void a() {
        if (this.c != '\u0000' && this.c != '\n') {
            this.d("\n");
        }
    }

    private void d(String string) {
        try {
            this.b.append(string);
        } catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        int n2 = string.length();
        if (n2 != 0) {
            this.c = string.charAt(n2 - 1);
        }
    }
}

