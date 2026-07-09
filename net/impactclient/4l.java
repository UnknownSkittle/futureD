/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  ho
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.Cancellable;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0rB$1f;
import net.impactclient.1I;
import net.impactclient.2f;
import net.impactclient.4K;
import net.impactclient.4O;
import net.impactclient.4T;
import net.impactclient.4p;
import net.impactclient.5_;
import net.impactclient.68;
import net.impactclient.6f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 4l
extends 4O
implements Listenable,
0T {
    @EventHandler
    private final Listener<4p> 0;
    public static final boolean \u200f\u200f\u2006\u2002\u2006;

    public 4l(4K k2) {
        boolean bl2 = \u200f\u200f\u2006\u2002\u2006;
        super(k2);
        this.0 = new Listener<4p>(optional -> {
            boolean bl2 = \u200f\u200f\u2006\u2002\u2006;
            if (bl2 || bl2) return;
            Object object = ((4T)((Object)optional)).0();
            if (((String)object).startsWith(0rB$1f.XNZw("\u49e5", 1522036573))) {
                if (bl2) return;
                if (((String)object).length() > (int)((long)77448846 ^ (long)77448847)) {
                    if (bl2 || bl2) return;
                    ((4T)((Object)optional)).0 = new ho(((String)object).substring((int)((long)1328474410 ^ (long)1328474411)));
                    if (bl2 || bl2) return;
                    return;
                }
            }
            if (bl2) return;
            if (((String)object).startsWith(this.1.6)) {
                if (bl2 || bl2) return;
                ((Cancellable)((Object)optional)).cancel();
                if (bl2 || bl2) return;
                object = ((String)object).substring(this.1.6.length());
                if (bl2 || bl2) return;
                if (bl2) return;
                optional = 2f.0((String)object);
                if (optional.isPresent()) {
                    if (bl2 || bl2) return;
                    object = this.1.5.stream().filter(f2 -> {
                        boolean bl2 = \u200f\u200f\u2006\u2002\u2006;
                        if (bl2 || bl2) {
                            return true;
                        }
                        return 68.0(f2.4, ((68)optional.get()).1);
                    }).findFirst().orElse(null);
                    if (object != null) {
                        if (bl2 || bl2) return;
                        Object object2 = object;
                        object = 4l.2.h;
                        this.1.0((6f)object2, 5_.0(new 1I((aed)object), this.1), optional.get().0);
                        if (bl2 || bl2) return;
                        return;
                    }
                }
                if (bl2) return;
                this.1.0(null, null, null);
                if (bl2) return;
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)1009900855 ^ (long)1009900855)]);
    }
}

