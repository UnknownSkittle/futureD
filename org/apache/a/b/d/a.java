/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.d;

import com.a.a.ac;
import com.a.a.b.ai;
import com.a.a.d.c;
import com.a.a.d.e;
import com.a.a.v;
import com.a.a.w;
import com.a.a.x;
import com.a.a.z;
import java.io.IOException;
import java.io.Reader;

@Deprecated
public final class a {
    public static v a(Reader closeable) {
        try {
            closeable = new com.a.a.d.a((Reader)closeable);
            v v2 = a.a((com.a.a.d.a)closeable);
            if (!(v2 instanceof x) && ((com.a.a.d.a)closeable).f() != c.j) {
                throw new ac("Did not consume the entire document.");
            }
            return v2;
        } catch (e e2) {
            throw new ac(e2);
        } catch (IOException iOException) {
            throw new w(iOException);
        } catch (NumberFormatException numberFormatException) {
            throw new ac(numberFormatException);
        }
    }

    private static v a(com.a.a.d.a a2) {
        boolean bl2 = a2.q();
        a2.a(true);
        try {
            v v2 = ai.a(a2);
            return v2;
        } catch (StackOverflowError stackOverflowError) {
            throw new z("Failed parsing JSON source: " + a2 + " to Json", stackOverflowError);
        } catch (OutOfMemoryError outOfMemoryError) {
            throw new z("Failed parsing JSON source: " + a2 + " to Json", outOfMemoryError);
        } finally {
            a2.a(bl2);
        }
    }
}

