/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.d;

import org.apache.a.d.i;

public final class h
implements Cloneable {
    public static final h a = new i().a();
    private final int b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;

    h(int n2, boolean bl2) {
        this.b = 0;
        this.c = false;
        this.d = n2;
        this.e = false;
        this.f = bl2;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final int a() {
        return this.d;
    }

    public final boolean b() {
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[soTimeout=0, soReuseAddress=false, soLinger=").append(this.d).append(", soKeepAlive=false, tcpNoDelay=").append(this.f).append(", sndBufSize=0, rcvBufSize=0, backlogSize=0]");
        return stringBuilder.toString();
    }
}

