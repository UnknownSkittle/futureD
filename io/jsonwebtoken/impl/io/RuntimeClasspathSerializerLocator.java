/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.io;

import io.jsonwebtoken.impl.io.InstanceLocator;
import io.jsonwebtoken.io.Serializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import java.util.concurrent.atomic.AtomicReference;

public class RuntimeClasspathSerializerLocator
implements InstanceLocator<Serializer> {
    private static final AtomicReference<Serializer<Object>> SERIALIZER = new AtomicReference();

    @Override
    public Serializer<Object> getInstance() {
        Serializer<Object> serializer = SERIALIZER.get();
        if (serializer == null) {
            serializer = this.locate();
            Assert.state(serializer != null, "locate() cannot return null.");
            if (!this.compareAndSet(serializer)) {
                serializer = SERIALIZER.get();
            }
        }
        Assert.state(serializer != null, "serializer cannot be null.");
        return serializer;
    }

    protected Serializer<Object> locate() {
        if (this.isAvailable("io.jsonwebtoken.io.JacksonSerializer")) {
            return (Serializer)Classes.newInstance("io.jsonwebtoken.io.JacksonSerializer");
        }
        if (this.isAvailable("io.jsonwebtoken.io.OrgJsonSerializer")) {
            return (Serializer)Classes.newInstance("io.jsonwebtoken.io.OrgJsonSerializer");
        }
        throw new IllegalStateException("Unable to discover any JSON Serializer implementations on the classpath.");
    }

    protected boolean compareAndSet(Serializer<Object> s2) {
        return SERIALIZER.compareAndSet(null, s2);
    }

    protected boolean isAvailable(String fqcn) {
        return Classes.isAvailable(fqcn);
    }
}

