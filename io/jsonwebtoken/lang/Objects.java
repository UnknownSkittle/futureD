/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class Objects {
    private static final int INITIAL_HASH = 7;
    private static final int MULTIPLIER = 31;
    private static final String EMPTY_STRING = "";
    private static final String NULL_STRING = "null";
    private static final String ARRAY_START = "{";
    private static final String ARRAY_END = "}";
    private static final String EMPTY_ARRAY = "{}";
    private static final String ARRAY_ELEMENT_SEPARATOR = ", ";

    private Objects() {
    }

    public static boolean isCheckedException(Throwable ex2) {
        return !(ex2 instanceof RuntimeException) && !(ex2 instanceof Error);
    }

    public static boolean isCompatibleWithThrowsClause(Throwable ex2, Class[] declaredExceptions) {
        if (!Objects.isCheckedException(ex2)) {
            return true;
        }
        if (declaredExceptions != null) {
            for (int i2 = 0; i2 < declaredExceptions.length; ++i2) {
                if (!declaredExceptions[i2].isAssignableFrom(ex2.getClass())) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(byte[] array) {
        return array == null || array.length == 0;
    }

    public static boolean containsElement(Object[] array, Object element) {
        if (array == null) {
            return false;
        }
        for (Object arrayEle : array) {
            if (!Objects.nullSafeEquals(arrayEle, element)) continue;
            return true;
        }
        return false;
    }

    public static boolean containsConstant(Enum<?>[] enumValues, String constant) {
        return Objects.containsConstant(enumValues, constant, false);
    }

    public static boolean containsConstant(Enum<?>[] enumValues, String constant, boolean caseSensitive) {
        for (Enum<?> candidate : enumValues) {
            if (!(caseSensitive ? candidate.toString().equals(constant) : candidate.toString().equalsIgnoreCase(constant))) continue;
            return true;
        }
        return false;
    }

    public static <E extends Enum<?>> E caseInsensitiveValueOf(E[] enumValues, String constant) {
        for (E candidate : enumValues) {
            if (!((Enum)candidate).toString().equalsIgnoreCase(constant)) continue;
            return candidate;
        }
        throw new IllegalArgumentException(String.format("constant [%s] does not exist in enum type %s", constant, enumValues.getClass().getComponentType().getName()));
    }

    public static <A, O extends A> A[] addObjectToArray(A[] array, O obj) {
        Class compType = Object.class;
        if (array != null) {
            compType = array.getClass().getComponentType();
        } else if (obj != null) {
            compType = obj.getClass();
        }
        int newArrLength = array != null ? array.length + 1 : 1;
        Object[] newArr = (Object[])Array.newInstance(compType, newArrLength);
        if (array != null) {
            System.arraycopy(array, 0, newArr, 0, array.length);
        }
        newArr[newArr.length - 1] = obj;
        return newArr;
    }

    public static Object[] toObjectArray(Object source) {
        if (source instanceof Object[]) {
            return (Object[])source;
        }
        if (source == null) {
            return new Object[0];
        }
        if (!source.getClass().isArray()) {
            throw new IllegalArgumentException("Source is not an array: " + source);
        }
        int length = Array.getLength(source);
        if (length == 0) {
            return new Object[0];
        }
        Class<?> wrapperType = Array.get(source, 0).getClass();
        Object[] newArray = (Object[])Array.newInstance(wrapperType, length);
        for (int i2 = 0; i2 < length; ++i2) {
            newArray[i2] = Array.get(source, i2);
        }
        return newArray;
    }

    public static boolean nullSafeEquals(Object o1, Object o2) {
        if (o1 == o2) {
            return true;
        }
        if (o1 == null || o2 == null) {
            return false;
        }
        if (o1.equals(o2)) {
            return true;
        }
        if (o1.getClass().isArray() && o2.getClass().isArray()) {
            if (o1 instanceof Object[] && o2 instanceof Object[]) {
                return Arrays.equals((Object[])o1, (Object[])o2);
            }
            if (o1 instanceof boolean[] && o2 instanceof boolean[]) {
                return Arrays.equals((boolean[])o1, (boolean[])o2);
            }
            if (o1 instanceof byte[] && o2 instanceof byte[]) {
                return Arrays.equals((byte[])o1, (byte[])o2);
            }
            if (o1 instanceof char[] && o2 instanceof char[]) {
                return Arrays.equals((char[])o1, (char[])o2);
            }
            if (o1 instanceof double[] && o2 instanceof double[]) {
                return Arrays.equals((double[])o1, (double[])o2);
            }
            if (o1 instanceof float[] && o2 instanceof float[]) {
                return Arrays.equals((float[])o1, (float[])o2);
            }
            if (o1 instanceof int[] && o2 instanceof int[]) {
                return Arrays.equals((int[])o1, (int[])o2);
            }
            if (o1 instanceof long[] && o2 instanceof long[]) {
                return Arrays.equals((long[])o1, (long[])o2);
            }
            if (o1 instanceof short[] && o2 instanceof short[]) {
                return Arrays.equals((short[])o1, (short[])o2);
            }
        }
        return false;
    }

    public static int nullSafeHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return Objects.nullSafeHashCode((Object[])obj);
            }
            if (obj instanceof boolean[]) {
                return Objects.nullSafeHashCode((boolean[])obj);
            }
            if (obj instanceof byte[]) {
                return Objects.nullSafeHashCode((byte[])obj);
            }
            if (obj instanceof char[]) {
                return Objects.nullSafeHashCode((char[])obj);
            }
            if (obj instanceof double[]) {
                return Objects.nullSafeHashCode((double[])obj);
            }
            if (obj instanceof float[]) {
                return Objects.nullSafeHashCode((float[])obj);
            }
            if (obj instanceof int[]) {
                return Objects.nullSafeHashCode((int[])obj);
            }
            if (obj instanceof long[]) {
                return Objects.nullSafeHashCode((long[])obj);
            }
            if (obj instanceof short[]) {
                return Objects.nullSafeHashCode((short[])obj);
            }
        }
        return obj.hashCode();
    }

    public static int nullSafeHashCode(Object[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + Objects.nullSafeHashCode(array[i2]);
        }
        return hash;
    }

    public static int nullSafeHashCode(boolean[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + Objects.hashCode(array[i2]);
        }
        return hash;
    }

    public static int nullSafeHashCode(byte[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + array[i2];
        }
        return hash;
    }

    public static int nullSafeHashCode(char[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + array[i2];
        }
        return hash;
    }

    public static int nullSafeHashCode(double[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + Objects.hashCode(array[i2]);
        }
        return hash;
    }

    public static int nullSafeHashCode(float[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + Objects.hashCode(array[i2]);
        }
        return hash;
    }

    public static int nullSafeHashCode(int[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + array[i2];
        }
        return hash;
    }

    public static int nullSafeHashCode(long[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + Objects.hashCode(array[i2]);
        }
        return hash;
    }

    public static int nullSafeHashCode(short[] array) {
        if (array == null) {
            return 0;
        }
        int hash = 7;
        int arraySize = array.length;
        for (int i2 = 0; i2 < arraySize; ++i2) {
            hash = 31 * hash + array[i2];
        }
        return hash;
    }

    public static int hashCode(boolean bool) {
        return bool ? 1231 : 1237;
    }

    public static int hashCode(double dbl) {
        long bits = Double.doubleToLongBits(dbl);
        return Objects.hashCode(bits);
    }

    public static int hashCode(float flt) {
        return Float.floatToIntBits(flt);
    }

    public static int hashCode(long lng) {
        return (int)(lng ^ lng >>> 32);
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return EMPTY_STRING;
        }
        return obj.getClass().getName() + "@" + Objects.getIdentityHexString(obj);
    }

    public static String getIdentityHexString(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String getDisplayString(Object obj) {
        if (obj == null) {
            return EMPTY_STRING;
        }
        return Objects.nullSafeToString(obj);
    }

    public static String nullSafeClassName(Object obj) {
        return obj != null ? obj.getClass().getName() : NULL_STRING;
    }

    public static String nullSafeToString(Object obj) {
        if (obj == null) {
            return NULL_STRING;
        }
        if (obj instanceof String) {
            return (String)obj;
        }
        if (obj instanceof Object[]) {
            return Objects.nullSafeToString((Object[])obj);
        }
        if (obj instanceof boolean[]) {
            return Objects.nullSafeToString((boolean[])obj);
        }
        if (obj instanceof byte[]) {
            return Objects.nullSafeToString((byte[])obj);
        }
        if (obj instanceof char[]) {
            return Objects.nullSafeToString((char[])obj);
        }
        if (obj instanceof double[]) {
            return Objects.nullSafeToString((double[])obj);
        }
        if (obj instanceof float[]) {
            return Objects.nullSafeToString((float[])obj);
        }
        if (obj instanceof int[]) {
            return Objects.nullSafeToString((int[])obj);
        }
        if (obj instanceof long[]) {
            return Objects.nullSafeToString((long[])obj);
        }
        if (obj instanceof short[]) {
            return Objects.nullSafeToString((short[])obj);
        }
        String str = obj.toString();
        return str != null ? str : EMPTY_STRING;
    }

    public static String nullSafeToString(Object[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(String.valueOf(array[i2]));
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(boolean[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(byte[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(char[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append("'").append(array[i2]).append("'");
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(double[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(float[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(int[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(long[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(short[] array) {
        if (array == null) {
            return NULL_STRING;
        }
        int length = array.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; ++i2) {
            if (i2 == 0) {
                sb.append(ARRAY_START);
            } else {
                sb.append(ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(array[i2]);
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static void nullSafeClose(Closeable ... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable == null) continue;
            try {
                closeable.close();
            } catch (IOException iOException) {
                // empty catch block
            }
        }
    }
}

