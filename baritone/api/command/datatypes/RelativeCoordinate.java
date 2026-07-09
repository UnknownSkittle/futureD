/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public enum RelativeCoordinate implements IDatatypePost<Double, Double>
{
    INSTANCE;

    private static Pattern PATTERN;

    @Override
    public final Double apply(IDatatypeContext object, Double d2) {
        double d3;
        if (d2 == null) {
            d2 = 0.0;
        }
        if (!((Matcher)(object = PATTERN.matcher(object.getConsumer().getString()))).matches()) {
            throw new IllegalArgumentException("pattern doesn't match");
        }
        boolean bl2 = !((Matcher)object).group(1).isEmpty();
        double d4 = d3 = ((Matcher)object).group(2).isEmpty() ? 0.0 : Double.parseDouble(((Matcher)object).group(2).replaceAll("k", ""));
        if (((Matcher)object).group(2).contains("k")) {
            d3 *= 1000.0;
        }
        if (bl2) {
            return d2 + d3;
        }
        return d3;
    }

    @Override
    public final Stream<String> tabComplete(IDatatypeContext object) {
        if (!(object = object.getConsumer()).has(2) && object.getString().matches("^(~|$)")) {
            return Stream.of("~");
        }
        return Stream.empty();
    }

    static {
        PATTERN = Pattern.compile("^(~?)([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)([k-k]?)|)$");
    }
}

