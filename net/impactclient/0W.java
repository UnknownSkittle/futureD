/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  bsc
 *  bue
 *  com.mojang.authlib.GameProfile
 */
package net.impactclient;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.impactclient.06;
import net.impactclient.0n;
import net.impactclient.28;
import net.impactclient.5z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0W
extends bue {
    public static final boolean \u2005\u200b\u2004\u2002;
    private final bsc 0;

    public final boolean z() {
        boolean bl2 = \u2005\u200b\u2004\u2002;
        if (bl2 || bl2) {
            return true;
        }
        return (int)((long)1563841321 ^ (long)1563841321) != 0;
    }

    private 0W(GameProfile gameProfile) {
        boolean bl2 = \u2005\u200b\u2004\u2002;
        super((amu)06.0, gameProfile);
        this.0 = new 28(gameProfile);
        this.V().b(br, (Object)((byte)((long)-1250361064 ^ (long)-1250360985)));
    }

    public final boolean y() {
        boolean bl2 = \u2005\u200b\u2004\u2002;
        if (bl2 || bl2) {
            return true;
        }
        return (int)((long)-1127381420 ^ (long)-1127381420) != 0;
    }

    public 0W(UUID uUID, String string) {
        boolean bl2 = \u2005\u200b\u2004\u2002;
        this(new 5z(uUID, string));
    }

    protected final bsc b() {
        boolean bl2 = \u2005\u200b\u2004\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void B_() {
        block3: {
            block2: {
                boolean bl2 = \u2005\u200b\u2004\u2002;
                if (bl2 || bl2) break block2;
                this.T += (int)((long)871920452 ^ (long)871920453);
                if (bl2 || bl2) break block2;
                this.aF = this.aG;
                if (bl2 || bl2) break block2;
                float f2 = Math.min(1.0f, (float)0n.a.c * 2.0f);
                if (bl2 || bl2) break block2;
                this.aG += (f2 - this.aG) * 0.4f;
                if (bl2 || bl2) break block2;
                this.aH += this.aG;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

