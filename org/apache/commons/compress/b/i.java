/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public final class i<E>
implements Iterator<E> {
    private E a;
    private final Class<E> b;
    private final Iterator<E> c;

    public i(Class<E> clazz) {
        this(clazz, ClassLoader.getSystemClassLoader());
    }

    private i(Class<E> object, ClassLoader classLoader) {
        this.b = object;
        object = ServiceLoader.load(object, classLoader);
        this.c = ((ServiceLoader)object).iterator();
        this.a = null;
    }

    private boolean a() {
        while (this.a == null) {
            try {
                if (!this.c.hasNext()) {
                    return false;
                }
                this.a = this.c.next();
            } catch (ServiceConfigurationError serviceConfigurationError) {
                ServiceConfigurationError serviceConfigurationError2 = serviceConfigurationError;
                if (serviceConfigurationError.getCause() instanceof SecurityException) continue;
                throw serviceConfigurationError2;
            }
        }
        return true;
    }

    @Override
    public final boolean hasNext() {
        return this.a();
    }

    @Override
    public final E next() {
        if (!this.a()) {
            throw new NoSuchElementException("No more elements for service " + this.b.getName());
        }
        E e2 = this.a;
        this.a = null;
        return e2;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("service=" + this.b.getName());
    }
}

