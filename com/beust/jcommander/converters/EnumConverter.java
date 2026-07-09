/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.ParameterException;
import java.util.EnumSet;

public class EnumConverter<T extends Enum<T>>
implements IStringConverter<T> {
    private final String optionName;
    private final Class<T> clazz;

    public EnumConverter(String string, Class<T> clazz) {
        this.optionName = string;
        this.clazz = clazz;
    }

    @Override
    public T convert(String string) {
        try {
            try {
                return Enum.valueOf(this.clazz, string);
            } catch (IllegalArgumentException illegalArgumentException) {
                return Enum.valueOf(this.clazz, string.toUpperCase());
            }
        } catch (Exception exception) {
            throw new ParameterException("Invalid value for " + this.optionName + " parameter. Allowed values:" + EnumSet.allOf(this.clazz));
        }
    }
}

