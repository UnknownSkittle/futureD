/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConverter
extends BaseConverter<URL> {
    public URLConverter(String string) {
        super(string);
    }

    @Override
    public URL convert(String string) {
        try {
            return new URL(string);
        } catch (MalformedURLException malformedURLException) {
            throw new ParameterException(this.getErrorString(string, "a RFC 2396 and RFC 2732 compliant URL"));
        }
    }
}

