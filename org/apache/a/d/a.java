/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.d;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.a.d.b;
import org.apache.a.d.d;

public final class a
implements Cloneable {
    public static final a a = new b().a();
    private final int b;
    private final int c;
    private final Charset d;
    private final CodingErrorAction e;
    private final CodingErrorAction f;
    private final d g;

    a(int n2) {
        this.b = 8192;
        this.c = n2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[bufferSize=8192, fragmentSizeHint=").append(this.c).append(", charset=").append((Object)null).append(", malformedInputAction=").append((Object)null).append(", unmappableInputAction=").append((Object)null).append(", messageConstraints=").append((Object)null).append("]");
        return stringBuilder.toString();
    }
}

