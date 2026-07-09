/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.c;

import com.a.a.b.ai;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a<T> {
    final Class<? super T> rawType;
    final Type type;
    final int hashCode;

    protected a() {
        this.type = a.getSuperclassTypeParameter(this.getClass());
        this.rawType = com.a.a.b.a.c(this.type);
        this.hashCode = this.type.hashCode();
    }

    a(Type type) {
        this.type = com.a.a.b.a.b(ai.a(type));
        this.rawType = com.a.a.b.a.c(this.type);
        this.hashCode = this.type.hashCode();
    }

    static Type getSuperclassTypeParameter(Class<?> type) {
        if ((type = type.getGenericSuperclass()) instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return com.a.a.b.a.b(((ParameterizedType)type).getActualTypeArguments()[0]);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> clazz) {
        return this.isAssignableFrom((Type)clazz);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        if (this.type instanceof Class) {
            return this.rawType.isAssignableFrom(com.a.a.b.a.c(type));
        }
        if (this.type instanceof ParameterizedType) {
            return a.isAssignableFrom(type, (ParameterizedType)this.type, new HashMap<String, Type>());
        }
        if (this.type instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(com.a.a.b.a.c(type)) && a.isAssignableFrom(type, (GenericArrayType)this.type);
        }
        throw a.buildUnexpectedTypeError(this.type, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> a2) {
        return this.isAssignableFrom(a2.getType());
    }

    private static boolean isAssignableFrom(Type clazz, GenericArrayType type) {
        if ((type = type.getGenericComponentType()) instanceof ParameterizedType) {
            Class<?> clazz2 = clazz;
            if (clazz instanceof GenericArrayType) {
                clazz2 = ((GenericArrayType)((Object)clazz)).getGenericComponentType();
            } else if (clazz instanceof Class) {
                clazz = clazz;
                while (clazz.isArray()) {
                    clazz = clazz.getComponentType();
                }
                clazz2 = clazz;
            }
            return a.isAssignableFrom(clazz2, (ParameterizedType)type, new HashMap<String, Type>());
        }
        return true;
    }

    private static boolean isAssignableFrom(Type object, ParameterizedType parameterizedType, Map<String, Type> map) {
        while (object != null) {
            int n2;
            if (parameterizedType.equals(object)) {
                return true;
            }
            Class<?> clazz = com.a.a.b.a.c((Type)object);
            ParameterizedType parameterizedType2 = null;
            if (object instanceof ParameterizedType) {
                parameterizedType2 = (ParameterizedType)object;
            }
            if (parameterizedType2 != null) {
                object = parameterizedType2.getActualTypeArguments();
                TypeVariable<Class<?>>[] typeVariableArray = clazz.getTypeParameters();
                for (n2 = 0; n2 < ((Type[])object).length; ++n2) {
                    Type type = object[n2];
                    TypeVariable<Class<?>> typeVariable = typeVariableArray[n2];
                    while (type instanceof TypeVariable) {
                        type = (TypeVariable)type;
                        type = map.get(type.getName());
                    }
                    map.put(typeVariable.getName(), type);
                }
                if (a.typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            object = clazz.getGenericInterfaces();
            int n3 = ((Type[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (!a.isAssignableFrom(object[n2], parameterizedType, new HashMap<String, Type>(map))) continue;
                return true;
            }
            map = new HashMap<String, Type>(map);
            object = clazz.getGenericSuperclass();
        }
        return false;
    }

    private static boolean typeEquals(ParameterizedType typeArray, ParameterizedType typeArray2, Map<String, Type> map) {
        if (typeArray.getRawType().equals(typeArray2.getRawType())) {
            typeArray = typeArray.getActualTypeArguments();
            typeArray2 = typeArray2.getActualTypeArguments();
            for (int i2 = 0; i2 < typeArray.length; ++i2) {
                if (a.matches(typeArray[i2], typeArray2[i2], map)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?> ... classArray) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> clazz : classArray) {
            stringBuilder.append(clazz.getName()).append(", ");
        }
        stringBuilder.append("but got: ").append(type.getClass().getName()).append(", for type token: ").append(type.toString()).append('.');
        return new AssertionError((Object)stringBuilder.toString());
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || type instanceof TypeVariable && type2.equals(map.get(((TypeVariable)type).getName()));
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final boolean equals(Object object) {
        return object instanceof a && com.a.a.b.a.a(this.type, ((a)object).type);
    }

    public final String toString() {
        return com.a.a.b.a.d(this.type);
    }

    public static a<?> get(Type type) {
        return new a(type);
    }

    public static <T> a<T> get(Class<T> clazz) {
        return new a<T>(clazz);
    }

    public static a<?> getParameterized(Type type, Type ... typeArray) {
        return new a(com.a.a.b.a.a(null, type, typeArray));
    }

    public static a<?> getArray(Type type) {
        return new a(com.a.a.b.a.a(type));
    }
}

