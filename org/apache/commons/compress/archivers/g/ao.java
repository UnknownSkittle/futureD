/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.InputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.g.ai;

final class ao {
    private final ai a = new ai();
    private boolean b;
    private boolean c;
    private long d;
    private long e;
    private final CRC32 f = new CRC32();
    private InputStream g;

    private ao() {
    }

    /* synthetic */ ao(byte by2) {
        this();
    }

    static /* synthetic */ ai a(ao ao2) {
        return ao2.a;
    }

    static /* synthetic */ boolean a(ao ao2, boolean bl2) {
        ao2.b = bl2;
        return ao2.b;
    }

    static /* synthetic */ boolean b(ao ao2) {
        return ao2.b;
    }

    static /* synthetic */ InputStream a(ao ao2, InputStream inputStream) {
        ao2.g = inputStream;
        return ao2.g;
    }

    static /* synthetic */ boolean b(ao ao2, boolean bl2) {
        ao2.c = bl2;
        return ao2.c;
    }

    static /* synthetic */ InputStream c(ao ao2) {
        return ao2.g;
    }

    static /* synthetic */ CRC32 d(ao ao2) {
        return ao2.f;
    }

    static /* synthetic */ long e(ao ao2) {
        return ao2.d;
    }

    static /* synthetic */ long f(ao ao2) {
        return ao2.e;
    }

    static /* synthetic */ long a(ao ao2, long l2) {
        ao2.e = l2;
        return ao2.e;
    }

    static /* synthetic */ long b(ao ao2, long l2) {
        ao2.d = l2;
        return ao2.d;
    }

    static /* synthetic */ boolean g(ao ao2) {
        return ao2.c;
    }

    static /* synthetic */ long h(ao ao2) {
        return ao2.e++;
    }
}

