/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.JCommander$Options;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterDescription;
import java.util.Comparator;

class JCommander$Options$1
implements Comparator<ParameterDescription> {
    final /* synthetic */ JCommander.Options this$0;

    JCommander$Options$1(JCommander.Options options) {
        this.this$0 = options;
    }

    @Override
    public int compare(ParameterDescription parameterDescription, ParameterDescription parameterDescription2) {
        Parameter parameter = parameterDescription.getParameterAnnotation();
        Parameter parameter2 = parameterDescription2.getParameterAnnotation();
        if (parameter != null && parameter.order() != -1 && parameter2 != null && parameter2.order() != -1) {
            return Integer.compare(parameter.order(), parameter2.order());
        }
        if (parameter != null && parameter.order() != -1) {
            return -1;
        }
        if (parameter2 != null && parameter2.order() != -1) {
            return 1;
        }
        return parameterDescription.getLongestName().compareTo(parameterDescription2.getLongestName());
    }
}

