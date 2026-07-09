/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.b;

import java.nio.charset.Charset;
import org.apache.a.b.f.d;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.m.c;
import org.apache.a.y;

public final class f
extends g {
    public f(Iterable<? extends y> iterable, Charset charset) {
        super(d.a(iterable, charset != null ? charset : c.a), e.a("application/x-www-form-urlencoded", charset));
    }
}

