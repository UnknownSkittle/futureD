/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package a.a.a;

import a.a.a.c;
import a.a.a.e;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.c.a;
import com.a.a.k;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.impact.OptimizedImpactJsonLibraryTypeAdapter;
import io.github.ImpactDevelopment.installer.impact.OptimizedImpactJsonVersionTypeAdapter;

public final class g
implements ai {
    private static final c a = new c();
    private static final e b = new e();

    @Override
    public final <T> ag<T> a(k k2, a<T> a2) {
        if (a2.getRawType() == ImpactJsonLibrary.class) {
            return new OptimizedImpactJsonLibraryTypeAdapter(k2, a, b);
        }
        if (a2.getRawType() == ImpactJsonVersion.class) {
            return new OptimizedImpactJsonVersionTypeAdapter(k2, a, b);
        }
        return null;
    }
}

