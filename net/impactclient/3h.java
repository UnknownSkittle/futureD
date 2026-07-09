/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.reflect.Type;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.impactclient.0O;
import net.impactclient.1i;
import net.impactclient.5L;
import net.impactclient.5m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3h
implements 1i<String> {
    public static final boolean \u200d\u2003\u200e\u200e\u2003\u2005\u2009\u200b\u200d;

    /*
     * Enabled aggressive block sorting
     */
    public 3h() {
        boolean bl2 = \u200d\u2003\u200e\u200e\u2003\u2005\u2009\u200b\u200d;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ 5m 0(String object, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, 5L l2) {
        block3: {
            block2: {
                boolean bl2 = \u200d\u2003\u200e\u200e\u2003\u2005\u2009\u200b\u200d;
                if (bl2 || bl2) break block2;
                object = Cipher.getInstance((String)object);
                ((Cipher)object).init(l2.0, (Key)secretKeySpec, ivParameterSpec);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return ((Cipher)object)::doFinal;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static 0O 0(String string, String object, byte[] object2, byte[] byArray) {
        IvParameterSpec ivParameterSpec;
        block3: {
            block2: {
                void var3_4;
                boolean bl2 = \u200d\u2003\u200e\u200e\u2003\u2005\u2009\u200b\u200d;
                if (bl2 || bl2) break block2;
                object = new SecretKeySpec((byte[])object2, (String)object);
                if (bl2 || bl2) break block2;
                ivParameterSpec = new IvParameterSpec((byte[])var3_4);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return arg_0 -> 3h.0(string, (SecretKeySpec)object, ivParameterSpec, arg_0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(Type type) {
        boolean bl2 = \u200d\u2003\u200e\u200e\u2003\u2005\u2009\u200b\u200d;
        if (bl2 || bl2) return true;
        if (type instanceof Class) {
            if (bl2) return true;
            if (String.class.isAssignableFrom((Class)type)) {
                if (bl2) return true;
                return (int)((long)108282348 ^ (long)108282349) != 0;
            }
        }
        if (!bl2) return (int)((long)-888860575 ^ (long)-888860575) != 0;
        return true;
    }
}

