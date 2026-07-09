/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.converters.BaseConverter;
import java.net.URI;
import java.net.URISyntaxException;

public class URIConverter
extends BaseConverter<URI> {
    public URIConverter(String string) {
        super(string);
    }

    @Override
    public URI convert(String string) {
        try {
            return new URI(string);
        } catch (URISyntaxException uRISyntaxException) {
            throw new ParameterException(this.getErrorString(string, "a RFC 2396 and RFC 2732 compliant URI"));
        }
    }
}

