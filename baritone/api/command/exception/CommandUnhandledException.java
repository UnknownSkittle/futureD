/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 */
package baritone.api.command.exception;

import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.ICommandException;
import baritone.api.utils.Helper;
import java.util.List;

public class CommandUnhandledException
extends RuntimeException
implements ICommandException {
    public CommandUnhandledException(String string) {
        super(string);
    }

    public CommandUnhandledException(Throwable throwable) {
        super(throwable);
    }

    @Override
    public void handle(ICommand iCommand, List<ICommandArgument> list) {
        Helper.HELPER.logDirect("An unhandled exception occurred. The error is in your game's log, please report this at https://github.com/cabaletta/baritone/issues", a.m);
        this.printStackTrace();
    }
}

