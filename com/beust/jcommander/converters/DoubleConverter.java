/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

public class DoubleConverter
extends BaseConverter<Double> {
    public DoubleConverter(String string) {
        super(string);
    }

    @Override
    public Double convert(String string) {
        try {
            return Double.parseDouble(string);
        } catch (NumberFormatException numberFormatException) {
            throw new ParameterException(this.getErrorString(string, "a double"));
        }
    }
}

