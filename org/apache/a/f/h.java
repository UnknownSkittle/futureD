/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.f;

import java.util.Comparator;
import java.util.Date;
import org.apache.a.f.c;

public final class h
implements Comparator<c> {
    public static final h a = new h();

    private static int a(c object) {
        if ((object = object.e()) != null) {
            return ((String)object).length();
        }
        return 1;
    }

    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        Object object3 = (c)object2;
        object2 = (c)object;
        int n2 = h.a((c)object2);
        n2 = h.a((c)object3) - n2;
        if (n2 == 0 && object2 instanceof org.apache.a.h.d.c && object3 instanceof org.apache.a.h.d.c) {
            object2 = ((org.apache.a.h.d.c)object2).k();
            object3 = ((org.apache.a.h.d.c)object3).k();
            if (object2 != null && object3 != null) {
                return (int)(((Date)object2).getTime() - ((Date)object3).getTime());
            }
        }
        return n2;
    }
}

