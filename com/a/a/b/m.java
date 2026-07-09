/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ag;
import com.a.a.b.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class m
implements ag<T> {
    private /* synthetic */ Constructor a;
    private /* synthetic */ e b;

    m(e e2, Constructor constructor) {
        this.b = e2;
        this.a = constructor;
    }

    @Override
    public final T a() {
        try {
            return this.a.newInstance(null);
        } catch (InstantiationException instantiationException) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", instantiationException);
        } catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", invocationTargetException.getTargetException());
        } catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
    }
}

