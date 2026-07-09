/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;

public class LongConverter
extends BaseConverter<Long> {
    public LongConverter(String string) {
        super(string);
    }

    @Override
    public Long convert(String string) {
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException numberFormatException) {
            throw new ParameterException(this.getErrorString(string, "a long"));
        }
    }
}

