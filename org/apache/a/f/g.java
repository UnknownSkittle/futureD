/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.f;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.a.f.c;

public final class g
implements Serializable,
Comparator<c> {
    public static final g a = new g();

    private static String a(c object) {
        if ((object = object.e()) == null) {
            object = "/";
        }
        if (!((String)object).endsWith("/")) {
            object = (String)object + '/';
        }
        return object;
    }

    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        object2 = (c)object2;
        if (!((String)(object = g.a((c)object))).equals(object2 = g.a((c)object2))) {
            if (((String)object).startsWith((String)object2)) {
                return -1;
            }
            if (((String)object2).startsWith((String)object)) {
                return 1;
            }
        }
        return 0;
    }
}

