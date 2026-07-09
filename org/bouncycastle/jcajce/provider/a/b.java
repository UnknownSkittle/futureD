/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.a;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.e.k;

public final class b
extends BasicPermission {
    private final String a;
    private final int b;

    public b(String string, String string2) {
        super(string, string2);
        this.a = string2;
        this.b = org.bouncycastle.jcajce.provider.a.b.a(string2);
    }

    private static int a(String object) {
        object = new StringTokenizer(k.c((String)object), " ,");
        int n2 = 0;
        while (((StringTokenizer)object).hasMoreTokens()) {
            String string = ((StringTokenizer)object).nextToken();
            if (string.equals("threadlocalecimplicitlyca")) {
                n2 |= 1;
                continue;
            }
            if (string.equals("ecimplicitlyca")) {
                n2 |= 2;
                continue;
            }
            if (string.equals("threadlocaldhdefaultparams")) {
                n2 |= 4;
                continue;
            }
            if (string.equals("dhdefaultparams")) {
                n2 |= 8;
                continue;
            }
            if (string.equals("acceptableeccurves")) {
                n2 |= 0x10;
                continue;
            }
            if (string.equals("additionalecparameters")) {
                n2 |= 0x20;
                continue;
            }
            if (!string.equals("all")) continue;
            n2 |= 0x3F;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        return n2;
    }

    public final String getActions() {
        return this.a;
    }

    public final boolean implies(Permission permission) {
        if (!(permission instanceof b)) {
            return false;
        }
        if (!this.getName().equals(permission.getName())) {
            return false;
        }
        permission = (b)permission;
        return (this.b & ((b)permission).b) == ((b)permission).b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            return this.b == ((b)object).b && this.getName().equals(((Permission)object).getName());
        }
        return false;
    }

    public final int hashCode() {
        return this.getName().hashCode() + this.b;
    }
}

