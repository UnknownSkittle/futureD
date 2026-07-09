/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 *  rk
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.impactclient.0af;
import net.impactclient.0v;
import net.impactclient.22;
import net.impactclient.4c;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 3X
implements 0af {
    protected int 0;
    final List<4c> 3;
    public static final boolean \u200d\u2001;
    protected boolean 1;
    protected int 2;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final float 1(bip bip2) {
        float f2;
        float f3;
        block3: {
            boolean bl2 = \u200d\u2001;
            if (bl2) return 0.0f;
            f3 = 0.0f;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return 0.0f;
            Iterator<4c> iterator = this.3.iterator();
            if (bl2) return 0.0f;
            while (!bl2) {
                if (iterator.hasNext()) {
                    if (bl2) return 0.0f;
                    4c c2 = iterator.next();
                    if (bl2 || bl2) return 0.0f;
                    f2 = Math.max(f3, c2.1(bip2));
                    if (stringArray == null) return f2;
                    f3 = f2;
                    if (bl2 || bl2) return 0.0f;
                    if (stringArray != null) continue;
                    if (bl2) return 0.0f;
                }
                if (!bl2) break block3;
            }
            return 0.0f;
        }
        f2 = f3;
        return f2;
    }

    @Override
    public final List<4c> 2() {
        boolean bl2 = \u200d\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return this.3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(0v v2) {
        boolean bl2 = \u200d\u2001;
        if (bl2 || bl2) return true;
        if (!this.3().map(c2 -> {
            boolean bl2 = \u200d\u2001;
            if (bl2 || bl2) {
                return null;
            }
            return c2.0(v2);
        }).orElse(Boolean.FALSE).booleanValue()) {
            if (bl2 || bl2) return true;
            this.1 = (int)((long)-266825987 ^ (long)-266825987);
            if (bl2 || bl2) return true;
            switch (22.0[v2.ordinal()]) {
                case 1: {
                    if (bl2) return true;
                    this.0 = this.2;
                    if (bl2 || bl2) return true;
                    if ((this.2 -= (int)((long)-696397169 ^ (long)-696397170)) < 0) {
                        if (bl2 || bl2) return true;
                        this.2 = this.3.size() - (int)((long)1072686396 ^ (long)1072686397);
                        if (bl2 || bl2) return true;
                        this.1 = (int)((long)-1424838435 ^ (long)-1424838436);
                        if (bl2) return true;
                    }
                    if (bl2) return true;
                    return (int)((long)1777137407 ^ (long)1777137406) != 0;
                }
                case 2: {
                    if (bl2) return true;
                    this.0 = this.2;
                    if (bl2 || bl2) return true;
                    if ((this.2 += (int)((long)-857913385 ^ (long)-857913386)) >= this.3.size()) {
                        if (bl2 || bl2) return true;
                        this.2 = (int)((long)956328264 ^ (long)956328264);
                        if (bl2 || bl2) return true;
                        this.1 = (int)((long)-1924744504 ^ (long)-1924744503);
                        if (bl2) return true;
                    }
                    if (bl2) return true;
                    return (int)((long)-1883229477 ^ (long)-1883229478) != 0;
                }
                default: {
                    if (bl2) return true;
                    return (int)((long)388959905 ^ (long)388959905) != 0;
                }
            }
        }
        if (!bl2) return (int)((long)-1053749272 ^ (long)-1053749271) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int 1() {
        boolean bl2 = \u200d\u2001;
        if (bl2 || bl2) return 235064909;
        if (this.3.isEmpty()) {
            if (bl2) return 235064909;
            return (int)((long)830422319 ^ (long)-830422320);
        }
        if (bl2) {
            return 235064909;
        }
        this.2 = rk.a((int)this.2, (int)((int)((long)2032027411 ^ (long)2032027411)), (int)(this.3.size() - (int)((long)1217144063 ^ (long)1217144062)));
        return this.2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final float 0(bip bip2) {
        float f2;
        float f3;
        block3: {
            boolean bl2 = \u200d\u2001;
            if (bl2) return 0.0f;
            f3 = 0.0f;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return 0.0f;
            Iterator<4c> iterator = this.3.iterator();
            if (bl2) return 0.0f;
            while (!bl2) {
                if (iterator.hasNext()) {
                    if (bl2) return 0.0f;
                    4c c2 = iterator.next();
                    if (bl2 || bl2) return 0.0f;
                    f2 = f3 + c2.0(bip2);
                    if (stringArray == null) return f2;
                    f3 = f2;
                    if (bl2 || bl2) return 0.0f;
                    if (stringArray != null) continue;
                    if (bl2) return 0.0f;
                }
                if (!bl2) break block3;
            }
            return 0.0f;
        }
        f2 = f3;
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 3X() {
        block3: {
            block2: {
                boolean bl2 = \u200d\u2001;
                if (bl2 || bl2) break block2;
                this.3 = new ArrayList<4c>();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

