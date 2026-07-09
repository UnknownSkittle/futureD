/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.JCommander;

public class ParameterException
extends RuntimeException {
    private JCommander jc;

    public ParameterException(Throwable throwable) {
        super(throwable);
    }

    public ParameterException(String string) {
        super(string);
    }

    public ParameterException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public void setJCommander(JCommander jCommander) {
        this.jc = jCommander;
    }

    public JCommander getJCommander() {
        return this.jc;
    }

    public void usage() {
        if (this.jc != null) {
            this.jc.usage();
        }
    }
}

