/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.b;
import org.bouncycastle.openpgp.b.k;
import org.bouncycastle.openpgp.b.p;
import org.bouncycastle.openpgp.m;

final class n
extends b {
    private /* synthetic */ org.bouncycastle.openpgp.b.a.m a;

    n(org.bouncycastle.openpgp.b.a.m m2, char[] cArray, p p2) {
        this.a = m2;
        super(cArray, p2);
    }

    public final byte[] a(int n2, byte[] byArray, byte[] byArray2) {
        try {
            if (byArray2 != null && byArray2.length > 0) {
                String string = ap.a(n2);
                Cipher cipher = org.bouncycastle.openpgp.b.a.m.a(this.a).d(string + "/CFB/NoPadding");
                cipher.init(2, (Key)new SecretKeySpec(byArray, string), new IvParameterSpec(new byte[cipher.getBlockSize()]));
                return cipher.doFinal(byArray2);
            }
            byte[] byArray3 = new byte[byArray.length + 1];
            byte[] byArray4 = byArray3;
            byArray3[0] = (byte)n2;
            System.arraycopy(byArray, 0, byArray4, 1, byArray.length);
            return byArray4;
        } catch (Exception exception) {
            throw new m("Exception recovering session info", exception);
        }
    }

    public final k a(boolean bl2, int n2, byte[] byArray) {
        return org.bouncycastle.openpgp.b.a.m.a(this.a).a(bl2, n2, byArray);
    }
}

