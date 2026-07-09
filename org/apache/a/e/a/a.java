/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.a;

import com.a.a.b.ai;
import org.apache.a.e.a.c;
import org.apache.a.e.a.e;

public final class a
implements c {
    @Override
    public final int a(e e2, e e3) {
        int n2;
        ai.a(e2, "Planned route");
        if (e3 == null || e3.d() <= 0) {
            n2 = e2.d() > 1 ? 2 : 1;
        } else if (e2.d() > 1) {
            int n3;
            block11: {
                if (e3.d() <= 1) {
                    n3 = -1;
                } else if (!e2.a().equals(e3.a())) {
                    n3 = -1;
                } else {
                    int n4;
                    int n5 = e2.d();
                    if (n5 < (n4 = e3.d())) {
                        n3 = -1;
                    } else {
                        for (int i2 = 0; i2 < n4 - 1; ++i2) {
                            if (e2.a(i2).equals(e3.a(i2))) continue;
                            n3 = -1;
                            break block11;
                        }
                        n3 = n5 > n4 ? 4 : (e3.f() && !e2.f() || e3.g() && !e2.g() ? -1 : (e2.f() && !e3.f() ? 3 : (e2.g() && !e3.g() ? 5 : (e2.h() != e3.h() ? -1 : 0))));
                    }
                }
            }
            n2 = n3;
        } else {
            n2 = e3.d() > 1 ? -1 : (!e2.a().equals(e3.a()) ? -1 : (e2.h() != e3.h() ? -1 : (e2.b() != null && !e2.b().equals(e3.b()) ? -1 : 0)));
        }
        return n2;
    }
}

