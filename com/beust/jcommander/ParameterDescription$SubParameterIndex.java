/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.ParameterDescription;
import java.lang.reflect.Field;

class ParameterDescription$SubParameterIndex {
    int order = -1;
    Field field;
    final /* synthetic */ ParameterDescription this$0;

    public ParameterDescription$SubParameterIndex(ParameterDescription parameterDescription, int n2, Field field) {
        this.this$0 = parameterDescription;
        this.order = n2;
        this.field = field;
    }
}

