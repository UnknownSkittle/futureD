/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.exception;

import baritone.api.command.exception.CommandException;

public abstract class CommandErrorMessageException
extends CommandException {
    protected CommandErrorMessageException(String string) {
        super(string);
    }

    protected CommandErrorMessageException(String string, Throwable throwable) {
        super(string, throwable);
    }
}

