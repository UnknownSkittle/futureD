/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.ac;
import org.a.c.a.c;
import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.a.f;

public final class ad
extends c {
    @Override
    public final d a(f object, e e2) {
        boolean bl2;
        block9: {
            if (object.f() >= 4) {
                return null;
            }
            int n2 = object.d();
            object = object.b();
            CharSequence charSequence = object;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = charSequence.length();
            block6: for (int i2 = n2; i2 < n6; ++i2) {
                switch (charSequence.charAt(i2)) {
                    case '-': {
                        ++n3;
                        continue block6;
                    }
                    case '_': {
                        ++n4;
                        continue block6;
                    }
                    case '*': {
                        ++n5;
                        continue block6;
                    }
                    case '\t': 
                    case ' ': {
                        continue block6;
                    }
                    default: {
                        bl2 = false;
                        break block9;
                    }
                }
            }
            bl2 = n3 >= 3 && n4 == 0 && n5 == 0 || n4 >= 3 && n3 == 0 && n5 == 0 || n5 >= 3 && n3 == 0 && n4 == 0;
        }
        if (bl2) {
            return d.a(new ac()).a(object.length());
        }
        return null;
    }
}

