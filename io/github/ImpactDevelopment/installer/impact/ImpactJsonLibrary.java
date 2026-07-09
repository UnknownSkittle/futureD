/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import a.a.a.a;
import a.a.a.b;
import a.a.a.d;
import com.a.a.d.c;
import com.a.a.k;

public class ImpactJsonLibrary {
    public String name;
    public String sha1;
    public Integer size;

    public /* synthetic */ void toJson$0(k k2, com.a.a.d.d d2, d d3) {
        d2.d();
        this.toJsonBody$0(k2, d2, d3);
        d2.e();
    }

    protected /* synthetic */ void toJsonBody$0(k object, com.a.a.d.d d2, d d3) {
        ImpactJsonLibrary impactJsonLibrary = this;
        if (impactJsonLibrary != impactJsonLibrary.name) {
            d3.a(d2, 5);
            d2.b(this.name);
        }
        ImpactJsonLibrary impactJsonLibrary2 = this;
        if (impactJsonLibrary2 != impactJsonLibrary2.sha1) {
            d3.a(d2, 0);
            d2.b(this.sha1);
        }
        ImpactJsonLibrary impactJsonLibrary3 = this;
        if (impactJsonLibrary3 != impactJsonLibrary3.size) {
            d3.a(d2, 2);
            k k2 = object;
            object = this.size;
            a.a(k2, Integer.class, object).write(d2, object);
        }
    }

    public /* synthetic */ void fromJson$0(k k2, com.a.a.d.a a2, b b2) {
        a2.c();
        while (a2.e()) {
            int n2 = b2.a(a2);
            this.fromJsonField$0(k2, a2, n2);
        }
        a2.d();
    }

    protected /* synthetic */ void fromJsonField$0(k k2, com.a.a.d.a a2, int n2) {
        boolean bl2 = a2.f() != c.i;
        switch (n2) {
            case 5: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.name = a2.h();
                        return;
                    }
                    this.name = Boolean.toString(a2.i());
                    return;
                }
                this.name = null;
                a2.j();
                return;
            }
            case 0: {
                if (bl2) {
                    if (a2.f() != c.h) {
                        this.sha1 = a2.h();
                        return;
                    }
                    this.sha1 = Boolean.toString(a2.i());
                    return;
                }
                this.sha1 = null;
                a2.j();
                return;
            }
            case 2: {
                if (bl2) {
                    this.size = k2.a(Integer.class).read(a2);
                    return;
                }
                this.size = null;
                a2.j();
                return;
            }
        }
        a2.n();
    }
}

