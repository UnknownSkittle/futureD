/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;
import java.math.BigDecimal;

public class BigDecimalConverter
extends BaseConverter<BigDecimal> {
    public BigDecimalConverter(String string) {
        super(string);
    }

    @Override
    public BigDecimal convert(String string) {
        try {
            return new BigDecimal(string);
        } catch (NumberFormatException numberFormatException) {
            throw new ParameterException(this.getErrorString(string, "a BigDecimal"));
        }
    }
}

