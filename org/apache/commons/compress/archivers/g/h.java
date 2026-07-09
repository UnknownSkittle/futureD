/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.aa;
import org.apache.commons.compress.archivers.g.ab;
import org.apache.commons.compress.archivers.g.ac;
import org.apache.commons.compress.archivers.g.ad;
import org.apache.commons.compress.archivers.g.ae;
import org.apache.commons.compress.archivers.g.af;
import org.apache.commons.compress.archivers.g.ag;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.b;
import org.apache.commons.compress.archivers.g.i;
import org.apache.commons.compress.archivers.g.k;
import org.apache.commons.compress.archivers.g.p;
import org.apache.commons.compress.archivers.g.r;
import org.apache.commons.compress.archivers.g.s;
import org.apache.commons.compress.archivers.g.t;
import org.apache.commons.compress.archivers.g.u;
import org.apache.commons.compress.archivers.g.y;
import org.apache.commons.compress.archivers.g.z;

public final class h {
    private static final Map<ax, Class<?>> a = new ConcurrentHashMap();

    private static void a(Class<?> clazz) {
        try {
            au au2 = (au)clazz.newInstance();
            a.put(au2.a(), clazz);
            return;
        } catch (ClassCastException classCastException) {
            throw new RuntimeException(clazz + " doesn't implement ZipExtraField");
        } catch (InstantiationException instantiationException) {
            throw new RuntimeException(clazz + " is not a concrete class");
        } catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(clazz + "'s no-arg constructor is not public");
        }
    }

    public static au[] a(byte[] byArray, i i2) {
        Object object;
        int n2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        block9: for (int i3 = 0; i3 <= byArray.length - 4; i3 += n2 + 4) {
            Object object2;
            object = new ax(byArray, i3);
            n2 = new ax(byArray, i3 + 2).b();
            if (i3 + 4 + n2 > byArray.length) {
                switch (i2.a()) {
                    case 0: {
                        throw new ZipException("bad extra field starting at " + i3 + ".  Block length of " + n2 + " bytes exceeds remaining data of " + (byArray.length - i3 - 4) + " bytes.");
                    }
                    case 2: {
                        object2 = new t();
                        ((t)object2).a(byArray, i3, byArray.length - i3);
                        arrayList.add(object2);
                    }
                    case 1: {
                        break block9;
                    }
                    default: {
                        throw new ZipException("unknown UnparseableExtraField key: " + i2.a());
                    }
                }
            }
            try {
                Object object3;
                object2 = object;
                Object object4 = a.get(object2);
                if (object4 != null) {
                    object3 = (au)((Class)object4).newInstance();
                } else {
                    object4 = new u();
                    ((u)object4).a((ax)object2);
                    object3 = object4;
                }
                object2 = object3;
                try {
                    object2.a(byArray, i3 + 4, n2);
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw (ZipException)new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(((ax)object).b())).initCause(arrayIndexOutOfBoundsException);
                }
                arrayList.add(object2);
                continue;
            } catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                throw (ZipException)new ZipException(reflectiveOperationException.getMessage()).initCause(reflectiveOperationException);
            }
        }
        object = new au[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public static byte[] a(au[] auArray) {
        byte[] byArray;
        Object object;
        int n2;
        boolean bl2 = auArray.length > 0 && auArray[auArray.length - 1] instanceof t;
        int n3 = bl2 ? auArray.length - 1 : auArray.length;
        int n4 = 4 * n3;
        Object[] objectArray = auArray;
        int n5 = auArray.length;
        for (n2 = 0; n2 < n5; ++n2) {
            object = objectArray[n2];
            n4 += object.f().b();
        }
        objectArray = new byte[n4];
        n5 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            System.arraycopy(auArray[n2].a().a(), 0, objectArray, n5, 2);
            System.arraycopy(auArray[n2].f().a(), 0, objectArray, n5 + 2, 2);
            n5 += 4;
            byte[] byArray2 = auArray[n2].e();
            object = byArray2;
            if (byArray2 == null) continue;
            System.arraycopy(object, 0, objectArray, n5, ((Object)object).length);
            n5 += ((Object)object).length;
        }
        if (bl2 && (byArray = auArray[auArray.length - 1].e()) != null) {
            System.arraycopy(byArray, 0, objectArray, n5, byArray.length);
        }
        return objectArray;
    }

    public static byte[] b(au[] auArray) {
        byte[] byArray;
        Object object;
        int n2;
        boolean bl2 = auArray.length > 0 && auArray[auArray.length - 1] instanceof t;
        int n3 = bl2 ? auArray.length - 1 : auArray.length;
        int n4 = 4 * n3;
        Object[] objectArray = auArray;
        int n5 = auArray.length;
        for (n2 = 0; n2 < n5; ++n2) {
            object = objectArray[n2];
            n4 += object.d().b();
        }
        objectArray = new byte[n4];
        n5 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            System.arraycopy(auArray[n2].a().a(), 0, objectArray, n5, 2);
            System.arraycopy(auArray[n2].d().a(), 0, objectArray, n5 + 2, 2);
            n5 += 4;
            byte[] byArray2 = auArray[n2].c();
            object = byArray2;
            if (byArray2 == null) continue;
            System.arraycopy(object, 0, objectArray, n5, ((Object)object).length);
            n5 += ((Object)object).length;
        }
        if (bl2 && (byArray = auArray[auArray.length - 1].c()) != null) {
            System.arraycopy(byArray, 0, objectArray, n5, byArray.length);
        }
        return objectArray;
    }

    static {
        h.a(b.class);
        h.a(ae.class);
        h.a(af.class);
        h.a(k.class);
        h.a(s.class);
        h.a(r.class);
        h.a(ag.class);
        h.a(y.class);
        h.a(z.class);
        h.a(aa.class);
        h.a(ab.class);
        h.a(ac.class);
        h.a(ad.class);
        h.a(p.class);
    }
}

