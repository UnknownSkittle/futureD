/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.al;
import com.a.a.b.am;
import com.a.a.b.an;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class aj {
    public abstract <T> T a(Class<T> var1);

    public static aj a() {
        try {
            GenericDeclaration genericDeclaration = Class.forName("sun.misc.Unsafe");
            Field field = genericDeclaration.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object object = field.get(null);
            genericDeclaration = genericDeclaration.getMethod("allocateInstance", Class.class);
            return new ak((Method)genericDeclaration, object);
        } catch (Exception exception) {
            try {
                Method method = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                method.setAccessible(true);
                int n2 = (Integer)method.invoke(null, Object.class);
                Method method2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                method2.setAccessible(true);
                return new al(method2, n2);
            } catch (Exception exception2) {
                try {
                    Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    method.setAccessible(true);
                    return new am(method);
                } catch (Exception exception3) {
                    return new an();
                }
            }
        }
    }

    static void b(Class<?> clazz) {
        int n2 = clazz.getModifiers();
        if (Modifier.isInterface(n2)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + clazz.getName());
        }
        if (Modifier.isAbstract(n2)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + clazz.getName());
        }
    }
}

