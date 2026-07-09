/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.io;

import io.jsonwebtoken.impl.io.InstanceLocator;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import java.util.concurrent.atomic.AtomicReference;

public class RuntimeClasspathDeserializerLocator<T>
implements InstanceLocator<Deserializer<T>> {
    private static final AtomicReference<Deserializer> DESERIALIZER = new AtomicReference();

    @Override
    public Deserializer<T> getInstance() {
        Deserializer deserializer = DESERIALIZER.get();
        if (deserializer == null) {
            deserializer = this.locate();
            Assert.state(deserializer != null, "locate() cannot return null.");
            if (!this.compareAndSet(deserializer)) {
                deserializer = DESERIALIZER.get();
            }
        }
        Assert.state(deserializer != null, "deserializer cannot be null.");
        return deserializer;
    }

    protected Deserializer<T> locate() {
        if (this.isAvailable("io.jsonwebtoken.io.JacksonDeserializer")) {
            return (Deserializer)Classes.newInstance("io.jsonwebtoken.io.JacksonDeserializer");
        }
        if (this.isAvailable("io.jsonwebtoken.io.OrgJsonDeserializer")) {
            return (Deserializer)Classes.newInstance("io.jsonwebtoken.io.OrgJsonDeserializer");
        }
        throw new IllegalStateException("Unable to discover any JSON Deserializer implementations on the classpath.");
    }

    protected boolean compareAndSet(Deserializer<T> d2) {
        return DESERIALIZER.compareAndSet(null, d2);
    }

    protected boolean isAvailable(String fqcn) {
        return Classes.isAvailable(fqcn);
    }
}

