/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.animate;

import pw.knx.feather.animate.TickAnimation;

public class TimeAnimation
extends TickAnimation {
    private long prevTime;

    public TimeAnimation() {
        this.duration = 400;
    }

    @Override
    public TickAnimation play() {
        this.prevTime = System.currentTimeMillis();
        return super.play();
    }

    @Override
    public double get() {
        long time = System.currentTimeMillis();
        this.increment((int)(time - this.prevTime));
        this.prevTime = time;
        return this.translate(this.progress);
    }
}

