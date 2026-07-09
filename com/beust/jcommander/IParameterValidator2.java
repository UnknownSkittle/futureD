/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterDescription;

public interface IParameterValidator2
extends IParameterValidator {
    public void validate(String var1, String var2, ParameterDescription var3);
}

