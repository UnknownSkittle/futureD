/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class PositiveInteger
implements IParameterValidator {
    @Override
    public void validate(String string, String string2) {
        if (Integer.parseInt(string2) < 0) {
            throw new ParameterException("Parameter " + string + " should be positive (found " + string2 + ")");
        }
    }
}

