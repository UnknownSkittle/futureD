/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import a.a.a.b;
import a.a.a.d;
import a.a.a.f;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.k;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;

public class OptimizedImpactJsonLibraryTypeAdapter
extends ag
implements f {
    private k gson;
    private b optimizedJsonReader;
    private d optimizedJsonWriter;

    public OptimizedImpactJsonLibraryTypeAdapter(k k2, b b2, d d2) {
        this.gson = k2;
        this.optimizedJsonReader = b2;
        this.optimizedJsonWriter = d2;
    }

    public void write(com.a.a.d.d d2, Object object) {
        if (object == null) {
            d2.f();
            return;
        }
        ((ImpactJsonLibrary)object).toJson$0(this.gson, d2, this.optimizedJsonWriter);
    }

    public Object read(a a2) {
        if (a2.f() == c.i) {
            a2.n();
            return null;
        }
        ImpactJsonLibrary impactJsonLibrary = new ImpactJsonLibrary();
        impactJsonLibrary.fromJson$0(this.gson, a2, this.optimizedJsonReader);
        return impactJsonLibrary;
    }
}

