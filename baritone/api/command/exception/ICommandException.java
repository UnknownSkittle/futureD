/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 */
package baritone.api.command.exception;

import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.utils.Helper;
import java.util.List;

public interface ICommandException {
    public String getMessage();

    default public void handle(ICommand iCommand, List<ICommandArgument> list) {
        Helper.HELPER.logDirect(this.getMessage(), a.m);
    }
}

