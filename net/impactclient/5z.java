/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  com.mojang.authlib.GameProfile
 */
package net.impactclient;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5z
extends GameProfile {
    public static final boolean \u2004\u2006;

    public 5z(UUID uUID, String string) {
        boolean bl2 = \u2004\u2006;
        super(uUID == null ? aed.d((String)string) : uUID, string);
    }
}

