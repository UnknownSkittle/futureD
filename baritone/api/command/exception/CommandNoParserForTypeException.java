/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.exception;

import baritone.api.command.exception.CommandUnhandledException;

public class CommandNoParserForTypeException
extends CommandUnhandledException {
    public CommandNoParserForTypeException(Class<?> clazz) {
        super(String.format("Could not find a handler for type %s", clazz.getSimpleName()));
    }
}

