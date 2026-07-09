/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.Set;
import me.zero.alpine.event.EventState;
import net.impactclient.0aA;
import net.impactclient.0rY;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 3Q
extends EnumMap<EventState, Set<0aA<T>>> {
    public static final boolean \u200f\u200c\u200a\u200c\u2001\u2000\u2009;
    private /* synthetic */ 0rY 0;

    3Q(0rY eventStateArray, Class clazz) {
        boolean bl2 = \u200f\u200c\u200a\u200c\u2001\u2000\u2009;
        this.0 = eventStateArray;
        String[] stringArray = 7b.0();
        super(clazz);
        eventStateArray = EventState.values();
        int n2 = eventStateArray.length;
        String[] stringArray2 = stringArray;
        for (int i2 = (int)((long)-1727738346 ^ (long)-1727738346); i2 < n2; ++i2) {
            EventState eventState = eventStateArray[i2];
            this.put(eventState, new LinkedHashSet());
            if (stringArray2 != null) continue;
        }
    }
}

