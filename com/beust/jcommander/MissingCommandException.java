/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.ParameterException;

public class MissingCommandException
extends ParameterException {
    private final String unknownCommand;

    public MissingCommandException(String string) {
        this(string, (String)null);
    }

    public MissingCommandException(String string, String string2) {
        super(string);
        this.unknownCommand = string2;
    }

    public String getUnknownCommand() {
        return this.unknownCommand;
    }
}

