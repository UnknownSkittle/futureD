/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 */
package baritone;

import baritone.api.cache.IRememberedInventory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s
implements IRememberedInventory {
    public final List<aip> a;
    private int b;
    public int a = new ArrayList<aip>();

    private s() {
    }

    @Override
    public final List<aip> getContents() {
        return Collections.unmodifiableList(this.a);
    }

    @Override
    public final int getSize() {
        return this.a;
    }

    /* synthetic */ s(byte by2) {
        this();
    }

    static /* synthetic */ List a(s s2) {
        return s2.a;
    }

    static /* synthetic */ int a(s s2, int n2) {
        s2.a = n2;
        return s2.a;
    }

    static /* synthetic */ int b(s s2, int n2) {
        s2.b = n2;
        return s2.b;
    }

    static /* synthetic */ int a(s s2) {
        return s2.b;
    }
}

