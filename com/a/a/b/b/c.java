/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.b;

import com.a.a.b.b.b;
import com.a.a.w;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c
extends b {
    private static Class a;
    private final Object b = com.a.a.b.b.c.b();
    private final Field c = com.a.a.b.b.c.c();

    c() {
    }

    @Override
    public final void a(AccessibleObject accessibleObject) {
        if (!this.b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
                return;
            } catch (SecurityException securityException) {
                throw new w("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", securityException);
            }
        }
    }

    private boolean b(AccessibleObject accessibleObject) {
        if (this.b != null && this.c != null) {
            try {
                long l2 = (Long)a.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.c);
                a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, l2, Boolean.TRUE);
                return true;
            } catch (Exception exception) {}
        }
        return false;
    }

    private static Object b() {
        try {
            a = Class.forName("sun.misc.Unsafe");
            Field field = a.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return field.get(null);
        } catch (Exception exception) {
            return null;
        }
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException noSuchFieldException) {
            return null;
        }
    }
}

