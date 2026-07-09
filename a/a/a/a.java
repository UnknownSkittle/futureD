/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package a.a.a;

import a.a.a.f;
import com.a.a.ag;
import com.a.a.b.a.s;
import com.a.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class a {
    public static ag a(k object, Class clazz, Object object2) {
        object2 = a.a(clazz, object2);
        ag<?> ag2 = ((k)object).a(com.a.a.c.a.get((Type)object2));
        if (clazz != object2 && !a.a(ag2) && a.a(object = ((k)object).a(clazz))) {
            return object;
        }
        return ag2;
    }

    public static ag a(k object, com.a.a.c.a a2, Object object2) {
        Type type = a2.getType();
        object2 = a.a(type, object2);
        ag<?> ag2 = ((k)object).a(com.a.a.c.a.get((Type)object2));
        if (type != object2 && !a.a(ag2) && a.a(object = ((k)object).a(a2))) {
            return object;
        }
        return ag2;
    }

    private static Type a(Type clazz, Object object) {
        if (object != null && (clazz == Object.class || clazz instanceof TypeVariable || clazz instanceof Class)) {
            clazz = object.getClass();
        }
        return clazz;
    }

    private static boolean a(ag ag2) {
        return !(ag2 instanceof f) && !(ag2 instanceof s);
    }
}

