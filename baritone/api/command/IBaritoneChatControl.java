/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command;

import java.util.UUID;

public interface IBaritoneChatControl {
    public static final String FORCE_COMMAND_PREFIX = String.format("<<%s>>", UUID.randomUUID().toString());
}

