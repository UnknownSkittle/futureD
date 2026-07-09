/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

public class IntegerConverter
extends BaseConverter<Integer> {
    public IntegerConverter(String string) {
        super(string);
    }

    @Override
    public Integer convert(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException numberFormatException) {
            throw new ParameterException(this.getErrorString(string, "an integer"));
        }
    }
}

