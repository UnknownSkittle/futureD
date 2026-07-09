/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;

final class ac
extends ag<Class> {
    ac() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        object = (Class)object2;
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class)object).getName() + ". Forgot to register a type adapter?");
    }
}

