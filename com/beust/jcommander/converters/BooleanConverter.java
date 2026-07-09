/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

public class BooleanConverter
extends BaseConverter<Boolean> {
    public BooleanConverter(String string) {
        super(string);
    }

    @Override
    public Boolean convert(String string) {
        if ("false".equalsIgnoreCase(string) || "true".equalsIgnoreCase(string)) {
            return Boolean.parseBoolean(string);
        }
        throw new ParameterException(this.getErrorString(string, "a boolean"));
    }
}

