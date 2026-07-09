/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterDescription;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;
import java.util.List;

class JCommander$MainParameter {
    Parameterized parameterized;
    Object object;
    private Parameter annotation;
    private ParameterDescription description;
    private List<Object> multipleValue = null;
    private Object singleValue = null;
    private boolean firstTimeMainParameter = true;

    JCommander$MainParameter() {
    }

    public void addValue(Object object) {
        if (this.multipleValue != null) {
            this.multipleValue.add(object);
            return;
        }
        if (this.singleValue != null) {
            throw new ParameterException("Only one main parameter allowed but found several: \"" + this.singleValue + "\" and \"" + object + "\"");
        }
        this.singleValue = object;
        this.parameterized.set(this.object, object);
    }

    static /* synthetic */ ParameterDescription access$400(JCommander$MainParameter jCommander$MainParameter) {
        return jCommander$MainParameter.description;
    }

    static /* synthetic */ Parameter access$902(JCommander$MainParameter jCommander$MainParameter, Parameter parameter) {
        jCommander$MainParameter.annotation = parameter;
        return jCommander$MainParameter.annotation;
    }

    static /* synthetic */ ParameterDescription access$402(JCommander$MainParameter jCommander$MainParameter, ParameterDescription parameterDescription) {
        jCommander$MainParameter.description = parameterDescription;
        return jCommander$MainParameter.description;
    }

    static /* synthetic */ Parameter access$900(JCommander$MainParameter jCommander$MainParameter) {
        return jCommander$MainParameter.annotation;
    }

    static /* synthetic */ boolean access$1300(JCommander$MainParameter jCommander$MainParameter) {
        return jCommander$MainParameter.firstTimeMainParameter;
    }

    static /* synthetic */ boolean access$1302(JCommander$MainParameter jCommander$MainParameter, boolean bl2) {
        jCommander$MainParameter.firstTimeMainParameter = bl2;
        return jCommander$MainParameter.firstTimeMainParameter;
    }

    static /* synthetic */ List access$1402(JCommander$MainParameter jCommander$MainParameter, List list) {
        jCommander$MainParameter.multipleValue = list;
        return jCommander$MainParameter.multipleValue;
    }
}

