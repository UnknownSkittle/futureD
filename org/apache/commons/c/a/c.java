/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.c.a;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.c.a.a;
import org.apache.commons.c.a.b;

public final class c
extends org.apache.commons.c.c {
    private ConcurrentMap<String, org.apache.commons.c.a> a;
    private Hashtable b = new Hashtable();

    public c() {
        this.a = new ConcurrentHashMap<String, org.apache.commons.c.a>();
    }

    public final org.apache.commons.c.a a(Class clazz) {
        return this.a(clazz.getName());
    }

    public final org.apache.commons.c.a a(String object) {
        Object object2 = (org.apache.commons.c.a)this.a.get(object);
        if (object2 != null) {
            return object2;
        }
        object2 = org.b.c.a((String)object);
        object2 = object2 instanceof org.b.c.a ? new a((org.b.c.a)object2) : new b((org.b.b)object2);
        if ((object = this.a.putIfAbsent((String)object, (org.apache.commons.c.a)object2)) == null) {
            return object2;
        }
        return object;
    }
}

