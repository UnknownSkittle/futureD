/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

public final class f
extends Permission {
    private final Set<String> a = new HashSet<String>();

    public f(String string) {
        super(string);
        this.a.add(string);
    }

    public final boolean implies(Permission permission) {
        if (permission instanceof f) {
            permission = (f)permission;
            if (this.getName().equals(permission.getName())) {
                return true;
            }
            if (this.a.containsAll(((f)permission).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object object) {
        if (object instanceof f) {
            object = (f)object;
            if (this.a.equals(((f)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String getActions() {
        return this.a.toString();
    }
}

