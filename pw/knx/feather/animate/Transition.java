/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.animate;

import java.util.function.Function;

public enum Transition {
    LINEAR(a2 -> a2),
    CURVE(a2 -> a2 * a2),
    STEEP_CURVE(a2 -> a2 * a2 * a2),
    BEZIER_CURVE(a2 -> {
        double curve = -1.0 + Math.sqrt(-a2.doubleValue() + 1.0);
        return curve * curve;
    }),
    INVERSE_CURVE(a2 -> -(a2 - 1.0) * (a2 - 1.0) + 1.0),
    INVERSE_STEEP_CURVE(a2 -> Math.pow(a2 - 1.0, 3.0) + 1.0),
    RUBBER(a2 -> -Math.sin(10.0 * a2) / (10.0 * a2) + 1.0),
    INERTIA(a2 -> Math.cbrt(a2 - 0.5) / 1.5874010519681994),
    INSTANT(a2 -> Math.round(a2));

    private final Function<Double, Double> translator;

    private Transition(Function<Double, Double> translator) {
        this.translator = translator;
    }

    public double apply(double input) {
        return this.translator.apply(input);
    }
}

