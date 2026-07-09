/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ae;
import com.a.a.af;

public abstract class ad
extends Enum<ad> {
    public static final /* enum */ ad a = new ae();
    private static /* enum */ ad b = new af();
    private static final /* synthetic */ ad[] c;

    public static ad[] values() {
        return (ad[])c.clone();
    }

    public static ad valueOf(String string) {
        return Enum.valueOf(ad.class, string);
    }

    private ad() {
    }

    /* synthetic */ ad(String string, int n2, byte by2) {
        this();
    }

    static {
        c = new ad[]{a, b};
    }
}

