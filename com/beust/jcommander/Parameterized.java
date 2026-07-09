/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.ParametersDelegate;
import com.beust.jcommander.WrappedParameter;
import com.beust.jcommander.internal.Lists;
import com.beust.jcommander.internal.Sets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Parameterized {
    private Field field;
    private Method method;
    private Method getter;
    private WrappedParameter wrappedParameter;
    private ParametersDelegate parametersDelegate;

    public Parameterized(WrappedParameter wrappedParameter, ParametersDelegate parametersDelegate, Field field, Method method) {
        this.wrappedParameter = wrappedParameter;
        this.method = method;
        this.field = field;
        if (this.field != null) {
            if (parametersDelegate == null) {
                Parameterized.setFieldAccessible(this.field);
            } else {
                Parameterized.setFieldAccessibleWithoutFinalCheck(this.field);
            }
        }
        this.parametersDelegate = parametersDelegate;
    }

    private static void describeClassTree(Class<?> classArray, Set<Class<?>> set) {
        if (classArray == null) {
            return;
        }
        if (Object.class.equals(classArray) || set.contains(classArray)) {
            return;
        }
        set.add((Class<?>)classArray);
        Parameterized.describeClassTree(classArray.getSuperclass(), set);
        classArray = classArray.getInterfaces();
        int n2 = classArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Parameterized.describeClassTree(classArray[i2], set);
        }
    }

    private static Set<Class<?>> describeClassTree(Class<?> clazz) {
        if (clazz == null) {
            return Collections.emptySet();
        }
        Set<Class<?>> set = Sets.newLinkedHashSet();
        Parameterized.describeClassTree(clazz, set);
        return set;
    }

    public static List<Parameterized> parseArg(Object iterator) {
        List<Parameterized> list = Lists.newArrayList();
        for (Class<?> clazz : Parameterized.describeClassTree(iterator.getClass())) {
            DynamicParameter dynamicParameter;
            ParametersDelegate parametersDelegate;
            Parameter parameter;
            for (Field field : clazz.getDeclaredFields()) {
                parameter = field.getAnnotation(Parameter.class);
                parametersDelegate = field.getAnnotation(ParametersDelegate.class);
                dynamicParameter = field.getAnnotation(DynamicParameter.class);
                if (parameter != null) {
                    list.add(new Parameterized(new WrappedParameter(parameter), null, field, null));
                    continue;
                }
                if (dynamicParameter != null) {
                    list.add(new Parameterized(new WrappedParameter(dynamicParameter), null, field, null));
                    continue;
                }
                if (parametersDelegate == null) continue;
                list.add(new Parameterized(null, parametersDelegate, field, null));
            }
            for (AccessibleObject accessibleObject : clazz.getDeclaredMethods()) {
                ((Method)accessibleObject).setAccessible(true);
                parameter = ((Method)accessibleObject).getAnnotation(Parameter.class);
                parametersDelegate = ((Method)accessibleObject).getAnnotation(ParametersDelegate.class);
                dynamicParameter = ((Method)accessibleObject).getAnnotation(DynamicParameter.class);
                if (parameter != null) {
                    list.add(new Parameterized(new WrappedParameter(parameter), null, null, (Method)accessibleObject));
                    continue;
                }
                if (dynamicParameter != null) {
                    list.add(new Parameterized(new WrappedParameter(dynamicParameter), null, null, (Method)accessibleObject));
                    continue;
                }
                if (parametersDelegate == null) continue;
                list.add(new Parameterized(null, parametersDelegate, null, (Method)accessibleObject));
            }
        }
        return list;
    }

    public WrappedParameter getWrappedParameter() {
        return this.wrappedParameter;
    }

    public Class<?> getType() {
        if (this.method != null) {
            return this.method.getParameterTypes()[0];
        }
        return this.field.getType();
    }

    public String getName() {
        if (this.method != null) {
            return this.method.getName();
        }
        return this.field.getName();
    }

    public Object get(Object object) {
        try {
            if (this.method != null) {
                if (this.getter == null) {
                    this.getter = this.method.getDeclaringClass().getMethod("g" + this.method.getName().substring(1), new Class[0]);
                }
                return this.getter.invoke(object, new Object[0]);
            }
            return this.field.get(object);
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException exception) {
            throw new ParameterException(exception);
        } catch (NoSuchMethodException noSuchMethodException) {
            Object object2 = this.method.getName();
            object2 = Character.toLowerCase(((String)object2).charAt(3)) + ((String)object2).substring(4);
            Object object3 = null;
            try {
                object2 = this.method.getDeclaringClass().getDeclaredField((String)object2);
                if (object2 != null) {
                    Parameterized.setFieldAccessible((Field)object2);
                    object3 = ((Field)object2).get(object);
                }
            } catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {}
            return object3;
        }
    }

    public int hashCode() {
        return (31 + (this.field == null ? 0 : this.field.hashCode())) * 31 + (this.method == null ? 0 : this.method.hashCode());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (Parameterized)object;
        if (this.field == null ? ((Parameterized)object).field != null : !this.field.equals(((Parameterized)object).field)) {
            return false;
        }
        return !(this.method == null ? ((Parameterized)object).method != null : !this.method.equals(((Parameterized)object).method));
    }

    public boolean isDynamicParameter(Field field) {
        if (this.method != null) {
            return this.method.getAnnotation(DynamicParameter.class) != null;
        }
        return this.field.getAnnotation(DynamicParameter.class) != null;
    }

    private static void setFieldAccessible(Field field) {
        if (Modifier.isFinal(field.getModifiers())) {
            throw new ParameterException("Cannot use final field " + field.getDeclaringClass().getName() + "#" + field.getName() + " as a parameter; compile-time constant inlining may hide new values written to it.");
        }
        field.setAccessible(true);
    }

    private static void setFieldAccessibleWithoutFinalCheck(Field field) {
        field.setAccessible(true);
    }

    private static String errorMessage(Method method, Exception exception) {
        return "Could not invoke " + method + "\n    Reason: " + exception.getMessage();
    }

    public void set(Object object, Object object2) {
        try {
            if (this.method != null) {
                this.method.invoke(object, object2);
                return;
            }
            this.field.set(object, object2);
            return;
        } catch (IllegalAccessException | IllegalArgumentException exception) {
            throw new ParameterException(Parameterized.errorMessage(this.method, exception));
        } catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException;
            if (invocationTargetException.getTargetException() instanceof ParameterException) {
                throw (ParameterException)((InvocationTargetException)object).getTargetException();
            }
            throw new ParameterException(Parameterized.errorMessage(this.method, (Exception)object));
        }
    }

    public ParametersDelegate getDelegateAnnotation() {
        return this.parametersDelegate;
    }

    public Type getGenericType() {
        if (this.method != null) {
            return this.method.getGenericParameterTypes()[0];
        }
        return this.field.getGenericType();
    }

    public Parameter getParameter() {
        return this.wrappedParameter.getParameter();
    }

    public Type findFieldGenericType() {
        Type type;
        if (this.method != null) {
            return null;
        }
        if (this.field.getGenericType() instanceof ParameterizedType && (type = ((ParameterizedType)this.field.getGenericType()).getActualTypeArguments()[0]) instanceof Class) {
            return type;
        }
        return null;
    }

    public boolean isDynamicParameter() {
        return this.wrappedParameter.getDynamicParameter() != null;
    }
}

