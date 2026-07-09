/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ISO8601DateConverter
extends BaseConverter<Date> {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public ISO8601DateConverter(String string) {
        super(string);
    }

    @Override
    public Date convert(String string) {
        try {
            return DATE_FORMAT.parse(string);
        } catch (ParseException parseException) {
            throw new ParameterException(this.getErrorString(string, String.format("an ISO-8601 formatted date (%s)", DATE_FORMAT.toPattern())));
        }
    }
}

