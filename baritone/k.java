/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.event.events.type.EventState;

final class k {
    static final /* synthetic */ int[] a;

    static {
        a = new int[EventState.values().length];
        try {
            k.a[EventState.PRE.ordinal()] = 1;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k.a[EventState.POST.ordinal()] = 2;
        } catch (NoSuchFieldError noSuchFieldError) {}
    }
}

