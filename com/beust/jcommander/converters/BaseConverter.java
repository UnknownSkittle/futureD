/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;

public abstract class BaseConverter<T>
implements IStringConverter<T> {
    private String optionName;

    public BaseConverter(String string) {
        this.optionName = string;
    }

    public String getOptionName() {
        return this.optionName;
    }

    protected String getErrorString(String string, String string2) {
        return "\"" + this.getOptionName() + "\": couldn't convert \"" + string + "\" to " + string2;
    }
}

