/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.f;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.a.f.c;

public final class e
implements Serializable,
Comparator<c> {
    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        String string;
        object2 = (c)object2;
        int n2 = (object = (c)object).a().compareTo(object2.a());
        if (n2 == 0) {
            String string2 = object.d();
            if (string2 == null) {
                string2 = "";
            } else if (string2.indexOf(46) == -1) {
                string2 = string2 + ".local";
            }
            string = object2.d();
            if (string == null) {
                string = "";
            } else if (string.indexOf(46) == -1) {
                string = string + ".local";
            }
            n2 = string2.compareToIgnoreCase(string);
        }
        if (n2 == 0) {
            String string3 = object.e();
            if (string3 == null) {
                string3 = "/";
            }
            if ((string = object2.e()) == null) {
                string = "/";
            }
            n2 = string3.compareTo(string);
        }
        return n2;
    }
}

