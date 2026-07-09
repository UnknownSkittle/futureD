/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.a.a;

import java.math.BigInteger;
import org.bouncycastle.crypto.a.a.c;

public final class a {
    private final BigInteger a;
    private final BigInteger b;
    private final BigInteger c;

    a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger, "p");
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger2, "q");
        org.bouncycastle.crypto.a.a.c.a((Object)bigInteger3, "g");
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
    }

    public final BigInteger a() {
        return this.a;
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.c;
    }
}

