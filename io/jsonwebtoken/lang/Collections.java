/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

import io.jsonwebtoken.lang.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public final class Collections {
    private Collections() {
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static int size(Collection collection) {
        return collection == null ? 0 : collection.size();
    }

    public static int size(Map map) {
        return map == null ? 0 : map.size();
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static List arrayToList(Object source) {
        return Arrays.asList(Objects.toObjectArray(source));
    }

    public static void mergeArrayIntoCollection(Object array, Collection collection) {
        Object[] arr2;
        if (collection == null) {
            throw new IllegalArgumentException("Collection must not be null");
        }
        for (Object elem : arr2 = Objects.toObjectArray(array)) {
            collection.add(elem);
        }
    }

    public static void mergePropertiesIntoMap(Properties props, Map map) {
        if (map == null) {
            throw new IllegalArgumentException("Map must not be null");
        }
        if (props != null) {
            Enumeration<?> en2 = props.propertyNames();
            while (en2.hasMoreElements()) {
                String key = (String)en2.nextElement();
                Object value = props.getProperty(key);
                if (value == null) {
                    value = props.get(key);
                }
                map.put(key, value);
            }
        }
    }

    public static boolean contains(Iterator iterator, Object element) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                Object candidate = iterator.next();
                if (!Objects.nullSafeEquals(candidate, element)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean contains(Enumeration enumeration, Object element) {
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                Object candidate = enumeration.nextElement();
                if (!Objects.nullSafeEquals(candidate, element)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean containsInstance(Collection collection, Object element) {
        if (collection != null) {
            for (Object candidate : collection) {
                if (candidate != element) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean containsAny(Collection source, Collection candidates) {
        if (Collections.isEmpty(source) || Collections.isEmpty(candidates)) {
            return false;
        }
        for (Object candidate : candidates) {
            if (!source.contains(candidate)) continue;
            return true;
        }
        return false;
    }

    public static Object findFirstMatch(Collection source, Collection candidates) {
        if (Collections.isEmpty(source) || Collections.isEmpty(candidates)) {
            return null;
        }
        for (Object candidate : candidates) {
            if (!source.contains(candidate)) continue;
            return candidate;
        }
        return null;
    }

    public static <T> T findValueOfType(Collection<?> collection, Class<T> type) {
        if (Collections.isEmpty(collection)) {
            return null;
        }
        T value = null;
        for (Object element : collection) {
            if (type != null && !type.isInstance(element)) continue;
            if (value != null) {
                return null;
            }
            value = (T)element;
        }
        return value;
    }

    public static Object findValueOfType(Collection<?> collection, Class<?>[] types) {
        if (Collections.isEmpty(collection) || Objects.isEmpty(types)) {
            return null;
        }
        for (Class<?> type : types) {
            Object value = Collections.findValueOfType(collection, type);
            if (value == null) continue;
            return value;
        }
        return null;
    }

    public static boolean hasUniqueObject(Collection collection) {
        if (Collections.isEmpty(collection)) {
            return false;
        }
        boolean hasCandidate = false;
        Object candidate = null;
        for (Object elem : collection) {
            if (!hasCandidate) {
                hasCandidate = true;
                candidate = elem;
                continue;
            }
            if (candidate == elem) continue;
            return false;
        }
        return true;
    }

    public static Class<?> findCommonElementType(Collection collection) {
        if (Collections.isEmpty(collection)) {
            return null;
        }
        Class<?> candidate = null;
        for (Object val : collection) {
            if (val == null) continue;
            if (candidate == null) {
                candidate = val.getClass();
                continue;
            }
            if (candidate == val.getClass()) continue;
            return null;
        }
        return candidate;
    }

    public static <A, E extends A> A[] toArray(Enumeration<E> enumeration, A[] array) {
        ArrayList<E> elements = new ArrayList<E>();
        while (enumeration.hasMoreElements()) {
            elements.add(enumeration.nextElement());
        }
        return elements.toArray(array);
    }

    public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
        return new EnumerationIterator<E>(enumeration);
    }

    private static class EnumerationIterator<E>
    implements Iterator<E> {
        private Enumeration<E> enumeration;

        public EnumerationIterator(Enumeration<E> enumeration) {
            this.enumeration = enumeration;
        }

        @Override
        public boolean hasNext() {
            return this.enumeration.hasMoreElements();
        }

        @Override
        public E next() {
            return this.enumeration.nextElement();
        }

        @Override
        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}

