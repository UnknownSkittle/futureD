/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.animate;

import pw.knx.feather.animate.Transition;

public class TickAnimation {
    private Transition transition = Transition.LINEAR;
    int duration = 20;
    private boolean isForward = true;
    private boolean inProgress = false;
    double progress = 0.0;

    public TickAnimation play() {
        this.inProgress = true;
        return this;
    }

    public TickAnimation pause() {
        this.inProgress = false;
        return this;
    }

    public TickAnimation cancel() {
        return this.restart().pause();
    }

    public TickAnimation restart() {
        this.progress = this.isForward ? 0.0 : 1.0;
        return this;
    }

    public TickAnimation reverse() {
        this.isForward = false;
        return this;
    }

    public TickAnimation forward() {
        this.isForward = true;
        return this;
    }

    public TickAnimation setTransition(Transition transition) {
        this.transition = transition;
        return this;
    }

    public TickAnimation setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public TickAnimation setProgress(double progress) {
        this.progress = progress;
        return this;
    }

    public boolean isRunning() {
        return this.inProgress;
    }

    public double get() {
        this.increment(1);
        return this.translate(this.progress);
    }

    public double get(double low, double high) {
        return (high - low) * this.get() + low;
    }

    protected void increment(int ticks) {
        if (!this.inProgress) {
            return;
        }
        if (!this.isForward) {
            ticks *= -1;
        }
        this.progress += (double)ticks / (double)this.duration;
        if (this.progress > 1.0) {
            this.progress = 1.0;
            this.inProgress = false;
        } else if (this.progress < 0.0) {
            this.progress = 0.0;
            this.inProgress = false;
        }
    }

    protected double translate(double progress) {
        this.transition.apply(progress);
        return Math.min(Math.max(progress, 0.0), 1.0);
    }
}

