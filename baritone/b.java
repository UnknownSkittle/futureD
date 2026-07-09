/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.behavior.IBehavior;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.utils.IPlayerContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
implements IBehavior {
    public final a a;
    public final IPlayerContext a;

    protected b(a object) {
        this.a = object;
        this.a = ((a)object).getPlayerContext();
        a a2 = object;
        object = this;
        a2.a.registerEventListener((IGameEventListener)object);
    }
}

