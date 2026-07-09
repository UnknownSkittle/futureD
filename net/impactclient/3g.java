/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bii
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.UserType
 */
package net.impactclient;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserType;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 3g
extends bii {
    public static final boolean \u200e\u200c\u2005\u200e;

    3g(String string, GameProfile gameProfile) {
        boolean bl2 = \u200e\u200c\u2005\u200e;
        super(gameProfile.getName(), gameProfile.getId().toString(), string, String.valueOf(gameProfile.isLegacy() ? UserType.LEGACY : UserType.MOJANG));
    }
}

