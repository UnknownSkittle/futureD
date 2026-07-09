/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameterized;
import java.lang.reflect.Type;

class JCommander$2
implements IStringConverter {
    final /* synthetic */ Parameterized val$parameterized;
    final /* synthetic */ JCommander this$0;

    JCommander$2(JCommander jCommander, Parameterized parameterized) {
        this.this$0 = jCommander;
        this.val$parameterized = parameterized;
    }

    public Object convert(String string) {
        Type type = this.val$parameterized.findFieldGenericType();
        return this.this$0.convertValue(this.val$parameterized, type instanceof Class ? (Class)type : String.class, null, string);
    }
}

