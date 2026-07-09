/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amn
 *  amu
 *  amy
 *  aow
 *  aox
 *  awt
 *  axw
 *  bib
 *  et
 *  et$a
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package baritone;

import baritone.a;
import baritone.api.utils.IPlayerContext;
import baritone.fo;
import baritone.gd;
import baritone.m;
import baritone.u;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fn {
    private final Long2ObjectMap<axw> a;
    private final u a;
    protected final amy a;
    public final et.a a;
    public final amy b;
    private axw a;
    private m a;
    private final boolean a;
    private static final awt a = aox.a.t();

    public fn(IPlayerContext iPlayerContext) {
        this(iPlayerContext, false);
    }

    public fn(IPlayerContext iPlayerContext, boolean bl2) {
        this(iPlayerContext.world(), (u)iPlayerContext.worldData(), bl2);
    }

    public fn(amu long2ObjectMap, u u2, boolean bl2) {
        this.a = null;
        this.a = null;
        this.a = long2ObjectMap;
        this.a = u2;
        long2ObjectMap = ((gd)long2ObjectMap.B()).loadedChunks();
        this.a = bl2 ? new Long2ObjectOpenHashMap(long2ObjectMap) : long2ObjectMap;
        boolean bl3 = this.a = (Boolean)baritone.a.a().pathThroughCachedOnly.value == false;
        if (!bib.z().aF()) {
            throw new IllegalStateException();
        }
        this.a = new et.a();
        this.b = new fo(this);
    }

    public final boolean a(int n2, int n3) {
        return this.a.containsKey(amn.a((int)(n2 >> 4), (int)(n3 >> 4)));
    }

    public static aow a(IPlayerContext iPlayerContext, et et2) {
        return fn.a(iPlayerContext, et2).u();
    }

    public static awt a(IPlayerContext iPlayerContext, et et2) {
        return new fn(iPlayerContext).a(et2.p(), et2.q(), et2.r());
    }

    public final awt a(et et2) {
        return this.a(et2.p(), et2.q(), et2.r());
    }

    public final awt a(int n2, int n3, int n4) {
        Object object;
        if (n3 < 0 || n3 >= 256) {
            return a;
        }
        if (this.a) {
            object = this.a;
            if (object != null && ((axw)object).b == n2 >> 4 && ((axw)object).c == n4 >> 4) {
                return object.a(n2, n3, n4);
            }
            object = (axw)this.a.get(amn.a((int)(n2 >> 4), (int)(n4 >> 4)));
            if (object != null && object.p()) {
                this.a = object;
                return object.a(n2, n3, n4);
            }
        }
        if ((object = this.a) == null || ((m)object).getX() != n2 >> 9 || ((m)object).getZ() != n4 >> 9) {
            if (this.a == null) {
                return a;
            }
            object = this.a.a.a(n2 >> 9, n4 >> 9);
            if (object == null) {
                return a;
            }
            this.a = object;
        }
        if ((object = ((m)object).getBlock(n2 & 0x1FF, n3, n4 & 0x1FF)) == null) {
            return a;
        }
        return object;
    }

    public final boolean b(int n2, int n3) {
        Object object = this.a;
        if (object != null && ((axw)object).b == n2 >> 4 && ((axw)object).c == n3 >> 4) {
            return true;
        }
        object = (axw)this.a.get(amn.a((int)(n2 >> 4), (int)(n3 >> 4)));
        if (object != null && object.p()) {
            this.a = object;
            return true;
        }
        object = this.a;
        if (object != null && ((m)object).getX() == n2 >> 9 && ((m)object).getZ() == n3 >> 9) {
            return ((m)object).isCached(n2 & 0x1FF, n3 & 0x1FF);
        }
        if (this.a == null) {
            return false;
        }
        object = this.a.a.a(n2 >> 9, n3 >> 9);
        if (object == null) {
            return false;
        }
        this.a = object;
        return ((m)object).isCached(n2 & 0x1FF, n3 & 0x1FF);
    }
}

