/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.util;

import java.io.FileInputStream;
import java.io.InputStream;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;

public class Dump {
    /*
     * Unable to fully structure code
     */
    public static void main(String[] var0) {
        var0 = new FileInputStream(var0[0]);
        var0 = new j((InputStream)var0);
        while ((var1_1 = var0.b()) != null) {
            block3: {
                var2_2 = new StringBuffer();
                if (!(var1_1 instanceof u)) break block3;
                a.a("", false, var1_1, var2_2);
                ** GOTO lbl13
            }
            if (!(var1_1 instanceof f)) {
                v0 = "unknown object type " + var1_1.toString();
            } else {
                a.a("", false, ((f)var1_1).h(), var2_2);
lbl13:
                // 2 sources

                v0 = var2_2.toString();
            }
            System.out.println(v0);
        }
    }
}

