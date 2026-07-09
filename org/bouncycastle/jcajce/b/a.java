/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.b;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jcajce.b.e;

public final class a
extends e {
    private static volatile Provider a;

    public a() {
        super(Security.getProvider("BC") != null ? Security.getProvider("BC") : (a != null ? a : (a = new org.bouncycastle.c.a.a())));
    }
}

