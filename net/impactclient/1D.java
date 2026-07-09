/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1D {
    public static final boolean \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;

    /*
     * Enabled aggressive block sorting
     */
    public static Object 0(Object object, Class<?> object2, String string) {
        boolean bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
        if (bl2 || bl2) return null;
        if (!((Class)object2).isAssignableFrom(object.getClass())) {
            if (bl2 || bl2) return null;
            return null;
        }
        if (bl2) {
            return null;
        }
        Object object3 = object2;
        object2 = string;
        return 1D.0(object, (Field)Arrays.stream(((Class)object3).getDeclaredFields()).filter(arg_0 -> 1D.0((String)object2, arg_0)).findFirst().orElse(null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean 0(Object object, Method method, Object ... objectArray) {
        boolean bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
        if (bl2) return true;
        try {
            if (bl2) return true;
            boolean bl3 = method.isAccessible();
            if (bl2 || bl2) return true;
            method.setAccessible((boolean)((long)683350808 ^ (long)683350809));
            if (bl2 || bl2) return true;
            method.invoke(object, objectArray);
            if (bl2 || bl2) return true;
            method.setAccessible(bl3);
            if (bl2 || bl2) return true;
            return (int)((long)1111110080 ^ (long)1111110081) != 0;
        } catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            if (bl2 || bl2) return true;
            return (int)((long)-938213891 ^ (long)-938213891) != 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Method 0(Class<?> methodArray, String string, Class<?> ... classArray) {
        block7: {
            boolean bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
            if (!bl2 && !bl2) {
                methodArray = methodArray.getDeclaredMethods();
                int n2 = methodArray.length;
                if (!bl2) {
                    int n3 = (int)((long)-2055526811 ^ (long)-2055526811);
                    String[] stringArray = 7b.0();
                    if (!bl2) {
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2) break;
                                Method method = methodArray[n3];
                                if (method.getName().equals(string)) {
                                    if (bl2) break;
                                    if (Arrays.deepEquals(method.getParameterTypes(), classArray)) {
                                        if (bl2 || bl2) break;
                                        return method;
                                    }
                                }
                                if (bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (stringArray != null) continue;
                                if (bl2) break;
                            }
                            if (!bl2) break block7;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    static {
        boolean bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
        if (bl2 || bl2) {
        } else {
            MethodHandles.lookup();
            if (!bl2) {
                // empty if block
            }
        }
    }

    private static /* synthetic */ boolean 0(String string, Field field) {
        boolean bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
        if (bl2 || bl2) {
            return true;
        }
        return field.getName().equals(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object 0(Object object, Field field) {
        Object object2;
        boolean bl2;
        block3: {
            bl2 = \u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000;
            if (bl2 || bl2) return null;
            object2 = null;
            if (bl2) return null;
            try {
                if (bl2) return null;
                boolean bl3 = field.isAccessible();
                if (bl2 || bl2) return null;
                field.setAccessible((boolean)((long)-1178396211 ^ (long)-1178396212));
                if (bl2 || bl2) return null;
                object2 = field.get(object);
                if (bl2 || bl2) return null;
                field.setAccessible(bl3);
                if (bl2 || bl2) return null;
                if (!\u2003\u2006\u200b\u200e\u2001\u2001\u2008\u2003\u2000) break block3;
                throw null;
            } catch (IllegalAccessException | NullPointerException exception) {
                if (bl2) return null;
            }
        }
        if (!bl2) return object2;
        return null;
    }
}

