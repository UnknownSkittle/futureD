/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.animate;

import pw.knx.feather.animate.TickAnimation;
import pw.knx.feather.animate.TimeAnimation;

public class Animator {
    public TickAnimation byTicks(int ticks) {
        return new TickAnimation().setDuration(ticks);
    }

    public TickAnimation byTime(int milliseconds) {
        return new TimeAnimation().setDuration(milliseconds);
    }
}

