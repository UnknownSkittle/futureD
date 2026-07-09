/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.c;
import java.lang.reflect.Field;
import java.util.Locale;

final class g
extends c {
    @Override
    public final String a(Field field) {
        return g.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
    }
}

