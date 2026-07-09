/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
final class ae
extends ObjectInputStream {
    private static final Set a = new HashSet<String>();
    private final Class b;
    private boolean c = false;

    ae(Class clazz, InputStream inputStream) {
        super(inputStream);
        this.b = clazz;
    }

    @Override
    protected final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        if (!this.c) {
            if (!objectStreamClass.getName().equals(this.b.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.c = true;
        } else if (!a.contains(objectStreamClass.getName())) {
            throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }

    static {
        a.add("java.util.TreeMap");
        a.add("java.lang.Integer");
        a.add("java.lang.Number");
        a.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        a.add("java.util.ArrayList");
        a.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        a.add("[B");
        a.add("java.util.LinkedList");
        a.add("java.util.Stack");
        a.add("java.util.Vector");
        a.add("[Ljava.lang.Object;");
        a.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }
}

