/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ai;
import com.a.a.b.b;
import com.a.a.b.c;
import com.a.a.b.d;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class a {
    static final Type[] a = new Type[0];

    public static ParameterizedType a(Type type, Type type2, Type ... typeArray) {
        return new c(type, type2, typeArray);
    }

    public static GenericArrayType a(Type type) {
        return new b(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            return ((Class)(type = (Class)type)).isArray() ? new b(com.a.a.b.a.b(((Class)type).getComponentType())) : type;
        }
        if (type instanceof ParameterizedType) {
            type = (ParameterizedType)type;
            return new c(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            type = (GenericArrayType)type;
            return new b(type.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            type = (WildcardType)type;
            return new d(type.getUpperBounds(), type.getLowerBounds());
        }
        return type;
    }

    public static Class<?> c(Type type) {
        while (true) {
            if (type instanceof Class) {
                return (Class)type;
            }
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType)type).getRawType();
                ai.a(type instanceof Class);
                return (Class)type;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(com.a.a.b.a.c(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (!(type instanceof WildcardType)) break;
            type = ((WildcardType)type).getUpperBounds()[0];
        }
        String string = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + string);
    }

    public static boolean a(Type type, Type type2) {
        while (true) {
            if (type == type2) {
                return true;
            }
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                type = (ParameterizedType)type;
                type2 = (ParameterizedType)type2;
                Type type3 = type2.getOwnerType();
                Type type4 = type.getOwnerType();
                return (type4 == type3 || type4 != null && type4.equals(type3)) && type.getRawType().equals(type2.getRawType()) && Arrays.equals(type.getActualTypeArguments(), type2.getActualTypeArguments());
            }
            if (!(type instanceof GenericArrayType)) break;
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            type = (GenericArrayType)type;
            type2 = (GenericArrayType)type2;
            type2 = type2.getGenericComponentType();
            type = type.getGenericComponentType();
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            type = (WildcardType)type;
            type2 = (WildcardType)type2;
            return Arrays.equals(type.getUpperBounds(), type2.getUpperBounds()) && Arrays.equals(type.getLowerBounds(), type2.getLowerBounds());
        }
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            type = (TypeVariable)type;
            type2 = (TypeVariable)type2;
            return type.getGenericDeclaration() == type2.getGenericDeclaration() && type.getName().equals(type2.getName());
        }
        return false;
    }

    static int a(Object object) {
        if (object != null) {
            return object.hashCode();
        }
        return 0;
    }

    public static String d(Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }

    private static Type a(Type object, Class<?> object2, Class<?> clazz) {
        block0: while (true) {
            if (clazz == object2) {
                return object;
            }
            if (clazz.isInterface()) {
                object = ((Class)object2).getInterfaces();
                int n2 = ((Class<?>[])object).length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (object[i2] == clazz) {
                        return ((Class)object2).getGenericInterfaces()[i2];
                    }
                    if (!clazz.isAssignableFrom(object[i2])) continue;
                    Type type = ((Class)object2).getGenericInterfaces()[i2];
                    object2 = object[i2];
                    object = type;
                    continue block0;
                }
            }
            if (((Class)object2).isInterface()) break;
            while (object2 != Object.class) {
                object = ((Class)object2).getSuperclass();
                if (object == clazz) {
                    return ((Class)object2).getGenericSuperclass();
                }
                if (clazz.isAssignableFrom((Class<?>)object)) {
                    Type type = ((Class)object2).getGenericSuperclass();
                    object2 = object;
                    object = type;
                    continue block0;
                }
                object2 = object;
            }
            break;
        }
        return clazz;
    }

    private static Type b(Type type, Class<?> clazz, Class<?> clazz2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType)type).getUpperBounds()[0];
        }
        ai.a(clazz2.isAssignableFrom(clazz));
        return com.a.a.b.a.a(type, clazz, com.a.a.b.a.a(type, clazz, clazz2));
    }

    public static Type e(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        return ((Class)type).getComponentType();
    }

    public static Type a(Type type, Class<?> clazz) {
        if ((type = com.a.a.b.a.b(type, clazz, Collection.class)) instanceof WildcardType) {
            type = ((WildcardType)type).getUpperBounds()[0];
        }
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType)type).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] b(Type type, Class<?> clazz) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if ((type = com.a.a.b.a.b(type, clazz, Map.class)) instanceof ParameterizedType) {
            return ((ParameterizedType)type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class<?> clazz, Type type2) {
        return com.a.a.b.a.a(type, clazz, type2, new HashSet<TypeVariable>());
    }

    private static Type a(Type type, Class<?> clazz, Type object, Collection<TypeVariable> collection) {
        Type type2;
        while (object instanceof TypeVariable) {
            Object object2;
            type2 = (TypeVariable)object;
            if (collection.contains(type2)) {
                return object;
            }
            collection.add((TypeVariable)type2);
            Type type3 = type2;
            Class<?> clazz2 = clazz;
            object = type;
            Object object3 = type3.getGenericDeclaration();
            TypeVariable<Class<T>>[] typeVariableArray = object3 instanceof Class ? (TypeVariable<Class<T>>[])object3 : null;
            if (typeVariableArray != null && (object = com.a.a.b.a.a((Type)object, clazz2, typeVariableArray)) instanceof ParameterizedType) {
                int n2;
                block19: {
                    object3 = type3;
                    typeVariableArray = typeVariableArray.getTypeParameters();
                    int n3 = typeVariableArray.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        if (!object3.equals(typeVariableArray[n2])) {
                            continue;
                        }
                        break block19;
                    }
                    throw new NoSuchElementException();
                }
                object2 = ((ParameterizedType)object).getActualTypeArguments()[n2];
            } else {
                object2 = object = type3;
            }
            if (object2 != type2) continue;
            return object;
        }
        if (object instanceof Class && ((Class)object).isArray()) {
            Type type4;
            type2 = (Class)object;
            if ((object = ((Class)type2).getComponentType()) == (type4 = com.a.a.b.a.a(type, clazz, object, collection))) {
                return type2;
            }
            return com.a.a.b.a.a(type4);
        }
        if (object instanceof GenericArrayType) {
            Type type5;
            type2 = (GenericArrayType)object;
            if ((object = type2.getGenericComponentType()) == (type5 = com.a.a.b.a.a(type, clazz, object, collection))) {
                return type2;
            }
            return com.a.a.b.a.a(type5);
        }
        if (object instanceof ParameterizedType) {
            type2 = (ParameterizedType)object;
            Type type6 = com.a.a.b.a.a(type, clazz, object = type2.getOwnerType(), collection);
            boolean bl2 = type6 != object;
            object = type2.getActualTypeArguments();
            int n4 = ((Type[])object).length;
            for (int i2 = 0; i2 < n4; ++i2) {
                Type type7 = com.a.a.b.a.a(type, clazz, object[i2], collection);
                if (type7 == object[i2]) continue;
                if (!bl2) {
                    object = (Type[])object.clone();
                    bl2 = true;
                }
                object[i2] = type7;
            }
            if (bl2) {
                return com.a.a.b.a.a(type6, type2.getRawType(), (Type[])object);
            }
            return type2;
        }
        if (object instanceof WildcardType) {
            Type type8;
            type2 = (WildcardType)object;
            object = type2.getLowerBounds();
            Type[] typeArray = type2.getUpperBounds();
            if (((Type[])object).length == 1) {
                Type type9 = com.a.a.b.a.a(type, clazz, object[0], collection);
                if (type9 != object[0]) {
                    object = type9;
                    typeArray = object instanceof WildcardType ? ((WildcardType)object).getLowerBounds() : new Type[]{object};
                    return new d(new Type[]{Object.class}, typeArray);
                }
            } else if (typeArray.length == 1 && (type8 = com.a.a.b.a.a(type, clazz, typeArray[0], collection)) != typeArray[0]) {
                object = type8;
                typeArray = object instanceof WildcardType ? ((WildcardType)object).getUpperBounds() : new Type[]{object};
                return new d(typeArray, a);
            }
            return type2;
        }
        return object;
    }

    static void f(Type type) {
        ai.a(!(type instanceof Class) || !((Class)type).isPrimitive());
    }
}

