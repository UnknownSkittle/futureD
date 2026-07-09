/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.c;
import java.lang.reflect.Field;
import java.util.Locale;

final class i
extends c {
    @Override
    public final String a(Field field) {
        return i.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
    }
}

