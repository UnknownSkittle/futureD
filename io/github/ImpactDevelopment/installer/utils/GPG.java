/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import io.github.ImpactDevelopment.installer.github.GithubRelease;
import java.io.ByteArrayInputStream;
import java.security.Security;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import org.bouncycastle.c.a.a;
import org.bouncycastle.openpgp.a.b;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.al;
import org.bouncycastle.openpgp.ap;
import org.bouncycastle.openpgp.b.a.d;

public class GPG {
    private static final b KEYRING;
    public static final ab leijurv;
    public static final ab brady;
    public static final ab leafhacker;

    private static ab verify(byte[] byArray, byte[] object) {
        try {
            object = ((al)new org.bouncycastle.openpgp.a.a(ap.a(new ByteArrayInputStream((byte[])object))).a()).a();
            ab ab2 = KEYRING.a(((aj)object).c());
            if (ab2 == null) {
                System.out.println("WARNING: signature from unknown public key " + ((aj)object).c());
                return null;
            }
            ((aj)object).a(new d().a("BC"), ab2);
            ((aj)object).a(byArray, byArray.length);
            if (!((aj)object).a()) {
                return null;
            }
            return ab2;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static ab getMust(long l2) {
        try {
            ab ab2 = KEYRING.a(l2);
            if (ab2 == null) {
                throw new IllegalStateException("Unable to find ".concat(String.valueOf(l2)));
            }
            return ab2;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static boolean verifyRelease(GithubRelease set, String string, String string2, Predicate<Set<ab>> predicate) {
        try {
            string = ((GithubRelease)((Object)set)).byName(string).get().fetch();
            set = ((GithubRelease)((Object)set)).byName(string2).get().fetch();
            set = GPG.findValidSignatures(string, (String)((Object)set));
            return predicate.test(set);
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private static Set<ab> findValidSignatures(String string, String stringArray) {
        HashSet<ab> hashSet = new HashSet<ab>();
        for (String string2 : stringArray.split("-----END PGP SIGNATURE-----")) {
            if (string2.trim().isEmpty()) continue;
            String string3 = string2 + "-----END PGP SIGNATURE-----";
            ab ab2 = GPG.verify(string.getBytes(), string3.getBytes());
            if (ab2 == null) continue;
            hashSet.add(ab2);
        }
        return hashSet;
    }

    static {
        Security.addProvider(new a());
        try {
            KEYRING = new b(ap.a(GPG.class.getResourceAsStream("/keys.asc")));
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        leijurv = GPG.getMust(4946054532857441386L);
        brady = GPG.getMust(8333779407862330727L);
        leafhacker = GPG.getMust(7411429204550467438L);
    }
}

