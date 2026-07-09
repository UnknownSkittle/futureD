/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

public class FloatConverter
extends BaseConverter<Float> {
    public FloatConverter(String string) {
        super(string);
    }

    @Override
    public Float convert(String string) {
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException numberFormatException) {
            throw new ParameterException(this.getErrorString(string, "a float"));
        }
    }
}

