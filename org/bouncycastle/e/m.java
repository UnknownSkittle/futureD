/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.util.ArrayList;
import org.bouncycastle.e.j;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
final class m
extends ArrayList<String>
implements j {
    private m() {
    }

    @Override
    public final boolean a(String string) {
        return super.add(string);
    }

    @Override
    public final /* synthetic */ String a() {
        return (String)super.get(0);
    }

    /* synthetic */ m(byte by2) {
        this();
    }
}

