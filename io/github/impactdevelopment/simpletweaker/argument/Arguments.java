/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.impactdevelopment.simpletweaker.argument;

import io.github.impactdevelopment.simpletweaker.argument.Argument;
import io.github.impactdevelopment.simpletweaker.argument.ClassifiedArgument;
import io.github.impactdevelopment.simpletweaker.argument.SingularArgument;
import java.util.ArrayList;
import java.util.List;

public final class Arguments {
    public static List<Argument> parse(List<String> args) {
        ArrayList<Argument> argsOut = new ArrayList<Argument>();
        String classifier = null;
        for (String arg : args) {
            if (arg.startsWith("-")) {
                if (classifier != null) {
                    argsOut.add(new ClassifiedArgument(classifier, ""));
                    classifier = null;
                    continue;
                }
                if (arg.contains("=")) {
                    argsOut.add(new ClassifiedArgument(arg.substring(0, arg.indexOf(61)), arg.substring(arg.indexOf(61) + 1)));
                    continue;
                }
                classifier = arg;
                continue;
            }
            if (classifier != null) {
                argsOut.add(new ClassifiedArgument(classifier, arg));
                classifier = null;
                continue;
            }
            argsOut.add(new SingularArgument(arg));
        }
        return argsOut;
    }

    public static List<String> join(List<Argument> args) {
        ArrayList<String> argsOut = new ArrayList<String>();
        args.forEach(argument -> argument.addToList(argsOut));
        return argsOut;
    }
}

