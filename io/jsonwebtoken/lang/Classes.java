/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

import io.jsonwebtoken.lang.InstantiationException;
import io.jsonwebtoken.lang.UnknownClassException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class Classes {
    private static final ClassLoaderAccessor THREAD_CL_ACCESSOR = new ExceptionIgnoringAccessor(){

        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return Thread.currentThread().getContextClassLoader();
        }
    };
    private static final ClassLoaderAccessor CLASS_CL_ACCESSOR = new ExceptionIgnoringAccessor(){

        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return Classes.class.getClassLoader();
        }
    };
    private static final ClassLoaderAccessor SYSTEM_CL_ACCESSOR = new ExceptionIgnoringAccessor(){

        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return ClassLoader.getSystemClassLoader();
        }
    };

    private Classes() {
    }

    public static <T> Class<T> forName(String fqcn) throws UnknownClassException {
        Class clazz = THREAD_CL_ACCESSOR.loadClass(fqcn);
        if (clazz == null) {
            clazz = CLASS_CL_ACCESSOR.loadClass(fqcn);
        }
        if (clazz == null) {
            clazz = SYSTEM_CL_ACCESSOR.loadClass(fqcn);
        }
        if (clazz == null) {
            String msg = "Unable to load class named [" + fqcn + "] from the thread context, current, or system/application ClassLoaders.  All heuristics have been exhausted.  Class could not be found.";
            if (fqcn != null && fqcn.startsWith("com.stormpath.sdk.impl")) {
                msg = msg + "  Have you remembered to include the stormpath-sdk-impl .jar in your runtime classpath?";
            }
            throw new UnknownClassException(msg);
        }
        return clazz;
    }

    public static InputStream getResourceAsStream(String name) {
        InputStream is = THREAD_CL_ACCESSOR.getResourceStream(name);
        if (is == null) {
            is = CLASS_CL_ACCESSOR.getResourceStream(name);
        }
        if (is == null) {
            is = SYSTEM_CL_ACCESSOR.getResourceStream(name);
        }
        return is;
    }

    public static boolean isAvailable(String fullyQualifiedClassName) {
        try {
            Classes.forName(fullyQualifiedClassName);
            return true;
        } catch (UnknownClassException e2) {
            return false;
        }
    }

    public static <T> T newInstance(String fqcn) {
        return Classes.newInstance(Classes.forName(fqcn));
    }

    public static <T> T newInstance(String fqcn, Class[] ctorArgTypes, Object ... args) {
        Class<T> clazz = Classes.forName(fqcn);
        Constructor<T> ctor = Classes.getConstructor(clazz, ctorArgTypes);
        return Classes.instantiate(ctor, args);
    }

    public static <T> T newInstance(String fqcn, Object ... args) {
        return Classes.newInstance(Classes.forName(fqcn), args);
    }

    public static <T> T newInstance(Class<T> clazz) {
        if (clazz == null) {
            String msg = "Class method parameter cannot be null.";
            throw new IllegalArgumentException(msg);
        }
        try {
            return clazz.newInstance();
        } catch (Exception e2) {
            throw new InstantiationException("Unable to instantiate class [" + clazz.getName() + "]", e2);
        }
    }

    public static <T> T newInstance(Class<T> clazz, Object ... args) {
        Class[] argTypes = new Class[args.length];
        for (int i2 = 0; i2 < args.length; ++i2) {
            argTypes[i2] = args[i2].getClass();
        }
        Constructor<T> ctor = Classes.getConstructor(clazz, argTypes);
        return Classes.instantiate(ctor, args);
    }

    public static <T> Constructor<T> getConstructor(Class<T> clazz, Class ... argTypes) {
        try {
            return clazz.getConstructor(argTypes);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static <T> T instantiate(Constructor<T> ctor, Object ... args) {
        try {
            return ctor.newInstance(args);
        } catch (Exception e2) {
            String msg = "Unable to instantiate instance with constructor [" + ctor + "]";
            throw new InstantiationException(msg, e2);
        }
    }

    public static <T> T invokeStatic(String fqcn, String methodName, Class[] argTypes, Object ... args) {
        try {
            Class<T> clazz = Classes.forName(fqcn);
            Method method = clazz.getDeclaredMethod(methodName, argTypes);
            method.setAccessible(true);
            return (T)method.invoke(null, args);
        } catch (Exception e2) {
            String msg = "Unable to invoke class method " + fqcn + "#" + methodName + ".  Ensure the necessary implementation is in the runtime classpath.";
            throw new IllegalStateException(msg, e2);
        }
    }

    private static abstract class ExceptionIgnoringAccessor
    implements ClassLoaderAccessor {
        private ExceptionIgnoringAccessor() {
        }

        @Override
        public Class loadClass(String fqcn) {
            Class<?> clazz = null;
            ClassLoader cl2 = this.getClassLoader();
            if (cl2 != null) {
                try {
                    clazz = cl2.loadClass(fqcn);
                } catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
            }
            return clazz;
        }

        @Override
        public InputStream getResourceStream(String name) {
            InputStream is = null;
            ClassLoader cl2 = this.getClassLoader();
            if (cl2 != null) {
                is = cl2.getResourceAsStream(name);
            }
            return is;
        }

        protected final ClassLoader getClassLoader() {
            try {
                return this.doGetClassLoader();
            } catch (Throwable throwable) {
                return null;
            }
        }

        protected abstract ClassLoader doGetClassLoader() throws Throwable;
    }

    private static interface ClassLoaderAccessor {
        public Class loadClass(String var1);

        public InputStream getResourceStream(String var1);
    }
}

