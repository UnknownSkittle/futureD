/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.asymmetric.a;

import java.security.spec.InvalidKeySpecException;

public final class b
extends InvalidKeySpecException {
    private Throwable a;

    public b(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

