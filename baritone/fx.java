/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.process.PathingCommandType;

public final class fx {
    public static final /* synthetic */ int[] a;

    static {
        a = new int[PathingCommandType.values().length];
        try {
            fx.a[PathingCommandType.REQUEST_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fx.a[PathingCommandType.CANCEL_AND_SET_GOAL.ordinal()] = 2;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fx.a[PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH.ordinal()] = 3;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fx.a[PathingCommandType.REVALIDATE_GOAL_AND_PATH.ordinal()] = 4;
        } catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fx.a[PathingCommandType.SET_GOAL_AND_PATH.ordinal()] = 5;
        } catch (NoSuchFieldError noSuchFieldError) {}
    }
}

