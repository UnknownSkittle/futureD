/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argument.ICommandArgument;

public interface IArgParser$Stateless<T>
extends IArgParser<T> {
    public T parseArg(ICommandArgument var1);
}

