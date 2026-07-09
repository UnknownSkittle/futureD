/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IValueValidator;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WrappedParameter {
    private Parameter parameter;
    private DynamicParameter dynamicParameter;

    public WrappedParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public WrappedParameter(DynamicParameter dynamicParameter) {
        this.dynamicParameter = dynamicParameter;
    }

    public Parameter getParameter() {
        return this.parameter;
    }

    public DynamicParameter getDynamicParameter() {
        return this.dynamicParameter;
    }

    public int arity() {
        if (this.parameter != null) {
            return this.parameter.arity();
        }
        return 1;
    }

    public boolean hidden() {
        if (this.parameter != null) {
            return this.parameter.hidden();
        }
        return this.dynamicParameter.hidden();
    }

    public boolean required() {
        if (this.parameter != null) {
            return this.parameter.required();
        }
        return this.dynamicParameter.required();
    }

    public boolean password() {
        if (this.parameter != null) {
            return this.parameter.password();
        }
        return false;
    }

    public String[] names() {
        if (this.parameter != null) {
            return this.parameter.names();
        }
        return this.dynamicParameter.names();
    }

    public boolean variableArity() {
        if (this.parameter != null) {
            return this.parameter.variableArity();
        }
        return false;
    }

    public Class<? extends IParameterValidator>[] validateWith() {
        if (this.parameter != null) {
            return this.parameter.validateWith();
        }
        return this.dynamicParameter.validateWith();
    }

    public Class<? extends IValueValidator>[] validateValueWith() {
        if (this.parameter != null) {
            return this.parameter.validateValueWith();
        }
        return this.dynamicParameter.validateValueWith();
    }

    public boolean echoInput() {
        if (this.parameter != null) {
            return this.parameter.echoInput();
        }
        return false;
    }

    public void addValue(Parameterized parameterized, Object object, Object object2) {
        try {
            this.addValue(parameterized, object, object2, null);
            return;
        } catch (IllegalAccessException illegalAccessException) {
            throw new ParameterException("Couldn't set " + object + " to " + object2, illegalAccessException);
        }
    }

    public void addValue(Parameterized parameterized, Object object, Object object2, Field object3) {
        if (this.parameter != null) {
            if (object3 != null) {
                ((Field)object3).set(object, object2);
                return;
            }
            parameterized.set(object, object2);
            return;
        }
        object3 = this.dynamicParameter.assignment();
        int n2 = ((String)(object2 = object2.toString())).indexOf((String)object3);
        if (n2 == -1) {
            throw new ParameterException("Dynamic parameter expected a value of the form a" + (String)object3 + "b but got:" + (String)object2);
        }
        this.callPut(object, parameterized, ((String)object2).substring(0, n2), ((String)object2).substring(n2 + 1));
    }

    private void callPut(Object object, Parameterized parameterized, String string, String string2) {
        try {
            this.findPut(parameterized.getType()).invoke(parameterized.get(object), string, string2);
            return;
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException exception) {
            exception.printStackTrace();
            return;
        }
    }

    private Method findPut(Class<?> clazz) {
        return clazz.getMethod("put", Object.class, Object.class);
    }

    public String getAssignment() {
        if (this.dynamicParameter != null) {
            return this.dynamicParameter.assignment();
        }
        return "";
    }

    public boolean isHelp() {
        return this.parameter != null && this.parameter.help();
    }

    public boolean isNonOverwritableForced() {
        return this.parameter != null && this.parameter.forceNonOverwritable();
    }
}

